/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.uricer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class HelloTest {

@Test
public void testRetornaHelloNomeSePassarNome(){
    Hello hello = new Hello("Ga");
    assertEquals("Hello Ga", hello.getString());
}
@Test
public void testRetornaHelloSemNome(){
    Hello hello = new Hello();
    assertEquals("Hello", hello.getString());
}
}
