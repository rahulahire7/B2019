class ThreadDemo1
{
	public void show(int n1,int n2)
	{
		int sum=n1+n2;
		System.out.println("Add is :"+sum);
	}
}
class Demo1 implements Runnable
{
	int n1,n2;
	ThreadDemo1 t;//new ThreadDemo()got obj
	public Demo1(int n1,int n2,ThreadDemo1 t)
	{
		this.n1=n1;
		this.n2=n2;
		this.t=t;
		new Thread(this).start();;
	
	}
	public void run()
	{
		t.show(n1,n2);
	}
}
public class TestAddThread {
	public static void main(String[] args) {
		ThreadDemo1 t=new ThreadDemo1();
		Demo1 t1=new Demo1(10,20,t);
		Demo1 t2=new Demo1(20,30 ,t);
	}
}
