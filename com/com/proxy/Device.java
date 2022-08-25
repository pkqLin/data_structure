package com.proxy;

public class Device {
    private String name;
    private Destination destination;
    private DeviceController deviceController;
    public void control(Destination destination){
        destination.todo();
    }
}
