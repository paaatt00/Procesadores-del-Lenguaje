import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class ListenerBasico extends gramParserBaseListener {

    private Stack<String> s = new Stack<String>();
    private String arbol = "";

    @Override 
    public void enterEveryRule(ParserRuleContext ctx) { 
        s.push(gramParser.ruleNames[ctx.getRuleIndex()]);
        for (int i = 0; i < s.size(); i++)
        {
            this.arbol = arbol + "/" + s.get(i);
        }
        arbol = arbol + "\n";
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        s.push(gramLexer.VOCABULARY.getSymbolicName(node.getSymbol().getType()) + ":" + node.getText());
        for (int i=0; i<s.size(); i++)
        {
            this.arbol = arbol + "/" + s.get(i);
        }
        arbol = arbol + "\n";
        s.pop();
    }

    @Override 
    public void exitEveryRule(ParserRuleContext ctx) {
        s.pop();
    }

    public String getArbol() {
        return this.arbol;
    }
}