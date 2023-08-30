/*Shopping Cart: Create a 3D array named as cart which stores the
cost of items purchased. Each conveyor belt holds 3 carts at a time.
Each cart should contain Perishable and Non-perishable category items. Findout
a) Total cost of each cart
b) Findout all perishable items sold (on 3 carts)
c) Findout costliest non-perishable item sold*/
//MAIN CLASS
public class Shopping {
	public static void main(String[] args) { // {PERISHABLE},{NONPERISHABLE}
		// HARD-CODED INPUT FOR 3-D ARRAY
		int cart[][][] = { { { 10, 0, 0, 4 }, { 20, 30, 65, 0 } }, // {COST OF 4 ITEMS IN EACH CATAGORY}
				{ { 60, 36, 61, 98 }, { 0, 0, 0, 69 } },
				{ { 90, 100, 500, 45 }, { 45, 0, 0, 0, } } }; // 3 CARTS

		System.out.println("Welcome to Our shop!!");
		calculate(cart);
	}

	// LOOP TO CALCULATE VARIOUS ASKED QUANTITIES
	public static void calculate(int[][][] cart) {
		int sum = 0;
		int countp = 0;
		int costly = cart[0][1][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 4; k++) {
					// CALCULATING THE TOTAL COST OF EACH CART
					sum += cart[i][j][k];

					if (cart[i][0][k] != 0 && j != 1) {
						// TOTAL NUMBER OF PERISHABLE ITEMS
						countp++;
					}
					if (cart[i][1][k] > costly) {
						// COSTLYEST NON-PERISHABLE ITEM SOLD
						costly = cart[i][1][k];
					}

				}

			}
			// DISPLAYING THE CALCULATED QUANTITIES
			System.out.printf("The sum of %d cart is %d\n", i + 1, sum);
			System.out.printf("The number of Perishable items in cart %d is %d\n", i + 1, countp);
			// RESETING VARIABLES FOR CORRECT AND ACCURATE RESULTS
			sum = 0;
			countp = 0;
		}
		System.out.printf("The costlyest Non-Persishable element is for Rs %d/- only\n", costly);
	}
}