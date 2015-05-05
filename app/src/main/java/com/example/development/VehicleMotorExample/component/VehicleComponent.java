package com.example.development.VehicleMotorExample.component;//package com.example.sekhar.devhelpdirect.Dagger.com.example.development.VehicleMotorExample.component;


import javax.inject.Singleton;

import com.example.development.VehicleMotorExample.Vehicle;
import com.example.development.VehicleMotorExample.module.VehicleModule;
import dagger.Component;

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

}