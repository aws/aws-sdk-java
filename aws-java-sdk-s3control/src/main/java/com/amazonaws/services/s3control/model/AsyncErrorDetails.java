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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Error details for the failed asynchronous operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AsyncErrorDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AsyncErrorDetails implements Serializable, Cloneable {

    /**
     * <p>
     * A string that uniquely identifies the error condition.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A generic description of the error condition in English.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The identifier of the resource associated with the error.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The ID of the request associated with the error.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * A string that uniquely identifies the error condition.
     * </p>
     * 
     * @param code
     *        A string that uniquely identifies the error condition.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * A string that uniquely identifies the error condition.
     * </p>
     * 
     * @return A string that uniquely identifies the error condition.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * A string that uniquely identifies the error condition.
     * </p>
     * 
     * @param code
     *        A string that uniquely identifies the error condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncErrorDetails withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A generic description of the error condition in English.
     * </p>
     * 
     * @param message
     *        A generic description of the error condition in English.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A generic description of the error condition in English.
     * </p>
     * 
     * @return A generic description of the error condition in English.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A generic description of the error condition in English.
     * </p>
     * 
     * @param message
     *        A generic description of the error condition in English.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncErrorDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The identifier of the resource associated with the error.
     * </p>
     * 
     * @param resource
     *        The identifier of the resource associated with the error.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The identifier of the resource associated with the error.
     * </p>
     * 
     * @return The identifier of the resource associated with the error.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The identifier of the resource associated with the error.
     * </p>
     * 
     * @param resource
     *        The identifier of the resource associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncErrorDetails withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The ID of the request associated with the error.
     * </p>
     * 
     * @param requestId
     *        The ID of the request associated with the error.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The ID of the request associated with the error.
     * </p>
     * 
     * @return The ID of the request associated with the error.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The ID of the request associated with the error.
     * </p>
     * 
     * @param requestId
     *        The ID of the request associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncErrorDetails withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AsyncErrorDetails == false)
            return false;
        AsyncErrorDetails other = (AsyncErrorDetails) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public AsyncErrorDetails clone() {
        try {
            return (AsyncErrorDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
