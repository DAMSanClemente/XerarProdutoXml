import java.io.Serializable;
public class Produto implements Serializable{
    private int identificador;
    private String nomeProduto;
    private double prezo;
    final static long serialVersionUID=1L;
    public Produto(int identificador, String nomeProduto, double prezo){
      this.identificador=identificador;
      this.nomeProduto=nomeProduto;
      this.prezo=prezo;
    }
    public Produto(){}
    public String toString(){
	return identificador+"-"+nomeProduto+"-"+prezo;
    }
}//class
