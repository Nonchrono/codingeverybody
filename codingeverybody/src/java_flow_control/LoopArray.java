package java_flow_control;

public class LoopArray {

	public static void main(String[] args) {

		/*
		 * <li>egoing</li>
		 * <li>jinhuck</li>
		 * <li>youbin</li>
		 */
		
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "youbin";
		
		for(int i=0; i<3; i++) {
			   if (i<users.length-1) {
				   System.out.println(users[i]+",");
				   } else {
				   System.out.println(users[i]);
			   }   
		}
	}
}