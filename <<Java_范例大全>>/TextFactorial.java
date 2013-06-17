
import java.math.BigInteger;		//导入类
import java.util.ArrayList;
import java.util.List;

public class TextFactorial{		//操作计算阶乘的类

	public static int simpleCircle(int num){	//简单的循环计算的阶乘

		int sum = 1;

		if(num < 0){	//判断传入数是否为负数
			throw new IllegalArgumentException("必须为正整数!");	//抛出不合理参数异常
		}

		for(int i=1; i <= num; i++){	//循环 num
			sum *= i;	//每循环一次进行乘法运算
		}

		return sum;		//返回阶乘的值
	}

	public static int recursion(int num){	//利用递归计算阶乘

		int sum = 1;

		if(num < 0)
			throw new IllegalArgumentException("必须为正整数!");	//抛出不合理参数异常

		if(num == 1){
			return 1;	//根据条件，跳出循环
		}
		else{
			sum = num * recursion(num-1);	//运用递归计算
			return sum;
		}

	}

	public static long addArray(int num){	//数组添加计算阶乘

		long[] arr = new long[21];	//创建数组
		arr[0] = 1;
		int last = 0;

		if(num >= arr.length)
			throw new IllegalArgumentException("传入的值太大");	//抛出传入的数太大异常

		if(num < 0)
			throw new IllegalArgumentException("必须为正整数！");	//抛出不合理参数异常

		//建立满足小于传入数的 while 循环
		while(last < num){
			arr[last+1] = arr[last] * (last+1);	//进行运算
			last++;
		}

		return arr[num];

	}

	public static synchronized BigInteger bigNumber(int num){	//利用 BigInteger 类计算阶乘

		ArrayList list = new ArrayList();	//创建集合数组
		list.add(BigInteger.valueOf(1));	//往数组里添加一个数值

		for(int i=list.size(); i<= num; i++){
			BigInteger lastfact = (BigInteger) list.get(i-1);	//获得第一个元素
			BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(i));

			//获得下一个数组
			list.add(nextfact);
		}

		return (BigInteger)list.get(num);	//返回数组中下标为 num 的值

	}

	public static void main(String[] args){

		int num = 5;
		int num1 = 23;

		System.out.println("简单的循环计算 " + num + " 的阶乘为 "
			+ simpleCircle(num));
		System.out.println("利用递归计算 " + num + " 的阶乘为 "
			+ recursion(num));
		System.out.println("数组添加计算 " + num + " 的阶乘为 "
			+ addArray(num));
		System.out.println("利用 BigInteger 类计算 " + num1 + " 的阶乘为 "
			+ bigNumber(num1));

	}



}



/* 程序运行结果 */
/*
简单的循环计算 5 的阶乘为 120
利用递归计算 5 的阶乘为 120
数组添加计算 5 的阶乘为 120
利用 BigInteger 类计算 23 的阶乘为 25852016738884976640000
*/















































