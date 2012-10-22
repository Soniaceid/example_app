package com.mapping;


import java.io.IOException;
import java.util.List;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddressActivity extends MapActivity {

	Geocoder geocoder = null;
	MapView mapView = null;
	@Override	
protected boolean isLocationDisplayed() {
return false;
}
	@Override
protected boolean isRouteDisplayed() {
	return false;
}
    
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.address);
	mapView = (MapView)findViewById(R.id.geoMap);
	mapView.setBuiltInZoomControls(true);
	// lat/long of Jacksonville, FL
	int lat = (int)(37.983*1000000);
	int lng = (int)(23.733*1000000);
	GeoPoint pt = new GeoPoint(lat,lng);
	mapView.getController().setZoom(10);
	mapView.getController().setCenter(pt);
	geocoder = new Geocoder(this);
	}
	public void doClick(View arg0) {
	try {
	EditText loc = (EditText)findViewById(R.id.location);
	String locationName = loc.getText().toString();
	List<Address> addressList =
	geocoder.getFromLocationName(locationName, 5);
	if(addressList!=null && addressList.size()>0)
	{
	int lat =
	(int)(addressList.get(0).getLatitude()*1000000);
	int lng =
	(int)(addressList.get(0).getLongitude()*1000000);
	GeoPoint pt = new GeoPoint(lat,lng);
	mapView.getController().setZoom(15);
	mapView.getController().setCenter(pt);
	}
	} catch (IOException e) {
	e.printStackTrace();
	}
	}

}//close class