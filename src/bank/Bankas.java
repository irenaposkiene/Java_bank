package bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ibank.Account;
import ibank.Bank;

public class Bankas implements Bank {
	
	Collection <Account> saskaitos = new HashSet ();
	

	@Override
	public void closeAccount(Account a) {
		// TODO Auto-generated method stub
		if (saskaitos.contains(a)){
			saskaitos.remove(a);
		}
		
	}

	@Override
	public Account getAccountByHolderName(String name) {
		// vieneta
		
		for (Account naujas:saskaitos) {
			if (naujas.getHolderName().equals(name)) {
				return naujas;
			}
			else {
				return null;
			}
		}
		
		return null;
	}

	@Override
	public Account getAccountByNumber(String number) {
		// vieneta
		 for (Account naujas: saskaitos) {
			if (naujas.getNumber().equals(number)) {
				return naujas;
			}
		 }
		
		return null;
	}

	@Override
	public Collection<Account> getAllAccounts() {
		// TODO collecija
		
		List <Account> sask = new ArrayList();
		
		for(Account a: saskaitos) {
			if (a!=null) {
				sask.add(a);
			}
		}
		
		return sask;
	}
//saskaitos
	
	@Override
	public int getNumberOfAccounts() {
		// TODO Auto-generated method stub
		return saskaitos.size();
	}

	@Override
	public BigDecimal getTotalReserves() {
		// TODO Auto-generated method stub
		BigDecimal suma = new BigDecimal(0);
		for( Account ac:saskaitos ) {
			
			suma.add(ac.getBalance());
		}
		
		return suma;
	}

	@Override
	public Account openCreditAccount(String arg0, BigDecimal arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account openDebitAccount(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
