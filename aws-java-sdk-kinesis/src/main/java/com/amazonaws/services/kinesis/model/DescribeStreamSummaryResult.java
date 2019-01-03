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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DescribeStreamSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStreamSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <a>StreamDescriptionSummary</a> containing information about the stream.
     * </p>
     */
    private StreamDescriptionSummary streamDescriptionSummary;

    /**
     * <p>
     * A <a>StreamDescriptionSummary</a> containing information about the stream.
     * </p>
     * 
     * @param streamDescriptionSummary
     *        A <a>StreamDescriptionSummary</a> containing information about the stream.
     */

    public void setStreamDescriptionSummary(StreamDescriptionSummary streamDescriptionSummary) {
        this.streamDescriptionSummary = streamDescriptionSummary;
    }

    /**
     * <p>
     * A <a>StreamDescriptionSummary</a> containing information about the stream.
     * </p>
     * 
     * @return A <a>StreamDescriptionSummary</a> containing information about the stream.
     */

    public StreamDescriptionSummary getStreamDescriptionSummary() {
        return this.streamDescriptionSummary;
    }

    /**
     * <p>
     * A <a>StreamDescriptionSummary</a> containing information about the stream.
     * </p>
     * 
     * @param streamDescriptionSummary
     *        A <a>StreamDescriptionSummary</a> containing information about the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamSummaryResult withStreamDescriptionSummary(StreamDescriptionSummary streamDescriptionSummary) {
        setStreamDescriptionSummary(streamDescriptionSummary);
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
        if (getStreamDescriptionSummary() != null)
            sb.append("StreamDescriptionSummary: ").append(getStreamDescriptionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStreamSummaryResult == false)
            return false;
        DescribeStreamSummaryResult other = (DescribeStreamSummaryResult) obj;
        if (other.getStreamDescriptionSummary() == null ^ this.getStreamDescriptionSummary() == null)
            return false;
        if (other.getStreamDescriptionSummary() != null && other.getStreamDescriptionSummary().equals(this.getStreamDescriptionSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamDescriptionSummary() == null) ? 0 : getStreamDescriptionSummary().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStreamSummaryResult clone() {
        try {
            return (DescribeStreamSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
