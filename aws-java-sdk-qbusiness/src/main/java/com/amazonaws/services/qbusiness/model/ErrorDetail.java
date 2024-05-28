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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a data source sync error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ErrorDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message explaining the data source sync error.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The code associated with the data source sync error.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * The message explaining the data source sync error.
     * </p>
     * 
     * @param errorMessage
     *        The message explaining the data source sync error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message explaining the data source sync error.
     * </p>
     * 
     * @return The message explaining the data source sync error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The message explaining the data source sync error.
     * </p>
     * 
     * @param errorMessage
     *        The message explaining the data source sync error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetail withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The code associated with the data source sync error.
     * </p>
     * 
     * @param errorCode
     *        The code associated with the data source sync error.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code associated with the data source sync error.
     * </p>
     * 
     * @return The code associated with the data source sync error.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The code associated with the data source sync error.
     * </p>
     * 
     * @param errorCode
     *        The code associated with the data source sync error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorDetail withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The code associated with the data source sync error.
     * </p>
     * 
     * @param errorCode
     *        The code associated with the data source sync error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorDetail withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorDetail == false)
            return false;
        ErrorDetail other = (ErrorDetail) obj;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        return hashCode;
    }

    @Override
    public ErrorDetail clone() {
        try {
            return (ErrorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.ErrorDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
