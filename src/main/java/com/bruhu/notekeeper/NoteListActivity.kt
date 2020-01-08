package com.bruhu.notekeeper

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(toolbar)

        // code for launching our Activity to edit Notes will go here
        fab.setOnClickListener { view ->
            // create an intent
            var activityIntent = Intent(this, MainActivity::class)
            // start the activity method
            startActivity()
        }
    }

}
