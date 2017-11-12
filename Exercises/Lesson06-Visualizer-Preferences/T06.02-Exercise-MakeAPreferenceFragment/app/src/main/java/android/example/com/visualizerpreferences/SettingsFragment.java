package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by astronaut on 11/11/17.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // TODO (5) In SettingsFragment's onCreatePreferences method add the preference file using the
        // addPreferencesFromResource method
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
