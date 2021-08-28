
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashay
 */
public class QuestionPDF {
    int questionNo;
    String question;
    int marks;
    QuestionPDF(String question,int mark){
        this.question = question;
        questionNo=1;
        this.marks=mark;
//        JOptionPane.showMessageDialog(null,questionNo+"" + question+"" + marks+"");
        PDFgenerator.addInPDF(this.questionNo,this.question,this.marks);
    }
}
