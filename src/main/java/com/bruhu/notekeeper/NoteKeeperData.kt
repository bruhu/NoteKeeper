package com.bruhu.notekeeper

// DATA RELATED CLASSES

class CourseInfo(val courseId: String, val title: String)

// for every note the user creates, we will create an instance of this class - three properties
// course is a reference to an instance of the CourseInfo class (up here!)
class NoteInfo(var course: CourseInfo,  var title: String, var text: String)