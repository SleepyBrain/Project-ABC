package com.tomal.abc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LetterL extends Activity {
	MediaPlayer sound_l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_letter_l);
		sound_l = MediaPlayer.create(LetterL.this, R.raw.english_alphabet_l);
		sound_l.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.letter_l, menu);
		return true;
	}

}
