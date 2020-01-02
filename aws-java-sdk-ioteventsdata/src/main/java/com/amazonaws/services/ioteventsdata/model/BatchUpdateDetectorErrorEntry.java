/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the error that occured when attempting to update a detector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchUpdateDetectorErrorEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateDetectorErrorEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>"messageId"</code> of the update request that caused the error. (The value of the
     * <code>"messageId"</code> in the update request <code>"Detector"</code> object.)
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The code of the error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A message describing the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The <code>"messageId"</code> of the update request that caused the error. (The value of the
     * <code>"messageId"</code> in the update request <code>"Detector"</code> object.)
     * </p>
     * 
     * @param messageId
     *        The <code>"messageId"</code> of the update request that caused the error. (The value of the
     *        <code>"messageId"</code> in the update request <code>"Detector"</code> object.)
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The <code>"messageId"</code> of the update request that caused the error. (The value of the
     * <code>"messageId"</code> in the update request <code>"Detector"</code> object.)
     * </p>
     * 
     * @return The <code>"messageId"</code> of the update request that caused the error. (The value of the
     *         <code>"messageId"</code> in the update request <code>"Detector"</code> object.)
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The <code>"messageId"</code> of the update request that caused the error. (The value of the
     * <code>"messageId"</code> in the update request <code>"Detector"</code> object.)
     * </p>
     * 
     * @param messageId
     *        The <code>"messageId"</code> of the update request that caused the error. (The value of the
     *        <code>"messageId"</code> in the update request <code>"Detector"</code> object.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateDetectorErrorEntry withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The code of the error.
     * </p>
     * 
     * @param errorCode
     *        The code of the error.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code of the error.
     * </p>
     * 
     * @return The code of the error.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The code of the error.
     * </p>
     * 
     * @param errorCode
     *        The code of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchUpdateDetectorErrorEntry withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The code of the error.
     * </p>
     * 
     * @param errorCode
     *        The code of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchUpdateDetectorErrorEntry withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
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

    public BatchUpdateDetectorErrorEntry withErrorMessage(String errorMessage) {
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
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

        if (obj instanceof BatchUpdateDetectorErrorEntry == false)
            return false;
        BatchUpdateDetectorErrorEntry other = (BatchUpdateDetectorErrorEntry) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
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

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateDetectorErrorEntry clone() {
        try {
            return (BatchUpdateDetectorErrorEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.BatchUpdateDetectorErrorEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
