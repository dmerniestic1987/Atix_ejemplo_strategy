package com.mernies.atixLabsResolutions.context;

import com.mernies.atixLabsResolutions.strategy.HashStrategy;

public class ContextoIntegrityChecker {
	private HashStrategy strategy;
	private String dato;
	
	public ContextoIntegrityChecker(String dato) {
		this.dato = dato;
	}
	/**
	 * Comprueba la integridad de un dato determinado.
	 * @param currentHash
	 * @return TRUE si es integro, false de lo contrario
	 */
	public boolean comprobarIntegridad(String currentHash) {
		String newHash =  strategy.calcularHash(dato);
		return currentHash.equals(newHash);
	}
	public HashStrategy getStrategy() {
		return strategy;
	}
	public void setStrategy(HashStrategy strategy) {
		this.strategy = strategy;
	}
	
	
}
