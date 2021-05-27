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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeAlarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains information about an alarm.
     * </p>
     */
    private Alarm alarm;

    /**
     * <p>
     * Contains information about an alarm.
     * </p>
     * 
     * @param alarm
     *        Contains information about an alarm.
     */

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    /**
     * <p>
     * Contains information about an alarm.
     * </p>
     * 
     * @return Contains information about an alarm.
     */

    public Alarm getAlarm() {
        return this.alarm;
    }

    /**
     * <p>
     * Contains information about an alarm.
     * </p>
     * 
     * @param alarm
     *        Contains information about an alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmResult withAlarm(Alarm alarm) {
        setAlarm(alarm);
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
        if (getAlarm() != null)
            sb.append("Alarm: ").append(getAlarm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmResult == false)
            return false;
        DescribeAlarmResult other = (DescribeAlarmResult) obj;
        if (other.getAlarm() == null ^ this.getAlarm() == null)
            return false;
        if (other.getAlarm() != null && other.getAlarm().equals(this.getAlarm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarm() == null) ? 0 : getAlarm().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmResult clone() {
        try {
            return (DescribeAlarmResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
