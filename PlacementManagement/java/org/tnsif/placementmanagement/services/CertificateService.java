package org.tnsif.placementmanagement.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.tnsif.placementmanagement.entities.Certificate;
import org.tnsif.placementmanagement.repository.CertificateRepository;
import jakarta.transaction.Transactional;

@Service

@Transactional

public class CertificateService {

             

              @Autowired

              private CertificateRepository repo;

              //addition/creation/insertion

                           public void add(Certificate cer)

                           {

                                 repo.save(cer);

                           }

                           //retrieve with specific id

                           public Certificate retrieve(Integer id)

                           {

                                 return repo.findById(id).get();

                           }

                           //delete

                           public void delete(Integer id)

                           {

                                 repo.deleteById(id);

                           }

                           public List<Certificate>retrieveAll()

                           {

                                 return repo.findAll();

                           }


              }
