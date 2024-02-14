package sokoban;

/**
 * Module: Object Oriented Programming
 * Student: Daniel Barbu: 20024094
 * Application: Assessment 1 Sokoban
 * Version: 1.0
 * Date: 14/02/2024
 * File: MapElement.java
 *
 * @author Daniel Barbu: 20024094
 */

public abstract class MapElement {
    private boolean canBePushed;
    private boolean isDestination;
    private String imgFilename;
    private boolean obs;
    private String symbol;
    private MapElement underneath;
    private int x;
    private int y;
    
    public MapElement() {
        
    }
    
    public boolean getCanBePushed() {
        return false;
    }
    
    public String getImgFilename() {
        return "";
    }
    
    public boolean getIsDestination() {
        return false;
    } 

    public boolean getObs() {
        return false;
    }

    public String getSymbol() {
        return "";
    }

    public MapElement getUnderneath() {
        return null;
    }

    public int getX() {
        return 0;
    } 
    
    public int getY() {
        return 0;
    }
    
    public void setCanBePushed(boolean value) {
        
    }
    
    public void setImgFilename(String fileName) {
        
    }
    
    public void setIsDestination(boolean isDestination) {
        
    }
    
    public void setObs(boolean value) {
        
    }
    
    public void setSymbol(String s) {
        
    }
    
    public void setUnderneath(MapElement u) {
        
    }
    
    public void setX(int val) {
        
    }
    
    public void setY(int val) {
        
    }
    
}
