package interfaceassign.com.traning.quest1;

interface  Institute
{
    String [] showCourses();
}
public class StudentCourse implements Institute {

    @Override
    public String[] showCourses() {
            return new String[]{"Jenkins","Agile","Cloud","Spring"};
    }

}


