package com.mernies.atixLabsResolutions;

import com.mernies.atixLabsResolutions.context.ContextoIntegrityChecker;
import com.mernies.atixLabsResolutions.strategy.HashStrategyFactory;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ){
    	ContextoIntegrityChecker checker = new ContextoIntegrityChecker("Esto es una prueba");
    	checker.setStrategy(HashStrategyFactory.createStrategy(HashStrategyFactory.SHA256));
    	
    	//SHA265 con base64
    	if (checker.comprobarIntegridad("asFyQNt0h2P+6Zbf5sn5uH80zjzN6EmE7Rt9S2WHiTs=")) {
    		System.out.println( "Es integro" );
    	}
    	else {
    		System.out.println( "NO Es integro" );
    	}
    	
    	
    	
    	//MD5 con base64
    	checker.setStrategy(HashStrategyFactory.createStrategy(HashStrategyFactory.MD5));
    	if (checker.comprobarIntegridad("asFyQNt0h2P+6Zbf5sn5uH80zjzN6EmE7Rt9S2WHiTs=")) {
    		System.out.println( "Es integro" );
    	}
    	else {
    		System.out.println( "NO Es integro" );
    	}
    }
}
