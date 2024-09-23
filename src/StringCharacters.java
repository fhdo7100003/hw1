public class StringCharacters {
  static boolean isVowel(int c) {
    return "aeiou".codePoints().anyMatch(v -> v == c);
  }

  public static void main(String[] args) {
    String text = "To be or not to be, that is the question;"
        + "Whether `tis nobler in the mind to suffer"
        + " the slings and arrows of outrageous fortune,"
        + " or to take arms against a sea of troubles,"
        + " and by opposing end them?";
    int spaces = 0,
        vowels = 0,
        letters = 0;

    // NOTE: char(2byte) is slightly weird for higher unicode ranges and
    // splits them into surrogate pairs, so just use code points
    var it = text.codePoints().iterator();
    while (it.hasNext()) {
      var codePoint = it.next();
      if (codePoint == (int) ' ') {
        spaces++;
      } else {
        letters++;
      }
      if (isVowel(codePoint)) {
        vowels++;
      }
    }

    System.out.printf(
        "The text contained vowels: %d\nconsonants: %d\nspaces: %d\n",
        vowels,
        letters - vowels,
        spaces);
  }
}
