/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author david
 */
public class GraphNode {
    
    Object data;
    EdgeList list;
    GraphNode next;
    
    public GraphNode(Object data){
        this.data = data;
        this.list = new EdgeList();
        this.next = null;        
    }
    
    
    
}
