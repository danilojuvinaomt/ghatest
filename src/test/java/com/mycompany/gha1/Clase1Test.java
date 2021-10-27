/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gha1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juvinao
 */
public class Clase1Test {
    
    public Clase1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Clase1.
     */
    @Test
    public void testSumar() {  
        System.out.println("sumar");
        System.out.println("222");
        Clase1 instance = new Clase1();
        int result = instance.sumar(4, 5);
        assertEquals(9, result);
    }
    
    @Test
    public void testSumar2() {  
        System.out.println("sumar que falla");
        Clase1 instance = new Clase1();
        int result = instance.sumar(4, 5);
        assertEquals(8, result);
    }
    
}
