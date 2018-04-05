package br.edu.positivo.clinicavet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.proativo.util.QueryWarehouse;

public class AnimalDAO implements IGenericDAO<Animal, Long> {

	@Override
	public List<Animal> listar() throws Exception{
		Animal a;
		List<Animal> list = new ArrayList<Animal>();
		String sql = "select a.ID,a.NOME,a.NASCIMENTO,A.ESPECIE_ID,e.NOME from animal a, especie e where a.especie_id = e.id"
;
		Connection conn = ConnectionFactory.getConnection();
		try(PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery())
		{
			a = new Animal();
			while (rs.next()) {
				a.setId(rs.getInt("ID"));
				a.setNome(rs.getString("NOME"));
				a.setNascimento(rs.getDate("NASCIMENTO"));
				a.setEspecie(new Especie(rs.getInt("ESPECIE_ID"),rs.getString("NOME")));
				list.add(a);
			}
			return list;
		}
	}

	@Override
	public Animal buscar(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Animal remover(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Animal objeto) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void persistir(Animal objeto) throws Exception {
		// TODO Auto-generated method stub

	}


}
