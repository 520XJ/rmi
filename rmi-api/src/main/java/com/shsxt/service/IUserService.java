package com.shsxt.service;

import com.shsxt.po.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IUserService extends Remote{
    /**
     *
     * @param id
     * @return
     */
    public User queryUserById(Integer id)throws RemoteException;

}
