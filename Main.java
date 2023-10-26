import java.util.Scanner;

    public class Main {
        public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in); // Scanner Object to Get input
        Mobile mobiles[] = new Mobile[20]; // Array of Mobile Reffrances
        int nom = -1; // Track Record of Availabe Mobile Record
        
        while(true)
          {
          System.out.println("Press 1 for Store Data of New Mobile = ");
          System.out.println("Press 2 for Show All Mobile Record = ");
          System.out.println("Press 3 for Search Mobile Data By Company Name = ");
          System.out.println("Press 4 for Search Mobile Data By Price Range = ");
          System.out.println("Press 5 for Search Mobile Data By type = ");
          System.out.println("Press 6 for Search Mobile Data By ram Range = ");
          System.out.println("Press 7 for Search Mobile Data By internalMemory Range = ");
          System.out.println("Press 8 for Exit = ");
          int ch = sc.nextInt(); // 1
          System.out.print("\033[H\033[2J");
          System.out.flush();
          switch(ch)
            {
            case 1:
            if(nom < mobiles.length-1)
              {
              mobiles[++nom] = new Mobile();
              sc.nextLine();
              System.out.print("Enter the Company Of Mobile = ");
              mobiles[nom].company = sc.nextLine();
              System.out.print("Enter the Price Of Mobile = ");
              mobiles[nom].price = sc.nextInt();
              sc.nextLine();
              System.out.print("Enter the Type Of Mobile = ");
              mobiles[nom].type = sc.nextLine();
              System.out.print("Enter the Model Number Of Mobile = ");
              mobiles[nom].modelNo = sc.nextLine();
              System.out.print("Enter the Operating System Of Mobile = ");
              mobiles[nom].operatingSystem = sc.nextLine();
              System.out.print("Enter the Screen Size Of Mobile = ");
              mobiles[nom].screenSize = sc.nextFloat();
              System.out.print("Enter the RAM Of Mobile = ");
              mobiles[nom].ram = sc.nextFloat();
              System.out.print("Enter the Internal Memory Of Mobile = ");
              mobiles[nom].internalMemory = sc.nextInt();
              System.out.print("Enter the External Memory Of Mobile = ");
              mobiles[nom].externalMemory = sc.nextInt();
    
              System.out.println("Data Stored Sucessfully ....!");
              }
            else
              {
              System.out.println("No Space Availabe to Store New Record");
              }  
            break;
    
            case 2:
            if(nom == -1)
              {
              System.out.println("No Record Found ....!");  
              }
            else
              {
              for(int i=0;i<=nom;i++)
                {
                System.out.println("---------------------------------------------------------"); 
                System.out.println("Company                   = "+mobiles[i].company);
                System.out.println("Price                     = "+mobiles[i].price);
                System.out.println("Type                      = "+mobiles[i].type);    
                System.out.println("Model Number              = "+mobiles[i].modelNo);
                System.out.println("Operating System          = "+mobiles[i].operatingSystem);
                System.out.println("Screen Size               = "+mobiles[i].screenSize);
                System.out.println("RAM                       = "+mobiles[i].ram);
                System.out.println("Internal Memory           = "+mobiles[i].internalMemory);
                System.out.println("External Memory           = "+mobiles[i].externalMemory);
                System.out.println("---------------------------------------------------------");    
                }  
              } 
            break;
            
            case 3:
            sc.nextLine();
            System.out.print("Enter the Name of Company = ");
            String company = sc.nextLine(); // Samsung
            if(nom == -1)
              {
              System.out.println("No Record Found ....!");  
              }
            else
              {
              for(int i=0;i<=nom;i++)
                {
                if(mobiles[i].company.equals(company))  
                  {
                  System.out.println("---------------------------------------------------------");  
                  System.out.println("Company                   = "+mobiles[i].company);
                  System.out.println("Price                     = "+mobiles[i].price);
                  System.out.println("Type                      = "+mobiles[i].type);    
                  System.out.println("Model Number              = "+mobiles[i].modelNo);
                  System.out.println("Operating System          = "+mobiles[i].operatingSystem);
                  System.out.println("Screen Size               = "+mobiles[i].screenSize);
                  System.out.println("RAM                       = "+mobiles[i].ram);
                  System.out.println("Internal Memory           = "+mobiles[i].internalMemory);
                  System.out.println("External Memory           = "+mobiles[i].externalMemory);
                  System.out.println("---------------------------------------------------------");
                  }    
                }  
              } 
            break;
       
            case 4:
            System.out.print("Entert the Minimum Price = ");
            int min = sc.nextInt();
            System.out.print("Entert the Maximum Price = ");
            int max = sc.nextInt();
            if(nom == -1)
              {
              System.out.println("No Record Found ....!");  
              }
            else
              {
              for(int i=0;i<=nom;i++)
                {
                if(mobiles[i].price>=min && mobiles[i].price<=max)  
                  {
                  System.out.println("---------------------------------------------------------");  
                  System.out.println("Company                   = "+mobiles[i].company);
                  System.out.println("Price                     = "+mobiles[i].price);
                  System.out.println("Type                      = "+mobiles[i].type);    
                  System.out.println("Model Number              = "+mobiles[i].modelNo);
                  System.out.println("Operating System          = "+mobiles[i].operatingSystem);
                  System.out.println("Screen Size               = "+mobiles[i].screenSize);
                  System.out.println("RAM                       = "+mobiles[i].ram);
                  System.out.println("Internal Memory           = "+mobiles[i].internalMemory);
                  System.out.println("External Memory           = "+mobiles[i].externalMemory);
                  System.out.println("---------------------------------------------------------");
                  }    
                }  
              } 
    
            break;

            case 5:
            sc.nextLine();
            System.out.print("Enter the type of mobile = ");
            String type = sc.nextLine(); // Samsung
            if(nom == -1)
              {
              System.out.println("No Record Found ....!");  
              }
            else
              {
              for(int i=0;i<=nom;i++)
                {
                if(mobiles[i].type.equals(type))  
                  {
                  System.out.println("---------------------------------------------------------");  
                  System.out.println("Company                   = "+mobiles[i].company);
                  System.out.println("Price                     = "+mobiles[i].price);
                  System.out.println("Type                      = "+mobiles[i].type);    
                  System.out.println("Model Number              = "+mobiles[i].modelNo);
                  System.out.println("Operating System          = "+mobiles[i].operatingSystem);
                  System.out.println("Screen Size               = "+mobiles[i].screenSize);
                  System.out.println("RAM                       = "+mobiles[i].ram);
                  System.out.println("Internal Memory           = "+mobiles[i].internalMemory);
                  System.out.println("External Memory           = "+mobiles[i].externalMemory);
                  System.out.println("---------------------------------------------------------");
                  }    
                }  
              } 
            break; 
            
            case 6:
            System.out.print("Entert the Minimum ram = ");
            int minm = sc.nextInt();
            System.out.print("Entert the Maximum ram = ");
            int maxm = sc.nextInt();
            if(nom == -1)
              {
              System.out.println("No Record Found ....!");  
              }
            else
              {
              for(int i=0;i<=nom;i++)
                {
                if(mobiles[i].ram>=minm && mobiles[i].ram<=maxm)  
                  {
                  System.out.println("---------------------------------------------------------");  
                  System.out.println("Company                   = "+mobiles[i].company);
                  System.out.println("Price                     = "+mobiles[i].price);
                  System.out.println("Type                      = "+mobiles[i].type);    
                  System.out.println("Model Number              = "+mobiles[i].modelNo);
                  System.out.println("Operating System          = "+mobiles[i].operatingSystem);
                  System.out.println("Screen Size               = "+mobiles[i].screenSize);
                  System.out.println("RAM                       = "+mobiles[i].ram);
                  System.out.println("Internal Memory           = "+mobiles[i].internalMemory);
                  System.out.println("External Memory           = "+mobiles[i].externalMemory);
                  System.out.println("---------------------------------------------------------");
                  }    
                }  
              } 
    
            break;

            case 7:
            System.out.print("Entert the Minimum internalMemory = ");
            int minmu = sc.nextInt();
            System.out.print("Entert the Maximum internalMemory = ");
            int maxmu = sc.nextInt();
            if(nom == -1)
              {
              System.out.println("No Record Found ....!");  
              }
            else
              {
              for(int i=0;i<=nom;i++)
                {
                if(mobiles[i].internalMemory>=minmu && mobiles[i].internalMemory<=maxmu)  
                  {
                  System.out.println("---------------------------------------------------------");  
                  System.out.println("Company                   = "+mobiles[i].company);
                  System.out.println("Price                     = "+mobiles[i].price);
                  System.out.println("Type                      = "+mobiles[i].type);    
                  System.out.println("Model Number              = "+mobiles[i].modelNo);
                  System.out.println("Operating System          = "+mobiles[i].operatingSystem);
                  System.out.println("Screen Size               = "+mobiles[i].screenSize);
                  System.out.println("RAM                       = "+mobiles[i].ram);
                  System.out.println("Internal Memory           = "+mobiles[i].internalMemory);
                  System.out.println("External Memory           = "+mobiles[i].externalMemory);
                  System.out.println("---------------------------------------------------------");
                  }    
                }  
              } 
    
            break;


            case 8:
            System.exit(1); 
            break;
    
            default:
            System.out.println("Wrong Choice");
            break;
            }
          sc.nextLine(); // getch()
          sc.nextLine(); // getch() 
          System.out.print("\033[H\033[2J");
          System.out.flush();
          }
        }
    }

    

