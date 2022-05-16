import java.util.Scanner;

public class mStaff {
    int id;
    String name;
    int age;
    String address;

    //      constructor
    public mStaff(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;

    }

    // phương thức displayInformation
    void displayInformation() {
        System.out.println(id + " " + name + " " + age + " " + address);
    }

    public static void main(String args[]) {

        mStaff s1 = new mStaff(111, "Tu", 18, "Thai Binh");
        mStaff s2 = new mStaff(222, "Tuan", 20, "Ha Noi");

        s1.displayInformation();
        s2.displayInformation();
        //        setOBJ();
        int choice = 0;

        while (choice < 6) {
            System.out.println("===== Menu ======");
            System.out.println("| 1. Add");
            System.out.println("| 2. Edit");
            System.out.println("| 3. Delete");
            System.out.println("| 4. Show");
            System.out.println("| 5. Cancel");

            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
        }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    String staffList[] = new String[];

//}
            switch(choice)

    {
        case 1:
            System.out.println("Enter element");
            int element = scanner.nextInt();
            array = addElement(element);
            showArray();
            break;
    }
}
//                case 2:
//                    showArray();
//                    break;
//                case 3:
//
//                    System.out.println("enter index of element: ");
//                    int index = scanner.nextInt();
//
//                    System.out.println("Enter new element: ");
//                    int newElement = scanner.nextInt();
//                    editElement(index, newElement);
//                    break;
//                case 4:
//                    System.out.println("enter index: ");
//                    index = scanner.nextInt();
//                    array = deleteElementByIndex(index);
//                    break;
//                case 5:
//                    System.out.println("enter new element: ");
//                    newElement = scanner.nextInt();
//                    System.out.println("enter number: ");
//                    int number = scanner.nextInt();
//                    editElementByNumber(number, newElement);
//            }
//        }
//
//
//    static void setOBJ() {
//        array = new int[]{1, 2, 3, 5, 2, 8};
//    }



  
    
    public void add() {
        int id = (staffList.size() > 0) ? (staffList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        float gpa = inputGpa();
        Student student = new Student(id, name, age, address, gpa);
        staffList.add(student);
        studentDao.write(staffList);
    }
    
    public void edit(int id) {
        boolean isExisted = false;
        int size = staffList.size();
        for (int i = 0; i < size; i++) {
            if (staffList.get(i).getId() == id) {
                isExisted = true;
                staffList.get(i).setName(inputName());
                staffList.get(i).setAge(inputAge());
                staffList.get(i).setAddress(inputAddress());
                staffList.get(i).setGpa(inputGpa());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            studentDao.write(staffList);
        }
    }
    
    public void delete(int id) {
        Student student = null;
        int size = staffList.size();
        for (int i = 0; i < size; i++) {
            if (staffList.get(i).getId() == id) {
                student = staffList.get(i);
                break;
            }
        }
        if (student != null) {
            staffList.remove(student);
            studentDao.write(staffList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

//    /**
//     * sort student by name
//     */
    public void sortStudentByName() {
        Collections.sort(staffList, new SortStudentByName());
    }


//    /**
//     * show list student to screen
//     */
    public void show() {
        for (Student student : staffList) {
            System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%5d | ", student.getAge());
            System.out.format("%20s | ", student.getAddress());
         
        }
    }

//    /**
//     * input student id
//     *
//     * @return student id
//     */
    public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    /**
     * input student name
     *
     * @return student name
     */
    private String inputName() {
        System.out.print("Input student name: ");
        return scanner.nextLine();
    }

    /**
     * input student address
     *
     * @return student address
     */
    private String inputAddress() {
        System.out.print("Input student address: ");
        return scanner.nextLine();
    }

    /**
     * input student age
     *
     * @return student age
     */
    private byte inputAge() {
        System.out.print("Input student age: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    /**
     * input student gpa
     *
     * @return gpa
     */
    private float inputGpa() {
        System.out.print("Input student gpa: ");
        while (true) {
            try {
                float gpa = Float.parseFloat((scanner.nextLine()));
                if (gpa < 0.0 && gpa > 10.0) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student age again: ");
            }
        }
    }

    // getter && setter
    public List<Student> getstaffList() {
        return staffList;
    }

    public void setstaffList(List<Student> staffList) {
        this.staffList = staffList;
    }
}


