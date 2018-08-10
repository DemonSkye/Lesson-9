public class Lesson9 {
    public static void main(String args[]){
        //Loops
        //Until a condition is no longer met, keep doing this thing.
        //if ( condition (true)) { //do stuff }
        //while ( condition (true)) { //do stuff }

        /*
        int counter = 0;
        while(counter < 10){
            System.out.println("Counter: " + counter);
            counter++; // the same as counter += 1
        }
        */

        //do{// stuff}...while()
        //it always executes the loop at least 1 time.
        /*
        int i = 0;
        do{
            //happens at LEAST once
            System.out.print(i + ", ");
            i++;
        }while(i<10);
        System.out.print(i);
        */

        //For loop
        //3-parts to loop: initialization, condition, incrementation
        for(int i = 0; i<=1000; i+=10){
            if(i % 100 == 0 && i > 0){
                System.out.print(i);
                System.out.println();
            }
            else {
                System.out.print(i + ", ");
            }
        }
        //{ and } are called scoping brackets (or curly brackets, or braces)
        //System.out.print(i);

        //modulo operator % -- percent sign
        //If you divide a number by another number, take the remainder;
        // 10 / 6 -- 1, remainder 4
        // 10 % 6 = 4



    }
}
