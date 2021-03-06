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
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MyActivity2 extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState){
	  super.onCreate(savedInstanceState);

	  setContentView(R.layout.activity_my_activity2);
	  if(savedInstanceState == null){
		 getFragmentManager().beginTransaction().add(R.id.container, new ForecastFragment()).commit();
	  }

   }

   private void preferedLocation(){
	  String postal = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getString("example_text", "n2n1w4");
	  android.net.Uri geoLocation = android.net.Uri.parse("geo:0,0?").buildUpon().appendQueryParameter("q", postal).build();

	  android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW);
	  intent.setData(geoLocation);

	  if(intent.resolveActivity(getPackageManager()) != null){ startActivity(intent); }
	  else{ android.util.Log.e(getClass().getSimpleName(), "Couldn't call the geoLocation intent"); }


   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu){
	  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.my_activity2, menu);
	  return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item){
	  // Handle action bar item clicks here. The action bar will
	  // automatically handle clicks on the Home/Up button, so long
	  // as you specify a parent activity in AndroidManifest.xml.
	  int id = item.getItemId();
	  if(id == R.id.action_settings){
		 startActivity(new android.content.Intent(this, SettingsActivity.class));
		 return true;
	  }
	  if(id == com.nullcognition.udacitydevelopingandriodapps.R.id.action_location){
		 preferedLocation();
	  }

	  return super.onOptionsItemSelected(item);
   }
}
