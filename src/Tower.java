public class Tower extends Piece {

    public Tower(boolean team, int pos) {
        super(team, pos);
    }


    public void move(int npos, Table table) {
        if(npos / 8 == index / 8) {  // Horizontal movement
            if(npos > index) {
                for (int i = index + 1; i < npos; i++) {
                    if(table.pieces[i] != null) {
                        System.out.println("MOVEMENT WITH TOWER NOT ALLOWED!!!");
                        return;
                    }
                }
            } else {
                for (int i = index - 1; i > npos; i--) {
                    if(table.pieces[i] != null) {
                        System.out.println("MOVEMENT WITH TOWER NOT ALLOWED!!!");
                        return;
                    }
                }
            }
            if (table.pieces[npos] != null) {
                if (table.pieces[npos].team != team) {
                    table.removePiece(npos);
                } else {
                    System.out.println("MOVEMENT WITH TOWER NOT ALLOWED!!!");
                    return;
                }
            }
            table.pieces[npos] = table.pieces[index];
            table.pieces[index] = null;
            this.index = npos;
            return;
        }else if((npos - index) % 8 == 0) {  // Vertical movement
            if(npos > index) {  // Downwards
                for (int i = index + 8; i < npos; i += 8) {
                    if(table.pieces[i] != null) {
                        System.out.println("MOVEMENT WITH TOWER NOT ALLOWED!!!");
                        return;
                    }
                }
            } else {  // Upwards
                if(index > npos) {  // Downwards
                    for (int i = index - 8; i > npos; i -= 8) {
                        if (table.pieces[i] != null) {
                            System.out.println("MOVEMENT WITH TOWER NOT ALLOWED!!!");
                            return;
                        }
                    }
                }
            }
            if (table.pieces[npos] != null) {
                if (table.pieces[npos].team != team) {
                    table.removePiece(npos);
                } else {
                    System.out.println("MOVEMENT WITH TOWER NOT ALLOWED!!!");
                    return;
                }
            }
            table.pieces[npos] = table.pieces[index];
            table.pieces[index] = null;
            this.index = npos;
            return;
        }
        System.out.println("MOVEMENT WITH TOWER NOT ALLOWED!!!");
    }
}
