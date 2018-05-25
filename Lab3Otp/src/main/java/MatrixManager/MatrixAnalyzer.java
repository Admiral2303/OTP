package MatrixManager;

import AntlrGen.MatrixBaseVisitor;
import AntlrGen.MatrixLexer;
import AntlrGen.MatrixParser;
import MatrixManager.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;

public class MatrixAnalyzer extends MatrixBaseVisitor<MatrixAnalyzer.Variable> {
    private HashMap<String, Variable> variables = new HashMap<>();
    public class Variable<T> {
        private T value;

        Variable(T value) {
            this.value = value;
        }

        public T getValue() {
            return this.value;
        }

        public Class getType() {
            return this.value.getClass();
        }

        public T setValue(T value) {
            T oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }




    @Override
    public Variable visitRootRule(AntlrGen.MatrixParser.RootRuleContext ctx) {
        return visit(ctx.input());
    }

    @Override
    public Variable visitToSetVariable(AntlrGen.MatrixParser.ToSetVariableContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public Variable visitExecuteExpression(AntlrGen.MatrixParser.ExecuteExpressionContext ctx) {
        return visit(ctx.sum());
    }

    @Override
    public Variable visitMakeAssignment(AntlrGen.MatrixParser.MakeAssignmentContext ctx) {
        String variableName = ctx.VAR().getText();
        variables.put(variableName, visit(ctx.input()));
        return variables.get(variableName);
    }


//    @Override
//    public Variable visitToMultiple(AntlrGen.MatrixParser.ToMultipleContext ctx) {
//        return visit(ctx.multiple());
//    }
    @Override public Variable visitToDelete(MatrixParser.ToDeleteContext ctx) {
        return visit(ctx.delete());
    }
    @Override public Variable visitMakeDelete(MatrixParser.MakeDeleteContext ctx) {
        Variable variable0 = visit(ctx.delete());
        Variable variable1 = visit(ctx.multiple());

        Matrix matrix0 = (Matrix) variable0.getValue();
        int k = (int) variable1.getValue();
        return new Variable<>(matrix0.division_by_num(k));
    }
    @Override
    public Variable visitMakePlus(AntlrGen.MatrixParser.MakePlusContext ctx) {
        Variable variable0 = visit(ctx.delete());
        Variable variable1 = visit(ctx.sum());
        if (variable0.getType() != Matrix.class || variable1.getType() != Matrix.class) {
            throw new ParseCancellationException("Invalid type.");
        }
        Matrix matrix0 = (Matrix) variable0.getValue();
        Matrix matrix1 = (Matrix) variable1.getValue();
        return new Variable<>(matrix0.sum(matrix1));
    }

    @Override
    public Variable visitMakeMultiple(AntlrGen.MatrixParser.MakeMultipleContext ctx) {
        Variable variable0 = visit(ctx.multiple());
        Variable variable1 = visit(ctx.transpose());
        Matrix matrix;
        Matrix matrix1;
        Integer multiplier;
        if (variable0.getType() == Matrix.class && variable1.getType() == Integer.class) {
            matrix = (Matrix) variable0.getValue();
            multiplier = (Integer) variable1.getValue();
            return new Variable<>(matrix.multiply_by_num(multiplier));
        } else if (variable1.getType() == Matrix.class && variable0.getType() == Integer.class) {
            matrix = (Matrix) variable1.getValue();
            multiplier = (Integer) variable0.getValue();
            return new Variable<>(matrix.multiply_by_num(multiplier));
        } else if(variable0.getType() == Matrix.class && variable1.getType() == Matrix.class){
            matrix = (Matrix) variable0.getValue();
            matrix1 = (Matrix) variable1.getValue();
            return new Variable<>(matrix.multiply(matrix1));
        } else {
            throw new ParseCancellationException("One operand should be matrix, another should be a number");
        }
    }

    @Override
    public Variable visitToTranspose(AntlrGen.MatrixParser.ToTransposeContext ctx) {
        return visit(ctx.transpose());
    }

    @Override
    public Variable visitMakeTranspose(AntlrGen.MatrixParser.MakeTransposeContext ctx) {
        Variable variable = visit(ctx.transpose());
        if (variable.getType() != Matrix.class) {
            throw new ParseCancellationException("Operand should be matrix");
        }
        Matrix matrix = (Matrix) variable.getValue();
        return new Variable<>(matrix.transpose());
    }

    @Override
    public Variable visitToAtom(AntlrGen.MatrixParser.ToAtomContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public Variable visitMakeNumber(AntlrGen.MatrixParser.MakeNumberContext ctx) {
        return new Variable<>(Integer.parseInt(ctx.NUMBER().toString()));
    }

    @Override
    public Variable visitMakeMatrix(AntlrGen.MatrixParser.MakeMatrixContext ctx) {
        return new Variable<>(Matrix.parsefromString(ctx.MATRIX().toString()));
    }

    @Override
    public Variable visitVariable(AntlrGen.MatrixParser.VariableContext ctx) {
        String variableName = ctx.VAR().getText();
        Variable variable = variables.get(variableName);
        if(variable == null){
            throw new ParseCancellationException("Variable is not defined");
        }
        return variable;
    }

    @Override
    public Variable visitMakeBraces(MatrixParser.MakeBracesContext ctx) {
            return visit(ctx.sum());
    }


    public String calc(String expression) {
        try {
            CharStream input = CharStreams.fromString(expression);
            MatrixLexer lexer = new MatrixLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MatrixParser parser = new MatrixParser(tokens);
            ParseTree tree = parser.input();
            return  this.visit(tree).getValue().toString();
        }catch (Exception e){
            return  e.getMessage();
        }

    }
}
