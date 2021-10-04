package turtleGraphics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleGraphics.entities.Turtle;
import turtleGraphics.enums.CardinalPoint;
import turtleGraphics.enums.PenPosition;
import turtleGraphics.exceptions.TurtleException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TurtleTest {
    private Turtle myTurtle;

    @BeforeEach
    void setUp() {
        myTurtle = new Turtle();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void changePenPosition(){
        assertEquals(PenPosition.UP, myTurtle.getPen().getPosition());
        myTurtle.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, myTurtle.getPen().getPosition());
    }

    @Test
    void testThatCanChangeTurtlePositionFromUpToDown(){
        assertEquals(PenPosition.UP, myTurtle.getPen().getPosition());
        myTurtle.changePenPosition(PenPosition.UP);
        assertEquals(PenPosition.UP, myTurtle.getPen().getPosition());
    }

    @Test
    void testTurtleCanTurnRightFromEast(){
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
        myTurtle.turnRight();
        assertEquals(CardinalPoint.SOUTH, myTurtle.getDirection());
    }

    @Test
    void testTurtleCanTurnRightFromSouth(){
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
        myTurtle.turnRight();
        myTurtle.turnRight();
        assertEquals(CardinalPoint.WEST, myTurtle.getDirection());
    }

    @Test
    void testTurtleCanTurnRightFromWest(){
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.turnRight();
        assertEquals(CardinalPoint.NORTH, myTurtle.getDirection());
    }

    @Test
    void testTurtleCanTurnRightFromNorth(){
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.turnRight();
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
    }

    @Test
    void testTurtleCanTurnLeftFromEast(){
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
        myTurtle.turnLeft();
        assertEquals(CardinalPoint.NORTH, myTurtle.getDirection());
    }

    @Test
    void testTurtleCanTurnLeftFromNORTH(){
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        assertEquals(CardinalPoint.WEST, myTurtle.getDirection());
    }

    @Test
    void testTurtleCanTurnLeftFromWEST(){
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        assertEquals(CardinalPoint.SOUTH, myTurtle.getDirection());
    }

    @Test
    void testTurtleCanTurnLeftFromSOUTH(){
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        assertEquals(CardinalPoint.EAST, myTurtle.getDirection());
    }

    @Test
    void testThatTurtleCanMoveForwardFromEast(){
        assertEquals(0, myTurtle.getxCoordinate());
        assertEquals(0, myTurtle.getyCoordinate());
        myTurtle.moveForward(12);
        assertEquals(11, myTurtle.getxCoordinate());
    }

    @Test
    void testThatTurtleCanMoveForwardFromSouth(){
        myTurtle.turnRight();
        myTurtle.moveForward(12);
        assertEquals(11, myTurtle.getyCoordinate());
    }

    @Test
    void testThatTurtleCanMoveForwardFromWest(){
        myTurtle.moveForward(12);
        myTurtle.turnRight();
        myTurtle.moveForward(12);
        assertEquals(11, myTurtle.getyCoordinate());
        myTurtle.turnRight();
        myTurtle.moveForward(12);
        assertEquals(0, myTurtle.getxCoordinate());
        assertEquals(11, myTurtle.getyCoordinate());
    }

    @Test
    void testThatTurtleCanMoveForwardFromNorth(){
        myTurtle.moveForward(12);
        myTurtle.turnRight();
        myTurtle.moveForward(12);
        assertEquals(11, myTurtle.getyCoordinate());
        myTurtle.turnRight();
        myTurtle.moveForward(12);
        assertEquals(0, myTurtle.getxCoordinate());
        assertEquals(11, myTurtle.getyCoordinate());
        myTurtle.turnRight();
        myTurtle.moveForward(12);
        assertEquals(0, myTurtle.getxCoordinate());
        assertEquals(0, myTurtle.getyCoordinate());
    }

    @Test
    void turtleCannotMoveBeyondBoundaries(){
        assertThrows(TurtleException.class,()->  myTurtle.moveForward(21));
    }
}