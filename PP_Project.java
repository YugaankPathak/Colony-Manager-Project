package pp_project;

//libraries used
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class PP_Project {

   //main method
    public static void main(String[] args) {
        
        Output o1= new Output();
        o1.UI1();//clling 1st interface
    }
    
}

//definition of the 1st user interface 
class First implements ActionListener{
    
    //definition of the various variables of the class
    public static JFrame frame1;
    public static JPanel panel1;
    public static JLabel name,colony,park,club,landmark,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,pn;
    public static JButton proceed;
    public static JTextField input1;
    public static Border border;
    public static Font h1;
    
   static int pln;
    
    public void UI1(){
        
        //frame 1
        frame1= new JFrame();
        frame1.setSize(1000, 800);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //panel1
        panel1= new JPanel();
        panel1.setVisible(true);
        panel1.setLayout(null);
        frame1.add(panel1);
        
        //defining a font
        h1= new Font("Monotype Corsiva",Font.BOLD,20);
        
        //heading label
        name= new JLabel("YP Buliders and Colonisers");
        name.setBounds(400, 5, 250, 30);
        name.setFont(h1);
        panel1.add(name);
        
        //colony name 
        colony= new JLabel("Mahakal Nagar");
        colony.setBounds(430, 30, 150, 30);
        colony.setFont(h1);
        panel1.add(colony);
        
        //adding border to the JLabels
        border = BorderFactory.createLineBorder(Color.black);
        
        // for the various building and plots of the colony[plots, school, club nad park]
        p1= new JLabel("Plot-1",SwingConstants.CENTER);
        p1.setBounds(250, 100, 100, 50);
        p1.setForeground(Color.GREEN);
        p1.setBorder(border);
        panel1.add(p1);
        
        p2= new JLabel("Plot-2",SwingConstants.CENTER);
        p2.setBounds(350, 100, 100, 50);
        p2.setForeground(Color.GREEN);
        p2.setBorder(border);
        panel1.add(p2);
        
        p3= new JLabel("Plot-3",SwingConstants.CENTER);
        p3.setBounds(450, 100, 100, 50);
        p3.setForeground(Color.GREEN);
        p3.setBorder(border);
        panel1.add(p3);
        
        p4= new JLabel("Plot-4",SwingConstants.CENTER);
        p4.setBounds(550, 100, 100, 50);       
        p4.setForeground(Color.GREEN);
        p4.setBorder(border);
        panel1.add(p4);
        
        p5= new JLabel("Plot-5",SwingConstants.CENTER);
        p5.setBounds(650, 100, 100, 50);        
        p5.setForeground(Color.GREEN);
        p5.setBorder(border);
        panel1.add(p5);
        
        p6= new JLabel("Plot-6",SwingConstants.CENTER);
        p6.setBounds(750, 100, 100, 50);        
        p6.setForeground(Color.GREEN);
        p6.setBorder(border);
        panel1.add(p6);
        
        
        park= new JLabel("Park",SwingConstants.CENTER);
        park.setBounds(250,200,400,150);
        park.setBorder(border);
        panel1.add(park);
        
        club= new JLabel("Club House",SwingConstants.CENTER);
        club.setBounds(700,200,150,250);
        club.setBorder(border);
        panel1.add(club);
        
        p7= new JLabel("Plot-7",SwingConstants.CENTER);
        p7.setBounds(250, 400, 100, 50);        
        p7.setForeground(Color.GREEN);
        p7.setBorder(border);
        panel1.add(p7);
        
        p8= new JLabel("Plot-8",SwingConstants.CENTER);
        p8.setBounds(350, 400, 100, 50);        
        p8.setForeground(Color.GREEN);
        p8.setBorder(border);
        panel1.add(p8);
        
        p9= new JLabel("Plot-9",SwingConstants.CENTER);
        p9.setBounds(450, 400, 100, 50);        
        p9.setForeground(Color.GREEN);
        p9.setBorder(border);
        panel1.add(p9);
        
        p10= new JLabel("Plot-10",SwingConstants.CENTER);
        p10.setBounds(550, 400, 100, 50);        
        p10.setForeground(Color.GREEN);
        p10.setBorder(border);
        panel1.add(p10);
        
        landmark= new JLabel("DPS School",SwingConstants.CENTER);
        landmark.setBounds(100, 100, 100, 350);
        landmark.setBorder(border);
        panel1.add(landmark);
        
        pn= new JLabel("Plot Number");
        pn.setBounds(460,490,100,30);
        panel1.add(pn);
        
        //textField to enter the plot for purchase
        input1= new JTextField();
        input1.setBounds(450,520,100,30);
        panel1.add(input1);
        
        //button to proceed
        proceed=new JButton("Proceed");
        proceed.setBounds(450, 560, 100, 30);
        panel1.add(proceed);
        
        //calling a method to implement the button task
        proceed.addActionListener(this);
        
        frame1.setVisible(true);
        
    }
    //defining the button task
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int f=0;
        
       int ipl= Integer.parseInt(input1.getText());
         pln=ipl; //plot number
      
