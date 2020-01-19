package com.example.interactive_map;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        Objects.requireNonNull(mapFragment).getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override

    //public void zoomLocation(LatLng zoom, GoogleMap googleMap){
      //  mMap = googleMap;
      //  for(int i = 0; i < 18, i++){
      //      mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoom.latitude, zoom.longitude, i));
     //   }
    //}
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Current Location WCH233
        LatLng riverside = new LatLng(33.975246, -117.325919);
        mMap.addMarker(new MarkerOptions().position(riverside).title("Winston Chung Building"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(riverside));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(riverside, 18), 5000, null);
        //for(int i = 0; i < 18; i++){
            //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(riverside, i));
        //}

        // Restrooms in Bourns & Chung
        LatLng wchRestroom2F = new LatLng(33.975264, -117.325791);
        //Bitmap iconwchR2F = BitmapFactory.decodeResource(getResources(), R.drawable.ic_radar);
        mMap.addMarker(new MarkerOptions().position(wchRestroom2F).title("Winston Chung Restrooms 2F"));//.icon(BitmapDescriptorFactory.fromBitmap(iconwchR2F)));
       // mMap.moveCamera(CameraUpdateFactory.newLatLng(riverside2));
        //BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.icon);
        //Bitmap b=bitmapdraw.getBitmap();
        //Bitmap smallMarker = Bitmap.createScaledBitmap(b, 84, 84, false);


        LatLng bournsRestroomsA = new LatLng(33.975637, -117.326999);
        mMap.addMarker(new MarkerOptions().position(bournsRestroomsA).title("Bourns A-Wing Restrooms (1F,2F)"));

        LatLng bournsRestroomsB = new LatLng(33.975137, -117.326922);
        mMap.addMarker(new MarkerOptions().position(bournsRestroomsB).title("Bourns B-Wing Restrooms 1F"));

        LatLng wchRestroom1F = new LatLng(33.975613, -117.325847);
        mMap.addMarker(new MarkerOptions().position(wchRestroom1F).title("Winston Chung Restrooms 1F"));

        // Bike Racks:
        LatLng bournsBikeRacks = new LatLng(33.975455, -117.327505);
        mMap.addMarker(new MarkerOptions().position(bournsBikeRacks).title("Bike Racks"));

        LatLng wchBikeRacks1 = new LatLng(33.975041, -117.325778);
        mMap.addMarker(new MarkerOptions().position(wchBikeRacks1).title("Bike Racks"));

        LatLng wchBikeRacks2 = new LatLng(33.975599, -117.325629);
        mMap.addMarker(new MarkerOptions().position(wchBikeRacks2).title("Bike Racks"));

        LatLng physicsBikeRacks1 = new LatLng(33.974935, -117.325564);
        mMap.addMarker(new MarkerOptions().position(physicsBikeRacks1).title("Bike Racks"));

        LatLng physicsBikeRacks2 = new LatLng(33.974275, -117.325353);
        mMap.addMarker(new MarkerOptions().position(physicsBikeRacks2).title("Bike Racks"));

        LatLng unlhBikeRacks1 = new LatLng(33.975688, -117.328059);
        mMap.addMarker(new MarkerOptions().position(unlhBikeRacks1).title("Bike Racks"));

        LatLng unlhBikeRacks2 = new LatLng(33.975756, -117.328650);
        mMap.addMarker(new MarkerOptions().position(unlhBikeRacks2).title("Bike Racks"));

        //Trash Cans:
        LatLng bytesTrashCans = new LatLng(33.975523, -117.326313);
        mMap.addMarker(new MarkerOptions().position(bytesTrashCans).title("Trash Cans"));

        LatLng wchTrashCans1 = new LatLng(33.975080, -117.325683);
        mMap.addMarker(new MarkerOptions().position(wchTrashCans1).title("Trash Cans"));

        LatLng bournsTrashCansA1 = new LatLng(33.975563, -117.327599);
        mMap.addMarker(new MarkerOptions().position(bournsTrashCansA1).title("Trash Cans"));


    }
}
