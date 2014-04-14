package Astar;

import junit.framework.TestCase;

/**
 *
 * @author Arto
 */
public class NodeTest extends TestCase {
    Node n = new Node('*',0,0);
    Node n1 =new Node('X',1,2);
    
    
    /**
     * Test creation of a node
     */
    public void testNodeCreation()
    {
        assertTrue(n != null && n.getValue()=='*');
    }
    
    public void testCoordinates() {
        assertTrue(n.getY() == 0);
        assertTrue(n.getX() == 0);
        
    }
    
    public void testPathCreation() {
        n.setPrev(n1);
        assertTrue(n.getPrev()==n1);
    }
    
    public void testValueModification() {
        n.setValue('H');
        assertTrue(n.getValue()=='H');
    }
    
    public void testToStartModification() {
        n.setToStart(100);
        assertTrue(n.getToStart()==100);
    }
    
    public void testPriority() {
        n.setToStart(1);
        n.setToGoal(4, 4);
        assertTrue(n.getPrio()==Math.sqrt(32)+1);
    }
    
    
    
    
}
