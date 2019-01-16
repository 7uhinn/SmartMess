abstract class Person{
    protected String name;
    protected String ID;
    protected boolean international; //True means international
    protected boolean hosteler; //True means hosteler
    protected String department;

    public Person(String name,String ID,boolean international,boolean hosteler,String department){
        this.name = name;
        this.ID = ID;
        this.international = international;
        this.hosteler = hosteler;
        this.department = department;
    }
}

class Student extends Person{
    protected int studyingYear;
    protected String email;

    public Student(String name,String ID,boolean international,boolean hosteler,int studyingYear,String department,String email){
        super(name,ID,international,hosteler,department);
        this.studyingYear = studyingYear;
        this.email = email;
    }
}

class Faculty extends Person{
    protected int joiningYear;
    protected String email;
    protected int salary;

    public Faculty(String name,String ID,boolean international,boolean hosteler,int joiningYear,String department,String email,int salary){
        super(name,ID,international,hosteler,department);
        this.joiningYear = joiningYear;
        this.email = email;
        this.salary = salary;
    }
}

class Staff extends Person{
    protected int joiningYear;
    protected int salary;

    public Staff(String name,String ID,boolean international,boolean hosteler,int joiningYear,String department,int salary){
        super(name,ID,international,hosteler,department);
        this.joiningYear = joiningYear;
        this.salary = salary;
    }
}

class FeeDetails extends Student{
    protected boolean transportFeesPaid;
    protected boolean tuitionFeesPaid;
    protected boolean messFeesPaid;

    public FeeDetails(String name,String ID,boolean international,boolean hosteler,int studyingYear,String department,String email,boolean transportFeesPaid,boolean tuitionFeesPaid,boolean messFeesPaid){
        super(name,ID,international,hosteler,studyingYear,department,email);
        this.transportFeesPaid = transportFeesPaid;
        this.tuitionFeesPaid = tuitionFeesPaid;
        this.messFeesPaid = messFeesPaid;
    }
}

class Calendar{
    protected int year; //2017/2018/2019
    protected int semester; //fall:0 and spring:1
    protected int month;
    protected int date;
    protected boolean holiday; //True if a holiday

    public Calendar(int year, int semester,int month,int date,boolean holiday){
        this.year = year;
        this.semester = semester;
        this.month = month;
        this.date = date;
        this.holiday = holiday;
    }
}

class DateTime extends Calendar{
    protected int weekDay; //days of the week indexed as mon:0 to sun:6
    protected int meal; //meals of the day indexed as breakfast:0 to dinner:3
    protected float price; //price of each meal

    public DateTime(int year, int semester,int month,int date,boolean holiday,int weekDay,int meal, int price){
        super(year,semester,month,date,holiday);
        this.weekDay = weekDay;
        this.meal = meal;
        this.price = price;
    }
}

class RFID extends DateTime{
    protected boolean used; //if rfid was registered then true else false
    
    public RFID(int year, int semester,int month,int date,boolean holiday,int weekDay,int meal, int price,boolean used){
        super(year,semester,month,date,holiday,weekDay,meal,price);
        this.used = used;
    }

    class StudentToken extends Student{
        public StudentToken(String name,String ID,boolean international,boolean hosteler,int studyingYear,String department,String email,boolean used){
            super(name,ID,international,hosteler,studyingYear,department,email);
            RFID.this.used = used;
        }

        public void display(){
            System.out.println("Name : "+name);
            System.out.println("Type : Student");
            System.out.println("Month : "+month);
            System.out.println("Date : "+date);
            
            if (weekDay==0)
                System.out.println("Day : Monday");

            if (weekDay==1)
                System.out.println("Day : Tuesday");

            if (weekDay==2)
                System.out.println("Day : Wednesday");
                
            if (weekDay==3)
                System.out.println("Day : Thursday");

            if (weekDay==4)
                System.out.println("Day : Friday");

            if (weekDay==5)
                System.out.println("Day : Saturday");

            if (weekDay==6)
                System.out.println("Day : Sunday");
            
            if (meal==0)
                System.out.println("Meal : Breakfast");
                
            if (meal==1)
                System.out.println("Meal : Lunch");

            if (meal==2)
                System.out.println("Meal : Snacks");

            if (meal==3)
                System.out.println("Meal : Dinner");

            System.out.println("\n");
        }
    }

    class FacultyToken extends Faculty{
        public FacultyToken(String name,String ID,boolean international,boolean hosteler,int joiningYear,String department,String email,int salary,boolean used){
            super(name,ID,international,hosteler,joiningYear,department,email,salary);
            RFID.this.used = used;
        }

