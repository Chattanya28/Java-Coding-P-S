public int countWords(String sentence) {
    if (sentence == null || sentence.trim().isEmpty()) {
        return 0;
    }
    String[] words = sentence.trim().split("\\s+");
    return words.length;
}