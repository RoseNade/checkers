package beans;

public abstract class Piece {
    private static int count = 0;
    private int id = count;
    private boolean isDead;
    private Color color;
    public PieceType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    public Piece() {
        count++;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "id=" + id +
                ", isDead=" + isDead +
                ", color=" + color +
                '}';
    }
}
