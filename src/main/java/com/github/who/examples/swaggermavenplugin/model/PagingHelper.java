/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.who.examples.swaggermavenplugin.model;

import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author andrewbird
 */
public class PagingHelper {

    public PagingHelper() {}
    
    private String limit;
    private String offset;

    public String getLimit() {
        return limit;
    }

    @ApiParam(value="limit") 
    public void setLimit(@RequestParam(value = "limit") String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }
    
    @ApiParam(value="offset") 
    public void setOffset(@RequestParam(value = "offset") String offset) {
        this.offset = offset;
    }
    
    
}
