public class Piece {
    private boolean team; // True = Black, False = White
    private int index;

    public Piece(boolean team, int index) {
        this.team = team;
        this.index = index;
    }

    public void move(int pos) {
        ;
    }

    public boolean getTeam() {
        return team;
    }
}
