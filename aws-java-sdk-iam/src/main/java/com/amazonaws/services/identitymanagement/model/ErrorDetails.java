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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the reason that the operation failed.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetServiceLastAccessedDetails</a> operation and the
 * <a>GetServiceLastAccessedDetailsWithEntities</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ErrorDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorDetails implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed information about the reason that the operation failed.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The error code associated with the operation failure.
     * </p>
     */
    private String code;

    /**
     * <p>
     * Detailed information about the reason that the operation failed.
     * </p>
     * 
     * @param message
     *        Detailed information about the reason that the operation failed.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Detailed information about the reason that the operation failed.
     * </p>
     * 
     * @return Detailed information about the reason that the operation failed.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Detailed information about the reason that the operation failed.
     * </p>
     * 
     * @param message
     *        Detailed information about the reason that the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The error code associated with the operation failure.
     * </p>
     * 
     * @param code
     *        The error code associated with the operation failure.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code associated with the operation failure.
     * </p>
     * 
     * @return The error code associated with the operation failure.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code associated with the operation failure.
     * </p>
     * 
     * @param code
     *        The error code associated with the operation failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetails withCode(String code) {
        setCode(code);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorDetails == false)
            return false;
        ErrorDetails other = (ErrorDetails) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public ErrorDetails clone() {
        try {
            return (ErrorDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
