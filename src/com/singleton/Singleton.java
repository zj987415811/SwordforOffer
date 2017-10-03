package com.singleton;
/***
 * 
 * @author rockyzj
 * 1.����SingletonHolder�Ĺ��췽��������������һ��private��Singleton������������get����ʱ��ʵ����instance��
 * 
 * 2. ��get�����з���SingletonHolder.instance
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
