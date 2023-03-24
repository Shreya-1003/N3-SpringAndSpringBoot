package org.tnsif.placementmanagement.controller;

 

import java.util.List;

import java.util.NoSuchElementException;

 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.tnsif.placementmanagement.entities.Certificate;

import org.tnsif.placementmanagement.services.CertificateService;

 

public class CertificateController {

              @Autowired

              private CertificateService service;

              //Restful

              @GetMapping("/Certificates")

              public List<Certificate>listAll()

              {

                    return service.retrieveAll();

              }

              //retrieve with specific id

              @GetMapping("/Certificates/{id}")

              public ResponseEntity<Certificate>get(@PathVariable Integer id)

              {

                           try

                           {

                                         Certificate cer=service.retrieve(id);

                                         return new ResponseEntity<Certificate>(cer,HttpStatus.OK);

                           }

                           catch(NoSuchElementException e)

                           {

                                         return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);

                           }

              }

              @DeleteMapping("/Certificates/{id}")

              public void remove(@PathVariable Integer id)

              {

                           service.delete(id);

              }

              //to insert data

              @PostMapping("/Certificates")

              public void insert(@RequestBody Certificate cer)

              {

                           service.add(cer);

              }

              //update the data

              @PutMapping("/Certificates/{id}")

              public ResponseEntity<?>update(@RequestBody Certificate cer,@PathVariable Integer id)

              {

                           try {

                           @SuppressWarnings("unused")

                           Certificate c1=service.retrieve(id);

                           service.add(cer);

                           return new ResponseEntity<>(HttpStatus.OK);

                           }

                           catch(NoSuchElementException e)

                           {

                                         return new ResponseEntity<>(HttpStatus.NOT_FOUND);

                           }

                          

              }

}