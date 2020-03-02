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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The details about a composite alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/CompositeAlarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompositeAlarm implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     */
    private Boolean actionsEnabled;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmActions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     */
    private String alarmArn;
    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     */
    private java.util.Date alarmConfigurationUpdatedTimestamp;
    /**
     * <p>
     * The description of the alarm.
     * </p>
     */
    private String alarmDescription;
    /**
     * <p>
     * The name of the alarm.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The rule that this alarm uses to evaluate its alarm state.
     * </p>
     */
    private String alarmRule;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> insufficientDataActions;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> oKActions;
    /**
     * <p>
     * An explanation for the alarm state, in text format.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * An explanation for the alarm state, in JSON format.
     * </p>
     */
    private String stateReasonData;
    /**
     * <p>
     * The time stamp of the last update to the alarm state.
     * </p>
     */
    private java.util.Date stateUpdatedTimestamp;
    /**
     * <p>
     * The state value for the alarm.
     * </p>
     */
    private String stateValue;

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether actions should be executed during any changes to the alarm state.
     */

    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     * 
     * @return Indicates whether actions should be executed during any changes to the alarm state.
     */

    public Boolean getActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether actions should be executed during any changes to the alarm state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withActionsEnabled(Boolean actionsEnabled) {
        setActionsEnabled(actionsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     * 
     * @return Indicates whether actions should be executed during any changes to the alarm state.
     */

    public Boolean isActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the ALARM state from any other state. Each action
     *         is specified as an Amazon Resource Name (ARN).
     */

    public java.util.List<String> getAlarmActions() {
        if (alarmActions == null) {
            alarmActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN).
     */

    public void setAlarmActions(java.util.Collection<String> alarmActions) {
        if (alarmActions == null) {
            this.alarmActions = null;
            return;
        }

        this.alarmActions = new com.amazonaws.internal.SdkInternalList<String>(alarmActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmActions(java.util.Collection)} or {@link #withAlarmActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withAlarmActions(String... alarmActions) {
        if (this.alarmActions == null) {
            setAlarmActions(new com.amazonaws.internal.SdkInternalList<String>(alarmActions.length));
        }
        for (String ele : alarmActions) {
            this.alarmActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withAlarmActions(java.util.Collection<String> alarmActions) {
        setAlarmActions(alarmActions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @param alarmArn
     *        The Amazon Resource Name (ARN) of the alarm.
     */

    public void setAlarmArn(String alarmArn) {
        this.alarmArn = alarmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the alarm.
     */

    public String getAlarmArn() {
        return this.alarmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @param alarmArn
     *        The Amazon Resource Name (ARN) of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withAlarmArn(String alarmArn) {
        setAlarmArn(alarmArn);
        return this;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     * 
     * @param alarmConfigurationUpdatedTimestamp
     *        The time stamp of the last update to the alarm configuration.
     */

    public void setAlarmConfigurationUpdatedTimestamp(java.util.Date alarmConfigurationUpdatedTimestamp) {
        this.alarmConfigurationUpdatedTimestamp = alarmConfigurationUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     * 
     * @return The time stamp of the last update to the alarm configuration.
     */

    public java.util.Date getAlarmConfigurationUpdatedTimestamp() {
        return this.alarmConfigurationUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     * 
     * @param alarmConfigurationUpdatedTimestamp
     *        The time stamp of the last update to the alarm configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withAlarmConfigurationUpdatedTimestamp(java.util.Date alarmConfigurationUpdatedTimestamp) {
        setAlarmConfigurationUpdatedTimestamp(alarmConfigurationUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The description of the alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description of the alarm.
     */

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    /**
     * <p>
     * The description of the alarm.
     * </p>
     * 
     * @return The description of the alarm.
     */

    public String getAlarmDescription() {
        return this.alarmDescription;
    }

    /**
     * <p>
     * The description of the alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withAlarmDescription(String alarmDescription) {
        setAlarmDescription(alarmDescription);
        return this;
    }

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

    public CompositeAlarm withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The rule that this alarm uses to evaluate its alarm state.
     * </p>
     * 
     * @param alarmRule
     *        The rule that this alarm uses to evaluate its alarm state.
     */

    public void setAlarmRule(String alarmRule) {
        this.alarmRule = alarmRule;
    }

    /**
     * <p>
     * The rule that this alarm uses to evaluate its alarm state.
     * </p>
     * 
     * @return The rule that this alarm uses to evaluate its alarm state.
     */

    public String getAlarmRule() {
        return this.alarmRule;
    }

    /**
     * <p>
     * The rule that this alarm uses to evaluate its alarm state.
     * </p>
     * 
     * @param alarmRule
     *        The rule that this alarm uses to evaluate its alarm state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withAlarmRule(String alarmRule) {
        setAlarmRule(alarmRule);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state.
     *         Each action is specified as an Amazon Resource Name (ARN).
     */

    public java.util.List<String> getInsufficientDataActions() {
        if (insufficientDataActions == null) {
            insufficientDataActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return insufficientDataActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).
     */

    public void setInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        if (insufficientDataActions == null) {
            this.insufficientDataActions = null;
            return;
        }

        this.insufficientDataActions = new com.amazonaws.internal.SdkInternalList<String>(insufficientDataActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsufficientDataActions(java.util.Collection)} or
     * {@link #withInsufficientDataActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withInsufficientDataActions(String... insufficientDataActions) {
        if (this.insufficientDataActions == null) {
            setInsufficientDataActions(new com.amazonaws.internal.SdkInternalList<String>(insufficientDataActions.length));
        }
        for (String ele : insufficientDataActions) {
            this.insufficientDataActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        setInsufficientDataActions(insufficientDataActions);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the OK state from any other state. Each action is
     *         specified as an Amazon Resource Name (ARN).
     */

    public java.util.List<String> getOKActions() {
        if (oKActions == null) {
            oKActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return oKActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to the OK state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN).
     */

    public void setOKActions(java.util.Collection<String> oKActions) {
        if (oKActions == null) {
            this.oKActions = null;
            return;
        }

        this.oKActions = new com.amazonaws.internal.SdkInternalList<String>(oKActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOKActions(java.util.Collection)} or {@link #withOKActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to the OK state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withOKActions(String... oKActions) {
        if (this.oKActions == null) {
            setOKActions(new com.amazonaws.internal.SdkInternalList<String>(oKActions.length));
        }
        for (String ele : oKActions) {
            this.oKActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to the OK state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withOKActions(java.util.Collection<String> oKActions) {
        setOKActions(oKActions);
        return this;
    }

    /**
     * <p>
     * An explanation for the alarm state, in text format.
     * </p>
     * 
     * @param stateReason
     *        An explanation for the alarm state, in text format.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * An explanation for the alarm state, in text format.
     * </p>
     * 
     * @return An explanation for the alarm state, in text format.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * An explanation for the alarm state, in text format.
     * </p>
     * 
     * @param stateReason
     *        An explanation for the alarm state, in text format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * An explanation for the alarm state, in JSON format.
     * </p>
     * 
     * @param stateReasonData
     *        An explanation for the alarm state, in JSON format.
     */

    public void setStateReasonData(String stateReasonData) {
        this.stateReasonData = stateReasonData;
    }

    /**
     * <p>
     * An explanation for the alarm state, in JSON format.
     * </p>
     * 
     * @return An explanation for the alarm state, in JSON format.
     */

    public String getStateReasonData() {
        return this.stateReasonData;
    }

    /**
     * <p>
     * An explanation for the alarm state, in JSON format.
     * </p>
     * 
     * @param stateReasonData
     *        An explanation for the alarm state, in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withStateReasonData(String stateReasonData) {
        setStateReasonData(stateReasonData);
        return this;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm state.
     * </p>
     * 
     * @param stateUpdatedTimestamp
     *        The time stamp of the last update to the alarm state.
     */

    public void setStateUpdatedTimestamp(java.util.Date stateUpdatedTimestamp) {
        this.stateUpdatedTimestamp = stateUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm state.
     * </p>
     * 
     * @return The time stamp of the last update to the alarm state.
     */

    public java.util.Date getStateUpdatedTimestamp() {
        return this.stateUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm state.
     * </p>
     * 
     * @param stateUpdatedTimestamp
     *        The time stamp of the last update to the alarm state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeAlarm withStateUpdatedTimestamp(java.util.Date stateUpdatedTimestamp) {
        setStateUpdatedTimestamp(stateUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * 
     * @param stateValue
     *        The state value for the alarm.
     * @see StateValue
     */

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * 
     * @return The state value for the alarm.
     * @see StateValue
     */

    public String getStateValue() {
        return this.stateValue;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * 
     * @param stateValue
     *        The state value for the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateValue
     */

    public CompositeAlarm withStateValue(String stateValue) {
        setStateValue(stateValue);
        return this;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * 
     * @param stateValue
     *        The state value for the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateValue
     */

    public CompositeAlarm withStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
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
        if (getActionsEnabled() != null)
            sb.append("ActionsEnabled: ").append(getActionsEnabled()).append(",");
        if (getAlarmActions() != null)
            sb.append("AlarmActions: ").append(getAlarmActions()).append(",");
        if (getAlarmArn() != null)
            sb.append("AlarmArn: ").append(getAlarmArn()).append(",");
        if (getAlarmConfigurationUpdatedTimestamp() != null)
            sb.append("AlarmConfigurationUpdatedTimestamp: ").append(getAlarmConfigurationUpdatedTimestamp()).append(",");
        if (getAlarmDescription() != null)
            sb.append("AlarmDescription: ").append(getAlarmDescription()).append(",");
        if (getAlarmName() != null)
            sb.append("AlarmName: ").append(getAlarmName()).append(",");
        if (getAlarmRule() != null)
            sb.append("AlarmRule: ").append(getAlarmRule()).append(",");
        if (getInsufficientDataActions() != null)
            sb.append("InsufficientDataActions: ").append(getInsufficientDataActions()).append(",");
        if (getOKActions() != null)
            sb.append("OKActions: ").append(getOKActions()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getStateReasonData() != null)
            sb.append("StateReasonData: ").append(getStateReasonData()).append(",");
        if (getStateUpdatedTimestamp() != null)
            sb.append("StateUpdatedTimestamp: ").append(getStateUpdatedTimestamp()).append(",");
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

        if (obj instanceof CompositeAlarm == false)
            return false;
        CompositeAlarm other = (CompositeAlarm) obj;
        if (other.getActionsEnabled() == null ^ this.getActionsEnabled() == null)
            return false;
        if (other.getActionsEnabled() != null && other.getActionsEnabled().equals(this.getActionsEnabled()) == false)
            return false;
        if (other.getAlarmActions() == null ^ this.getAlarmActions() == null)
            return false;
        if (other.getAlarmActions() != null && other.getAlarmActions().equals(this.getAlarmActions()) == false)
            return false;
        if (other.getAlarmArn() == null ^ this.getAlarmArn() == null)
            return false;
        if (other.getAlarmArn() != null && other.getAlarmArn().equals(this.getAlarmArn()) == false)
            return false;
        if (other.getAlarmConfigurationUpdatedTimestamp() == null ^ this.getAlarmConfigurationUpdatedTimestamp() == null)
            return false;
        if (other.getAlarmConfigurationUpdatedTimestamp() != null
                && other.getAlarmConfigurationUpdatedTimestamp().equals(this.getAlarmConfigurationUpdatedTimestamp()) == false)
            return false;
        if (other.getAlarmDescription() == null ^ this.getAlarmDescription() == null)
            return false;
        if (other.getAlarmDescription() != null && other.getAlarmDescription().equals(this.getAlarmDescription()) == false)
            return false;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getAlarmRule() == null ^ this.getAlarmRule() == null)
            return false;
        if (other.getAlarmRule() != null && other.getAlarmRule().equals(this.getAlarmRule()) == false)
            return false;
        if (other.getInsufficientDataActions() == null ^ this.getInsufficientDataActions() == null)
            return false;
        if (other.getInsufficientDataActions() != null && other.getInsufficientDataActions().equals(this.getInsufficientDataActions()) == false)
            return false;
        if (other.getOKActions() == null ^ this.getOKActions() == null)
            return false;
        if (other.getOKActions() != null && other.getOKActions().equals(this.getOKActions()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateReasonData() == null ^ this.getStateReasonData() == null)
            return false;
        if (other.getStateReasonData() != null && other.getStateReasonData().equals(this.getStateReasonData()) == false)
            return false;
        if (other.getStateUpdatedTimestamp() == null ^ this.getStateUpdatedTimestamp() == null)
            return false;
        if (other.getStateUpdatedTimestamp() != null && other.getStateUpdatedTimestamp().equals(this.getStateUpdatedTimestamp()) == false)
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

        hashCode = prime * hashCode + ((getActionsEnabled() == null) ? 0 : getActionsEnabled().hashCode());
        hashCode = prime * hashCode + ((getAlarmActions() == null) ? 0 : getAlarmActions().hashCode());
        hashCode = prime * hashCode + ((getAlarmArn() == null) ? 0 : getAlarmArn().hashCode());
        hashCode = prime * hashCode + ((getAlarmConfigurationUpdatedTimestamp() == null) ? 0 : getAlarmConfigurationUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAlarmDescription() == null) ? 0 : getAlarmDescription().hashCode());
        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getAlarmRule() == null) ? 0 : getAlarmRule().hashCode());
        hashCode = prime * hashCode + ((getInsufficientDataActions() == null) ? 0 : getInsufficientDataActions().hashCode());
        hashCode = prime * hashCode + ((getOKActions() == null) ? 0 : getOKActions().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getStateReasonData() == null) ? 0 : getStateReasonData().hashCode());
        hashCode = prime * hashCode + ((getStateUpdatedTimestamp() == null) ? 0 : getStateUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        return hashCode;
    }

    @Override
    public CompositeAlarm clone() {
        try {
            return (CompositeAlarm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