         //implementing a color change for the plot that is sold
       switch(ipl){
           case 1: p1.setForeground(Color.RED);
           break;
           
           case 2: p2.setForeground(Color.RED);
           break;
           
           case 3: p3.setForeground(Color.RED);
           break;
           
           case 4: p4.setForeground(Color.RED);
           break;
           
           case 5: p5.setForeground(Color.RED);
           break;
           
           case 6: p6.setForeground(Color.RED);
           break;
           
           case 7: p7.setForeground(Color.RED);
           break;
           
           case 8: p8.setForeground(Color.RED);
           break;
           
           case 9: p9.setForeground(Color.RED);
           break;
           
           case 10: p10.setForeground(Color.RED);
           break;
           
           default: JOptionPane.showMessageDialog(panel1, "Enter Valid Plot Number");
           f++;
           break;
    }
       if(f==0){
        Second u2 = new Second();
        u2.UI2();//calling the second user interface
       }
    }   
}

class Second implements ActionListener{
    
    //variables for class second
    public static JFrame frame2;
    public static JPanel panel2,panel3;
    public static JLabel name,colony,buyer,cost,disc,parpay;
    public static JButton payment;
    public static JTextField buyername,costF,discF,parpayF;
    public static Border border;
    public static Font h1;
    
    public void UI2(){
        
        //frame 2
        frame2= new JFrame();
        frame2.setSize(1000, 500);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //panel 2
        panel2= new JPanel();
        panel2.setVisible(true);
        panel2.setBounds(0,0,400,500);
        panel2.setLayout(null);
        frame2.add(panel2);
        
        //defining a font 
        h1= new Font("Monotype Corsiva",Font.BOLD,20);
        
        //for heading
        name= new JLabel("YP Buliders and Colonisers");
        name.setBounds(400, 5, 250, 30);
        name.setFont(h1);
        panel2.add(name);
        
        //for colony name
        colony= new JLabel("Mahakal Nagar");
        colony.setBounds(430, 30, 150, 30);
        colony.setFont(h1);
        panel2.add(colony);
        
        //buyer
        buyer= new JLabel("Buyer Name");
        buyer.setBounds(200, 150, 100, 30);
        panel2.add(buyer);
        
        buyername= new JTextField();
        buyername.setBounds(300, 150, 100, 30);
        panel2.add(buyername);
        
        //rate
        cost= new JLabel("Rate");
        cost.setBounds(200, 200, 100, 30);
        panel2.add(cost);
        
        costF= new JTextField();
        costF.setBounds(300, 200, 100, 30);
        panel2.add(costF);
        
        //discount
        disc= new JLabel("Discount");
        disc.setBounds(200, 250, 100, 30);
        panel2.add(disc);
        
        discF= new JTextField();
        discF.setBounds(300, 250, 100, 30);
        panel2.add(discF);
        
        //partial payment
        parpay= new JLabel("Partial Payment");
        parpay.setBounds(200, 300, 100, 30);
        panel2.add(parpay);
        
        parpayF= new JTextField();
        parpayF.setBounds(300, 300, 100, 30);
        panel2.add(parpayF);
        
        //payment ot confirm sale
        payment= new JButton("Confirm");
        payment.setBounds(450,300,100,30);
        panel2.add(payment);
        
        payment.addActionListener(this);    
           
        frame2.setVisible(true);
    }
    //method to close the second frame when button is clicked
    public void closeJFrame(JFrame c){
        c.setVisible(false);
    }

    //method to define the button task
    @Override
    public void actionPerformed(ActionEvent e) {
        
        JOptionPane.showMessageDialog(panel2,"Sale is Confirmed, Entered into File");
        
        //taking the inputs from the textField
        String n= buyername.getText();
        int c= Integer.parseInt(costF.getText());
        int d= Integer.parseInt(discF.getText());
        int par= Integer.parseInt(parpayF.getText());
        int p= c-d-par;

        try{
            
        Output o= new Output();
        o.file(n, c, d, par, p);
        o.getPlot(First.pln);
        }
        catch(IOException a){ //handling an exception
            
            System.out.println(a.getMessage());
        }
        
       closeJFrame(frame2);
    }
}

class Output extends First { //inheriting from 1st class 
    
    //method to get plot number
    public void getPlot(int p){
        pln=p;
    }
 
    //method to put user input into a file 
    public void file(String n,int c,int d,int par,int p) throws IOException{
            
        String text="Plot Number: "+pln+"\n"+"Name of Buyer: "+n+"\n"+"Rate: "+c+"\n"+"Discount: "+d+"\n"+"Partial Payment: "+par+"\n"+"Payable Amount: "+p+"\n"+"\n";
        
        Path fileName = Path.of("C:\\Users\\hp\\OneDrive\\Desktop\\PP_Colony.txt");
        
        File file= new File("C:\\Users\\hp\\OneDrive\\Desktop\\PP_Colony.txt");
 
        Files.writeString(fileName, text, StandardOpenOption.APPEND);
        
        Desktop dx= Desktop.getDesktop();
        dx.open(file);
         
    }
}
//end of code