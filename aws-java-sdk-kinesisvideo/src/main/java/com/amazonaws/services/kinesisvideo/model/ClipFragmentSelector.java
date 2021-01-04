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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the timestamp range and timestamp origin of a range of fragments.
 * </p>
 * <p>
 * Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a
 * stream of fragments with producer timestamps that are approximately equal to the true clock time, the clip will
 * contain all of the fragments within the requested timestamp range. If some fragments are ingested within the same
 * time range and very different points in time, only the oldest ingested collection of fragments are returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/ClipFragmentSelector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClipFragmentSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     */
    private String fragmentSelectorType;
    /**
     * <p>
     * The range of timestamps to return.
     * </p>
     */
    private ClipTimestampRange timestampRange;

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * 
     * @param fragmentSelectorType
     *        The origin of the timestamps to use (Server or Producer).
     * @see ClipFragmentSelectorType
     */

    public void setFragmentSelectorType(String fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType;
    }

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * 
     * @return The origin of the timestamps to use (Server or Producer).
     * @see ClipFragmentSelectorType
     */

    public String getFragmentSelectorType() {
        return this.fragmentSelectorType;
    }

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * 
     * @param fragmentSelectorType
     *        The origin of the timestamps to use (Server or Producer).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClipFragmentSelectorType
     */

    public ClipFragmentSelector withFragmentSelectorType(String fragmentSelectorType) {
        setFragmentSelectorType(fragmentSelectorType);
        return this;
    }

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * 
     * @param fragmentSelectorType
     *        The origin of the timestamps to use (Server or Producer).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClipFragmentSelectorType
     */

    public ClipFragmentSelector withFragmentSelectorType(ClipFragmentSelectorType fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType.toString();
        return this;
    }

    /**
     * <p>
     * The range of timestamps to return.
     * </p>
     * 
     * @param timestampRange
     *        The range of timestamps to return.
     */

    public void setTimestampRange(ClipTimestampRange timestampRange) {
        this.timestampRange = timestampRange;
    }

    /**
     * <p>
     * The range of timestamps to return.
     * </p>
     * 
     * @return The range of timestamps to return.
     */

    public ClipTimestampRange getTimestampRange() {
        return this.timestampRange;
    }

    /**
     * <p>
     * The range of timestamps to return.
     * </p>
     * 
     * @param timestampRange
     *        The range of timestamps to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClipFragmentSelector withTimestampRange(ClipTimestampRange timestampRange) {
        setTimestampRange(timestampRange);
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
        if (getFragmentSelectorType() != null)
            sb.append("FragmentSelectorType: ").append(getFragmentSelectorType()).append(",");
        if (getTimestampRange() != null)
            sb.append("TimestampRange: ").append(getTimestampRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClipFragmentSelector == false)
            return false;
        ClipFragmentSelector other = (ClipFragmentSelector) obj;
        if (other.getFragmentSelectorType() == null ^ this.getFragmentSelectorType() == null)
            return false;
        if (other.getFragmentSelectorType() != null && other.getFragmentSelectorType().equals(this.getFragmentSelectorType()) == false)
            return false;
        if (other.getTimestampRange() == null ^ this.getTimestampRange() == null)
            return false;
        if (other.getTimestampRange() != null && other.getTimestampRange().equals(this.getTimestampRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFragmentSelectorType() == null) ? 0 : getFragmentSelectorType().hashCode());
        hashCode = prime * hashCode + ((getTimestampRange() == null) ? 0 : getTimestampRange().hashCode());
        return hashCode;
    }

    @Override
    public ClipFragmentSelector clone() {
        try {
            return (ClipFragmentSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.ClipFragmentSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
