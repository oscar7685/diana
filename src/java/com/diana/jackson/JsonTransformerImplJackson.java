/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 *
 * @author Oscar
 */
public class JsonTransformerImplJackson implements JsonTransformer{
    @Override
    public String toJson(Object data) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
 
            return objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }
 
    @Override
    public Object fromJson(String json, Class clazz) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
 
            return objectMapper.readValue(json, clazz);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
