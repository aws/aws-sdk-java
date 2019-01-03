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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Start time for the action.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/FixedModeScheduleActionStartSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FixedModeScheduleActionStartSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Start time for the action to start in the channel. (Not the time for the action to be added to the schedule:
     * actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are
     * digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for "UTC format".
     */
    private String time;

    /**
     * Start time for the action to start in the channel. (Not the time for the action to be added to the schedule:
     * actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are
     * digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for "UTC format".
     * 
     * @param time
     *        Start time for the action to start in the channel. (Not the time for the action to be added to the
     *        schedule: actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All
     *        the letters are digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for
     *        "UTC format".
     */

    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Start time for the action to start in the channel. (Not the time for the action to be added to the schedule:
     * actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are
     * digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for "UTC format".
     * 
     * @return Start time for the action to start in the channel. (Not the time for the action to be added to the
     *         schedule: actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ.
     *         All the letters are digits (for example, mm might be 01) except for the two constants "T" for time and
     *         "Z" for "UTC format".
     */

    public String getTime() {
        return this.time;
    }

    /**
     * Start time for the action to start in the channel. (Not the time for the action to be added to the schedule:
     * actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are
     * digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for "UTC format".
     * 
     * @param time
     *        Start time for the action to start in the channel. (Not the time for the action to be added to the
     *        schedule: actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All
     *        the letters are digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for
     *        "UTC format".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedModeScheduleActionStartSettings withTime(String time) {
        setTime(time);
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
        if (getTime() != null)
            sb.append("Time: ").append(getTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FixedModeScheduleActionStartSettings == false)
            return false;
        FixedModeScheduleActionStartSettings other = (FixedModeScheduleActionStartSettings) obj;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        return hashCode;
    }

    @Override
    public FixedModeScheduleActionStartSettings clone() {
        try {
            return (FixedModeScheduleActionStartSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.FixedModeScheduleActionStartSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
