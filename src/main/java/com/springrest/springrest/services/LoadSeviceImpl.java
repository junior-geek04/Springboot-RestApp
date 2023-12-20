 package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Loads;
import com.springrest.springrest.repository.LoadRepository;


@Service
public class LoadSeviceImpl implements LoadService {
private final LoadRepository loadRepository;


	public LoadSeviceImpl(LoadRepository loadRepository) {
	
	this.loadRepository = loadRepository;
}

	List<Loads>list;
//	 public LoadSeviceImpl() {
//		// TODO Auto-generated constructor stub
//		 list=new ArrayList<>();
//		 list.add(new Loads(1,"hello","dirty","fellow","working",1,2,"hard","in",new Date()));
//		 list.add(new Loads(2,"hello1","dirty1","fellow1","working1",3,4,"hard1","in1",new Date()));
//	}
	 
	@Override
	public List<Loads> getLoads(){
		return loadRepository.findAll();
		
	}

	@Override
	public Optional<Loads> getLoad(int loadId) {
		// TODO Auto-generated method stub
	
		
	return loadRepository.findById(loadId);
	}

	@Override
	public Loads addLoad(Loads load) {
		// TODO Auto-generated method stub
		
		return loadRepository.save(load);
	}
	
	
	@Override
	public Loads updateLoad(int loadId,Loads updatedLoad) {
		// TODO Auto-generated method stub
		
		  Optional<Loads> existingLoadOptional = loadRepository.findById(loadId);

		    if (existingLoadOptional.isPresent()) {
		        Loads existingLoad = existingLoadOptional.get();
		        existingLoad.setLoadingPoint(updatedLoad.getLoadingPoint());
		        existingLoad.setUnloadingPoint(updatedLoad.getUnloadingPoint());
		        existingLoad.setProductType(updatedLoad.getProductType());
		        existingLoad.setTruckType(updatedLoad.getTruckType());
		        existingLoad.setNoOfTrucks(updatedLoad.getNoOfTrucks());
		        existingLoad.setWeight(updatedLoad.getWeight());
		        existingLoad.setComment(updatedLoad.getComment());
		        existingLoad.setShipperId(updatedLoad.getShipperId());
		        existingLoad.setDate(updatedLoad.getDate());

		        return loadRepository.save(existingLoad);
		    } else {
		        return null; // or throw an exception, depending on your requirements
		    }
		
	}

	@Override
	public List<Loads> deleteLoad(int loadId) {
		// TODO Auto-generated method stub
		
		Optional<Loads> existingLoad = loadRepository.findById(loadId);
		
		if(existingLoad==null)
		{
			return null;
		}
		else {
			loadRepository.deleteById(loadId);
		
			return loadRepository.findAll();
		}
			

	}

}
