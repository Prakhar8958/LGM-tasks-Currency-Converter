package CurrencyConverter;
import java.util.*;
import java.text.DecimalFormat;
public class currencyConverter 
{
public static void main(String args[])
{
	double rupee,dollar,pound,code,euro,kwd;
	//String pattern;
	DecimalFormat f=new DecimalFormat("##.###");
	Scanner sc=new Scanner(System.in);
	System.out.println("**Welcome to Currency Converter Project **");
	System.out.println("1.Rupee----");
	System.out.println("2.Dollar----");
	System.out.println("3.Pound----");
	System.out.println("4.Euro----");
	System.out.println("5.Kwd---");
	
	System.out.println("Enter the currency Code: ");
	code=sc.nextInt();
	
	if(code==1)
	{
		System.out.println("Enter the amount in rupees");
		rupee=sc.nextDouble();
		dollar=rupee/77.34;
		System.out.println("Dollar: "+f.format(dollar));
		pound=rupee/94.46;
		System.out.println("Pound: "+f.format(pound));
		euro=rupee/80.36;
		System.out.println("Euro: "+f.format(euro));
		kwd=rupee/251.92;
		System.out.println("Kwd: "+f.format(kwd));
		
	}
	else if(code==2)
	{
		System.out.println("Enter the amount in dollar");
		dollar=sc.nextDouble();
		rupee=dollar*77.34;
		System.out.println("Rupee: "+f.format(rupee));
		pound=dollar*0.82;
		System.out.println("Pound: "+f.format(pound));
		euro=dollar*0.96;
		System.out.println("Euro: "+f.format(euro));
		kwd=dollar*0.31;
		System.out.println("Kwd: "+f.format(kwd));
		
	}
	
	else if(code==3)
	{
		System.out.println("Enter the amount in pound");
		pound=sc.nextDouble();
		rupee=pound*94.43;
		System.out.println("Rupee: "+f.format(rupee));
		dollar=pound*1.22;
		System.out.println("Dollar: "+f.format(dollar));
		euro=pound*1.17;
		System.out.println("Euro: "+f.format(euro));
		kwd=pound*0.3748;
		System.out.println("Kwd: "+f.format(kwd));
		
	}
	else if(code==4) {
		System.out.println("Enter the amount in euro");
		euro=sc.nextDouble();
		rupee=euro*80.43;
		System.out.println("Rupee: "+f.format(rupee));
		dollar=euro*1.04;
		System.out.println("Dollar: "+f.format(dollar));
		pound=euro*0.85;
		System.out.println("Euro: "+f.format(pound));
		kwd=euro*0.318949;
		System.out.println("Kwd: "+f.format(kwd));
		
	}
	else if(code==5)
	{
		System.out.println("Enter the amount in Kwd: ");
		kwd=sc.nextDouble();
		rupee=kwd*251.96;
		System.out.println("Rupee: "+f.format(rupee));
		dollar=kwd*3.26;
		System.out.println("Dollar: "+f.format(dollar));
		pound=kwd*2.67;
		System.out.println("pound: "+f.format(pound));
		euro=kwd*3.13;
		System.out.println("euro: "+f.format(kwd));
		
		
	}
	
	
	else {
		System.out.println("Invalid Code!");
	}
	
}
}
