package andrefs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteDAO extends Conexao{
    public String cadastrarPaciente(Paciente paciente)
    {
	try
	{
            String sentenca;
            sentenca = "INSERT INTO PACIENTE VALUES (NULL,'" + paciente.getNome() + "','" + paciente.getCPF ()
            + "','" + paciente.getIdade() + "')";
        return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
                return e.getMessage();
        }
    }    
    public String atualizarPaciente(Paciente paciente)
    {
        try 
        {
            String sentenca;
            sentenca = "UPDATE PACIENTE SET NOME ='" + paciente.getNome() +
                "',CPF = '" + paciente.getCPF() + "',Idade = '" +
                paciente.getIdade() +
                "' WHERE IDPACIENTE = " + paciente.getIdpaciente();
            return this.atualizarBanco(sentenca);
        } 
        catch (Exception e) 
        {
            return e.getMessage();
        }
    }
    public String excluirPaciente(String idpaciente)
    {
        try 
        {
            String sentenca;
            sentenca = "DELETE FROM PACIENTE WHERE IDPACIENTE =" + idpaciente;
            return this.atualizarBanco(sentenca);
        } 
        catch (Exception e) 
        {
            return e.getMessage();
        }
    }
    public ArrayList listarPaciente()
    {
        try {
            ArrayList pacientes = new ArrayList();
            String sentenca = "SELECT * FROM PACIENTE ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            
            while (rs.next())
            {
                Paciente paciente = new Paciente();
                paciente.setIdpaciente(rs.getInt("IDPACIENTE"));
                paciente.setNome(rs.getString("NOME"));
                paciente.setCPF(rs.getString("CPF"));
                paciente.setIdade(rs.getInt("IDADE"));
                pacientes.add(paciente);
            }
            return pacientes;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
