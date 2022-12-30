import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Student_Details")
public class Student {
    @PrimaryKey(autoGenerate = true )
    public int registrationNumber;

    @ColumnInfo(name = "Student_Name" )
    public String studentName;

    @ColumnInfo(name = "Date_of_Birth" )
    public String dateOfBirth;

    @ColumnInfo(name = "Home_Address" )
    public String homeAddress;

    @ColumnInfo(name = "Guardian_Name" )
    public String guardianName;

    @ColumnInfo(name = "Guardian_Phone_Number" )
    public String guardianPhoneNumber;

    @ColumnInfo(name = "Email_Address" )
    public String email;

    @ColumnInfo(name = "Teacher_id" )
    public int teacherID;

}
