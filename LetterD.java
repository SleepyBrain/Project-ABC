package com.tomal.abc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LetterD extends Activity {
	MediaPlayer sound_d;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_letter_d);
		sound_d = MediaPlayer.create(LetterD.this, R.raw.english_alphabet_d);
		sound_d.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.letter_d, menu);
		return true;
	}

}
