package practice;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
class Bicycle{
	boolean frontWheel;
	boolean rearWheel;
	boolean leftBreak;
	boolean rightBreak;
	int gear;
	
	void gearUp() {gear++;}
	void gearDown() {gear--;}
	void frontStop() {leftBreak=true;}
	void rearStop() {rightBreak=false;}
}
public class T08_0703 {

	public static void main(String[] args) {
		System.out.println("\n========1.score");
		int[] score = {100,90,80,70,60,50};
		System.out.println("size:" +score.length);
		
		for (int i=0;i<6;i++) {
		System.out.println(score[i]);
		}
		
		System.out.println("\n========2.for-each:score");
		for (int i : score) {
			System.out.println(i);
		}
		
		System.out.println("\n========3.for-each:scoreName");
		String scoreName[]= {"가가","나나","다다","라라","마마"};
		for (String s : scoreName) {
			System.out.println(s);
		}
		
		System.out.println("\n========4.2D array output");
		int[][] intArray = {{10,20,30,40},
				            {50,60,70,80},
				            {90,100,110,120}};
		for (int i = 0;i<intArray.length;i++) {
			for (int k=0;k<intArray[i].length;k++) {
	System.out.println("intArray["+i+"]["+k+"]="+ intArray[i][k]);
			}
		}
		System.out.println("\n========5-1.adjustable Input");
		int intArray2[][]=new int[4][];
        intArray2[0] = new int[3];
        intArray2[1] = new int[2];
        intArray2[2] = new int[3];
        intArray2[3] = new int[2];
        System.out.println("intArray2's length :" +intArray2.length );
        System.out.println("intArray2[0]'s length :" +intArray2[0].length );
        System.out.println("intArray2[1]'s length :" +intArray2[1].length );
        System.out.println("intArray2[2]'s length :" +intArray2[2].length );
        
		System.out.println("\n========5-2.adjustable Output");
		for (int i=0;i<intArray2.length;i++)
			for (int j=0;j<intArray2[i].length;j++)
				intArray2[i][j]=(i+1)*10+j;
		for (int i=0;i<intArray2.length;i++) {
			for (int j = 0;j<intArray2[i].length;j++)
				System.out.print(intArray2[i][j]+" ");
			System.out.println();
		}
		
		
		System.out.println("\n========6.argument output");
		System.out.println("parameter's counts : "+ args.length + "개");
		System.out.println("1.args.length");
		
		System.out.println("\n========8.Scanner");
		Scanner scan = new Scanner(System.in);
		System.out.println("输入姓名");
		System.out.println("姓名是"+scan.next());
		System.out.println("输入学号");
		System.out.println("学号是"+scan.nextInt());

		System.out.println("\n========7.InputStreamReader ");
		InputStreamReader rd =new InputStreamReader(System.in);
		int input;
		try {
			while(true) {
				input = rd.read();
				if(input == ' ') { 
					break;
				}
				
				System.out.println((char)input);
			}
			}
			catch(IOException e ) {
				System.out.println("发生错误");
			}
		System.out.println("结束");
		System.out.println("\n========9.try-chtch");		
		try {
			Exception e = new Exception("故意抛出的异常");
					throw e;
		}
		catch(Exception e ) {
			System.out.println("错误信息："+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("程序正常结束");
		
		
		System.out.println("\n========10.make class");
		Bicycle hn;
		hn = new Bicycle();
		System.out.println("现在的速度是"+hn.gear);
		hn.gear=3;
		hn.gearUp();
		System.out.println("现在的速度是"+hn.gear);
	}
}
