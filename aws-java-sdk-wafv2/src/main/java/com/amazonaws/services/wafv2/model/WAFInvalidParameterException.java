/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The operation failed because WAF didn't recognize a parameter in the request. For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You specified a parameter name or value that isn't valid.
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
 * Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't be
 * associated.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFInvalidParameterException extends com.amazonaws.services.wafv2.model.AWSWAFV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The settings where the invalid parameter was found.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The invalid parameter that resulted in the exception.
     * </p>
     */
    private String parameter;
    /**
     * <p>
     * Additional information about the exception.
     * </p>
     */
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
     * <p>
     * The settings where the invalid parameter was found.
     * </p>
     * 
     * @param field
     *        The settings where the invalid parameter was found.
     * @see ParameterExceptionField
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Field")
    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The settings where the invalid parameter was found.
     * </p>
     * 
     * @return The settings where the invalid parameter was found.
     * @see ParameterExceptionField
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Field")
    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The settings where the invalid parameter was found.
     * </p>
     * 
     * @param field
     *        The settings where the invalid parameter was found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterExceptionField
     */

    public WAFInvalidParameterException withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The settings where the invalid parameter was found.
     * </p>
     * 
     * @param field
     *        The settings where the invalid parameter was found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterExceptionField
     */

    public WAFInvalidParameterException withField(ParameterExceptionField field) {
        this.field = field.toString();
        return this;
    }

    /**
     * <p>
     * The invalid parameter that resulted in the exception.
     * </p>
     * 
     * @param parameter
     *        The invalid parameter that resulted in the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Parameter")
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * <p>
     * The invalid parameter that resulted in the exception.
     * </p>
     * 
     * @return The invalid parameter that resulted in the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Parameter")
    public String getParameter() {
        return this.parameter;
    }

    /**
     * <p>
     * The invalid parameter that resulted in the exception.
     * </p>
     * 
     * @param parameter
     *        The invalid parameter that resulted in the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WAFInvalidParameterException withParameter(String parameter) {
        setParameter(parameter);
        return this;
    }

    /**
     * <p>
     * Additional information about the exception.
     * </p>
     * 
     * @param reason
     *        Additional information about the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Additional information about the exception.
     * </p>
     * 
     * @return Additional information about the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Additional information about the exception.
     * </p>
     * 
     * @param reason
     *        Additional information about the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WAFInvalidParameterException withReason(String reason) {
        setReason(reason);
        return this;
    }

}
