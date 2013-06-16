/*
	<<java入门到精通>> p.49
(1) 可以将任意类型的数据转换为 String 类型
(2) 从低精度类型 向 高精度类型转换 总是成功的
(3) 从高精度类型 向 低精度类型转换 必然有信息的流失，有可能失败
(4) 顺序为: byte < short < int < long < float < double
*/

public class BasicTypeChange{

	private void typeAutoUpgrade(){	//基本类型的自动提升

		byte b = 44;
		char c = 'b';
		short s = 1024;
		int i = 40000;
		long l = 124631;
		float f = 35.67f;
		double d = 3.1234d;

		//result 声明为其它类型会出错，除非进行类型转换
		double result = (f*b) + (l*f) + (i/c) - (d*s);
		System.out.print("结果: " + result + "=");
		System.out.println((f*b) + "+" + (l*f) + "+" +(i/c)
			+ "-" + (d*s));		//println() 方法是打印完内容后在最后添加换行符

	}

	private void autoChange(){	//基本类型的自动转换

		char c = 'a';
		byte b = 44;
		short s0 = b;
		int i0 = s0;
		int i1 = c;
		long l = i0;
		float f = l;
		double d = f;
		float fl= 1.7f;
		double dou = fl;
		System.out.println("fl = " + fl + "; dou = " + dou);
		//一个数从一种类型转换成另一种类型，再转换回来时，值还是一样的
		fl = (float)dou;
		System.out.println("fl = " + fl + "; dou = " + dou);

	}

	private void forceChange(){	//强制类型转换

		double d = 123.456d;
		float f = (float) d;	//强制转换
		long l = (long) d;		//强
		int i = (int) d;		//强
		short s = (short) d;	//强
		byte b = (byte) d;		//强
		System.out.print("d = " + d + "; f = " + f + "; l = " + l);
		System.out.println("; i = " + i + "; s = " + s + "; b = " + b);
		d = 567.89d;

		/*下面的转换首先进行截断操作，将 d 的值变为 567，因为
		  567 比 byte 的范围 256 还大，于是进行取模操作，567
		  对 256 取模后的值为 55

		  取模 就是 求余数

		  567 / 256 = 2 ... 55
		*/
		b = (byte) d;
		System.out.println("d = " + d + "; b = " + b);

	}

	public static void main(String[] args){

		BasicTypeChange change = new BasicTypeChange();
		change.typeAutoUpgrade();
		change.autoChange();
		change.forceChange();

	}

}



/* 程序运行结果 */
/*
结果: 4444366.6384=1569.48+4445587.5+408-3198.3616
fl = 1.7; dou = 1.7000000476837158
fl = 1.7; dou = 1.7000000476837158
d = 123.456; f = 123.456; l = 123; i = 123; s = 123; b = 123
d = 567.89; b = 55
*/




/* 源程序解读 */
/*
(1) typeAutoUpgrade() 方法演示了基本数据类型的数据在进行运算时，
	其类型会自动进行提升，并对自动提升规则进行了说明。
(2) autoChange() 方法演示了基本数据类型的自动转换，以及自动转换
	发生的条件。当某些 float 类型的数据自动转换成 double 类型时，
	会出现前后不相等的情况，这是由该数不能够用有限的二进制位精确表示
	造成的。
	比如，fl = 1.7f，而它转换成 double 类型后变成 1.7000000476837158
(3) forceChange() 方法演示了何时进行强制类型转换，以及如何进行
	强制类型转换。在强制类型转换过程中会损失一定的精度。
*/















