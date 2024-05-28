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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The error info of the create/delete data store operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ErrorCause" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorCause implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of the error message.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The error category of the create/delete data store operation. Possible statuses are RETRYABLE_ERROR or
     * NON_RETRYABLE_ERROR.
     * </p>
     */
    private String errorCategory;

    /**
     * <p>
     * The text of the error message.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The text of the error message.
     * </p>
     * 
     * @return The text of the error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The text of the error message.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorCause withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The error category of the create/delete data store operation. Possible statuses are RETRYABLE_ERROR or
     * NON_RETRYABLE_ERROR.
     * </p>
     * 
     * @param errorCategory
     *        The error category of the create/delete data store operation. Possible statuses are RETRYABLE_ERROR or
     *        NON_RETRYABLE_ERROR.
     * @see ErrorCategory
     */

    public void setErrorCategory(String errorCategory) {
        this.errorCategory = errorCategory;
    }

    /**
     * <p>
     * The error category of the create/delete data store operation. Possible statuses are RETRYABLE_ERROR or
     * NON_RETRYABLE_ERROR.
     * </p>
     * 
     * @return The error category of the create/delete data store operation. Possible statuses are RETRYABLE_ERROR or
     *         NON_RETRYABLE_ERROR.
     * @see ErrorCategory
     */

    public String getErrorCategory() {
        return this.errorCategory;
    }

    /**
     * <p>
     * The error category of the create/delete data store operation. Possible statuses are RETRYABLE_ERROR or
     * NON_RETRYABLE_ERROR.
     * </p>
     * 
     * @param errorCategory
     *        The error category of the create/delete data store operation. Possible statuses are RETRYABLE_ERROR or
     *        NON_RETRYABLE_ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCategory
     */

    public ErrorCause withErrorCategory(String errorCategory) {
        setErrorCategory(errorCategory);
        return this;
    }

    /**
     * <p>
     * The error category of the create/delete data store operation. Possible statuses are RETRYABLE_ERROR or
     * NON_RETRYABLE_ERROR.
     * </p>
     * 
     * @param errorCategory
     *        The error category of the create/delete data store operation. Possible statuses are RETRYABLE_ERROR or
     *        NON_RETRYABLE_ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCategory
     */

    public ErrorCause withErrorCategory(ErrorCategory errorCategory) {
        this.errorCategory = errorCategory.toString();
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
        if (getErrorCategory() != null)
            sb.append("ErrorCategory: ").append(getErrorCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorCause == false)
            return false;
        ErrorCause other = (ErrorCause) obj;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCategory() == null ^ this.getErrorCategory() == null)
            return false;
        if (other.getErrorCategory() != null && other.getErrorCategory().equals(this.getErrorCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCategory() == null) ? 0 : getErrorCategory().hashCode());
        return hashCode;
    }

    @Override
    public ErrorCause clone() {
        try {
            return (ErrorCause) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.healthlake.model.transform.ErrorCauseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
