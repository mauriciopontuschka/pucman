import java.util.Hashtable;


public class Posicao {
	
	private String label;
	private Hashtable<Character, Posicao> pathList;
	
	public Posicao(String label){
		this.setLabel(label);
	}
	
	public void addPath(char key, Posicao path){
		pathList.put(key, path);
	}
	
	public Posicao getPath(char key){
		return pathList.get(key);
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
}
