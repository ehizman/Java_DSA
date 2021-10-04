package turtleGraphics.entities;

import turtleGraphics.enums.CardinalPoint;
import turtleGraphics.enums.PenPosition;
import turtleGraphics.exceptions.TurtleException;

public class Turtle {
    private Pen pen;
    private int xCoordinate;
    private int yCoordinate;
    private CardinalPoint direction;
    private String name;

    public Turtle(){
        pen = new Pen();
        this.direction = CardinalPoint.EAST;
    }

    public Turtle(String name){
        this();
        this.name = name;
    }
    public Turtle(String name, int xCoordinate, int yCoordinate){
        this(name);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public CardinalPoint getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoint direction) {
        this.direction = direction;
    }

    public void changePenPosition(PenPosition position){
        this.pen.setPosition(position);
    }

    public void turnRight() {
        switch (direction){
            case EAST -> setDirection(CardinalPoint.SOUTH);
            case SOUTH -> setDirection(CardinalPoint.WEST);
            case WEST -> setDirection(CardinalPoint.NORTH);
            case NORTH -> setDirection(CardinalPoint.EAST);
        }
    }

    public void turnLeft() {
        switch (direction){
            case EAST -> setDirection(CardinalPoint.NORTH);
            case NORTH -> setDirection(CardinalPoint.WEST);
            case WEST -> setDirection(CardinalPoint.SOUTH);
            case SOUTH -> setDirection(CardinalPoint.EAST);
        }
    }

    public void moveForward(int numberOfSteps) {
        if (direction == CardinalPoint.EAST){
            xCoordinate = xCoordinate + numberOfSteps -1;
        }
        else{
            if (direction == CardinalPoint.SOUTH){
                yCoordinate += numberOfSteps-1;
            }
            else{
                if (direction == CardinalPoint.WEST){
                    xCoordinate -= numberOfSteps - 1;
                }
                else{
                    yCoordinate -= numberOfSteps-1;
                }
            }
        }
    }

    public void moveForward(int numberOfSteps, SketchPad pad) throws TurtleException {
        if (numberOfSteps > pad.getFloor().length-1){
            throw new TurtleException("Number of steps too high");
        }
        if (direction == CardinalPoint.EAST){
            int destination = xCoordinate + numberOfSteps-1;
            if (destination > pad.getFloor().length-1){
                throw new TurtleException("Number of steps too high");
            }
        }
        else{
            if (direction == CardinalPoint.SOUTH){
                int destination = yCoordinate + numberOfSteps-1;
                if (destination > pad.getFloor().length-1){
                    throw new TurtleException("Number of steps too high");
                }
            }
            else{
                if (direction == CardinalPoint.WEST){
                    int destination = xCoordinate - numberOfSteps-1;
                    if (destination < 0){
                        throw new TurtleException("Number of steps too high");
                    }
                }
                else{
                    int destination = yCoordinate - numberOfSteps-1;
                    if (destination < 0){
                        throw new TurtleException("Number of steps too high");
                    }
                }
            }
        }
    }
}
