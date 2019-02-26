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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about alarms associated with the deployment group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/AlarmConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Indicates whether a deployment should continue if information about the current state of alarms cannot be
     * retrieved from Amazon CloudWatch. The default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean ignorePollAlarmFailure;
    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Alarm> alarms;

    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the alarm configuration is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     * 
     * @return Indicates whether the alarm configuration is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the alarm configuration is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     * 
     * @return Indicates whether the alarm configuration is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether a deployment should continue if information about the current state of alarms cannot be
     * retrieved from Amazon CloudWatch. The default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     * 
     * @param ignorePollAlarmFailure
     *        Indicates whether a deployment should continue if information about the current state of alarms cannot be
     *        retrieved from Amazon CloudWatch. The default value is false.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.
     *        </p>
     *        </li>
     */

    public void setIgnorePollAlarmFailure(Boolean ignorePollAlarmFailure) {
        this.ignorePollAlarmFailure = ignorePollAlarmFailure;
    }

    /**
     * <p>
     * Indicates whether a deployment should continue if information about the current state of alarms cannot be
     * retrieved from Amazon CloudWatch. The default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether a deployment should continue if information about the current state of alarms cannot be
     *         retrieved from Amazon CloudWatch. The default value is false.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.
     *         </p>
     *         </li>
     */

    public Boolean getIgnorePollAlarmFailure() {
        return this.ignorePollAlarmFailure;
    }

    /**
     * <p>
     * Indicates whether a deployment should continue if information about the current state of alarms cannot be
     * retrieved from Amazon CloudWatch. The default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     * 
     * @param ignorePollAlarmFailure
     *        Indicates whether a deployment should continue if information about the current state of alarms cannot be
     *        retrieved from Amazon CloudWatch. The default value is false.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmConfiguration withIgnorePollAlarmFailure(Boolean ignorePollAlarmFailure) {
        setIgnorePollAlarmFailure(ignorePollAlarmFailure);
        return this;
    }

    /**
     * <p>
     * Indicates whether a deployment should continue if information about the current state of alarms cannot be
     * retrieved from Amazon CloudWatch. The default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether a deployment should continue if information about the current state of alarms cannot be
     *         retrieved from Amazon CloudWatch. The default value is false.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.
     *         </p>
     *         </li>
     */

    public Boolean isIgnorePollAlarmFailure() {
        return this.ignorePollAlarmFailure;
    }

    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment group.
     * </p>
     * 
     * @return A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment
     *         group.
     */

    public java.util.List<Alarm> getAlarms() {
        if (alarms == null) {
            alarms = new com.amazonaws.internal.SdkInternalList<Alarm>();
        }
        return alarms;
    }

    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment group.
     * </p>
     * 
     * @param alarms
     *        A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment
     *        group.
     */

    public void setAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new com.amazonaws.internal.SdkInternalList<Alarm>(alarms);
    }

    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarms(java.util.Collection)} or {@link #withAlarms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param alarms
     *        A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmConfiguration withAlarms(Alarm... alarms) {
        if (this.alarms == null) {
            setAlarms(new com.amazonaws.internal.SdkInternalList<Alarm>(alarms.length));
        }
        for (Alarm ele : alarms) {
            this.alarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment group.
     * </p>
     * 
     * @param alarms
     *        A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmConfiguration withAlarms(java.util.Collection<Alarm> alarms) {
        setAlarms(alarms);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getIgnorePollAlarmFailure() != null)
            sb.append("IgnorePollAlarmFailure: ").append(getIgnorePollAlarmFailure()).append(",");
        if (getAlarms() != null)
            sb.append("Alarms: ").append(getAlarms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmConfiguration == false)
            return false;
        AlarmConfiguration other = (AlarmConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIgnorePollAlarmFailure() == null ^ this.getIgnorePollAlarmFailure() == null)
            return false;
        if (other.getIgnorePollAlarmFailure() != null && other.getIgnorePollAlarmFailure().equals(this.getIgnorePollAlarmFailure()) == false)
            return false;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getIgnorePollAlarmFailure() == null) ? 0 : getIgnorePollAlarmFailure().hashCode());
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        return hashCode;
    }

    @Override
    public AlarmConfiguration clone() {
        try {
            return (AlarmConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.AlarmConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
