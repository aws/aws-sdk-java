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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional information if the package is in an error state. Null otherwise.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of error that occurred.
     * </p>
     */
    private String errorType;
    /**
     * <p>
     * A message describing the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The type of error that occurred.
     * </p>
     * 
     * @param errorType
     *        The type of error that occurred.
     */

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * <p>
     * The type of error that occurred.
     * </p>
     * 
     * @return The type of error that occurred.
     */

    public String getErrorType() {
        return this.errorType;
    }

    /**
     * <p>
     * The type of error that occurred.
     * </p>
     * 
     * @param errorType
     *        The type of error that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetails withErrorType(String errorType) {
        setErrorType(errorType);
        return this;
    }

    /**
     * <p>
     * A message describing the error.
     * </p>
     * 
     * @param errorMessage
     *        A message describing the error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A message describing the error.
     * </p>
     * 
     * @return A message describing the error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A message describing the error.
     * </p>
     * 
     * @param errorMessage
     *        A message describing the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetails withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getErrorType() != null)
            sb.append("ErrorType: ").append(getErrorType()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
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
        if (other.getErrorType() == null ^ this.getErrorType() == null)
            return false;
        if (other.getErrorType() != null && other.getErrorType().equals(this.getErrorType()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ErrorDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
