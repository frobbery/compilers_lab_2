// Generated from C:/Users/Юлия/compilers2/lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langParser}.
 */
public interface langListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link langParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(langParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(langParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(langParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(langParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#min}.
	 * @param ctx the parse tree
	 */
	void enterMin(langParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#min}.
	 * @param ctx the parse tree
	 */
	void exitMin(langParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#max}.
	 * @param ctx the parse tree
	 */
	void enterMax(langParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#max}.
	 * @param ctx the parse tree
	 */
	void exitMax(langParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(langParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(langParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(langParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(langParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(langParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(langParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(langParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(langParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(langParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(langParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(langParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(langParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(langParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(langParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(langParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(langParser.PrintContext ctx);
}