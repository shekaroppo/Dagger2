package com.example.development.VehicleMotorExample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.development.R;
import com.example.development.VehicleMotorExample.component.DaggerVehicleComponent;
import com.example.development.VehicleMotorExample.component.VehicleComponent;
import com.example.development.VehicleMotorExample.model.Vehicle;
import com.example.development.VehicleMotorExample.module.VehicleModule;


public class VehicleActivity extends Activity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        vehicle = component.provideVehicle();
        for(int i=0;i<100;i++){
            vehicle.increaseSpeed(400);
            if(i%2==0)
                Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();

        }

    }
}