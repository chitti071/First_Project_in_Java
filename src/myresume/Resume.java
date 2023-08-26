package myresume;
	public class Resume {
		  public static void main(String[] args) {
			  // header
			  String Header= "RESUME";// centre of page
		    // Personal Information
		    String name = "CHITTINEEDI JAGADEESH VENKATA PAVAN";
		    String address = "5-53,PUCHALANKA,BHIMALAPURAM,ACHANTA MANDAL,WEST GODAVARI ,ANDHRA PRADESH,INDIA";
		    String email = "cj.96662gmail.com";
		    String phone = "9666586792";

		    // Objective
		    String objective = "To obtain a challenging position in a reputable organization that utilizes my skills and abilities to contribute to the growth of the company.";

		    // Education
		    String education = "Bachelor of Technology, JNTUK University, EEE Branch,BVC College, Odalarevu";
            
             // Project
		    String Project=" I have done a project about Dual control method in AC-DC MicroGid";
		    
		    // Skills
		    String[] skills = {"Java", "Python", "C++", "HTML/CSS", "JavaScript"};
		    // certifications
		    String Certifications=" Progamming fundmantelas using Basic of Python";
		    // hobbies
		    String[] Hobbies= {"travelling with friends","Cooking Food"};

		    // Output Resume
		    System.out.println("Header:"+Header);
		    System.out.println("Name: " + name);
		    System.out.println("Address: " + address);
		    System.out.println("Email: " + email);
		    System.out.println("Phone: " + phone);
		    System.out.println("Objective: " + objective);
		    System.out.println("Education: " + education);
		    System.out.println("Project:"+Project);
		    System.out.println("Skills:");
		    System.out.println("Certificatiojns:"+Certifications);
		    System.out.println("Hobbies:"+Hobbies);
		    for (String skill : skills) {
		      System.out.println("- " + skill);
		    }
		  }
		}


