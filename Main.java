import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Faculty member= new Faculty();
//        System.out.println(member.Print());
        member.Print();

    }
}
class Faculty{
    Scanner input=new Scanner(System.in);
    String name,fatherName,birthLocation,organizationalUnit,organizationalPostTitle,jobTitle,rank,serviceLocation,gender,age,experiences,workingTimes,salaryCalculated,occupationalClass;
    int internationalID,postNumber,organizationalPostUniqueID,organizationalUnitUniqueID,children,workTime,monthlySalaryBase=27440089,result,dailySalaryBase=885165;
    final int stableWorkTime = 8,coefficient403=4829;
    boolean isMale,hasWife;
    int[] birthday = new int[3];
    int[] workExperience=new int[3];
    String[] rankName={"preliminary","foundation","senior","excellent","connoisseur"};//مقدماتی، پایه، ارشد، عالی، خبره
    String[] occupationalClassName={"firstfloor","secondfloor","thirdfloor","forthfloor","fifthfloor","sixthfloor","seventhfloor","eighthfloor","ninthfloor","tenthfloor","eleventhfloor","twelfthfloor","thirteenthfloor","fourteenthfloor","fifteenthfloor","sixteenthfloor"};
    int[] firstFloorScore={2400/*مقدماتی*/,2650/*پایه*/};
    int[] secondFloorScore={2600/*مقدماتی*/,2850/*پایه*/};
    int[] thirdFloorScore={2800/*مقدماتی*/,3050/*پایه*/};
    int[] forthFloorScore={3000/*مقدماتی*/,3250/*پایه*/,3600/*ارشد*/,4050/*عالی*/,4600/*خبره*/};
    int[] fifthFloorScore={3200/*مقدماتی*/,3450/*پایه*/,3800/*ارشد*/,4250/*عالی*/,4800/*خبره*/};
    int[] sixthFloorScore={3400/*مقدماتی*/,3650/*پایه*/,4000/*ارشد*/,4450/*عالی*/,5000/*خبره*/};
    int[] seventhFloorScore={3600/*مقدماتی*/,3850/*پایه*/,4200/*ارشد*/,4650/*عالی*/,5200/*خبره*/};
    int[] eighthFloorScore={3800/*مقدماتی*/,4050/*پایه*/,4400/*ارشد*/,4850/*عالی*/,5400/*خبره*/};
    int[] ninthFloorScore={3600/*مقدماتی*/,3850/*پایه*/,4200/*ارشد*/,4650/*عالی*/,5200/*خبره*/};
    int[] tenthFloorScore={4200/*مقدماتی*/,4450/*پایه*/,4800/*ارشد*/,5250/*عالی*/,5800/*خبره*/};
    int[] eleventhFloorScore={4400/*مقدماتی*/,4650/*پایه*/,5000/*ارشد*/,5450/*عالی*/,6000/*خبره*/};
    int[] twelfthFloorScore={4600/*مقدماتی*/,4850/*پایه*/,5200/*ارشد*/,5650/*عالی*/,6200/*خبره*/};
    int[] thirteenthFloorScore={4800/*مقدماتی*/,5050/*پایه*/,5400/*ارشد*/,5850/*عالی*/,6400/*خبره*/};
    int[] fourteenthFloorScore={5000/*مقدماتی*/,5250/*پایه*/,5600/*ارشد*/,6050/*عالی*/,6600/*خبره*/};
    int[] fifteenthFloorScore={5200/*مقدماتی*/,5450/*پایه*/,5800/*ارشد*/,6250/*عالی*/,6800/*خبره*/};
    int[] sixteenthFloorScore={5400/*مقدماتی*/,5650/*پایه*/,6000/*ارشد*/,6450/*عالی*/,7000/*خبره*/};
    Faculty() {

        System.out.print("Your Name: ");
        name=input.next();
        System.out.print("Father Name: ");
        fatherName=input.next();
        System.out.print("Place of Birth: ");
        birthLocation=input.next();
        System.out.print("Gender: ");
        birthLocation=input.next();
        age();
        System.out.print("National ID Number: ");
        internationalID=input.nextInt();
        System.out.print("Organizational Post Title: ");//عنوان پست سازمانی
        organizationalPostTitle=input.next();
        System.out.print("Post Number: ");//شماره پست
        postNumber=input.nextInt();
        System.out.print("Organizational Post Unique ID: ");//شناسه یکتا پست سازمانی
        organizationalPostUniqueID=input.nextInt();
        System.out.print("Organizational Unit: ");//واحد سازمانی
        organizationalUnit=input.next();
        System.out.print("Organizational Unit Unique ID: ");//شناسه یکتا واحد سازمانی
        organizationalUnitUniqueID=input.nextInt();
        System.out.print("Job Title: ");//عنوان شغلی
        jobTitle=input.next();
        System.out.print("Occupational class: ");//طبقه شغلی
        occupationalClass=input.next();
        System.out.print("Job Rank: ");//رتبه شغلی
        rank=input.next();
        workExperiences();
        System.out.print("Service Location: ");//محل خدمت
        serviceLocation=input.next();
        System.out.print("Children Count: ");//تعداد فرزندان
        children= input.nextInt();
        calculateSalary();


    }
    void Print() {
        System.out.println("\nName :"+name);
        System.out.println("Fathers Name: "+fatherName);
        System.out.println("Place of Birth: "+birthLocation);
        System.out.println("birth Date: " + birthday[0] + "/" + birthday[1] + "/" + birthday[2]);
        System.out.println("National ID Number: "+internationalID);
        System.out.println("Organizational Post Title: "+organizationalPostTitle);//عنوان پست سازمانی
        System.out.println("Post Number: "+postNumber);//شماره پست
        System.out.println("Organizational Post Unique ID: "+organizationalPostUniqueID);//شناسه یکتا پست سازمانی
        System.out.println("Organizational Unit: "+organizationalUnit);//واحد سازمانی
        System.out.println("Organizational Unit Unique ID: "+organizationalUnitUniqueID);//شناسه یکتا واحد سازمانی
        System.out.println("Job Title: "+jobTitle);//عنوان شغلی
        System.out.println("Occupational class: "+occupationalClass);//طبقه شغلی
        System.out.println("Job Rank: "+rank);//رتبه شغلی
        System.out.println("Work Experiences: "+experiences);
        System.out.println("Service Location: "+serviceLocation);//محل خدمت
        System.out.println("Age: "+age);//سن فرد
        System.out.println("Children Count: "+children);//تعداد فرزندان
        System.out.println("Monthly Working Time: "+workTime);
//        System.out.println("Monthly Salary: "+result);
        System.out.println("Attention: We Doesn't Have Senior or Excellent or Connoisseur Rank in the 1th to 3rd Occupational Class;");
        System.out.println("Salary: "+ "\n"+ salaryCalculated);

    }

