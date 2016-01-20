package com.amazonaws.services.lambda.invoke;

import java.lang.reflect.Method;

public interface LambdaFunctionNameResolver {
    String getFunctionName(Method method, LambdaFunction annotation, LambdaInvokerFactoryConfig config);
}
