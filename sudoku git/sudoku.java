
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.orange;
import static java.awt.Color.white;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class sudoku extends javax.swing.JFrame {

    /**
     * Creates new form sudoku
     */
      private String turn = "1";
      private boolean globalFlag = true;
      public String solvedBoard [][] = {
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}};

    public sudoku() {
        initComponents();
    }
    
       public void resetBoard(){

        JButton buttons[]={bt4,bt7,bt9,bt10,bt14,bt15,bt17,bt19,bt20,bt21,
                            bt22,bt24,bt26,bt32,bt33,bt35,bt38,bt39,bt43,bt44,bt47,bt49,
                            bt50,bt56,bt58,bt60,bt61,bt62,bt63,bt65,bt67,bt68,bt72,bt73,
                            bt75,bt78
        };

        JButton board [][]={
            {bt1, bt2, bt3, bt10, bt11, bt12, bt19, bt20, bt21},
            {bt4, bt5, bt6, bt13, bt14, bt15, bt22, bt23, bt24},
            {bt7, bt8, bt9, bt16, bt17, bt18, bt25, bt26, bt27},
            {bt28, bt29, bt30, bt37, bt38, bt39, bt46, bt47, bt48},
            {bt31, bt32, bt33, bt40, bt41, bt42, bt49, bt50, bt51},
            {bt34, bt35, bt36, bt43, bt44, bt45, bt52, bt53, bt54},
            {bt55, bt56, bt57, bt64, bt65, bt66, bt73, bt74, bt75},
            {bt58, bt59, bt60, bt67, bt68, bt69, bt76, bt77, bt78},
            {bt61, bt62, bt63, bt70, bt71, bt72, bt79, bt80, bt81},
        }; 

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag=true;

                for(int k=0;k<buttons.length;k++){
                    if(board[i][j]==buttons[k]) flag=false;
               
                }

                if(flag==true){
                    board[i][j].setText("");
                    board[i][j].setForeground(black);
                    board[i][j].setBackground(white);
                }
            }
        }
    }

    public void seeSolution(){

        JButton buttons[]={bt4,bt7,bt9,bt10,bt14,bt15,bt17,bt19,bt20,bt21,
                            bt22,bt24,bt26,bt32,bt33,bt35,bt38,bt39,bt43,bt44,bt47,bt49,
                            bt50,bt56,bt58,bt60,bt61,bt62,bt63,bt65,bt67,bt68,bt72,bt73,
                            bt75,bt78
        };

        JButton board [][]={
            {bt1, bt2, bt3, bt10, bt11, bt12, bt19, bt20, bt21},
            {bt4, bt5, bt6, bt13, bt14, bt15, bt22, bt23, bt24},
            {bt7, bt8, bt9, bt16, bt17, bt18, bt25, bt26, bt27},
            {bt28, bt29, bt30, bt37, bt38, bt39, bt46, bt47, bt48},
            {bt31, bt32, bt33, bt40, bt41, bt42, bt49, bt50, bt51},
            {bt34, bt35, bt36, bt43, bt44, bt45, bt52, bt53, bt54},
            {bt55, bt56, bt57, bt64, bt65, bt66, bt73, bt74, bt75},
            {bt58, bt59, bt60, bt67, bt68, bt69, bt76, bt77, bt78},
            {bt61, bt62, bt63, bt70, bt71, bt72, bt79, bt80, bt81},
        };
          
        if(globalFlag == true){
                globalFlag=false;
                solution.setText("HIDE SOLN");

                for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    boolean flag=true;
                    for(int k=0;k<buttons.length;k++){
                        if(board[i][j]==buttons[k]) flag=false;
                    }
                    if(flag==true){
                        board[i][j].setText(solvedBoard[i][j]);
                        board[i][j].setForeground(white);
                        board[i][j].setBackground(black);
                    }
                }
            }
        }else{
            solution.setText("SOLUTION");
            globalFlag=true;
            resetBoard();
        }

    }
    
    public void checkMoves(){
         JButton buttons[]={bt4,bt7,bt9,bt10,bt14,bt15,bt17,bt19,bt20,bt21,
                            bt22,bt24,bt26,bt32,bt33,bt35,bt38,bt39,bt43,bt44,bt47,bt49,
                            bt50,bt56,bt58,bt60,bt61,bt62,bt63,bt65,bt67,bt68,bt72,bt73,
                            bt75,bt78
        };

        JButton board [][]={
            {bt1, bt2, bt3, bt10, bt11, bt12, bt19, bt20, bt21},
            {bt4, bt5, bt6, bt13, bt14, bt15, bt22, bt23, bt24},
            {bt7, bt8, bt9, bt16, bt17, bt18, bt25, bt26, bt27},
            {bt28, bt29, bt30, bt37, bt38, bt39, bt46, bt47, bt48},
            {bt31, bt32, bt33, bt40, bt41, bt42, bt49, bt50, bt51},
            {bt34, bt35, bt36, bt43, bt44, bt45, bt52, bt53, bt54},
            {bt55, bt56, bt57, bt64, bt65, bt66, bt73, bt74, bt75},
            {bt58, bt59, bt60, bt67, bt68, bt69, bt76, bt77, bt78},
            {bt61, bt62, bt63, bt70, bt71, bt72, bt79, bt80, bt81},
        }; 
        
         for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j].getText()!=solvedBoard[i][j] && board[i][j].getText()!=""){
                    board[i][j].setBackground(orange);
                }
            }
        }
    }
 
    public boolean solved()
    {
          JButton buttons[]={bt4,bt7,bt9,bt10,bt14,bt15,bt17,bt19,bt20,bt21,
                            bt22,bt24,bt26,bt32,bt33,bt35,bt38,bt39,bt43,bt44,bt47,bt49,
                            bt50,bt56,bt58,bt60,bt61,bt62,bt63,bt65,bt67,bt68,bt72,bt73,
                            bt75,bt78
        };

        JButton board [][]={
            {bt1, bt2, bt3, bt10, bt11, bt12, bt19, bt20, bt21},
            {bt4, bt5, bt6, bt13, bt14, bt15, bt22, bt23, bt24},
            {bt7, bt8, bt9, bt16, bt17, bt18, bt25, bt26, bt27},
            {bt28, bt29, bt30, bt37, bt38, bt39, bt46, bt47, bt48},
            {bt31, bt32, bt33, bt40, bt41, bt42, bt49, bt50, bt51},
            {bt34, bt35, bt36, bt43, bt44, bt45, bt52, bt53, bt54},
            {bt55, bt56, bt57, bt64, bt65, bt66, bt73, bt74, bt75},
            {bt58, bt59, bt60, bt67, bt68, bt69, bt76, bt77, bt78},
            {bt61, bt62, bt63, bt70, bt71, bt72, bt79, bt80, bt81},
        }; 
         
         for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag=true;

                for(int k=0;k<buttons.length;k++){
                    if(board[i][j]==buttons[k]) flag=false;
               
                }

                if(flag==true){
                   if(board[i][j].getText()!= solvedBoard[i][j])
                   {
                       return false;
                   }
                }
            }
        }
         return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bt10 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt15 = new javax.swing.JButton();
        bt14 = new javax.swing.JButton();
        bt13 = new javax.swing.JButton();
        bt16 = new javax.swing.JButton();
        bt17 = new javax.swing.JButton();
        bt18 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bt19 = new javax.swing.JButton();
        bt20 = new javax.swing.JButton();
        bt21 = new javax.swing.JButton();
        bt24 = new javax.swing.JButton();
        bt23 = new javax.swing.JButton();
        bt22 = new javax.swing.JButton();
        bt25 = new javax.swing.JButton();
        bt26 = new javax.swing.JButton();
        bt27 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        bt46 = new javax.swing.JButton();
        bt47 = new javax.swing.JButton();
        bt48 = new javax.swing.JButton();
        bt51 = new javax.swing.JButton();
        bt50 = new javax.swing.JButton();
        bt49 = new javax.swing.JButton();
        bt52 = new javax.swing.JButton();
        bt53 = new javax.swing.JButton();
        bt54 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bt37 = new javax.swing.JButton();
        bt38 = new javax.swing.JButton();
        bt39 = new javax.swing.JButton();
        bt42 = new javax.swing.JButton();
        bt41 = new javax.swing.JButton();
        bt40 = new javax.swing.JButton();
        bt43 = new javax.swing.JButton();
        bt44 = new javax.swing.JButton();
        bt45 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        bt28 = new javax.swing.JButton();
        bt29 = new javax.swing.JButton();
        bt30 = new javax.swing.JButton();
        bt33 = new javax.swing.JButton();
        bt32 = new javax.swing.JButton();
        bt31 = new javax.swing.JButton();
        bt34 = new javax.swing.JButton();
        bt35 = new javax.swing.JButton();
        bt36 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        bt73 = new javax.swing.JButton();
        bt74 = new javax.swing.JButton();
        bt75 = new javax.swing.JButton();
        bt78 = new javax.swing.JButton();
        bt77 = new javax.swing.JButton();
        bt76 = new javax.swing.JButton();
        bt79 = new javax.swing.JButton();
        bt80 = new javax.swing.JButton();
        bt81 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        bt64 = new javax.swing.JButton();
        bt65 = new javax.swing.JButton();
        bt66 = new javax.swing.JButton();
        bt69 = new javax.swing.JButton();
        bt68 = new javax.swing.JButton();
        bt67 = new javax.swing.JButton();
        bt70 = new javax.swing.JButton();
        bt71 = new javax.swing.JButton();
        bt72 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        bt55 = new javax.swing.JButton();
        bt56 = new javax.swing.JButton();
        bt57 = new javax.swing.JButton();
        bt60 = new javax.swing.JButton();
        bt59 = new javax.swing.JButton();
        bt58 = new javax.swing.JButton();
        bt61 = new javax.swing.JButton();
        bt62 = new javax.swing.JButton();
        bt63 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        moves = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        solution = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt4.setBackground(new java.awt.Color(204, 204, 255));
        bt4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt7.setBackground(new java.awt.Color(204, 204, 255));
        bt7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setBackground(new java.awt.Color(204, 204, 255));
        bt9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt9.setText("6");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt10.setBackground(new java.awt.Color(204, 204, 255));
        bt10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt10.setText("5");
        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });

        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });

        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });

        bt15.setBackground(new java.awt.Color(204, 204, 255));
        bt15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt15.setText("8");
        bt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt15ActionPerformed(evt);
            }
        });

        bt14.setBackground(new java.awt.Color(204, 204, 255));
        bt14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt14.setText("7");
        bt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt14ActionPerformed(evt);
            }
        });

        bt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt13ActionPerformed(evt);
            }
        });

        bt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt16ActionPerformed(evt);
            }
        });

        bt17.setBackground(new java.awt.Color(204, 204, 255));
        bt17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt17.setText("4");
        bt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt17ActionPerformed(evt);
            }
        });

        bt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt19.setBackground(new java.awt.Color(204, 204, 255));
        bt19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt19.setText("7");
        bt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt19ActionPerformed(evt);
            }
        });

        bt20.setBackground(new java.awt.Color(204, 204, 255));
        bt20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt20.setText("3");
        bt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt20ActionPerformed(evt);
            }
        });

        bt21.setBackground(new java.awt.Color(204, 204, 255));
        bt21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt21.setText("4");
        bt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt21ActionPerformed(evt);
            }
        });

        bt24.setBackground(new java.awt.Color(204, 204, 255));
        bt24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt24.setText("9");
        bt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt24ActionPerformed(evt);
            }
        });

        bt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt23ActionPerformed(evt);
            }
        });

        bt22.setBackground(new java.awt.Color(204, 204, 255));
        bt22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt22.setText("5");
        bt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt22ActionPerformed(evt);
            }
        });

        bt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt25ActionPerformed(evt);
            }
        });

        bt26.setBackground(new java.awt.Color(204, 204, 255));
        bt26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt26.setText("2");
        bt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt26ActionPerformed(evt);
            }
        });

        bt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bt25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt26, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt46ActionPerformed(evt);
            }
        });

        bt47.setBackground(new java.awt.Color(204, 204, 255));
        bt47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt47.setText("9");
        bt47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt47ActionPerformed(evt);
            }
        });

        bt48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt48ActionPerformed(evt);
            }
        });

        bt51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt51ActionPerformed(evt);
            }
        });

        bt50.setBackground(new java.awt.Color(204, 204, 255));
        bt50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt50.setText("8");
        bt50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt50ActionPerformed(evt);
            }
        });

        bt49.setBackground(new java.awt.Color(204, 204, 255));
        bt49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt49.setText("2");
        bt49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt49ActionPerformed(evt);
            }
        });

        bt52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt52ActionPerformed(evt);
            }
        });

        bt53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt53ActionPerformed(evt);
            }
        });

        bt54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt54ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(bt46, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt47, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(bt49, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt50, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt51, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt48, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bt52, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt53, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt54, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt51, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt52, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt53, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt54, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt37ActionPerformed(evt);
            }
        });

        bt38.setBackground(new java.awt.Color(204, 204, 255));
        bt38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt38.setText("3");
        bt38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt38ActionPerformed(evt);
            }
        });

        bt39.setBackground(new java.awt.Color(204, 204, 255));
        bt39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt39.setText("5");
        bt39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt39ActionPerformed(evt);
            }
        });

        bt42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt42ActionPerformed(evt);
            }
        });

        bt41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt41ActionPerformed(evt);
            }
        });

        bt40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt40ActionPerformed(evt);
            }
        });

        bt43.setBackground(new java.awt.Color(204, 204, 255));
        bt43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt43.setText("1");
        bt43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt43ActionPerformed(evt);
            }
        });

        bt44.setBackground(new java.awt.Color(204, 204, 255));
        bt44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt44.setText("8");
        bt44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt44ActionPerformed(evt);
            }
        });

        bt45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt45ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bt37, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt38, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bt40, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt41, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt42, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt39, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bt43, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt44, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt45, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt28ActionPerformed(evt);
            }
        });

        bt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt29ActionPerformed(evt);
            }
        });

        bt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt30ActionPerformed(evt);
            }
        });

        bt33.setBackground(new java.awt.Color(204, 204, 255));
        bt33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt33.setText("4");
        bt33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt33ActionPerformed(evt);
            }
        });

        bt32.setBackground(new java.awt.Color(204, 204, 255));
        bt32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt32.setText("3");
        bt32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt32ActionPerformed(evt);
            }
        });

        bt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt31ActionPerformed(evt);
            }
        });

        bt34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt34ActionPerformed(evt);
            }
        });

        bt35.setBackground(new java.awt.Color(204, 204, 255));
        bt35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt35.setText("6");
        bt35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt35ActionPerformed(evt);
            }
        });

        bt36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bt28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bt31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(bt34, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt35, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt36, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt73.setBackground(new java.awt.Color(204, 204, 255));
        bt73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt73.setText("9");
        bt73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt73ActionPerformed(evt);
            }
        });

        bt74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt74ActionPerformed(evt);
            }
        });

        bt75.setBackground(new java.awt.Color(204, 204, 255));
        bt75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt75.setText("6");
        bt75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt75ActionPerformed(evt);
            }
        });

        bt78.setBackground(new java.awt.Color(204, 204, 255));
        bt78.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt78.setText("2");
        bt78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt78ActionPerformed(evt);
            }
        });

        bt77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt77ActionPerformed(evt);
            }
        });

        bt76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt76ActionPerformed(evt);
            }
        });

        bt79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt79ActionPerformed(evt);
            }
        });

        bt80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt80ActionPerformed(evt);
            }
        });

        bt81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt81ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(bt73, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt74, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(bt76, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt77, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt78, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt75, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(bt79, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt80, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt81, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt75, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt74, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt73, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt78, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt77, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt76, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt79, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt80, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt81, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt64ActionPerformed(evt);
            }
        });

        bt65.setBackground(new java.awt.Color(204, 204, 255));
        bt65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt65.setText("5");
        bt65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt65ActionPerformed(evt);
            }
        });

        bt66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt66ActionPerformed(evt);
            }
        });

        bt69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt69ActionPerformed(evt);
            }
        });

        bt68.setBackground(new java.awt.Color(204, 204, 255));
        bt68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt68.setText("6");
        bt68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt68ActionPerformed(evt);
            }
        });

        bt67.setBackground(new java.awt.Color(204, 204, 255));
        bt67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt67.setText("9");
        bt67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt67ActionPerformed(evt);
            }
        });

        bt70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt70ActionPerformed(evt);
            }
        });

        bt71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt71ActionPerformed(evt);
            }
        });

        bt72.setBackground(new java.awt.Color(204, 204, 255));
        bt72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt72.setText("1");
        bt72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt72ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(bt64, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt65, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(bt67, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt68, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt69, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt66, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(bt70, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt71, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt72, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt66, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt65, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt64, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt69, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt68, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt67, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt70, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt71, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt72, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt55ActionPerformed(evt);
            }
        });

        bt56.setBackground(new java.awt.Color(204, 204, 255));
        bt56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt56.setText("4");
        bt56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt56ActionPerformed(evt);
            }
        });

        bt57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt57ActionPerformed(evt);
            }
        });

        bt60.setBackground(new java.awt.Color(204, 204, 255));
        bt60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt60.setText("5");
        bt60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt60ActionPerformed(evt);
            }
        });

        bt59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt59ActionPerformed(evt);
            }
        });

        bt58.setBackground(new java.awt.Color(204, 204, 255));
        bt58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt58.setText("3");
        bt58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt58ActionPerformed(evt);
            }
        });

        bt61.setBackground(new java.awt.Color(204, 204, 255));
        bt61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt61.setText("6");
        bt61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt61ActionPerformed(evt);
            }
        });

        bt62.setBackground(new java.awt.Color(204, 204, 255));
        bt62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt62.setText("8");
        bt62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt62ActionPerformed(evt);
            }
        });

        bt63.setBackground(new java.awt.Color(204, 204, 255));
        bt63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt63.setText("9");
        bt63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(bt55, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt56, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(bt58, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt59, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt60, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt57, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(bt61, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt62, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt63, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt57, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt56, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt55, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt60, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt59, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt58, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt61, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt62, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt63, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jb1.setBackground(new java.awt.Color(0, 0, 0));
        jb1.setForeground(new java.awt.Color(255, 255, 255));
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setBackground(new java.awt.Color(0, 0, 0));
        jb2.setForeground(new java.awt.Color(255, 255, 255));
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setBackground(new java.awt.Color(0, 0, 0));
        jb3.setForeground(new java.awt.Color(255, 255, 255));
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(0, 0, 0));
        jb4.setForeground(new java.awt.Color(255, 255, 255));
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb6.setBackground(new java.awt.Color(0, 0, 0));
        jb6.setForeground(new java.awt.Color(255, 255, 255));
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.setBackground(new java.awt.Color(0, 0, 0));
        jb7.setForeground(new java.awt.Color(255, 255, 255));
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb8.setBackground(new java.awt.Color(0, 0, 0));
        jb8.setForeground(new java.awt.Color(255, 255, 255));
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb5.setBackground(new java.awt.Color(0, 0, 0));
        jb5.setForeground(new java.awt.Color(255, 255, 255));
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb9.setBackground(new java.awt.Color(0, 0, 0));
        jb9.setForeground(new java.awt.Color(255, 255, 255));
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 255, 255));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        moves.setBackground(new java.awt.Color(204, 255, 255));
        moves.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        moves.setText("CHECK MOVES");
        moves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movesActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 255, 255));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        solution.setBackground(new java.awt.Color(204, 255, 255));
        solution.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        solution.setText("SOLUTION");
        solution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moves, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solution))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moves, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(solution, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        bt1.setText(turn);
        bt1.setBackground(white);
        boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        bt2.setText(turn);
        bt2.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        bt3.setText(turn);
        bt3.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
         bt6.setText(turn);
        bt6.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        bt5.setText(turn);
        bt5.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
         bt8.setText(turn);
        bt8.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        // TODO add your handling code here:
         bt11.setText(turn);
        bt11.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        // TODO add your handling code here:
         bt12.setText(turn);
        bt12.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt15ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt15ActionPerformed

    private void bt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt14ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt14ActionPerformed

    private void bt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt13ActionPerformed
        // TODO add your handling code here:
         bt13.setText(turn);
        bt13.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt13ActionPerformed

    private void bt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt16ActionPerformed
        // TODO add your handling code here:
         bt16.setText(turn);
        bt16.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt16ActionPerformed

    private void bt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt17ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt17ActionPerformed

    private void bt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt18ActionPerformed
        // TODO add your handling code here:
         bt18.setText(turn);
        bt18.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt18ActionPerformed

    private void bt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt19ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt19ActionPerformed

    private void bt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt20ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt20ActionPerformed

    private void bt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt21ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt21ActionPerformed

    private void bt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt24ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt24ActionPerformed

    private void bt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt23ActionPerformed
        // TODO add your handling code here:
         bt23.setText(turn);
        bt23.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt23ActionPerformed

    private void bt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt22ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt22ActionPerformed

    private void bt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt25ActionPerformed
        // TODO add your handling code here:
         bt25.setText(turn);
        bt25.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt25ActionPerformed

    private void bt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt26ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt26ActionPerformed

    private void bt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt27ActionPerformed
        // TODO add your handling code here:
         bt27.setText(turn);
        bt27.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt27ActionPerformed

    private void bt46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt46ActionPerformed
        // TODO add your handling code here:
         bt46.setText(turn);
        bt46.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt46ActionPerformed

    private void bt47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt47ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt47ActionPerformed

    private void bt48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt48ActionPerformed
        // TODO add your handling code here:
           bt48.setText(turn);
        bt48.setBackground(white);
        boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt48ActionPerformed

    private void bt51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt51ActionPerformed
        // TODO add your handling code here:
           bt51.setText(turn);
        bt51.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt51ActionPerformed

    private void bt50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt50ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt50ActionPerformed

    private void bt49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt49ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt49ActionPerformed

    private void bt52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt52ActionPerformed
        // TODO add your handling code here:
         bt52.setText(turn);
        bt52.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt52ActionPerformed

    private void bt53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt53ActionPerformed
        // TODO add your handling code here:
         bt53.setText(turn);
        bt53.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt53ActionPerformed

    private void bt54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt54ActionPerformed
        // TODO add your handling code here:
         bt54.setText(turn);
        bt54.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt54ActionPerformed

    private void bt37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt37ActionPerformed
        // TODO add your handling code here:
         bt37.setText(turn);
        bt37.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt37ActionPerformed

    private void bt38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt38ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt38ActionPerformed

    private void bt39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt39ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt39ActionPerformed

    private void bt42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt42ActionPerformed
        // TODO add your handling code here:
         bt42.setText(turn);
        bt42.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt42ActionPerformed

    private void bt41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt41ActionPerformed
        // TODO add your handling code here:
         bt41.setText(turn);
        bt41.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt41ActionPerformed

    private void bt40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt40ActionPerformed
        // TODO add your handling code here:
         bt40.setText(turn);
        bt40.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt40ActionPerformed

    private void bt43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt43ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt43ActionPerformed

    private void bt44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt44ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt44ActionPerformed

    private void bt45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt45ActionPerformed
        // TODO add your handling code here:
         bt45.setText(turn);
        bt45.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt45ActionPerformed

    private void bt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt28ActionPerformed
        // TODO add your handling code here:
         bt28.setText(turn);
        bt28.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt28ActionPerformed

    private void bt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt29ActionPerformed
        // TODO add your handling code here:
         bt29.setText(turn);
        bt29.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt29ActionPerformed

    private void bt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt30ActionPerformed
        // TODO add your handling code here:
         bt30.setText(turn);
        bt30.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt30ActionPerformed

    private void bt33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt33ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt33ActionPerformed

    private void bt32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt32ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt32ActionPerformed

    private void bt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt31ActionPerformed
        // TODO add your handling code here:
         bt31.setText(turn);
        bt31.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt31ActionPerformed

    private void bt34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt34ActionPerformed
        // TODO add your handling code here:
         bt34.setText(turn);
        bt34.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt34ActionPerformed

    private void bt35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt35ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt35ActionPerformed

    private void bt36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt36ActionPerformed
        // TODO add your handling code here:
         bt36.setText(turn);
        bt36.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt36ActionPerformed

    private void bt73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt73ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt73ActionPerformed

    private void bt74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt74ActionPerformed
        // TODO add your handling code here:
         bt74.setText(turn);
        bt74.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt74ActionPerformed

    private void bt75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt75ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt75ActionPerformed

    private void bt78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt78ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt78ActionPerformed

    private void bt77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt77ActionPerformed
        // TODO add your handling code here:
         bt77.setText(turn);
        bt77.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt77ActionPerformed

    private void bt76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt76ActionPerformed
        // TODO add your handling code here:
         bt76.setText(turn);
        bt76.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt76ActionPerformed

    private void bt79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt79ActionPerformed
        // TODO add your handling code here:
         bt79.setText(turn);
        bt79.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt79ActionPerformed

    private void bt80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt80ActionPerformed
        // TODO add your handling code here:
         bt80.setText(turn);
        bt80.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt80ActionPerformed

    private void bt81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt81ActionPerformed
        // TODO add your handling code here:
         bt81.setText(turn);
        bt81.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt81ActionPerformed

    private void bt64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt64ActionPerformed
        // TODO add your handling code here:
         bt64.setText(turn);
        bt64.setBackground(white); boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt64ActionPerformed

    private void bt65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt65ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt65ActionPerformed

    private void bt66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt66ActionPerformed
        // TODO add your handling code here:
        bt66.setText(turn);
        bt66.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt66ActionPerformed

    private void bt69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt69ActionPerformed
        // TODO add your handling code here:
        bt69.setText(turn);
        bt69.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt69ActionPerformed

    private void bt68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt68ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt68ActionPerformed

    private void bt67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt67ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt67ActionPerformed

    private void bt70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt70ActionPerformed
        // TODO add your handling code here:
        bt70.setText(turn);
        bt70.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt70ActionPerformed

    private void bt71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt71ActionPerformed
        // TODO add your handling code here:
         bt71.setText(turn);
        bt71.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt71ActionPerformed

    private void bt72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt72ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt72ActionPerformed

    private void bt55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt55ActionPerformed
        // TODO add your handling code here:
         bt55.setText(turn);
        bt55.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt55ActionPerformed

    private void bt56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt56ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt56ActionPerformed

    private void bt57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt57ActionPerformed
        // TODO add your handling code here:
         bt57.setText(turn);
        bt57.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt57ActionPerformed

    private void bt60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt60ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt60ActionPerformed

    private void bt59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt59ActionPerformed
        // TODO add your handling code here:
         bt59.setText(turn);
        bt59.setBackground(white);
         boolean a = solved();
        if(a==true)
        {
            JOptionPane.showMessageDialog(this, "you won the game", "Message", JOptionPane.INFORMATION_MESSAGE); 
            resetBoard();
        }
    }//GEN-LAST:event_bt59ActionPerformed

    private void bt58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt58ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt58ActionPerformed

    private void bt61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt61ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt61ActionPerformed

    private void bt62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt62ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt62ActionPerformed

    private void bt63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt63ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bt63ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        // TODO add your handling code here:
          turn = "3";
        jb1.setBackground(black);
         jb2.setBackground(black);
         jb3.setBackground(blue);
         jb4.setBackground(black);
         jb5.setBackground(black);
         jb6.setBackground(black);
         jb7.setBackground(black);
         jb8.setBackground(black);
         jb9.setBackground(black);
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // TODO add your handling code here:
        turn = "1";
        jb1.setBackground(blue);
         jb2.setBackground(black);
         jb3.setBackground(black);
         jb4.setBackground(black);
         jb5.setBackground(black);
         jb6.setBackground(black);
         jb7.setBackground(black);
         jb8.setBackground(black);
         jb9.setBackground(black);
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        // TODO add your handling code here:
         turn = "8";
        jb1.setBackground(black);
         jb2.setBackground(black);
         jb3.setBackground(black);
         jb4.setBackground(black);
         jb5.setBackground(black);
         jb6.setBackground(black);
         jb7.setBackground(black);
         jb8.setBackground(blue);
         jb9.setBackground(black);
    }//GEN-LAST:event_jb8ActionPerformed

    private void movesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movesActionPerformed
        // TODO add your handling code here:
        checkMoves();
    }//GEN-LAST:event_movesActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Reset");

        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to reset the board",
                "SUDOKU",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            resetBoard();
        }
    }//GEN-LAST:event_resetActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
          turn = "2";
        jb1.setBackground(black);
         jb2.setBackground(blue);
         jb3.setBackground(black);
         jb4.setBackground(black);
         jb5.setBackground(black);
         jb6.setBackground(black);
         jb7.setBackground(black);
         jb8.setBackground(black);
         jb9.setBackground(black);
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        // TODO add your handling code here:
          turn = "4";
        jb1.setBackground(black);
         jb2.setBackground(black);
         jb3.setBackground(black);
         jb4.setBackground(blue);
         jb5.setBackground(black);
         jb6.setBackground(black);
         jb7.setBackground(black);
         jb8.setBackground(black);
         jb9.setBackground(black);
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        // TODO add your handling code here:
          turn = "5";
        jb1.setBackground(black);
         jb2.setBackground(black);
         jb3.setBackground(black);
         jb4.setBackground(black);
         jb5.setBackground(blue);
         jb6.setBackground(black);
         jb7.setBackground(black);
         jb8.setBackground(black);
         jb9.setBackground(black);
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        // TODO add your handling code here:
          turn = "6";
        jb1.setBackground(black);
         jb2.setBackground(black);
         jb3.setBackground(black);
         jb4.setBackground(black);
         jb5.setBackground(black);
         jb6.setBackground(blue);
         jb7.setBackground(black);
         jb8.setBackground(black);
         jb9.setBackground(black);
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        // TODO add your handling code here:
          turn = "7";
        jb1.setBackground(black);
         jb2.setBackground(black);
         jb3.setBackground(black);
         jb4.setBackground(black);
         jb5.setBackground(black);
         jb6.setBackground(black);
         jb7.setBackground(blue);
         jb8.setBackground(black);
         jb9.setBackground(black);
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        // TODO add your handling code here:
          turn = "9";
        jb1.setBackground(black);
         jb2.setBackground(black);
         jb3.setBackground(black);
         jb4.setBackground(black);
         jb5.setBackground(black);
         jb6.setBackground(black);
         jb7.setBackground(black);
         jb8.setBackground(black);
         jb9.setBackground(blue);
    }//GEN-LAST:event_jb9ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
         JFrame frame  = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "SUDOKU", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void solutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionActionPerformed
        // TODO add your handling code here:
            seeSolution();
    }//GEN-LAST:event_solutionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt14;
    private javax.swing.JButton bt15;
    private javax.swing.JButton bt16;
    private javax.swing.JButton bt17;
    private javax.swing.JButton bt18;
    private javax.swing.JButton bt19;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt20;
    private javax.swing.JButton bt21;
    private javax.swing.JButton bt22;
    private javax.swing.JButton bt23;
    private javax.swing.JButton bt24;
    private javax.swing.JButton bt25;
    private javax.swing.JButton bt26;
    private javax.swing.JButton bt27;
    private javax.swing.JButton bt28;
    private javax.swing.JButton bt29;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt30;
    private javax.swing.JButton bt31;
    private javax.swing.JButton bt32;
    private javax.swing.JButton bt33;
    private javax.swing.JButton bt34;
    private javax.swing.JButton bt35;
    private javax.swing.JButton bt36;
    private javax.swing.JButton bt37;
    private javax.swing.JButton bt38;
    private javax.swing.JButton bt39;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt40;
    private javax.swing.JButton bt41;
    private javax.swing.JButton bt42;
    private javax.swing.JButton bt43;
    private javax.swing.JButton bt44;
    private javax.swing.JButton bt45;
    private javax.swing.JButton bt46;
    private javax.swing.JButton bt47;
    private javax.swing.JButton bt48;
    private javax.swing.JButton bt49;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt50;
    private javax.swing.JButton bt51;
    private javax.swing.JButton bt52;
    private javax.swing.JButton bt53;
    private javax.swing.JButton bt54;
    private javax.swing.JButton bt55;
    private javax.swing.JButton bt56;
    private javax.swing.JButton bt57;
    private javax.swing.JButton bt58;
    private javax.swing.JButton bt59;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt60;
    private javax.swing.JButton bt61;
    private javax.swing.JButton bt62;
    private javax.swing.JButton bt63;
    private javax.swing.JButton bt64;
    private javax.swing.JButton bt65;
    private javax.swing.JButton bt66;
    private javax.swing.JButton bt67;
    private javax.swing.JButton bt68;
    private javax.swing.JButton bt69;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt70;
    private javax.swing.JButton bt71;
    private javax.swing.JButton bt72;
    private javax.swing.JButton bt73;
    private javax.swing.JButton bt74;
    private javax.swing.JButton bt75;
    private javax.swing.JButton bt76;
    private javax.swing.JButton bt77;
    private javax.swing.JButton bt78;
    private javax.swing.JButton bt79;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt80;
    private javax.swing.JButton bt81;
    private javax.swing.JButton bt9;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton moves;
    private javax.swing.JButton reset;
    private javax.swing.JButton solution;
    // End of variables declaration//GEN-END:variables
}
