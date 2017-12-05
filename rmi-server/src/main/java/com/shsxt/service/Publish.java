package com.shsxt.service;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class Publish {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        LocateRegistry.createRegistry(8989);
        Naming.bind("rmi://127.0.0.1:8989/userService",new UserServiceImpl());
        System.out.println("服务发布成功");
    }
}
