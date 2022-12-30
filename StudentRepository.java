public class StudentRepository {
    private StudentDao mStudentDao;

    StudentRepository(Application application){
        StudentRoomDatabase db = StudentRoomDatabase.getDatabase(application);
        mStudentDao = db.studentDao();
    }

    void insert(Student student){
        StudentRoomDatabase.databaseWriteExcutor.execute(() ->{
            mStudentDao.insert(student);
        });
    }
}
