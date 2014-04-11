
public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
	System.out.println(test2.class.getClassLoader().getResource(""));
		 System.out.println(ClassLoader.getSystemResource(""));
		System.out.println(test2.class.getResource(""));
		System.out.println(test2.class.getResource("/"));//Class文件所在路径　
		
		
	}

}
