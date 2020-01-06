package com.bruhu.notekeeper

// we use val to make them assign-once-properties
// on one single line we declared the class, named it, defined parameters for any instance of the class, and assigned their properties
class CourseInfo(val courseId: String, val title: String) {

}

// course info might vary, so we make it a mutable variable
class NoteInfo(var course: CourseInfo,  var title: String)