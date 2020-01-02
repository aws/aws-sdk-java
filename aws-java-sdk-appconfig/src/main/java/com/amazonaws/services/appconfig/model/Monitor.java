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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon CloudWatch alarms to monitor during the deployment process.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/Monitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Monitor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the Amazon CloudWatch alarm.
     * </p>
     */
    private String alarmArn;
    /**
     * <p>
     * ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     * </p>
     */
    private String alarmRoleArn;

    /**
     * <p>
     * ARN of the Amazon CloudWatch alarm.
     * </p>
     * 
     * @param alarmArn
     *        ARN of the Amazon CloudWatch alarm.
     */

    public void setAlarmArn(String alarmArn) {
        this.alarmArn = alarmArn;
    }

    /**
     * <p>
     * ARN of the Amazon CloudWatch alarm.
     * </p>
     * 
     * @return ARN of the Amazon CloudWatch alarm.
     */

    public String getAlarmArn() {
        return this.alarmArn;
    }

    /**
     * <p>
     * ARN of the Amazon CloudWatch alarm.
     * </p>
     * 
     * @param alarmArn
     *        ARN of the Amazon CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Monitor withAlarmArn(String alarmArn) {
        setAlarmArn(alarmArn);
        return this;
    }

    /**
     * <p>
     * ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     * </p>
     * 
     * @param alarmRoleArn
     *        ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     */

    public void setAlarmRoleArn(String alarmRoleArn) {
        this.alarmRoleArn = alarmRoleArn;
    }

    /**
     * <p>
     * ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     * </p>
     * 
     * @return ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     */

    public String getAlarmRoleArn() {
        return this.alarmRoleArn;
    }

    /**
     * <p>
     * ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     * </p>
     * 
     * @param alarmRoleArn
     *        ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Monitor withAlarmRoleArn(String alarmRoleArn) {
        setAlarmRoleArn(alarmRoleArn);
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
        if (getAlarmArn() != null)
            sb.append("AlarmArn: ").append(getAlarmArn()).append(",");
        if (getAlarmRoleArn() != null)
            sb.append("AlarmRoleArn: ").append(getAlarmRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Monitor == false)
            return false;
        Monitor other = (Monitor) obj;
        if (other.getAlarmArn() == null ^ this.getAlarmArn() == null)
            return false;
        if (other.getAlarmArn() != null && other.getAlarmArn().equals(this.getAlarmArn()) == false)
            return false;
        if (other.getAlarmRoleArn() == null ^ this.getAlarmRoleArn() == null)
            return false;
        if (other.getAlarmRoleArn() != null && other.getAlarmRoleArn().equals(this.getAlarmRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmArn() == null) ? 0 : getAlarmArn().hashCode());
        hashCode = prime * hashCode + ((getAlarmRoleArn() == null) ? 0 : getAlarmRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public Monitor clone() {
        try {
            return (Monitor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.MonitorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
