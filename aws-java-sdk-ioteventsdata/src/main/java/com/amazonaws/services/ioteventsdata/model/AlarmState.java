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
 * Contains information about the current state of the alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/AlarmState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the alarm state. The state name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code> - When the alarm is in the <code>DISABLED</code> state, it isn't ready to evaluate data. To
     * enable the alarm, you must change the alarm to the <code>NORMAL</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NORMAL</code> - When the alarm is in the <code>NORMAL</code> state, it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - If the alarm is in the <code>ACTIVE</code> state, the alarm is invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGED</code> - When the alarm is in the <code>ACKNOWLEDGED</code> state, the alarm was invoked and
     * you acknowledged the alarm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SNOOZE_DISABLED</code> - When the alarm is in the <code>SNOOZE_DISABLED</code> state, the alarm is disabled
     * for a specified period of time. After the snooze time, the alarm automatically changes to the <code>NORMAL</code>
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATCHED</code> - When the alarm is in the <code>LATCHED</code> state, the alarm was invoked. However, the
     * data that the alarm is currently evaluating is within the specified range. To change the alarm to the
     * <code>NORMAL</code> state, you must acknowledge the alarm.
     * </p>
     * </li>
     * </ul>
     */
    private String stateName;
    /**
     * <p>
     * Information needed to evaluate data.
     * </p>
     */
    private RuleEvaluation ruleEvaluation;
    /**
     * <p>
     * Contains information about the action that you can take to respond to the alarm.
     * </p>
     */
    private CustomerAction customerAction;
    /**
     * <p>
     * Contains information about alarm state changes.
     * </p>
     */
    private SystemEvent systemEvent;

    /**
     * <p>
     * The name of the alarm state. The state name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code> - When the alarm is in the <code>DISABLED</code> state, it isn't ready to evaluate data. To
     * enable the alarm, you must change the alarm to the <code>NORMAL</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NORMAL</code> - When the alarm is in the <code>NORMAL</code> state, it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - If the alarm is in the <code>ACTIVE</code> state, the alarm is invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGED</code> - When the alarm is in the <code>ACKNOWLEDGED</code> state, the alarm was invoked and
     * you acknowledged the alarm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SNOOZE_DISABLED</code> - When the alarm is in the <code>SNOOZE_DISABLED</code> state, the alarm is disabled
     * for a specified period of time. After the snooze time, the alarm automatically changes to the <code>NORMAL</code>
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATCHED</code> - When the alarm is in the <code>LATCHED</code> state, the alarm was invoked. However, the
     * data that the alarm is currently evaluating is within the specified range. To change the alarm to the
     * <code>NORMAL</code> state, you must acknowledge the alarm.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stateName
     *        The name of the alarm state. The state name can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - When the alarm is in the <code>DISABLED</code> state, it isn't ready to evaluate
     *        data. To enable the alarm, you must change the alarm to the <code>NORMAL</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NORMAL</code> - When the alarm is in the <code>NORMAL</code> state, it's ready to evaluate data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - If the alarm is in the <code>ACTIVE</code> state, the alarm is invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACKNOWLEDGED</code> - When the alarm is in the <code>ACKNOWLEDGED</code> state, the alarm was
     *        invoked and you acknowledged the alarm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SNOOZE_DISABLED</code> - When the alarm is in the <code>SNOOZE_DISABLED</code> state, the alarm is
     *        disabled for a specified period of time. After the snooze time, the alarm automatically changes to the
     *        <code>NORMAL</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATCHED</code> - When the alarm is in the <code>LATCHED</code> state, the alarm was invoked.
     *        However, the data that the alarm is currently evaluating is within the specified range. To change the
     *        alarm to the <code>NORMAL</code> state, you must acknowledge the alarm.
     *        </p>
     *        </li>
     * @see AlarmStateName
     */

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     * <p>
     * The name of the alarm state. The state name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code> - When the alarm is in the <code>DISABLED</code> state, it isn't ready to evaluate data. To
     * enable the alarm, you must change the alarm to the <code>NORMAL</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NORMAL</code> - When the alarm is in the <code>NORMAL</code> state, it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - If the alarm is in the <code>ACTIVE</code> state, the alarm is invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGED</code> - When the alarm is in the <code>ACKNOWLEDGED</code> state, the alarm was invoked and
     * you acknowledged the alarm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SNOOZE_DISABLED</code> - When the alarm is in the <code>SNOOZE_DISABLED</code> state, the alarm is disabled
     * for a specified period of time. After the snooze time, the alarm automatically changes to the <code>NORMAL</code>
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATCHED</code> - When the alarm is in the <code>LATCHED</code> state, the alarm was invoked. However, the
     * data that the alarm is currently evaluating is within the specified range. To change the alarm to the
     * <code>NORMAL</code> state, you must acknowledge the alarm.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the alarm state. The state name can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - When the alarm is in the <code>DISABLED</code> state, it isn't ready to evaluate
     *         data. To enable the alarm, you must change the alarm to the <code>NORMAL</code> state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NORMAL</code> - When the alarm is in the <code>NORMAL</code> state, it's ready to evaluate data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - If the alarm is in the <code>ACTIVE</code> state, the alarm is invoked.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACKNOWLEDGED</code> - When the alarm is in the <code>ACKNOWLEDGED</code> state, the alarm was
     *         invoked and you acknowledged the alarm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SNOOZE_DISABLED</code> - When the alarm is in the <code>SNOOZE_DISABLED</code> state, the alarm is
     *         disabled for a specified period of time. After the snooze time, the alarm automatically changes to the
     *         <code>NORMAL</code> state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LATCHED</code> - When the alarm is in the <code>LATCHED</code> state, the alarm was invoked.
     *         However, the data that the alarm is currently evaluating is within the specified range. To change the
     *         alarm to the <code>NORMAL</code> state, you must acknowledge the alarm.
     *         </p>
     *         </li>
     * @see AlarmStateName
     */

    public String getStateName() {
        return this.stateName;
    }

    /**
     * <p>
     * The name of the alarm state. The state name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code> - When the alarm is in the <code>DISABLED</code> state, it isn't ready to evaluate data. To
     * enable the alarm, you must change the alarm to the <code>NORMAL</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NORMAL</code> - When the alarm is in the <code>NORMAL</code> state, it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - If the alarm is in the <code>ACTIVE</code> state, the alarm is invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGED</code> - When the alarm is in the <code>ACKNOWLEDGED</code> state, the alarm was invoked and
     * you acknowledged the alarm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SNOOZE_DISABLED</code> - When the alarm is in the <code>SNOOZE_DISABLED</code> state, the alarm is disabled
     * for a specified period of time. After the snooze time, the alarm automatically changes to the <code>NORMAL</code>
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATCHED</code> - When the alarm is in the <code>LATCHED</code> state, the alarm was invoked. However, the
     * data that the alarm is currently evaluating is within the specified range. To change the alarm to the
     * <code>NORMAL</code> state, you must acknowledge the alarm.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stateName
     *        The name of the alarm state. The state name can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - When the alarm is in the <code>DISABLED</code> state, it isn't ready to evaluate
     *        data. To enable the alarm, you must change the alarm to the <code>NORMAL</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NORMAL</code> - When the alarm is in the <code>NORMAL</code> state, it's ready to evaluate data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - If the alarm is in the <code>ACTIVE</code> state, the alarm is invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACKNOWLEDGED</code> - When the alarm is in the <code>ACKNOWLEDGED</code> state, the alarm was
     *        invoked and you acknowledged the alarm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SNOOZE_DISABLED</code> - When the alarm is in the <code>SNOOZE_DISABLED</code> state, the alarm is
     *        disabled for a specified period of time. After the snooze time, the alarm automatically changes to the
     *        <code>NORMAL</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATCHED</code> - When the alarm is in the <code>LATCHED</code> state, the alarm was invoked.
     *        However, the data that the alarm is currently evaluating is within the specified range. To change the
     *        alarm to the <code>NORMAL</code> state, you must acknowledge the alarm.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmStateName
     */

    public AlarmState withStateName(String stateName) {
        setStateName(stateName);
        return this;
    }

    /**
     * <p>
     * The name of the alarm state. The state name can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code> - When the alarm is in the <code>DISABLED</code> state, it isn't ready to evaluate data. To
     * enable the alarm, you must change the alarm to the <code>NORMAL</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NORMAL</code> - When the alarm is in the <code>NORMAL</code> state, it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - If the alarm is in the <code>ACTIVE</code> state, the alarm is invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACKNOWLEDGED</code> - When the alarm is in the <code>ACKNOWLEDGED</code> state, the alarm was invoked and
     * you acknowledged the alarm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SNOOZE_DISABLED</code> - When the alarm is in the <code>SNOOZE_DISABLED</code> state, the alarm is disabled
     * for a specified period of time. After the snooze time, the alarm automatically changes to the <code>NORMAL</code>
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATCHED</code> - When the alarm is in the <code>LATCHED</code> state, the alarm was invoked. However, the
     * data that the alarm is currently evaluating is within the specified range. To change the alarm to the
     * <code>NORMAL</code> state, you must acknowledge the alarm.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stateName
     *        The name of the alarm state. The state name can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - When the alarm is in the <code>DISABLED</code> state, it isn't ready to evaluate
     *        data. To enable the alarm, you must change the alarm to the <code>NORMAL</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NORMAL</code> - When the alarm is in the <code>NORMAL</code> state, it's ready to evaluate data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - If the alarm is in the <code>ACTIVE</code> state, the alarm is invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACKNOWLEDGED</code> - When the alarm is in the <code>ACKNOWLEDGED</code> state, the alarm was
     *        invoked and you acknowledged the alarm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SNOOZE_DISABLED</code> - When the alarm is in the <code>SNOOZE_DISABLED</code> state, the alarm is
     *        disabled for a specified period of time. After the snooze time, the alarm automatically changes to the
     *        <code>NORMAL</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATCHED</code> - When the alarm is in the <code>LATCHED</code> state, the alarm was invoked.
     *        However, the data that the alarm is currently evaluating is within the specified range. To change the
     *        alarm to the <code>NORMAL</code> state, you must acknowledge the alarm.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmStateName
     */

    public AlarmState withStateName(AlarmStateName stateName) {
        this.stateName = stateName.toString();
        return this;
    }

    /**
     * <p>
     * Information needed to evaluate data.
     * </p>
     * 
     * @param ruleEvaluation
     *        Information needed to evaluate data.
     */

    public void setRuleEvaluation(RuleEvaluation ruleEvaluation) {
        this.ruleEvaluation = ruleEvaluation;
    }

    /**
     * <p>
     * Information needed to evaluate data.
     * </p>
     * 
     * @return Information needed to evaluate data.
     */

    public RuleEvaluation getRuleEvaluation() {
        return this.ruleEvaluation;
    }

    /**
     * <p>
     * Information needed to evaluate data.
     * </p>
     * 
     * @param ruleEvaluation
     *        Information needed to evaluate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmState withRuleEvaluation(RuleEvaluation ruleEvaluation) {
        setRuleEvaluation(ruleEvaluation);
        return this;
    }

    /**
     * <p>
     * Contains information about the action that you can take to respond to the alarm.
     * </p>
     * 
     * @param customerAction
     *        Contains information about the action that you can take to respond to the alarm.
     */

    public void setCustomerAction(CustomerAction customerAction) {
        this.customerAction = customerAction;
    }

    /**
     * <p>
     * Contains information about the action that you can take to respond to the alarm.
     * </p>
     * 
     * @return Contains information about the action that you can take to respond to the alarm.
     */

    public CustomerAction getCustomerAction() {
        return this.customerAction;
    }

    /**
     * <p>
     * Contains information about the action that you can take to respond to the alarm.
     * </p>
     * 
     * @param customerAction
     *        Contains information about the action that you can take to respond to the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmState withCustomerAction(CustomerAction customerAction) {
        setCustomerAction(customerAction);
        return this;
    }

    /**
     * <p>
     * Contains information about alarm state changes.
     * </p>
     * 
     * @param systemEvent
     *        Contains information about alarm state changes.
     */

    public void setSystemEvent(SystemEvent systemEvent) {
        this.systemEvent = systemEvent;
    }

    /**
     * <p>
     * Contains information about alarm state changes.
     * </p>
     * 
     * @return Contains information about alarm state changes.
     */

    public SystemEvent getSystemEvent() {
        return this.systemEvent;
    }

    /**
     * <p>
     * Contains information about alarm state changes.
     * </p>
     * 
     * @param systemEvent
     *        Contains information about alarm state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmState withSystemEvent(SystemEvent systemEvent) {
        setSystemEvent(systemEvent);
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
        if (getStateName() != null)
            sb.append("StateName: ").append(getStateName()).append(",");
        if (getRuleEvaluation() != null)
            sb.append("RuleEvaluation: ").append(getRuleEvaluation()).append(",");
        if (getCustomerAction() != null)
            sb.append("CustomerAction: ").append(getCustomerAction()).append(",");
        if (getSystemEvent() != null)
            sb.append("SystemEvent: ").append(getSystemEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmState == false)
            return false;
        AlarmState other = (AlarmState) obj;
        if (other.getStateName() == null ^ this.getStateName() == null)
            return false;
        if (other.getStateName() != null && other.getStateName().equals(this.getStateName()) == false)
            return false;
        if (other.getRuleEvaluation() == null ^ this.getRuleEvaluation() == null)
            return false;
        if (other.getRuleEvaluation() != null && other.getRuleEvaluation().equals(this.getRuleEvaluation()) == false)
            return false;
        if (other.getCustomerAction() == null ^ this.getCustomerAction() == null)
            return false;
        if (other.getCustomerAction() != null && other.getCustomerAction().equals(this.getCustomerAction()) == false)
            return false;
        if (other.getSystemEvent() == null ^ this.getSystemEvent() == null)
            return false;
        if (other.getSystemEvent() != null && other.getSystemEvent().equals(this.getSystemEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateName() == null) ? 0 : getStateName().hashCode());
        hashCode = prime * hashCode + ((getRuleEvaluation() == null) ? 0 : getRuleEvaluation().hashCode());
        hashCode = prime * hashCode + ((getCustomerAction() == null) ? 0 : getCustomerAction().hashCode());
        hashCode = prime * hashCode + ((getSystemEvent() == null) ? 0 : getSystemEvent().hashCode());
        return hashCode;
    }

    @Override
    public AlarmState clone() {
        try {
            return (AlarmState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.AlarmStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
