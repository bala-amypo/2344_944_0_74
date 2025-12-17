public interface StudentService{
    StudentEntity postdata(StudentEntity stu);
    List<StudentEntity> getdata();
    StudentEntity updatedata(int id, StudentEntity std);
    String deletedata(int id);
}