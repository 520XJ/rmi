package com.shsxt.service;

import com.shsxt.po.User;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserServiceImpl extends UnicastRemoteObject implements IUserService{
    protected UserServiceImpl() throws RemoteException {
    }

    @Override
    public User queryUserById(Integer id) throws RemoteException {
        User user = new User();
        user.setId(id);
        user.setName("admin");
        user.setAge(18);
        System.out.println("参数"+id);
        return user;
    }
}