    void age() {

        System.out.print("Birthday year: ");
        birthday[0] = input.nextInt();
        System.out.print("Birthday month: ");
        birthday[1] = input.nextInt();
        System.out.print("Birthday day: ");
        birthday[2] = input.nextInt();

        LocalDate now = LocalDate.now();
        now = now.minusYears(birthday[0]);
        now = now.minusMonths(birthday[1]);
        now = now.minusDays(birthday[2]);
        age= now.getYear()+" Years , "+ now.getMonthValue()+ " Month and "+now.getDayOfMonth()+" Days";

    }
    void workExperiences()
    {
        System.out.print("Hiring Years: ");
        workExperience[0]=input.nextInt();
        System.out.print("Hiring Months: ");
        workExperience[1]=input.nextInt();
        System.out.print("Hiring Days: ");
        workExperience[2]=input.nextInt();

        LocalDate now = LocalDate.now();
        now = now.minusYears(workExperience[0]);
        now = now.minusMonths(workExperience[1]);
        now = now.minusDays(workExperience[2]);
        experiences= now.getYear()+ " Years , "+ now.getMonthValue()+ " Month and "+now.getDayOfMonth()+" Days";

    }
    void calculateSalary() {
        // if for 1st Occupational Class
        if (occupationalClass.equals(occupationalClassName[0])&&rank.equals(rankName[0])){
            result=firstFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+firstFloorScore[0]+ " Score in "+occupationalClassName[0]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[0])&&rank.equals(rankName[1])) {
            result=firstFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+firstFloorScore[1]+ " Score in "+occupationalClassName[0]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[0])&&rank.equals(rankName[2])) {
            result=0;
            salaryCalculated="We Doesn't Have This Rank in this Occupational Class";
        } else if (occupationalClass.equals(occupationalClassName[0])&&rank.equals(rankName[3])) {
            result=0;
            salaryCalculated="We Doesn't Have This Rank in this Occupational Class";
        } else if (occupationalClass.equals(occupationalClassName[0])&&rank.equals(rankName[4])) {
            result=0;
            salaryCalculated="We Doesn't Have This Rank in this Occupational Class";
        }
        // if for 2nd Occupational Class
        if (occupationalClass.equals(occupationalClassName[1])&&rank.equals(rankName[0])){
            result=secondFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+secondFloorScore[0]+ " Score in "+occupationalClassName[1]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[1])&&rank.equals(rankName[1])) {
            result=secondFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+secondFloorScore[1]+ " Score in "+occupationalClassName[1]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[1])&&rank.equals(rankName[2])) {
            result=secondFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+secondFloorScore[2]+ " Score in "+occupationalClassName[1]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[1])&&rank.equals(rankName[3])) {
            result=secondFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+secondFloorScore[3]+ " Score in "+occupationalClassName[1]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[1])&&rank.equals(rankName[4])) {
            result=secondFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+secondFloorScore[4]+ " Score in "+occupationalClassName[1]+" is: "+ result;
        }
        // if for 3rd Occupational Class
        if (occupationalClass.equals(occupationalClassName[2])&&rank.equals(rankName[0])){
            result=thirdFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+thirdFloorScore[0]+ " Score in "+occupationalClassName[2]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[2])&&rank.equals(rankName[1])) {
            result=thirdFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+thirdFloorScore[1]+ " Score in "+occupationalClassName[2]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[2])&&rank.equals(rankName[2])) {
            result=thirdFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+thirdFloorScore[2]+ " Score in "+occupationalClassName[2]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[2])&&rank.equals(rankName[3])) {
            result=thirdFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+thirdFloorScore[3]+ " Score in "+occupationalClassName[2]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[2])&&rank.equals(rankName[4])) {
            result=thirdFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+thirdFloorScore[4]+ " Score in "+occupationalClassName[2]+" is: "+ result;
        }
        // if for 4th Occupational Class
        if (occupationalClass.equals(occupationalClassName[3])&&rank.equals(rankName[0])){
            result=forthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+forthFloorScore[0]+ " Score in "+occupationalClassName[3]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[3])&&rank.equals(rankName[1])) {
            result=forthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+forthFloorScore[1]+ " Score in "+occupationalClassName[3]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[3])&&rank.equals(rankName[2])) {
            result=forthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+forthFloorScore[2]+ " Score in "+occupationalClassName[3]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[3])&&rank.equals(rankName[3])) {
            result=forthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+forthFloorScore[3]+ " Score in "+occupationalClassName[3]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[3])&&rank.equals(rankName[4])) {
            result=forthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+forthFloorScore[4]+ " Score in "+occupationalClassName[3]+" is: "+ result;
        }
        // if for 5th Occupational Class
        if (occupationalClass.equals(occupationalClassName[4])&&rank.equals(rankName[0])){
            result=fifthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+fifthFloorScore[0]+ " Score in "+occupationalClassName[4]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[4])&&rank.equals(rankName[1])) {
            result=fifthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+fifthFloorScore[1]+ " Score in "+occupationalClassName[4]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[4])&&rank.equals(rankName[2])) {
            result=fifthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+fifthFloorScore[2]+ " Score in "+occupationalClassName[4]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[4])&&rank.equals(rankName[3])) {
            result=fifthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+fifthFloorScore[3]+ " Score in "+occupationalClassName[4]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[4])&&rank.equals(rankName[4])) {
            result=fifthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+fifthFloorScore[4]+ " Score in "+occupationalClassName[4]+" is: "+ result;
        }
        // if for 6th Occupational Class
        if (occupationalClass.equals(occupationalClassName[5])&&rank.equals(rankName[0])){
            result=sixthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+sixthFloorScore[0]+ " Score in "+occupationalClassName[5]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[5])&&rank.equals(rankName[1])) {
            result=sixthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+sixthFloorScore[1]+ " Score in "+occupationalClassName[5]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[5])&&rank.equals(rankName[2])) {
            result=sixthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+sixthFloorScore[2]+ " Score in "+occupationalClassName[5]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[5])&&rank.equals(rankName[3])) {
            result=sixthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+sixthFloorScore[3]+ " Score in "+occupationalClassName[5]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[5])&&rank.equals(rankName[4])) {
            result=sixthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+sixthFloorScore[4]+ " Score in "+occupationalClassName[5]+" is: "+ result;
        }
        // if for 7th Occupational Class
        if (occupationalClass.equals(occupationalClassName[6])&&rank.equals(rankName[0])){
            result=seventhFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+seventhFloorScore[0]+ " Score in "+occupationalClassName[6]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[6])&&rank.equals(rankName[1])) {
            result=seventhFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+seventhFloorScore[1]+ " Score in "+occupationalClassName[6]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[6])&&rank.equals(rankName[2])) {
            result=seventhFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+seventhFloorScore[2]+ " Score in "+occupationalClassName[6]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[6])&&rank.equals(rankName[3])) {
            result=seventhFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+seventhFloorScore[3]+ " Score in "+occupationalClassName[6]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[6])&&rank.equals(rankName[4])) {
            result=seventhFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+seventhFloorScore[4]+ " Score in "+occupationalClassName[6]+" is: "+ result;
        }
        // if for 8th Occupational Class
        if (occupationalClass.equals(occupationalClassName[7])&&rank.equals(rankName[0])){
            result=eighthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+eighthFloorScore[0]+ " Score in "+occupationalClassName[7]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[7])&&rank.equals(rankName[1])) {
            result=eighthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+eighthFloorScore[1]+ " Score in "+occupationalClassName[7]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[7])&&rank.equals(rankName[2])) {
            result=eighthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+eighthFloorScore[2]+ " Score in "+occupationalClassName[7]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[7])&&rank.equals(rankName[3])) {
            result=eighthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+eighthFloorScore[3]+ " Score in "+occupationalClassName[7]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[7])&&rank.equals(rankName[4])) {
            result=eighthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+eighthFloorScore[4]+ " Score in "+occupationalClassName[7]+" is: "+ result;
        }
        // if for 9th Occupational Class
        if (occupationalClass.equals(occupationalClassName[8])&&rank.equals(rankName[0])){
            result=ninthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+ninthFloorScore[0]+ " Score in "+occupationalClassName[8]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[8])&&rank.equals(rankName[1])) {
            result=ninthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+ninthFloorScore[1]+ " Score in "+occupationalClassName[8]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[8])&&rank.equals(rankName[2])) {
            result=ninthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+ninthFloorScore[2]+ " Score in "+occupationalClassName[8]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[8])&&rank.equals(rankName[3])) {
            result=ninthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+ninthFloorScore[3]+ " Score in "+occupationalClassName[8]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[8])&&rank.equals(rankName[4])) {
            result=ninthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+ninthFloorScore[4]+ " Score in "+occupationalClassName[8]+" is: "+ result;
        }
        // if for 10th Occupational Class
        if (occupationalClass.equals(occupationalClassName[9])&&rank.equals(rankName[0])){
            result=tenthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+tenthFloorScore[0]+ " Score in "+occupationalClassName[9]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[9])&&rank.equals(rankName[1])) {
            result=tenthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+tenthFloorScore[1]+ " Score in "+occupationalClassName[9]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[9])&&rank.equals(rankName[2])) {
            result=tenthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+tenthFloorScore[2]+ " Score in "+occupationalClassName[9]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[9])&&rank.equals(rankName[3])) {
            result=tenthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+tenthFloorScore[3]+ " Score in "+occupationalClassName[9]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[9])&&rank.equals(rankName[4])) {
            result=tenthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+tenthFloorScore[4]+ " Score in "+occupationalClassName[9]+" is: "+ result;
        }
        // if for 11th Occupational Class
        if (occupationalClass.equals(occupationalClassName[10])&&rank.equals(rankName[0])){
            result=eleventhFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+eleventhFloorScore[0]+ " Score in "+occupationalClassName[10]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[10])&&rank.equals(rankName[1])) {
            result=eleventhFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+eleventhFloorScore[1]+ " Score in "+occupationalClassName[10]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[10])&&rank.equals(rankName[2])) {
            result=eleventhFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+eleventhFloorScore[2]+ " Score in "+occupationalClassName[10]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[10])&&rank.equals(rankName[3])) {
            result=eleventhFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+eleventhFloorScore[3]+ " Score in "+occupationalClassName[10]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[10])&&rank.equals(rankName[4])) {
            result=eleventhFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+eleventhFloorScore[4]+ " Score in "+occupationalClassName[10]+" is: "+ result;
        }
        // if for 12th Occupational Class
        if (occupationalClass.equals(occupationalClassName[11])&&rank.equals(rankName[0])){
            result=twelfthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+twelfthFloorScore[0]+ " Score in "+occupationalClassName[11]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[11])&&rank.equals(rankName[1])) {
            result=twelfthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+twelfthFloorScore[1]+ " Score in "+occupationalClassName[11]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[11])&&rank.equals(rankName[2])) {
            result=twelfthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+twelfthFloorScore[2]+ " Score in "+occupationalClassName[11]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[11])&&rank.equals(rankName[3])) {
            result=twelfthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+twelfthFloorScore[3]+ " Score in "+occupationalClassName[11]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[11])&&rank.equals(rankName[4])) {
            result=twelfthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+twelfthFloorScore[4]+ " Score in "+occupationalClassName[11]+" is: "+ result;
        }
        // if for 13th Occupational Class
        if (occupationalClass.equals(occupationalClassName[12])&&rank.equals(rankName[0])){
            result=thirteenthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+thirteenthFloorScore[0]+ " Score in "+occupationalClassName[12]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[12])&&rank.equals(rankName[1])) {
            result=thirteenthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+thirteenthFloorScore[1]+ " Score in "+occupationalClassName[12]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[12])&&rank.equals(rankName[2])) {
            result=thirteenthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+thirteenthFloorScore[2]+ " Score in "+occupationalClassName[12]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[12])&&rank.equals(rankName[3])) {
            result=thirteenthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+thirteenthFloorScore[3]+ " Score in "+occupationalClassName[12]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[12])&&rank.equals(rankName[4])) {
            result=thirteenthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+thirteenthFloorScore[4]+ " Score in "+occupationalClassName[12]+" is: "+ result;
        }
        // if for 14th Occupational Class
        if (occupationalClass.equals(occupationalClassName[13])&&rank.equals(rankName[0])){
            result=fourteenthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+fourteenthFloorScore[0]+ " Score in "+occupationalClassName[13]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[13])&&rank.equals(rankName[1])) {
            result=fourteenthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+fourteenthFloorScore[1]+ " Score in "+occupationalClassName[13]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[13])&&rank.equals(rankName[2])) {
            result=fourteenthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+fourteenthFloorScore[2]+ " Score in "+occupationalClassName[13]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[13])&&rank.equals(rankName[3])) {
            result=fourteenthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+fourteenthFloorScore[3]+ " Score in "+occupationalClassName[13]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[13])&&rank.equals(rankName[4])) {
            result=fourteenthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+fourteenthFloorScore[4]+ " Score in "+occupationalClassName[13]+" is: "+ result;
        }
        // if for 15th Occupational Class
        if (occupationalClass.equals(occupationalClassName[14])&&rank.equals(rankName[0])){
            result=fifteenthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+fifteenthFloorScore[0]+ " Score in "+occupationalClassName[14]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[14])&&rank.equals(rankName[1])) {
            result=fifteenthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+fifteenthFloorScore[1]+ " Score in "+occupationalClassName[14]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[14])&&rank.equals(rankName[2])) {
            result=fifteenthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+fifteenthFloorScore[2]+ " Score in "+occupationalClassName[14]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[14])&&rank.equals(rankName[3])) {
            result=fifteenthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+fifteenthFloorScore[3]+ " Score in "+occupationalClassName[14]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[14])&&rank.equals(rankName[4])) {
            result=fifteenthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+fifteenthFloorScore[4]+ " Score in "+occupationalClassName[14]+" is: "+ result;
        }
        // if for 16th Occupational Class
        if (occupationalClass.equals(occupationalClassName[15])&&rank.equals(rankName[0])){
            result=sixteenthFloorScore[0]*coefficient403;
            salaryCalculated="Your Salary With "+sixteenthFloorScore[0]+ " Score in "+occupationalClassName[15]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[15])&&rank.equals(rankName[1])) {
            result=sixteenthFloorScore[1]*coefficient403;
            salaryCalculated="Your Salary With "+sixteenthFloorScore[1]+ " Score in "+occupationalClassName[15]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[15])&&rank.equals(rankName[2])) {
            result=sixteenthFloorScore[2]*coefficient403;
            salaryCalculated="Your Salary With "+sixteenthFloorScore[2]+ " Score in "+occupationalClassName[15]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[15])&&rank.equals(rankName[3])) {
            result=sixteenthFloorScore[3]*coefficient403;
            salaryCalculated="Your Salary With "+sixteenthFloorScore[3]+ " Score in "+occupationalClassName[15]+" is: "+ result;
        } else if (occupationalClass.equals(occupationalClassName[15])&&rank.equals(rankName[4])) {
            result=sixteenthFloorScore[4]*coefficient403;
            salaryCalculated="Your Salary With "+sixteenthFloorScore[4]+ " Score in "+occupationalClassName[15]+" is: "+ result;
        }

    }

    public void setChildren(int childrencalculate) {
        this.children = childrencalculate;
    }

    public int getChildren() {

        return children+result;
    }
}



