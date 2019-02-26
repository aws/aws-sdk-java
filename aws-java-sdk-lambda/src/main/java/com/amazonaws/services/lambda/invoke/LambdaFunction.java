/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.lambda.model.InvocationType;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.LogType;

/**
 * An annotation that marks methods of an interface that are meant to be proxied to remote code
 * running on AWS Lambda. Methods may accept zero or one arguments, and may return zero or one
 * values. Inputs and outputs will be converted to/from JSON using the Jackson {@code ObjectMapper}.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LambdaFunction {

    /**
     * The name of the Lambda function to invoke for this annotated method. If not explicitly set,
     * the name of the interface method is used.
     * <p>
     * <code>
     * public interface LambdaFunctions {
     * 
     * @LambdaFunction(functionName="ActualFunctionName") void notTheRealFunctionName(); } </code>
     * @see InvokeRequest#setFunctionName(String)
     */
    String functionName() default "";

    /**
     * The type of invocation to use. If unspecified, defaults to {@code RequestResponse}. If a
     * {@code logType} of anything other than {@code None} is specified, the invocation type may
     * <b>only</b> be set to {@code RequestResponse}.
     * <p>
     * <code>
     * public interface LambdaFunctions {
     * 
     * @LambdaFunction(functionName="DoIt") void doIt();
     * @LambdaFunction(functionName="DoIt", invocationType=InvocationType.Event) void
     *                                      doItAsynchronously();
     * @LambdaFunction(functionName="DoIt", invocationType=InvocationType.DryRun) void dryRunIt(); }
     *                                      </code>
     * @see InvokeRequest#setInvocationType(InvocationType)
     */
    InvocationType invocationType() default InvocationType.RequestResponse;

    /**
     * The type of log to request from the service. If unspecified, no logs will be requested. If
     * specified, the invocation type may <b>only</b> be set to {@code RequestResponse}.
     * <p>
     * When specified, the log information returned by the Lambda function will be emitted to the
     * JCL log for the interface class at the {@code INFO} level.
     *
     * @see InvokeRequest#setLogType(LogType)
     * @see LogFactory#getLog(Class)
     */
    LogType logType() default LogType.None;
}
