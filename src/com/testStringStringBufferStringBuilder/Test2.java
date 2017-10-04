package com.testStringStringBufferStringBuilder;

 class Test2 {
    private static int time = 50000;
    public static void main(String[] args) {
        testString();
        testOptimalString();
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
     
    public static void testOptimalString () {
        String s="";
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            StringBuilder sb = new StringBuilder(s);
            sb.append("java");
            s=sb.toString();
        }
        long over = System.currentTimeMillis();
        System.out.println("ģ��JVM�Ż�������ʱ��Ϊ��"+(over-begin)+"����");
    }
     
}