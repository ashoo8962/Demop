package interfaceassign.com.traning.quest1;

public class EmployeeCourses implements Institute{


    @Override
    public String[] showCourses() {
        return new String[]{"Python ","Java","Angular","Spring"};
    }
}
