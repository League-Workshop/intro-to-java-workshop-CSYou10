package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
	
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak ("Spell deductible.");
		// 2. Catch the user's answer in a String
		String UserAnswer = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
		if (UserAnswer.equalsIgnoreCase("deductible")) {
		speak ("Correct");
		
		// 4. Otherwise say "wrong"
		} else {
		speak ("Wrong you are now in Kindergarden");
		}
		// 5. repeat the process for other words
		speak ("Mississippi how do you spell it?.");
		// 2. Catch the user's answer in a String
		 UserAnswer = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
		if (UserAnswer.equalsIgnoreCase("it")) {
		speak ("Correct");
		
		// 4. Otherwise say "wrong"
		} else {
		speak ("Wrong you are now in Kindergarden");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}



















