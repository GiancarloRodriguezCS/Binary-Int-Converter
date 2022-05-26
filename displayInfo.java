public class displayInfo extends javax.swing.JFrame {


    public displayInfo() {
        initComponents();
    }


    private void initComponents() {
        String wordNum = mainFrame.getNum();

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        double pow;

        String newNum = String.valueOf(Integer.parseInt(wordNum, 2));

        jLabel1.setText("Your new number:");

        jLabel3.setText(newNum);

        jLabel4.setText("The Math:");

        String blah = "";
        if(wordNum.length() == 8){
            pow = 7;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    blah += String.valueOf((int)Math.pow(2,pow));
                    if(i != wordNum.length() - 1) {
                        blah += "+";
                    }
                }

                pow--;
            }
        }
        else if(wordNum.length() == 7){
            pow = 6;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    blah += String.valueOf((int)Math.pow(2,pow));
                    if(i != wordNum.length() - 1) {
                        blah += "+";
                    }
                }

                pow--;
            }
        }
        else if(wordNum.length() == 6){
            pow = 5;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    blah += String.valueOf((int)Math.pow(2,pow));
                    if(i != wordNum.length() - 1) {
                        blah += "+";
                    }
                }

                pow--;
            }
        }
        else if(wordNum.length() == 5){
            pow = 4;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    blah += String.valueOf((int)Math.pow(2,pow));
                    if(i != wordNum.length() - 1) {
                        blah += "+";
                    }
                }


                pow--;
            }
        }
        else if(wordNum.length() == 4){
            pow = 3;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    blah += String.valueOf((int)Math.pow(2,pow));
                    if(i != wordNum.length() - 1 ) {
                        blah += "+";
                    }
                }

                pow--;
            }
        }
        else if(wordNum.length() == 3){
            pow = 2;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    blah += String.valueOf((int)Math.pow(2,pow));
                    if(i != wordNum.length() - 1) {
                        blah += "+";
                    }
                }

                pow--;
            }
        }
        else if(wordNum.length() == 2){
            pow = 1;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    blah += String.valueOf((int)Math.pow(2,pow));
                    if(i != wordNum.length() - 1) {
                        blah += "+";
                    }
                }

                pow--;
            }
        }
        else if(wordNum.length() == 1){
            pow = 0;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    blah += String.valueOf((int)Math.pow(2,pow));
                }
                pow--;
            }
        }
        blah += " = " + newNum;

        jLabel5.setText(blah);

        jLabel6.setText("Your old number:");

        jLabel7.setText(mainFrame.getNum());

        String addOn = "";
        if(wordNum.length() == 8){
            pow = 7;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    addOn += String.valueOf((int)Math.pow(2,pow));
                }
                else{
                    addOn += "0";

                }
                addOn += " ";
                pow--;
            }
        }
        else if(wordNum.length() == 7){
            pow = 6;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    addOn += String.valueOf((int)Math.pow(2,pow));
                }
                else{
                    addOn += "0";

                }
                addOn += " ";
                pow--;
            }
        }
        else if(wordNum.length() == 6){
            pow = 5;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    addOn += String.valueOf((int)Math.pow(2,pow));
                }
                else{
                    addOn += "0";

                }
                addOn += " ";
                pow--;
            }
        }
        else if(wordNum.length() == 5){
            pow = 4;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    addOn += String.valueOf((int)Math.pow(2,pow));
                }
                else{
                    addOn += "0";

                }
                addOn += " ";
                pow--;
            }
        }
        else if(wordNum.length() == 4){
            pow = 3;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    addOn += String.valueOf((int)Math.pow(2,pow));
                }
                else{
                    addOn += "0";

                }
                addOn += " ";
                pow--;
            }
        }
        else if(wordNum.length() == 3){
            pow = 2;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    addOn += String.valueOf((int)Math.pow(2,pow));
                }
                else{
                    addOn += "0";

                }
                addOn += " ";
                pow--;
            }
        }
        else if(wordNum.length() == 2){
            pow = 1;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    addOn += String.valueOf((int)Math.pow(2,pow));
                }
                else{
                    addOn += "0";

                }
                addOn += " ";
                pow--;
            }
        }
        else if(wordNum.length() == 1){
            pow = 0;
            for(int i = 0; i < wordNum.length(); i++){
                if(wordNum.substring(i,i+1).equalsIgnoreCase("1")){
                    addOn += String.valueOf((int)Math.pow(2,pow));
                }
                else{
                    addOn += "0";

                }
                addOn += " ";
                pow--;
            }
        }

        jLabel8.setText(addOn);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7))
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)
                                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>


    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new displayInfo().setVisible(true);
            }
        });
    }

}
