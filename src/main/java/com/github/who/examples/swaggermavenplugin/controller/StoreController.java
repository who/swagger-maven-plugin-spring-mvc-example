package com.github.who.examples.swaggermavenplugin.controller;


import com.github.who.examples.swaggermavenplugin.model.Order;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/store", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/store", description = "the store API")
public class StoreController {
  

  @ApiOperation(value = "Returns pet inventories by status", notes = "Returns a map of status codes to quantities", response = Integer.class, responseContainer = "map")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/inventory", 
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<Integer> getInventory()
      {
      // do some magic!
      return new ResponseEntity<Integer>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Place an order for a pet", notes = "", response = Order.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation"),
    @ApiResponse(code = 400, message = "Invalid Order") })
  @RequestMapping(value = "/order", 
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.POST)
  public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet"  ) Order body)
      {
      // do some magic!
      return new ResponseEntity<Order>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Find purchase order by ID", notes = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions", response = Order.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 404, message = "Order not found"),
    @ApiResponse(code = 200, message = "successful operation"),
    @ApiResponse(code = 400, message = "Invalid ID supplied") })
  @RequestMapping(value = "/order/{orderId}", 
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<Order> getOrderById(@ApiParam(value = "ID of pet that needs to be fetched",required=true ) @PathVariable("orderId") String orderId)
      {
      // do some magic!
      return new ResponseEntity<Order>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 404, message = "Order not found"),
    @ApiResponse(code = 400, message = "Invalid ID supplied") })
  @RequestMapping(value = "/order/{orderId}", 
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.DELETE)
  public ResponseEntity<Void> deleteOrder(@ApiParam(value = "ID of the order that needs to be deleted",required=true ) @PathVariable("orderId") String orderId)
      {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

  
}
