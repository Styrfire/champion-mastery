package com.championMastery.service;

import com.fasterxml.jackson.annotation.JacksonInject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import riot.ChampionListResponse;

import javax.inject.Inject;

/*@Service
public class RiotService
{
	private static Logger logger = Logger.getLogger(RiotService.class);

	private RestTemplate restTemplate;

	@Inject
	public RiotService(RestTemplate restTemplate)
	{
		this.restTemplate = restTemplate;
	}

	public ChampionListResponse geTopChampions()
	{
		return new ChampionListResponse();
	}
}*/
