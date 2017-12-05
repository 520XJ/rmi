package com.shsxt;

import com.shsxt.po.User;
import com.shsxt.service.IUserService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Test {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        IUserService userService = (IUserService) Naming.lookup("rmi://127.0.0.1:8989/userService");
        User user = userService.queryUserById(10);
        System.out.println(user.toString());
    }
}
