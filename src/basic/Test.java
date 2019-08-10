package basic;

public class Test {
	public static void main(String[] args) {
		ISpeaker speaker = SpeakerFactory.CreateSpeaker(Language.English);
		speaker.Speak();
	}
}