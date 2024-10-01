/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package home_in_patagonia.views;

import home_in_patagonia.controllers.MovieController;
import javax.swing.JOptionPane;
import home_in_patagonia.models.Movie;

/**
 *
 * @author ProBook
 */
public class VistaActualizarPelicula extends javax.swing.JFrame {

    private MovieController movieController;

    /**
     * Creates new form VistaActualizarPelicula
     */
    public VistaActualizarPelicula(MovieController movieController) {
        initComponents();
        this.movieController = movieController;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        idBuscadoField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tituloTxt = new javax.swing.JTextField();
        directorTxt = new javax.swing.JTextField();
        añoTxt = new javax.swing.JTextField();
        duracionTxt = new javax.swing.JTextField();
        generoTxt = new javax.swing.JTextField();
        botonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ingrese el id de la pelicula que desea actualizar");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        idBuscadoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBuscadoFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Titulo");

        jLabel4.setText("Director");

        jLabel5.setText("Año");

        jLabel6.setText("Duracion");

        jLabel7.setText("Genero");

        tituloTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloTxtActionPerformed(evt);
            }
        });

        añoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoTxtActionPerformed(evt);
            }
        });

        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(directorTxt)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(generoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addComponent(duracionTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(añoTxt, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(21, 21, 21)
                                        .addComponent(botonActualizar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tituloTxt))
                        .addGap(195, 195, 195))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idBuscadoField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBuscadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(directorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(añoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(duracionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonActualizar)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        int id = Integer.parseInt(idBuscadoField.getText().trim());
        if (id == 0 || id < 0) {
            JOptionPane.showMessageDialog(null, "Ingrese algun id valido");
            return;
        }
        Movie movie = movieController.buscarPeliculaPorId(id);
        if (movie != null) {

            tituloTxt.setText(movie.getTitulo());
            directorTxt.setText(movie.getDirector());
            añoTxt.setText(String.valueOf(movie.getAño()));
            duracionTxt.setText(String.valueOf(movie.getDuracion()));
            generoTxt.setText(movie.getGenero());

        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void idBuscadoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBuscadoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBuscadoFieldActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        try {
        // Capturar el ID de la película (suponiendo que exista un campo de texto para el ID)
        int id = Integer.parseInt(idBuscadoField.getText().trim());
        
        // Capturar los demás campos de la vista
        String titulo = tituloTxt.getText().trim();
        String director = directorTxt.getText().trim();
        Integer año = Integer.parseInt(añoTxt.getText().trim());
        Integer duracion = Integer.parseInt(duracionTxt.getText().trim());
        String genero = generoTxt.getText().trim();

        // Llamar al controlador con el id y los demás datos
        boolean actualizado = movieController.actualizarPelicula(id, titulo, director, año, duracion, genero);

        if (actualizado) {
            JOptionPane.showMessageDialog(null, "Película actualizada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: Película no actualizada.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: ID inválido o campos incorrectos.");
    }

    }//GEN-LAST:event_botonActualizarActionPerformed

    private void tituloTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloTxtActionPerformed

    private void añoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField añoTxt;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField directorTxt;
    private javax.swing.JTextField duracionTxt;
    private javax.swing.JTextField generoTxt;
    private javax.swing.JTextField idBuscadoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tituloTxt;
    // End of variables declaration//GEN-END:variables
}
