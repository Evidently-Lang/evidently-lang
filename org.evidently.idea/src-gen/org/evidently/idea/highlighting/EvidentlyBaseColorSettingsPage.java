/*
 * Automatically generated by Evidently. DO NOT MODIFY. */
package org.evidently.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;
import org.evidently.idea.lang.EvidentlyLanguage;

public class EvidentlyBaseColorSettingsPage extends AbstractColorSettingsPage {
	
	public EvidentlyBaseColorSettingsPage() {
		EvidentlyLanguage.INSTANCE.injectMembers(this);
	}

	@Override
	public String getDisplayName() {
		return EvidentlyLanguage.INSTANCE.getDisplayName();
	}
}
