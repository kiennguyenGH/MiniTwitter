import javax.swing.text.Position;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
public class AdminControlPanel extends javax.swing.JFrame {
    
    /**
     * Creates new form AdminControlPanel
     */
    
    private static AdminControlPanel instance = null;
    private static UserGroup root = null;
    
    public static AdminControlPanel getInstance()
    {
        if (instance == null)
        {
            instance = new AdminControlPanel();
        }
        instance.setVisible(true);
        return instance;
    }
    private AdminControlPanel() {
        root = new UserGroup("root");
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
        btnShowTotalMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTotalMessagesActionPerformed(evt);
            }
        });

        btnShowPositive.setText("<html>Button - Show<ba> Positive Percentage");
        btnShowPositive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPositiveActionPerformed(evt);
            }
        });

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
        if (List.getSelectionPath() != null)
        {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) List.getSelectionPath().getLastPathComponent();
            if (selectedNode.getAllowsChildren() && !tfUserID.getText().isEmpty())
            {
                DefaultTreeModel model = (DefaultTreeModel) List.getModel();
                DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) model.getRoot();
                UserGroup theRoot = (UserGroup) rootNode.getUserObject();
                if (theRoot.findUser(rootNode, tfUserID.getText()) == null)
                {
                    User newUser = new User(tfUserID.getText(), rootNode);
                    UserGroup parent = (UserGroup) selectedNode.getUserObject();
                    parent.addUser(newUser);
                    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(newUser, newUser.getAllowsChildren());
                    selectedNode.add(newNode);
                    model.reload();   
                }
            }
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
        if (List.getSelectionPath() != null)
        {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) List.getSelectionPath().getLastPathComponent();
            if (selectedNode.getAllowsChildren() && !tfGroupID.getText().isEmpty())
            {
                DefaultTreeModel model = (DefaultTreeModel) List.getModel();
                DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) model.getRoot();
                UserGroup theRoot = (UserGroup) rootNode.getUserObject();
                if (theRoot.findGroup(rootNode, tfGroupID.getText()) == null)
                {
                    UserGroup newUser = new UserGroup(tfGroupID.getText());
                    UserGroup parent = (UserGroup) selectedNode.getUserObject();
                    parent.addUser(newUser);
                    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(newUser, newUser.getAllowsChildren());
                    selectedNode.add(newNode);
                    model.reload();   
                }
            }
        }
//        if (List.getSelectionPath() != null)
//        {
//            DefaultTreeModel model = (DefaultTreeModel) List.getModel();
//            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) List.getSelectionPath().getLastPathComponent();
//            if (selectedNode.getAllowsChildren() && !tfGroupID.getText().isEmpty())
//            {
//                TreePath findPath = List.getNextMatch(tfGroupID.getText(), 0, Position.Bias.Forward);
//                if (findPath == null)
//                {
//                    UserGroup newUser = new UserGroup(tfGroupID.getText());
//                    UserGroup parent = (UserGroup) selectedNode.getUserObject();
//                    parent.addUser(newUser);
//                    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(newUser, newUser.getAllowsChildren());
//                    selectedNode.add(newNode);
//                    model.reload();
//                }
//            }
//        }
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
        UserTotalVisitor visitor = new UserTotalVisitor();
        root.accept(visitor);
        AnalysisText.setText("Total number of users: " + visitor.getUserTotal());
    }//GEN-LAST:event_btnShowUserTotalActionPerformed

    private void btnShowGroupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowGroupTotalActionPerformed
        GroupTotalVisitor visitor = new GroupTotalVisitor();
        root.accept(visitor);
        AnalysisText.setText("Total number of groups: " + visitor.getGroupTotal());
    }//GEN-LAST:event_btnShowGroupTotalActionPerformed

    private void btnShowTotalMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTotalMessagesActionPerformed
        MessagesTotalVisitor visitor = new MessagesTotalVisitor();
        root.accept(visitor);
        AnalysisText.setText("Total number of messages: " + visitor.getMessagesTotal());
    }//GEN-LAST:event_btnShowTotalMessagesActionPerformed

    private void btnShowPositiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPositiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowPositiveActionPerformed

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
