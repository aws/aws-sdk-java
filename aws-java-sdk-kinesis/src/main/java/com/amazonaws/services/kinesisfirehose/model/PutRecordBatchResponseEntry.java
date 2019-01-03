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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the result for an individual record from a <a>PutRecordBatch</a> request. If the record is successfully
 * added to your delivery stream, it receives a record ID. If the record fails to be added to your delivery stream, the
 * result includes an error code and an error message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/PutRecordBatchResponseEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecordBatchResponseEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the record.
     * </p>
     */
    private String recordId;
    /**
     * <p>
     * The error code for an individual record result.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message for an individual record result.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The ID of the record.
     * </p>
     * 
     * @param recordId
     *        The ID of the record.
     */

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * <p>
     * The ID of the record.
     * </p>
     * 
     * @return The ID of the record.
     */

    public String getRecordId() {
        return this.recordId;
    }

    /**
     * <p>
     * The ID of the record.
     * </p>
     * 
     * @param recordId
     *        The ID of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordBatchResponseEntry withRecordId(String recordId) {
        setRecordId(recordId);
        return this;
    }

    /**
     * <p>
     * The error code for an individual record result.
     * </p>
     * 
     * @param errorCode
     *        The error code for an individual record result.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for an individual record result.
     * </p>
     * 
     * @return The error code for an individual record result.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for an individual record result.
     * </p>
     * 
     * @param errorCode
     *        The error code for an individual record result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordBatchResponseEntry withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message for an individual record result.
     * </p>
     * 
     * @param errorMessage
     *        The error message for an individual record result.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message for an individual record result.
     * </p>
     * 
     * @return The error message for an individual record result.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message for an individual record result.
     * </p>
     * 
     * @param errorMessage
     *        The error message for an individual record result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordBatchResponseEntry withErrorMessage(String errorMessage) {
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
        if (getRecordId() != null)
            sb.append("RecordId: ").append(getRecordId()).append(",");
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

        if (obj instanceof PutRecordBatchResponseEntry == false)
            return false;
        PutRecordBatchResponseEntry other = (PutRecordBatchResponseEntry) obj;
        if (other.getRecordId() == null ^ this.getRecordId() == null)
            return false;
        if (other.getRecordId() != null && other.getRecordId().equals(this.getRecordId()) == false)
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

        hashCode = prime * hashCode + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public PutRecordBatchResponseEntry clone() {
        try {
            return (PutRecordBatchResponseEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.PutRecordBatchResponseEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
