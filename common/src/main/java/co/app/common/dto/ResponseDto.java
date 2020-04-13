package co.app.common.dto;
/**
 * Generic DTO for the responses of code and message of receipt or not of a request
 * @author yadira muñoz herrera
 *
 */

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
