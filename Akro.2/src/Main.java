public class Main {

	public static void main(String[] args) {
		boolean quit = false;
		new Story();
		while(!quit){
			Story.progress();
			if(Story.endGame()){
				if(!Story.Continue()){
					quit=true;
				}
			}
		}
		System.out.println("~~*~ Fin ~*~~");
	}
}