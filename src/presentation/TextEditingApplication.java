package presentation;

import autocorrection.AutoCorrect;

public class TextEditingApplication {

	public void readLine(){
		AutoCorrect ac = new AutoCorrect();
		ac.autoCorrect("aand mmeltd");
		System.out.println(ac);
	}
}
