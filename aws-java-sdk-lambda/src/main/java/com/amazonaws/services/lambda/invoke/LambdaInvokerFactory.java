/*
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.lambda.invoke;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.model.InvocationType;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.services.lambda.model.LogType;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * A factory for objects that implement a user-supplied interface by invoking a remote Lambda
 * function.
 * <p>
 * <code>
 * public class Request {
 *     // Standard POJO stuff here modeling the input your Lambda function
 *     // expects.
 * }
 * 
 * public class Result {
 *     // More standard POJO stuff here modeling the output your Lambda
 *     // function produces.
 * }
 * 
 * public interface LambdaFunctions {
 * 
 * @LambdaFunction Result doSomeStuff(Request request); } LambdaFunctions functions =
 *                 LambdaInvokerFactory.build( LambdaFunctions.class, new AWSLambdaClient());
 *                 Request request = new Request(...); Result result =
 *                 functions.doSomeStuff(request); </code>
 */
public final class LambdaInvokerFactory {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * Creates a new Lambda invoker implementing the given interface and wrapping the given
     * {@code AWSLambda} client.
     *
     * @param interfaceClass
     *            the interface to implement
     * @param awsLambda
     *            the lambda client to use for making remote calls
     */
    public static <T> T build(Class<T> interfaceClass, AWSLambda awsLambda) {
        return build(interfaceClass, awsLambda, new LambdaInvokerFactoryConfig());
    }

    /**
     * Creates a new Lambda invoker implementing the given interface and wrapping the given
     * {@code AWSLambda} client.
     *
     * @param interfaceClass
     *            the interface to implement
     * @param awsLambda
     *            the lambda client to use for making remote calls
     * @param config
     *            configuration for the LambdaInvokerFactory
     */
    public static <T> T build(Class<T> interfaceClass, AWSLambda awsLambda, LambdaInvokerFactoryConfig config) {
        Object proxy = Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[] { interfaceClass },
                new LambdaInvocationHandler(interfaceClass, awsLambda, config));

