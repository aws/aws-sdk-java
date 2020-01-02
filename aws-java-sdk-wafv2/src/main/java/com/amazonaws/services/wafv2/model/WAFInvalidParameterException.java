/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed because AWS WAF didn't recognize a parameter in the request. For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You specified an invalid parameter name or value.
 * </p>
 * </li>
 * <li>
 * <p>
 * Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types available at
 * <a>DefaultAction</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL cannot be
 * associated.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFInvalidParameterException extends com.amazonaws.services.wafv2.model.AWSWAFV2Exception {
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

    @com.fasterxml.jackson.annotation.JsonProperty("Field")
    public void setField(String field) {
        this.field = field;
    }

    /**
     * @return
     * @see ParameterExceptionField
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Field")
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

    @com.fasterxml.jackson.annotation.JsonProperty("Parameter")
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Parameter")
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
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WAFInvalidParameterException withReason(String reason) {
        setReason(reason);
        return this;
    }

}
