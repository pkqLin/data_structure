package com.proxy;

public class DeviceController {
    private Device name;
    private Destination destination;
    public void control(Destination destination){
        destination.todo();
    }
}
