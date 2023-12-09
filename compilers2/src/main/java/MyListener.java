
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyListener extends langBaseListener {
    private final Map <String, Integer> variables;
    private final Scanner scanner = new Scanner(System.in);
    public  MyListener() {
        variables = new HashMap<>();
    }

    @Override
    public void exitAssign(langParser.AssignContext ctx)
    {
        String variableName = ctx.ID(0).getText();
        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText():
                ctx.NUM().getText();
        // let a be b
        if(ctx.ID().size()>1)
            variables.put(variableName, getVariableByName(value));
        else
            variables.put(variableName, Integer.parseInt(value));

    }

    @Override
    public void exitAdd(langParser.AddContext ctx) {
        String variableName = ctx.ID().size() > 1 ?
                ctx.ID(1).getText():
                ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                getVariableByName(ctx.ID(0).getText()):
                Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, getVariableByName(variableName) + value);
    }

    @Override
    public void exitSub(langParser.SubContext ctx) {
        String variableName = ctx.ID().size() > 1 ?
                ctx.ID(1).getText():
                ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                getVariableByName(ctx.ID(0).getText()):
                Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, getVariableByName(variableName) - value);
    }

    @Override
    public void exitPrint(langParser.PrintContext ctx) {
        String output = ctx.ID() == null ? ctx.NUM().getText():
                getVariableByName(ctx.ID().getText()).toString();
        System.out.println(output);
    }

    @Override
    public void exitMax(langParser.MaxContext ctx) {
        String variableName = ctx.ID().size() > 2 ?
                ctx.ID(2).getText():
                ctx.ID().size() > 1 ?
                ctx.ID(1).getText():
                        ctx.ID(0).getText();
        int firstValue, secondValue;
        if (ctx.ID().size() > 2) {
            firstValue = getVariableByName(ctx.ID(1).getText());
            secondValue = getVariableByName(ctx.ID(0).getText());
        }
        else if (ctx.ID().size() > 1) {
            firstValue = getVariableByName(ctx.ID(0).getText());
            secondValue = Integer.parseInt(ctx.NUM(0).getText());
        }
        else {
            firstValue = Integer.parseInt(ctx.NUM(1).getText());
            secondValue = Integer.parseInt(ctx.NUM(0).getText());
        }
        variables.put(variableName, Math.max(firstValue, secondValue));
    }

    @Override
    public void exitMin(langParser.MinContext ctx) {
        String variableName = ctx.ID(0).getText();
        int firstValue, secondValue;
        if (ctx.ID().size() > 2) {
            firstValue = getVariableByName(ctx.ID(2).getText());
            secondValue = getVariableByName(ctx.ID(1).getText());
        }
        else if (ctx.ID().size() > 1) {
            firstValue = getVariableByName(ctx.ID(1).getText());
            secondValue = Integer.parseInt(ctx.NUM(0).getText());
        }
        else {
            firstValue = Integer.parseInt(ctx.NUM(1).getText());
            secondValue = Integer.parseInt(ctx.NUM(0).getText());
        }
        variables.put(variableName, Math.min(firstValue, secondValue));
    }

    @Override
    public void exitInput(langParser.InputContext ctx) {
        String variableName = ctx.ID().getText();
        var value = scanner.next();
        try {
            var intValue = Integer.parseInt(value);
            variables.put(variableName, intValue);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Input not int");
        }
    }

    @Override
    public void exitPower(langParser.PowerContext ctx) {
        String variableName = ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                getVariableByName(ctx.ID(1).getText()):
                Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, (int) Math.pow(getVariableByName(variableName), value));
    }

    @Override
    public void exitDivide(langParser.DivideContext ctx) {
        String variableName = ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                getVariableByName(ctx.ID(1).getText()):
                Integer.parseInt(ctx.NUM().getText());
        if (value == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }
        variables.put(variableName, getVariableByName(variableName) / value);
    }

    @Override
    public void exitMultiply(langParser.MultiplyContext ctx) {
        String variableName = ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                getVariableByName(ctx.ID(1).getText()):
                Integer.parseInt(ctx.NUM().getText());
        variables.put(variableName, getVariableByName(variableName) * value);
    }

    private Integer getVariableByName(String name) {
        if (!variables.containsKey(name)) {
            throw new IllegalArgumentException("Variable " + name + "not found");
        }
        return variables.get(name);
    }

    public static void main(String[] args){
        try {
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName("C:\\Users\\Юлия\\compilers2\\src\\main\\resources\\test.lang");
            langLexer lexer = new langLexer(input);
            langParser parser = new langParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListener());
            parser.program();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }
}

