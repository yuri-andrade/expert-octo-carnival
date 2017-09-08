package s2b.tst.sum;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public class Sum {

	/**
	 * 
	 * @param d
	 * @param e
	 * @return
	 */
	public static double sum(double d, double e) {	
		if (d < 0) {
			throw new IllegalArgumentException("O primeiro número não pode ser negativo!");
		}
		if (e < 0) {
			throw new IllegalArgumentException("O segundo número não pode ser negativo!");
		}
		return d + e;
	}

}
