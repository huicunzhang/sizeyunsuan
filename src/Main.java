
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String []args) throws IOException{
		Scanner input=new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("������Ҫ�������ٵ�����������ϰ�⣺");
		int n=input.nextInt();
		/*if(n<=0 )
			System.out.println("����������ֲ��Ϸ�������������!");*/
		//��ѧ�������ɵ�n����ϰ�⼰���Ӧ����ȷ��������ļ���result.txt����
		File writename = new File("result.txt"); 
		writename.createNewFile(); 
        BufferedWriter out = new BufferedWriter(new FileWriter(writename));
        out.write("***************************\r\n"); 
        out.write("201571030334\r\n"); 
        //int x=7;
		for(int i=0;i<n;i++)
		{
			int num1=(int)(Math.random()*100);
			int num2=(int)(Math.random()*100);
			int num3=(int)(Math.random()*100);
			int num4=(int)(Math.random()*100);
			int x=(int)(Math.random()+1);
			switch(x)
			{
			    case 0:
			    	while(true){
			    		num4= (int) (Math.random()*100+1 );//��֤ ��ĸ��Ϊ��
			    		if(num3%num4==0)
			    		{
			    			 System.out.println(num1+"+"+num2+"+"+num3+"/"+num4+"=");
			    			 out.write(num1+"+"+num2+"+"+num3+"/"+num4+"="+(num1+num2+num3/num4)+"\r\n");
			    			 break;
			    		}
			    		 
			    	} 
			     
			    case 1:
			    	if(num1>num2) {
			    	System.out.println("("+num1+"-"+num2+")"+"+"+num3+"*"+num4+"=");
			    	out.write("("+num1+"-"+num2+")"+"+"+num3+"*"+num4+" = "+((num1-num2)+num3*num4)+"\r\n");
			    	break;
			    	}
			    case 2:
			    	System.out.println(num1 + "*" + num2+"+" +num3+"+"+num4+" = ");
			    	out.write(num1 + "*" + num2+"+" +num3+"+"+num4+" = "+(num1*num2+num3+num4)+"\r\n");
			    	break;
			    case 3:
			    	while(true){
			            num2 = (int) (Math.random()*100 + 1);
			    		if(num1%num2==0)
			    		{
			    			if(num1/num2+num3>=num4)
			    			System.out.println(num1 + "/" + num2 +"+"+ num3+"-"+num4+" = " );
			    			out.write(num1 + "/" + num2 +"+"+ num3+"-"+num4+" = " +(num1/num2+num3-num4)+"\r\n");
			    			break;         
			    		}
			    	}
			    case 4:
			    	while(true) {
			            num2 = (int) (Math.random()*100 + 1);//��֤��ĸ��Ϊ��
			            num4 = (int) (Math.random()*100 + 1);
			    		if(num1%num2==0)
			    		{
			    			if(num3%num4==0)
			    			System.out.println(num1 + "/" + num2 +"+"+ num3+"/"+num4+" = " );
			    			out.write(num1 + "/" + num2 +"+"+ num3+"/"+num4+" = " +(num1/num2+num3/num4)+"\r\n");
			    			break;
			    		}
			    	}
			    case 5:
			    	if(num1*num2>num3*num4) {
			    	System.out.println(num1+"*"+num2+"-"+num3+"*"+num4+"=");
			    	out.write(num1+"*"+num2+"-"+num3+"*"+num4+"="+(num1*num2-num3*num4)+"\r\n");
			    	break;
			    	}
			    case 6:
			    	while(true){
			            num2 = (int) (Math.random()*100 + 1);
			    		if(num1%num2==0)
			    			 System.out.println(num1 + "/" + num2 +"+"+ num3+"*"+num4+" = " );
			    			 out.write(num1 + "/" + num2 +"+"+ num3+"*"+num4+" = " +(num1/num2+num3*num4)+"\r\n");
			    			 break;
			    	}
			    	}
	            out.flush(); // ������д���ļ�
			}
		}
	
}