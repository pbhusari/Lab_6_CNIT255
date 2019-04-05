public class GradStudent extends Student implements BirthDateCalculate{
    private String thesisTitle;
    private Name advisorName;

    public GradStudent(){
        super();
        this.thesisTitle = "UNKNOWN";
    }

    public GradStudent(String thesisTitle, Name advisorName) {
        this.thesisTitle = thesisTitle;
        this.advisorName = advisorName;
    }
}