import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.naming.Context;

@Database(entities = {Student.class}, version = 1, exportSchema = false)
public abstract class StudentRoomDatabase extends RoomDatabase {

    public abstract StudentDao studentDao();

    private static volatile StudentRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExcutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static StudentRoomDatabase getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (StudentRoomDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),StudentRoomDatabase.class, "student_database").build();

                }
            }
        }
        return INSTANCE;
    }
}
