import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
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

public class PDFgenerator {
    PaperPanel pp;
    int time;
    static ArrayList<String> questions = new ArrayList<>();
    static ArrayList<Integer> questionNos = new ArrayList<>();
    static ArrayList<Integer> marks = new ArrayList<>();
    static int i =0;
    private static final String FILE = "C:/Users/gaura/Documents/NetBeansProjects/questionpapergenerator/qpgenerator/dist/qpg.pdf";
    private static final Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 30,
            Font.BOLD);
    private static final Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);
    private static final Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);
   
    PDFgenerator(){
        //to create a copy
//    try{
//      PdfReader pdfReader = new PdfReader("c:/temp/tqp.pdf");
//      PdfStamper pdfStamper = new PdfStamper(pdfReader,new FileOutputStream("c:/temp/tqp1.pdf"));
//      pdfStamper.close();
//    }catch(Exception e){}
        try {
            Document document = new Document();   
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addMetaData(document);
            addTitlePage(document);
            addContent(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void addInPDF(int questionNo, String question , int mark){
        questionNos.add(questionNo+i);
        questions.add(question);
        marks.add(mark);
        i++;
    }
    public static void addMetaData(Document document) {
        document.addTitle("Question Paper generator");
    }

    public  void addTitlePage(Document document)
            throws DocumentException {
        Paragraph preface = new Paragraph();
        // We add one empty line
        addEmptyLine(preface, 1);

        if(PaperPanel.getMarks()<40){
            time=1;
        }
        else if(PaperPanel.getMarks()>=40 && PaperPanel.getMarks()<80){
            time=2;
        }else if(PaperPanel.getMarks()>=80){
            time=3;
        }
        preface.add(new Paragraph(""+PaperPanel.getCode()+"                                               SEN" , catFont));
        preface.add(new Paragraph(""+PaperPanel.getMarks()+ " Marks /" + " " + time + " hours",catFont));

        preface.add(new Paragraph("______________________________________________________________________________"));
        addEmptyLine(preface,1);

        preface.add(new Paragraph("Instructions -       (1) All Questions are Compulsory.",normalFont));
        addEmptyLine(preface,0);
        preface.add(new Paragraph("                              (2) Answer each next main Question on a new page.",normalFont));
        addEmptyLine(preface,0);
        preface.add(new Paragraph("                              (3) Illustrate your answers with neat sketches wherever necessary.",normalFont));
        addEmptyLine(preface,0);
        preface.add(new Paragraph("                              (4) Mobile Phone, Pager devices are not permissible in Examination Hall.",normalFont));
        addEmptyLine(preface,0);

        document.add(preface);
        // Start a new page
//        document.newPage();
    }

    public static void addContent(Document document) throws DocumentException {

        Paragraph subPara = new Paragraph("questions", subFont);

        // add a table
        createTable(subPara);

        // now add all this to the document
        document.add(subPara);

    }

    public static void createTable(Paragraph subPara)
            throws BadElementException {
        float[] columnWidths= {1,5,1};
        PdfPTable table = new PdfPTable(columnWidths);

        try{
            PdfPCell c1 = new PdfPCell(new Paragraph("Q.No",smallBold));
            c1.setHorizontalAlignment(0);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Questions",smallBold ));
            c1.setHorizontalAlignment(0);
            table.addCell(c1);
//          table.setWidths(new float[]{0,4});

            c1 = new PdfPCell(new Phrase("Marks",smallBold));
            c1.setHorizontalAlignment(0);
            table.addCell(c1);
//          table.setWidths(new float[]{1,1});
            table.setHeaderRows(1);
        }catch(Exception e){}

        for(int j =0;j<questionNos.size();j++){
            table.addCell(questionNos.get(j)+"");
            table.addCell(questions.get(j));
            table.addCell(marks.get(j)+"");
        }
        table.setWidthPercentage(100);
        subPara.add(table);

    }
    public static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}   
