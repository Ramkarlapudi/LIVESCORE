package com.livescoreapi.ram.model;

import java.util.Date;

public class map {

	public int upcomingMatchCount;
	public int inProgressMatchCount;
	public int completedMatchCount;

	public Venue venue;
	public boolean isMultiDay;
	public AwayTeam awayTeam;
	public Scores scores;
	public int currentInningId;
	public int winningTeamId;
	public String matchSummaryText;
	public Date endDateTime;
	public boolean isWomensMatch;
	public LiveStreams liveStreams;
	public boolean isLive;
	public Date startDateTime;
	public boolean isMatchDrawn;
	public Series series;
	public String currentMatchState;
	public String name;
	public HomeTeam homeTeam;
	public boolean isMatchAbandoned;
	public int id;
	public boolean removeMatch;
	public int matchTypeId;
	public boolean isGamedayEnabled;
	public String status;
	public Players players;
	public Players getPlayers() {
		return players;
	}

	public void setPlayers(Players players) {
		this.players = players;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public boolean isMultiDay() {
		return isMultiDay;
	}

	public void setMultiDay(boolean isMultiDay) {
		this.isMultiDay = isMultiDay;
	}

	public AwayTeam getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(AwayTeam awayTeam) {
		this.awayTeam = awayTeam;
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	public int getCurrentInningId() {
		return currentInningId;
	}

	public void setCurrentInningId(int currentInningId) {
		this.currentInningId = currentInningId;
	}

	public int getWinningTeamId() {
		return winningTeamId;
	}

	public void setWinningTeamId(int winningTeamId) {
		this.winningTeamId = winningTeamId;
	}

	public String getMatchSummaryText() {
		return matchSummaryText;
	}

	public void setMatchSummaryText(String matchSummaryText) {
		this.matchSummaryText = matchSummaryText;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public boolean isWomensMatch() {
		return isWomensMatch;
	}

	public void setWomensMatch(boolean isWomensMatch) {
		this.isWomensMatch = isWomensMatch;
	}

	public LiveStreams getLiveStreams() {
		return liveStreams;
	}

	public void setLiveStreams(LiveStreams liveStreams) {
		this.liveStreams = liveStreams;
	}

	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public boolean isMatchDrawn() {
		return isMatchDrawn;
	}

	public void setMatchDrawn(boolean isMatchDrawn) {
		this.isMatchDrawn = isMatchDrawn;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public String getCurrentMatchState() {
		return currentMatchState;
	}

	public void setCurrentMatchState(String currentMatchState) {
		this.currentMatchState = currentMatchState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HomeTeam getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(HomeTeam homeTeam) {
		this.homeTeam = homeTeam;
	}

	public boolean isMatchAbandoned() {
		return isMatchAbandoned;
	}

	public void setMatchAbandoned(boolean isMatchAbandoned) {
		this.isMatchAbandoned = isMatchAbandoned;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isRemoveMatch() {
		return removeMatch;
	}

	public void setRemoveMatch(boolean removeMatch) {
		this.removeMatch = removeMatch;
	}

	public int getMatchTypeId() {
		return matchTypeId;
	}

	public void setMatchTypeId(int matchTypeId) {
		this.matchTypeId = matchTypeId;
	}

	public boolean isGamedayEnabled() {
		return isGamedayEnabled;
	}

	public void setGamedayEnabled(boolean isGamedayEnabled) {
		this.isGamedayEnabled = isGamedayEnabled;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUpcomingMatchCount() {
		return upcomingMatchCount;
	}

	public void setUpcomingMatchCount(int upcomingMatchCount) {
		this.upcomingMatchCount = upcomingMatchCount;
	}

	public int getInProgressMatchCount() {
		return inProgressMatchCount;
	}

	public void setInProgressMatchCount(int inProgressMatchCount) {
		System.out.println("called");
		this.inProgressMatchCount = inProgressMatchCount;
	}

	public int getCompletedMatchCount() {
		return completedMatchCount;
	}

	public void setCompletedMatchCount(int completedMatchCount) {
		this.completedMatchCount = completedMatchCount;
	}

	@Override
	public String toString() {
		return "map [upcomingMatchCount=" + upcomingMatchCount + ", inProgressMatchCount=" + inProgressMatchCount
				+ ", completedMatchCount=" + completedMatchCount + ", venue=" + venue + ", isMultiDay=" + isMultiDay
				+ ", awayTeam=" + awayTeam + ", scores=" + scores + ", currentInningId=" + currentInningId
				+ ", winningTeamId=" + winningTeamId + ", matchSummaryText=" + matchSummaryText + ", endDateTime="
				+ endDateTime + ", isWomensMatch=" + isWomensMatch + ", liveStreams=" + liveStreams + ", isLive="
				+ isLive + ", startDateTime=" + startDateTime + ", isMatchDrawn=" + isMatchDrawn + ", series=" + series
				+ ", currentMatchState=" + currentMatchState + ", name=" + name + ", homeTeam=" + homeTeam
				+ ", isMatchAbandoned=" + isMatchAbandoned + ", id=" + id + ", removeMatch=" + removeMatch
				+ ", matchTypeId=" + matchTypeId + ", isGamedayEnabled=" + isGamedayEnabled + ", status=" + status
				+ ", players=" + players + "]";
	}

	
}
