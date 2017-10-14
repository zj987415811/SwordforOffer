package com.throwandexception;

public class TestException {
	public TestException() {
		// TODO Auto-generated constructor stub
	}
	boolean testEX() {
		boolean ret=true;
		return ret=testEX1();
	}
	boolean testEX1() {
		// TODO Auto-generated method stub
		boolean ret=true;
		try {
			ret=testEX2();
			if(!ret) {
				return false;
			}
			System.out.println("at end of try!");
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("testEX1,catch exception!");
			ret=false;
			
		}finally {
			
		}
		return ret;
		
	}
	@SuppressWarnings("finally")
	boolean testEX2() throws Exception{
		// TODO Auto-generated method stub
		boolean ret=true;
		try {
			int b=12;
			int c;
			for(int i=2;i>=-2;i--) {
				c=b/i;
				System.out.println("i="+i);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("分母不能为0；");
			ret=false;
			return ret;
		}finally {
			System.out.println("finally,return value="+ret);
			return ret;
		}
		
	}
}
