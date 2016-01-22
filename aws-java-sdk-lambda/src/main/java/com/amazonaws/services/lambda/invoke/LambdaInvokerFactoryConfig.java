package com.amazonaws.services.lambda.invoke;

import java.lang.reflect.Method;

public class LambdaInvokerFactoryConfig {

    private final LambdaFunctionNameResolver lambdaFunctionNameResolver;

    public LambdaInvokerFactoryConfig() {
        this(new DefaultLambdaFunctionNameResolver());
    }

    public LambdaInvokerFactoryConfig(LambdaFunctionNameResolver lambdaFunctionNameResolver) {
        this.lambdaFunctionNameResolver = lambdaFunctionNameResolver;
    }

    public LambdaFunctionNameResolver getLambdaFunctionNameResolver() {
        return lambdaFunctionNameResolver;
    }

    public static class DefaultLambdaFunctionNameResolver implements LambdaFunctionNameResolver {

        @Override
        public String getFunctionName(Method method, LambdaFunction annotation, LambdaInvokerFactoryConfig config) {
            String functionName = annotation.functionName();
            if (functionName.isEmpty()) {
                functionName = method.getName();
            }
            return functionName;
        }
    }
}
