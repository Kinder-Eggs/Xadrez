public class King extends Piece {

    public King(boolean team, int pos) {
        super(team, pos);
    }

    public void move(int npos, Table table) {
        if(index - npos == 7 || index - npos == 8 || index - npos == 9 || index - npos == 1 || index - npos == -7 || index - npos == -8 || index - npos == -9 || index - npos == -1 ) {
            if(table.pieces[npos] != null) {
                if(table.pieces[npos].team != team) {
                    table.removePiece(npos);
                } else {
                    System.out.println("MOVEMENT WITH KING NOT ALLOWED!!!");
                    return;
                }
            }
            table.movePiece(index, npos);
            this.index = npos;
            return;
        }
        System.out.println("MOVEMENT WITH KING NOT ALLOWED!!!");
    }
}
