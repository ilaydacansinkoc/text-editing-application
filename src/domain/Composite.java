package domain;

import java.util.List;

public class Composite implements ITextInput{

	private List<ITextComponent> includedComponents;
	
	@Override
	public void searchWord(String word) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void countWords() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countParagraph(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countLine(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countWord(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countCharacter(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void autoCorrectText(String text) {
		// TODO Auto-generated method stub
		
	}
	

}
