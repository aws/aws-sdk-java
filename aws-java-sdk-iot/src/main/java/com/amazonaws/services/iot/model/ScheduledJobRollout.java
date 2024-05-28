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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Displays the next seven maintenance window occurrences and their start times.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledJobRollout implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Displays the start times of the next seven maintenance window occurrences.
     * </p>
     */
    private String startTime;

    /**
     * <p>
     * Displays the start times of the next seven maintenance window occurrences.
     * </p>
     * 
     * @param startTime
     *        Displays the start times of the next seven maintenance window occurrences.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Displays the start times of the next seven maintenance window occurrences.
     * </p>
     * 
     * @return Displays the start times of the next seven maintenance window occurrences.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Displays the start times of the next seven maintenance window occurrences.
     * </p>
     * 
     * @param startTime
     *        Displays the start times of the next seven maintenance window occurrences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledJobRollout withStartTime(String startTime) {
        setStartTime(startTime);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledJobRollout == false)
            return false;
        ScheduledJobRollout other = (ScheduledJobRollout) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledJobRollout clone() {
        try {
            return (ScheduledJobRollout) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ScheduledJobRolloutMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
