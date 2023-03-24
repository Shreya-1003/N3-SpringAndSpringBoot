package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Placement;
import org.tnsif.placementmanagement.repository.PlacementRepository;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {

@Autowired
private PlacementRepository repo1;

public  void add(Placement placement)
{
repo1.save(placement);
}
public Placement retrive(Integer id)
{
return repo1.findById(id).get();
}
public List<Placement>retriveAll()
{
return repo1.findAll();
}

}