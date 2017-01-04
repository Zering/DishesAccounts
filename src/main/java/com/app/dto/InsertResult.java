package com.app.dto;

public class InsertResult<T> {

	private boolean success;

	private T data;

	public InsertResult(boolean success, T data) {
		super();
		this.success = success;
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "InsertResult [success=" + success + ", data=" + data + "]";
	}

}
