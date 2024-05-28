/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists the maximum number of attendees allowed into the meeting.
 * </p>
 * <note>
 * <p>
 * If you specify <code>FHD</code> for <code>MeetingFeatures:Video:MaxResolution</code>, or if you specify
 * <code>UHD</code> for <code>MeetingFeatures:Content:MaxResolution</code>, the maximum number of attendees changes from
 * the default of <code>250</code> to <code>25</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/AttendeeFeatures"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttendeeFeatures implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of attendees allowed into the meeting.
     * </p>
     */
    private Integer maxCount;

    /**
     * <p>
     * The maximum number of attendees allowed into the meeting.
     * </p>
     * 
     * @param maxCount
     *        The maximum number of attendees allowed into the meeting.
     */

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * <p>
     * The maximum number of attendees allowed into the meeting.
     * </p>
     * 
     * @return The maximum number of attendees allowed into the meeting.
     */

    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     * <p>
     * The maximum number of attendees allowed into the meeting.
     * </p>
     * 
     * @param maxCount
     *        The maximum number of attendees allowed into the meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttendeeFeatures withMaxCount(Integer maxCount) {
        setMaxCount(maxCount);
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
        if (getMaxCount() != null)
            sb.append("MaxCount: ").append(getMaxCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttendeeFeatures == false)
            return false;
        AttendeeFeatures other = (AttendeeFeatures) obj;
        if (other.getMaxCount() == null ^ this.getMaxCount() == null)
            return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode());
        return hashCode;
    }

    @Override
    public AttendeeFeatures clone() {
        try {
            return (AttendeeFeatures) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmeetings.model.transform.AttendeeFeaturesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
