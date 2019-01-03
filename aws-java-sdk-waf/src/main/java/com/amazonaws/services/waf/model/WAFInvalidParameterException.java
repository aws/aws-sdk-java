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
package com.amazonaws.services.waf.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed because AWS WAF didn't recognize a parameter in the request. For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You specified an invalid parameter name.
 * </p>
 * </li>
 * <li>
 * <p>
 * You specified an invalid value.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
 * <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
 * <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than <code>IP</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
 * <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other than HEADER,
 * METHOD, QUERY_STRING, URI, or BODY.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no value for
 * <code>Data</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL cannot be
 * associated.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFInvalidParameterException extends com.amazonaws.services.waf.model.AWSWAFException {
    private static final long serialVersionUID = 1L;

    private String field;

    private String parameter;

    private String reason;

    /**
     * Constructs a new WAFInvalidParameterException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFInvalidParameterException(String message) {
        super(message);
    }

    /**
     * @param field
     * @see ParameterExceptionField
     */

    @com.fasterxml.jackson.annotation.JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    /**
     * @return
     * @see ParameterExceptionField
     */

    @com.fasterxml.jackson.annotation.JsonProperty("field")
    public String getField() {
        return this.field;
    }

    /**
     * @param field
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterExceptionField
     */

    public WAFInvalidParameterException withField(String field) {
        setField(field);
        return this;
    }

    /**
     * @param field
     * @see ParameterExceptionField
     */

    public void setField(ParameterExceptionField field) {
        withField(field);
    }

    /**
     * @param field
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterExceptionField
     */

    public WAFInvalidParameterException withField(ParameterExceptionField field) {
        this.field = field.toString();
        return this;
    }

    /**
     * @param parameter
     */

    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public String getParameter() {
        return this.parameter;
    }

    /**
     * @param parameter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WAFInvalidParameterException withParameter(String parameter) {
        setParameter(parameter);
        return this;
    }

    /**
     * @param reason
     * @see ParameterExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     * @see ParameterExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterExceptionReason
     */

    public WAFInvalidParameterException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * @param reason
     * @see ParameterExceptionReason
     */

    public void setReason(ParameterExceptionReason reason) {
        withReason(reason);
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterExceptionReason
     */

    public WAFInvalidParameterException withReason(ParameterExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
