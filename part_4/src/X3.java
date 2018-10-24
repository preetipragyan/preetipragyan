class X3
{
			public static void main(String[] args)
	{
			   System.out.println("main begin");
			   test();
		       System.out.println("main end");
		       System.out.println(test());
	}
	static static int test()
	{
		System.out.println("from test");
		return 100;
	}
}

