
public class OnlineStoreAccount {

	private Long id;
	private String name;
	private String address;
	private Long budget;
	private Long discounRate;
	
	// Builder class
	public static class Builder {
		private Long id;
		private String name;
		private String address;
		private Long budget;
		private Long discounRate;
		
		// constructer with Id
		public Builder(Long id) {
			this.id = id;
		}
		
		public Builder withName(String name) {
			this.name = name;
			
			return this;
		}
		
		public Builder withAddress(String address) {
			this.address = address;
			
			return this;
		}
		
		public Builder withBudget(Long budget) {
			this.budget = budget;
			
			return this;
		}
		
		public Builder withDiscounRate(Long discounRate) {
			this.discounRate = discounRate;
			
			return this;
		}
		
		public OnlineStoreAccount build() {
			OnlineStoreAccount onlineStoreAccount = new OnlineStoreAccount();
			onlineStoreAccount.id = this.id;
			onlineStoreAccount.name = this.name;
			onlineStoreAccount.address = this.address;
			onlineStoreAccount.budget = this.budget;
			onlineStoreAccount.discounRate = this.discounRate;
			
			return onlineStoreAccount;		
		}
	}
	
	private OnlineStoreAccount(){
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Long getDiscounRate() {
		return discounRate;
	}

	public void setDiscounRate(Long discounRate) {
		this.discounRate = discounRate;
	}
}
