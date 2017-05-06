package com.championMastery.web.controller;

import com.championMastery.exampleJson.JsonResponses;
import com.riot.api.RiotApi;
import com.riot.dto.Summoner.Summoner;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChampionMasteryController
{
	private RiotApi api = new RiotApi();

	@RequestMapping("/")
	public String helloWorld()
	{
		return "Hello world!";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/topFiveChampions/{summonerName}")
	public String topFiveChampions(@PathVariable String summonerName)
	{
		String returnString = summonerName;

		//return JsonResponses.TOP_FIVE_CHAMPIONS_RESPONSE;
		return "summonerName = " + returnString;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/topFiveChampionsTest/(summonerName)")
	public String topFiveChamnpionsTest(@PathVariable String summonerName)
	{
		Summoner summoner = api.getSummonerByName(summonerName);

		return "The summoner id = " + summoner.getId();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/selectedChampion/{championId}")
	public String selectedChampion(@PathVariable String championId)
	{
		String returnString = championId;
		// last 10 matches
		// grade
		return "Champion id = " + returnString;
	}
}
