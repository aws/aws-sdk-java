package com.amazonaws.services.lambda.invoke;

import com.amazonaws.util.ValidationUtils;

/**
 * Configuration for {@link LambdaInvokerFactory} to override default behavior.
 */
public class LambdaInvokerFactoryConfig {

    private LambdaFunctionNameResolver lambdaFunctionNameResolver = new DefaultLambdaFunctionNameResolver();

    public LambdaFunctionNameResolver getLambdaFunctionNameResolver() {
        return lambdaFunctionNameResolver;
    }

    /**
     * Sets a new Function name resolver to override the default behavior.
     * 
     * @param functionNameResolver
     *            Implementation of {@link LambdaFunctionNameResolver}
     * @return The current object for method chaining
     */
    public LambdaInvokerFactoryConfig withLambdaFunctionNameResolver(LambdaFunctionNameResolver functionNameResolver) {
        this.lambdaFunctionNameResolver = ValidationUtils.assertNotNull(functionNameResolver, "functionNameResolver");
        return this;
    }
}