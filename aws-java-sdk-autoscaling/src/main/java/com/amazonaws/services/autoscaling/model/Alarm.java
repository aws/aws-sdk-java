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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/Alarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Alarm implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alarm.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     */
    private String alarmARN;

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @return The name of the alarm.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @param alarmARN
     *        The Amazon Resource Name (ARN) of the alarm.
     */

    public void setAlarmARN(String alarmARN) {
        this.alarmARN = alarmARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the alarm.
     */

    public String getAlarmARN() {
        return this.alarmARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @param alarmARN
     *        The Amazon Resource Name (ARN) of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withAlarmARN(String alarmARN) {
        setAlarmARN(alarmARN);
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
        if (getAlarmName() != null)
            sb.append("AlarmName: ").append(getAlarmName()).append(",");
        if (getAlarmARN() != null)
            sb.append("AlarmARN: ").append(getAlarmARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alarm == false)
            return false;
        Alarm other = (Alarm) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getAlarmARN() == null ^ this.getAlarmARN() == null)
            return false;
        if (other.getAlarmARN() != null && other.getAlarmARN().equals(this.getAlarmARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getAlarmARN() == null) ? 0 : getAlarmARN().hashCode());
        return hashCode;
    }

    @Override
    public Alarm clone() {
        try {
            return (Alarm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