        return interfaceClass.cast(proxy);
    }

    private LambdaInvokerFactory() {
    }

    private static class LambdaInvocationHandler implements InvocationHandler {

        private final AWSLambda awsLambda;
        private final Log log;
        private final LambdaInvokerFactoryConfig config;

        public LambdaInvocationHandler(Class<?> interfaceClass, AWSLambda awsLambda, LambdaInvokerFactoryConfig config) {

            this.awsLambda = awsLambda;
            this.log = LogFactory.getLog(interfaceClass);
            this.config = config;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            LambdaFunction annotation = validateInterfaceMethod(method, args);

            InvokeRequest invokeRequest = buildInvokeRequest(method, annotation, args == null ? null : args[0]);

            InvokeResult invokeResult = awsLambda.invoke(invokeRequest);

            return processInvokeResult(method, invokeResult);
        }

        /**
         * Verifies that the given method is annotated appropriately.
         */
        private LambdaFunction validateInterfaceMethod(Method method, Object[] args) {

            LambdaFunction annotation = method.getAnnotation(LambdaFunction.class);

            if (annotation == null) {
                throw new LambdaSerializationException("No LambdaFunction annotation for method " + method.getName());
            }

            if (annotation.invocationType() != InvocationType.RequestResponse && annotation.logType() != LogType.None) {
                throw new LambdaSerializationException("InvocationType must be RequestResponse if LogType " + "is set");
            }

            if (args != null && args.length > 1) {
                throw new LambdaSerializationException("LambdaFunctions take either 0 or 1 arguments");
            }

            return annotation;
        }

        /**
         * Builds an InvokeRequest from the given method, its {@code LambdaFunction} annotation, and
         * the input parameter (if any).
         */
        private InvokeRequest buildInvokeRequest(Method method, LambdaFunction annotation, Object input) {

            InvokeRequest invokeRequest = new InvokeRequest();

            String functionName = config.getLambdaFunctionNameResolver().getFunctionName(method, annotation, config);

            invokeRequest.setFunctionName(functionName);
            invokeRequest.setInvocationType(annotation.invocationType());
            invokeRequest.setLogType(annotation.logType());

            if (input != null) {
                try {

                    String payload = MAPPER.writer().writeValueAsString(input);
                    if (log.isDebugEnabled()) {
                        log.debug("Serialized request object to '" + payload + "'");
                    }
                    invokeRequest.setPayload(payload);

                } catch (JsonProcessingException ex) {
                    throw new LambdaSerializationException("Failed to serialize request object to JSON", ex);
                }
            }

            return invokeRequest;
        }

        /**
         * Process the result of invoking a remote function. If the response includes server-side
         * logs, dump them into our logs; if it includes a server-side error indication, parse it
         * into a corresponding {@code Exception} type, otherwise parse the result payload into a
         * Java object suitable for returning from this method.
         */
        private Object processInvokeResult(Method method, InvokeResult invokeResult) throws Throwable {

            if (invokeResult.getLogResult() != null && log.isInfoEnabled()) {
                try {

                    String decoded = new String(Base64.decode(invokeResult.getLogResult()), StringUtils.UTF8);

                    log.info(method.getName() + " log:\n\t" + decoded.replaceAll("\n", "\n\t"));

                } catch (Exception ex) {
                    log.warn("Error decoding log result '" + invokeResult.getLogResult() + "'", ex);
                }
            }

            String functionError = invokeResult.getFunctionError();

            if (functionError == null) {
                // Success.
                return getObjectFromPayload(method, invokeResult);
            } else {
                throw getExceptionFromPayload(method, invokeResult);
            }
        }

        /**
         * Reads a Java object suitable for returning from the given method from the payload of the
         * given {@code InvokeResult} (or returns {@code null} if the method has no return value or
         * the response contains no payload).
         *
         * @throws LambdaSerializationException
         *             on error deserializing
         */
        private Object getObjectFromPayload(Method method, InvokeResult invokeResult) {

            try {

                return getObjectFromPayload(method.getGenericReturnType(), invokeResult.getPayload());

            } catch (IOException ex) {
                throw new LambdaSerializationException("Failed to parse Lambda function result", ex);
            }
        }

        private Throwable getExceptionFromPayload(Method method, InvokeResult invokeResult) {

            Throwable throwable = null;

            String message = "Unexpected error executing Lambda function";
            String type = null;
            List<String> stackTrace = null;

            try {

                LambdaFunctionError error = getObjectFromPayload(LambdaFunctionError.class, invokeResult.getPayload());

                if (error != null) {
                    message = error.getErrorMessage();
                    type = error.getErrorType();
                    stackTrace = error.getStackTrace();

                    throwable = getCustomException(method, error);
                }

            } catch (Exception ex) {
                log.warn("Error parsing exception information from response " + "payload", ex);
            }

            if (throwable == null) {
                throwable = new LambdaFunctionException(message, "Handled".equals(invokeResult.getFunctionError()),
                        type);
            }

            if (stackTrace != null) {
                fillStackTrace(throwable, stackTrace, method.getDeclaringClass());
            }

            return throwable;
        }

        private Throwable getCustomException(Method method, LambdaFunctionError error) {

            String type = error.getErrorType();
            Constructor<?> constructor = null;

            if (type != null) {
                for (Class<?> exceptionType : method.getExceptionTypes()) {
                    if (exceptionType.getSimpleName().startsWith(type)) {
                        constructor = findConstructor(exceptionType);
                        if (constructor != null) {
                            break;
                        }
                    }
                }
            }

            if (constructor != null) {
                try {

                    return (Throwable) constructor.newInstance(error.getErrorMessage());

                } catch (Exception ex) {
                    log.warn("Error constructing custom exception", ex);
                }
            }

            return null;
        }

        private Constructor<?> findConstructor(Class<?> type) {

            for (Constructor<?> constructor : type.getConstructors()) {
                Class<?>[] params = constructor.getParameterTypes();

                if (params != null && params.length == 1 && String.class.equals(params[0])) {

                    return constructor;
                }
            }

            return null;
        }

        private void fillStackTrace(Throwable throwable, List<String> stackTrace, Class<?> interfaceClass) {

            StackTraceElement[] elements = new StackTraceElement[stackTrace.size()];

            for (int i = 0; i < stackTrace.size(); ++i) {
                elements[i] = new StackTraceElement(interfaceClass.getName(), stackTrace.get(i).trim(), null, 0);
            }

            throwable.setStackTrace(elements);
        }

        private <T> T getObjectFromPayload(Class<T> type, ByteBuffer payload) throws IOException {

            return type.cast(getObjectFromPayload((Type) type, payload));
        }

        private Object getObjectFromPayload(Type type, ByteBuffer payload) throws IOException {

            if (type == void.class || payload.remaining() == 0) {
                return null;
            }

            JavaType javaType = MAPPER.getTypeFactory().constructType(type);

            return MAPPER.reader(javaType).readValue(BinaryUtils.copyAllBytesFrom(payload));
        }
    }
}