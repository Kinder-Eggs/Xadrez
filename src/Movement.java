public class Movement extends Commands {
    private String move;

    public Movement(String move) {
        this.move = move;
    }

    String getCommand() {
        return move;
    }
}
