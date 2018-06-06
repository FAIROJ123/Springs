package com.bridgeit.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Text {

	
	private Spellingcheck spellchecker;

	
	public Spellingcheck getSpellchecker() {
		return spellchecker;
	}

	@Autowired
	public void setSpellchecker(Spellingcheck spellchecker) {
		this.spellchecker = spellchecker;
	}
	public void spellCheck() {
	      spellchecker.checkSpelling();
	   }
	
}
