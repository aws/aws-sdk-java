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
 * Describes a group of files that can be streamed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Stream implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stream ID.
     * </p>
     */
    private String streamId;
    /**
     * <p>
     * The ID of a file associated with a stream.
     * </p>
     */
    private Integer fileId;

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

    public Stream withStreamId(String streamId) {
        setStreamId(streamId);
        return this;
    }

    /**
     * <p>
     * The ID of a file associated with a stream.
     * </p>
     * 
     * @param fileId
     *        The ID of a file associated with a stream.
     */

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * <p>
     * The ID of a file associated with a stream.
     * </p>
     * 
     * @return The ID of a file associated with a stream.
     */

    public Integer getFileId() {
        return this.fileId;
    }

    /**
     * <p>
     * The ID of a file associated with a stream.
     * </p>
     * 
     * @param fileId
     *        The ID of a file associated with a stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stream withFileId(Integer fileId) {
        setFileId(fileId);
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
        if (getFileId() != null)
            sb.append("FileId: ").append(getFileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Stream == false)
            return false;
        Stream other = (Stream) obj;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getFileId() == null ^ this.getFileId() == null)
            return false;
        if (other.getFileId() != null && other.getFileId().equals(this.getFileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getFileId() == null) ? 0 : getFileId().hashCode());
        return hashCode;
    }

    @Override
    public Stream clone() {
        try {
            return (Stream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.StreamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
