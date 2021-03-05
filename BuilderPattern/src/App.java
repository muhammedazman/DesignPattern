
public class App {

	public static void main(String[] args) {
		/*
		OnlineStoreAccount johnSmith = new OnlineStoreAccount(1L, "John Smith", "Liberty JLane 23", 100L, 2L);
		OnlineStoreAccount janeTaylor = new OnlineStoreAccount(1L, "Jane Taylor", "Goethe Street 55", 2L, 100L);
		*/
		
		OnlineStoreAccount account = new OnlineStoreAccount.Builder(1L)
				.withName("JohnSmith")
				.withAddress("Oxford Lane 35A")
				.withBudget(100L)
				.withDiscounRate(2L)
				.build();
		
		
		System.out.println(account.getName());
		System.out.println(account.getAddress());
		System.out.println(account.getBudget());
		System.out.println(account.getDiscounRate());
	}
}
