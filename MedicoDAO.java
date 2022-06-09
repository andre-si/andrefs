package andrefs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MedicoDAO  extends Conexao{
    
    public String cadastrarMedico(Medico medico)
    {
	try
	{
            String sentenca;
            sentenca = "INSERT INTO MEDICO VALUES (NULL,'" + medico.getNome() + "','" + medico.getEspecialidade ()
            + "','" + medico.getCRM() + "','" + medico.getCPF() + "')";
        return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
                return e.getMessage();
        }
    }
    
    public String atualizarMedico(Medico medico)
    {
        try 
        {
            String sentenca;
            sentenca = "UPDATE MEDICO SET NOME ='" + medico.getNome() +
                "',ESPECIALIDADE = '" + medico.getEspecialidade() + "',CRM = '" +
                medico.getCRM() + "',CPF = '" + medico.getCPF() +
                "' WHERE IDMEDICO = " + medico.getIdmedico();
            return this.atualizarBanco(sentenca);
        } 
        catch (Exception e) 
        {
            return e.getMessage();
        }
    }
    public String excluirMedico(String idmedico)
    {
        try 
        {
            String sentenca;
            sentenca = "DELETE FROM MEDICO WHERE IDMEDICO =" + idmedico;
            return this.atualizarBanco(sentenca);
        } 
        catch (Exception e) 
        {
            return e.getMessage();
        }
    }
    public ArrayList listarMedicos()
    {
        try {
            ArrayList medicos = new ArrayList();
            String sentenca = "SELECT * FROM MEDICO ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            
            while (rs.next())
            {
                Medico medico = new Medico();
                medico.setIdmedico(rs.getInt("IDMEDICO"));
                medico.setNome(rs.getString("NOME"));
                medico.setEspecialidade(rs.getInt("ESPECIALIDADE"));
                medico.setCRM(rs.getInt("CRM"));
                medico.setCPF(rs.getString("CPF"));
                medicos.add(medico);
            }
            return medicos;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
