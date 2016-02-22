package com.tomal.abc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LetterS extends Activity {
	MediaPlayer sound_s;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_letter_s);
		sound_s = MediaPlayer.create(LetterS.this, R.raw.english_alphabet_s);
		sound_s.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.letter, menu);
		return true;
	}

}
