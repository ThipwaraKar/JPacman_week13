package nl.tudelft.jpacman.board;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        // Remove the following placeholder:
        //assertThat(unit.getSquare()).isNotNull();
        assertNull(unit.getSquare());
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        // Remove the following placeholder:
       // assertThat(unit).isNotNull();
        Square target = new BasicSquare();
        unit.occupy(target);
        //assertThat(unit.getSquare()).isEqualTo(target);
        //assertThat(target.getOccupants(), contains(unit));
       // assertTrue(target.isAccessibleTo(unit));
        //assertThat(unit.getSquare(), is(target));
        MatcherAssert.assertThat(unit.getSquare(), is(target));
        MatcherAssert.assertThat(target.getOccupants(), contains(unit));

    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        // Remove the following placeholder:
        //assertThat(unit).isNotNull();
        Square target = new BasicSquare();
        unit.occupy(target);
        unit.occupy(target);
        MatcherAssert.assertThat(unit.getSquare(), is(target));
        MatcherAssert.assertThat(target.getOccupants(), contains(unit));


    }
}
