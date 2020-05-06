public class Pawn extends Piece {

    public Pawn(boolean team, int pos) {
        super(team, pos);
    }

    public void move(int npos, Table table) {  // Movement routine for pawns
        if(team) {  // Black piece
            if(index + 8 == npos || index + 16 == npos) {  // Moving forward
                if(table.pieces[npos] == null) {
                    table.movePiece(index, npos);
                    this.index = npos;
                    return;
                }
            } else if(index + 7 == npos || index + 9 == npos) {  // Eating in diagonal
                if(table.pieces[npos] != null) {
                    if(!table.pieces[npos].team){
                        table.removePiece(npos);
                        table.movePiece(index, npos);
                        this.index = npos;
                        return;
                    }
                }
            }
        } else {  // White piece
            if(index - 8 == npos || index - 16 == npos) {  // Moving forward
                if(table.pieces[npos] == null) {
                    table.movePiece(index, npos);
                    this.index = npos;
                    return;
                }
            } else if(index -7 == npos || index - 9 == npos) {  // Eating in diagonal
                if(table.pieces[npos] != null) {
                    if(table.pieces[npos].team){
                        table.removePiece(npos);
                        table.movePiece(index, npos);
                        this.index = npos;
                        return;
                    }
                }
            }
        }
        System.out.println("MOVEMENT WITH PAWN NOT ALLOWED!!!");
    }
}
