class ThreadDemo
{
	public void show()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo implements Runnable
{
	ThreadDemo t;//new ThreadDemo()got obj
	public Demo(ThreadDemo t)
	{
		this.t=t;
		new Thread(this).start();;
	
	}
	public void run()
	{
		show();
	}
	public void show()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
		}
	}
}
public class TestPriorityDemo {
	public static void main(String[] args) {
		ThreadDemo t=new ThreadDemo();
		Demo t1=new Demo(t);
		Demo t2=new Demo(t);
	}
}
