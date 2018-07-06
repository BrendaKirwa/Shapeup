package com.example.hpenvy15.shapeup;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));



    LatLng Newyork = new LatLng(40, -74);
        mMap.addMarker(new MarkerOptions().position(Newyork).title(" NewYork"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Newyork));



        LatLng Nairobi = new LatLng(-1, 36);
        mMap.addMarker(new MarkerOptions().position(Nairobi).title("Nairobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nairobi));


        LatLng Cairo = new LatLng(30, 31);
        mMap.addMarker(new MarkerOptions().position(Cairo).title("Cairo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cairo));



        LatLng Machakos = new LatLng(-1, 37);
        mMap.addMarker(new MarkerOptions().position(Machakos).title("Machakos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Machakos));


        LatLng Newjersey  = new LatLng(40, -74);
        mMap.addMarker(new MarkerOptions().position(Newjersey).title("New Jersey"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Newjersey));


        LatLng Eldoret  = new LatLng(0, 32);
        mMap.addMarker(new MarkerOptions().position(Eldoret).title("Eldoret"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Eldoret));


        LatLng Madrid  = new LatLng(39, -5);
        mMap.addMarker(new MarkerOptions().position(Madrid).title("Madrid"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Madrid));


        LatLng BuenosAires  = new LatLng(40, -74);
        mMap.addMarker(new MarkerOptions().position(BuenosAires).title("Buenos Aires"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BuenosAires));


        LatLng Pretoria  = new LatLng(-25, 28);
        mMap.addMarker(new MarkerOptions().position(Newjersey).title("Pretoria"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pretoria));


}}
