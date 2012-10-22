package com.mapping;





import android.content.Intent;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MenuActivity extends WhereActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ListView menuList = (ListView) findViewById(R.id.ListView_Menu);
        String[] items = { getResources().getString(R.string.menu_pos),
        getResources().getString(R.string.menu_cam),
        getResources().getString(R.string.menu_address) };
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,
        		R.layout.menu_item, items);
   
        menuList.setAdapter(adapt);
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        	public void onItemClick(AdapterView<?> parent, View itemClicked,
        	int position, long id) {
        	TextView textView = (TextView) itemClicked;
        	String strText = textView.getText().toString();
        	if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_pos))) {
        	// Launch the Map Activity
        	//startActivity(new Intent(MenuActivity.this,MappActivity.class));
        		Intent nextScreen = new Intent(getApplicationContext(), MappActivity.class);

        	     


                startActivity(nextScreen);	
        	}
        	else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_cam))) {
                // Launch the Photo Activity
              //  startActivity(new Intent(MenuActivity.this, PhotoActivity.class));
        		Intent nextScreen = new Intent(getApplicationContext(), PhotoActivity.class);

       	     


                startActivity(nextScreen);		
        		
            } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_address))) {
                // Launch the Address search Activity
               // startActivity(new Intent(MenuActivity.this, AddressActivity.class));
            	
            	Intent nextScreen = new Intent(getApplicationContext(), AddressActivity.class);

       	     


                startActivity(nextScreen);	
            }
        	}//close  void
        	
        	});
    
}
        	}