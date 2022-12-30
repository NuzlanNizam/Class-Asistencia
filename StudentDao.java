import androidx.room.vo.Dao;

@Dao
public abstract class StudentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void insertStudents(Student... students);

    @Update
    public abstract void updateStudents(Student... students);

    @Delete
    public abstract void deleteStudents(Student... students);

    public abstract void insert(Student student);
}
