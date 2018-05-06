package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.TiersRepository;
import com.GesHospit.entites.Tiers;
@Service
public class TiersMetireImpl implements ITiersMeteir {
@Autowired
private TiersRepository  tiersRepository;
	@Override
	public Tiers saveTiers(Tiers tiers) {
		// TODO Auto-generated method stub
		return tiersRepository.save(tiers);
	}

	@Override
	public List<Tiers> listTiers() {
		// TODO Auto-generated method stub
		return tiersRepository.findAll();
	}

}
