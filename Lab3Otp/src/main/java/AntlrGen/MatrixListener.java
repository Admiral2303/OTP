package AntlrGen;// Generated from C:/Users/Vadim/IdeaProjects/Lab3Otp/src/main/java\Matrix.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatrixParser}.
 */
public interface MatrixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code RootRule}
	 * labeled alternative in {@link MatrixParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRootRule(MatrixParser.RootRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RootRule}
	 * labeled alternative in {@link MatrixParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRootRule(MatrixParser.RootRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 */
	void enterToSetVariable(MatrixParser.ToSetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 */
	void exitToSetVariable(MatrixParser.ToSetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 */
	void enterExecuteExpression(MatrixParser.ExecuteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 */
	void exitExecuteExpression(MatrixParser.ExecuteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeAssignment}
	 * labeled alternative in {@link MatrixParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterMakeAssignment(MatrixParser.MakeAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeAssignment}
	 * labeled alternative in {@link MatrixParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitMakeAssignment(MatrixParser.MakeAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToDelete}
	 * labeled alternative in {@link MatrixParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterToDelete(MatrixParser.ToDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToDelete}
	 * labeled alternative in {@link MatrixParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitToDelete(MatrixParser.ToDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakePlus}
	 * labeled alternative in {@link MatrixParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterMakePlus(MatrixParser.MakePlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakePlus}
	 * labeled alternative in {@link MatrixParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitMakePlus(MatrixParser.MakePlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeMultiply}
	 * labeled alternative in {@link MatrixParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterMakeMultiply(MatrixParser.MakeMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeMultiply}
	 * labeled alternative in {@link MatrixParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitMakeMultiply(MatrixParser.MakeMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeDelete}
	 * labeled alternative in {@link MatrixParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterMakeDelete(MatrixParser.MakeDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeDelete}
	 * labeled alternative in {@link MatrixParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitMakeDelete(MatrixParser.MakeDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeMultiple}
	 * labeled alternative in {@link MatrixParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMakeMultiple(MatrixParser.MakeMultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeMultiple}
	 * labeled alternative in {@link MatrixParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMakeMultiple(MatrixParser.MakeMultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToTranspose}
	 * labeled alternative in {@link MatrixParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterToTranspose(MatrixParser.ToTransposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToTranspose}
	 * labeled alternative in {@link MatrixParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitToTranspose(MatrixParser.ToTransposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeTranspose}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 */
	void enterMakeTranspose(MatrixParser.MakeTransposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeTranspose}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 */
	void exitMakeTranspose(MatrixParser.MakeTransposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 */
	void enterToAtom(MatrixParser.ToAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 */
	void exitToAtom(MatrixParser.ToAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeNumber}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterMakeNumber(MatrixParser.MakeNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeNumber}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitMakeNumber(MatrixParser.MakeNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeMatrix}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterMakeMatrix(MatrixParser.MakeMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeMatrix}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitMakeMatrix(MatrixParser.MakeMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MatrixParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MatrixParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeBraces}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterMakeBraces(MatrixParser.MakeBracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeBraces}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitMakeBraces(MatrixParser.MakeBracesContext ctx);
}