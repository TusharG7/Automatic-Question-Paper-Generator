
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JOptionPane;
//import java.io.FileOutputStream;
//import java.util.Date;
//
//import com.itextpdf.text.Anchor;
//import com.itextpdf.text.BadElementException;
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Chapter;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.List;
//import com.itextpdf.text.ListItem;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.Phrase;
//import com.itextpdf.text.Section;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashay
 */
public class PaperPanel extends javax.swing.JPanel {

    /**
     * Creates new form PaperPanel
     */
    Connection conn;
    dashboard dashBoard;
    ResultSet rs=null;
    PreparedStatement ps=null;
    HashSet<String> Questions;
    private String question;
    private int marks;
    private int probability;
    private int difficultyLvl;
    private int deleted;
    String str ="";
    String str1="";
    int difficulty=0;
    int size=0;
    static int totMark;
    HashSet<Integer> randomno;
   	int numbers[]=new int[100];
   	String questionString ="";
     static String subCode="";
//      Document document = new Document();
	
    public PaperPanel(dashboard dashBoard) {
        this.dashBoard = dashBoard;
        conn = DBConnect.connectDB();
        initComponents();
    
//     private static void addMetaData(Document document) {
//        document.addTitle("Question Paper");
//        document.addSubject("Question paper generator!");
//        document.addKeywords("Java, PDF, iText");
//        document.addAuthor("Lars Vogel");
//        document.addCreator("Lars Vogel");
    }
//      private void addTitlePage(Document document)
//            throws DocumentException {
//        Paragraph preface = new Paragraph();
//        // We add one empty line
//        addEmptyLine(preface, 1);
//        // Lets write a big header
//        String subName = tfSubCode.getText();
//         String subn="";
//        try{
//        String sub="SELECT sub_name FROM subjects WHERE sub_code = ?";
//                    ps=conn.prepareStatement(sub);
//                    ps.setString(1,subName);                    
//                    rs=ps.executeQuery();
//			if(rs.next()){
//                            subn= rs.getString("sub_name");
//                        }
//                            
//        }catch(SQLException e){
//            JOptionPane.showMessageDialog(this,"Some issue in addtitlePage");
//        }
//        preface.add(new Paragraph("STUDY LINK", catFont));
//
//        addEmptyLine(preface, 1);
//        // Will create: Report generated by: _name, _date
//        preface.add(new Paragraph("Subject Code: "+ subName));
////        addEmptyLine(preface, 1);
//
//        preface.add(new Paragraph("Subject name: " +subn));
//        addEmptyLine(preface, 2);
//  
//
//        preface.add(new Paragraph(
//                "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-).",
//                redFont));
//
//        document.add(preface);
        // Start a new page
//        document.newPage();
//    }
   
//       private static void addEmptyLine(Paragraph paragraph, int number) {
//        for (int i = 0; i < number; i++) {
//            paragraph.add(new Paragraph(" "));
//        }
//       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfChpts = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTotMarks = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfSubCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbtLow = new javax.swing.JRadioButton();
        rbtMedium = new javax.swing.JRadioButton();
        rbtHard = new javax.swing.JRadioButton();
        listQuestions = new java.awt.List();

        setBackground(new java.awt.Color(253, 255, 252));

        jPanel1.setBackground(new java.awt.Color(253, 255, 252));

        jLabel1.setText("Enter the Chapter Numbers:");

        tfChpts.setText("1,2,3");

        jLabel2.setText("Enter the total marks: ");

        tfTotMarks.setText("38");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Generate Paper");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jLabel4.setText("Enter the subject code: ");

        tfSubCode.setText("17513");
        tfSubCode.setNextFocusableComponent(tfChpts);

        jLabel5.setText("Select the difficulty level");

        rbtLow.setBackground(new java.awt.Color(253, 255, 252));
        buttonGroup1.add(rbtLow);
        rbtLow.setText("Low");

        rbtMedium.setBackground(new java.awt.Color(253, 255, 252));
        buttonGroup1.add(rbtMedium);
        rbtMedium.setText("Medium");

