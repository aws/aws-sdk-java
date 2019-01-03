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
package com.amazonaws.services.macie.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Includes details about the failed S3 resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/FailedS3Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedS3Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The failed S3 resources.
     * </p>
     */
    private S3Resource failedItem;
    /**
     * <p>
     * The status code of a failed item.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message of a failed item.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The failed S3 resources.
     * </p>
     * 
     * @param failedItem
     *        The failed S3 resources.
     */

    public void setFailedItem(S3Resource failedItem) {
        this.failedItem = failedItem;
    }

    /**
     * <p>
     * The failed S3 resources.
     * </p>
     * 
     * @return The failed S3 resources.
     */

    public S3Resource getFailedItem() {
        return this.failedItem;
    }

    /**
     * <p>
     * The failed S3 resources.
     * </p>
     * 
     * @param failedItem
     *        The failed S3 resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedS3Resource withFailedItem(S3Resource failedItem) {
        setFailedItem(failedItem);
        return this;
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * 
     * @param errorCode
     *        The status code of a failed item.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * 
     * @return The status code of a failed item.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * 
     * @param errorCode
     *        The status code of a failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedS3Resource withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message of a failed item.
     * </p>
     * 
     * @param errorMessage
     *        The error message of a failed item.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message of a failed item.
     * </p>
     * 
     * @return The error message of a failed item.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message of a failed item.
     * </p>
     * 
     * @param errorMessage
     *        The error message of a failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedS3Resource withErrorMessage(String errorMessage) {
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
        if (getFailedItem() != null)
            sb.append("FailedItem: ").append(getFailedItem()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
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

        if (obj instanceof FailedS3Resource == false)
            return false;
        FailedS3Resource other = (FailedS3Resource) obj;
        if (other.getFailedItem() == null ^ this.getFailedItem() == null)
            return false;
        if (other.getFailedItem() != null && other.getFailedItem().equals(this.getFailedItem()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
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

        hashCode = prime * hashCode + ((getFailedItem() == null) ? 0 : getFailedItem().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailedS3Resource clone() {
        try {
            return (FailedS3Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie.model.transform.FailedS3ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
