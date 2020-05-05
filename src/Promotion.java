public class Promotion extends Commands {
    private char prom;

    public Promotion(String prom) {
        this.prom = prom.charAt(0);
    }

    String getCommand() {
        return String.valueOf(prom);
    }
}
