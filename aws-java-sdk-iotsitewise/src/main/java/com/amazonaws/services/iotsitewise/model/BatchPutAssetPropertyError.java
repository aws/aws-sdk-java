/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains error information from updating a batch of asset property values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchPutAssetPropertyError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutAssetPropertyError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The associated error message.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     */
    private java.util.List<TimeInNanos> timestamps;

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @see BatchPutAssetPropertyValueErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     * @see BatchPutAssetPropertyValueErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchPutAssetPropertyValueErrorCode
     */

    public BatchPutAssetPropertyError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchPutAssetPropertyValueErrorCode
     */

    public BatchPutAssetPropertyError withErrorCode(BatchPutAssetPropertyValueErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The associated error message.
     * </p>
     * 
     * @param errorMessage
     *        The associated error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The associated error message.
     * </p>
     * 
     * @return The associated error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The associated error message.
     * </p>
     * 
     * @param errorMessage
     *        The associated error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutAssetPropertyError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     * 
     * @return A list of timestamps for each error, if any.
     */

    public java.util.List<TimeInNanos> getTimestamps() {
        return timestamps;
    }

    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     * 
     * @param timestamps
     *        A list of timestamps for each error, if any.
     */

    public void setTimestamps(java.util.Collection<TimeInNanos> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new java.util.ArrayList<TimeInNanos>(timestamps);
    }

    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestamps(java.util.Collection)} or {@link #withTimestamps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timestamps
     *        A list of timestamps for each error, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutAssetPropertyError withTimestamps(TimeInNanos... timestamps) {
        if (this.timestamps == null) {
            setTimestamps(new java.util.ArrayList<TimeInNanos>(timestamps.length));
        }
        for (TimeInNanos ele : timestamps) {
            this.timestamps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     * 
     * @param timestamps
     *        A list of timestamps for each error, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutAssetPropertyError withTimestamps(java.util.Collection<TimeInNanos> timestamps) {
        setTimestamps(timestamps);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getTimestamps() != null)
            sb.append("Timestamps: ").append(getTimestamps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutAssetPropertyError == false)
            return false;
        BatchPutAssetPropertyError other = (BatchPutAssetPropertyError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutAssetPropertyError clone() {
        try {
            return (BatchPutAssetPropertyError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.BatchPutAssetPropertyErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
