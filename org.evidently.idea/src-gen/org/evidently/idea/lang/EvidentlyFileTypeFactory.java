/*
 * Automatically generated by Evidently. DO NOT MODIFY. */
package org.evidently.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class EvidentlyFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(EvidentlyFileType.INSTANCE, AbstractEvidentlyFileType.DEFAULT_EXTENSION);
	}

}
