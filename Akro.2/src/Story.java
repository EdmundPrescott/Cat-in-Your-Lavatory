public class Story {

	private static String gameState = "";
	private static boolean endGame = false;
	private static boolean won = false;
	
	public Story(){
		gameState = "a";
	}
	
	public static void progress(){
		switch(gameState){
			case"a":
				System.out.println("You have a dire need to poop, but there is a cat in your lavatory! Quickly remove the cat!");
				System.out.println("1) *Poop anyways*");
				System.out.println("2) *Grab the cat and move him out of the toilet*");
				System.out.println("3) \"Foul beast arm thyself or prepare to die! *draw battleaxe*\"");
				System.out.println();
				
				switch(Input.correctFor(3,"?")){
				case 1: endGame=true; System.out.println("You are mauled to death"); break;
				case 2: endGame=true; System.out.println("The cat grabs you and drags you into the toilet, you drown");break;
				case 3: gameState="b"; System.out.println("The cat hisses and draws a revolver"); break;
				}
				System.out.println();
				
				break;
			case"b":
				System.out.println("The cat takes aim with his six shooter!");
				System.out.println("1) *Deflect bullets with battleaxe*");
				System.out.println("2) \"FOOL! Cats have no thumbs!\"");
				System.out.println("3) *CHAAAAAAAARGE!!!*");
				
				switch(Input.correctFor(3,"?")){
				case 1: endGame=true; System.out.println("You deflect them directly into your dumb face"); break;
				case 2: gameState = "c"; System.out.println("The cat realizes that you are correct and fumbles the revolver to the ground!"); break;
				case 3: gameState = "d"; System.out.println("The cat panics and misses 2 shots!"); break;
				}
				System.out.println();
				
				break;	
			case"c":
				System.out.println("The revolver slides to your feet!");
				System.out.println("1) *CHARGE AT THE CAT WITH THE MIGHT OF A THOUSAND WARRIORS*");
				System.out.println("2) *Quickly grab revolver*");
				System.out.println("3) \"FACE MY WRATH FELINE FOE!\" *LAUNCH BATTLEAXE AT CAT*");
				
				switch(Input.correctFor(3,"?")){
				case 1: gameState = "f"; System.out.println("You slip on the revolver and it misfires!"); break;
				case 2: gameState = "e"; System.out.println("You reach for the revolver but it explodes, it was a trap!"); break;
				case 3: endGame=true; System.out.println("You decimate the cat and your toilet, now you will never be able to poop :'("); break;
				}
				System.out.println();
				
				break;
			case"d":
				System.out.println("You're mid charge but the cat has steadied its aim and it's aiming at you!");
				System.out.println("1) *Charge through the bullets?!!*");
				System.out.println("2) *Block the bullets with your battleaxe*");
				System.out.println("3) *Try and dodge the cat's next shots*");
				
				switch(Input.correctFor(3,"?")){
				case 1: endGame=true; System.out.println("Bullets > Your weak flesh body"); break;
				case 2: gameState = "g"; System.out.println("The bullets shatter your battleaxe!"); break;
				case 3: endGame=true; System.out.println("You attempt to dodge but the cat fans the hammer and drops you dead"); break;
				}
				System.out.println();
				
				break;
			case"e":
				System.out.println("Your arm is blasted off and you drop your battleaxe!");
				System.out.println("1) *Reconsider your frontal assault and come up with a different method of cat removal*");
				System.out.println("2) *Quickly run and grab your battleaxe*");
				System.out.println("3) *Arm yourself with your blasted off arm and continue the fight*");
				
				switch(Input.correctFor(3,"?")){
				case 1: gameState = "h"; System.out.println("Hmmmmmm"); break;
				case 2: endGame=true; System.out.println("You tear off your other arm trying to one hand your battleaxe and bleed to death"); break;
				case 3: gameState = "l"; System.out.println("\"Ha ha! Victory is in my hands!"); break; 
				}
				System.out.println();
				
				break;
			case"f":
				System.out.println("You regain your balance on the misfired revolver and begin to ride it!");
				System.out.println("1) *PISTOL POWERED CHAAAAAARGE!!!!!*");
				System.out.println("2) *Hang ten duuuuuuuuuude*");
				System.out.println("3) *Jump off and send the pistol flying into the cats face!*");
				
				switch(Input.correctFor(3,"?")){
				case 1: gameState = "win"; System.out.println("You charge with lightning speed at the cat and with a swing of the axe the cat is no more and you can poop in peace"); break;
				case 2: gameState = "k"; System.out.println("Gnarly duuuuuude, siiiiick movez!"); break;
				case 3: endGame=true; System.out.println("You jump off the pistol and it sails towards the cat but it misses and bounces off the wall and kills you"); break;
				}
				System.out.println();
				
				break;
			case"g":
				System.out.println("The cat stares down the barrel, his face shows no mercy");
				System.out.println("1) It's");
				System.out.println("2) Over");
				System.out.println("3) Kiddo");
				
				switch(Input.correctFor(3,"?")){
				case 1: endGame=true; System.out.println("You're shot and killed by the cat"); break;
				case 2: endGame=true; System.out.println("You're shot and killed by the cat"); break;
				case 3: endGame=true; System.out.println("You're shot and killed by the cat"); break;
				}
				System.out.println();
				
				break;
			case"h":
				System.out.println("*You ponder your situation*");
				System.out.println("1) Hmmmmmm");
				System.out.println("2) hmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
				System.out.println("3) HHHMMMMMMMMMMMM");
				
				switch(Input.correctFor(3,"?")){
				case 1: gameState = "i"; System.out.println("Hmmmmmm"); break; //endGame=true; gameState = "";
				case 2: gameState = "i"; System.out.println("hmmmmmmmmmmmmmmmmmmmmmmmmmmmm"); break; //endGame=true; gameState = "";
				case 3: gameState = "i"; System.out.println("HHHMMMMMMMMMMMM"); break; //endGame=true; gameState = "";
				}
				System.out.println();
				
				break;
			case"i":
				System.out.println("*You ponder what it truly means to poop*");
				System.out.println("1) hm");
				System.out.println("2) hmmmmHMMMMMMMM");
				System.out.println("3) hmmhmhmhmhmmmhmmmmmmmmm");
				
				switch(Input.correctFor(3,"?")){
				case 1: gameState = "j"; System.out.println("hm"); break;
				case 2: gameState = "j"; System.out.println("hmmmmHMMMMMMMM"); break;
				case 3: gameState = "j"; System.out.println("hmmhmhmhmhmmmhmmmmmmmmm"); break;
				}
				System.out.println();
				
				break;
			case"j":
				System.out.println("*???*");
				System.out.println("1) zzzZZZZZ");
				System.out.println("2) Hmmmm");
				System.out.println("3) HMMMMMMMMMMMMMMMMMMMMMMMMMM");
				
				switch(Input.correctFor(3,"?")){
				case 1: endGame=true; System.out.println("You fall asleep and poop yourself"); break;
				case 2: gameState="win"; System.out.println("You become enlightened and realize the toilet is not where the cat is, the toilet is everywhere the cat is not"); break;
				case 3: endGame=true; System.out.println("While you were pondering the cat lit you on fire with black magic, you burn to death"); break;
				}
				System.out.println();
				
				break;
			case"k":
				System.out.println("The cat is like hella impressed with your radical moves dude!");
				System.out.println("1) *Hang 20?!!*");
				System.out.println("2) *While the cat's distracted attack!*");
				System.out.println("3) *Just surf away dude, this cat is nothing but trouble*");
				
				switch(Input.correctFor(3,"?")){
				case 1: gameState="win"; System.out.println("You totally do and it's great and the cat was like \"Dang you're cool, I'm sorry for being a bother go poop yo\" and you're all like \"ty cat\""); break;
				case 2: endGame=true; System.out.println("You swing at the cat but he dodges and you crash into the ground and wipe out"); break;
				case 3: endGame=true; System.out.println("You surf away but you forgot to poop!"); break;
				}
				System.out.println();
				
				break;
			case"l":
				System.out.println("The cat displeased with your pun makes the narrative meta");
				System.out.println("1) This is option 1, this option continues the game");
				System.out.println("2) This is option 2, this option makes you lose the game");
				System.out.println("3) This is option 3, this option makes you lose the game BUT might also draw some BALL'IN pixel art");
				
				switch(Input.correctFor(3,"?")){
				case 1: gameState = "m"; System.out.println("The game continues and String gameState = \"m\""); break; 
				case 2: endGame=true; System.out.println("boolean endGame=\"true\" which ends the game"); break;
				case 3: endGame=true; System.out.println("Naw jk it just ends the game :^)"); break;
				}
				System.out.println();
				
				break;
			case"m":
				System.out.println("System.out.println(System.out.println(System.out.println(\"\")))");
				System.out.println("1) All these options do the same thing");
				System.out.println("2) It doesn't matter which option you pick unless I'm lying to you");
				System.out.println("3) Also if you're wondring what happened to the cat he's probably gone to join a less meta narrative");
				
				switch(Input.correctFor(3,"?")){
				case 1: gameState="n"; System.out.println("I'm So Meta Even This Acronym"); break; //endGame=true; gameState = "";
				case 2: gameState="n"; System.out.println("Meta is meta"); break; //endGame=true; gameState = "";
				case 3: gameState="n"; System.out.println("You had a 1/3 chance of choosing that option"); break; //endGame=true; gameState = "";
				}
				System.out.println();
				
				break;
			case"n":
				System.out.println("Two are lies, one is the true");
				System.out.println("1) Win the game");
				System.out.println("2) Lose the game");
				System.out.println("3) Lose the game");
				
				switch(Input.correctFor(3,"?")){
				case 1: endGame=true; System.out.println("HA wrong pick"); break; 
				case 2: endGame=true; System.out.println("Nope, you lose"); break; 
				case 3: gameState="win"; System.out.println("Hey look over there, a toilet for you to poop in"); break; 
				}
				System.out.println();
				
				break;
			case"":System.out.println("Error 554: Story Break"); break;
			case"win":System.out.println("\n\nYou poop\n\n\n"); won = true; endGame = true; break;
		}
	}
	
	public static boolean endGame(){
		return endGame;
	}
	
	public static boolean Won(){
		return won;
	}
	
	public static boolean Continue(){
		System.out.println("Would you like to play again?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		switch(Input.correctFor(2,"?")){
		case 1: System.out.println("*Reverts back time or whatever*");gameState = "a";endGame=false; won=false;return true;
		case 2: if(won){System.out.println("What a weird cat dude");}else{System.out.println("Cat always wins");};return false;
		}
		System.out.println("Error 555: Play Again selection dropped");
		return false;
	}
	
}
/*
case"":
	System.out.println("");
	System.out.println("1) ");
	System.out.println("2) ");
	System.out.println("3) ");
	
	switch(Input.correctFor(3,"?")){
	case 1: System.out.println(""); break; //endGame=true; gameState = "";
	case 2: System.out.println(""); break; //endGame=true; gameState = "";
	case 3: System.out.println(""); break; //endGame=true; gameState = "";
	}
	System.out.println();
	
	break;	 
*/
