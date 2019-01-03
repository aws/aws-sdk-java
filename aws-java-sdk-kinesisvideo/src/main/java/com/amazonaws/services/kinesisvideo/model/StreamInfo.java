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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object describing a Kinesis video stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/StreamInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the device that is associated with the stream.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The name of the stream.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The <code>MediaType</code> of the stream.
     * </p>
     */
    private String mediaType;
    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the
     * stream.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The version of the stream.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The status of the stream.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A time stamp that indicates when the stream was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * How long the stream retains data, in hours.
     * </p>
     */
    private Integer dataRetentionInHours;

    /**
     * <p>
     * The name of the device that is associated with the stream.
     * </p>
     * 
     * @param deviceName
     *        The name of the device that is associated with the stream.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of the device that is associated with the stream.
     * </p>
     * 
     * @return The name of the device that is associated with the stream.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The name of the device that is associated with the stream.
     * </p>
     * 
     * @param deviceName
     *        The name of the device that is associated with the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @param streamName
     *        The name of the stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @return The name of the stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @param streamName
     *        The name of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The <code>MediaType</code> of the stream.
     * </p>
     * 
     * @param mediaType
     *        The <code>MediaType</code> of the stream.
     */

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The <code>MediaType</code> of the stream.
     * </p>
     * 
     * @return The <code>MediaType</code> of the stream.
     */

    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * <p>
     * The <code>MediaType</code> of the stream.
     * </p>
     * 
     * @param mediaType
     *        The <code>MediaType</code> of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withMediaType(String mediaType) {
        setMediaType(mediaType);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the
     * stream.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on
     *        the stream.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the
     * stream.
     * </p>
     * 
     * @return The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on
     *         the stream.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the
     * stream.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on
     *        the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * 
     * @param version
     *        The version of the stream.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * 
     * @return The version of the stream.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * 
     * @param version
     *        The version of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * 
     * @param status
     *        The status of the stream.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * 
     * @return The status of the stream.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * 
     * @param status
     *        The status of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public StreamInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * 
     * @param status
     *        The status of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public StreamInfo withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A time stamp that indicates when the stream was created.
     * </p>
     * 
     * @param creationTime
     *        A time stamp that indicates when the stream was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp that indicates when the stream was created.
     * </p>
     * 
     * @return A time stamp that indicates when the stream was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp that indicates when the stream was created.
     * </p>
     * 
     * @param creationTime
     *        A time stamp that indicates when the stream was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * How long the stream retains data, in hours.
     * </p>
     * 
     * @param dataRetentionInHours
     *        How long the stream retains data, in hours.
     */

    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * <p>
     * How long the stream retains data, in hours.
     * </p>
     * 
     * @return How long the stream retains data, in hours.
     */

    public Integer getDataRetentionInHours() {
        return this.dataRetentionInHours;
    }

    /**
     * <p>
     * How long the stream retains data, in hours.
     * </p>
     * 
     * @param dataRetentionInHours
     *        How long the stream retains data, in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamInfo withDataRetentionInHours(Integer dataRetentionInHours) {
        setDataRetentionInHours(dataRetentionInHours);
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
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getMediaType() != null)
            sb.append("MediaType: ").append(getMediaType()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDataRetentionInHours() != null)
            sb.append("DataRetentionInHours: ").append(getDataRetentionInHours());
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
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDataRetentionInHours() == null) ? 0 : getDataRetentionInHours().hashCode());
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
        com.amazonaws.services.kinesisvideo.model.transform.StreamInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
