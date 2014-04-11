import java.util.List;

public class test5
{
	public static void main(String args[]){
		
		Brand brand=null;
		List<String> lists=null;
		String str="美心门,  美心门,  美心门, ";
		String s1[]=str.split(",  ");
		String sb3=null;
		for(int x=0;x<s1.length;x++){
			String s2[]=s1[x].split(",");
			System.out.println(s2[0]);
		sb3=s2[0].toString();
		String ss=s2[0];
		System.out.println(ss);
	 if(ss!=null||!"".equals(ss)){
		brand.setName(ss);
		}
	 
	
		
	}
}
	}