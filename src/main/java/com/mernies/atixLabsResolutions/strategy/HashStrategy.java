package com.mernies.atixLabsResolutions.strategy;

public interface HashStrategy {
	/**
	 * Calcula el hash de un String
	 * @param input
	 * @return hash en base64
	 */
	public String calcularHash(String input);
}
