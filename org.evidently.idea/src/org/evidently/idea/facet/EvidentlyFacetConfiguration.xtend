/*
 * generated by Xtext 2.12.0
 */
package org.evidently.idea.facet

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.components.StoragePathMacros
import com.intellij.openapi.components.StorageScheme
import org.eclipse.xtext.idea.facet.AbstractFacetConfiguration
import org.eclipse.xtext.idea.facet.GeneratorConfigurationState

@State(name = "org.evidently.EvidentlyGenerator", storages = #[
		@Storage(id = "default", file = StoragePathMacros.PROJECT_FILE),
		@Storage(id = "dir", file = StoragePathMacros.PROJECT_CONFIG_DIR
				+ "/EvidentlyGeneratorConfig.xml", scheme = StorageScheme.DIRECTORY_BASED)])
 class EvidentlyFacetConfiguration extends AbstractFacetConfiguration implements PersistentStateComponent<GeneratorConfigurationState>{

}
