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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamingSessionStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingSessionStream implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user ID of the user that created the streaming session stream.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource expires.
     * </p>
     */
    private java.util.Date expiresAt;
    /**
     * <p>
     * The current state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The streaming session stream status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The stream ID.
     * </p>
     */
    private String streamId;
    /**
     * <p>
     * The URL to connect to this stream using the DCV client.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionStream withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that created the streaming session stream.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the streaming session stream.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the streaming session stream.
     * </p>
     * 
     * @return The user ID of the user that created the streaming session stream.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the streaming session stream.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the streaming session stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionStream withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource expires.
     * </p>
     * 
     * @param expiresAt
     *        The Unix epoch timestamp in seconds for when the resource expires.
     */

    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource expires.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource expires.
     */

    public java.util.Date getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource expires.
     * </p>
     * 
     * @param expiresAt
     *        The Unix epoch timestamp in seconds for when the resource expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionStream withExpiresAt(java.util.Date expiresAt) {
        setExpiresAt(expiresAt);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @see StreamingSessionStreamState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @return The current state.
     * @see StreamingSessionStreamState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStreamState
     */

    public StreamingSessionStream withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStreamState
     */

    public StreamingSessionStream withState(StreamingSessionStreamState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The streaming session stream status code.
     * </p>
     * 
     * @param statusCode
     *        The streaming session stream status code.
     * @see StreamingSessionStreamStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The streaming session stream status code.
     * </p>
     * 
     * @return The streaming session stream status code.
     * @see StreamingSessionStreamStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The streaming session stream status code.
     * </p>
     * 
     * @param statusCode
     *        The streaming session stream status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStreamStatusCode
     */

    public StreamingSessionStream withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The streaming session stream status code.
     * </p>
     * 
     * @param statusCode
     *        The streaming session stream status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStreamStatusCode
     */

    public StreamingSessionStream withStatusCode(StreamingSessionStreamStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

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

    public StreamingSessionStream withStreamId(String streamId) {
        setStreamId(streamId);
        return this;
    }

    /**
     * <p>
     * The URL to connect to this stream using the DCV client.
     * </p>
     * 
     * @param url
     *        The URL to connect to this stream using the DCV client.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to connect to this stream using the DCV client.
     * </p>
     * 
     * @return The URL to connect to this stream using the DCV client.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL to connect to this stream using the DCV client.
     * </p>
     * 
     * @param url
     *        The URL to connect to this stream using the DCV client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionStream withUrl(String url) {
        setUrl(url);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getExpiresAt() != null)
            sb.append("ExpiresAt: ").append(getExpiresAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingSessionStream == false)
            return false;
        StreamingSessionStream other = (StreamingSessionStream) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public StreamingSessionStream clone() {
        try {
            return (StreamingSessionStream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamingSessionStreamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
