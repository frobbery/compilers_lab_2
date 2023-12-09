// Generated from C:/Users/Юлия/compilers2/lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link langParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface langVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link langParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(langParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(langParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#min}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(langParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#max}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(langParser.MaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(langParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#divide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(langParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(langParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(langParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(langParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(langParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(langParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(langParser.PrintContext ctx);
}