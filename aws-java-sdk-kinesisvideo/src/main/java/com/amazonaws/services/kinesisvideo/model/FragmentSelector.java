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
 * Describes the timestamp range and timestamp origin of a range of fragments.
 * </p>
 * <p>
 * Only fragments with a start timestamp greater than or equal to the given start time and less than or equal to the end
 * time are returned. For example, if a stream contains fragments with the following start timestamps:
 * </p>
 * <ul>
 * <li>
 * <p>
 * 00:00:00
 * </p>
 * </li>
 * <li>
 * <p>
 * 00:00:02
 * </p>
 * </li>
 * <li>
 * <p>
 * 00:00:04
 * </p>
 * </li>
 * <li>
 * <p>
 * 00:00:06
 * </p>
 * </li>
 * </ul>
 * <p>
 * A fragment selector range with a start time of 00:00:01 and end time of 00:00:04 would return the fragments with
 * start times of 00:00:02 and 00:00:04.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/FragmentSelector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FragmentSelector implements Serializable, Cloneable, StructuredPojo {

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
    private TimestampRange timestampRange;

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * 
     * @param fragmentSelectorType
     *        The origin of the timestamps to use (Server or Producer).
     * @see FragmentSelectorType
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
     * @see FragmentSelectorType
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
     * @see FragmentSelectorType
     */

    public FragmentSelector withFragmentSelectorType(String fragmentSelectorType) {
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
     * @see FragmentSelectorType
     */

    public FragmentSelector withFragmentSelectorType(FragmentSelectorType fragmentSelectorType) {
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

    public void setTimestampRange(TimestampRange timestampRange) {
        this.timestampRange = timestampRange;
    }

    /**
     * <p>
     * The range of timestamps to return.
     * </p>
     * 
     * @return The range of timestamps to return.
     */

    public TimestampRange getTimestampRange() {
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

    public FragmentSelector withTimestampRange(TimestampRange timestampRange) {
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

        if (obj instanceof FragmentSelector == false)
            return false;
        FragmentSelector other = (FragmentSelector) obj;
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
    public FragmentSelector clone() {
        try {
            return (FragmentSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.FragmentSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
