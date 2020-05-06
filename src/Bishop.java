public class Bishop extends Piece {

    public Bishop(boolean team, int pos) {
        super(team, pos);
    }

    public void move(int npos, Table table) {
        if((index - npos) % 7 == 0) {
            if(index > npos) {
                for (int i = index-7; i != npos; i -= 7) {
                    if(table.pieces[i] != null) {
                        System.out.println("MOVEMENT WITH BISHOP NOT ALLOWED!!!");
                        return;
                    }
                }
            } else {
                for (int i = index+7; i != npos; i += 7) {
                    if(table.pieces[i] != null) {
                        System.out.println("MOVEMENT WITH BISHOP NOT ALLOWED!!!");
                        return;
                    }
                }
            }
            if (table.pieces[npos] != null) {
                if (table.pieces[npos].team != team) {
                    table.removePiece(npos);
                }
            }
            table.pieces[npos] = table.pieces[index];
            table.pieces[index] = null;
            this.index = npos;
            return;
        }
        if ((index - npos) % 9 == 0) {
            if(index > npos) {
                for (int i = index-9; i != npos; i -= 9) {
                    if(table.pieces[i] != null) {
                        System.out.println("MOVEMENT WITH BISHOP NOT ALLOWED!!!");
                        return;
                    }
                }
            } else {
                for (int i = index+9; i != npos; i += 9) {
                    if(table.pieces[i] != null) {
                        System.out.println("MOVEMENT WITH BISHOP NOT ALLOWED!!!");
                        return;
                    }
                }
            }
            if (table.pieces[npos] != null) {
                if (table.pieces[npos].team != team) {
                    table.removePiece(npos);
                }
            }
            table.pieces[npos] = table.pieces[index];
            table.pieces[index] = null;
            this.index = npos;
            return;
        }
        System.out.println("MOVEMENT WITH BISHOP NOT ALLOWED!!!");
    }
}
