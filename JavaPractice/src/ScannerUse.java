import java.util.Scanner;

public class ScannerUse {
	
	Scanner scan = new Scanner(System.in);
	String story;
	String name;
	String color;
	
	public String getStory() {
		return story;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public void setStory(String newStory) {
		this.story = newStory;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public void setColor(String newColor) {
		this.color = newColor;
	}
	// print instructions to player UI
	public void printInstructions() {
		System.out.println("enter name.");
	}
	//get data from player on UI
	public void enterName() {
		setName(scan.nextLine());
	}
	public void enterColor() {
		System.out.println("write color: ");
		setColor(scan.nextLine());
	}
	
	public void putTogetherStory() {
		String story = "Here is the story. Your name :   "+getName()+" also my name and color is: "+getColor();
		setStory(story);
	}
	
	public void play() {
		enterName();
		enterColor();
		putTogetherStory();
		System.out.println(getStory());
	}

	public static void main(String[] args) {
		
		ScannerUse game = new ScannerUse();
		game.printInstructions();
		game.play();
		
		System.out.println("Ascii value of 'a' is:  "+(int)'a');
		
		String str = "This place is beautiful.";
		char[] strChar = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(strChar[i]);
		}		
	}
}
