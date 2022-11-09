import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
public class AdminControlPanel extends javax.swing.JFrame {
    
    /**
     * Creates new form AdminControlPanel
     */
    
    private static AdminControlPanel instance = null;
    private static UserGroup root = null;
    
    public static AdminControlPanel getInstance()
    {
        if (root == null)
        {
            root = new UserGroup("root");
        }
        if (instance == null)
        {
            instance = new AdminControlPanel();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControlPanel().setVisible(true);
            }
        });
        return instance;
    }
    private AdminControlPanel() {
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddUser = new javax.swing.JButton();
        btnAddGroup = new javax.swing.JButton();
        btnOpenUserView = new javax.swing.JButton();
        btnShowUserTotal = new javax.swing.JButton();
        tfUserID = new javax.swing.JTextField();
        tfGroupID = new javax.swing.JTextField();
        btnShowGroupTotal = new javax.swing.JButton();
        btnShowTotalMessages = new javax.swing.JButton();
        btnShowPositive = new javax.swing.JButton();
        AnalysisText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddUser.setText("Button - Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnAddGroup.setText("Button - Add Group");
        btnAddGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGroupActionPerformed(evt);
            }
        });

        btnOpenUserView.setLabel("Button - Open User View");
        btnOpenUserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenUserViewActionPerformed(evt);
            }
        });

        btnShowUserTotal.setText("Button - Show User Total");
        btnShowUserTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowUserTotalActionPerformed(evt);
            }
        });

        tfUserID.setText("TextArea - User ID");
        tfUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserIDActionPerformed(evt);
            }
        });

        tfGroupID.setText("TextArea - Group ID");
        tfGroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGroupIDActionPerformed(evt);
            }
        });

        btnShowGroupTotal.setText("Button - Show Group Total");
        btnShowGroupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowGroupTotalActionPerformed(evt);
            }
        });

        btnShowTotalMessages.setText("<html>Button - Show<br>\nMessages Total");

        btnShowPositive.setText("<html>Button - Show<ba>\nPositive Percentage");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode(root);
        List.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(List);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfGroupID)
                            .addComponent(tfUserID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnOpenUserView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnShowTotalMessages)
                                    .addComponent(btnShowUserTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnShowPositive, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnShowGroupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(AnalysisText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUserID)
                            .addComponent(btnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(tfGroupID))
                        .addGap(18, 18, 18)
                        .addComponent(btnOpenUserView, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(AnalysisText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShowUserTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowGroupTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnShowTotalMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(btnShowPositive)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Add user to global list of users
    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) List.getSelectionPath().getLastPathComponent();
        if (selectedNode.getAllowsChildren() && !tfUserID.getText().isEmpty())
        {
            User newUser = new User(tfUserID.getText());
            UserGroup parent = (UserGroup) selectedNode.getUserObject();
            parent.addUser(newUser);
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(newUser, newUser.getAllowsChildren());
            selectedNode.add(newNode);
            DefaultTreeModel model = (DefaultTreeModel) List.getModel();
            model.reload();
            
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnOpenUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenUserViewActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) List.getSelectionPath().getLastPathComponent();
        if (!selectedNode.getAllowsChildren())
        {
            User selectedUser = (User) selectedNode.getUserObject();
            UserView view = new UserView(selectedUser);
            view.setVisible(true);
        }
    }//GEN-LAST:event_btnOpenUserViewActionPerformed

    private void btnAddGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGroupActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) List.getSelectionPath().getLastPathComponent();
        if (selectedNode.getAllowsChildren() && !tfUserID.getText().isEmpty())
        {
            UserGroup newUser = new UserGroup(tfGroupID.getText());
            UserGroup parent = (UserGroup) selectedNode.getUserObject();
            parent.addUser(newUser);
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(newUser, newUser.getAllowsChildren());
            selectedNode.add(newNode);
            DefaultTreeModel model = (DefaultTreeModel) List.getModel();
            model.reload();
            
        }
    }//GEN-LAST:event_btnAddGroupActionPerformed

    private void tfGroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGroupIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGroupIDActionPerformed

    private void tfUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserIDActionPerformed
//        if (tfUserID.getText().length() > 0)
//        {
//            addUser(new User(tfUserID.getText()));
//        }
    }//GEN-LAST:event_tfUserIDActionPerformed

    private void btnShowUserTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowUserTotalActionPerformed
//        String text = "";
//        text += users.size();
//        AnalysisText.setText(text);
    }//GEN-LAST:event_btnShowUserTotalActionPerformed

    private void btnShowGroupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowGroupTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowGroupTotalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnalysisText;
    private javax.swing.JTree List;
    private javax.swing.JButton btnAddGroup;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnOpenUserView;
    private javax.swing.JButton btnShowGroupTotal;
    private javax.swing.JButton btnShowPositive;
    private javax.swing.JButton btnShowTotalMessages;
    private javax.swing.JButton btnShowUserTotal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tfGroupID;
    private javax.swing.JTextField tfUserID;
    // End of variables declaration//GEN-END:variables
}
