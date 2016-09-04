package com.tomal.abc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;

public class LetterA extends Activity {
	MediaPlayer sound_a;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_letter_a);
		sound_a = MediaPlayer.create(LetterA.this, R.raw.english_alphabet_a);
		sound_a.start();
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.letter_b, menu);
		return true;
	}

}
