package com.proxy;

public class DeviceController {
    private Device name;
    private Destination destination;
    //简单代理的实现
    public void control(Destination destination){
        destination.todo();
    }
}
