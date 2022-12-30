public class StudentViewModel extends AndroidViewModel{
    private StudentRepository mRepository;

    public StudentViewModel (Application application){
        super(application);
        mRepository = new StudentRepository(application);

    }

    public void insert(Student student){
        mRepository.insert(student);
    }
}