        rbtHard.setBackground(new java.awt.Color(253, 255, 252));
        buttonGroup1.add(rbtHard);
        rbtHard.setText("Hard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(44, 44, 44))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtHard)
                            .addComponent(tfTotMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfSubCode)
                                .addComponent(tfChpts, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                            .addComponent(rbtMedium)
                            .addComponent(rbtLow)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(listQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfSubCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfChpts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfTotMarks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(rbtLow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtMedium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtHard)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public ResultSet getQuestionTable(){
		String sql = "SELECT * FROM questions ORDER BY probability WHERE deleted=0";
		try{
                    ps = conn.prepareStatement(sql);
                  rs = ps.executeQuery();
		}catch(SQLException e){}
		return rs;
	}
    
    public static void setCode(String subCodes){
        subCode =subCodes;
//        JOptionPane.showMessageDialog(null,subCode);
    }
    public static String getCode(){
//        JOptionPane.showMessageDialog(null,"getcode"+subCode);
        return subCode;
    }
    public static void setMarks(int marks){
        totMark = marks;
    }
    public static int getMarks(){
        return totMark;
    }
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        listQuestions.removeAll();
//        try{
//        PdfWriter.getInstance(document, new FileOutputStream(FILE));
//            document.open();
//            addMetaData(document);
//            addTitlePage(document);
//        }catch(Exception e){}
//        int marks =0;
//        String sql = "SELECT * FROM questions WHERE chp_no=? AND sub_code=? AND difficulty_lvl=?";
//          String sub_code = tfSubCode.getText();
        String chp_no = tfChpts.getText();
        int totMarks = Integer.parseInt(tfTotMarks.getText());
        setMarks(totMarks);
//        
        int difficulty_lvl=-1;
        if(rbtLow.isSelected()){
            difficulty_lvl=0;
        }
        if(rbtMedium.isSelected()){
            difficulty_lvl=5;
        }
        if(rbtHard.isSelected()){
            difficulty_lvl=10;
        }
//        try{
//        ps = conn.prepareStatement(sql);
//        ps.setString(1,chp_no);
//        ps.setString(2,sub_code);
//        ps.setString(3,difficulty_lvl+"");
//        ps.execute();
//        rs = ps.executeQuery();
//      
//        while(rs.next()){  
//               while(marks<totMarks){ 
//                   listQuestions.add(rs.getString("questions"));
//                  listQuestions.add(rs.getString("marks"));
//                  marks = marks + rs.getInt("marks");
//                  rs.next();
//             }JOptionPane.showMessageDialog(this,marks);
////             listQuestions.add(rs.getString("questions"));    
//    //            ta.add(rs.getString(1));
//            }      
//        }catch(SQLException e){
//            JOptionPane.showMessageDialog(this,"Issue in geting question"+e.getMessage());
//        }

//``````````````````````````SUBLIME CODE``````````````````````
	
    	ResultSet rs = getQuestionTable();
    	Questions = new HashSet<>();
        try{
//    		while(rs.next()){
//    			Questions.add(rs.getString("questions"));	    	     
//    		}
//    		size = Questions.size();

// 			System.out.println("Enter chapter numbers: ");
//    		String chpNo = scanner.nextLine(); 
    		
//	   		System.out.println("Set the difficulty :");
//    		String diff = scanner.nextLine();
//    		 
//    		System.out.println("Enter the subject code: ");
//    	 	int subCode = scanner.nextInt();

//                if(difficulty_lvl.equalsIgnoreCase("easy")){
//        	 	difficulty=0;
//        	 	System.out.println("easy");
//		}else if(difficulty_lvl.equalsIgnoreCase("medium")){
//    		 	difficulty=5;
//    		 	System.out.println("medium");
//    		}else if(difficulty_lvl.equalsIgnoreCase("hard")){
//    		 	difficulty=10;
//    		 	System.out.println("hard");
//    	    }

    		String sort="SELECT * FROM questions WHERE difficulty_lvl=? AND sub_code=? ORDER BY probability";
			ps=conn.prepareStatement(sort);
                    ps.setString(1,difficulty_lvl+"");
                    
                      int sub_code = Integer.parseInt(tfSubCode.getText());
                       ps.setInt(2,sub_code);
//                  String chp_no = tfChpts.getText();
			rs=ps.executeQuery();
			rs.next();
			if(rs.first()){
				probability=rs.getInt("probability");
//				System.out.println(probability+"\n");
			}
			String chp="SELECT * FROM chapters WHERE sub_code=?";
			ps=conn.prepareStatement(chp);
			ps.setInt(1,sub_code);
                        setCode(sub_code+"");
			rs=ps.executeQuery();
			if(rs.next()){
				String splitNo[]=chp_no.split(",");
				if(difficulty_lvl==0){
                                str="SELECT * FROM questions WHERE chp_no=? AND probability=? AND difficulty_lvl=0 ";//AND sub_code=?";
//                                str="SELECT * FROM questions WHERE chp_no=? AND difficulty_lvl=0 ";//AND sub_code=?";
//				generate();
                                }else if(difficulty_lvl==5){
				str="SELECT * FROM questions WHERE chp_no=? AND probability=? AND difficulty_lvl=5";// AND sub_code=?";
//                                str="SELECT * FROM questions WHERE chp_no=? AND difficulty_lvl=5 AND sub_code=?";
				}
                                else if(difficulty_lvl==10){
                                    str="SELECT * FROM questions WHERE chp_no=? AND probability=? AND difficulty_lvl=10 ";//AND sub_code=?";
//                                    str="SELECT * FROM questions WHERE chp_no=?  AND difficulty_lvl=10 AND sub_code=?";
                                }
                                for(int i=0;i<splitNo.length;i++){
                                    ps=conn.prepareStatement(str);
                                    ps.setString(1,splitNo[i]);
                                    ps.setString(2,probability+"");
//                                    ps.setInt(3,sub_code);
                               
                                    rs=ps.executeQuery();
//                                    JOptionPane.showMessageDialog(this,ps);     
                                    while(rs.next()){
                                            Questions.add(rs.getString("questions"));
                                            Questions.size();
                                    }
                                    if(i==splitNo.length-1 && Questions.size()==0){
                                            probability+=1;
                                            i=0;
                                    }
				}
			} 
                
	
    		 // String[] sl = new String[size];
    	    
    	  	// ArrayList al = new ArrayList<>(questionsArr);
    		// System.out.println(""+al);
    		// int sizee = al.size();
    	    
    	    // System.out.println(""+size);
    	    	    
//    	    System.out.println("Enter the total marks : ");
//    	    int totalMarks = scanner.nextInt();
// 			
 			randomGenerate(); //calling the function to generate random number
			String questionsArr[]=new String[Questions.size()];
//                        JOptionPane.showMessageDialog(this, Questions.size());
			int indx=0;
			for(String str1: Questions){
				questionsArr[indx]=str1;
				indx++;
			}
			indx=0;
			int marks=0;

			String mark="SELECT * FROM questions WHERE questions=?";
			int no=-1;
			questionString="";
			while(totMarks!=marks){
                            if(no==numbers[indx]){
                                    System.out.println("no more questions to add ");
                                    break;
                            }           
                            ps=conn.prepareStatement(mark); 
                            ps.setString(1,questionsArr[numbers[indx]]); //getting question at that index
//                            JOptionPane.showMessageDialog(this,questionsArr[numbers[indx]]);
                            no=numbers[indx]; //setting the value of index to no
//                            JOptionPane.showMessageDialog(this,no);
                            rs=ps.executeQuery();
                            rs.next();
                            // System.out.println("probab\n"+probability+" quest "+questionsArr[numbers[indx]]+"\n");
                                marks += rs.getInt("marks");
//                            if(marks<totMarks){
                                int m = rs.getInt("marks");
//				System.out.println(""+marks);
                                int prob=rs.getInt("probability");
//				System.out.println(""+prob);
//				prob+=1;
                                prob=0;
                                questionString=questionsArr[numbers[indx]];
                                PDFgenerator pdf = new PDFgenerator();
                                QuestionPDF qpdf= new QuestionPDF(questionsArr[numbers[indx]],m);
//                              if(marks!=totMarks){
//                               if(marks<totMarks){
//marks agar less thn hai toh hi add kar aur agar greater than hai toh fir next question le jab tak equal nai hota tab tak!!

                                  listQuestions.add(questionString);
//                                  addInPDF(document,questionString);
//                                Paragraph preface = new Paragraph();
//                                       try{
//                                        preface.add(new Paragraph(" " +questionString));
//                                         addEmptyLine(preface, 1);
//                                         JOptionPane.showMessageDialog(this,questionString);
//                                         document.add(preface);  
//                                      }catch(Exception e){}
                                  listQuestions.add(m+"");
                                   String upProb="UPDATE questions SET probability=? WHERE questions=?";
                            ps=conn.prepareStatement(upProb);
                            ps.setString(1,prob+"");//"0");
                            ps.setString(2,questionsArr[numbers[indx]]);
                            ps.execute();
                            indx++;
//                            } 
                             if(totMarks<marks){
//                                rs.next();
//                                String m = rs.getString("marks");
//                                 marks+=rs.getInt("marks");
//                                  int prob=rs.getInt("probability");
//                                   prob=0;
//                                 int diff=marks-totMarks;
//                                 System.out.println("diff:"+diff);
//                                 marks-=diff;
//                                listQuestions.add(questionString);
//                                listQuestions.add(m);
//                                System.out.println("marks ="+marks);
//                                System.out.println("question ka marks: "+rs.getInt("marks"));
                             while(marks!=totMarks){
//                                 String m = rs.getString("marks");
                                 m--;
                                 marks--;
                                }
                             }    
//                             String upProb="UPDATE questions SET probability=? WHERE questions=?";
//                                 ps=conn.prepareStatement(upProb);
//                                ps.setString(1,prob+"");//"0");
//                                ps.setString(2,questionsArr[numbers[indx]]);
//                                ps.execute();
//                                indx++;
//                          
                           
    	    // 	String sql = "Select * from questionsArr";
    	    // 	ps = conn.prepareStatement(sql);
    	    // 	ps.execute();
    	    // 	rs = ps.executeQuery();
    	    // 	int kmarks=4;
    	    // 	while(rs.next()){
    	    // 	int kmarks =rs.getInt("marks");
     	    //  }
    	    // 	String sql = "SELECT * FROM questionsArr";
    	    // 	ps = conn.prepareStatement(sql);
    	    // 	ps.execute();
        	//  rs = ps.executeQuery();
    	    // 	while(marks!=totalMarks){
                        }
//           } document.close();
            
        }
		catch(SQLException e){
			System.out.println("Exception in getHashSetOfQuestion : "+e);
		}

    }//GEN-LAST:event_jLabel3MouseClicked

    
       //    void generate(){
//        try{
//            for(int i=0;i<splitNo.length;i++){  
//                ps=conn.prepareStatement(str);
//                ps.setString(1,splitNo[i]);
//                ps.setString(2,probability+"");
//                ps.setInt(3,sub_code);                       
//                rs=ps.executeQuery();
////                                    JOptionPane.showMessageDialog(this,ps);     
//               while(rs.next()){
//                    Questions.add(rs.getString("questions"));
//                    Questions.size();
//                }
//                if(i==splitNo.length-1 && Questions.size()==0){
//                    probability+=1;
//                      i=0;
//                }
//            }
//        }catch(SQLException e){
//            JOptionPane.showMessageDialog(this,"issue in generate()"+e.getMessage());
//        }
//    }
    void randomGenerate(){
		Random ran=new Random();
		HashSet<Integer> hs=new HashSet<>();
		int no;
		int i=0;
//                JOptionPane.showMessageDialog(this,Questions.size());
		while(hs.size()!=Questions.size()){ 
			no=ran.nextInt(Questions.size());
			boolean flag = hs.add(no);
			if(flag == true){
				numbers[i]=no;
				i++;
			}
		}
        hs.clear();
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.List listQuestions;
    private javax.swing.JRadioButton rbtHard;
    private javax.swing.JRadioButton rbtLow;
    private javax.swing.JRadioButton rbtMedium;
    private javax.swing.JTextField tfChpts;
    private javax.swing.JTextField tfSubCode;
    private javax.swing.JTextField tfTotMarks;
    // End of variables declaration//GEN-END:variables
// private static String FILE = "c:/temp/questppr.pdf";
//    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
//            Font.BOLD);
//    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
//            Font.NORMAL, BaseColor.RED);
//    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
//            Font.BOLD);
//    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
//            Font.BOLD);
}
