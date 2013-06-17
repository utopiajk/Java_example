public class TextOperator{

	int a = 6, b = 5;
	byte c = 23, d = 24;
	boolean e = true, f = false;

	private void calculateOperator(){	//算术运算符应用

		int divideA = a/b;	//根据基本类型自动转换规则，除数与被除数都是整数，得到的结果
							//也是整数。a/b 结果是 1, 而不是 1.2

		float divideB = a/b;
		float divideC = a/(b*2.0f);
		double divideD = a/(b*2.0d);

		System.out.println("(divideA = a/b), divideA = " + divideA);
		System.out.println("(divideB = a/b), divideB = " + divideB);
		System.out.println("(divideC = a/(b*2.0f)), divideC = " + divideC);
		System.out.println("(divideD = a/(b*2.0f)), divideD = " + divideD);

	}

	private void compareOperator(){	//比较运算符应用

		System.out.println("(a==b) = " + (a==b));
		System.out.println("(a > b) = " + (a > b));
		System.out.println("(a < b) = " + (a < b));
		System.out.println("(a != b) = " + (a != b));
		System.out.println("(a >= b) = " + (a >= b));
		System.out.println("(a <= b) = " + (a <= b));
		System.out.println("(a = b) = " + (a = b)); 

	}

	private void evaluateOperator(){	//赋值运算符应用

		a += 1;							//等价于 a = a + 1;
		System.out.println("a += 1 的值为: " + a);

		a -= 1;
		System.out.println("a -= 1 的值为: " + a);

		a /= 2;
		System.out.println("a /= 2 的值为: " + a);

		a *= 2;
		System.out.println("a *= 2 的值为: " + a);

		a &= 2;
		System.out.println("a &= 2 的值为: " + a);

		a |= 2;
		System.out.println("a |= 2 的值为: " + a);

		a ^= 2;
		System.out.println("a ^= 2 的值为: " + a);

	}

	private void bitOperator(){	//位运算符应用

		int bitA = a & b;	//按位与，两个运算数都为 1 时，结果为 1，其余结果为 0
		int bitB = a | b;	//按位或，两个运算数都为 0 时，结果为 0，其余结果为 1
		int bitC = a ^ b;	//按位异或，两个运算数相同时结果为 0，不同时结果为 1
		int bitD = ~a;		//按位非，0 变成 1, 1 变成 0

		int a = 6;		//重新赋值

		int bitE = a >> 1;		//右移，左边空出位以 0 填充
		int bitF = a >>> 1;		//右移，左边空出位以 0 填充
		int bitG = a << 1;		//左移，右边空出位以 0 填充

		System.out.println("(bitA = a & b), bitA = " + bitA);
		System.out.println("(bitB = a | b), bitB = " + bitB);
		System.out.println("(bitC = a ^ b), bitC = " + bitC);
		System.out.println("(bitD = ~a), bitD = " + bitD);
		System.out.println("(bitE = a >> 1), bitE = " + bitD);
		System.out.println("(bitF = a >>> 1), bitF = " + bitF);
		System.out.println("(bitG = a << 1), bitG = " + bitG);

	}

	private void booleanOperator(){		//布尔运算符应用

		boolean booA = e && f;		//与，当所有操作数都为 true 时，结果返回 true
									//							否则为 false
		boolean booB = e || f;			//或，当一方操作数为 true 时，就返回 true
		boolean booC = e && (a == b);
		boolean booD = e || ((a == b) == f);

		System.out.println("(booA = e && f), booA = " + booA);
		System.out.println("(booB = e || f), booB = " + booB);
		System.out.println("(booC = e && (a == b)), booC = " + booC);
		System.out.println("(booD = e || ((a == b) == f), booD = " + booD);

		//注意:
		// && 是短路与，意思是: 当对操作数的表达式进行从左到右运算时，
		// 若遇到有操作数的值为 false, 则结束运算，将结果置为 false
		if(e && (a = b) == 10)
			System.out.println("a = " + a);
		if(f || (a = b) == 10)
			System.out.println("a = " + a);

		// || 运算符: 对操作数进行或运算，当所有操作数都为 false 时，结果为 false,
		// 否则结果为 true
		if(f || (b == a-1))
			System.out.println("a = " + a);
		if(e || ((b--) == ++b))
			System.out.println("b = " + b);

		// ! 运算符: 对操作数进行取反运算，操作数为 true, 取反为 false
		if(!f)
			System.out.println("布尔变量 f 为 false, 取反后值为 " + !f);
		else
			System.out.println("布尔变量 f 为 true, 取反后值为 " + !f);

		// | 运算符: 和 || 一样，对操作数进行或操作，但它不是短路的
		if(e | (a=b) == 10)
			System.out.println("a = " + a);
		if(f | (a=b) == 10)
			System.out.println("a = " + a);

		if(e & (a=b) == 10){
			System.out.println("a = " + a);
		}

		// & 运算符: 和 && 一样，对操作数做与操作，不同的是它不是短路的
		// 它会运算完所有的操作数表达式
		if(f & (a=b) == 10)
			System.out.println("a = " + a);

		// ^ 运算符: 对操作数做异或操作，相同为 false, 不同为 true
		if(e ^ (b == a-1))
			System.out.println("布尔变量 e 值与 (b == a-1) 的值不同！");
		else
			System.out.println("布尔变量 e 值与 (b == a-1) 的值相同！");

	}


	private void otherOperator(){		//其它运算符应用

		int oA = (a >= b) ? 1:0;		//可以用三元运算符带·替代简单的 if 语句

		System.out.println("(oA = (a >= b) ? 1:0), oA 的值为" + oA);

		if(b++ == a)	//b++ 表示先进行运算, 再将 b 的值加 1
			System.out.println("表达式 (b ++== a) 的值为 true !");
		else
			System.out.println("表达式 (b ++== a) 的值为 false !");

		if(++b == a)	//++b 表示先将 b 的值加 1, 再进行运算
			System.out.println("表达式 (++b == a) 的值为 true !");
		else
			System.out.println("表达式 (++b == a) 的值为 false !");

		a--;	//a-- 表示先进行运算, 再将 a 的值减 1
		--a;	//--a 表示先将 a 的值减 1, 再进行运算

		System.out.println("a 的值为: " + a);

	}



	public static void main(String[] args){

		TextOperator operator = new TextOperator();

		System.out.println("1. 算术运算符应用方法: ");
		operator.calculateOperator();

		System.out.println("2. 比较运算符应用方法: ");
		operator.compareOperator();

		System.out.println("3. 赋值运算符应用方法: ");
		operator.evaluateOperator();

		System.out.println("4. 位运算符应用方法: ");
		operator.bitOperator();

		System.out.println("5. 布尔运算符应用方法: ");
		operator.booleanOperator();

		System.out.println("6. 其它运算法应用方法: ");
		operator.otherOperator();

	}


}


