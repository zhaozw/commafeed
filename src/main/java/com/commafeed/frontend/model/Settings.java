package com.commafeed.frontend.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Settings implements Serializable {

	private String readingMode;

	public String getReadingMode() {
		return readingMode;
	}

	public void setReadingMode(String readingMode) {
		this.readingMode = readingMode;
	}

}
