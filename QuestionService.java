// import java.util.Scanner;

// public class QuestionService 
// {
//     Questions[] questions = new Questions [5];
//     String selection [] = new String [5];
//         public QuestionService()
//         {
//             questions[0] = new Questions (1,"2","2","3","1","4","why java"); 
//             questions[1] = new Questions (2,"3","2","3","1","4","why cpp"); 
//             questions[2] = new Questions (3,"1","2","3","1","4","why csharp"); 
//             questions[3] = new Questions (4,"4","2","3","1","4","why python"); 
//             questions[4] = new Questions (5,"5","2","3","1","5","why ass"); 

//         }
//         public void playQuiz()
//         {
//             int i=0;

//             for(Questions q : questions){
//             System.out.println("Question Number :" + q.getId());
//             System.out.println(q.getQuestions());
//             System.out.println(q.getOpt1());
//             System.out.println(q.getOpt2());
//             System.out.println(q.getOpt3());
//             System.out.println(q.getOpt4());
//             Scanner sc = new Scanner(System.in);
//             selection[i] = sc.nextLine();
//             i++;
//             }
//             for(String s : selection){
//                 System.out.println(s);
//             }
// public void printScore()
//             {
//                 int score = 0;
//                 for(int j=0;j<questions.length;j++)
//                 {
//                     Questions que = questions[j];
//                 }
//             }
//         }   
// }

import java.util.Scanner;

public class QuestionService 
{
    Questions [] questions = new Questions[5];
    String selection [] = new String[5];

    // Constructor
    public QuestionService() 
    {
        questions[0] = new Questions(1,"2","2","3","1","4","why java"); 
        questions[1] = new Questions(2,"3","2","3","1","4","why cpp"); 
        questions[2] = new Questions(3,"1","2","3","1","4","why csharp"); 
        questions[3] = new Questions(4,"4","2","3","1","4","why python"); 
        questions[4] = new Questions(5,"5","2","3","1","5","why ass"); 
    }

    // Method to play the quiz
    public void playQuiz() 
    {
        int i = 0;
        for (Questions q : questions) 
        {
            System.out.println("Question Number :" + q.getId());
            System.out.println(q.getQuestions());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        
        // Print the selection after quiz
        for (String s : selection) 
        {
            System.out.println(s);
        }
    }

    // Method to print the score
    public void printScore() 
    {
        int score = 0;
        for (int j = 0; j < questions.length; j++) 
        {
            Questions que = questions[j];
            // Add your scoring logic here based on correct answers
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[j];

            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
