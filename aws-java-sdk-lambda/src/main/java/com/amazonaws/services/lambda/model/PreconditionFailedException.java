/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import javax.annotation.Generated;

/**
 * <p>
 * The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
 * <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PreconditionFailedException extends com.amazonaws.services.lambda.model.AWSLambdaException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The exception type.
     * </p>
     */
    private String type;

    /**
     * Constructs a new PreconditionFailedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public PreconditionFailedException(String message) {
        super(message);
    }

    /**
     * <p>
     * The exception type.
     * </p>
     * 
     * @param type
     *        The exception type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The exception type.
     * </p>
     * 
     * @return The exception type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The exception type.
     * </p>
     * 
     * @param type
     *        The exception type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreconditionFailedException withType(String type) {
        setType(type);
        return this;
    }

}
