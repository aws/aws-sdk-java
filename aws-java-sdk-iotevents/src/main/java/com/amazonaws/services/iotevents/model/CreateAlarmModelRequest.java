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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateAlarmModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAlarmModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name that helps you identify the alarm model. You can't change this name after you create the alarm
     * model.
     * </p>
     */
    private String alarmModelName;
    /**
     * <p>
     * A description that tells you what the alarm model detects.
     * </p>
     */
    private String alarmModelDescription;
    /**
     * <p>
     * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm model.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html">Tagging your AWS IoT
     * Events resources</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * <p>
     * You can create up to 50 tags for one alarm model.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * An input attribute used as a key to create an alarm. AWS IoT Events routes <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html">inputs</a> associated with this
     * key to the alarm.
     * </p>
     */
    private String key;
    /**
     * <p>
     * A non-negative integer that reflects the severity level of the alarm.
     * </p>
     */
    private Integer severity;
    /**
     * <p>
     * Defines when your alarm is invoked.
     * </p>
     */
    private AlarmRule alarmRule;
    /**
     * <p>
     * Contains information about one or more notification actions.
     * </p>
     */
    private AlarmNotification alarmNotification;
    /**
     * <p>
     * Contains information about one or more alarm actions.
     * </p>
     */
    private AlarmEventActions alarmEventActions;
    /**
     * <p>
     * Contains the configuration information of alarm state changes.
     * </p>
     */
    private AlarmCapabilities alarmCapabilities;

    /**
     * <p>
     * A unique name that helps you identify the alarm model. You can't change this name after you create the alarm
     * model.
     * </p>
     * 
     * @param alarmModelName
     *        A unique name that helps you identify the alarm model. You can't change this name after you create the
     *        alarm model.
     */

    public void setAlarmModelName(String alarmModelName) {
        this.alarmModelName = alarmModelName;
    }

    /**
     * <p>
     * A unique name that helps you identify the alarm model. You can't change this name after you create the alarm
     * model.
     * </p>
     * 
     * @return A unique name that helps you identify the alarm model. You can't change this name after you create the
     *         alarm model.
     */

    public String getAlarmModelName() {
        return this.alarmModelName;
    }

    /**
     * <p>
     * A unique name that helps you identify the alarm model. You can't change this name after you create the alarm
     * model.
     * </p>
     * 
     * @param alarmModelName
     *        A unique name that helps you identify the alarm model. You can't change this name after you create the
     *        alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withAlarmModelName(String alarmModelName) {
        setAlarmModelName(alarmModelName);
        return this;
    }

    /**
     * <p>
     * A description that tells you what the alarm model detects.
     * </p>
     * 
     * @param alarmModelDescription
     *        A description that tells you what the alarm model detects.
     */

    public void setAlarmModelDescription(String alarmModelDescription) {
        this.alarmModelDescription = alarmModelDescription;
    }

    /**
     * <p>
     * A description that tells you what the alarm model detects.
     * </p>
     * 
     * @return A description that tells you what the alarm model detects.
     */

    public String getAlarmModelDescription() {
        return this.alarmModelDescription;
    }

    /**
     * <p>
     * A description that tells you what the alarm model detects.
     * </p>
     * 
     * @param alarmModelDescription
     *        A description that tells you what the alarm model detects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withAlarmModelDescription(String alarmModelDescription) {
        setAlarmModelDescription(alarmModelDescription);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm model.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html">Tagging your AWS IoT
     * Events resources</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * <p>
     * You can create up to 50 tags for one alarm model.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm
     *         model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html">Tagging your
     *         AWS IoT Events resources</a> in the <i>AWS IoT Events Developer Guide</i>.</p>
     *         <p>
     *         You can create up to 50 tags for one alarm model.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm model.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html">Tagging your AWS IoT
     * Events resources</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * <p>
     * You can create up to 50 tags for one alarm model.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm
     *        model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html">Tagging your AWS
     *        IoT Events resources</a> in the <i>AWS IoT Events Developer Guide</i>.</p>
     *        <p>
     *        You can create up to 50 tags for one alarm model.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm model.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html">Tagging your AWS IoT
     * Events resources</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * <p>
     * You can create up to 50 tags for one alarm model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm
     *        model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html">Tagging your AWS
     *        IoT Events resources</a> in the <i>AWS IoT Events Developer Guide</i>.</p>
     *        <p>
     *        You can create up to 50 tags for one alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm model.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html">Tagging your AWS IoT
     * Events resources</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * <p>
     * You can create up to 50 tags for one alarm model.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm
     *        model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html">Tagging your AWS
     *        IoT Events resources</a> in the <i>AWS IoT Events Developer Guide</i>.</p>
     *        <p>
     *        You can create up to 50 tags for one alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An input attribute used as a key to create an alarm. AWS IoT Events routes <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html">inputs</a> associated with this
     * key to the alarm.
     * </p>
     * 
     * @param key
     *        An input attribute used as a key to create an alarm. AWS IoT Events routes <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html">inputs</a> associated with
     *        this key to the alarm.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * An input attribute used as a key to create an alarm. AWS IoT Events routes <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html">inputs</a> associated with this
     * key to the alarm.
     * </p>
     * 
     * @return An input attribute used as a key to create an alarm. AWS IoT Events routes <a
     *         href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html">inputs</a> associated
     *         with this key to the alarm.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * An input attribute used as a key to create an alarm. AWS IoT Events routes <a
     * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html">inputs</a> associated with this
     * key to the alarm.
     * </p>
     * 
     * @param key
     *        An input attribute used as a key to create an alarm. AWS IoT Events routes <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html">inputs</a> associated with
     *        this key to the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * A non-negative integer that reflects the severity level of the alarm.
     * </p>
     * 
     * @param severity
     *        A non-negative integer that reflects the severity level of the alarm.
     */

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * A non-negative integer that reflects the severity level of the alarm.
     * </p>
     * 
     * @return A non-negative integer that reflects the severity level of the alarm.
     */

    public Integer getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * A non-negative integer that reflects the severity level of the alarm.
     * </p>
     * 
     * @param severity
     *        A non-negative integer that reflects the severity level of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withSeverity(Integer severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * Defines when your alarm is invoked.
     * </p>
     * 
     * @param alarmRule
     *        Defines when your alarm is invoked.
     */

    public void setAlarmRule(AlarmRule alarmRule) {
        this.alarmRule = alarmRule;
    }

    /**
     * <p>
     * Defines when your alarm is invoked.
     * </p>
     * 
     * @return Defines when your alarm is invoked.
     */

    public AlarmRule getAlarmRule() {
        return this.alarmRule;
    }

    /**
     * <p>
     * Defines when your alarm is invoked.
     * </p>
     * 
     * @param alarmRule
     *        Defines when your alarm is invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withAlarmRule(AlarmRule alarmRule) {
        setAlarmRule(alarmRule);
        return this;
    }

    /**
     * <p>
     * Contains information about one or more notification actions.
     * </p>
     * 
     * @param alarmNotification
     *        Contains information about one or more notification actions.
     */

    public void setAlarmNotification(AlarmNotification alarmNotification) {
        this.alarmNotification = alarmNotification;
    }

    /**
     * <p>
     * Contains information about one or more notification actions.
     * </p>
     * 
     * @return Contains information about one or more notification actions.
     */

    public AlarmNotification getAlarmNotification() {
        return this.alarmNotification;
    }

    /**
     * <p>
     * Contains information about one or more notification actions.
     * </p>
     * 
     * @param alarmNotification
     *        Contains information about one or more notification actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withAlarmNotification(AlarmNotification alarmNotification) {
        setAlarmNotification(alarmNotification);
        return this;
    }

    /**
     * <p>
     * Contains information about one or more alarm actions.
     * </p>
     * 
     * @param alarmEventActions
     *        Contains information about one or more alarm actions.
     */

    public void setAlarmEventActions(AlarmEventActions alarmEventActions) {
        this.alarmEventActions = alarmEventActions;
    }

    /**
     * <p>
     * Contains information about one or more alarm actions.
     * </p>
     * 
     * @return Contains information about one or more alarm actions.
     */

    public AlarmEventActions getAlarmEventActions() {
        return this.alarmEventActions;
    }

    /**
     * <p>
     * Contains information about one or more alarm actions.
     * </p>
     * 
     * @param alarmEventActions
     *        Contains information about one or more alarm actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withAlarmEventActions(AlarmEventActions alarmEventActions) {
        setAlarmEventActions(alarmEventActions);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of alarm state changes.
     * </p>
     * 
     * @param alarmCapabilities
     *        Contains the configuration information of alarm state changes.
     */

    public void setAlarmCapabilities(AlarmCapabilities alarmCapabilities) {
        this.alarmCapabilities = alarmCapabilities;
    }

    /**
     * <p>
     * Contains the configuration information of alarm state changes.
     * </p>
     * 
     * @return Contains the configuration information of alarm state changes.
     */

    public AlarmCapabilities getAlarmCapabilities() {
        return this.alarmCapabilities;
    }

    /**
     * <p>
     * Contains the configuration information of alarm state changes.
     * </p>
     * 
     * @param alarmCapabilities
     *        Contains the configuration information of alarm state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelRequest withAlarmCapabilities(AlarmCapabilities alarmCapabilities) {
        setAlarmCapabilities(alarmCapabilities);
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
        if (getAlarmModelName() != null)
            sb.append("AlarmModelName: ").append(getAlarmModelName()).append(",");
        if (getAlarmModelDescription() != null)
            sb.append("AlarmModelDescription: ").append(getAlarmModelDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getAlarmRule() != null)
            sb.append("AlarmRule: ").append(getAlarmRule()).append(",");
        if (getAlarmNotification() != null)
            sb.append("AlarmNotification: ").append(getAlarmNotification()).append(",");
        if (getAlarmEventActions() != null)
            sb.append("AlarmEventActions: ").append(getAlarmEventActions()).append(",");
        if (getAlarmCapabilities() != null)
            sb.append("AlarmCapabilities: ").append(getAlarmCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAlarmModelRequest == false)
            return false;
        CreateAlarmModelRequest other = (CreateAlarmModelRequest) obj;
        if (other.getAlarmModelName() == null ^ this.getAlarmModelName() == null)
            return false;
        if (other.getAlarmModelName() != null && other.getAlarmModelName().equals(this.getAlarmModelName()) == false)
            return false;
        if (other.getAlarmModelDescription() == null ^ this.getAlarmModelDescription() == null)
            return false;
        if (other.getAlarmModelDescription() != null && other.getAlarmModelDescription().equals(this.getAlarmModelDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getAlarmRule() == null ^ this.getAlarmRule() == null)
            return false;
        if (other.getAlarmRule() != null && other.getAlarmRule().equals(this.getAlarmRule()) == false)
            return false;
        if (other.getAlarmNotification() == null ^ this.getAlarmNotification() == null)
            return false;
        if (other.getAlarmNotification() != null && other.getAlarmNotification().equals(this.getAlarmNotification()) == false)
            return false;
        if (other.getAlarmEventActions() == null ^ this.getAlarmEventActions() == null)
            return false;
        if (other.getAlarmEventActions() != null && other.getAlarmEventActions().equals(this.getAlarmEventActions()) == false)
            return false;
        if (other.getAlarmCapabilities() == null ^ this.getAlarmCapabilities() == null)
            return false;
        if (other.getAlarmCapabilities() != null && other.getAlarmCapabilities().equals(this.getAlarmCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmModelName() == null) ? 0 : getAlarmModelName().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelDescription() == null) ? 0 : getAlarmModelDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getAlarmRule() == null) ? 0 : getAlarmRule().hashCode());
        hashCode = prime * hashCode + ((getAlarmNotification() == null) ? 0 : getAlarmNotification().hashCode());
        hashCode = prime * hashCode + ((getAlarmEventActions() == null) ? 0 : getAlarmEventActions().hashCode());
        hashCode = prime * hashCode + ((getAlarmCapabilities() == null) ? 0 : getAlarmCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public CreateAlarmModelRequest clone() {
        return (CreateAlarmModelRequest) super.clone();
    }

}