/* 程序运行结果 */
/*
1. 算术运算符应用方法: 
(divideA = a/b), divideA = 1
(divideB = a/b), divideB = 1.0
(divideC = a/(b*2.0f)), divideC = 0.6
(divideD = a/(b*2.0f)), divideD = 0.6
2. 比较运算符应用方法: 
(a==b) = false
(a > b) = true
(a < b) = false
(a != b) = true
(a >= b) = true
(a <= b) = false
(a = b) = 5
3. 赋值运算符应用方法: 
a += 1 的值为: 6
a -= 1 的值为: 5
a /= 2 的值为: 2
a *= 2 的值为: 4
a &= 2 的值为: 0
a |= 2 的值为: 2
a ^= 2 的值为: 0
4. 位运算符应用方法: 
(bitA = a & b), bitA = 0
(bitB = a | b), bitB = 5
(bitC = a ^ b), bitC = 5
(bitD = ~a), bitD = -1
(bitE = a >> 1), bitE = -1
(bitF = a >>> 1), bitF = 3
(bitG = a << 1), bitG = 12
5. 布尔运算符应用方法: 
(booA = e && f), booA = false
(booB = e || f), booB = true
(booC = e && (a == b)), booC = false
(booD = e || ((a == b) == f), booD = true
b = 5
布尔变量 f 为 false, 取反后值为 true
a = 5
布尔变量 e 值与 (b == a-1) 的值不同！
6. 其它运算法应用方法: 
(oA = (a >= b) ? 1:0), oA 的值为1
表达式 (b ++== a) 的值为 true !
表达式 (++b == a) 的值为 false !
a 的值为: 3
*/





/* 源程序解读 */
/*
(1) 在 calculateOperator() 方法中，对于除法运算，当除数和被除数
	都是整型时，若除不尽结果取整数部分。当除数和被除数不全是整型时，
	结果要声明为浮点型，否则要进行强制转换。
(2) 在 compareOperator() 方法中，比较两个数是否相等用双等号，而不是
	等号。等号代表对变量进行赋值。
(3) evaluateOperator() 方法是讲解赋值运算符的运用。
(4) 在 bitOperator() 方法中，">>" 是将数字按二进制位右移，左边空出
	位以 0 填充。"<<" 是将数字按二进制位左移，右边空出位以 0 填充。
	">>" 与 ">>>" 对于正数操作没有什么区别，对于负数差别就大了。
(5) 在 booleanOperator() 方法中，当 "&&" 左边的表达式值为 false 时，
	右边的表达式就不用计算了，整个表达式的值为 false。当 "&&" 左边的
	表达式值为 true 时，就要计算右边的表达式，右边表达式的结果关系到
	整个表达式的结果。而 "&" 运算符不同，无论它左边连接的表达式的值是
	什么，都会计算右边的表达式的值，整个表达式最后得到的结果与 "&&" 得到
	的一样。"||" 与 "|" 的区别和 "&&" 与 "&" 的区别一样。
(6) 在 otherOperator() 方法中，a++ 与 ++a 的区别: a++ 是先进行运算，
	再将 a 的值加 1，++a 是先将 a 的值加 1，再进行运算。 
*/


/* 遗留问题 */
/*
左移和右移 不太懂。
*/


















