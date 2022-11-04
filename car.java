import java.util.*;
class car{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int v,w,p,k,x,m,c;
		System.out.println("Enter the total cars and motarcycles:");
		v=sc.nextInt();
		System.out.println("Enter the wheels:");
		w=sc.nextInt();
		if(v*4==w){
			System.out.println("all are cars");
		}
		else if(v*2==w){
			System.out.println("all are vehicles");
		}
		else{
			p=v*4;
			System.out.println("wheels of cars:"+p);
			k=v*2;
			System.out.println("wheels of vehicles:"+k);
			x=p-w;
			System.out.println("extra:"+x);
			m=x/2;
			System.out.println("number of vehicles :"+m);
			c=v-m;
			System.out.println("number of cars:"+c);
		}
	}
}


		