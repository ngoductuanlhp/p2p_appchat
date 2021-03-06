package ui;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Khoa
 */

import backend.client.ChatClient;
import com.application.chatboxp2p.staticdata.Friend;
import com.application.chatboxp2p.staticdata.ListFriends;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MainUI extends javax.swing.JFrame {
    private String another_path = "/src/main/java/images/";
    private String path_win = "\\src\\main\\java\\images\\";
    private String os = System.getProperty("os.name").toLowerCase();
    private String dir;

    private HashMap<Integer, JTextPane> list_chat_section = new HashMap<>(); // TEST
    private ListFriends lf = new ListFriends();
    private static boolean first_time = true;
//    private JTextPane current_text_pane;

    // Backend
    private ChatClient client;

    public ChatClient getClient() {
        return this.client;
    }

    public ListFriends getLf() {
        return this.lf;
    }

    public MainUI() {
        if (os.equals("windows 10")){
            dir = System.getProperty("user.dir") + path_win;
        }
        else{
            dir = System.getProperty("user.dir") + another_path;
        }
        System.out.println("CREATE MAINUI");
        initComponents();
        this.chat_box.setVisible(false);
        //init List Friend
        list_user.setCellRenderer(new UserRenderer());
        list_user.setModel(lf.getListModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        main_UI_pane = new javax.swing.JPanel();
        user_status_pane = new javax.swing.JPanel();
        profile_icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        add_user_but = new javax.swing.JButton();
        list_user_pane = new javax.swing.JPanel();
        find_user_field = new javax.swing.JTextField();
        del_user_but = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_user = new javax.swing.JList<>();
        chat_box = new javax.swing.JPanel();
        chat_pane = new javax.swing.JPanel();
        user_name_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chat_section = new javax.swing.JPanel();
        text_pane = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        input_text = new javax.swing.JTextArea();
        send_mess_but = new javax.swing.JButton();
        attach_file_but = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_but = new javax.swing.JMenu();
        logout_but = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Box");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator1.setOpaque(true);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 10, 460));

        main_UI_pane.setBackground(new java.awt.Color(51, 204, 255));
        main_UI_pane.setOpaque(false);
        main_UI_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_status_pane.setOpaque(false);
        user_status_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile_icon.setBackground(new java.awt.Color(0, 102, 102));
        profile_icon.setIcon(new javax.swing.ImageIcon(dir +"profile_icon.png")); // NOI18N
        user_status_pane.add(profile_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Chats");
        user_status_pane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 70, 80));

        add_user_but.setBackground(new java.awt.Color(0, 102, 102));
        add_user_but.setIcon(new javax.swing.ImageIcon(dir + "icons8_add_user_male_48px_1.png")); // NOI18N
        add_user_but.setBorder(null);
        user_status_pane.add(add_user_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 50, -1));

        main_UI_pane.add(user_status_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 80));

        list_user_pane.setOpaque(false);
        find_user_field.setBackground(new java.awt.Color(204, 204, 204));
        find_user_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        find_user_field.setForeground(new java.awt.Color(255, 255, 255));
        find_user_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        find_user_field.setOpaque(false);

        del_user_but.setBackground(new java.awt.Color(0, 102, 102));
        del_user_but.setIcon(new javax.swing.ImageIcon(dir + "delete_user.png")); // NOI18N
        del_user_but.setBorderPainted(false);

        list_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        list_user.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(list_user);

        javax.swing.GroupLayout list_user_paneLayout = new javax.swing.GroupLayout(list_user_pane);
        list_user_pane.setLayout(list_user_paneLayout);
        list_user_paneLayout.setHorizontalGroup(
                list_user_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(list_user_paneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(list_user_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4)
                                        .addGroup(list_user_paneLayout.createSequentialGroup()
                                                .addComponent(find_user_field, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(del_user_but, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        list_user_paneLayout.setVerticalGroup(
                list_user_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(list_user_paneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(list_user_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(find_user_field, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(del_user_but, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
        );

        main_UI_pane.add(list_user_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 370));

        getContentPane().add(main_UI_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 460));

        chat_box.setBackground(new java.awt.Color(0, 0, 0));
        chat_box.setOpaque(false);
        chat_box.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chat_pane.setBackground(new java.awt.Color(0, 102, 102));
        chat_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_name_label.setBackground(new java.awt.Color(0, 102, 102));
        user_name_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        user_name_label.setForeground(new java.awt.Color(255, 255, 255));
        user_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_name_label.setText("Khoa");
        user_name_label.setOpaque(true);
        chat_pane.add(user_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 39));

        javax.swing.GroupLayout chat_sectionLayout = new javax.swing.GroupLayout(chat_section);
        chat_section.setLayout(chat_sectionLayout);
        chat_sectionLayout.setHorizontalGroup(
            chat_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        chat_sectionLayout.setVerticalGroup(
            chat_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(chat_section);

        chat_pane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 370));

        chat_box.add(chat_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 410));

        text_pane.setBackground(new java.awt.Color(0, 51, 51));
        text_pane.setOpaque(false);

        input_text.setColumns(20);
        input_text.setLineWrap(true);
        input_text.setRows(5);
        jScrollPane5.setViewportView(input_text);

        send_mess_but.setIcon(new javax.swing.ImageIcon(dir +"send_mess_icon.png")); // NOI18N
        send_mess_but.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        send_mess_but.setBorderPainted(false);
        send_mess_but.setContentAreaFilled(false);

        attach_file_but.setIcon(new javax.swing.ImageIcon(dir +"attach_icon.png")); // NOI18N
        attach_file_but.setBorderPainted(false);
        attach_file_but.setContentAreaFilled(false);

        javax.swing.GroupLayout text_paneLayout = new javax.swing.GroupLayout(text_pane);
        text_pane.setLayout(text_paneLayout);
        text_paneLayout.setHorizontalGroup(
            text_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, text_paneLayout.createSequentialGroup()
                .addComponent(attach_file_but, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                .addComponent(send_mess_but))
            .addGroup(text_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, text_paneLayout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );
        text_paneLayout.setVerticalGroup(
            text_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(text_paneLayout.createSequentialGroup()
                .addGroup(text_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(send_mess_but, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attach_file_but, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(text_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(text_paneLayout.createSequentialGroup()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        chat_box.add(text_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 610, 30));

        getContentPane().add(chat_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 610, 460));

        jLabel2.setIcon(new javax.swing.ImageIcon(dir +"bg_mainUI.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        file_but.setText("File");

        logout_but.setIcon(new javax.swing.ImageIcon(dir +"logout_icon.png")); // NOI18N
        logout_but.setText("Log Out");
        file_but.add(logout_but);

        jMenuBar1.add(file_but);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void logout_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_butActionPerformed
//        if (JOptionPane.showConfirmDialog(this, "Are you sure?", "Log out", JOptionPane.YES_NO_OPTION) == 0) {
////            loginUI.setVisible(true);
//            this.dispose();
//        }
//    }//GEN-LAST:event_logout_butActionPerformed

    private void add_user_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_user_butActionPerformed
        AddFriendUI addFriendUI = new AddFriendUI();
        addFriendUI.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addFriendUI.setVisible(true);
    }//GEN-LAST:event_add_user_butActionPerformed



    private void close_conversationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_conversationActionPerformed

    }//GEN-LAST:event_close_conversationActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    public void updateFriendList(String username, String status) {
        if (status.equals("on")) {
            this.lf.updateStatus(username, 1);
        }
        else if (status.equals("off")){
            this.lf.updateStatus(username, 0);
        }
        else {
            this.lf.updateStatus(username, 2);
        }
        System.out.println("Feature");
        this.list_user.updateUI();
    }

    public void addFriendList(String username, String status) {
        this.lf.addUser(new Friend(username, status));
        System.out.println("Feature");
        this.list_user.updateUI();
    }

    public void removeFriendList(String username) {
        this.lf.removeUser(username);
        System.out.println("Feature");
        this.list_user.updateUI();
    }

    public JList<String> getList_user() {
        return list_user;
    }

    public JPanel getChat_box() {
        return this.chat_box;
    }

    public HashMap<Integer, JTextPane> getList_chat_section() {
        return this.list_chat_section;
    }

    public JPanel getChat_section() {
        return this.chat_section;
    }

    //    public JTextPane getCurrent_text_pane() {return this.current_text_pane;}
//    public void setCurrent_text_pane(JTextPane j) { this.current_text_pane = j;}
    public JLabel getUser_name_label() {
        return this.user_name_label;
    }

    public JButton getSend_mess_but() {
        return this.send_mess_but;
    }

    public JTextArea getInput_text() {
        return this.input_text;
    }

    public void setInput_text(String t) {
        this.input_text.setText(t);
    }

    public JMenuItem getLogout_but() {
        return this.logout_but;
    }

    public JButton getAttacButton() {return this.attach_file_but;}

    public JButton getAdd_user_but() {return this.add_user_but;}
    public JButton getDel_user_but() {return this.del_user_but;}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_user_but;
    private javax.swing.JButton attach_file_but;
    private javax.swing.JPanel chat_box;
    private javax.swing.JPanel chat_pane;
    private javax.swing.JPanel chat_section;
    private javax.swing.JMenu file_but;
    private javax.swing.JButton del_user_but;
    private javax.swing.JTextField find_user_field;
    private javax.swing.JTextArea input_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> list_user;
    private javax.swing.JPanel list_user_pane;
    private javax.swing.JMenuItem logout_but;
    private javax.swing.JPanel main_UI_pane;
    private javax.swing.JLabel profile_icon;
    private javax.swing.JButton send_mess_but;
    private javax.swing.JPanel text_pane;
    private javax.swing.JLabel user_name_label;
    private javax.swing.JPanel user_status_pane;
    // End of variables declaration//GEN-END:variables
}
