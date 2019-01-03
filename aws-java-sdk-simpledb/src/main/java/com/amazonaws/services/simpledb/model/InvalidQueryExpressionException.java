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
package com.amazonaws.services.simpledb.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified query expression syntax is not valid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidQueryExpressionException extends com.amazonaws.services.simpledb.model.AmazonSimpleDBException {
    private static final long serialVersionUID = 1L;

    private Float boxUsage;

    /**
     * Constructs a new InvalidQueryExpressionException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidQueryExpressionException(String message) {
        super(message);
    }

    /**
     * @param boxUsage
     */

    public void setBoxUsage(Float boxUsage) {
        this.boxUsage = boxUsage;
    }

    /**
     * @return
     */

    public Float getBoxUsage() {
        return this.boxUsage;
    }

    /**
     * @param boxUsage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidQueryExpressionException withBoxUsage(Float boxUsage) {
        setBoxUsage(boxUsage);
        return this;
    }

}
