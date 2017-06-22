package bank;

import ibank.Bank;
import ibank.BaseBankTest;

public class myTest extends BaseBankTest {

	@Override
	protected Bank createBank() {
		// TODO Auto-generated method stub
		return new Bankas();
	}

}
