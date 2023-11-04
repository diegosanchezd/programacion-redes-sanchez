package principal;

import java.io.PrintStream;
import java.util.LinkedList;

import DAO.DAOFactory;
import DAO.stockDAO;
import DTO.DTOfactory;
import DTO.stockDTO;
import Utils.Read;

public class main {
	
	public static PrintStream ps = new PrintStream(System.out);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	
	public static void menu() {
		
	    int eleccion = -1;
	    while (eleccion != 0) {
	    	ps.println("\n--------- MENU --------");
		    ps.println("1- VER PRODUCTOS");
		    ps.println("2- AGREGAR NUEVO PRODUCTO");
		    ps.println("3- MODIFICAR STOCK");
		    ps.println("4- DESCONTINUAR PRODUCTO");
		    ps.println("5- ELIMINAR PRODUCTO");
		    ps.println("0- SALIR");
		    eleccion = Read.readRInt("Opcion: ");
		    switch(eleccion) {
	        case 1:
	            verProductos();
	            break;
	        case 2:
	            agregarProducto();
	            break;
	        case 3:
	        	modificarProducto();
	        	break;
	        case 4:
	        	descontinuarProducto();
	        	break;
	        case 5:
	        	eliminarProducto();
	        	break;
	        case 0:
	            ps.println("ADIOS!...");
	            break;
	        default:
	            ps.println("Opción no válida.");
	            break;
		    }
	    }
	   

	    
	}

	public static void verProductos() {
	    ps.println("--------- Ver Stock --------");
	    LinkedList<stockDTO> productos = DAOFactory.getInstance().getDAO("stock").getAll();
	    for(stockDTO p : productos) {
	    	ps.println(p.toString());
	    }
	}

	public static void agregarProducto() {
	    ps.println("-------- Agregar al Stock ------");
	   
	    String name = Read.readR("Nombre del producto: ");
	    String description = Read.readR("Descripción: ");
	    double price_buy = Read.readDouble("Precio de compra: ");
	    double price_sell = Read.readDouble("Precio de venta: ");
	    int cant = Read.readInt("Cantidad: ");
	    boolean isDiscontinuous = false;
	    
	    stockDTO d= new stockDTO(name, description, price_buy, price_sell, cant, isDiscontinuous); 
	    
	    DAOFactory.getInstance().getDAO("stock").add(d);
		ps.println("Se agrego " +d.getName()+" con exito!");
	}
	
	
	public static void modificarProducto() {
		ps.println("\n --------- Modificar Producto --------");
		 LinkedList<stockDTO> productos = DAOFactory.getInstance().getDAO("stock").getAll();
		    for(stockDTO p : productos) {
		    	ps.println(p.getId()+" - "+p.getName());
		    }
		int eleccionP = Read.readRInt("Elija el numero de producto a modificar:"); 
		
		stockDTO st = (stockDTO)DAOFactory.getInstance().getDAO("stock").getById(eleccionP);

		
		ps.println("(Dejar vacio los parentisis si desea conservar el valor anterior del producto)");
		String name = Read.readR("Nombre del producto("+st.getName()+"): ");
		String description = Read.readR("Descripción("+st.getDescription()+"): ");
		Double price_buy=  Read.readRDouble("Precio de compra("+st.getPrice_buy()+"): ");
		Double price_sell = Read.readRDouble("Precio de venta("+st.getPrice_sell()+"): ");
		int cant = Read.readRInt("Cantidad("+st.getCant()+"):");
		
		if(name != null || name != "") st.setName(name);
		if(description != null|| description != "") st.setDescription(description);
		if(price_buy != null) st.setPrice_buy(price_buy);
		if(price_sell != null) st.setPrice_sell(price_sell);
		st.setCant(cant);
		DAOFactory.getInstance().getDAO("stock").update(st);
		ps.println("Se modifico " +st.getName()+" con exito!");
	}
	
	
	
	public static void descontinuarProducto() {
		ps.println(" --------- Descontinuar producto --------");
		 LinkedList<stockDTO> productos = DAOFactory.getInstance().getDAO("stock").getAll();
		    for(stockDTO p : productos) {
		    	ps.println(p.getId()+" - "+p.getName());
		    }
		int eleccionP = Read.readRInt("Elija el numero de producto a descontinuar:"); 
		
		
		stockDTO st = (stockDTO)DAOFactory.getInstance().getDAO("stock").getById(eleccionP);
		st.setIsDiscontinuous(true);
		DAOFactory.getInstance().getDAO("stock").update(st);
		ps.println("Se descontinuo " +st.getName()+" con exito!");
		
	}
	
	public static void eliminarProducto() {
		ps.println("\n --------- Eliminar producto --------");
		 LinkedList<stockDTO> productos = DAOFactory.getInstance().getDAO("stock").getAll();
		    for(stockDTO p : productos) {
		    	ps.println(p.getId()+" - "+p.getName());
		    }
		int eleccionP = Read.readRInt("Elija el numero de producto a Eliminar:"); 
		
		
		stockDTO st = (stockDTO)DAOFactory.getInstance().getDAO("stock").getById(eleccionP);
		DAOFactory.getInstance().getDAO("stock").delete(st);
		ps.println("Se elimino " +st.getName()+" con exito!");
		
	}


}
