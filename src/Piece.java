public class Piece {  // Base class for pieces
    public boolean team; // True = Black, False = White
    public int index;

    public Piece(boolean team, int index) {
        this.team = team;
        this.index = index;
    }

    public void move(int pos, Table table) {
        ;
    }

    public boolean getTeam() {
        return team;
    }
}
