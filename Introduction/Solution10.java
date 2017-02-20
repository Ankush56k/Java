public static int B;
public static int H;
public static boolean flag = false;
static {
	Scanner scan = new Scanner(System.in);
	B = scan.nextInt();
	H = scan.nextInt();
	scan.close();
	if (B >0 && H > 0) {
		flag = true;
	}
    else
        {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}