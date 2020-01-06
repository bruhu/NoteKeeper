package com.bruhu.notekeeper

// DATA RELATED CLASSES

class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
        // we need a String representation for our info to be displayed, and here we deconstruct what we need to be displayed - works!
        return title
    }
}

// for every note the user creates, we will create an instance of this class - 3 properties
// course is a reference to an instance of the CourseInfo class (up here!)
class NoteInfo(var course: CourseInfo,  var title: String, var text: String)