        public void display(){
            System.out.println("Name : "+name);
            System.out.println("Type : Faculty");
            System.out.println("Month : "+month);
            System.out.println("Date : "+date);
            
            if (weekDay==0)
                System.out.println("Day : Monday");

            if (weekDay==1)
                System.out.println("Day : Tuesday");

            if (weekDay==2)
                System.out.println("Day : Wednesday");
                
            if (weekDay==3)
                System.out.println("Day : Thursday");

            if (weekDay==4)
                System.out.println("Day : Friday");

            if (weekDay==5)
                System.out.println("Day : Saturday");

            if (weekDay==6)
                System.out.println("Day : Sunday");
            
            if (meal==0)
                System.out.println("Meal : Breakfast");
                
            if (meal==1)
                System.out.println("Meal : Lunch");

            if (meal==2)
                System.out.println("Meal : Snacks");

            if (meal==3)
                System.out.println("Meal : Dinner");

            System.out.println("\n");
        }
    }

    class StaffToken extends Staff{
        public StaffToken(String name,String ID,boolean international,boolean hosteler,int joiningYear,String department,int salary,boolean used){
            super(name,ID,international,hosteler,joiningYear,department,salary);
            RFID.this.used = used;
        }

        public void display(){
            System.out.println("Name : "+name);
            System.out.println("Type : Staff");
            System.out.println("Month : "+month);
            System.out.println("Date : "+date);
            
            if (weekDay==0)
                System.out.println("Day : Monday");

            if (weekDay==1)
                System.out.println("Day : Tuesday");

            if (weekDay==2)
                System.out.println("Day : Wednesday");
                
            if (weekDay==3)
                System.out.println("Day : Thursday");

            if (weekDay==4)
                System.out.println("Day : Friday");

            if (weekDay==5)
                System.out.println("Day : Saturday");

            if (weekDay==6)
                System.out.println("Day : Sunday");
            
            if (meal==0)
                System.out.println("Meal : Breakfast");
                
            if (meal==1)
                System.out.println("Meal : Lunch");

            if (meal==2)
                System.out.println("Meal : Snacks");

            if (meal==3)
                System.out.println("Meal : Dinner");
                
            System.out.println("\n");
        }   
    }
}

class FoodItems{
    protected String item;
    protected double kgCooked;
    protected double kgLeft;

    public FoodItems(String item, double kgCooked, double kgLeft){
        this.item = item;
        this.kgCooked = kgCooked;
        this.kgLeft = kgLeft;

    }

    public void display(){
        System.out.println("Item: "+item);
        System.out.println("kgs Cooked: "+kgCooked);
        System.out.println("kgs Left: "+kgLeft);
        System.out.println("\n");
    }
}

class FoodDifference extends FoodItems{

    public FoodDifference(String item,double kgCooked,double kgLeft){
        super(item,kgCooked,kgLeft);
    }

    public void display(){
        double difference;
        difference = (kgCooked - kgLeft);
        System.out.println("The amount of "+item+" left: "+difference+" kgs");
        System.out.println("\n");
    }
}

class FoodAnalysis extends RFID{
    public FoodAnalysis(int year, int semester,int month,int date,boolean holiday,int weekDay,int meal,int price,boolean used){
        super(year,semester,month,date,holiday,weekDay,meal,price,used);
    }

    public int FoodConsumption(){
        if (meal==0 && used==true){ //on weekDay = 1 at breakfast only countB will increment till a final value everything else will be 0
            return 1;
        }
    
        if (meal==1 && used==true){
            return 2;
        }

        if (meal==2 && used==true){
            return 3;
        }

        if (meal==3 && used==true){
            return 4;
        }

        return 0;
    }    
}

public class Project{
    public static void main(String[] args){
        int countB = 0;
        int countL = 0;
        int countS = 0;
        int countD = 0;
        int foodanalysisvalue;
        
        RFID rfid = new RFID(2017, 2,1,16,true,1,1, 75,true);
        RFID.StudentToken studenttoken = rfid.new StudentToken("Tuhin Sarkar","AP17110010068",false,true,2017,"CSE","tuhin_sarkar@srmap.edu.in",true);
        RFID.FacultyToken facultytoken = rfid.new FacultyToken("Vadivel Ayyaswamy","AP17XYZ01010",false,true,2017,"CSE","vadivel.a@srmap.edu.in",500000,true);
        RFID.StaffToken stafftoken = rfid.new StaffToken("Uday","APXYZ12345",false,true,2017,"CSE",50000,true);
        studenttoken.display();
        facultytoken.display();
        stafftoken.display();
        
        FoodItems fooditem = new FoodItems("Rice",11.10,3.20);
        fooditem.display();

        FoodDifference fooddifference = new FoodDifference("Rice",11.10,3.20);
        fooddifference.display();

        FoodAnalysis foodanalysis = new FoodAnalysis(2017,2,1,16,false,3,2,75,true);

        foodanalysisvalue = foodanalysis.FoodConsumption();
        
        if (foodanalysisvalue == 1)
            countB++;

        if (foodanalysisvalue == 2)
            countL++;

        if (foodanalysisvalue == 3)
            countS++;
            
        if (foodanalysisvalue == 4)
            countD++;

        System.out.println("The number of breakfasts eaten: "+countB);
        System.out.println("The number of lunches eaten: "+countL);
        System.out.println("The number of snacks eaten: "+countS);
        System.out.println("The number of dinners eaten: "+countD);
    } 
}
