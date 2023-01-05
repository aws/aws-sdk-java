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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactStreaming" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartContactStreamingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     */
    private String streamingId;

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * 
     * @param streamingId
     *        The identifier of the streaming configuration enabled.
     */

    public void setStreamingId(String streamingId) {
        this.streamingId = streamingId;
    }

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * 
     * @return The identifier of the streaming configuration enabled.
     */

    public String getStreamingId() {
        return this.streamingId;
    }

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * 
     * @param streamingId
     *        The identifier of the streaming configuration enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContactStreamingResult withStreamingId(String streamingId) {
        setStreamingId(streamingId);
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
        if (getStreamingId() != null)
            sb.append("StreamingId: ").append(getStreamingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartContactStreamingResult == false)
            return false;
        StartContactStreamingResult other = (StartContactStreamingResult) obj;
        if (other.getStreamingId() == null ^ this.getStreamingId() == null)
            return false;
        if (other.getStreamingId() != null && other.getStreamingId().equals(this.getStreamingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamingId() == null) ? 0 : getStreamingId().hashCode());
        return hashCode;
    }

    @Override
    public StartContactStreamingResult clone() {
        try {
            return (StartContactStreamingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
