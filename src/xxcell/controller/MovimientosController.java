package xxcell.controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static xxcell.controller.LoginController.scene;


public class MovimientosController implements Initializable {

    @FXML
    private JFXButton btnPrestamos;

    @FXML
    private JFXButton btnSalidas;
    
     @FXML
    private JFXButton btnMostrarPromos;

    @FXML
    private JFXButton btnAgregarPromos;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        if(!Variables_Globales.Rol.equals("0")){
            btnAgregarPromos.setDisable(true);
            btnAgregarPromos.setVisible(false);
        }
        
        btnPrestamos.setOnAction((ActionEvent e) -> {       
            Parent principal;
            try {
                principal = FXMLLoader.load(getClass().getResource("/xxcell/view/Transacciones.fxml"));
                Stage principalStage = new Stage();
                principalStage.getIcons().add(new Image("/xxcell/Images/XXCELL450.png"));
                scene = new Scene(principal);
                principalStage.setScene(scene);
                principalStage.initModality(Modality.APPLICATION_MODAL);
                principalStage.initOwner(btnPrestamos.getScene().getWindow());
                principalStage.showAndWait(); 
            } catch (IOException ex) {
                Logger.getLogger(MovimientosController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });  
        
        btnAgregarPromos.setOnAction((ActionEvent e) -> {       
            Parent principal;
            try {
                principal = FXMLLoader.load(getClass().getResource("/xxcell/view/Promociones.fxml"));
                Stage principalStage = new Stage();
                scene = new Scene(principal);
                principalStage.getIcons().add(new Image("/xxcell/Images/XXCELL450.png"));
                principalStage.setScene(scene);
                principalStage.initModality(Modality.APPLICATION_MODAL);
                principalStage.initOwner(btnPrestamos.getScene().getWindow());
                principalStage.showAndWait(); 
            } catch (IOException ex) {
                Logger.getLogger(MovimientosController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }); 
        
        btnMostrarPromos.setOnAction((ActionEvent e) -> {       
            Parent principal;
            try {
                principal = FXMLLoader.load(getClass().getResource("/xxcell/view/VerPromociones.fxml"));
                Stage principalStage = new Stage();
                scene = new Scene(principal);
                principalStage.getIcons().add(new Image("/xxcell/Images/XXCELL450.png"));
                principalStage.setScene(scene);
                principalStage.initModality(Modality.APPLICATION_MODAL);
                principalStage.initOwner(btnPrestamos.getScene().getWindow());
                principalStage.showAndWait(); 
            } catch (IOException ex) {
                Logger.getLogger(MovimientosController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }); 
        
        btnSalidas.setOnAction((ActionEvent e) -> {       
            Parent principal;
            try {
                principal = FXMLLoader.load(getClass().getResource("/xxcell/view/SalidasPendientes.fxml"));
                Stage principalStage = new Stage();
                principalStage.getIcons().add(new Image("/xxcell/Images/XXCELL450.png"));
                scene = new Scene(principal);
                principalStage.setScene(scene);
                principalStage.initModality(Modality.APPLICATION_MODAL);
                principalStage.initOwner(btnPrestamos.getScene().getWindow());
                principalStage.showAndWait(); 
            } catch (IOException ex) {
                Logger.getLogger(MovimientosController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });  
    }        
}
