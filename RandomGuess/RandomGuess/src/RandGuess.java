// Wolovich, Logan | 08-26-2024 | J. Flannery

import javax.swing.JOptionPane;

public class RandGuess {

	public static void main(String[] args) {
		// Min & Max Parameters
		int minNumber = 1;
		int maxNumber = 10;
		
		// Initial Message
		JOptionPane.showMessageDialog(null, 
			"Think of a number between %d - %d".formatted(minNumber, maxNumber)
		);

		// Secondary Message
		JOptionPane.showMessageDialog(null, 
			"The Number: %d".formatted((minNumber + (int)(Math.random() * maxNumber)))
		);
	}

}
