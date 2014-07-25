/*
 * Copyright (c)
 * Creator: ersin Date: $today.year.month.day.hour.minute
 * Project: UdacityDevelopingAndriodApps Module: app Path/File: /home/ersin/GithubProjects/UdacityDevelopingAndriodApps/app/src/main/java/com/nullcognition/udacitydevelopingandriodapps/MyActivity2.java
 * Last Modified: 24/07/14 10:33 PM
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.nullcognition.udacitydevelopingandriodapps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;



public class MyActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

	        String[] days = {"Sun","Mon","Tues","Wed","Thurs","Fri", "Sat","Sun","Mon","Tues","Wed","Thurs","Fri", "Sat","Sun","Mon","Tues","Wed","Thurs","Fri", "Sat","Sun","Mon","Tues","Wed","Thurs","Fri", "Sat"};
	        java.util.List<String> daysList = new java.util.ArrayList<String>(java.util.Arrays.asList(days));

	        android.widget.ArrayAdapter<String> arrayAdapter = new android.widget.ArrayAdapter<String>(
			        getActivity(),
			        com.nullcognition.udacitydevelopingandriodapps.R.layout.list_item_forcast,
			        com.nullcognition.udacitydevelopingandriodapps.R.id.list_item_forecast_textview,
			        daysList);

            View rootView = inflater.inflate(R.layout.fragment_my_activity2, container, false);
	        android.widget.ListView listView = (android.widget.ListView)rootView.findViewById(
			        com.nullcognition.udacitydevelopingandriodapps.R.id.listview_forecast);
	        listView.setAdapter(arrayAdapter);

	        return rootView;
        }
    }
}