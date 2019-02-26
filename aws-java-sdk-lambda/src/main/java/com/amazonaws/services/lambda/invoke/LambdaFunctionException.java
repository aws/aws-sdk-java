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

import com.amazonaws.AmazonClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.util.CollectionUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An exception representing the failed execution of a remote Lambda function.
 *
 * @see InvokeResult#getFunctionError()
 */
public class LambdaFunctionException extends AmazonClientException {

    private final String errorType;
    private final List<List<String>> stackTraces;
    private String functionError;

    /**
     * @deprecated This exception class should only be created internally by the SDK.
     */
    @Deprecated
    public LambdaFunctionException(String message, boolean handled, String type) {
        this(type, message, null, null);
        setFunctionError(handled ? "Handeled" : "Unhandled");
    }

    @SdkInternalApi
    LambdaFunctionException(String errorMessage, String functionError) {
        this(null, errorMessage, null, null);
        setFunctionError(functionError);
    }

    @JsonCreator
    @SdkInternalApi
    LambdaFunctionException(@JsonProperty("errorType") String errorType,
                            @JsonProperty("errorMessage") String errorMessage,
                            @JsonProperty("cause") LambdaFunctionException cause,
                            @JsonProperty("stackTrace") List<List<String>> stackTraces) {
        super(errorMessage, cause);

        this.errorType = errorType;
        this.stackTraces = stackTraces == null ? Collections.<List<String>>emptyList() : stackTraces;
    }

    /**
     * @return the type of this exception, if known; null if unknown
     */
    public String getType() {
        return errorType;
    }

    /**
     * @return true if this was a Handled error
     * @see InvokeResult#getFunctionError()
     */
    public boolean isHandled() {
        return "Handled".equals(functionError);
    }

    @Override
    public synchronized LambdaFunctionException getCause() {
        return (LambdaFunctionException) super.getCause();
    }

    @SdkInternalApi
    void setFunctionError(String functionError) {
        this.functionError = functionError;
    }

    @SdkInternalApi
    void fillInStackTrace(Class<?> interfaceClass) {
        if (stackTraces != null) {
            final List<StackTraceElement> elements = new ArrayList<StackTraceElement>();
            for (List<String> stackTrace : stackTraces) {
                final String methodName = CollectionUtils.join(stackTrace, ",").trim();
                elements.add(new StackTraceElement(interfaceClass.getName(), methodName, null, -1));
            }
            this.setStackTrace(elements.toArray(new StackTraceElement[elements.size()]));
        }
        if (getCause() != null) {
            getCause().fillInStackTrace(interfaceClass);
        }
    }
}
