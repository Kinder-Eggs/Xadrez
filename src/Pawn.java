public class Pawn extends Piece {

    public Pawn(boolean team, int pos) {
        super(team, pos);
    }

    public void move(int npos, Table table) {
        if(team) {
            if(index + 8 == npos || index + 16 == npos) {
                if(table.pieces[npos] == null) {
                    table.pieces[npos] = table.pieces[index];
                    table.pieces[index] = null;
                    this.index = npos;
                    return;
                }
            } else if(index + 7 == npos || index + 9 == npos) {
                if(table.pieces[npos] != null) {
                    table.removePiece(npos);
                    table.pieces[npos] = table.pieces[index];
                    table.pieces[index] = null;
                    this.index = npos;
                    return;
                }
            }
        } else {
            if(index - 8 == npos || index - 16 == npos) {
                if(table.pieces[npos] == null) {
                    table.pieces[npos] = table.pieces[index];
                    table.pieces[index] = null;
                    this.index = npos;
                    return;
                }
            } else if(index -7 == npos || index - 9 == npos) {
                if(table.pieces[npos] != null) {
                    table.removePiece(npos);
                    table.pieces[npos] = table.pieces[index];
                    table.pieces[index] = null;
                    this.index = npos;
                    return;
                }
            }
        }
        System.out.println("MOVEMENT WITH PAWN NOT ALLOWED!!!");
    }
}
