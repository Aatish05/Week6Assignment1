

object StudentList{

    var lstStudents = ArrayList<Student>()
    fun addStudents(student:Student){
        lstStudents.add(student)
    }
    fun fetchStudent(): ArrayList<Student> {
        return lstStudents
    }
}

