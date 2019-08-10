package basic;

public class SpeakerFactory {

	public static ISpeaker CreateSpeaker(Language language) {
		switch (language) {
		case English:
			return new EnglishSpeaker();
		case German:
			return new GermanSpeaker();
		case Spanish:
			return new SpanishSpeaker();
		}
		return null;
	}
}