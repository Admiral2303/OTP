package AntlrGen;// Generated from C:/Users/Vadim/IdeaProjects/Lab3Otp/src/main/java\Matrix.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MatrixParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MatrixVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code RootRule}
	 * labeled alternative in {@link MatrixParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootRule(MatrixParser.RootRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSetVariable(MatrixParser.ToSetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link MatrixParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteExpression(MatrixParser.ExecuteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeAssignment}
	 * labeled alternative in {@link MatrixParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeAssignment(MatrixParser.MakeAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToDelete}
	 * labeled alternative in {@link MatrixParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToDelete(MatrixParser.ToDeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakePlus}
	 * labeled alternative in {@link MatrixParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakePlus(MatrixParser.MakePlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeMultiply}
	 * labeled alternative in {@link MatrixParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeMultiply(MatrixParser.MakeMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeDelete}
	 * labeled alternative in {@link MatrixParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeDelete(MatrixParser.MakeDeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeMultiple}
	 * labeled alternative in {@link MatrixParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeMultiple(MatrixParser.MakeMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToTranspose}
	 * labeled alternative in {@link MatrixParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToTranspose(MatrixParser.ToTransposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeTranspose}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeTranspose(MatrixParser.MakeTransposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link MatrixParser#transpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(MatrixParser.ToAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeNumber}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeNumber(MatrixParser.MakeNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeMatrix}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeMatrix(MatrixParser.MakeMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MatrixParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeBraces}
	 * labeled alternative in {@link MatrixParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeBraces(MatrixParser.MakeBracesContext ctx);
}