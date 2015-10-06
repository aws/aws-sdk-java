/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.waf.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The operation failed because AWS WAF didn't recognize a parameter in the
 * request. For example:
 * </p>
 * <ul>
 * <li>You specified an invalid parameter name.</li>
 * <li>You specified an invalid value.</li>
 * <li>You tried to update an object (<code>ByteMatchSet</code>,
 * <code>IPSet</code>, <code>Rule</code>, or <code>WebACL</code>) using an
 * action other than <code>INSERT</code> or <code>DELETE</code>.</li>
 * <li>You tried to create a <code>WebACL</code> with a
 * <code>DefaultAction</code> <code>Type</code> other than <code>ALLOW</code>,
 * <code>BLOCK</code>, or <code>COUNT</code>.</li>
 * <li>You tried to update a <code>WebACL</code> with a <code>WafAction</code>
 * <code>Type</code> other than <code>ALLOW</code>, <code>BLOCK</code>, or
 * <code>COUNT</code>.</li>
 * <li>You tried to update a <code>ByteMatchSet</code> with a
 * <code>FieldToMatch</code> <code>Type</code> other than HEADER, QUERY_STRING,
 * or URI.</li>
 * <li>You tried to update a <code>ByteMatchSet</code> with a <code>Field</code>
 * of <code>HEADER</code> but no value for <code>Data</code>.</li>
 * </ul>
 */
public class WAFInvalidParameterException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String field;

    private String parameter;

    /**
     * Constructs a new WAFInvalidParameterException with the specified error
     * message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFInvalidParameterException(String message) {
        super(message);
    }

    /**
     * Sets the value of the Field property for this object.
     * 
     * @param field
     *        The new value for the Field property for this object.
     * @see ParameterExceptionField
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Returns the value of the Field property for this object.
     * 
     * @return The value of the Field property for this object.
     * @see ParameterExceptionField
     */
    public String getField() {
        return this.field;
    }

    /**
     * Sets the value of the Field property for this object.
     * 
     * @param field
     *        The new value for the Field property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ParameterExceptionField
     */
    public WAFInvalidParameterException withField(String field) {
        setField(field);
        return this;
    }

    /**
     * Sets the value of the Field property for this object.
     * 
     * @param field
     *        The new value for the Field property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ParameterExceptionField
     */
    public void setField(ParameterExceptionField field) {
        this.field = field.toString();
    }

    /**
     * Sets the value of the Field property for this object.
     * 
     * @param field
     *        The new value for the Field property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ParameterExceptionField
     */
    public WAFInvalidParameterException withField(ParameterExceptionField field) {
        setField(field);
        return this;
    }

    /**
     * Sets the value of the Parameter property for this object.
     * 
     * @param parameter
     *        The new value for the Parameter property for this object.
     */
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * Returns the value of the Parameter property for this object.
     * 
     * @return The value of the Parameter property for this object.
     */
    public String getParameter() {
        return this.parameter;
    }

    /**
     * Sets the value of the Parameter property for this object.
     * 
     * @param parameter
     *        The new value for the Parameter property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public WAFInvalidParameterException withParameter(String parameter) {
        setParameter(parameter);
        return this;
    }

}