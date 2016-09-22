/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * You have exceeded your maximum total code size per account. <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>
 * </p>
 */
public class CodeStorageExceededException extends com.amazonaws.services.lambda.model.AWSLambdaException {
    private static final long serialVersionUID = 1L;

    /** <p/> */
    private String type;

    /**
     * Constructs a new CodeStorageExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CodeStorageExceededException(String message) {
        super(message);
    }

    /**
     * <p/>
     * 
     * @param type
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p/>
     * 
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * <p/>
     * 
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeStorageExceededException withType(String type) {
        setType(type);
        return this;
    }

}
