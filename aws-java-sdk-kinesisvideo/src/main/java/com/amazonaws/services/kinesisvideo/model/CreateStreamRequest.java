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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the device that is writing to the stream.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Kinesis Video Streams does not use this name.
     * </p>
     * </note>
     */
    private String deviceName;
    /**
     * <p>
     * A name for the stream that you are creating.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for each account and region.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The media type of the stream. Consumers of the stream can use this information when processing the stream. For
     * more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to specify
     * the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming Requirements</a>
     * for guidelines.
     * </p>
     * <p>
     * This parameter is optional; the default value is <code>null</code> (or empty in JSON).
     * </p>
     */
    private String mediaType;
    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt
     * stream data.
     * </p>
     * <p>
     * If no key ID is specified, the default, Kinesis Video-managed key (<code>aws/kinesisvideo</code>) is used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >DescribeKey</a>.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a
     * data store that is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * When the <code>DataRetentionInHours</code> value is 0, consumers can still consume the fragments that remain in
     * the service host buffer, which has a retention time limit of 5 minutes and a retention memory limit of 200 MB.
     * Fragments are removed from the buffer when either limit is reached.
     * </p>
     */
    private Integer dataRetentionInHours;
    /**
     * <p>
     * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the device that is writing to the stream.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Kinesis Video Streams does not use this name.
     * </p>
     * </note>
     * 
     * @param deviceName
     *        The name of the device that is writing to the stream. </p> <note>
     *        <p>
     *        In the current implementation, Kinesis Video Streams does not use this name.
     *        </p>
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of the device that is writing to the stream.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Kinesis Video Streams does not use this name.
     * </p>
     * </note>
     * 
     * @return The name of the device that is writing to the stream. </p> <note>
     *         <p>
     *         In the current implementation, Kinesis Video Streams does not use this name.
     *         </p>
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The name of the device that is writing to the stream.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Kinesis Video Streams does not use this name.
     * </p>
     * </note>
     * 
     * @param deviceName
     *        The name of the device that is writing to the stream. </p> <note>
     *        <p>
     *        In the current implementation, Kinesis Video Streams does not use this name.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamRequest withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * A name for the stream that you are creating.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for each account and region.
     * </p>
     * 
     * @param streamName
     *        A name for the stream that you are creating.</p>
     *        <p>
     *        The stream name is an identifier for the stream, and must be unique for each account and region.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * A name for the stream that you are creating.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for each account and region.
     * </p>
     * 
     * @return A name for the stream that you are creating.</p>
     *         <p>
     *         The stream name is an identifier for the stream, and must be unique for each account and region.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * A name for the stream that you are creating.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for each account and region.
     * </p>
     * 
     * @param streamName
     *        A name for the stream that you are creating.</p>
     *        <p>
     *        The stream name is an identifier for the stream, and must be unique for each account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The media type of the stream. Consumers of the stream can use this information when processing the stream. For
     * more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to specify
     * the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming Requirements</a>
     * for guidelines.
     * </p>
     * <p>
     * This parameter is optional; the default value is <code>null</code> (or empty in JSON).
     * </p>
     * 
     * @param mediaType
     *        The media type of the stream. Consumers of the stream can use this information when processing the stream.
     *        For more information about media types, see <a
     *        href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to
     *        specify the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *        Requirements</a> for guidelines.</p>
     *        <p>
     *        This parameter is optional; the default value is <code>null</code> (or empty in JSON).
     */

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The media type of the stream. Consumers of the stream can use this information when processing the stream. For
     * more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to specify
     * the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming Requirements</a>
     * for guidelines.
     * </p>
     * <p>
     * This parameter is optional; the default value is <code>null</code> (or empty in JSON).
     * </p>
     * 
     * @return The media type of the stream. Consumers of the stream can use this information when processing the
     *         stream. For more information about media types, see <a
     *         href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to
     *         specify the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *         Requirements</a> for guidelines.</p>
     *         <p>
     *         This parameter is optional; the default value is <code>null</code> (or empty in JSON).
     */

    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * <p>
     * The media type of the stream. Consumers of the stream can use this information when processing the stream. For
     * more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to specify
     * the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming Requirements</a>
     * for guidelines.
     * </p>
     * <p>
     * This parameter is optional; the default value is <code>null</code> (or empty in JSON).
     * </p>
     * 
     * @param mediaType
     *        The media type of the stream. Consumers of the stream can use this information when processing the stream.
     *        For more information about media types, see <a
     *        href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to
     *        specify the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *        Requirements</a> for guidelines.</p>
     *        <p>
     *        This parameter is optional; the default value is <code>null</code> (or empty in JSON).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamRequest withMediaType(String mediaType) {
        setMediaType(mediaType);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt
     * stream data.
     * </p>
     * <p>
     * If no key ID is specified, the default, Kinesis Video-managed key (<code>aws/kinesisvideo</code>) is used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >DescribeKey</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to
     *        encrypt stream data.</p>
     *        <p>
     *        If no key ID is specified, the default, Kinesis Video-managed key (<code>aws/kinesisvideo</code>) is used.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *        >DescribeKey</a>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt
     * stream data.
     * </p>
     * <p>
     * If no key ID is specified, the default, Kinesis Video-managed key (<code>aws/kinesisvideo</code>) is used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >DescribeKey</a>.
     * </p>
     * 
     * @return The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to
     *         encrypt stream data.</p>
     *         <p>
     *         If no key ID is specified, the default, Kinesis Video-managed key (<code>aws/kinesisvideo</code>) is
     *         used.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *         >DescribeKey</a>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt
     * stream data.
     * </p>
     * <p>
     * If no key ID is specified, the default, Kinesis Video-managed key (<code>aws/kinesisvideo</code>) is used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >DescribeKey</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to
     *        encrypt stream data.</p>
     *        <p>
     *        If no key ID is specified, the default, Kinesis Video-managed key (<code>aws/kinesisvideo</code>) is used.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *        >DescribeKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a
     * data store that is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * When the <code>DataRetentionInHours</code> value is 0, consumers can still consume the fragments that remain in
     * the service host buffer, which has a retention time limit of 5 minutes and a retention memory limit of 200 MB.
     * Fragments are removed from the buffer when either limit is reached.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data
     *        in a data store that is associated with the stream.</p>
     *        <p>
     *        The default value is 0, indicating that the stream does not persist data.
     *        </p>
     *        <p>
     *        When the <code>DataRetentionInHours</code> value is 0, consumers can still consume the fragments that
     *        remain in the service host buffer, which has a retention time limit of 5 minutes and a retention memory
     *        limit of 200 MB. Fragments are removed from the buffer when either limit is reached.
     */

    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a
     * data store that is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * When the <code>DataRetentionInHours</code> value is 0, consumers can still consume the fragments that remain in
     * the service host buffer, which has a retention time limit of 5 minutes and a retention memory limit of 200 MB.
     * Fragments are removed from the buffer when either limit is reached.
     * </p>
     * 
     * @return The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the
     *         data in a data store that is associated with the stream.</p>
     *         <p>
     *         The default value is 0, indicating that the stream does not persist data.
     *         </p>
     *         <p>
     *         When the <code>DataRetentionInHours</code> value is 0, consumers can still consume the fragments that
     *         remain in the service host buffer, which has a retention time limit of 5 minutes and a retention memory
     *         limit of 200 MB. Fragments are removed from the buffer when either limit is reached.
     */

    public Integer getDataRetentionInHours() {
        return this.dataRetentionInHours;
    }

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a
     * data store that is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * When the <code>DataRetentionInHours</code> value is 0, consumers can still consume the fragments that remain in
     * the service host buffer, which has a retention time limit of 5 minutes and a retention memory limit of 200 MB.
     * Fragments are removed from the buffer when either limit is reached.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data
     *        in a data store that is associated with the stream.</p>
     *        <p>
     *        The default value is 0, indicating that the stream does not persist data.
     *        </p>
     *        <p>
     *        When the <code>DataRetentionInHours</code> value is 0, consumers can still consume the fragments that
     *        remain in the service host buffer, which has a retention time limit of 5 minutes and a retention memory
     *        limit of 200 MB. Fragments are removed from the buffer when either limit is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamRequest withDataRetentionInHours(Integer dataRetentionInHours) {
        setDataRetentionInHours(dataRetentionInHours);
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
     * </p>
     * 
     * @return A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is
     *         optional).
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is
     *        optional).
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is
     *        optional).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateStreamRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamRequest clearTagsEntries() {
        this.tags = null;
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
        if (getMediaType() != null)
            sb.append("MediaType: ").append(getMediaType()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDataRetentionInHours() != null)
            sb.append("DataRetentionInHours: ").append(getDataRetentionInHours()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamRequest == false)
            return false;
        CreateStreamRequest other = (CreateStreamRequest) obj;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDataRetentionInHours() == null) ? 0 : getDataRetentionInHours().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamRequest clone() {
        return (CreateStreamRequest) super.clone();
    }

}
