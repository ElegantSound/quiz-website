package dao;

import java.util.List;

import classes.question.QuestionFB;
import classes.question.QuestionMC;
import classes.question.QuestionPR;
import classes.question.QuestionQR;
import classes.question.Abstract.Question;

public interface QuestionDAO {
	
	public void addQR(int quizId, QuestionQR qr);
	
	public void addPR(int quizId, QuestionPR pr);
	
	public void addMC(int quizId, QuestionMC mc);
	
	public void addFB(int quizId, QuestionFB fb);
	
	public List<Question> getQuestions(int quizId);

}
