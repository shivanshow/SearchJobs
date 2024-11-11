package com.JobSearch.SearchForJobs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UrlTable")
public class UrlTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "urlId")
	private int urlId;
	
	@Column(name = "url")
	private String url;

	public UrlTable() {

	}

	public UrlTable(int urlId, String url) {
		this.urlId = urlId;
		this.url = url;
	}
	public int getUrlId() {
		return urlId;
	}

	public void setUrlId(int urlId) {
		this.urlId = urlId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

