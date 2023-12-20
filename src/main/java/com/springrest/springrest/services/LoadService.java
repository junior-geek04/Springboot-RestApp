package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entities.Loads;

public interface LoadService {
public List<Loads> getLoads();

public Optional<Loads> getLoad(int loadId);
public Loads addLoad(Loads load);


public Loads updateLoad(int loadId,Loads load);

public List<Loads> deleteLoad(int loadId);
}
