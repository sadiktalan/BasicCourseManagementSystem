package controller;

import models.Store;


public interface ItemController {

    Store store = Store.getInstance();

    <T> boolean add(T obj);

    <T> boolean update(T obj);

    <T> boolean delete(T obj);

}
