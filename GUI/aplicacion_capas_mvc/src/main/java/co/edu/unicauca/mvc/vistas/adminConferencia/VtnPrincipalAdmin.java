package co.edu.unicauca.mvc.vistas.adminConferencia;

import co.edu.unicauca.mvc.vistas.articulos.VtnListarArticulos;
import co.edu.unicauca.mvc.vistas.articulos.VtnRegistrarArticulo;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Ventana principal para la administración del sistema.
 * 
 * Esta clase extiende {@link javax.swing.JFrame} y proporciona la interfaz
 * principal para el administrador, permitiendo la gestión de conferencias,
 * artículos y estadísticas.
 */
public class VtnPrincipalAdmin extends javax.swing.JFrame {
    
    private VtnVerEstadisticas objVtnVerEstadisticas;
    private VtnRegistrarArticulo objVtnRegistrarArticulos;
    private VtnListarConferencias objVtnListarConferencias;
    private VtnListarArticulos objVtnListarArticulos;
    
    /**
     * Constructor de la clase.
     * Inicializa la ventana y establece su icono.
     */
    public VtnPrincipalAdmin() {
        initComponents();
        establecerIconoOrganización();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    /**
     * Asocia los servicios de almacenamiento a la ventana principal.
     * 
     * @param objServicio1 Servicio de almacenamiento de conferencias.
     * @param objServicio2 Servicio de almacenamiento de artículos.
     * @param objServicio3 Servicio de almacenamiento de revisores.
     */
    
    /**
     * Relaciona las ventanas internas con el panel principal.
     * Agrega las diferentes vistas internas al panel de escritorio.
     */
    private void relacionarInternalFrameConJdesptokPane()
    {
    }
    
    /**
     * Establece el icono de la organización en la ventana principal.
     * Carga la imagen desde el recurso especificado y la ajusta.
     */
    private void establecerIconoOrganización()
    {
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelImagenOrganizacion = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jButtonGestionarConferencias = new javax.swing.JButton();
        jButtonRegistrarArticulo = new javax.swing.JButton();
        jButtonVerEstadisticas = new javax.swing.JButton();
        jPanelInferior = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jDesktopPanelPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelImagenOrganizacion.setText("jLabel1");

        jPanelMenu.setBackground(new java.awt.Color(153, 153, 255));

        jButtonGestionarConferencias.setText("Gestionar conferencias");
        jButtonGestionarConferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarConferenciasActionPerformed(evt);
            }
        });

        jButtonRegistrarArticulo.setText("Registrar Articulo");
        jButtonRegistrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarArticuloActionPerformed(evt);
            }
        });

        jButtonVerEstadisticas.setText("Ver estadisticas");
        jButtonVerEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButtonGestionarConferencias)
                .addGap(47, 47, 47)
                .addComponent(jButtonRegistrarArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButtonVerEstadisticas)
                .addGap(28, 28, 28))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGestionarConferencias)
                    .addComponent(jButtonRegistrarArticulo)
                    .addComponent(jButtonVerEstadisticas))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabelImagenOrganizacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagenOrganizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jDesktopPanelPrincipalLayout = new javax.swing.GroupLayout(jDesktopPanelPrincipal);
        jDesktopPanelPrincipal.setLayout(jDesktopPanelPrincipalLayout);
        jDesktopPanelPrincipalLayout.setHorizontalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jDesktopPanelPrincipalLayout.setVerticalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanelPrincipal)
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanelPrincipal)
                .addContainerGap())
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarArticuloActionPerformed
        this.objVtnListarArticulos.setVisible(true);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
    }//GEN-LAST:event_jButtonRegistrarArticuloActionPerformed

    private void jButtonVerEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerEstadisticasActionPerformed
        this.objVtnVerEstadisticas.setVisible(true);
        this.objVtnRegistrarArticulos.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
    }//GEN-LAST:event_jButtonVerEstadisticasActionPerformed

    private void jButtonGestionarConferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarConferenciasActionPerformed
        this.objVtnListarConferencias.setVisible(true);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnRegistrarArticulos.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarConferenciasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestionarConferencias;
    private javax.swing.JButton jButtonRegistrarArticulo;
    private javax.swing.JButton jButtonVerEstadisticas;
    private javax.swing.JDesktopPane jDesktopPanelPrincipal;
    private javax.swing.JLabel jLabelImagenOrganizacion;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
