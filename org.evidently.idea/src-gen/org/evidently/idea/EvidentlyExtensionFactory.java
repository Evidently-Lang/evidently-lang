/*
 * Automatically generated by Evidently. DO NOT MODIFY. */
package org.evidently.idea;

import com.intellij.openapi.extensions.ExtensionFactory;
import org.evidently.idea.lang.EvidentlyLanguage;

public class EvidentlyExtensionFactory implements ExtensionFactory {
	@Override
	public Object createInstance(String factoryArgument, String implementationClass) {
		Class<?> clazz;
		try {
			clazz = Class.forName(implementationClass);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("Couldn't load "+implementationClass, e);
		}
		return EvidentlyLanguage.INSTANCE.<Object> getInstance(clazz);
	}
}
