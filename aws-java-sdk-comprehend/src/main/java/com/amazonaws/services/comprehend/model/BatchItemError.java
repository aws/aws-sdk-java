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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an error that occurred while processing a document in a batch. The operation returns on
 * <code>BatchItemError</code> object for each document that contained an error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchItemError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchItemError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     */
    private Integer index;
    /**
     * <p>
     * The numeric error code of the error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A text description of the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @return The zero-based index of the document in the input list.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchItemError withIndex(Integer index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * The numeric error code of the error.
     * </p>
     * 
     * @param errorCode
     *        The numeric error code of the error.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The numeric error code of the error.
     * </p>
     * 
     * @return The numeric error code of the error.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The numeric error code of the error.
     * </p>
     * 
     * @param errorCode
     *        The numeric error code of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchItemError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A text description of the error.
     * </p>
     * 
     * @param errorMessage
     *        A text description of the error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A text description of the error.
     * </p>
     * 
     * @return A text description of the error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A text description of the error.
     * </p>
     * 
     * @param errorMessage
     *        A text description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchItemError withErrorMessage(String errorMessage) {
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
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

        if (obj instanceof BatchItemError == false)
            return false;
        BatchItemError other = (BatchItemError) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
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

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchItemError clone() {
        try {
            return (BatchItemError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.BatchItemErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
