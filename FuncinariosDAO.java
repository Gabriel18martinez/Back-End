import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FuncinariosDAO {

    ArrayList<Funcionarios> retriveAll() throws SQLException{
        CriarConexao criaConexao = new CriarConexao();
        Connection connection = criaConexao.recuperarConexao();
        Statement stm = connection.createStatement();
        stm.execute("SELECT * FROM funcionarios");
        ResultSet rst = stm.getResultSet();
        ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
        while (rst.next()){
            int id_funcionario = rst.getInt("id_funcionario");
            int cargo = rst.getInt("cargo");
            int fk_setor = rst.getInt("fk_setor");
            String email = rst.getString("email");
            String nome = rst.getString("nomeFuncionario");
            String senha = rst.getString("senha");
            Funcionarios f = new Funcionarios(id_funcionario, cargo, fk_setor, email, nome, senha);
            funcionarios.add(f);
        }
        connection.close();
        return funcionarios;

    }

    boolean create(Funcionarios funcionarios) throws SQLException{
           
        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao();

        String sql = "INSERT INTO Funcionarios (id_funcionario, email, nomeFuncionario, cargo, senha, fk_setor ) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstm = (PreparedStatement) connection.prepareStatement(sql)) {
            pstm.setInt(1,funcionarios.getId_funcionario());
            pstm.setInt(2,funcionarios.getCargo());
            pstm.setInt(3,funcionarios.getFk_setor());
            pstm.setString(4,funcionarios.getEmail());
            pstm.setString(4,funcionarios.getNomeFuncionario());
            pstm.setString(4,funcionarios.getSenha());
            
            return pstm.execute();
        }

    }

}
