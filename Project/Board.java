public class Board {

    private int[][] grid;
    private int width;
    private int height;

    public Board(int width, int height) {
        this.grid = new int[height][width];
        this.width = width;
        this.height = height;
    }

    public boolean getOccupied(int row, int col) {
      return grid[row][col] != 0;
  }
    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
