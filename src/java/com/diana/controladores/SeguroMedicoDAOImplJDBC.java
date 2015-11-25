/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.controladores;

import com.diana.entidades.BussinessException;
import com.diana.entidades.Seguromedico;
import com.diana.spring.SeguroMedicoController;
import java.sql.Connection;
import java.util.List;
import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author Oscar
 */
public class SeguroMedicoDAOImplJDBC implements SeguroMedicoDAO {

    SeguromedicoJpaController seguromedicoJpaController = new SeguromedicoJpaController();

    @Override
    public void insert(Seguromedico seguroMedico) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(int idSeguroMedico, Seguromedico seguroMedico) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seguromedico get(int idSeguroMedico) throws BussinessException {
        return seguromedicoJpaController.findSeguromedico(idSeguroMedico);
    }

    @Override
    public void delete(int idSeguroMedico) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Seguromedico> findAll() throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
