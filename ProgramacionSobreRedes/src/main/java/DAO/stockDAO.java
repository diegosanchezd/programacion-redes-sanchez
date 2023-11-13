package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.connectionFactory;
import DTO.DTOfactory;
import DTO.stockDTO;
import principal.connectionFactory;

public class stockDAO implements GeneralDAO<stockDTO>{
	
	final Logger LOG = Logger.getLogger(stockDTO.class.getName());
	

	public int add(stockDTO item) {
		PreparedStatement ps = null;
		Connection conn = null;

		try {

			StringBuilder sql = new StringBuilder();

			sql.append("INSERT INTO stock").append("(name, description, price_buy, price_sell, cant, isDiscontinuous)").append(" VALUES ");
			sql.append("(");
			sql.append("'").append(item.getName()).append("'").append(", ");
			sql.append("'").append(item.getDescription()).append("'").append(", ");
			sql.append(item.getPrice_buy()).append(", ");
			sql.append(item.getPrice_sell()).append(", ");
			sql.append(item.getCant()).append(", ");
			sql.append(item.getIsDiscontinuous()).append(");  ");

			
			
			conn = connectionFactory.getInstance().getConection("MySQL");
			ps = conn.prepareStatement(sql.toString());

			return ps.executeUpdate();
		} catch (SQLException ex) {
			LOG.log(Level.SEVERE,
					"INDICE CON ERROR:".concat(String.valueOf(item.getId())).concat(" - TABLA: Stock"), ex);
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException ex) {
				LOG.log(Level.SEVERE, null, ex);
			}
		}
		return 0;
	}

	public int add(LinkedList<stockDTO> lista) {
		PreparedStatement ps = null;
		Connection conn = null;

		try {

			StringBuilder sql = new StringBuilder();
			for (stockDTO r : lista) {
				sql.append("INSERT INTO stock").append("(name, description, price_buy, price_sell, cant, isDiscontinuous)").append(" VALUES ");
				sql.append("(");
				sql.append("'").append(r.getName()).append("'").append(", ");
				sql.append("'").append(r.getDescription()).append("'").append(", ");
				sql.append(r.getPrice_buy()).append(", ");
				sql.append(r.getPrice_sell()).append(", ");
				sql.append(r.getCant()).append(", ");
				sql.append(r.getIsDiscontinuous()).append(");  ");
			}

			conn = connectionFactory.getInstance().getConection("MySQL");
			ps = conn.prepareStatement(sql.toString());

			return ps.executeUpdate();
		} catch (SQLException ex) {
			LOG.log(Level.SEVERE, null, ex);
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException ex) {
				LOG.log(Level.SEVERE, null, ex);
			}
		}
		return 0;
	}


	
	@Override
	public int delete(stockDTO item) {
		PreparedStatement ps = null;
		Connection conn = null;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM stock ").append(" WHERE ").append(" id=? ");

			conn = connectionFactory.getInstance().getConection("MySQL");
			ps = conn.prepareStatement(sql.toString());
			ps.setInt(1, item.getId());

			return ps.executeUpdate();
		} catch (SQLException ex) {
			LOG.log(Level.SEVERE,
					"INDICE CON ERROR:".concat(String.valueOf(item.getId())).concat(" - TABLA: Stock"), ex);
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException ex) {
				LOG.log(Level.SEVERE, null, ex);
			}
		}
		return -1;
	}

	
	public int update(stockDTO registro) {
		PreparedStatement ps = null;
		Connection conn = null;

		try {
			String consulta = "UPDATE stock SET name=? , description=? , price_buy=?, price_sell=?, cant=?, isDiscontinuous=? WHERE id=?";
			conn = connectionFactory.getInstance().getConection("MySQL");
			ps = conn.prepareStatement(consulta);

			ps.setString(1, registro.getName());
			ps.setString(2, registro.getDescription());
			ps.setDouble(3, registro.getPrice_buy());
			ps.setDouble(4, registro.getPrice_sell());
			ps.setInt(5, registro.getCant());
			ps.setBoolean(6, registro.getIsDiscontinuous());
			ps.setInt(7, registro.getId());
			
			return ps.executeUpdate();
		} catch (SQLException ex) {
			LOG.log(Level.SEVERE,
					"INDICE CON ERROR:".concat(String.valueOf(registro.getId())).concat(" - TABLA: Stock"), ex);
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException ex) {
				LOG.log(Level.SEVERE, null, ex);
			}
		}
		return -1;
	}


	
	@Override
	public LinkedList<stockDTO> getAll() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		LinkedList<stockDTO> aux = new LinkedList<stockDTO>();

		String sql = "SELECT * FROM stock";

		try {
			conn = connectionFactory.getInstance().getConection("MySQL");
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				aux.add( (stockDTO)DTOfactory.getInstance().getDTO("stock", rs));
			}
		} catch (SQLException e) {
			LOG.log(Level.SEVERE, null, e);
		} finally {
			cerrarConexiones(rs, ps, conn);
		}

		return aux;
	}
	

	
	@Override
	public stockDTO getById(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM stock WHERE id=?";

		try {
			conn = connectionFactory.getInstance().getConection("MySQL");
			ps = conn.prepareStatement(sql);

			ps.setInt(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				return (stockDTO)DTOfactory.getInstance().getDTO("stock", rs);
			}
		} catch (SQLException e) {
			LOG.log(Level.SEVERE, null, e);
		} finally {
			cerrarConexiones(rs, ps, conn);
		}
		return null;
	}

	
	
	
	private void cerrarConexiones(ResultSet rs, PreparedStatement ps, Connection conn) {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			LOG.log(Level.SEVERE, null, e);
		}
	}

	@Override
	public LinkedList<stockDTO> getAllH2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setAll(LinkedList<stockDTO> lista) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setAllH2(LinkedList<stockDTO> lista) {
		// TODO Auto-generated method stub
		return 0;
	}

}
