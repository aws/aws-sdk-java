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
package com.amazonaws.services.route53resolver.model;

import javax.annotation.Generated;

/**
 * <p>
 * One or more parameters in this request are not valid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidParameterException extends com.amazonaws.services.route53resolver.model.AmazonRoute53ResolverException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * For an <code>InvalidParameterException</code> error, the name of the parameter that's invalid.
     * </p>
     */
    private String fieldName;

    /**
     * Constructs a new InvalidParameterException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidParameterException(String message) {
        super(message);
    }

    /**
     * <p>
     * For an <code>InvalidParameterException</code> error, the name of the parameter that's invalid.
     * </p>
     * 
     * @param fieldName
     *        For an <code>InvalidParameterException</code> error, the name of the parameter that's invalid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("FieldName")
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * For an <code>InvalidParameterException</code> error, the name of the parameter that's invalid.
     * </p>
     * 
     * @return For an <code>InvalidParameterException</code> error, the name of the parameter that's invalid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("FieldName")
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * For an <code>InvalidParameterException</code> error, the name of the parameter that's invalid.
     * </p>
     * 
     * @param fieldName
     *        For an <code>InvalidParameterException</code> error, the name of the parameter that's invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidParameterException withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

}
