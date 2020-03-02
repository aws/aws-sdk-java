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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TestAlarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestAlarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alarm to test.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     */
    private String state;

    /**
     * <p>
     * The name of the alarm to test.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm to test.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm to test.
     * </p>
     * 
     * @return The name of the alarm to test.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The name of the alarm to test.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAlarmRequest withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The alarm state to test.</p>
     *        <p>
     *        An alarm has the following possible states that can be tested:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM</code> — The metric is outside of the defined threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough
     *        data is available for the metric to determine the alarm state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OK</code> — The metric is within the defined threshold.
     *        </p>
     *        </li>
     * @see AlarmState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The alarm state to test.</p>
     *         <p>
     *         An alarm has the following possible states that can be tested:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALARM</code> — The metric is outside of the defined threshold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough
     *         data is available for the metric to determine the alarm state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OK</code> — The metric is within the defined threshold.
     *         </p>
     *         </li>
     * @see AlarmState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The alarm state to test.</p>
     *        <p>
     *        An alarm has the following possible states that can be tested:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM</code> — The metric is outside of the defined threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough
     *        data is available for the metric to determine the alarm state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OK</code> — The metric is within the defined threshold.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmState
     */

    public TestAlarmRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> — The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough data is
     * available for the metric to determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> — The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The alarm state to test.</p>
     *        <p>
     *        An alarm has the following possible states that can be tested:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM</code> — The metric is outside of the defined threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA</code> — The alarm has just started, the metric is not available, or not enough
     *        data is available for the metric to determine the alarm state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OK</code> — The metric is within the defined threshold.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmState
     */

    public TestAlarmRequest withState(AlarmState state) {
        this.state = state.toString();
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
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestAlarmRequest == false)
            return false;
        TestAlarmRequest other = (TestAlarmRequest) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public TestAlarmRequest clone() {
        return (TestAlarmRequest) super.clone();
    }

}
