import java.io.*;
import java.util.*;
import com.thoughtworks.xstream.XStream;
public class XerarXmlProductos{
	public static void main(String[] args){
		ArrayList<Produto> arrayL=leProductos();
		try{
			XStream xstream=new XStream();
			xstream.alias("produtos",List.class);
			xstream.alias("produto",Produto.class);
			xstream.toXML(arrayL,new FileOutputStream("produtos.xml"));
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}	
	public static ArrayList<Produto> leProductos(){
			ArrayList<Produto> produtos=new ArrayList<Produto>();
		try{
			FileInputStream ficheiroEntrada=new FileInputStream("produtos.dat");
			ObjectInputStream entrada=new ObjectInputStream(ficheiroEntrada);
			while(ficheiroEntrada.available()>0){
				produtos.add((Produto)entrada.readObject());
			}
			entrada.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return produtos;
	}
}