package oberlin.builder.contextanalysis;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import oberlin.builder.parser.Parser;
import oberlin.builder.parser.SourcePosition;
import oberlin.builder.parser.ast.AST;
import oberlin.builder.reporter.ErrorReporter;
import oberlin.builder.visitor.NullaryVisitor;
import oberlin.builder.visitor.Visitor;

public class NullaryContextAnalyzer extends ContextAnalyzer<NullaryContext> {

	NullaryContext visitor = new NullaryContext();
	
	public NullaryContextAnalyzer(ErrorReporter reporter) {
		super(reporter);
	}

	@Override
	public NullaryContext getVisitor() {
		return visitor;
	}

}
