/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.example.domainmodel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DomainmodelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.tokens");
	}
}
