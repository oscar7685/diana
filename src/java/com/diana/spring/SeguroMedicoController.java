/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.spring;

/**
 *
 * @author Oscar
 */
import com.diana.controladores.SeguroMedicoDAO;
import com.diana.entidades.BussinessException;
import com.diana.entidades.Seguromedico;
import com.diana.jackson.JsonTransformer;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeguroMedicoController {

    @Autowired
    private SeguroMedicoDAO seguroMedicoDAO;

    @Autowired
    private JsonTransformer jsonTransformer;

    @RequestMapping(value = {"/SeguroMedico"})
    public void prueba(HttpServletRequest httpRequest, HttpServletResponse httpServletResponse) throws IOException, BussinessException {
        Seguromedico seguroMedico = seguroMedicoDAO.get(1);
        String jsonUsuario = jsonTransformer.toJson(seguroMedico);

        httpServletResponse.getWriter().println(jsonUsuario);
    }
}
