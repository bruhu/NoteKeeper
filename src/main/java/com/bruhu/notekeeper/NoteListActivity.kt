package com.bruhu.notekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_note_list.*
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(toolbar)

        // code for launching our Activity to edit Notes will go here
        fab.setOnClickListener { view ->
            // create an intent to describe the activity we want
            val activityIntent = Intent(this, MainActivity::class.java)
            // start the activity method bamz
            startActivity(activityIntent)
        }
        // populate our list view - using built-in layout
        // the data we will use is our notes collection from our DataManager
        listNotes.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataManager.notes)
    }


}
