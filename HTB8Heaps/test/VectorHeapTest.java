/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Tejada
 */
public class VectorHeapTest {

    /**
     * Test of getFirst method, of class VectorHeap.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        Paciente paciente = new Paciente("Alfonso", "Pierna Rota", "A");
        VectorHeap instance = new VectorHeap();
        instance.add(paciente);
        Object expResult = paciente;
        Object result = instance.getFirst();
        assertEquals(expResult, result);

    }

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        Paciente paciente = new Paciente("Alfonso", "Pierna Rota", "A");
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        instance.add(paciente);
        Object expResult = paciente;
        Object result = instance.remove();
        assertEquals(expResult, result);

    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        VectorHeap instance = new VectorHeap();
        instance.add(new Paciente("Alfonso", "Pierna Rota", "A"));
    }

}
