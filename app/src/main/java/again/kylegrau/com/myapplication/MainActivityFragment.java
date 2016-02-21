package again.kylegrau.com.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container, false);
        String[] data = {
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7",
                "Blah",
                "Blah",
                "Blah",
                "Blah",
                "Blah",
        };
        //Initialize a list object with the contents of the data string array
        List<String> stuff = new ArrayList<String>(Arrays.asList(data));
        //Set an adapter on this activity, with the list_item_forecast layout, bind it to thi list_item_forecast_textview TextView, and with the List stuff
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this.getActivity(),R.layout.list_item_forecast, R.id.list_item_forecast_textview,stuff);
        //Get the view from the root view
        ListView nameView = (ListView) rootView.findViewById(R.id.list_item_forecast);
        //Bind the ArrayAdapter to the ListView view
        nameView.setAdapter(myAdapter);
        return rootView;
    }
}
