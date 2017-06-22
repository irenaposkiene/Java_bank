package bank;

import java.math.BigDecimal;

public class KreSaskaita extends Saskaita {
	

	private BigDecimal limitas;
	
	
	@Override
	public boolean withdraw(BigDecimal amount) {
		
		BigDecimal limit= this.limitas;
		
		BigDecimal balansas= super.getBalance();
		
	
		if (amount.compareTo(balansas) >= 0) {
			limit = limit.subtract(amount.subtract(balansas)); 
			limit=limit.negate();
		
		}
		return true;
	}		
		


}
