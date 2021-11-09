package nl.tudelft.jpacman.board;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;

public class BoardTest {
    private Board board;

    private final Square x0y0 = mock(Square.class);
    private final Square x0y1 = mock(Square.class);
    //private final Square x0y2 = mock(Square.class);
    private final Square x1y0 = mock(Square.class);
    private final Square x1y1 = mock(Square.class);
    //private final Square x1y2 = mock(Square.class);

   // private static final int MAX_WIDTH = 2;
   // private static final int MAX_HEIGHT = 3;

    private static final int MAX_WIDTH = 2;
    private static final int MAX_HEIGHT = 2;

    /**
     * Setup a board that can be used for testing.
     */
    @Before
    public void setUp() {
        Square[][] grid = new Square[MAX_WIDTH][MAX_HEIGHT];
        grid[0][0] = x0y0;
        grid[0][1] = x0y1;
      //  grid[0][2] = x0y2;
        grid[1][0] = x1y0;
        grid[1][1] = x1y1;
      //  grid[1][2] = x1y2;
        board = new Board(grid);
    }

    @Test
    public void verifyWidth() {
        assertEquals(MAX_WIDTH, board.getWidth());
    }

    /**
     * Verifies the board has the correct height.
     */
    @Test
    public void verifyHeight() {
        assertEquals(MAX_HEIGHT, board.getHeight());
    }

    /**
     * Verifies the square at x0y0 is indeed the right square.
     */
    @Test
    public void verifyX0Y0() {
        assertEquals(x0y0, board.squareAt(0, 0));
    }
    /**
     * Verifies the square at x1y1 is indeed the right square.
     */
    @Test
    public void verifyX1Y2() {
        assertEquals(x1y1, board.squareAt(1, 1));
    }

    @Test
    public void TestsquareAt(){

        try {
            //board = new Board(grid2);
            board.squareAt(1,1).equals(null);
        }catch (NullPointerException e){
            return;
        }
        fail ("NullPointerException expected");

    }

}
