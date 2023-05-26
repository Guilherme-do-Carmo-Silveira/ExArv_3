package view;

import docarmo.ArvoreChar.Arvore;

public class main {

	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		
		char [] vt = {'M', 'F', 'S','D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		
		for(int i : vt) {
			a.insert((char) i);
		}
		
		try {
			a.remove('F');
			a.remove('U');
			System.out.print("=======================\n");
			a.prefixSearch();
			System.out.print("\n=======================\n");
			a.infixSearch();
			System.out.print("\n=======================\n");
			a.postfixSearch();
			System.out.print("\n=======================\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
