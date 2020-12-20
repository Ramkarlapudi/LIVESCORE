package com.livescoreapi.ram.controller;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livescoreapi.ram.model.MyArrayList;
import com.livescoreapi.ram.model.MyArrayListPlayersData;
import com.livescoreapi.ram.service.LiveScoreServiceImpl;

@RestController
@RequestMapping("/livescore")
public class LiveScoreController {
	private static final Logger LOGGER = LogManager.getLogger(LiveScoreController.class);

	@Autowired
	private LiveScoreServiceImpl liveScoreServiceImpl;

	@GetMapping(value = "/currentMatches", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getLiveMatches() throws IOException {
		// HttpResponse<JsonNode> res = liveScoreServiceImpl.getCurrentMatches();
		return liveScoreServiceImpl.getCurrentMatches();

	}

	@GetMapping(value = "/liveMatches", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MyArrayList> listofSeries() {
		return liveScoreServiceImpl.getcurrentLiveSeries();

	}

	@GetMapping(value = "/playersearch", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MyArrayListPlayersData> getPlayers() {
		LOGGER.info("  ********** Entering  getPlayers from Controller ********* ");
		return liveScoreServiceImpl.getPlayers();
	}

	@GetMapping(value = "/searchbyname/{playerName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MyArrayListPlayersData> searchPlayerByName(@PathVariable("playerName") String playerName) {
		LOGGER.info("  ********** Entering  searchPlayerByName from Controller ********* ");
		return liveScoreServiceImpl.getPlayerByName(playerName);

	}

}
