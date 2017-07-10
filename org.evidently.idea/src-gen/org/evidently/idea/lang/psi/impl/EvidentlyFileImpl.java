/*
 * generated by Xtext 2.12.0
 */
package org.evidently.idea.lang.psi.impl;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.eclipse.xtext.psi.impl.BaseXtextFile;
import org.evidently.idea.lang.EvidentlyFileType;
import org.evidently.idea.lang.EvidentlyLanguage;

public final class EvidentlyFileImpl extends BaseXtextFile {

	public EvidentlyFileImpl(FileViewProvider viewProvider) {
		super(viewProvider, EvidentlyLanguage.INSTANCE);
	}

	@Override
	public FileType getFileType() {
		return EvidentlyFileType.INSTANCE;
	}
}
