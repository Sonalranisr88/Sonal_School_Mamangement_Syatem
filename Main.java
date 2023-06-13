import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class sms extends Applet implements ActionListener {
  String msg = "*****WELCOME TO SONAL SCHOOL MANAGEMENT*****";
  String msg2 = "";

  String ss1, ss2, ss3, ss4, ss5, ss6, ss7;
  String std1, std2, std3, std4, std5, std6, std7;
  Image img;

  int z = 0, z1 = 0, z2 = 0, z3 = 0, z4 = 0, z5 = 0, z6 = 0;
  Button ab, bc, cd, de, ef, fg, gh;


  public void init() {
    setLayout(null);
    Font f = new Font("SansSerif", Font.BOLD, 22);
    setFont(f);

    ab = new Button("STUDENT MANAGEMENT");
    ab.setBounds(50, 50, 350, 50);
    add(ab);

    gh = new Button("EXIT");
    gh.setBounds(50, 350, 350, 50);
    add(gh);

    img = getImage(getCodeBase(), "main.jpg");
    ab.addActionListener(this);
    gh.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    String str = ae.getActionCommand();
    if (str == "STUDENT MANAGEMENT") {
      Frame f;
      f = new Student1("STUDENT MANAGEMENT");
      f.setVisible(true);
      f.setSize(1500, 1000);
    } else if (str == "EXIT") {

      Frame f;
      f = new Exit1("EXIT");
      f.setVisible(true);
      f.setSize(1500, 1000);
    }
  }

  public void paint(Graphics g) {
    g.drawImage(img, 0, 0, 1366, 768, this);
    g.drawString(msg, 500, 50);
    g.drawRect(425, 18, 675, 50);
    g.drawRect(426, 19, 676, 50);
  }

  class Student1 extends Frame implements ActionListener {
    Button a1, b1, c1, d1;
    Image img1;
    Student1(String title) {
      super(title);
      //char ch = '*';
      MyWindowAdapter adapter = new MyWindowAdapter(this);
      addWindowListener(adapter);

      setBackground(Color.CYAN);
      setForeground(Color.RED);

      setLayout(null);
      Font f = new Font("SansSerif", Font.BOLD, 30);
      setFont(f);

      a1 = new Button("ADD STUDENT");
      b1 = new Button("DISPLAY");
      c1 = new Button("DELETE");
      d1 = new Button("CANCEL");

      a1.setBackground(Color.yellow);
      b1.setBackground(Color.yellow);
      c1.setBackground(Color.yellow);
      d1.setBackground(Color.yellow);

      a1.setBounds(50, 100, 300, 50);
      b1.setBounds(100, 150, 300, 50);
      c1.setBounds(50, 200, 300, 50);
      d1.setBounds(100, 250, 300, 50);

      add(a1);
      add(b1);
      add(c1);
      add(d1);
      a1.addActionListener(this);
      b1.addActionListener(this);
      c1.addActionListener(this);
      d1.addActionListener(this);
    }


    public void actionPerformed(ActionEvent ae) {
      String str = ae.getActionCommand();
      if (str == "ADD STUDENT") { //this.setVisible(false);
        Frame f;
        f = new Student2("********  ENTER YOUR INFORMATION  *******");
        f.setVisible(true);
        f.setSize(1500, 1000);
      } else if (str == "DISPLAY") {
        Frame f;
        f = new StudentDisplay("********  STUDENT INFORMATION DISPLAY  *******");
        f.setVisible(true);
        f.setSize(1500, 1000);
      } else if (str == "DELETE") {
        Frame f;
        f = new Student1("********  STUDENT INFORMATION DELETE  *******");
        f.setVisible(false);
        f.setSize(1500, 1000);
      } else if (str == "CANCEL") {
        Frame f;
        f = new Student1("********  ENTER YOUR INFORMATION  *******");
        f.setVisible(false);
        f.setSize(1500, 1000);
      }
    }

    public void paint(Graphics g) {
      g.drawImage(img1, 0, 0, 1366, 768, this);
    }

}
  class Student2 extends Frame implements ActionListener {
    TextField t1, t2, t3, t4, t5, t6, t7;
    Button bb1;
    Label l1, l2, l3, l4, l5, l6, l7;
    String str1;
    Student2(String title) {
      super(title);
      MyWindowAdapter7 adapter = new MyWindowAdapter7(this);
      addWindowListener(adapter);
      setLayout(null);

      Font f = new Font("SansSerif", Font.BOLD, 20);
      setFont(f);

      setBackground(Color.red);

      t1 = new TextField(20);
      t1.setBounds(400, 50, 400, 50);
      add(t1);
      l1 = new Label("STUDENT NAME");
      add(l1);
      l1.setBounds(200, 50, 200, 50);

      t2 = new TextField(20);
      t2.setBounds(400, 120, 400, 50);
      add(t2);
      l2 = new Label("COURSE");
      add(l2);
      l2.setBounds(200, 120, 200, 50);

      t3 = new TextField(20);
      t3.setBounds(400, 190, 400, 50);
      add(t3);

      l3 = new Label("ROLL NO");
      add(l3);
      l3.setBounds(200, 190, 200, 50);

      t4 = new TextField(20);
      t4.setBounds(400, 260, 400, 50);
      add(t4);

      l4 = new Label("DEPT");
      add(l4);
      l4.setBounds(200, 260, 200, 50);

      t5 = new TextField(20);
      t5.setBounds(400, 330, 400, 50);
      add(t5);

      l5 = new Label("DOB");
      add(l5);
      l5.setBounds(200, 330, 200, 50);

      t6 = new TextField(20);
      t6.setBounds(400, 390, 400, 50);
      add(t6);

      l6 = new Label("REG.NO");
      add(l6);
      l6.setBounds(200, 390, 200, 50);

      t7 = new TextField(20);
      t7.setBounds(400, 460, 400, 50);
      add(t7);
      l7 = new Label("MOB NO");
      add(l7);
      l7.setBounds(200, 460, 200, 50);

      bb1 = new Button("SUBMIT");
      bb1.setBackground(Color.yellow);
      bb1.setBounds(500, 530, 200, 50);
      add(bb1);
      bb1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
      
      ss1 = t1.getText();
      ss2 = t2.getText();
      ss3 = t3.getText();
      ss4 = t4.getText();
      ss5 = t5.getText();
      ss6 = t6.getText();
      ss7 = t7.getText();
    }


  class StudentDisplay extends Frame {
    TextField t1, t2, t3, t4, t5, t6, t7;
    Label l1, l2, l3, l4, l5, l6, l7;

    StudentDisplay(String title) {
      super(title);
      MyWindowAdapter13 adapter = new MyWindowAdapter13(this);
      addWindowListener(adapter);
      setLayout(null);

      Font f = new Font("SansSerif", Font.BOLD, 20);
      setFont(f);

      setBackground(Color.red);

      t1 = new TextField(20);
      t1.setBounds(400, 50, 400, 50);
      add(t1);
      l1 = new Label("STUDENT NAME");
      add(l1);
      l1.setBounds(200, 50, 200, 50);

      t2 = new TextField(20);
      t2.setBounds(400, 120, 400, 50);
      add(t2);
      l2 = new Label("COURSE");
      add(l2);
      l2.setBounds(200, 120, 200, 50);

      t3 = new TextField(20);
      t3.setBounds(400, 190, 400, 50);
      add(t3);

      l3 = new Label("ROLL NO");
      add(l3);
      l3.setBounds(200, 190, 200, 50);

      t4 = new TextField(20);
      t4.setBounds(400, 260, 400, 50);
      add(t4);

      l4 = new Label("DEPT");
      add(l4);
      l4.setBounds(200, 260, 200, 50);

      t5 = new TextField(20);
      t5.setBounds(400, 330, 400, 50);
      add(t5);

      l5 = new Label("DOB");
      add(l5);
      l5.setBounds(200, 330, 200, 50);

      t6 = new TextField(20);
      t6.setBounds(400, 390, 400, 50);
      add(t6);

      l6 = new Label("REG.NO");
      add(l6);
      l6.setBounds(200, 390, 200, 50);

      t7 = new TextField(20);
      t7.setBounds(400, 460, 400, 50);
      add(t7);
      l7 = new Label("MOB NO");
      add(l7);
      l7.setBounds(200, 460, 200, 50);
      t1.setText(ss1);
      t2.setText(ss2);
      t3.setText(ss3);
      t4.setText(ss4);
      t5.setText(ss5);
      t6.setText(ss6);
      t7.setText(ss7);

    }
  }


  class MyWindowAdapter extends WindowAdapter {
    Student1 s1;
    public MyWindowAdapter(Student1 s1) {
      this.s1 = s1;
    }
    public void windowClosing(WindowEvent we) {
      s1.setVisible(false);
    }
  }

  class MyWindowAdapter7 extends WindowAdapter {
    Student2 ss1;
    public MyWindowAdapter7(Student2 ss1) {
      this.ss1 = ss1;
    }
    public void windowClosing(WindowEvent we) {
      ss1.setVisible(false);
    }
  }

  class MyWindowAdapter13 extends WindowAdapter {
    StudentDisplay sd;
    public MyWindowAdapter13(StudentDisplay sd) {
      this.sd = sd;
    }
    public void windowClosing(WindowEvent we) {
      sd.setVisible(false);
    }
  }

