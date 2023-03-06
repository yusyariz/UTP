import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t\tWelcome to Math Tuition Centre");
        System.out.println("--------------------------------------------------");
        System.out.println("1.Add Marks For Students\n2.View Marks\n3.Find Student\n4.Calculate Average mark\n5.Calculate minimum mark\n6.Exit\n");
        int menu = 0;

        Teacher cikguminah = new Teacher();

        Student mike = new Student();
        Name name = new Name("Micheal","John","Adams");
        mike.setName(name);

        Student adila = new Student();
        name = new Name("Adila","binti","Izzat");
        adila.setName(name);


        Student imran = new Student();
        name = new Name("Syed","Imran","Syah");
        imran.setName(name);

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(mike);
        sb2023.add(adila);// sb2023.add(adila, 0);
        sb2023.add(imran);
        System.out.print("Enter menu option: ");
        menu = scanner.nextInt();
        do{
            if (menu == 1){
                char response = 'Y';
                do{
                    System.out.print("Who do you want to add marks for (M/m-mike, A/a-adila, I/i-imran): ");
                    char addMarkName = scanner.next().charAt(0);
                    if (addMarkName == 'M' || addMarkName == 'm'){
                        mike.addMark(mike);
                    }
                    if (addMarkName == 'A' || addMarkName == 'a'){
                        adila.addMark(adila);
                    }
                    if (addMarkName == 'I' || addMarkName == 'i'){
                        imran.addMark(imran);
                    }
                    System.out.print("Do you want to add mark for other person (Y-Yes and N-No): ");
                    response = scanner.next().charAt(0);
                }while(response == 'Y' || response == 'y');
            }
            else if (menu == 2){
                char viewInfo;
                System.out.print("Enter Y/y to view all details for every student: ");
                viewInfo = scanner.next().charAt(0);
                if (viewInfo == 'Y' || viewInfo == 'y'){
                    mike.displayMarks(mike);
                    adila.displayMarks(adila);
                    imran.displayMarks(imran);
                }
            }
            else if (menu == 3){
                //input name to find
                System.out.print("Enter name to find: ");
                String findName = scanner.next();
                // declare a method that allows for the following:
                boolean isIn = sb2023.find(findName);
                System.out.println("Find: "+isIn);
            }
            else if (menu == 4){
                // calculate and print the avg
                float mikeAvg = mike.calcAvg(mike);
                float adilaAvg = adila.calcAvg(adila);
                float imranAvg = imran.calcAvg(imran);
                System.out.println("Average Mark for Micheal: "+mikeAvg);
                System.out.println("Average Mark for Adila: "+adilaAvg);
                System.out.println("Average Mark for Syed: "+imranAvg);
            }
            else if (menu == 5){
                // calculate the min marks for students
                float mikeMin = mike.calcMin(mike);
                float adilaMin = adila.calcMin(adila);
                float imranMin = imran.calcMin(imran);
                System.out.println("Minimum Mark for Micheal: "+mikeMin);
                System.out.println("Minimum Mark for Adila: "+adilaMin);
                System.out.println("Minimum Mark for Syed: "+imranMin);
            }
            System.out.print("Enter menu option: ");
            menu = scanner.nextInt();

        }while(menu != 6);

    }
}