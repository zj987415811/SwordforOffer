package com.power;

public class Power {
	public static double power1(double base,int exponment) {
		double rusult=1.0;
		if(base==0.0){
			System.out.println("base invaild!");
		}
		if(exponment<0) {
			exponment=-exponment;
			for(int i=0;i<exponment;i++) {
				rusult*=base;
			}
			return 1.0/rusult;
		}else{
			for(int i=0;i<exponment;i++) {
				rusult*=base;
			}
			return rusult;
		}
	}
	public static Integer power2(int base,int exponment) {
		if(exponment==0) {
			return 1;
		}
		if(exponment==1) {
			return base;
		}
		Integer result=power2(base, exponment>>1);
		result*=result;
		if((exponment&0x01)==1) {
			result*=base;
		}
		return result;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power.power1(0.000000000000000000000000000000000000000000090000, 2));
		for(int i=1;i<Power.power2(10,100);i++) {
			System.out.println(i);
		}
	}

}
