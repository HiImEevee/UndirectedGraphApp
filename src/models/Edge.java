/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author elev
 */
public class Edge {
    public int x, y;

    public Edge(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Boolean equals(Edge edge) {
        return Math.min(this.x, this.y) == Math.min(edge.x, edge.y) && 
               Math.max(this.x, this.y) == Math.max(edge.x, edge.y);
    }
    
    @Override
    public String toString(){
        return " "+x+" "+y+" ";
    }
    
}
