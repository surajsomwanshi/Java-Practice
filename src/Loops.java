public class Loops {
    public static void main(String[] args) {
//        int number	=	5;
//        if(number	<	0) {
//            number = number + 10;
//            number++;
//            System.out.println(number);
//        }
//        int m	=	15;
//        if(m>20)
//            if(m<20)
//                System.out.println("m>20");
//            else
//                System.out.println("Who	am	I?");

    // Switch case
//        int	number	=	2;
//        switch (number)	{
//            case 1:
//                System.out.println(1);
//            case 2:
//                System.out.println(2);
//            case 3:
//                System.out.println(3);
//            default:
//
//                System.out.println("Default");
//        }

//for loop
//        for (int i	=	0,j	=	0;	i	<	10;	i++,j--)	{
//            System.out.print(j);
//        }

//Enhanced for loop
//  int[] numbers = {1,2,3,4,5,6};
//
//        for(int number:numbers){
//            System.out.println(number);
//        }
//
//   String[] str={"suraj","john","thor","superman"};
//
//        for(String human:str){
//            System.out.println(human.charAt(3));
//        }

        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.println(j+""+k);
                if (k==5){
                    break;
                }
            }
        }





    }
}
