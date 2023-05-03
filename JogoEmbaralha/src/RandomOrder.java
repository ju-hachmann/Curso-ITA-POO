import java.util.ArrayList;
import java.util.Random;


public class RandomOrder implements Embaralhador {

	public RandomOrder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String embaralha(String palavra) {
		Random generator = new Random();
		int index;
		String random = "";
		ArrayList<Integer> indexesList = new ArrayList<Integer>();
		if (palavra.length() > 0) {
			random = palavra;
			if (palavra.length() == 1) {
				return random;
			}
			while (random.equals(palavra)) {
				random = "";
				for (int i = 0; i < palavra.length(); i++) {
					index = generator.nextInt(palavra.length());
					while (indexesList.contains(index)) {
						index = generator.nextInt(palavra.length());
					}
					indexesList.add(index);
					random += palavra.charAt(index);
				}
			}
		}
		return random;
	}

	@Override
	public int dificuldade() {
		// TODO Auto-generated method stub
		return 0;
	}

}
