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

import com.amazonaws.services.lambda.model.InvokeResult;

/**
 * An exception representing the failed execution of a remote Lambda function.
 *
 * @see InvokeResult#getFunctionError()
 */
public class LambdaFunctionException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final boolean handled;
    private final String type;

    public LambdaFunctionException(String message, boolean handled, String type) {

        super(message);

        this.handled = handled;
        this.type = type;
    }

    /**
     * @return true if this was a Handled error
     * @see InvokeResult#getFunctionError()
     */
    public boolean isHandled() {
        return handled;
    }

    /**
     * @return the type of this exception, if known; null if unknown
     */
    public String getType() {
        return type;
    }
}
