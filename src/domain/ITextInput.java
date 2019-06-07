package domain;

public interface ITextInput extends ITextComponent{
	public int countParagraph(String text);
	public int countLine(String text);
	public int countWord(String text);
	public int countCharacter(String text);
	public void autoCorrectText(String text);

}
