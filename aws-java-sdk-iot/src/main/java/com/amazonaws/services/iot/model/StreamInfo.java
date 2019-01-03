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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a stream.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stream ID.
     * </p>
     */
    private String streamId;
    /**
     * <p>
     * The stream ARN.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The stream version.
     * </p>
     */
    private Integer streamVersion;
    /**
     * <p>
     * The description of the stream.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The files to stream.
     * </p>
     */
    private java.util.List<StreamFile> files;
    /**
     * <p>
     * The date when the stream was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date when the stream was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * An IAM role AWS IoT assumes to access your S3 files.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The stream ID.
     * </p>
     * 
     * @param streamId
     *        The stream ID.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * The stream ID.
     * </p>
     * 
     * @return The stream ID.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * <p>
     * The stream ID.
     * </p>
     * 
     * @param streamId
     *        The stream ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withStreamId(String streamId) {
        setStreamId(streamId);
        return this;
    }

    /**
     * <p>
     * The stream ARN.
     * </p>
     * 
     * @param streamArn
     *        The stream ARN.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The stream ARN.
     * </p>
     * 
     * @return The stream ARN.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The stream ARN.
     * </p>
     * 
     * @param streamArn
     *        The stream ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The stream version.
     * </p>
     * 
     * @param streamVersion
     *        The stream version.
     */

    public void setStreamVersion(Integer streamVersion) {
        this.streamVersion = streamVersion;
    }

    /**
     * <p>
     * The stream version.
     * </p>
     * 
     * @return The stream version.
     */

    public Integer getStreamVersion() {
        return this.streamVersion;
    }

    /**
     * <p>
     * The stream version.
     * </p>
     * 
     * @param streamVersion
     *        The stream version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withStreamVersion(Integer streamVersion) {
        setStreamVersion(streamVersion);
        return this;
    }

    /**
     * <p>
     * The description of the stream.
     * </p>
     * 
     * @param description
     *        The description of the stream.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the stream.
     * </p>
     * 
     * @return The description of the stream.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the stream.
     * </p>
     * 
     * @param description
     *        The description of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The files to stream.
     * </p>
     * 
     * @return The files to stream.
     */

    public java.util.List<StreamFile> getFiles() {
        return files;
    }

    /**
     * <p>
     * The files to stream.
     * </p>
     * 
     * @param files
     *        The files to stream.
     */

    public void setFiles(java.util.Collection<StreamFile> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<StreamFile>(files);
    }

    /**
     * <p>
     * The files to stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiles(java.util.Collection)} or {@link #withFiles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param files
     *        The files to stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withFiles(StreamFile... files) {
        if (this.files == null) {
            setFiles(new java.util.ArrayList<StreamFile>(files.length));
        }
        for (StreamFile ele : files) {
            this.files.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The files to stream.
     * </p>
     * 
     * @param files
     *        The files to stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withFiles(java.util.Collection<StreamFile> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * The date when the stream was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the stream was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the stream was created.
     * </p>
     * 
     * @return The date when the stream was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when the stream was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the stream was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date when the stream was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date when the stream was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date when the stream was last updated.
     * </p>
     * 
     * @return The date when the stream was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date when the stream was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date when the stream was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * An IAM role AWS IoT assumes to access your S3 files.
     * </p>
     * 
     * @param roleArn
     *        An IAM role AWS IoT assumes to access your S3 files.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An IAM role AWS IoT assumes to access your S3 files.
     * </p>
     * 
     * @return An IAM role AWS IoT assumes to access your S3 files.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An IAM role AWS IoT assumes to access your S3 files.
     * </p>
     * 
     * @param roleArn
     *        An IAM role AWS IoT assumes to access your S3 files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId()).append(",");
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getStreamVersion() != null)
            sb.append("StreamVersion: ").append(getStreamVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamInfo == false)
            return false;
        StreamInfo other = (StreamInfo) obj;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getStreamVersion() == null ^ this.getStreamVersion() == null)
            return false;
        if (other.getStreamVersion() != null && other.getStreamVersion().equals(this.getStreamVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getStreamVersion() == null) ? 0 : getStreamVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public StreamInfo clone() {
        try {
            return (StreamInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.StreamInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
