package com.bruhu.notekeeper

// this file kind is Class
// It won't need a constructor, but will require some properties for the collection of courses and for the collection of notes
object DataManager {
    // properties
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    // initializer block:
    init {
        // call initialize courses function, evey time an instance is created, this block will automatically run, aka populate a collection of courses
        // ! they accept no parameters, BUT can access the parameters of our constructor
        initializeCourses()
        // this method will populate our notes
        initializeNotes()
    }
    // code to initialize the class

    // this will be a private function, so it can't be called from anywhere else other than this class
    private fun initializeCourses() {
        // new instance of CourseInfo w/ two parameters, one for the ID, one for the title
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        // once we've created the instance, we can add the course to our courses' collection
        // with hashmap we can do that with the set method - this will allow us to later look at the course by passing a string with the value "android_intents"
        courses.set(course.courseId, course)

        // new courseinfo instance
        course =
            CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        // and another courseinfo instance assigned to a var
        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        // positional parameters
        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)

        // this function will initialize our course collection with four courses
        // this code will run whenever an instance of our DataManager class is created - we can do that with an initializer block ^^^^^^
    }

}