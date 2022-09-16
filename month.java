import java.util.*;
class month{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      System.out.println("Enter the month number");
      int month=a.nextInt();
      System.out.println("Enter the year");
      int year=a.nextInt();
      if(year%4==0){
         switch(month){
                  case 1:System.out.println("January "+year+" has "+31+" days");
                  break;
                  case 2:System.out.println("february "+year+" has "+29+" days");
                  break;
                  case 3:System.out.println("march "+year+" has "+31+" days");
                  break;
                  case 4:System.out.println("april "+year+" has "+29+" days");
                  break;
                  case 5:System.out.println("may "+year+" has "+31+" days");
                  break;
                  case 6:System.out.println("June "+year+" has "+30+" days");
                  break;
                  case 7:System.out.println("July "+year+" has "+31+" days");
                  break;
                  case 8:System.out.println("august "+year+" has "+31+" days");
                  break;
                  case 9:System.out.println("september "+year+" has "+30+" days");
                  break;
                  case 10:System.out.println("october "+year+" has "+31+" days");
                  break;
                  case 11:System.out.println("november "+year+" has "+30+" days");
                  break;
                  case 12:System.out.println("december "+year+" has "+31+" days");
                  break;
                  default:System.out.println("there exist only 12 months");
                  break;
         }
      }
      else{
         switch(month){
            case 1:System.out.println("January "+year+" has "+31+" days");
            break;
            case 2:System.out.println("february "+year+" has "+28+" days");
            break;
            case 3:System.out.println("march "+year+" has "+31+" days");
            break;
            case 4:System.out.println("april "+year+" has "+29+" days");
            break;
            case 5:System.out.println("may "+year+" has "+31+" days");
            break;
            case 6:System.out.println("June "+year+" has "+30+" days");
            break;
            case 7:System.out.println("July "+year+" has "+31+" days");
            break;
            case 8:System.out.println("august "+year+" has "+31+" days");
            break;
            case 9:System.out.println("september "+year+" has "+30+" days");
            break;
            case 10:System.out.println("october "+year+" has "+31+" days");
            break;
            case 11:System.out.println("november "+year+" has "+30+" days");
            break;
            case 12:System.out.println("december "+year+" has "+31+" days");
            break;
            default:System.out.println("there exist only 12 months");
            break;

   }
      }
   }
}
