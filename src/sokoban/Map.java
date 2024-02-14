package sokoban;

/**
 * Module: Object Oriented Programming
 * Student: Daniel Barbu: 20024094
 * Application: Assessment 1 Sokoban
 * Version: 1.0
 * Date: 14/02/2024
 * File: Map.java
 *
 * @author Daniel Barbu: 20024094
 */

public class Map {
    
    private MapElement[][] myMap;
    private int length;
    private int breadth;
    private Coord playerLocation;
    private boolean complete;
    private int noOfMoves;
    
    public Map() {
        
    }
    
    public boolean checkForWin() {
        return false;
    }
    
    public void displayMap() {
        
    }
    
    public Coord findPlayer() {
        return null;
    }
    
    public int getBreadth() {
        return 0;
    }
    
    public int getLength() {
        return 0;
    }
    
    public MapElement getElement(int x, int y) {
        return null;
    }
    
    public MapElement[][] getMap(int x, int y) {
        return null;
    }
    
    public int getNumMoves() {
        return 0;
    }
    
    public boolean isObstacleAhead(int x, int y) {
        return false;
    }
    
    public boolean isPushableObject(int x, int y) {
        return false;
    }
    
    public void loadMap(String mapName) {
        
    }
    
    public void move(int coorX, int coorY, int newX, int newY) {
        
    }
    
    public boolean movePlayer(int dir) {
        return false;
    }
    
    public void resetNoMove() {
        
    }
    
    public void setBreadth(int b) {
        
    }
    
    public void setLength(int l) {
        
    }
    
}
