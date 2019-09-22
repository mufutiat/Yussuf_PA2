package Yussuf_p3;

import java.util.Scanner;

public class Pollings {

	public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
		
		String topics[]={"Space Exploration","Education","Family","Religion","Money"};
		int responses[][] = new int[5][10];
         
        int i, j;

        int people = 0;

        int rating;

       
        // initialize the ratings array with 0

        for( i = 0;i < responses.length; i++){
               responses[i] = new int[10];

               for( j=0; j < responses[i].length; j++)

                      responses[i][j] = 0;

        }

       
        // input character to begin survey

        System.out.print("Please enter 'Y' to begin survey :");

        String survey = scnr.next();

       
        // loop to allow user to rate each topic

        while( survey.charAt(0) != 'N'){

               System.out.println("\nPlease rate the five topics below from 1(least important) to 10 (most important) :");

               for(j = 0; j < 5; j++){

                      System.out.print("Enter your rating for "+topics[j]+" : ");

                      rating = scnr.nextInt();

                      while(rating < 1 || rating > 10){

                            System.out.println("Rating should be between [1,10]");

                            System.out.print("Enter your rating for "+topics[j]+" : ");

                            rating = scnr.nextInt();

                      }

                     responses[j][rating-1]++; // log each rating for each topic

               }
               System.out.print("Continue Survey ?: ");
               survey = scnr.next();
               ++people;
        }

       
        // Array to store the average rating

        int avgRating[] = new int[topics.length];

        String highestPointIssue ="" , lowestPointIssue="" ;

        int highestPointTotal = 0 , lowestPointTotal= 0;

       

        // loop to calculate the average rating, lowest point total and highest point total

        for(i=0;i<responses.length;i++)

        {

               avgRating[i] = 0;

               for(j=0;j<responses[i].length;j++)

                      avgRating[i] += (responses[i][j]*(j+1));

                    if(i == 0){

                      highestPointTotal = avgRating[i];

                      lowestPointTotal= avgRating[i];

                      highestPointIssue = topics[i];

                      lowestPointIssue = topics[i];

               }else
                    {

                      if(avgRating[i] > highestPointTotal){

                            highestPointIssue = topics[i];

                            highestPointTotal = avgRating[i];

                      }

                      if(avgRating[i] < lowestPointTotal){

                            lowestPointIssue = topics[i];

                            lowestPointTotal= avgRating[i];

                      }

               }

              avgRating[i] = avgRating[i]/people;

        }

       

        // output the topics and its count of ratings and average rating in tabular format

        System.out.printf("\n%-20s","");

        for(i=0;i<10;i++)

               System.out.printf("%-10d",(i+1));

        System.out.printf("%20s","Average Rating");

        System.out.println();

        for(i=0;i<responses.length;i++)

        {

               System.out.printf("\n%-20s",topics[i]);

               for(j=0;j<responses[i].length;j++)

                      System.out.printf("%-10d",responses[i][j]);

               System.out.printf("%20d",avgRating[i]);

        }

       

        // output the topics with highest and lowest point total

        System.out.println("\n\nHighest Point total : "+highestPointTotal+", Issue : "+highestPointIssue);

        System.out.println("Lowest Point total : "+lowestPointTotal+",  Issue : "+lowestPointIssue);

        scnr.close();

	}

}
