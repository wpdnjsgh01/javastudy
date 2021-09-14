package prob03;

public class Money {
	
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	//----------------------------------------------------
	
	public Money(int num) {
		this.setAmount(num);
	}

	public Money add(Money money) {
		int num = this.getAmount() + money.getAmount();
		Money rst = new Money(num);
		return rst; 
	}
	
	public Money minus(Money money) {
		int num = this.getAmount() - money.getAmount();
		Money rst = new Money(num);
		return rst; 
	}

	public Money multiply(Money money) {
		int num = this.getAmount() * money.getAmount();
		Money rst = new Money(num);
		return rst; 
	}

	public Money devide(Money money) {
		int num = this.getAmount() / money.getAmount();
		Money rst = new Money(num);
		return rst; 
	}

	public boolean equals(Money obj) {
        if(this.getAmount() == obj.getAmount()) {
        	return true;
        }
        else {
        	return false;
        }
        
    }

}
