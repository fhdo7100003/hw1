public class SplitSortThing {
  static void selectionSort(String[] words) {
    for (int i = 0; i < words.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < words.length; j++) {
        if (words[min].compareTo(words[j]) > 0) {
          min = j;
        }
      }
      if (min != i) {
        String tmp = words[i];
        words[i] = words[min];
        words[min] = tmp;
      }
    }
  }

  public static void main(String[] args) {
    String text = "To be or not to be, that is the question;"
        + "Whether `tis nobler in the mind to suffer"
        + " the slings and arrows of outrageous fortune,"
        + " or to take arms against a sea of troubles,"
        + " and by opposing end them?";
    var words = text.split("[\\s\\.`,;\\?]+");
    selectionSort(words);
    for (var s : words) {
      System.out.println(s);
    }
  }
}
