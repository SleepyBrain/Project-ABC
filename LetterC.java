package com.tomal.abc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LetterC extends Activity {
	MediaPlayer sound_c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_letter_c);
		sound_c = MediaPlayer.create(LetterC.this, R.raw.english_alphabet_c);
		sound_c.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.letter_c, menu);
		return true;
	}

}
