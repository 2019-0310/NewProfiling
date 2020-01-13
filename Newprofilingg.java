
package newprofiling;

import java.util.Scanner;

public class Newprofiling {

        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
             int p=1000; 
             int i = 0;
               
            String[] names = new String[p];
            String[] email = new String[p];
            String[] password = new String[p];
            String[] contact = new String[p];
            String[] age = new String[p];
            boolean profile=true;
           pro:
           while(profile){
               System.out.println("-----------------------------------------------------------------------------------------");
               System.out.println("Add your profile here");
               System.out.println("1. Yes I want");
               System.out.println("2. No I dont");
               int q=sc.nextInt();
               switch (q){
                   case 1: break;
                   
                   case 2: System.out.println("Ok. Thank you");
                       System.out.println("\n\n\n");
                       System.out.println("Are you sure you really want to exit?");
                       System.out.println("1. Yes");
                       System.out.println("2. No");
                       String yn=sc.next();
                       switch(yn){
                           case "1": continue pro;
                           
                           case "2": System.exit(0);
                       }

                   
               }
               
               

               boolean hex=true;
           int u=1;
            hex:
               while(hex){
            
         
           System.out.println("Enter profile # "+u);
                System.out.print("Enter Name: ");
                sc.nextLine();
                names [i]= sc.nextLine();
                System.out.print("Enter Email: ");
                email[i] = sc.nextLine();
                System.out.print("Enter Password: ");
                password[i] = sc.nextLine();
                System.out.print("Enter Age: ");
                age[i] = sc.nextLine();
                System.out.print("Enter contact number: ");
                contact[i]=sc.nextLine();
           
                i++;
                
           
            
                   System.out.println("\n\n");
                   System.out.println("Add another profile");
                   System.out.println("1. Yes I want");
                   System.out.println("2. No I dont");
                   String add=sc.next();
                   switch(add){
                       case "1":  
                                 u++;
                                 
                                
                         continue hex;
                       case "2": 
                           System.out.println("---------------------------------------------------------------------------------");
                         
                       break;
                       
                   }break;
               
               } System.out.println("\n\n");
               boolean gg=true;
               pislango:
               while(gg){
                   System.out.println("------------------------------------------------------------------------------------------");
               System.out.println("Is there anything you want to do?");
               System.out.println("1. Search profile.");
               System.out.println("2. Edit profile.");
               System.out.println("3. Add profile.");
               
               System.out.println("4. View all profiles.");
                   System.out.println("5.Exit.");
               int w=sc.nextInt();
               switch(w){
                   case 1: 
                       System.out.println("Enter the name you want to view");
                       sc.nextLine();
                       String www=sc.nextLine();
                       for(int qwe = 0 ;qwe< names.length;qwe++){
                         
                       if(www.equals (names[qwe])){
                          
                           while(www.equals(names[qwe])){
                               System.out.println("---------------------------------------------------------");
                           System.out.println("Name: "+names[qwe]);
                           System.out.println("Email: "+email[qwe]);
                           System.out.println("Age: "+age[qwe]);
                           System.out.println("Contact Number: "+ contact[qwe]);
                            System.out.println("---------------------------------------------------------");
                           qwe++;
                           }
                        continue pislango;
                           
                       
                       }
                        
                       
                   
                       }System.out.println("Profile not found!");
                       continue pislango;
                  
                   case 2:  int ggg=0;    
                   for(int z=1; z<=i; z++){
                System.out.println("Select " +ggg+" to edit profile "+z+". "+names [ggg]);
               ggg++;}
                   int yy=sc.nextInt();
                       
                                System.out.println("Name: "+names [yy]); 
                                System.out.println("Email: "+email [yy]);
                                System.out.println("Password: "+password [yy]);
                                System.out.println("Age: "+age [yy]);
                                System.out.println("Contact: " + contact[yy]);
                                System.out.println("---------------------------------------------------------------------------------");
                       System.out.println("\n");
                       System.out.println("Enter respective data for the chosen profile.");
                System.out.print("Enter Name: ");
                sc.nextLine();
                names [yy]= sc.nextLine();
                System.out.print("Enter Email: ");
                email[yy] = sc.nextLine();
                System.out.print("Enter Password: ");
                password[yy] = sc.nextLine();
                System.out.print("Enter Age: ");
                age[yy] = sc.nextLine();
                System.out.print("Enter contact number: ");
                
                contact[yy]=sc.nextLine();
                       System.out.println("You've succesfully edited this profile.");
                       continue;
                       
                   case 3:
                       true1:
                      while(true){
                      
                       u++;
                       
                System.out.println("Enter profile # "+u);
                System.out.print("Enter Name: ");
                sc.nextLine();
                names [i]= sc.nextLine();
                System.out.print("Enter Email: ");
                email[i] = sc.nextLine();
                System.out.print("Enter Password: ");
                password[i] = sc.nextLine();
                System.out.print("Enter Age: ");
                age[i] = sc.nextLine();
                System.out.print("Enter contact number: ");
                sc.nextLine();
                contact[i]=sc.nextLine();
                i++;
                 System.out.println("\n\n");
                   System.out.println("Add more?");
                   System.out.println("1. I would love to");
                   System.out.println("2. Not interested");
                   String add=sc.next();
                   switch(add){
                       case "1":  
                                 u++;
                                 
                        continue;
                       case "2": 
                           continue pislango;
                      
                       
                   }}
                   case 5:
                       System.out.println("We understand. Thank you");
                       System.out.println("\n\n\n");
                       System.out.println("Are you sure you really want to exit?");
                       System.out.println("1. Yes");
                       System.out.println("2. No");
                       String yyn=sc.next();
                       switch(yyn){
                           case "1": continue pro;
                           
                           case "2": System.exit(0);
                       
                   }
                   case 4: for(int qqq=0; qqq<u;qqq++){
                       System.out.println("-------------------------------------------------------------------");
                       System.out.println("Name: "+names[qqq]);
                       System.out.println("Email: "+email[qqq]);
                       System.out.println("Password: "+password[qqq]);
                       System.out.println("Age: "+age[qqq]);
                       System.out.println("Contact number: "+ contact[qqq]);
                       System.out.println("Profile not found!");
                       System.out.println("-------------------------------------------------------------------");
                  
                   }
               }
              
            

           }

















        }
           
        }   
           
    }



        
    

