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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the action that you can take to respond to the alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/CustomerAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the action. The action name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNOOZE</code> - When you snooze the alarm, the alarm state changes to <code>SNOOZE_DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLE</code> - When you enable the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code> - When you disable the alarm, the alarm state changes to <code>DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGE</code> - When you acknowledge the alarm, the alarm state changes to <code>ACKNOWLEDGED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code> - When you reset the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_AlarmState.html"
     * >AlarmState</a> API.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * Contains the configuration information of a snooze action.
     * </p>
     */
    private SnoozeActionConfiguration snoozeActionConfiguration;
    /**
     * <p>
     * Contains the configuration information of an enable action.
     * </p>
     */
    private EnableActionConfiguration enableActionConfiguration;
    /**
     * <p>
     * Contains the configuration information of a disable action.
     * </p>
     */
    private DisableActionConfiguration disableActionConfiguration;
    /**
     * <p>
     * Contains the configuration information of an acknowledge action.
     * </p>
     */
    private AcknowledgeActionConfiguration acknowledgeActionConfiguration;
    /**
     * <p>
     * Contains the configuration information of a reset action.
     * </p>
     */
    private ResetActionConfiguration resetActionConfiguration;

    /**
     * <p>
     * The name of the action. The action name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNOOZE</code> - When you snooze the alarm, the alarm state changes to <code>SNOOZE_DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLE</code> - When you enable the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code> - When you disable the alarm, the alarm state changes to <code>DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGE</code> - When you acknowledge the alarm, the alarm state changes to <code>ACKNOWLEDGED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code> - When you reset the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_AlarmState.html"
     * >AlarmState</a> API.
     * </p>
     * 
     * @param actionName
     *        The name of the action. The action name can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SNOOZE</code> - When you snooze the alarm, the alarm state changes to <code>SNOOZE_DISABLED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLE</code> - When you enable the alarm, the alarm state changes to <code>NORMAL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE</code> - When you disable the alarm, the alarm state changes to <code>DISABLED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACKNOWLEDGE</code> - When you acknowledge the alarm, the alarm state changes to
     *        <code>ACKNOWLEDGED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESET</code> - When you reset the alarm, the alarm state changes to <code>NORMAL</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see the <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_AlarmState.html"
     *        >AlarmState</a> API.
     * @see CustomerActionName
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action. The action name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNOOZE</code> - When you snooze the alarm, the alarm state changes to <code>SNOOZE_DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLE</code> - When you enable the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code> - When you disable the alarm, the alarm state changes to <code>DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGE</code> - When you acknowledge the alarm, the alarm state changes to <code>ACKNOWLEDGED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code> - When you reset the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_AlarmState.html"
     * >AlarmState</a> API.
     * </p>
     * 
     * @return The name of the action. The action name can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SNOOZE</code> - When you snooze the alarm, the alarm state changes to <code>SNOOZE_DISABLED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLE</code> - When you enable the alarm, the alarm state changes to <code>NORMAL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLE</code> - When you disable the alarm, the alarm state changes to <code>DISABLED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACKNOWLEDGE</code> - When you acknowledge the alarm, the alarm state changes to
     *         <code>ACKNOWLEDGED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESET</code> - When you reset the alarm, the alarm state changes to <code>NORMAL</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see the <a
     *         href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_AlarmState.html"
     *         >AlarmState</a> API.
     * @see CustomerActionName
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action. The action name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNOOZE</code> - When you snooze the alarm, the alarm state changes to <code>SNOOZE_DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLE</code> - When you enable the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code> - When you disable the alarm, the alarm state changes to <code>DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGE</code> - When you acknowledge the alarm, the alarm state changes to <code>ACKNOWLEDGED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code> - When you reset the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_AlarmState.html"
     * >AlarmState</a> API.
     * </p>
     * 
     * @param actionName
     *        The name of the action. The action name can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SNOOZE</code> - When you snooze the alarm, the alarm state changes to <code>SNOOZE_DISABLED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLE</code> - When you enable the alarm, the alarm state changes to <code>NORMAL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE</code> - When you disable the alarm, the alarm state changes to <code>DISABLED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACKNOWLEDGE</code> - When you acknowledge the alarm, the alarm state changes to
     *        <code>ACKNOWLEDGED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESET</code> - When you reset the alarm, the alarm state changes to <code>NORMAL</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see the <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_AlarmState.html"
     *        >AlarmState</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomerActionName
     */

    public CustomerAction withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The name of the action. The action name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNOOZE</code> - When you snooze the alarm, the alarm state changes to <code>SNOOZE_DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLE</code> - When you enable the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code> - When you disable the alarm, the alarm state changes to <code>DISABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGE</code> - When you acknowledge the alarm, the alarm state changes to <code>ACKNOWLEDGED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code> - When you reset the alarm, the alarm state changes to <code>NORMAL</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_AlarmState.html"
     * >AlarmState</a> API.
     * </p>
     * 
     * @param actionName
     *        The name of the action. The action name can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SNOOZE</code> - When you snooze the alarm, the alarm state changes to <code>SNOOZE_DISABLED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLE</code> - When you enable the alarm, the alarm state changes to <code>NORMAL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE</code> - When you disable the alarm, the alarm state changes to <code>DISABLED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACKNOWLEDGE</code> - When you acknowledge the alarm, the alarm state changes to
     *        <code>ACKNOWLEDGED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESET</code> - When you reset the alarm, the alarm state changes to <code>NORMAL</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see the <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_AlarmState.html"
     *        >AlarmState</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomerActionName
     */

    public CustomerAction withActionName(CustomerActionName actionName) {
        this.actionName = actionName.toString();
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of a snooze action.
     * </p>
     * 
     * @param snoozeActionConfiguration
     *        Contains the configuration information of a snooze action.
     */

    public void setSnoozeActionConfiguration(SnoozeActionConfiguration snoozeActionConfiguration) {
        this.snoozeActionConfiguration = snoozeActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of a snooze action.
     * </p>
     * 
     * @return Contains the configuration information of a snooze action.
     */

    public SnoozeActionConfiguration getSnoozeActionConfiguration() {
        return this.snoozeActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of a snooze action.
     * </p>
     * 
     * @param snoozeActionConfiguration
     *        Contains the configuration information of a snooze action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAction withSnoozeActionConfiguration(SnoozeActionConfiguration snoozeActionConfiguration) {
        setSnoozeActionConfiguration(snoozeActionConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of an enable action.
     * </p>
     * 
     * @param enableActionConfiguration
     *        Contains the configuration information of an enable action.
     */

    public void setEnableActionConfiguration(EnableActionConfiguration enableActionConfiguration) {
        this.enableActionConfiguration = enableActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of an enable action.
     * </p>
     * 
     * @return Contains the configuration information of an enable action.
     */

    public EnableActionConfiguration getEnableActionConfiguration() {
        return this.enableActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of an enable action.
     * </p>
     * 
     * @param enableActionConfiguration
     *        Contains the configuration information of an enable action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAction withEnableActionConfiguration(EnableActionConfiguration enableActionConfiguration) {
        setEnableActionConfiguration(enableActionConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of a disable action.
     * </p>
     * 
     * @param disableActionConfiguration
     *        Contains the configuration information of a disable action.
     */

    public void setDisableActionConfiguration(DisableActionConfiguration disableActionConfiguration) {
        this.disableActionConfiguration = disableActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of a disable action.
     * </p>
     * 
     * @return Contains the configuration information of a disable action.
     */

    public DisableActionConfiguration getDisableActionConfiguration() {
        return this.disableActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of a disable action.
     * </p>
     * 
     * @param disableActionConfiguration
     *        Contains the configuration information of a disable action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAction withDisableActionConfiguration(DisableActionConfiguration disableActionConfiguration) {
        setDisableActionConfiguration(disableActionConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of an acknowledge action.
     * </p>
     * 
     * @param acknowledgeActionConfiguration
     *        Contains the configuration information of an acknowledge action.
     */

    public void setAcknowledgeActionConfiguration(AcknowledgeActionConfiguration acknowledgeActionConfiguration) {
        this.acknowledgeActionConfiguration = acknowledgeActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of an acknowledge action.
     * </p>
     * 
     * @return Contains the configuration information of an acknowledge action.
     */

    public AcknowledgeActionConfiguration getAcknowledgeActionConfiguration() {
        return this.acknowledgeActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of an acknowledge action.
     * </p>
     * 
     * @param acknowledgeActionConfiguration
     *        Contains the configuration information of an acknowledge action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAction withAcknowledgeActionConfiguration(AcknowledgeActionConfiguration acknowledgeActionConfiguration) {
        setAcknowledgeActionConfiguration(acknowledgeActionConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of a reset action.
     * </p>
     * 
     * @param resetActionConfiguration
     *        Contains the configuration information of a reset action.
     */

    public void setResetActionConfiguration(ResetActionConfiguration resetActionConfiguration) {
        this.resetActionConfiguration = resetActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of a reset action.
     * </p>
     * 
     * @return Contains the configuration information of a reset action.
     */

    public ResetActionConfiguration getResetActionConfiguration() {
        return this.resetActionConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of a reset action.
     * </p>
     * 
     * @param resetActionConfiguration
     *        Contains the configuration information of a reset action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAction withResetActionConfiguration(ResetActionConfiguration resetActionConfiguration) {
        setResetActionConfiguration(resetActionConfiguration);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getSnoozeActionConfiguration() != null)
            sb.append("SnoozeActionConfiguration: ").append(getSnoozeActionConfiguration()).append(",");
        if (getEnableActionConfiguration() != null)
            sb.append("EnableActionConfiguration: ").append(getEnableActionConfiguration()).append(",");
        if (getDisableActionConfiguration() != null)
            sb.append("DisableActionConfiguration: ").append(getDisableActionConfiguration()).append(",");
        if (getAcknowledgeActionConfiguration() != null)
            sb.append("AcknowledgeActionConfiguration: ").append(getAcknowledgeActionConfiguration()).append(",");
        if (getResetActionConfiguration() != null)
            sb.append("ResetActionConfiguration: ").append(getResetActionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerAction == false)
            return false;
        CustomerAction other = (CustomerAction) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getSnoozeActionConfiguration() == null ^ this.getSnoozeActionConfiguration() == null)
            return false;
        if (other.getSnoozeActionConfiguration() != null && other.getSnoozeActionConfiguration().equals(this.getSnoozeActionConfiguration()) == false)
            return false;
        if (other.getEnableActionConfiguration() == null ^ this.getEnableActionConfiguration() == null)
            return false;
        if (other.getEnableActionConfiguration() != null && other.getEnableActionConfiguration().equals(this.getEnableActionConfiguration()) == false)
            return false;
        if (other.getDisableActionConfiguration() == null ^ this.getDisableActionConfiguration() == null)
            return false;
        if (other.getDisableActionConfiguration() != null && other.getDisableActionConfiguration().equals(this.getDisableActionConfiguration()) == false)
            return false;
        if (other.getAcknowledgeActionConfiguration() == null ^ this.getAcknowledgeActionConfiguration() == null)
            return false;
        if (other.getAcknowledgeActionConfiguration() != null
                && other.getAcknowledgeActionConfiguration().equals(this.getAcknowledgeActionConfiguration()) == false)
            return false;
        if (other.getResetActionConfiguration() == null ^ this.getResetActionConfiguration() == null)
            return false;
        if (other.getResetActionConfiguration() != null && other.getResetActionConfiguration().equals(this.getResetActionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getSnoozeActionConfiguration() == null) ? 0 : getSnoozeActionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnableActionConfiguration() == null) ? 0 : getEnableActionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDisableActionConfiguration() == null) ? 0 : getDisableActionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAcknowledgeActionConfiguration() == null) ? 0 : getAcknowledgeActionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResetActionConfiguration() == null) ? 0 : getResetActionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CustomerAction clone() {
        try {
            return (CustomerAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.CustomerActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
