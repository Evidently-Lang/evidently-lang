/*
 * generated by Xtext 2.12.0
 */
package org.evidently.idea.lang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EvidentlyAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/evidently/idea/parser/antlr/internal/PsiInternalEvidently.tokens");
	}
}
