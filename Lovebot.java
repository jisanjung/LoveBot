import java.util.*;

public class Lovebot {
	Scanner s = new Scanner(System.in);
	
	public Lovebot() {
		System.out.println("LoveBot: Hello there. I’m your friendly assistant Love Bot and I give dating advice. How can I help you today?");
	}
	public void botSay(String s) {
		
		System.out.println("LoveBot: " + s);
	}
	public void botLogic() {
		
		for(int i = 1; i > 0; i++) {
		System.out.print("You: ");
			 String user = s.nextLine().toLowerCase();
				
			if (user.startsWith("hey") || user.startsWith("hello") || user.startsWith("hi") || user.startsWith("who") || user.startsWith("hola")) {
				botSay("Hey there! How can I help you?");
			} else if (user.contains("crush") || user.contains("approach") || user.contains("lik") || user.contains("talk") || user.contains("want") || user.contains("feeling") || user.contains("scar") || user.contains("afraid") || user.contains("too good") || user.contains("league")) {
				botSay("Don’t be afraid to approach them! The worst is rejection and you move on with life." + "\n" + "Anything else?");
			} else if (user.contains("cheat") || user.contains("broke up") || user.contains("heartbroken") || user.contains("hurt") || user.contains("left") || user.contains("leav") || user.contains("abus") || user.contains("toxic") || user.contains("ignor") || user.contains("mad") || user.contains("angr") || user.contains("break")) {
				botSay("Leave them behind! Nobody deserves to be treated like that." + "\n" + "Anything else?");
			} else if (user.contains("better") || user.contains("improv") || user.contains("strengthen") || user.contains("bond") || user.contains("close") || user.contains("make up") || user.contains("distan") || user.contains("apart")) {
				botSay("Communication is key." + "\n" +"Anything else?");
			} else if (user.contains("ex")) {
				botSay("Stop talking to them. There’s a reason why you aren’t together anymore." + "\n" + "Anything else?");
			} else if (user.contains("first") || user.contains("dat") || user.contains("where") || user.contains("out") || user.contains("eat") || user.contains("food") || user.contains("place") || user.contains("special")) {
				botSay("Movies, Golf, Chipotle, Mall, Park, Walmart. Your choice." + "\n" + "Anything else?");
			} else if (user.contains("ok") || user.contains("okay") || user.contains("thank you") || user.contains("thanks") || user.contains("oh") || user.contains("thx")) {
				botSay("No problem!" + "\n" + "Anything else?");
			} else if (user.contains("no") || user.contains("nah") || user.contains("naw") || user.contains("nope")) {
				botSay("Okay. Say \"end chat\" to close this chat");
			} else if (user.contains("end chat") || user.contains("endchat")) {
				botSay("Goodbye!");
				System.exit(0);
			} else {
				botSay("Sorry didn't get that. Try again");
			}
		}
	}
}
