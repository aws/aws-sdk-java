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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information needed to set the timer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/SetTimerAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetTimerAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the timer.
     * </p>
     */
    private String timerName;
    /**
     * <p>
     * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The maximum
     * value is 31622400 seconds.
     * </p>
     */
    @Deprecated
    private Integer seconds;
    /**
     * <p>
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (
     * <code>$variable.&lt;variable-name&gt;</code>), and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the duration. The range of the duration is
     * 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the duration
     * is rounded down to the nearest whole number.
     * </p>
     */
    private String durationExpression;

    /**
     * <p>
     * The name of the timer.
     * </p>
     * 
     * @param timerName
     *        The name of the timer.
     */

    public void setTimerName(String timerName) {
        this.timerName = timerName;
    }

    /**
     * <p>
     * The name of the timer.
     * </p>
     * 
     * @return The name of the timer.
     */

    public String getTimerName() {
        return this.timerName;
    }

    /**
     * <p>
     * The name of the timer.
     * </p>
     * 
     * @param timerName
     *        The name of the timer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTimerAction withTimerName(String timerName) {
        setTimerName(timerName);
        return this;
    }

    /**
     * <p>
     * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The maximum
     * value is 31622400 seconds.
     * </p>
     * 
     * @param seconds
     *        The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The
     *        maximum value is 31622400 seconds.
     */
    @Deprecated
    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    /**
     * <p>
     * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The maximum
     * value is 31622400 seconds.
     * </p>
     * 
     * @return The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The
     *         maximum value is 31622400 seconds.
     */
    @Deprecated
    public Integer getSeconds() {
        return this.seconds;
    }

    /**
     * <p>
     * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The maximum
     * value is 31622400 seconds.
     * </p>
     * 
     * @param seconds
     *        The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The
     *        maximum value is 31622400 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public SetTimerAction withSeconds(Integer seconds) {
        setSeconds(seconds);
        return this;
    }

    /**
     * <p>
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (
     * <code>$variable.&lt;variable-name&gt;</code>), and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the duration. The range of the duration is
     * 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the duration
     * is rounded down to the nearest whole number.
     * </p>
     * 
     * @param durationExpression
     *        The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (
     *        <code>$variable.&lt;variable-name&gt;</code>), and input values (
     *        <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the duration. The range of the duration
     *        is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the
     *        duration is rounded down to the nearest whole number.
     */

    public void setDurationExpression(String durationExpression) {
        this.durationExpression = durationExpression;
    }

    /**
     * <p>
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (
     * <code>$variable.&lt;variable-name&gt;</code>), and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the duration. The range of the duration is
     * 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the duration
     * is rounded down to the nearest whole number.
     * </p>
     * 
     * @return The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (
     *         <code>$variable.&lt;variable-name&gt;</code>), and input values (
     *         <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the duration. The range of the duration
     *         is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of
     *         the duration is rounded down to the nearest whole number.
     */

    public String getDurationExpression() {
        return this.durationExpression;
    }

    /**
     * <p>
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (
     * <code>$variable.&lt;variable-name&gt;</code>), and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the duration. The range of the duration is
     * 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the duration
     * is rounded down to the nearest whole number.
     * </p>
     * 
     * @param durationExpression
     *        The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (
     *        <code>$variable.&lt;variable-name&gt;</code>), and input values (
     *        <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the duration. The range of the duration
     *        is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the
     *        duration is rounded down to the nearest whole number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTimerAction withDurationExpression(String durationExpression) {
        setDurationExpression(durationExpression);
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
        if (getTimerName() != null)
            sb.append("TimerName: ").append(getTimerName()).append(",");
        if (getSeconds() != null)
            sb.append("Seconds: ").append(getSeconds()).append(",");
        if (getDurationExpression() != null)
            sb.append("DurationExpression: ").append(getDurationExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetTimerAction == false)
            return false;
        SetTimerAction other = (SetTimerAction) obj;
        if (other.getTimerName() == null ^ this.getTimerName() == null)
            return false;
        if (other.getTimerName() != null && other.getTimerName().equals(this.getTimerName()) == false)
            return false;
        if (other.getSeconds() == null ^ this.getSeconds() == null)
            return false;
        if (other.getSeconds() != null && other.getSeconds().equals(this.getSeconds()) == false)
            return false;
        if (other.getDurationExpression() == null ^ this.getDurationExpression() == null)
            return false;
        if (other.getDurationExpression() != null && other.getDurationExpression().equals(this.getDurationExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimerName() == null) ? 0 : getTimerName().hashCode());
        hashCode = prime * hashCode + ((getSeconds() == null) ? 0 : getSeconds().hashCode());
        hashCode = prime * hashCode + ((getDurationExpression() == null) ? 0 : getDurationExpression().hashCode());
        return hashCode;
    }

    @Override
    public SetTimerAction clone() {
        try {
            return (SetTimerAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.SetTimerActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
