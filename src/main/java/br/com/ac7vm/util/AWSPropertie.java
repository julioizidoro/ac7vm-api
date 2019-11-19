package br.com.ac7vm.util;

public class AWSPropertie {
	
	private String bucketusuario;
	private String accesskey;
	private String secretaccesskey;
	private String clientRegion;
	
	
	
	public AWSPropertie() {
		super();
		this.bucketusuario = "";
		this.accesskey = "";
		this.secretaccesskey = "";
		this.clientRegion = "";
	}
	
	
	
	public String getBucketusuario() {
		return bucketusuario;
	}



	public void setBucketusuario(String bucketusuario) {
		this.bucketusuario = bucketusuario;
	}



	public String getAccesskey() {
		return accesskey;
	}
	public void setAccesskey(String accesskey) {
		this.accesskey = accesskey;
	}
	public String getSecretaccesskey() {
		return secretaccesskey;
	}
	public void setSecretaccesskey(String secretaccesskey) {
		this.secretaccesskey = secretaccesskey;
	}
	public String getClientRegion() {
		return clientRegion;
	}
	public void setClientRegion(String clientRegion) {
		this.clientRegion = clientRegion;
	}
	
	

}
