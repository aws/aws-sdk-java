/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about alarms associated with the deployment group.
 * </p>
 */
public class AlarmConfiguration implements Serializable, Cloneable {

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
     * true: The deployment will proceed even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment will stop if alarm status information can't be retrieved from Amazon CloudWatch.
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
     * true: The deployment will proceed even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment will stop if alarm status information can't be retrieved from Amazon CloudWatch.
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
     *        true: The deployment will proceed even if alarm status information can't be retrieved from Amazon
     *        CloudWatch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        false: The deployment will stop if alarm status information can't be retrieved from Amazon CloudWatch.
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
     * true: The deployment will proceed even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment will stop if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether a deployment should continue if information about the current state of alarms cannot be
     *         retrieved from Amazon CloudWatch. The default value is false.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         true: The deployment will proceed even if alarm status information can't be retrieved from Amazon
     *         CloudWatch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         false: The deployment will stop if alarm status information can't be retrieved from Amazon CloudWatch.
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
     * true: The deployment will proceed even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment will stop if alarm status information can't be retrieved from Amazon CloudWatch.
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
     *        true: The deployment will proceed even if alarm status information can't be retrieved from Amazon
     *        CloudWatch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        false: The deployment will stop if alarm status information can't be retrieved from Amazon CloudWatch.
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
     * true: The deployment will proceed even if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * false: The deployment will stop if alarm status information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether a deployment should continue if information about the current state of alarms cannot be
     *         retrieved from Amazon CloudWatch. The default value is false.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         true: The deployment will proceed even if alarm status information can't be retrieved from Amazon
     *         CloudWatch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         false: The deployment will stop if alarm status information can't be retrieved from Amazon CloudWatch.
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Enabled: " + getEnabled() + ",");
        if (getIgnorePollAlarmFailure() != null)
            sb.append("IgnorePollAlarmFailure: " + getIgnorePollAlarmFailure() + ",");
        if (getAlarms() != null)
            sb.append("Alarms: " + getAlarms());
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
}
