package com.project.springboot_theater_management_system.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private double movieDuration;
	private String movieGenere;
	private String movieLanguage;
	private double movieRating;
	private String movieBudget;
	
	@OneToMany(cascade =  CascadeType.ALL)
	List<Audience> audience;
	
	@OneToMany(cascade =  CascadeType.ALL)
	List<Ticket> tickets;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(double movieDuration) {
		this.movieDuration = movieDuration;
	}

	public String getMovieGenere() {
		return movieGenere;
	}

	public void setMovieGenere(String movieGenere) {
		this.movieGenere = movieGenere;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieBudget() {
		return movieBudget;
	}

	public void setMovieBudget(String movieBudget) {
		this.movieBudget = movieBudget;
	}

	public List<Audience> getAudience() {
		return audience;
	}

	public void setAudience(List<Audience> audience) {
		this.audience = audience;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	

}
