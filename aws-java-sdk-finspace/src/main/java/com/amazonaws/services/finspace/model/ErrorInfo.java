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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details in the event of a failed flow, including the error type and the related error message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ErrorInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * Specifies the type of error.
     * </p>
     */
    private String errorType;

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message that appears if a flow fails.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     * 
     * @return Specifies the error message that appears if a flow fails.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message that appears if a flow fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorInfo withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * Specifies the type of error.
     * </p>
     * 
     * @param errorType
     *        Specifies the type of error.
     * @see ErrorDetails
     */

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * <p>
     * Specifies the type of error.
     * </p>
     * 
     * @return Specifies the type of error.
     * @see ErrorDetails
     */

    public String getErrorType() {
        return this.errorType;
    }

    /**
     * <p>
     * Specifies the type of error.
     * </p>
     * 
     * @param errorType
     *        Specifies the type of error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorDetails
     */

    public ErrorInfo withErrorType(String errorType) {
        setErrorType(errorType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of error.
     * </p>
     * 
     * @param errorType
     *        Specifies the type of error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorDetails
     */

    public ErrorInfo withErrorType(ErrorDetails errorType) {
        this.errorType = errorType.toString();
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
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getErrorType() != null)
            sb.append("ErrorType: ").append(getErrorType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorInfo == false)
            return false;
        ErrorInfo other = (ErrorInfo) obj;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorType() == null ^ this.getErrorType() == null)
            return false;
        if (other.getErrorType() != null && other.getErrorType().equals(this.getErrorType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
        return hashCode;
    }

    @Override
    public ErrorInfo clone() {
        try {
            return (ErrorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.ErrorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
