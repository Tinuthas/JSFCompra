import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ClienteBean {
	
	private String name;
	
	private String cpf;
	
	private String dataNascimento;
	
	public List<Cliente> getLista(){
		List<Cliente> beans = new ArrayList<Cliente>();
		beans.add(new Cliente("Mateus", "235634646", Calendar.getInstance()));
		beans.add(new Cliente("TEus", "45345", Calendar.getInstance()));
		beans.add(new Cliente("Guilhers", "463543", Calendar.getInstance()));
		beans.add(new Cliente("EU", "12345", Calendar.getInstance()));
		return beans;
	}
	
	

	public ClienteBean(String name, String cPF, String dataNascimento) {
		super();
		this.name = name;
		this.cpf = cPF;
		this.dataNascimento = dataNascimento;
	}

	public ClienteBean() {
		super();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cPF) {
		cpf = cPF;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
