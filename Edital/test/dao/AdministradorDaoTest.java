/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Administrador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mayla
 */
public class AdministradorDaoTest {
    
    public AdministradorDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class AdministradorDao.
     */
    @Test
    public void testInserir() {
        AdministradorDao dao = new AdministradorDao();
        Administrador adm = new Administrador(1,"TICO","Tico Silva","1234");
        dao.inserir(adm);
    }

   
}
