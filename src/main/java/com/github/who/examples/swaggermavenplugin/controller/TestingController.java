package com.github.who.examples.swaggermavenplugin.controller;

import com.github.who.examples.swaggermavenplugin.model.PagingHelper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
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
