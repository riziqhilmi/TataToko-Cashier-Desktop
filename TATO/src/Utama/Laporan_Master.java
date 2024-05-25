/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Utama;

import static Utama.koneksi.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author acer
 */
public class Laporan_Master extends javax.swing.JPanel {

    
    koneksi db = new koneksi();
    java.sql.Connection con;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/tatatoko";
    private final String user = "root";
    private final String pwd = "";
    
    /**
     * Creates new form Beranda
     */
    public Laporan_Master() {
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

        pn_Laporan_Master = new javax.swing.JPanel();
        Lb_Laporan_Master = new javax.swing.JLabel();
        pn_Konten_Laporan_Master = new javax.swing.JPanel();
        pn_Laporan_Barang = new javax.swing.JPanel();
        pn_Ctrl_Laporan_Barang = new javax.swing.JPanel();
        Btn_Tambah_Laporan_Barang = new javax.swing.JButton();
        Lb_Laporan_Barang = new javax.swing.JLabel();
        pn_Konten_Laporan_Barang = new javax.swing.JPanel();
        pn_Laporan_Distributor = new javax.swing.JPanel();
        pn_Ctrl_Laporan_Distributor = new javax.swing.JPanel();
        Btn_Tambah_Laporan_Distributor = new javax.swing.JButton();
        Lb_Laporan_Distributor = new javax.swing.JLabel();
        pn_Konten_Laporan_Distributor = new javax.swing.JPanel();
        Btn_Laporan_Barang = new javax.swing.JButton();
        Btn_Laporan_Distributor = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1182, 686));

        pn_Laporan_Master.setBackground(new java.awt.Color(255, 255, 255));
        pn_Laporan_Master.setPreferredSize(new java.awt.Dimension(1182, 686));

        Lb_Laporan_Master.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Lb_Laporan_Master.setText("Laporan Master");

        pn_Konten_Laporan_Master.setLayout(new java.awt.CardLayout());

        pn_Ctrl_Laporan_Barang.setBackground(new java.awt.Color(255, 255, 255));

        Btn_Tambah_Laporan_Barang.setBackground(new java.awt.Color(0, 0, 204));
        Btn_Tambah_Laporan_Barang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_Tambah_Laporan_Barang.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Tambah_Laporan_Barang.setText("Tambah");
        Btn_Tambah_Laporan_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Tambah_Laporan_BarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_Ctrl_Laporan_BarangLayout = new javax.swing.GroupLayout(pn_Ctrl_Laporan_Barang);
        pn_Ctrl_Laporan_Barang.setLayout(pn_Ctrl_Laporan_BarangLayout);
        pn_Ctrl_Laporan_BarangLayout.setHorizontalGroup(
            pn_Ctrl_Laporan_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Ctrl_Laporan_BarangLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(Btn_Tambah_Laporan_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        pn_Ctrl_Laporan_BarangLayout.setVerticalGroup(
            pn_Ctrl_Laporan_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Ctrl_Laporan_BarangLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Btn_Tambah_Laporan_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        Lb_Laporan_Barang.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        Lb_Laporan_Barang.setText("Barang");

        pn_Konten_Laporan_Barang.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_Konten_Laporan_BarangLayout = new javax.swing.GroupLayout(pn_Konten_Laporan_Barang);
        pn_Konten_Laporan_Barang.setLayout(pn_Konten_Laporan_BarangLayout);
        pn_Konten_Laporan_BarangLayout.setHorizontalGroup(
            pn_Konten_Laporan_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        pn_Konten_Laporan_BarangLayout.setVerticalGroup(
            pn_Konten_Laporan_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_Laporan_BarangLayout = new javax.swing.GroupLayout(pn_Laporan_Barang);
        pn_Laporan_Barang.setLayout(pn_Laporan_BarangLayout);
        pn_Laporan_BarangLayout.setHorizontalGroup(
            pn_Laporan_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Laporan_BarangLayout.createSequentialGroup()
                .addGroup(pn_Laporan_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_Laporan_BarangLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(pn_Ctrl_Laporan_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_Laporan_BarangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lb_Laporan_Barang)))
                .addGap(18, 18, 18)
                .addComponent(pn_Konten_Laporan_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pn_Laporan_BarangLayout.setVerticalGroup(
            pn_Laporan_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Laporan_BarangLayout.createSequentialGroup()
                .addGroup(pn_Laporan_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_Laporan_BarangLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Lb_Laporan_Barang)
                        .addGap(32, 32, 32)
                        .addComponent(pn_Ctrl_Laporan_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_Laporan_BarangLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(pn_Konten_Laporan_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pn_Konten_Laporan_Master.add(pn_Laporan_Barang, "card2");

        pn_Ctrl_Laporan_Distributor.setBackground(new java.awt.Color(255, 255, 255));

        Btn_Tambah_Laporan_Distributor.setBackground(new java.awt.Color(0, 0, 204));
        Btn_Tambah_Laporan_Distributor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_Tambah_Laporan_Distributor.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Tambah_Laporan_Distributor.setText("Tambah");
        Btn_Tambah_Laporan_Distributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Tambah_Laporan_DistributorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_Ctrl_Laporan_DistributorLayout = new javax.swing.GroupLayout(pn_Ctrl_Laporan_Distributor);
        pn_Ctrl_Laporan_Distributor.setLayout(pn_Ctrl_Laporan_DistributorLayout);
        pn_Ctrl_Laporan_DistributorLayout.setHorizontalGroup(
            pn_Ctrl_Laporan_DistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Ctrl_Laporan_DistributorLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(Btn_Tambah_Laporan_Distributor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        pn_Ctrl_Laporan_DistributorLayout.setVerticalGroup(
            pn_Ctrl_Laporan_DistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Ctrl_Laporan_DistributorLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Btn_Tambah_Laporan_Distributor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        Lb_Laporan_Distributor.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        Lb_Laporan_Distributor.setText("Distributor");

        pn_Konten_Laporan_Distributor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_Konten_Laporan_DistributorLayout = new javax.swing.GroupLayout(pn_Konten_Laporan_Distributor);
        pn_Konten_Laporan_Distributor.setLayout(pn_Konten_Laporan_DistributorLayout);
        pn_Konten_Laporan_DistributorLayout.setHorizontalGroup(
            pn_Konten_Laporan_DistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        pn_Konten_Laporan_DistributorLayout.setVerticalGroup(
            pn_Konten_Laporan_DistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_Laporan_DistributorLayout = new javax.swing.GroupLayout(pn_Laporan_Distributor);
        pn_Laporan_Distributor.setLayout(pn_Laporan_DistributorLayout);
        pn_Laporan_DistributorLayout.setHorizontalGroup(
            pn_Laporan_DistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Laporan_DistributorLayout.createSequentialGroup()
                .addGroup(pn_Laporan_DistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_Laporan_DistributorLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(pn_Ctrl_Laporan_Distributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_Laporan_DistributorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lb_Laporan_Distributor)))
                .addGap(18, 18, 18)
                .addComponent(pn_Konten_Laporan_Distributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pn_Laporan_DistributorLayout.setVerticalGroup(
            pn_Laporan_DistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Laporan_DistributorLayout.createSequentialGroup()
                .addGroup(pn_Laporan_DistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_Laporan_DistributorLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Lb_Laporan_Distributor)
                        .addGap(32, 32, 32)
                        .addComponent(pn_Ctrl_Laporan_Distributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_Laporan_DistributorLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(pn_Konten_Laporan_Distributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pn_Konten_Laporan_Master.add(pn_Laporan_Distributor, "card2");

        Btn_Laporan_Barang.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Btn_Laporan_Barang.setText("Barang");
        Btn_Laporan_Barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Laporan_BarangMouseClicked(evt);
            }
        });

        Btn_Laporan_Distributor.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Btn_Laporan_Distributor.setText("Distributor");
        Btn_Laporan_Distributor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Laporan_DistributorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_Laporan_MasterLayout = new javax.swing.GroupLayout(pn_Laporan_Master);
        pn_Laporan_Master.setLayout(pn_Laporan_MasterLayout);
        pn_Laporan_MasterLayout.setHorizontalGroup(
            pn_Laporan_MasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Laporan_MasterLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pn_Laporan_MasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_Konten_Laporan_Master, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_Laporan_MasterLayout.createSequentialGroup()
                        .addGroup(pn_Laporan_MasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_Laporan_MasterLayout.createSequentialGroup()
                                .addComponent(Btn_Laporan_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Btn_Laporan_Distributor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Lb_Laporan_Master))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_Laporan_MasterLayout.setVerticalGroup(
            pn_Laporan_MasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Laporan_MasterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Lb_Laporan_Master)
                .addGap(45, 45, 45)
                .addGroup(pn_Laporan_MasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Laporan_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Laporan_Distributor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_Konten_Laporan_Master, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_Laporan_Master, javax.swing.GroupLayout.DEFAULT_SIZE, 1666, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_Laporan_Master, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Laporan_BarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Laporan_BarangMouseClicked
        pn_Konten_Laporan_Master.removeAll();
        pn_Konten_Laporan_Master.repaint();
        pn_Konten_Laporan_Master.revalidate();
        
        pn_Konten_Laporan_Master.add(pn_Laporan_Barang);
        pn_Konten_Laporan_Master.repaint();
        pn_Konten_Laporan_Master.revalidate();
    }//GEN-LAST:event_Btn_Laporan_BarangMouseClicked

    private void Btn_Laporan_DistributorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Laporan_DistributorMouseClicked
        pn_Konten_Laporan_Master.removeAll();
        pn_Konten_Laporan_Master.repaint();
        pn_Konten_Laporan_Master.revalidate();
        
        pn_Konten_Laporan_Master.add(pn_Laporan_Distributor);
        pn_Konten_Laporan_Master.repaint();
        pn_Konten_Laporan_Master.revalidate();
    }//GEN-LAST:event_Btn_Laporan_DistributorMouseClicked

    private void Btn_Tambah_Laporan_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Tambah_Laporan_BarangActionPerformed
     try{
            
            String file = "/Report/Laporan_Barang.jasper";
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pwd);
            
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            HashMap<String, Object> param = new HashMap<>();
            
            // Mengisi laporan dengan data dari database
            JasperPrint print = JasperFillManager.fillReport(getClass().getResourceAsStream(file), param, con);

            // Menghapus konten panel sebelumnya
            pn_Konten_Laporan_Barang.removeAll();
            pn_Konten_Laporan_Barang.setLayout(new java.awt.BorderLayout());

            // Membuat JRViewer untuk menampilkan laporan
            JRViewer viewer = new JRViewer(print);
            
            // Menambahkan JRViewer ke panel
            pn_Konten_Laporan_Barang.add(viewer, java.awt.BorderLayout.CENTER);
            
            // Menetapkan ukuran preferensi agar JRViewer sesuai dengan panel
            viewer.setPreferredSize(pn_Konten_Laporan_Barang.getSize());
            
            viewer.setZoomRatio(0.85f);
            
            // Refresh panel
            pn_Konten_Laporan_Barang.revalidate();
            pn_Konten_Laporan_Barang.repaint();
            
            
            
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | JRException e){
            System.out.println(e);
        } catch (SQLException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Btn_Tambah_Laporan_BarangActionPerformed

    private void Btn_Tambah_Laporan_DistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Tambah_Laporan_DistributorActionPerformed
         try{
            
            String file = "/Report/Laporan_Distributor.jasper";
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pwd);
            
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            HashMap<String, Object> param = new HashMap<>();
            
            // Mengisi laporan dengan data dari database
            JasperPrint print = JasperFillManager.fillReport(getClass().getResourceAsStream(file), param, con);

            // Menghapus konten panel sebelumnya
            pn_Konten_Laporan_Distributor.removeAll();
            pn_Konten_Laporan_Distributor.setLayout(new java.awt.BorderLayout());

            // Membuat JRViewer untuk menampilkan laporan
            JRViewer viewer = new JRViewer(print);
            
            // Menambahkan JRViewer ke panel
            pn_Konten_Laporan_Distributor.add(viewer, java.awt.BorderLayout.CENTER);
            
            // Menetapkan ukuran preferensi agar JRViewer sesuai dengan panel
            viewer.setPreferredSize(pn_Konten_Laporan_Distributor.getSize());
            
            viewer.setZoomRatio(0.85f);
            
            // Refresh panel
            pn_Konten_Laporan_Distributor.revalidate();
            pn_Konten_Laporan_Distributor.repaint();
            
            
            
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | JRException e){
            System.out.println(e);
        } catch (SQLException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Btn_Tambah_Laporan_DistributorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Laporan_Barang;
    private javax.swing.JButton Btn_Laporan_Distributor;
    private javax.swing.JButton Btn_Tambah_Laporan_Barang;
    private javax.swing.JButton Btn_Tambah_Laporan_Distributor;
    private javax.swing.JLabel Lb_Laporan_Barang;
    private javax.swing.JLabel Lb_Laporan_Distributor;
    private javax.swing.JLabel Lb_Laporan_Master;
    private javax.swing.JPanel pn_Ctrl_Laporan_Barang;
    private javax.swing.JPanel pn_Ctrl_Laporan_Distributor;
    private javax.swing.JPanel pn_Konten_Laporan_Barang;
    private javax.swing.JPanel pn_Konten_Laporan_Distributor;
    private javax.swing.JPanel pn_Konten_Laporan_Master;
    private javax.swing.JPanel pn_Laporan_Barang;
    private javax.swing.JPanel pn_Laporan_Distributor;
    private javax.swing.JPanel pn_Laporan_Master;
    // End of variables declaration//GEN-END:variables
}
