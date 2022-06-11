package beans;

public class Player {
    private Color color;
    private Piece[] pieces = new Piece[12];

    public Player(Color color) {
        this.color = color;
        for (int i = 0; i < 12; i++) {
            pieces[i] = new Soldier();
            pieces[i].setColor(color);
            pieces[i].setType(PieceType.SOLDIER);
        }
    }

    public Piece[] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[] pieces) {
        this.pieces = pieces;
    }
}
