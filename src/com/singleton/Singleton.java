package com.singleton;
/***
 * 
 * @author rockyzj
 * 1.创建SingletonHolder的构造方法，在里面声明一个private的Singleton变量，并且在get方法时才实例化instance；
 * 
 * 2. 在get方法中返回SingletonHolder.instance
 *
 */
public class Singleton {
     private static class SingletonHolder {
     private static final Singleton INSTANCE = new Singleton();
     }
     private Singleton (){}
     public static final Singleton getInstance() {
         return SingletonHolder.INSTANCE;
    }
    
 }  
