package com.bruhu.notekeeper

// Kotlin class for Activity

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import android.widget.ArrayAdapter as ArrayAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView indicates which layout we want to be displayed by the activity, with the files it includes (eg content_main)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // populating spinner (with courses from our DataManager Class) using Adapter Class
        // new instance of DataManager
        val dm = DataManager()
        // instance of ArrayAdapter - generic type, we must specify with <>
        // three params: context, layout, and data we want to display
        val adapterCourses = ArrayAdapter<CourseInfo>(this, android.R.layout.simple_spinner_item, dm.courses.values.toList())
        // this method will specify the layout for the dropdown
        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // assign the adapter we created to the spinnerCourses adapter property
        spinnerCourses.adapter = adapterCourses
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
