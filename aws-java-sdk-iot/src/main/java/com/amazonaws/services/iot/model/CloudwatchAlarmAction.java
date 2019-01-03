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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action that updates a CloudWatch alarm.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudwatchAlarmAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch alarm.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The CloudWatch alarm name.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The reason for the alarm change.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     * </p>
     */
    private String stateValue;

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch alarm.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that allows access to the CloudWatch alarm.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch alarm.
     * </p>
     * 
     * @return The IAM role that allows access to the CloudWatch alarm.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch alarm.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that allows access to the CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchAlarmAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarm name.
     * </p>
     * 
     * @param alarmName
     *        The CloudWatch alarm name.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The CloudWatch alarm name.
     * </p>
     * 
     * @return The CloudWatch alarm name.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The CloudWatch alarm name.
     * </p>
     * 
     * @param alarmName
     *        The CloudWatch alarm name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchAlarmAction withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The reason for the alarm change.
     * </p>
     * 
     * @param stateReason
     *        The reason for the alarm change.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason for the alarm change.
     * </p>
     * 
     * @return The reason for the alarm change.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason for the alarm change.
     * </p>
     * 
     * @param stateReason
     *        The reason for the alarm change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchAlarmAction withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     * </p>
     * 
     * @param stateValue
     *        The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     */

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     * </p>
     * 
     * @return The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     */

    public String getStateValue() {
        return this.stateValue;
    }

    /**
     * <p>
     * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     * </p>
     * 
     * @param stateValue
     *        The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchAlarmAction withStateValue(String stateValue) {
        setStateValue(stateValue);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAlarmName() != null)
            sb.append("AlarmName: ").append(getAlarmName()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getStateValue() != null)
            sb.append("StateValue: ").append(getStateValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudwatchAlarmAction == false)
            return false;
        CloudwatchAlarmAction other = (CloudwatchAlarmAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null && other.getStateValue().equals(this.getStateValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        return hashCode;
    }

    @Override
    public CloudwatchAlarmAction clone() {
        try {
            return (CloudwatchAlarmAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.CloudwatchAlarmActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
