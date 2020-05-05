public class Table {
    Piece[] pieces;

    public Table() {
        pieces = new Piece[64];
    }


    public void printTable() {
        for(int j = 0; j < 8; j ++) {
            System.out.print(8-j + " ");
            for (int i = j*8; i < (j+1)*8; i++) {
                if(pieces[i] == null) {
                    System.out.print("- ");
                } else if (pieces[i].getTeam()){
                    System.out.print(pieces[i].getClass().getName().substring(0, 1) + " ");
                } else {
                    System.out.print(pieces[i].getClass().getName().substring(0, 1).toLowerCase() + " ");
                }
            }
            System.out.println();
         }
        System.out.println("  a b c d e f g h");
    }


    public void removePiece(int pos) {
        pieces[pos] = null;
    }


    public void setupTable() {
        pieces[0] = new Tower(true, 0);
        pieces[1] = new Horse(true, 1);
        pieces[2] = new Bishop(true, 2);
        pieces[3] = new Queen(true, 3);
        pieces[4] = new King(true, 4);
        pieces[5] = new Bishop(true, 5);
        pieces[6] = new Horse(true, 6);
        pieces[7] = new Tower(true, 7);
        for (int i = 8; i < 16; i++) {
            pieces[i] = new Pawn(true, i);
        }
        for (int i = 48; i < 56; i++) {
            pieces[i] = new Pawn(false, i);
        }
        pieces[56] = new Tower(false, 56);
        pieces[57] = new Horse(false, 57);
        pieces[58] = new Bishop(false, 58);
        pieces[59] = new Queen(false, 59);
        pieces[60] = new King(false, 60);
        pieces[61] = new Bishop(false, 61);
        pieces[62] = new Horse(false, 62);
        pieces[63] = new Tower(false, 63);
    }
}
