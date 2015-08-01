package jonik;

import java.util.*;

public class jonik {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		Scanner d = new Scanner(System.in);
		Scanner e = new Scanner(System.in);
							
		System.out.println("You arise to see a hooded figure standing above you at the foot of your bed");
		System.out.println("'There will be a dreadful attack on the town, an evil wind will come and wipe");
		System.out.println("out exhistence as we know it.' he says. ");
		System.out.println(" ");
		System.out.println("He hands you a dagger wrapped in an old cloth.");
		System.out.println(" ");
		System.out.println("'It's yours to keep, a gift for my intrusion.  I am Willeck, a young mage who");
		System.out.println("just so happened to witness you performing a good deed. My organization likes those sort of things..' ");
		//
		//I want to add a question here..... to ask who they work for.
		//my organization is to remain anonymous for now unless you choose to fight with me right now.
		//
		//fight for who? why? what are you after?
		//
		System.out.println(" ");
		System.out.println("I'm in search of a book that fortells how to beat this evil and save the land.");
		System.out.println("Will you join me on this quest?\n\nOptions: \n1:Yes I suppose\n2:Get the hell out of my house!");
		
		int a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("'Let us leave at once, the villiage is being invaded as we speak.  Gather a bedroll and supplies.");
			System.out.println("it's going to be a long journey....' ");
			System.out.println(" ");
			System.out.println("As you run out of the house you see an army of ");
			System.out.println("skeletal warriors marching their way through the once quiet town of your birth.  ");
			System.out.println("Holding back the rage from inside you, you follow Willeck into the darkness and ");
			System.out.println("disapeer to fight another day...");
			System.out.println(" ");
			System.out.println("You come across an Inn. Willeck decides to pay for the night and you get adjoining rooms.");
			System.out.println("During the night you cannot sleep. Haunted by the thought of your town being attacked ");
			System.out.println(" ");
			System.out.println("Just then you jolt up from out of a dream..... You were dreaming about Zombies, weren't you?");
			System.out.println(".... ");
			System.out.println("  .....");
			System.out.println("A Zombie moans out loud, You're not dreaming!!!!  The Inn has been compromised, Get outta there!");
			System.out.println("Willek awakens but before he can get to his blade a Zombie busts through the door and slices Willeck in half!!");
			System.out.println("Willeck begs for you to take the dagger. As you grab it you run out of the house and into the street.");
			System.out.println("You look around at the chaos unfolding before your eyes.  You look in both directions...");
			System.out.println("You can only go East or North East.  Both look the same from here. \nOptions: \n1: East\n2: North East");
			break;
			
			int b = s.nextInt();
			
			switch (b) {
			case 1:
				System.out.println("you die game over.");
				System.exit (b);
				break;
			}

		case 2:
			System.out.println("Verry well... Willeck dissapears down the hall and is swept up into the shadows. ");
			System.out.println("You jump out of bed to chase her but she is already gone, the silence is intense... nothing.");
			System.out.println("You go back to sleep but are awakened to screams from outside.  As you run over to the door");
			System.out.println("You can see that a skeletal mage is blasting fireballs into your neighbors lawn.  Oden is ");
			System.out.println("being attacked!!!!  You grab whatever you can and run outside.  A Skeletal Warrior swings his ");
			System.out.println("blood drenched sword at you.  You can feel the gust of wind from the blade almost slicing your ");
			System.out.println("neck wide open.  You dodge it, and don't hestitate to dive into safety.  The Skeletal Warrior");
			System.out.println("is out to hunt you....  As he charges towards you at an alarming speed you notice Willeck's dead");
			System.out.println("body lying in the street.  What do you do?\n\nOptions \n1: Punch him. \n2: run away");
			break;
			//
			//
			//
			//
			//
			//
			//
			
		}
		
		System.out.println(c.nextLine());
		
		System.out.println("What is your favorite Oden song?");
		
		
		System.out.println(c.nextLine());
		
		System.out.println("Where do you want to go?\n\n1:The Clever Skunk Tavern\n2:The Town\n3:Exit the game");
		

		int d1 = s.nextInt();
		
		switch(d1) {
		case 1:
			System.out.println("You listen to the music from the bards playing.");
			System.out.println("as you drink your ale you notice the barkeep...");
			System.out.println("Hilgard the barkeep has been living in the town");
			System.out.println("of Oden for most of his life.  He is bound to ");
			System.out.println("know a large list of tales.");
			System.exit (d1);
			break;
		case 2:
			System.out.println("What do you want to visit first in the town?");
			break;
		case 3:
			System.exit (d1);
			break;
			
		}
			
		}
	}
