import java.util.Scanner;

public class Input {

	private static Scanner console=new Scanner(System.in);
	private static String userInput;
	
	
	public Input(){}
		
		public static int correctFor(int a,String errorCode){
        	while(1!=0){
        		userInput=console.nextLine();
        		if(!userInput.equals("")){
        			if(userInput.equalsIgnoreCase("a number")){
            			System.out.println("Smart Ass");
            		}
				try{
					if(Integer.parseInt(userInput)>=1&&Integer.parseInt(userInput)<=a&&userInput.length()==1){
						return Integer.parseInt(userInput);
					}else{
						System.out.println("That number isn't between "+1+" and "+a);
					}
				}catch(Exception e){
				if(errorCode.equals("?")){System.out.println("Please enter a number");}else{System.out.println(errorCode);}
				}
        		}
			}
		}
	
}