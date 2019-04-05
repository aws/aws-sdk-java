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
 * The range of timestamps for which to return fragments.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/TimestampRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestampRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The starting timestamp in the range of timestamps for which to return fragments.
     * </p>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * The ending timestamp in the range of timestamps for which to return fragments.
     * </p>
     */
    private java.util.Date endTimestamp;

    /**
     * <p>
     * The starting timestamp in the range of timestamps for which to return fragments.
     * </p>
     * 
     * @param startTimestamp
     *        The starting timestamp in the range of timestamps for which to return fragments.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The starting timestamp in the range of timestamps for which to return fragments.
     * </p>
     * 
     * @return The starting timestamp in the range of timestamps for which to return fragments.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * The starting timestamp in the range of timestamps for which to return fragments.
     * </p>
     * 
     * @param startTimestamp
     *        The starting timestamp in the range of timestamps for which to return fragments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestampRange withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * The ending timestamp in the range of timestamps for which to return fragments.
     * </p>
     * 
     * @param endTimestamp
     *        The ending timestamp in the range of timestamps for which to return fragments.
     */

    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * The ending timestamp in the range of timestamps for which to return fragments.
     * </p>
     * 
     * @return The ending timestamp in the range of timestamps for which to return fragments.
     */

    public java.util.Date getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * <p>
     * The ending timestamp in the range of timestamps for which to return fragments.
     * </p>
     * 
     * @param endTimestamp
     *        The ending timestamp in the range of timestamps for which to return fragments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestampRange withEndTimestamp(java.util.Date endTimestamp) {
        setEndTimestamp(endTimestamp);
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
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: ").append(getEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestampRange == false)
            return false;
        TimestampRange other = (TimestampRange) obj;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public TimestampRange clone() {
        try {
            return (TimestampRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.TimestampRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
