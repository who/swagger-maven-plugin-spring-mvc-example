package com.github.who.examples.swaggermavenplugin.controller;

import com.github.who.examples.swaggermavenplugin.model.PagingHelper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.ModelAttribute;


@RestController
@RequestMapping(value = "/v1")
@Api(value="TestingController")
public class TestingController {

    @RequestMapping(value = "/pets", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value="Get paginated pets")
    public Object getPaginatedPets(PagingHelper pagingHelper) {
        // TODO: return the paginated pets
        return null;
    }
    
}
