package com.everis.vcalvoma.domain;

import java.io.Serializable;

public class Saludo implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private final String content;

    public Saludo(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}