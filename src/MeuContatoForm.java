
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class MeuContatoForm extends javax.swing.JFrame {

    /**
     * Creates new form MeuContatoForm
     */
    String imagePth = null; 
    public static int currentUserId; 
    int pos = 0;
    public MeuContatoForm() {
        initComponents();
        populateJtable();
        
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.gray);
        jTable1.setSelectionBackground(Color.lightGray);
        
        JTableHeader th = jTable1.getTableHeader();
        th.setForeground(Color.BLACK);
        
        th.setFont(new Font("Tahoma", Font.BOLD, 14));
        System.out.println(currentUserId+" do contato");
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
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelUserPic = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxGroup = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelContactPic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jButtonBrowseImage = new javax.swing.JButton();
        jButtonAddContact = new javax.swing.JButton();
        jTextFieldLname = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonEditContact = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButtonDeleteContact = new javax.swing.JButton();
        jButtonFirst = new javax.swing.JButton();
        jButtonPrevious = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jButtonLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(46, 204, 113));

        jLabelMin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Meus Contatos");

        jLabelUserPic.setBackground(new java.awt.Color(255, 255, 0));
        jLabelUserPic.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabelUserPic.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabelUserPic.setOpaque(true);

        jLabelUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUsername.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelUserPic, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUserPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelUsername)
                        .addGap(21, 21, 21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelMin))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel4.setBackground(new java.awt.Color(236, 240, 241));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sobrenome:");

        jLabel5.setBackground(new java.awt.Color(236, 240, 241));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nome:");

        jTextFieldFname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFnameActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(236, 240, 241));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");

        jLabel7.setBackground(new java.awt.Color(236, 240, 241));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Email:");

        jLabel8.setBackground(new java.awt.Color(236, 240, 241));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Grupo:");

        jComboBoxGroup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Família", "Amigos", "Trabalho" }));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setBackground(new java.awt.Color(236, 240, 241));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Foto de perfil:");

        jLabel10.setBackground(new java.awt.Color(236, 240, 241));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Endereço:");

        jLabelContactPic.setBackground(new java.awt.Color(102, 102, 102));
        jLabelContactPic.setOpaque(true);

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        jButtonBrowseImage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBrowseImage.setText("Escolher...");
        jButtonBrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseImageActionPerformed(evt);
            }
        });

        jButtonAddContact.setBackground(new java.awt.Color(153, 153, 153));
        jButtonAddContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAddContact.setText("Adicionar");
        jButtonAddContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddContactActionPerformed(evt);
            }
        });

        jTextFieldLname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLnameActionPerformed(evt);
            }
        });

        jTextFieldPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButtonEditContact.setBackground(new java.awt.Color(153, 153, 153));
        jButtonEditContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonEditContact.setText("Editar");
        jButtonEditContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditContactActionPerformed(evt);
            }
        });

        jTextFieldId.setEditable(false);
        jTextFieldId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(236, 240, 241));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("ID:");

        jButtonDeleteContact.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDeleteContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonDeleteContact.setText("Deletar");
        jButtonDeleteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteContactActionPerformed(evt);
            }
        });

        jButtonFirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFirst.setText("<<");
        jButtonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFirstActionPerformed(evt);
            }
        });

        jButtonPrevious.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPrevious.setText("<");
        jButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousActionPerformed(evt);
            }
        });

        jButtonNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNext.setText(">");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonLast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonLast.setText(">>");
        jButtonLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldFname)
                                    .addComponent(jComboBoxGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldLname)
                                    .addComponent(jTextFieldPhone)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLast, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelContactPic, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBrowseImage))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonAddContact)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditContact, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDeleteContact, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonFirst)
                            .addComponent(jButtonPrevious)
                            .addComponent(jButtonNext)
                            .addComponent(jButtonLast)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelContactPic, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBrowseImage))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAddContact)
                            .addComponent(jButtonEditContact)
                            .addComponent(jButtonDeleteContact)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateJtable() {
        
        contactQuery cq = new contactQuery();
        ArrayList<contato> ctList = cq.ContactList(currentUserId);
        String[] colNames = {"Id", "Nome", "Sobrenome", "Grupo", "Telefone", "Email", "Endereço", "Foto"};
        Object[][] rows = new Object[ctList.size()][8]; 
        
        for(int i = 0; i < ctList.size(); i++) {
            rows[i][0] = ctList.get(i).getCid();
            rows[i][1] = ctList.get(i).getNome();
            rows[i][2] = ctList.get(i).getSobrenome();
            rows[i][3] = ctList.get(i).getGrupoc();
            rows[i][4] = ctList.get(i).getTelefone();
            rows[i][5] = ctList.get(i).getEmail();
            rows[i][6] = ctList.get(i).getEndereco();
            
            ImageIcon foto = new ImageIcon(new ImageIcon(ctList.get(i).getFoto()).getImage().getScaledInstance(120, 80, Image.SCALE_SMOOTH));
            
            rows[i][7] = foto;
            
        }
        
        MyModel mmd = new MyModel(rows, colNames);
        jTable1.setModel(mmd);
        jTable1.setRowHeight(80);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(120);
        
    }
    
    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jTextFieldFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFnameActionPerformed

    private void jButtonBrowseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowseImageActionPerformed
        
        Myfunc mf = new Myfunc();
        imagePth = mf.browseImage(jLabelContactPic);
        System.out.println(imagePth);

    }//GEN-LAST:event_jButtonBrowseImageActionPerformed

    private void jButtonAddContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddContactActionPerformed
        
        String nome = jTextFieldFname.getText();
        String sobrenome = jTextFieldLname.getText();
        String telefone = jTextFieldPhone.getText();
        String endereco = jTextAreaAddress.getText();
        String email = jTextFieldEmail.getText();
        String grupoc = jComboBoxGroup.getSelectedItem().toString();
        
        
        byte[] img = null;
        if(imagePth != null) {
            try {

                Path pth = Paths.get(imagePth);
                img = Files.readAllBytes(pth);
                contato c = new contato(null, nome, sobrenome, grupoc, telefone, email, endereco, img, currentUserId);
                contactQuery cq = new contactQuery();
                cq.insertContact(c);
                refreshJtable();
                clearFields();
            } catch (IOException ex) {
                Logger.getLogger(MeuContatoForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Precisa selecionar uma foto de perfil!");
        }

    }//GEN-LAST:event_jButtonAddContactActionPerformed

    private void jTextFieldLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLnameActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // mostra a data da JTable selecionada
        
        // mostrar o índice da fileira
        int rowIndex = jTable1.getSelectedRow();
        jTextFieldFname.setText(jTable1.getValueAt(rowIndex, 1).toString());
        jTextFieldLname.setText(jTable1.getValueAt(rowIndex, 2).toString());
        
        // grupo telefone email endereço foto
        jComboBoxGroup.setSelectedItem(jTable1.getValueAt(rowIndex, 3));
        jTextFieldPhone.setText(jTable1.getValueAt(rowIndex, 4).toString());
        jTextFieldEmail.setText(jTable1.getValueAt(rowIndex, 5).toString());
        jTextFieldId.setText(jTable1.getValueAt(rowIndex, 0).toString());
        jTextAreaAddress.setText(jTable1.getValueAt(rowIndex, 6).toString());
        
        Image foto = ((ImageIcon)jTable1.getValueAt(rowIndex, 7)).getImage().getScaledInstance(jLabelContactPic.getWidth(), jLabelContactPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(foto);
        
        jLabelContactPic.setIcon(img);
        
    }//GEN-LAST:event_jTable1MouseClicked
    
    public void refreshJtable() {
        jTable1.setModel(new DefaultTableModel());
        populateJtable();
    }
    
    public void clearFields() {
        jTextFieldId.setText("");
        jTextFieldFname.setText("");
        jTextFieldLname.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPhone.setText("");
        jTextAreaAddress.setText("");
        jComboBoxGroup.setSelectedIndex(0);
        jLabelContactPic.setIcon(null);
        imagePth = null;
    }
    
    private void showData(int index) {
        // mostrar o índice da fileira
        jTextFieldFname.setText(jTable1.getValueAt(index, 1).toString());
        jTextFieldLname.setText(jTable1.getValueAt(index, 2).toString());
        
        // grupo telefone email endereço foto
        jComboBoxGroup.setSelectedItem(jTable1.getValueAt(index, 3));
        jTextFieldPhone.setText(jTable1.getValueAt(index, 4).toString());
        jTextFieldEmail.setText(jTable1.getValueAt(index, 5).toString());
        jTextFieldId.setText(jTable1.getValueAt(index, 0).toString());
        jTextAreaAddress.setText(jTable1.getValueAt(index, 6).toString());
        
        Image foto = ((ImageIcon)jTable1.getValueAt(index, 7)).getImage().getScaledInstance(jLabelContactPic.getWidth(), jLabelContactPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(foto);
        
        jLabelContactPic.setIcon(img);
    }
    
    private void jButtonEditContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditContactActionPerformed
        
        if(!jTextFieldId.getText().equals("")) {
        
        int id = Integer.valueOf(jTextFieldId.getText());
        String nome = jTextFieldFname.getText();
        String sobrenome = jTextFieldLname.getText();
        String telefone = jTextFieldPhone.getText();
        String endereco = jTextAreaAddress.getText();
        String email = jTextFieldEmail.getText();
        String grupoc = jComboBoxGroup.getSelectedItem().toString();
        
        // se o usuário quiser editar foto e informações do contato
        if(imagePth != null) {
        byte[] img = null;
            try {

                Path pth = Paths.get(imagePth);
                img = Files.readAllBytes(pth);
                
                contato c = new contato(id, nome, sobrenome, grupoc, telefone, email, endereco, img, currentUserId);
                contactQuery cq = new contactQuery();
                cq.updateContact(c, true);
                refreshJtable();
                clearFields();
                
            } catch (IOException ex) {
                Logger.getLogger(MeuContatoForm.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }else {
                contato c = new contato(id, nome, sobrenome, grupoc, telefone, email, endereco, null, currentUserId);
                contactQuery cq = new contactQuery();
                cq.updateContact(c, false);
                refreshJtable();
                clearFields();
        }
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um contato da tabela!");
        }    
        

        
    }//GEN-LAST:event_jButtonEditContactActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jButtonDeleteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteContactActionPerformed
        
        if(!jTextFieldId.getText().equals("")){
            int id = Integer.valueOf(jTextFieldId.getText());
            contactQuery cq = new contactQuery();
            cq.deleteContact(id);
            refreshJtable();
            clearFields();
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um contato da tabela!");
        }
        
    }//GEN-LAST:event_jButtonDeleteContactActionPerformed

    private void jButtonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFirstActionPerformed
        pos = 0;
        showData(pos);
    }//GEN-LAST:event_jButtonFirstActionPerformed

    private void jButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousActionPerformed
        pos--;
        showData(pos);
    }//GEN-LAST:event_jButtonPreviousActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        pos++;
        showData(pos);
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLastActionPerformed
        pos = jTable1.getRowCount() - 1;
        showData(pos);
    }//GEN-LAST:event_jButtonLastActionPerformed

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
            java.util.logging.Logger.getLogger(MeuContatoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeuContatoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeuContatoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeuContatoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeuContatoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddContact;
    private javax.swing.JButton jButtonBrowseImage;
    private javax.swing.JButton jButtonDeleteContact;
    private javax.swing.JButton jButtonEditContact;
    private javax.swing.JButton jButtonFirst;
    private javax.swing.JButton jButtonLast;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JComboBox<String> jComboBoxGroup;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelContactPic;
    private javax.swing.JLabel jLabelMin;
    public javax.swing.JLabel jLabelUserPic;
    public javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLname;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}