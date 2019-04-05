public class GradStudent extends Student implements BirthDateCalculate{
    private String thesisTitle;
    private Name advisorName;

    public GradStudent(){
        super();
        this.thesisTitle = "UNKNOWN";
        this.advisorName = new Name();
    }

    public GradStudent(String thesisTitle, Name advisorName) {
        this.thesisTitle = thesisTitle;
        this.advisorName = advisorName;
    }

    /**
     * @return the thesisTitle
     */
    public String getThesisTitle() {
        return thesisTitle;
    }

    /**
     * @param thesisTitle the thesisTitle to set
     */
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    /**
     * @return the advisorName
     */
    public Name getAdvisorName() {
        return advisorName;
    }

    /**
     * @param advisorName the advisorName to set
     */
    public void setAdvisorName(Name advisorName) {
        this.advisorName = advisorName;
    }
    
    
}