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
public class DescribeStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the stream.
     * </p>
     */
    private StreamInfo streamInfo;

    /**
     * <p>
     * Information about the stream.
     * </p>
     * 
     * @param streamInfo
     *        Information about the stream.
     */

    public void setStreamInfo(StreamInfo streamInfo) {
        this.streamInfo = streamInfo;
    }

    /**
     * <p>
     * Information about the stream.
     * </p>
     * 
     * @return Information about the stream.
     */

    public StreamInfo getStreamInfo() {
        return this.streamInfo;
    }

    /**
     * <p>
     * Information about the stream.
     * </p>
     * 
     * @param streamInfo
     *        Information about the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamResult withStreamInfo(StreamInfo streamInfo) {
        setStreamInfo(streamInfo);
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
        if (getStreamInfo() != null)
            sb.append("StreamInfo: ").append(getStreamInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStreamResult == false)
            return false;
        DescribeStreamResult other = (DescribeStreamResult) obj;
        if (other.getStreamInfo() == null ^ this.getStreamInfo() == null)
            return false;
        if (other.getStreamInfo() != null && other.getStreamInfo().equals(this.getStreamInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamInfo() == null) ? 0 : getStreamInfo().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStreamResult clone() {
        try {
            return (DescribeStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
