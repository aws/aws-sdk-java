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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * A description of the stream.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the stream.
     * </p>
     */
    private Integer streamVersion;

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

    public CreateStreamResult withStreamId(String streamId) {
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

    public CreateStreamResult withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * A description of the stream.
     * </p>
     * 
     * @param description
     *        A description of the stream.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stream.
     * </p>
     * 
     * @return A description of the stream.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the stream.
     * </p>
     * 
     * @param description
     *        A description of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * 
     * @param streamVersion
     *        The version of the stream.
     */

    public void setStreamVersion(Integer streamVersion) {
        this.streamVersion = streamVersion;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * 
     * @return The version of the stream.
     */

    public Integer getStreamVersion() {
        return this.streamVersion;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * 
     * @param streamVersion
     *        The version of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamResult withStreamVersion(Integer streamVersion) {
        setStreamVersion(streamVersion);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStreamVersion() != null)
            sb.append("StreamVersion: ").append(getStreamVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamResult == false)
            return false;
        CreateStreamResult other = (CreateStreamResult) obj;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStreamVersion() == null ^ this.getStreamVersion() == null)
            return false;
        if (other.getStreamVersion() != null && other.getStreamVersion().equals(this.getStreamVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStreamVersion() == null) ? 0 : getStreamVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamResult clone() {
        try {
            return (CreateStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
