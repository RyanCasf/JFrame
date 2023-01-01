package br.com.chooser;

public enum Extension {
	
	EXE("exe");
	
	Extension(final String extensao) {
		this.extensao = extensao;
	}
	
	private final String extensao;
	
	public String getExtensao() {
		return extensao;
	}
	
	@Override
	public String toString() {
		return extensao;
	}
}