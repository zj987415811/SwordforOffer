package com.testStringStringBufferStringBuilder;

public class Main {
    private static int time = 50000;
    public static void main(String[] args) {
        testString();
        testStringBuffer();
        testStringBuilder();
        test1String();
        test2String();
    }
     
     
    public static void testString () {
        String s="";
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            s += "java";
        }
        long over = System.currentTimeMillis();
        System.out.println("����"+s.getClass().getName()+"����ʹ�õ�ʱ��Ϊ��"+(over-begin)+"����");
    }
     
    public static void testStringBuffer () {
        StringBuffer sb = new StringBuffer();
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            sb.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("����"+sb.getClass().getName()+"����ʹ�õ�ʱ��Ϊ��"+(over-begin)+"����");
    }
     
    public static void testStringBuilder () {
        StringBuilder sb = new StringBuilder();
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            sb.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("����"+sb.getClass().getName()+"����ʹ�õ�ʱ��Ϊ��"+(over-begin)+"����");
    }
     
    public static void test1String () {
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            String s = "I"+"love"+"java";
        }
        long over = System.currentTimeMillis();
        System.out.println("�ַ���ֱ����Ӳ�����"+(over-begin)+"����");
    }
     
    public static void test2String () {
        String s1 ="I";
        String s2 = "love";
        String s3 = "java";
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            String s = s1+s2+s3;
        }
        long over = System.currentTimeMillis();
        System.out.println("�ַ��������Ӳ�����"+(over-begin)+"����");
    }
    
     
}