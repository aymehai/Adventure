import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(
				"You just woke up and feel really tired. Would you like to \"skip\" class or \"go\" to class?");
		String answerChoice = keyboard.nextLine();

		if (answerChoice.equals("skip")) {
			System.out.println("you go back to sleep, but wake up becuase you have to go to the bathroom. But someone is in the bathroom do you \"wait\" or go to the \"down\" staris one?");
			
			answerChoice = keyboard.nextLine();
			if (answerChoice.equals("wait")) {
				System.out.println("you decide to wait and your brother comes out the bathroom, but as expected it stinks and you can barely breath. Do you \"power\" through it or get the \"air\" freshiner from down stairs?");
				
				answerChoice = keyboard.nextLine();
				
				if(answerChoice.equals("power")){
					System.out.println("so you decided to power thru it, but as you opened the toilet the smell was so overwhelming that you suffocated to death");
				}
				
				else if(answerChoice.equals("air")){
					System.out.println("so you decided to get the air freshiner, but on your way down you accidentally step on a mouse. Thus causing you to ");
					System.out.println("slip and break through the guardrails and fall down 1 story landing headfirst onto the hard wood floor leaving you dead with a neck as mobile as a slinky.");
				}
			} 
			else if (answerChoice.equals("down")) {
				System.out.println("so you decided to go downstairs, but on your way down you see a mouse. Do you \"chase\" after it or \"ignore\" and continue on your way to the bathroom");
				
				answerChoice = keyboard.nextLine();
				
				if(answerChoice.equals("chase")){
					System.out.println("so you decided to chase the mouse. and after 10min of chasing you were so very close. You had the mouse in your hand, ");
					System.out.println("but your forward momentum caused you to go head first into glass which was an already preheated oven at 500 degrees ");
					System.out.println("leaving you with your head stuck in the oven dying as your brain was cooked to a burnt crisp.");
				}
				else if(answerChoice.equals("ignore")){
					System.out.println("so you decided to ignore the mouse but as soon as you go to the last step on the staircase the mouse had finished eating the last part of the floorbaord");
					System.out.println("leaving you to fall staight to the unfinished basement landing on your butt, but you experise whiplash and smash your skull on the concrete floor leaving you dead");
				}
			}
		}

		else if (answerChoice.equals("go")) { 
			System.out.println("Would you like to take a \"shower\" first or eat \"breakfast\" first");
			answerChoice = keyboard.nextLine();
			if(answerChoice.equals("breakfast")){
				System.out.println("There is only frosted \"flakes\" and \"oatmeal\" for breakfast which do you choose?");
				answerChoice = keyboard.nextLine();
				if(answerChoice.equals("flakes")){
					System.out.println("you choked on a flake and now you are dead");
				}
				else if(answerChoice.equals("oatmeal")){
					System.out.println("you put your oatmeal in the microwave and as soon as you started the microwave it exploded and now you are dead");
				}
			}
			else if(answerChoice.equals("shower")){
				System.out.println("you went into the shower and start putting on shampoo and it gets into you eyes. Do you get the \"towel\" and wipe your eyes? ");
				System.out.println(" or do you \"wash\" your eyes with water?");
				answerChoice = keyboard.nextLine();
				if(answerChoice.equals("towel")){
					System.out.println(" you grab the towel and along with it you grab the shower curtain and you somehow accidentaly sufficate yourself trying to wipe your eyes.");
				}
				else if(answerChoice.equals("wash")){
					System.out.println("you wash the shampoo out your eyes, dress up and go to shcool");
				}
			}
		}

	}

}
