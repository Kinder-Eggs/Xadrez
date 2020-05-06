public class Horse extends Piece {

    public Horse(boolean team, int pos) {
        super(team, pos);
    }

    public void move(int npos, Table table) {
        if(index - npos == 17 || index - npos == 15 || index - npos == 10 || index - npos == -6 || index - npos == -17
                || index - npos == -15 || index - npos == -10 || index - npos == 6) {
            if(table.pieces[npos] == null) {
                table.removePiece(npos);
            }
            table.movePiece(index, npos);
            this.index = npos;
        }
    }
}
