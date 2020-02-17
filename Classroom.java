public class Classroom {
/*private int[] student0QuizScores;
private int[] student1QuizScores;
private int[] student2QuizScores;
private int[] quizScores;*/
private int[][] studentQuizScores = {
  {92, 70, 55, 23, 97},
  {77, 67, 89, 75, 66},
  {66, 85, 13, 92, 81}
};

public Classroom(/*int[] quizScores*/){
  //this.quizScores = quizScores;
}

public int[][] getScores(){
  return studentQuizScores;
}

public double getAdvQuizScore(int[] scores){
  double total = 0;
  //for(int i = 0; i < quizScores.length-1; i++){
  for (int i : scores){
    total = total + i;
  }
  total = total/scores.length;
  return total;
}

public double getAdvQuizScores(){
  double total = 0;
  total = total + getAdvQuizScore(studentQuizScores[0]);
  total = total + getAdvQuizScore(studentQuizScores[1]);
  total = total + getAdvQuizScore(studentQuizScores[2]);
  total = total/3;
  return total;
}
}