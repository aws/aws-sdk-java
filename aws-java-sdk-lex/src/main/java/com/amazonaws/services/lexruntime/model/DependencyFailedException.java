/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lexruntime.model;

import javax.annotation.Generated;

/**
 * <p>
 * One of the downstream dependencies, such as AWS Lambda or Amazon Polly, threw an exception. For example, if Amazon
 * Lex does not have sufficient permissions to call a Lambda function, it results in Lambda throwing an exception.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DependencyFailedException extends com.amazonaws.services.lexruntime.model.AmazonLexRuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DependencyFailedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DependencyFailedException(String message) {
        super(message);
    }

}
