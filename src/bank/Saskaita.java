package bank;

import java.math.BigDecimal;

import ibank.Account;

public class Saskaita implements Account{
	
	private BigDecimal amount;
	private String holdername;
	private String number;

	@Override
	public boolean deposit(BigDecimal am) {
		// T
		this.amount = this.amount.add(am);
		return true;
	}

	@Override
	public BigDecimal getBalance() {
		// TODO Auto-generated method stub
		return this.amount;
	}

	@Override
	public String getHolderName() {
		// TODO Auto-generated method stub
		return this.holdername;
	}

	@Override
	public String getNumber() {
		// TODO Auto-generated method stub
		return this.number;
	}

	@Override
	public boolean withdraw(BigDecimal suma) {
		// TODO Auto-generated method stub
		if (suma.compareTo(amount)<=0) {
			this.amount =this.amount.subtract(suma);
		}
				
		return true;	
		
		
	}

}
