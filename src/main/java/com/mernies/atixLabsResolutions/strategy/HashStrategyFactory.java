package com.mernies.atixLabsResolutions.strategy;

public class HashStrategyFactory {
	public static final int MD5 = 0;
	public static final int SHA256 = 1;
	
	public static HashStrategy createStrategy(int tipo) throws RuntimeException{
		switch(tipo) {
			case MD5:
				return new MD5Strategy();
			
			case SHA256:
				return new Sha256Strategy();
			
			default:
				throw new RuntimeException("No existe el algoritmo: " +  tipo);
		}
	}
}
