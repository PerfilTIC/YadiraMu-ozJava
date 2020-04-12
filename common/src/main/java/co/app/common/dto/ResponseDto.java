package co.app.common.dto;

public class ResponseDto {
	
	private int codeResponse;
	private String messageResponse;
	public int getCodeResponse() {
		return codeResponse;
	}
	public void setCodeResponse(int codeResponse) {
		this.codeResponse = codeResponse;
	}
	public String getMessageResponse() {
		return messageResponse;
	}
	public void setMessageResponse(String messageResponse) {
		this.messageResponse = messageResponse;
	}
	@Override
	public String toString() {
		return "ResponseDto [codeResponse=" + codeResponse + ", messageResponse=" + messageResponse + "]";
	}
	
	

}
