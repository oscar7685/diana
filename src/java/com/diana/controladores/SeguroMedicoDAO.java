/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.controladores;

import com.diana.entidades.BussinessException;
import com.diana.entidades.Seguromedico;
import java.util.List;

/**
 *
 * @author Oscar
 */
public interface SeguroMedicoDAO {

    void insert(Seguromedico seguroMedico) throws BussinessException;

    void update(int idSeguroMedico, Seguromedico seguroMedico) throws BussinessException;

    Seguromedico get(int idSeguroMedico) throws BussinessException;

    void delete(int idSeguroMedico) throws BussinessException;

    List<Seguromedico> findAll() throws BussinessException;
}
