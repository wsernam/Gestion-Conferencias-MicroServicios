
package com.conference.gui.presentation;


import com.conference.gui.conference.IUserRestConference;
import com.conference.gui.entities.Conference;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
/**
 * Interfaz de registro de conferencia.
 * 
* @author Maria Paula Barrera
 * @author Ashlee Vanessa Campaz
 * @author Monica Alejandra Castellanos
 * @author Karold Dirley Delgado
 * @author William Andres Serna
 * @version 1.0
 * @since 2024
 */
public class GUIcreateConference extends javax.swing.JInternalFrame {
        // Variable para almacenar el último mensaje de diálogo
    private String lastDialogMessage;
    

    // Método para mostrar el diálogo y almacenar el mensaje
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
        lastDialogMessage = message;  // Guardar el mensaje
    }

    // Método para obtener el último mensaje
    public String getLastDialogMessage() {
        return lastDialogMessage;
    }

    /**
     * Creates new form GUIcreateConference
     */
       private IUserRestConference conferenceService;
      

    
    public GUIcreateConference(IUserRestConference con) {
        this.conferenceService = con;
       
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
        java.awt.GridBagConstraints gridBagConstraints;

        pnlInferior = new javax.swing.JPanel();
        pnlRepArticulos = new javax.swing.JPanel();
        txtfMaxArt = new javax.swing.JTextField();
        txtfPlazoMaxRec = new javax.swing.JTextField();
        lbMaxArt = new javax.swing.JLabel();
        lbRepArt = new javax.swing.JLabel();
        pnlEvArticulos = new javax.swing.JPanel();
        txtfPlazoMaxEva = new javax.swing.JTextField();
        txtfMaxCalAcep = new javax.swing.JTextField();
        txtfMaxArtAcep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbMaxArtAcep = new javax.swing.JLabel();
        lbEvaArt = new javax.swing.JLabel();
        pnlCrearCon = new javax.swing.JLabel();
        pnlSuperior = new javax.swing.JPanel();
        pnlInfoGeneral = new javax.swing.JPanel();
        txtfNombre = new javax.swing.JTextField();
        txtfTemas = new javax.swing.JTextField();
        txtfEntOrganizadora = new javax.swing.JTextField();
        txtfFechaInicio = new javax.swing.JTextField();
        txtfFechaFin = new javax.swing.JTextField();
        lnInfoGen = new javax.swing.JLabel();
        pnlUbicacion = new javax.swing.JPanel();
        txtfPais = new javax.swing.JTextField();
        txtfEstado = new javax.swing.JTextField();
        txtfCiudad = new javax.swing.JTextField();
        txtfDireccion = new javax.swing.JTextField();
        lbUbicacion = new javax.swing.JLabel();
        pnlBotonGuardar = new javax.swing.JPanel();
        lbGuardar1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(229, 229, 229));
        setBorder(null);
        setToolTipText("");
        setFrameIcon(null);
        setMinimumSize(new java.awt.Dimension(873, 650));
        setPreferredSize(new java.awt.Dimension(873, 650));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlInferior.setBackground(new java.awt.Color(255, 255, 255));

        pnlRepArticulos.setBackground(new java.awt.Color(255, 255, 255));

        txtfMaxArt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfMaxArt.setText(" ");
        txtfMaxArt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtfPlazoMaxRec.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfPlazoMaxRec.setText(" ");
        txtfPlazoMaxRec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Plazo maximo hasta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        lbMaxArt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbMaxArt.setText("*Numero maximo de articulos:");

        lbRepArt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lbRepArt.setForeground(new java.awt.Color(51, 51, 51));
        lbRepArt.setText("Recepcion de articulos");

        javax.swing.GroupLayout pnlRepArticulosLayout = new javax.swing.GroupLayout(pnlRepArticulos);
        pnlRepArticulos.setLayout(pnlRepArticulosLayout);
        pnlRepArticulosLayout.setHorizontalGroup(
            pnlRepArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRepArticulosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlRepArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfPlazoMaxRec, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRepArticulosLayout.createSequentialGroup()
                        .addComponent(lbMaxArt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfMaxArt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbRepArt))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        pnlRepArticulosLayout.setVerticalGroup(
            pnlRepArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRepArticulosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbRepArt)
                .addGap(20, 20, 20)
                .addComponent(txtfPlazoMaxRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRepArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaxArt)
                    .addComponent(txtfMaxArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEvArticulos.setBackground(new java.awt.Color(255, 255, 255));

        txtfPlazoMaxEva.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfPlazoMaxEva.setText(" ");
        txtfPlazoMaxEva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Plazo maximo hasta:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        txtfMaxCalAcep.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfMaxCalAcep.setText(" ");
        txtfMaxCalAcep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtfMaxArtAcep.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfMaxArtAcep.setText(" ");
        txtfMaxArtAcep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel1.setText("*Calificacion minima aceptable:");

        lbMaxArtAcep.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbMaxArtAcep.setText("*Numero de articulos aceptados:");

        lbEvaArt.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lbEvaArt.setForeground(new java.awt.Color(51, 51, 51));
        lbEvaArt.setText("Evaluacion de articulos");

        javax.swing.GroupLayout pnlEvArticulosLayout = new javax.swing.GroupLayout(pnlEvArticulos);
        pnlEvArticulos.setLayout(pnlEvArticulosLayout);
        pnlEvArticulosLayout.setHorizontalGroup(
            pnlEvArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEvArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEvArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfPlazoMaxEva, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEvArticulosLayout.createSequentialGroup()
                        .addGroup(pnlEvArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbMaxArtAcep))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEvArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfMaxCalAcep, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfMaxArtAcep, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addComponent(lbEvaArt))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        pnlEvArticulosLayout.setVerticalGroup(
            pnlEvArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEvArticulosLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lbEvaArt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfPlazoMaxEva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEvArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfMaxCalAcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEvArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfMaxArtAcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaxArtAcep))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout pnlInferiorLayout = new javax.swing.GroupLayout(pnlInferior);
        pnlInferior.setLayout(pnlInferiorLayout);
        pnlInferiorLayout.setHorizontalGroup(
            pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInferiorLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(pnlRepArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEvArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlInferiorLayout.setVerticalGroup(
            pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlEvArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRepArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 80, 0, 50);
        getContentPane().add(pnlInferior, gridBagConstraints);

        pnlCrearCon.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        pnlCrearCon.setForeground(new java.awt.Color(102, 102, 102));
        pnlCrearCon.setText("Crear conferencia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 80, 0, 0);
        getContentPane().add(pnlCrearCon, gridBagConstraints);

        pnlSuperior.setBackground(new java.awt.Color(255, 255, 255));

        pnlInfoGeneral.setBackground(new java.awt.Color(255, 255, 255));

        txtfNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfNombre.setText(" ");
        txtfNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        txtfTemas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfTemas.setText(" ");
        txtfTemas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Temas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        txtfEntOrganizadora.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfEntOrganizadora.setText(" ");
        txtfEntOrganizadora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Entidad organizadora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        txtfFechaInicio.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfFechaInicio.setText(" ");
        txtfFechaInicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Fecha inicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        txtfFechaFin.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfFechaFin.setText(" ");
        txtfFechaFin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Fecha fin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        lnInfoGen.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lnInfoGen.setForeground(new java.awt.Color(51, 51, 51));
        lnInfoGen.setText("Informacion General");

        javax.swing.GroupLayout pnlInfoGeneralLayout = new javax.swing.GroupLayout(pnlInfoGeneral);
        pnlInfoGeneral.setLayout(pnlInfoGeneralLayout);
        pnlInfoGeneralLayout.setHorizontalGroup(
            pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfEntOrganizadora, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlInfoGeneralLayout.createSequentialGroup()
                            .addComponent(txtfFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlInfoGeneralLayout.createSequentialGroup()
                            .addComponent(txtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(txtfTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lnInfoGen))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlInfoGeneralLayout.setVerticalGroup(
            pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoGeneralLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lnInfoGen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfEntOrganizadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pnlUbicacion.setBackground(new java.awt.Color(255, 255, 255));

        txtfPais.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfPais.setText(" ");
        txtfPais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Pais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        txtfEstado.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfEstado.setText(" ");
        txtfEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Estado/Provincia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        txtfCiudad.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfCiudad.setText(" ");
        txtfCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Ciudad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        txtfDireccion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfDireccion.setText(" ");
        txtfDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N

        lbUbicacion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lbUbicacion.setForeground(new java.awt.Color(51, 51, 51));
        lbUbicacion.setText("Ubicacion");

        javax.swing.GroupLayout pnlUbicacionLayout = new javax.swing.GroupLayout(pnlUbicacion);
        pnlUbicacion.setLayout(pnlUbicacionLayout);
        pnlUbicacionLayout.setHorizontalGroup(
            pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUbicacionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUbicacion)
                    .addGroup(pnlUbicacionLayout.createSequentialGroup()
                        .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfCiudad)
                            .addComponent(txtfPais, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(txtfDireccion))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlUbicacionLayout.setVerticalGroup(
            pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUbicacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbUbicacion)
                .addGap(18, 18, 18)
                .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(pnlInfoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 80, 0, 50);
        getContentPane().add(pnlSuperior, gridBagConstraints);

        pnlBotonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        pnlBotonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlBotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBotonGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBotonGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBotonGuardarMouseExited(evt);
            }
        });

        lbGuardar1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lbGuardar1.setText("Guardar");

        javax.swing.GroupLayout pnlBotonGuardarLayout = new javax.swing.GroupLayout(pnlBotonGuardar);
        pnlBotonGuardar.setLayout(pnlBotonGuardarLayout);
        pnlBotonGuardarLayout.setHorizontalGroup(
            pnlBotonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonGuardarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbGuardar1)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlBotonGuardarLayout.setVerticalGroup(
            pnlBotonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonGuardarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbGuardar1)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 488, 7, 50);
        getContentPane().add(pnlBotonGuardar, gridBagConstraints);

        backButton.setText("Atras");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        getContentPane().add(backButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBotonGuardarMouseExited
       lbGuardar1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14));
    }//GEN-LAST:event_pnlBotonGuardarMouseExited

    private void pnlBotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBotonGuardarMouseEntered
        lbGuardar1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14));
    }//GEN-LAST:event_pnlBotonGuardarMouseEntered

    private void pnlBotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBotonGuardarMouseClicked
    try {
            // Recolección de los datos desde los textboxes, aplicando trim() a cada campo
            String nombre = txtfNombre.getText().trim();
            String temas = "muchos";
            String entidadOrganizadora = "unicauca";
            String fechaInicio = "27-11-2024"; // Formato: dd-MM-yyyy
            String fechaFin = "30-11-2024";       // Formato: dd-MM-yyyy
            String plazoMaxRec = "20-11-2024"; // Formato: dd-MM-yyyy
            String maxArt = "30";
            String plazoMaxEva = "25-11-2024"; // Formato: dd-MM-yyyy
            String maxCalAcep = "5";
            String maxArtAcep = "20";
            String pais = "colombia";
            String ciudad = "popayan";
            String estado = "cauca";
            String direccion = "uni";

            // Validación de campos vacíos
            if (nombre.isEmpty() || temas.isEmpty() || entidadOrganizadora.isEmpty() || fechaInicio.isEmpty() || fechaFin.isEmpty() ||
                plazoMaxRec.isEmpty() || maxArt.isEmpty() || plazoMaxEva.isEmpty() || maxCalAcep.isEmpty() || maxArtAcep.isEmpty() ||
                pais.isEmpty() || ciudad.isEmpty() || estado.isEmpty() || direccion.isEmpty()) {

                showMessage("Todos los campos deben ser completados.");
                return;
            }

            // Verificación previa de los campos numéricos para evitar NumberFormatException
            int numMaxArt;
            int numMaxArtAcep;
            float calMinima;

            try {
                numMaxArt = Integer.parseInt(maxArt); // Validar maxArt
            } catch (NumberFormatException e) {
                showMessage("Error: El campo 'Número máximo de artículos' debe ser un número entero.");
                return;
            }

            try {
                numMaxArtAcep = Integer.parseInt(maxArtAcep); // Validar maxArtAcep
            } catch (NumberFormatException e) {
                showMessage("Error: El campo 'Número máximo de artículos aceptados' debe ser un número entero.");
                return;
            }

            try {
                calMinima = Float.parseFloat(maxCalAcep); // Validar maxCalAcep
            } catch (NumberFormatException e) {
                showMessage("Error: El campo 'Calificación mínima' debe ser un número decimal.");
                return;
            }

            // Formato de fecha esperado
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Parseo de fechas
            LocalDate fechaInicioLD = LocalDate.parse(fechaInicio, formatter);
            LocalDate fechaFinLD = LocalDate.parse(fechaFin, formatter);
            LocalDate plazoMaxRecLD = LocalDate.parse(plazoMaxRec, formatter);
            LocalDate plazoMaxEvaLD = LocalDate.parse(plazoMaxEva, formatter);
            LocalDate fechaActual = LocalDate.now();

            // Validar fecha de inicio (debe ser al menos un mes mayor que la actual y menor a la fecha fin)
            if (ChronoUnit.MONTHS.between(fechaActual, fechaInicioLD) < 1) {
                showMessage("La fecha de inicio debe ser al menos un mes después de la actual.");
                return;
            }
            if (fechaInicioLD.isAfter(fechaFinLD)) {
                showMessage("La fecha de inicio debe ser antes de la fecha de fin.");
                return;
            }

            // Validar fecha de fin (debe ser después de la fecha de inicio)
            if (fechaFinLD.isBefore(fechaInicioLD)) {
                showMessage("La fecha de fin debe ser después de la fecha de inicio.");
                return;
            }

            // Validar plazo máximo de recepción de artículos (debe ser antes de la fecha de inicio)
            if (plazoMaxRecLD.isAfter(fechaInicioLD) || plazoMaxRecLD.isBefore(fechaActual)) {
                showMessage("La recepción de artículos debe realizarse antes de la fecha de inicio.");
                return;
            }

            // Validar plazo máximo de evaluación de artículos (debe ser antes de la fecha de inicio)
            if (plazoMaxEvaLD.isAfter(fechaInicioLD) || plazoMaxEvaLD.isBefore(fechaActual)) {
                showMessage("La evaluación de artículos debe realizarse antes de la fecha de inicio.");
                return;
            }

            // Validar número máximo de artículos aceptados (debe ser menor al número de artículos recibidos)
            if (numMaxArtAcep >= numMaxArt) {
                showMessage("El número de artículos aceptados debe ser menor que el número total de artículos.");
                return;
            }

            // Si todas las validaciones pasan, crear el objeto Conference con los datos que POR AHORA nesecitamos
            Conference conferencia = new Conference(nombre,  numMaxArt);
            Conference result= conferenceService.setConferencia(conferencia);

            // Guardar la conferencia o realizar la acción que corresponda
            if(result !=null){
           
            showMessage("Conferencia registrada exitosamente.");
            }
           
            this.dispose();
            
        } catch (DateTimeParseException e) {
            showMessage("Error: Formato de fecha no válido. Debe ser dd-MM-yyyy.");
        } catch (Exception e) {
            showMessage("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_pnlBotonGuardarMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbEvaArt;
    private javax.swing.JLabel lbGuardar1;
    private javax.swing.JLabel lbMaxArt;
    private javax.swing.JLabel lbMaxArtAcep;
    private javax.swing.JLabel lbRepArt;
    private javax.swing.JLabel lbUbicacion;
    private javax.swing.JLabel lnInfoGen;
    private javax.swing.JPanel pnlBotonGuardar;
    private javax.swing.JLabel pnlCrearCon;
    private javax.swing.JPanel pnlEvArticulos;
    private javax.swing.JPanel pnlInferior;
    private javax.swing.JPanel pnlInfoGeneral;
    private javax.swing.JPanel pnlRepArticulos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JPanel pnlUbicacion;
    private javax.swing.JTextField txtfCiudad;
    private javax.swing.JTextField txtfDireccion;
    private javax.swing.JTextField txtfEntOrganizadora;
    private javax.swing.JTextField txtfEstado;
    private javax.swing.JTextField txtfFechaFin;
    private javax.swing.JTextField txtfFechaInicio;
    private javax.swing.JTextField txtfMaxArt;
    private javax.swing.JTextField txtfMaxArtAcep;
    private javax.swing.JTextField txtfMaxCalAcep;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfPais;
    private javax.swing.JTextField txtfPlazoMaxEva;
    private javax.swing.JTextField txtfPlazoMaxRec;
    private javax.swing.JTextField txtfTemas;
    // End of variables declaration//GEN-END:variables
}
