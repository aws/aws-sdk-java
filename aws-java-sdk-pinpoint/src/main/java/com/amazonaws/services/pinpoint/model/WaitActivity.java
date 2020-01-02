/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the settings for a wait activity in a journey. This type of activity waits for a certain amount of time or
 * until a specific date and time before moving participants to the next activity in a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WaitActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaitActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the next activity to perform, after performing the wait activity.
     * </p>
     */
    private String nextActivity;
    /**
     * <p>
     * The amount of time to wait or the date and time when the activity moves participants to the next activity in the
     * journey.
     * </p>
     */
    private WaitTime waitTime;

    /**
     * <p>
     * The unique identifier for the next activity to perform, after performing the wait activity.
     * </p>
     * 
     * @param nextActivity
     *        The unique identifier for the next activity to perform, after performing the wait activity.
     */

    public void setNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after performing the wait activity.
     * </p>
     * 
     * @return The unique identifier for the next activity to perform, after performing the wait activity.
     */

    public String getNextActivity() {
        return this.nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after performing the wait activity.
     * </p>
     * 
     * @param nextActivity
     *        The unique identifier for the next activity to perform, after performing the wait activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaitActivity withNextActivity(String nextActivity) {
        setNextActivity(nextActivity);
        return this;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when the activity moves participants to the next activity in the
     * journey.
     * </p>
     * 
     * @param waitTime
     *        The amount of time to wait or the date and time when the activity moves participants to the next activity
     *        in the journey.
     */

    public void setWaitTime(WaitTime waitTime) {
        this.waitTime = waitTime;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when the activity moves participants to the next activity in the
     * journey.
     * </p>
     * 
     * @return The amount of time to wait or the date and time when the activity moves participants to the next activity
     *         in the journey.
     */

    public WaitTime getWaitTime() {
        return this.waitTime;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when the activity moves participants to the next activity in the
     * journey.
     * </p>
     * 
     * @param waitTime
     *        The amount of time to wait or the date and time when the activity moves participants to the next activity
     *        in the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaitActivity withWaitTime(WaitTime waitTime) {
        setWaitTime(waitTime);
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
        if (getNextActivity() != null)
            sb.append("NextActivity: ").append(getNextActivity()).append(",");
        if (getWaitTime() != null)
            sb.append("WaitTime: ").append(getWaitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaitActivity == false)
            return false;
        WaitActivity other = (WaitActivity) obj;
        if (other.getNextActivity() == null ^ this.getNextActivity() == null)
            return false;
        if (other.getNextActivity() != null && other.getNextActivity().equals(this.getNextActivity()) == false)
            return false;
        if (other.getWaitTime() == null ^ this.getWaitTime() == null)
            return false;
        if (other.getWaitTime() != null && other.getWaitTime().equals(this.getWaitTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextActivity() == null) ? 0 : getNextActivity().hashCode());
        hashCode = prime * hashCode + ((getWaitTime() == null) ? 0 : getWaitTime().hashCode());
        return hashCode;
    }

    @Override
    public WaitActivity clone() {
        try {
            return (WaitActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.WaitActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
