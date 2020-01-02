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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the SPICE ingestion for a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Ingestion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ingestion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Ingestion ID.
     * </p>
     */
    private String ingestionId;
    /**
     * <p>
     * Ingestion status.
     * </p>
     */
    private String ingestionStatus;
    /**
     * <p>
     * Error information for this ingestion.
     * </p>
     */
    private ErrorInfo errorInfo;

    private RowInfo rowInfo;

    private QueueInfo queueInfo;
    /**
     * <p>
     * The time that this ingestion started.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time that this ingestion took, measured in seconds.
     * </p>
     */
    private Long ingestionTimeInSeconds;
    /**
     * <p>
     * The size of the data ingested, in bytes.
     * </p>
     */
    private Long ingestionSizeInBytes;
    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     */
    private String requestSource;
    /**
     * <p>
     * Type of this ingestion.
     * </p>
     */
    private String requestType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Ingestion ID.
     * </p>
     * 
     * @param ingestionId
     *        Ingestion ID.
     */

    public void setIngestionId(String ingestionId) {
        this.ingestionId = ingestionId;
    }

    /**
     * <p>
     * Ingestion ID.
     * </p>
     * 
     * @return Ingestion ID.
     */

    public String getIngestionId() {
        return this.ingestionId;
    }

    /**
     * <p>
     * Ingestion ID.
     * </p>
     * 
     * @param ingestionId
     *        Ingestion ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withIngestionId(String ingestionId) {
        setIngestionId(ingestionId);
        return this;
    }

    /**
     * <p>
     * Ingestion status.
     * </p>
     * 
     * @param ingestionStatus
     *        Ingestion status.
     * @see IngestionStatus
     */

    public void setIngestionStatus(String ingestionStatus) {
        this.ingestionStatus = ingestionStatus;
    }

    /**
     * <p>
     * Ingestion status.
     * </p>
     * 
     * @return Ingestion status.
     * @see IngestionStatus
     */

    public String getIngestionStatus() {
        return this.ingestionStatus;
    }

    /**
     * <p>
     * Ingestion status.
     * </p>
     * 
     * @param ingestionStatus
     *        Ingestion status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionStatus
     */

    public Ingestion withIngestionStatus(String ingestionStatus) {
        setIngestionStatus(ingestionStatus);
        return this;
    }

    /**
     * <p>
     * Ingestion status.
     * </p>
     * 
     * @param ingestionStatus
     *        Ingestion status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionStatus
     */

    public Ingestion withIngestionStatus(IngestionStatus ingestionStatus) {
        this.ingestionStatus = ingestionStatus.toString();
        return this;
    }

    /**
     * <p>
     * Error information for this ingestion.
     * </p>
     * 
     * @param errorInfo
     *        Error information for this ingestion.
     */

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Error information for this ingestion.
     * </p>
     * 
     * @return Error information for this ingestion.
     */

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * Error information for this ingestion.
     * </p>
     * 
     * @param errorInfo
     *        Error information for this ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withErrorInfo(ErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
        return this;
    }

    /**
     * @param rowInfo
     */

    public void setRowInfo(RowInfo rowInfo) {
        this.rowInfo = rowInfo;
    }

    /**
     * @return
     */

    public RowInfo getRowInfo() {
        return this.rowInfo;
    }

    /**
     * @param rowInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withRowInfo(RowInfo rowInfo) {
        setRowInfo(rowInfo);
        return this;
    }

    /**
     * @param queueInfo
     */

    public void setQueueInfo(QueueInfo queueInfo) {
        this.queueInfo = queueInfo;
    }

    /**
     * @return
     */

    public QueueInfo getQueueInfo() {
        return this.queueInfo;
    }

    /**
     * @param queueInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withQueueInfo(QueueInfo queueInfo) {
        setQueueInfo(queueInfo);
        return this;
    }

    /**
     * <p>
     * The time that this ingestion started.
     * </p>
     * 
     * @param createdTime
     *        The time that this ingestion started.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this ingestion started.
     * </p>
     * 
     * @return The time that this ingestion started.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that this ingestion started.
     * </p>
     * 
     * @param createdTime
     *        The time that this ingestion started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time that this ingestion took, measured in seconds.
     * </p>
     * 
     * @param ingestionTimeInSeconds
     *        The time that this ingestion took, measured in seconds.
     */

    public void setIngestionTimeInSeconds(Long ingestionTimeInSeconds) {
        this.ingestionTimeInSeconds = ingestionTimeInSeconds;
    }

    /**
     * <p>
     * The time that this ingestion took, measured in seconds.
     * </p>
     * 
     * @return The time that this ingestion took, measured in seconds.
     */

    public Long getIngestionTimeInSeconds() {
        return this.ingestionTimeInSeconds;
    }

    /**
     * <p>
     * The time that this ingestion took, measured in seconds.
     * </p>
     * 
     * @param ingestionTimeInSeconds
     *        The time that this ingestion took, measured in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withIngestionTimeInSeconds(Long ingestionTimeInSeconds) {
        setIngestionTimeInSeconds(ingestionTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The size of the data ingested, in bytes.
     * </p>
     * 
     * @param ingestionSizeInBytes
     *        The size of the data ingested, in bytes.
     */

    public void setIngestionSizeInBytes(Long ingestionSizeInBytes) {
        this.ingestionSizeInBytes = ingestionSizeInBytes;
    }

    /**
     * <p>
     * The size of the data ingested, in bytes.
     * </p>
     * 
     * @return The size of the data ingested, in bytes.
     */

    public Long getIngestionSizeInBytes() {
        return this.ingestionSizeInBytes;
    }

    /**
     * <p>
     * The size of the data ingested, in bytes.
     * </p>
     * 
     * @param ingestionSizeInBytes
     *        The size of the data ingested, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withIngestionSizeInBytes(Long ingestionSizeInBytes) {
        setIngestionSizeInBytes(ingestionSizeInBytes);
        return this;
    }

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * 
     * @param requestSource
     *        Event source for this ingestion.
     * @see IngestionRequestSource
     */

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * 
     * @return Event source for this ingestion.
     * @see IngestionRequestSource
     */

    public String getRequestSource() {
        return this.requestSource;
    }

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * 
     * @param requestSource
     *        Event source for this ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionRequestSource
     */

    public Ingestion withRequestSource(String requestSource) {
        setRequestSource(requestSource);
        return this;
    }

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * 
     * @param requestSource
     *        Event source for this ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionRequestSource
     */

    public Ingestion withRequestSource(IngestionRequestSource requestSource) {
        this.requestSource = requestSource.toString();
        return this;
    }

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * 
     * @param requestType
     *        Type of this ingestion.
     * @see IngestionRequestType
     */

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * 
     * @return Type of this ingestion.
     * @see IngestionRequestType
     */

    public String getRequestType() {
        return this.requestType;
    }

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * 
     * @param requestType
     *        Type of this ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionRequestType
     */

    public Ingestion withRequestType(String requestType) {
        setRequestType(requestType);
        return this;
    }

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * 
     * @param requestType
     *        Type of this ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionRequestType
     */

    public Ingestion withRequestType(IngestionRequestType requestType) {
        this.requestType = requestType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getIngestionId() != null)
            sb.append("IngestionId: ").append(getIngestionId()).append(",");
        if (getIngestionStatus() != null)
            sb.append("IngestionStatus: ").append(getIngestionStatus()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo()).append(",");
        if (getRowInfo() != null)
            sb.append("RowInfo: ").append(getRowInfo()).append(",");
        if (getQueueInfo() != null)
            sb.append("QueueInfo: ").append(getQueueInfo()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getIngestionTimeInSeconds() != null)
            sb.append("IngestionTimeInSeconds: ").append(getIngestionTimeInSeconds()).append(",");
        if (getIngestionSizeInBytes() != null)
            sb.append("IngestionSizeInBytes: ").append(getIngestionSizeInBytes()).append(",");
        if (getRequestSource() != null)
            sb.append("RequestSource: ").append(getRequestSource()).append(",");
        if (getRequestType() != null)
            sb.append("RequestType: ").append(getRequestType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ingestion == false)
            return false;
        Ingestion other = (Ingestion) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIngestionId() == null ^ this.getIngestionId() == null)
            return false;
        if (other.getIngestionId() != null && other.getIngestionId().equals(this.getIngestionId()) == false)
            return false;
        if (other.getIngestionStatus() == null ^ this.getIngestionStatus() == null)
            return false;
        if (other.getIngestionStatus() != null && other.getIngestionStatus().equals(this.getIngestionStatus()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getRowInfo() == null ^ this.getRowInfo() == null)
            return false;
        if (other.getRowInfo() != null && other.getRowInfo().equals(this.getRowInfo()) == false)
            return false;
        if (other.getQueueInfo() == null ^ this.getQueueInfo() == null)
            return false;
        if (other.getQueueInfo() != null && other.getQueueInfo().equals(this.getQueueInfo()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getIngestionTimeInSeconds() == null ^ this.getIngestionTimeInSeconds() == null)
            return false;
        if (other.getIngestionTimeInSeconds() != null && other.getIngestionTimeInSeconds().equals(this.getIngestionTimeInSeconds()) == false)
            return false;
        if (other.getIngestionSizeInBytes() == null ^ this.getIngestionSizeInBytes() == null)
            return false;
        if (other.getIngestionSizeInBytes() != null && other.getIngestionSizeInBytes().equals(this.getIngestionSizeInBytes()) == false)
            return false;
        if (other.getRequestSource() == null ^ this.getRequestSource() == null)
            return false;
        if (other.getRequestSource() != null && other.getRequestSource().equals(this.getRequestSource()) == false)
            return false;
        if (other.getRequestType() == null ^ this.getRequestType() == null)
            return false;
        if (other.getRequestType() != null && other.getRequestType().equals(this.getRequestType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getIngestionId() == null) ? 0 : getIngestionId().hashCode());
        hashCode = prime * hashCode + ((getIngestionStatus() == null) ? 0 : getIngestionStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getRowInfo() == null) ? 0 : getRowInfo().hashCode());
        hashCode = prime * hashCode + ((getQueueInfo() == null) ? 0 : getQueueInfo().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getIngestionTimeInSeconds() == null) ? 0 : getIngestionTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getIngestionSizeInBytes() == null) ? 0 : getIngestionSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getRequestSource() == null) ? 0 : getRequestSource().hashCode());
        hashCode = prime * hashCode + ((getRequestType() == null) ? 0 : getRequestType().hashCode());
        return hashCode;
    }

    @Override
    public Ingestion clone() {
        try {
            return (Ingestion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.IngestionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
