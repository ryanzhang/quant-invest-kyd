package com.cgc.horizon0.account.vo;

import javax.enterprise.context.ApplicationScoped;

public class EmailRecipientVO {

	private String to;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public EmailRecipientVO(String to) {
		super();
		this.to = to;
	}

	@Override
	public String toString() {
		return "Recipient [to=" + to + "]";
	}

	public EmailRecipientVO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
