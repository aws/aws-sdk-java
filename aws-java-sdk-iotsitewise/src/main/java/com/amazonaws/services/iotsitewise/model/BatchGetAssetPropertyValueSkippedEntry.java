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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information for an entry that has been processed by the previous <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
 * >BatchGetAssetPropertyValue</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchGetAssetPropertyValueSkippedEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyValueSkippedEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the entry.
     * </p>
     */
    private String entryId;
    /**
     * <p>
     * The completion status of each entry that is associated with the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
     * >BatchGetAssetPropertyValue</a> request.
     * </p>
     */
    private String completionStatus;
    /**
     * <p>
     * The error information, such as the error code and the timestamp.
     * </p>
     */
    private BatchGetAssetPropertyValueErrorInfo errorInfo;

    /**
     * <p>
     * The ID of the entry.
     * </p>
     * 
     * @param entryId
     *        The ID of the entry.
     */

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * The ID of the entry.
     * </p>
     * 
     * @return The ID of the entry.
     */

    public String getEntryId() {
        return this.entryId;
    }

    /**
     * <p>
     * The ID of the entry.
     * </p>
     * 
     * @param entryId
     *        The ID of the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueSkippedEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * The completion status of each entry that is associated with the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
     * >BatchGetAssetPropertyValue</a> request.
     * </p>
     * 
     * @param completionStatus
     *        The completion status of each entry that is associated with the <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
     *        >BatchGetAssetPropertyValue</a> request.
     * @see BatchEntryCompletionStatus
     */

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    /**
     * <p>
     * The completion status of each entry that is associated with the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
     * >BatchGetAssetPropertyValue</a> request.
     * </p>
     * 
     * @return The completion status of each entry that is associated with the <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
     *         >BatchGetAssetPropertyValue</a> request.
     * @see BatchEntryCompletionStatus
     */

    public String getCompletionStatus() {
        return this.completionStatus;
    }

    /**
     * <p>
     * The completion status of each entry that is associated with the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
     * >BatchGetAssetPropertyValue</a> request.
     * </p>
     * 
     * @param completionStatus
     *        The completion status of each entry that is associated with the <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
     *        >BatchGetAssetPropertyValue</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchEntryCompletionStatus
     */

    public BatchGetAssetPropertyValueSkippedEntry withCompletionStatus(String completionStatus) {
        setCompletionStatus(completionStatus);
        return this;
    }

    /**
     * <p>
     * The completion status of each entry that is associated with the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
     * >BatchGetAssetPropertyValue</a> request.
     * </p>
     * 
     * @param completionStatus
     *        The completion status of each entry that is associated with the <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
     *        >BatchGetAssetPropertyValue</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchEntryCompletionStatus
     */

    public BatchGetAssetPropertyValueSkippedEntry withCompletionStatus(BatchEntryCompletionStatus completionStatus) {
        this.completionStatus = completionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The error information, such as the error code and the timestamp.
     * </p>
     * 
     * @param errorInfo
     *        The error information, such as the error code and the timestamp.
     */

    public void setErrorInfo(BatchGetAssetPropertyValueErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * The error information, such as the error code and the timestamp.
     * </p>
     * 
     * @return The error information, such as the error code and the timestamp.
     */

    public BatchGetAssetPropertyValueErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * The error information, such as the error code and the timestamp.
     * </p>
     * 
     * @param errorInfo
     *        The error information, such as the error code and the timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueSkippedEntry withErrorInfo(BatchGetAssetPropertyValueErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
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
        if (getEntryId() != null)
            sb.append("EntryId: ").append(getEntryId()).append(",");
        if (getCompletionStatus() != null)
            sb.append("CompletionStatus: ").append(getCompletionStatus()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAssetPropertyValueSkippedEntry == false)
            return false;
        BatchGetAssetPropertyValueSkippedEntry other = (BatchGetAssetPropertyValueSkippedEntry) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getCompletionStatus() == null ^ this.getCompletionStatus() == null)
            return false;
        if (other.getCompletionStatus() != null && other.getCompletionStatus().equals(this.getCompletionStatus()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getCompletionStatus() == null) ? 0 : getCompletionStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAssetPropertyValueSkippedEntry clone() {
        try {
            return (BatchGetAssetPropertyValueSkippedEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.BatchGetAssetPropertyValueSkippedEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
