package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'o' || character == 'i' || character == 'u' ) {
            System.out.println("Vowel");
        } else if (character == 'A' || character == 'E' || character == 'O' || character == 'I' || character == 'U') {
            System.out.println("Vowel");
        } else if ((character > 96 && character < 123) || (character > 64 && character < 91)) {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
