package co.app.front.util;
/**
 * 
 *In this class it is implemented in a generic way to make post and get requests with DTO
 */

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.app.common.util.Constant;
@Component
public class Rest<T> {
	private HttpStatus status;
	
	private RestTemplate rest;
	private HttpHeaders headers;
	
	
	public Rest() {

		rest = new RestTemplate();
		headers = new HttpHeaders();
		headers.add(Constant.HEADER_CONTENT_TYPE, "application/json; charset=utf-8");
		headers.add(Constant.HEADER_ACCEPT, "*/*");

	}

	
	public T post(String dto, ParameterizedTypeReference<T> c, String uri) {
		
		HttpEntity<String> requestEntity = new HttpEntity<>(dto, headers);
		ResponseEntity<T> responseEntity = rest.exchange(  uri, HttpMethod.POST, requestEntity, c);
		setStatus(responseEntity.getStatusCode());
		return (T) responseEntity.getBody();
	}

	public T get(String uri, ParameterizedTypeReference<T> c) {
		
		HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
		ResponseEntity<T> responseEntity = rest.exchange(  uri, HttpMethod.GET, requestEntity, c);
		this.setStatus(responseEntity.getStatusCode());
		return (T) responseEntity.getBody();
	}

	public T put(T dto, Class<T> c, String uri, char tipo) {
		
		HttpEntity<T> requestEntity = new HttpEntity<>(dto, headers);
		ResponseEntity<T> responseEntity = rest.exchange(  uri, HttpMethod.PUT, requestEntity, c);
		setStatus(responseEntity.getStatusCode());
		this.setStatus(responseEntity.getStatusCode());

		return (T) responseEntity.getBody();

	}
	
	public T delete(String url,ParameterizedTypeReference<T> param, char tipo ) {
		
		HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
		ResponseEntity<T> responseEntity = rest.exchange(  url, HttpMethod.DELETE, requestEntity, param);
		setStatus(responseEntity.getStatusCode());
		this.setStatus(responseEntity.getStatusCode());

		return (T) responseEntity.getBody();
	}


	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	/**
	 * @return the headers
	 */
	public HttpHeaders getHeaders() {
		return headers;
	}

	/**
	 * @param headers the headers to set
	 */
	public void setHeaders(HttpHeaders headers) {
		this.headers = headers;
	}
}
