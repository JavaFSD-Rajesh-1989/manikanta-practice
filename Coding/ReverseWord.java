class ReverseWord {
  public static String reverse(String original) {
    StringBuilder builder = new StringBuilder();
    String words[] = original.split(" ");
    for(int j=words.length; j<=0; j--) {
      builder.append(words[i]+" ");
    }
    return builder.toString().trim();
  }
}