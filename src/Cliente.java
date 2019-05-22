import java.util.Calendar;

public class Cliente {

	private String name;
	
	private String cpf;
	
	private Calendar dataNascimento;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Cliente(String name, String cpf, Calendar dataNascimento) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
