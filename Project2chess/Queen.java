public class Queen {
    int row;
    int col;
    boolean isBlack;

    public Queen(int row, int col, boolean isBlack) {
        this.row = row;
        this.col = col;
        this.isBlack = isBlack;
    }

    public boolean isMoveLegal(Board board, int endRow, int endCol) {
        if (board.verifyVertical(row, col, endRow, endCol) || board.verifyHorizontal(row, col, endRow, endCol) ||
                board.verifyDiagonal(row, col, endRow, endCol)
                        && board.verifySourceAndDestination(row, col, endRow, endCol, isBlack)) {
            return true;
        }
        return false;
    }
}
