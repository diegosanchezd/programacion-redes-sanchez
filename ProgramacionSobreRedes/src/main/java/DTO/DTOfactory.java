package DTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DTOfactory {
	
	private static DTOfactory factory = null;
	private generalDTO dto = null;

	private DTOfactory() {
		super();
	}
	
	public static DTOfactory getInstance() {
		if (factory == null)
			factory = new DTOfactory();

		return factory;
	}
	
	public generalDTO getDTO(String type, ResultSet rs) {
		try {
			switch (type) {
			case "stock":
				dto = new stockDTO(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getDouble("price_buy"),rs.getDouble("price_sell"),rs.getInt("cant"),rs.getBoolean("isDiscontinuous"));					
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dto;
	}

	
	// Patron FACTORY
	public generalDTO getDTO(String type) {
		switch (type) {
		case "stock":
				dto = new stockDTO();
			break;

		}

		return dto;
	}

}
