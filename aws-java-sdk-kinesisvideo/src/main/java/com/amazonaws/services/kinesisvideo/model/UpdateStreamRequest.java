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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream whose metadata you want to update.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for each account and region.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The ARN of the stream whose metadata you want to update.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The version of the stream whose metadata you want to update.
     * </p>
     */
    private String currentVersion;
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
     * The stream's media type. Use <code>MediaType</code> to specify the type of content that the stream contains to
     * the consumers of the stream. For more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to specify
     * the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a>.
     * </p>
     * <p>
     * To play video on the console, you must specify the correct video type. For example, if the video in the stream is
     * H.264, specify <code>video/h264</code> as the <code>MediaType</code>.
     * </p>
     */
    private String mediaType;

    /**
     * <p>
     * The name of the stream whose metadata you want to update.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for each account and region.
     * </p>
     * 
     * @param streamName
     *        The name of the stream whose metadata you want to update.</p>
     *        <p>
     *        The stream name is an identifier for the stream, and must be unique for each account and region.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream whose metadata you want to update.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for each account and region.
     * </p>
     * 
     * @return The name of the stream whose metadata you want to update.</p>
     *         <p>
     *         The stream name is an identifier for the stream, and must be unique for each account and region.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream whose metadata you want to update.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for each account and region.
     * </p>
     * 
     * @param streamName
     *        The name of the stream whose metadata you want to update.</p>
     *        <p>
     *        The stream name is an identifier for the stream, and must be unique for each account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The ARN of the stream whose metadata you want to update.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the stream whose metadata you want to update.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The ARN of the stream whose metadata you want to update.
     * </p>
     * 
     * @return The ARN of the stream whose metadata you want to update.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The ARN of the stream whose metadata you want to update.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the stream whose metadata you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The version of the stream whose metadata you want to update.
     * </p>
     * 
     * @param currentVersion
     *        The version of the stream whose metadata you want to update.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of the stream whose metadata you want to update.
     * </p>
     * 
     * @return The version of the stream whose metadata you want to update.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The version of the stream whose metadata you want to update.
     * </p>
     * 
     * @param currentVersion
     *        The version of the stream whose metadata you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
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

    public UpdateStreamRequest withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The stream's media type. Use <code>MediaType</code> to specify the type of content that the stream contains to
     * the consumers of the stream. For more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to specify
     * the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a>.
     * </p>
     * <p>
     * To play video on the console, you must specify the correct video type. For example, if the video in the stream is
     * H.264, specify <code>video/h264</code> as the <code>MediaType</code>.
     * </p>
     * 
     * @param mediaType
     *        The stream's media type. Use <code>MediaType</code> to specify the type of content that the stream
     *        contains to the consumers of the stream. For more information about media types, see <a
     *        href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to
     *        specify the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *        Requirements</a>.</p>
     *        <p>
     *        To play video on the console, you must specify the correct video type. For example, if the video in the
     *        stream is H.264, specify <code>video/h264</code> as the <code>MediaType</code>.
     */

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The stream's media type. Use <code>MediaType</code> to specify the type of content that the stream contains to
     * the consumers of the stream. For more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to specify
     * the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a>.
     * </p>
     * <p>
     * To play video on the console, you must specify the correct video type. For example, if the video in the stream is
     * H.264, specify <code>video/h264</code> as the <code>MediaType</code>.
     * </p>
     * 
     * @return The stream's media type. Use <code>MediaType</code> to specify the type of content that the stream
     *         contains to the consumers of the stream. For more information about media types, see <a
     *         href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to
     *         specify the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *         Requirements</a>.</p>
     *         <p>
     *         To play video on the console, you must specify the correct video type. For example, if the video in the
     *         stream is H.264, specify <code>video/h264</code> as the <code>MediaType</code>.
     */

    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * <p>
     * The stream's media type. Use <code>MediaType</code> to specify the type of content that the stream contains to
     * the consumers of the stream. For more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to specify
     * the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a>.
     * </p>
     * <p>
     * To play video on the console, you must specify the correct video type. For example, if the video in the stream is
     * H.264, specify <code>video/h264</code> as the <code>MediaType</code>.
     * </p>
     * 
     * @param mediaType
     *        The stream's media type. Use <code>MediaType</code> to specify the type of content that the stream
     *        contains to the consumers of the stream. For more information about media types, see <a
     *        href="http://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a>. If you choose to
     *        specify the <code>MediaType</code>, see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *        Requirements</a>.</p>
     *        <p>
     *        To play video on the console, you must specify the correct video type. For example, if the video in the
     *        stream is H.264, specify <code>video/h264</code> as the <code>MediaType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamRequest withMediaType(String mediaType) {
        setMediaType(mediaType);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getMediaType() != null)
            sb.append("MediaType: ").append(getMediaType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStreamRequest == false)
            return false;
        UpdateStreamRequest other = (UpdateStreamRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStreamRequest clone() {
        return (UpdateStreamRequest) super.clone();
    }

}
