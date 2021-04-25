/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

/**
 *
 * @author Jude
 */
public class GPAClass {
    private String courseName;
    private Integer creditHours;
    private Double mark;
    
    GPAClass(String courseName,Integer creditHours,Double mark){
        this.courseName=courseName;
        this.creditHours  = creditHours;
        this.mark = mark;
        
    }
    public static String determineClass(double gpa){
       if(gpa<=1.49){
           return "Failed";
       }else if(gpa <=1.99){
           return "Passed";
       }else if(gpa <= 2.49){
           return "Third Class";
       }else if(gpa <=3.49){
           return "Second Class Lower";
       }else if(gpa <=4.49){
           return "Second Class Upper";
       }else if (gpa <= 5.0 && gpa >=4.5){
            return "First Class";
       }else{
           return "Not Found!!";
       }
    }
    
    public static double gradePointCal(double mark){
        if(mark <39 ){
            return  0;
        }else if(mark < 45){
            return 1.5;
        }else if (mark <50){
            return 2.0;
        }else if (mark <55){
            return 2.5;
        }else if (mark <60){
            return 3.0;
        }else if (mark <65){
            return 3.5;
        }else if (mark <70){
            return 4.0;
        }else if (mark <80){
            return 4.5;
        }else if (mark < 100){
            return 5.0;
        }
        return 0;
    }
    public static Double calGpa(int totalCreditHours,double tgp){
        double avg;
        try{
           avg  = tgp/totalCreditHours;
        }catch (Exception e){
            avg=0;
        }
        return avg;
    }  
    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the creditHours
     */
    public Integer getCreditHours() {
        return creditHours;
    }

    /**
     * @param creditHours the creditHours to set
     */
    public void setCreditHours(Integer creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * @return the mark
     */
    public Double getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(Double mark) {
        this.mark = mark;
    }
}
