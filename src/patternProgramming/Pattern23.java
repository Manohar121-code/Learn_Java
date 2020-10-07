package patternProgramming;

//I LOVE INDIA
class Pattern23
{
public static void main(String[] args) 
{
	int n=7;
	int space=0;
	int q=n;
	int y=n;
	for (int i=1;i<=n;i++)
	{
		for (int w=1;w<=7;w++)  ////for I
		{
			if(i==1||i==7){
			System.out.print("*");
			}
			else if(w==4&&(i==2||i==3||i==4||i==5||i==6)){
			System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}


		for (int e=1;e>=1;e--)  //for space
		{
			System.out.print(" ");
		}




		for (int f=1;f<=space;f++)  ////for love shape
		{
			System.out.print(" ");
		}
		for (int o=q;o<=n;o--)
		{
			if(i==1&&o==1)
			{
				System.out.print(" ");
			}
			else if(i==1&&o==2)
			{	
				System.out.print(" ");
			}
			else if(i==2&&o==1)
			{
				System.out.print(" ");
			}
			else if (i==1&&o==n)
			{
				System.out.print(" ");
			}
			else if(o>0){
			System.out.print("*");
			}
		}
		for (int z=2;z<=y;z++)
		{
			if(i==1&&z==2)
			{
				System.out.print(" ");
			}
			else if(i==1&&z==n)
			{
				System.out.print(" ");
			}
			else
			{
			System.out.print("*");
			}
		}
		for (int qq=1;qq<=space;qq++)
		{
			System.out.print(" ");
		}




		for (int xx=1;xx>=1;xx--)  //for space
		{
			System.out.print(" ");
		}


		for (int w=1;w<=7;w++)  ////for I
		{
			if(i==1||i==7){
			System.out.print("*");
			}
			else if(w==4&&(i==2||i==3||i==4||i==5||i==6)){
			System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		


		for (int m=1;m<=7;m++)  ///////////for 'N'
		{
			if(m==1||m==7){
			System.out.print("*");
			}
			else if(i==2&&m==2){
			System.out.print("*");
			}
			else if(i==3&&m==3){
			System.out.print("*");
			}
			else if(i==4&&m==4){
			System.out.print("*");
			}
			else if(i==5&&m==5){
			System.out.print("*");
			}
			else if(i==6&&m==6){
			System.out.print("*");
			}
			else{
			System.out.print(" ");
			}
		}



		for (int sss=1;sss<=n;sss++)    ///////for 'D'
		{
			if(sss==1){
			System.out.print("*");
			}
			else if(i==1&&(sss==2||sss==3||sss==4||sss==5)){
			System.out.print("*");
			}
			else if(i==2&&sss==6){
			System.out.print("*");
			}
			else if(i==3&&sss==7){
			System.out.print("*");
			}
			else if(i==4&&sss==7){
			System.out.print("*");
			}
			else if(i==5&&sss==7){
			System.out.print("*");
			}
			else if(i==6&&sss==6){
			System.out.print("*");
			}
			else if(i==7&&(sss==2||sss==3||sss==4||sss==5)){
			System.out.print("*");
			}
			else{
			System.out.print(" ");
			}
		}



		for (int w=1;w<=7;w++)  ////for I
		{
			if(i==1||i==7){
			System.out.print("*");
			}
			else if(w==4&&(i==2||i==3||i==4||i==5||i==6)){
			System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}




		for (int k=1;k<=13;k++)   ////////////////////for 'A'
		{
			if(i==1&&k==7){    //for first line
			System.out.print("*");
			}
			else if(i==2&&(k==6||k==8)){    //for second line
			System.out.print("*");
			}
			else if((i==3&&(k==5||k==9)) || (i==4&&(k==4||k==10)) || (i==5&&(k==3||k==11)) || (i==6&&(k==2||k==12)) || (i==7&&(k==1||k==13)))
			{
			System.out.print("*");
			}
			else if(i==4&&(k==5||k==6||k==7||k==8||k==9))
			{
			System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
		space++;
		q--;
		y--;
	}
}
}
