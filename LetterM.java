package com.tomal.abc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LetterM extends Activity {
	MediaPlayer sound_m;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_letter_m);
		sound_m = MediaPlayer.create(LetterM.this, R.raw.english_alphabet_m);
		sound_m.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.letter_m, menu);
		return true;
	}

}
