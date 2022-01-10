/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipengelolaankrs;

import form.LoginForm;
import java.sql.SQLException;

/**
 *
 * @author hadie
 */
public class AplikasiPengelolaanKRS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       // new config().getKoneksi();
       new LoginForm().setVisible(true);
    }
    
}
