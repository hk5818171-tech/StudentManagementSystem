import java.util.*;

class Student
{
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getCourse()
    {
        return course;
    }

	@Override
	public String toString()
	{
		return "ID: " + id +
			", Name: " + name +
			", Age: " + age +
			", Course: " + course;
	}
}

class StudentManagementSystem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new  ArrayList<>();

		//Print Menu

	int choice ;
	do
	{
	System.out.println("=== STUDENT MANAGEMENT SYSTEM=== ");
	System.out.println("1. Add Student ");
	System.out.println("2. View Student ");
	System.out.println("3. Search Student ");
	System.out.println("4. Update Student ");
	System.out.println("5. Delete Student ");
	System.out.println("6. Exit ");
	System.out.println("Enter Choice ");
	choice = sc.nextInt();
	 
	switch(choice)
	{
		case 1:
			System.out.println("Add Student");
			
			// Enter ID
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			//Enter Name
			System.out.println("Enter Name: ");
			String name = sc.nextLine();

			//Enter Age
			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			sc.nextLine();

			//Enter Course
			System.out.println("Enter Course: ");
			String course = sc.nextLine();

			// Object Creation
			Student newStudent = new Student(id, name, age, course);
			students.add(newStudent);
			System.out.println("Student Added Successfully!");
			break;

		case 2:
			System.out.println("View Student");

			for(Student stu : students)
			{
				System.out.println(stu);
			}
			break;

		case 3:
			System.out.println("Search Student");
			System.out.println("Enter student ID to Search: ");
			int searchId = sc.nextInt();

			boolean found = false;

			for(Student stu : students)
			{
				if(stu.getId() == searchId)
				{
					System.out.println("Student Found!");
					System.out.println(stu);
					found = true;
			
			break;
				}
			}
			
			if(!found)
			{
				System.out.println("Student Not Found!");
			}
			break;

		case 4:
			System.out.println("  Update Student ");

			System.out.println("Enter Student ID to Update: ");
			int updateId = sc.nextInt();
			sc.nextLine();

			boolean updated = false;
			for(Student stu : students)
			{
				if(stu.getId() == updateId)
				{
					System.out.print("Enter New Name: ");
					String newName = sc.nextLine();
					System.out.print("Enter New Age: ");
					int newAge = sc.nextInt();
					sc.nextLine();

					System.out.println("Enter New Course: ");
					String newCourse = sc.nextLine();

					stu.setName(newName);
					stu.setAge(newAge);
					stu.setCourse(newCourse);

					System.out.println("Student Updated Successfully!");
			updated = true;
			break;
			}
		}
		if(!updated)
		{
			System.out.println("Student Not Found!");
		}
		break;

		case 5:
			System.out.println("  Delete Student ");
			System.out.println("Enter Student ID to  Delete: ");
			int deleteId = sc.nextInt();
			
			boolean deleted = false;
			for(Student stu : students)
			{
				if(stu.getId() == deleteId)
				{
					students.remove(stu);

					System.out.println("Stuende Deleted Successfully!");
					deleted = true;
					break;
				}
			}

			if(!deleted)
			{
				System.out.println("Stuedent Not Found!");
			}
			break;
		 

		case 6:
			System.out.println("Thank You! ");
			break;

		default:
			System.out.println("Invalid choice");
	}
	}
	while(choice != 6);


	 }
}






