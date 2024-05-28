/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A validation failure that occurred as the result of a pre-update validation check (verbose dry run) on a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationFailure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code of the failure.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A message corresponding to the failure.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code of the failure.
     * </p>
     * 
     * @param code
     *        The error code of the failure.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code of the failure.
     * </p>
     * 
     * @return The error code of the failure.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code of the failure.
     * </p>
     * 
     * @param code
     *        The error code of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationFailure withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A message corresponding to the failure.
     * </p>
     * 
     * @param message
     *        A message corresponding to the failure.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message corresponding to the failure.
     * </p>
     * 
     * @return A message corresponding to the failure.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message corresponding to the failure.
     * </p>
     * 
     * @param message
     *        A message corresponding to the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationFailure withMessage(String message) {
        setMessage(message);
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
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationFailure == false)
            return false;
        ValidationFailure other = (ValidationFailure) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ValidationFailure clone() {
        try {
            return (ValidationFailure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ValidationFailureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
