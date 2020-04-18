package chess.figures;


public class King extends PlayingPiece {

    public King(int x, int y, String path) {
        super(x, y, path);
    }

    public King() {
    }

    @Override
    public boolean isLegalMove(int currX, int currY, int nextX, int nextY) {
        return true;
    }
}
