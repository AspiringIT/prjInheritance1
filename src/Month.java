public enum Month {

    January("a"),
    February("b"),
    March("c"),
    April("d"),
    May("e"),
    June("f"),
    July("g"),
    August("h"),
    September("i"),
    October("j"),
    November("k"),
    December("m");
    private final String letter;

    Month(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public static Month fromLetter(String input) {
        for (Month month : values()) {
            if (month.letter.equalsIgnoreCase(input)) {
                return month;
            }
        }
        return null;
    }
}