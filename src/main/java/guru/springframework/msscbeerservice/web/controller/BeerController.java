/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author arvisdev
 */
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController
{
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId)
    {
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto)
    {
        return new ResponseEntity(HttpStatus.CREATED);
    }
    
    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto)
    {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
