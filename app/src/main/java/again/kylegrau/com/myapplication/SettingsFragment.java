package again.kylegrau.com.myapplication;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/***
 * Created by kgrau on 2/23/2016.
 */
public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_general);
    }
}
