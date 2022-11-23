
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class contactQuery {
    public void insertContact(contato cont) {
        
        
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `meucontato`(`nome`, `sobrenome`, `grupoc`, `telefone`, `email`, `endereco`, `foto`, `usuarioid`) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, cont.getNome());
            ps.setString(2, cont.getSobrenome());
            ps.setString(3, cont.getGrupoc());
            ps.setString(4, cont.getTelefone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getEndereco());
            ps.setBytes(7, cont.getFoto());
            ps.setInt(8, cont.getUid());
            
            if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Novo contato adicionado!");
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Algo deu errado!");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public void updateContact(contato cont, boolean withImage) {
        
        
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        String updateQuery = "";
        
        if(withImage == true) { // se o usuário quiser mudar a foto do contato
            updateQuery = "UPDATE `meucontato` SET `nome`= ?,`sobrenome`= ?,`grupoc`= ?,`telefone`= ?,`email`= ?,`endereco`= ?,`foto`= ? WHERE `id` = ?";
            
        try {
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, cont.getNome());
            ps.setString(2, cont.getSobrenome());
            ps.setString(3, cont.getGrupoc());
            ps.setString(4, cont.getTelefone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getEndereco());
            ps.setBytes(7, cont.getFoto());
            ps.setInt(8, cont.getCid());
            
            if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Contato editado!");
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Algo deu errado!");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }            
            
        }else { // se o usuário quiser manter a imagem
            updateQuery = "UPDATE `meucontato` SET `nome`= ?,`sobrenome`= ?,`grupoc`= ?,`telefone`= ?,`email`= ?,`endereco`= ? WHERE `id` = ?";
            
        try {
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, cont.getNome());
            ps.setString(2, cont.getSobrenome());
            ps.setString(3, cont.getGrupoc());
            ps.setString(4, cont.getTelefone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getEndereco());
            ps.setInt(7, cont.getCid());
            
            if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Contato editado!");
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Algo deu errado!");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }            
            
        }
        
    }
    
    public void deleteContact(int cid) {
        
        
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("DELETE FROM `meucontato` WHERE `id` = ?");
            ps.setInt(1, cid); 
            
            if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Contato deletado!");
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Algo deu errado!");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    // cria uma lista de contato
    public ArrayList<contato> ContactList(int userId) {
        
        ArrayList<contato> clist = new ArrayList<contato>();
        
        Connection con = myConnection.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `nome`, `sobrenome`, `grupoc`, `telefone`, `email`, `endereco`, `foto` FROM `meucontato` WHERE usuarioid = "+userId);
            
            contato ct;
            
            while(rs.next()) {
                ct = new contato(rs.getInt("id"),
                                 rs.getString("nome"),
                                 rs.getString("sobrenome"),
                                 rs.getString("grupoc"),
                                 rs.getString("telefone"),
                                 rs.getString("email"),
                                 rs.getString("endereco"),
                                 rs.getBytes("foto"),
                                 userId);
                
                clist.add(ct);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return clist;
    }
    
    
}
