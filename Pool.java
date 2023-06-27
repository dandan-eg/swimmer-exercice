package swimmer;

public class Pool {
	private int lenght;
	private Swimmer swimmer;

	public Pool(Swimmer swimmer, int lenght) {
		this.lenght = lenght;
		this.swimmer = swimmer;
		swimmer.setRange(lenght);
	}

	private int drawSwimmer(StringBuilder sb) {
		String swimmerStr = swimmer.toString();

		for (int i = 0; i < swimmerStr.length(); i++) {
			char c = swimmerStr.charAt(i);
			sb.append(c);
		}

		return swimmerStr.length();
	}

	@Override
	public String toString() {
		int swimmerPosition = swimmer.getPosition();
		int i = 0;
		StringBuilder sb = new StringBuilder();

		//draw pool
		while (i < lenght) {


			if (i == swimmerPosition) {
				int charDrawed = drawSwimmer(sb);
				i += charDrawed;
				continue;
			}

			sb.append('*');
			i++;
		}
		
		
		//new line
		sb.append(System.lineSeparator());
		
		//draw index
		for (int j = 0; j < lenght; j++) {
			int nb = j;
			if(nb >= 10) {
				nb-=10;
			}
			sb.append(nb);
		}
		
		//new line
		sb.append(System.lineSeparator());
		//draw position
		for (int j = 0; j < lenght; j++) {
			if(j != swimmerPosition) {
				sb.append(' ');
			} else {
				sb.append('^');
			}
			
		}
		
		//new line	
		sb.append(System.lineSeparator());
		return sb.toString();
	}

}
