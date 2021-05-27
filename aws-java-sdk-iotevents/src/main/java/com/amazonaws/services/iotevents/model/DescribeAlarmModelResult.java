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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeAlarmModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The ARN of the alarm model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String alarmModelArn;
    /**
     * <p>
     * The version of the alarm model.
     * </p>
     */
    private String alarmModelVersion;
    /**
     * <p>
     * The time the alarm model was last updated, in the Unix epoch format.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Contains information about the status of the alarm model.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The name of the alarm model.
     * </p>
     */
    private String alarmModelName;
    /**
     * <p>
     * The description of the alarm model.
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
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     * 
     * @param creationTime
     *        The time the alarm model was created, in the Unix epoch format.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     * 
     * @return The time the alarm model was created, in the Unix epoch format.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     * 
     * @param creationTime
     *        The time the alarm model was created, in the Unix epoch format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmModelResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the alarm model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param alarmModelArn
     *        The ARN of the alarm model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAlarmModelArn(String alarmModelArn) {
        this.alarmModelArn = alarmModelArn;
    }

    /**
     * <p>
     * The ARN of the alarm model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The ARN of the alarm model. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAlarmModelArn() {
        return this.alarmModelArn;
    }

    /**
     * <p>
     * The ARN of the alarm model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param alarmModelArn
     *        The ARN of the alarm model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmModelResult withAlarmModelArn(String alarmModelArn) {
        setAlarmModelArn(alarmModelArn);
        return this;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @param alarmModelVersion
     *        The version of the alarm model.
     */

    public void setAlarmModelVersion(String alarmModelVersion) {
        this.alarmModelVersion = alarmModelVersion;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @return The version of the alarm model.
     */

    public String getAlarmModelVersion() {
        return this.alarmModelVersion;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @param alarmModelVersion
     *        The version of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmModelResult withAlarmModelVersion(String alarmModelVersion) {
        setAlarmModelVersion(alarmModelVersion);
        return this;
    }

    /**
     * <p>
     * The time the alarm model was last updated, in the Unix epoch format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the alarm model was last updated, in the Unix epoch format.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time the alarm model was last updated, in the Unix epoch format.
     * </p>
     * 
     * @return The time the alarm model was last updated, in the Unix epoch format.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time the alarm model was last updated, in the Unix epoch format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the alarm model was last updated, in the Unix epoch format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmModelResult withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the alarm model. The status can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can
     *        take up to a few minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm
     *        model information and update the alarm model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information
     *        and try again.
     *        </p>
     *        </li>
     * @see AlarmModelVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the alarm model. The status can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can
     *         take up to a few minutes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm
     *         model information and update the alarm model.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information
     *         and try again.
     *         </p>
     *         </li>
     * @see AlarmModelVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the alarm model. The status can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can
     *        take up to a few minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm
     *        model information and update the alarm model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information
     *        and try again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmModelVersionStatus
     */

    public DescribeAlarmModelResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the alarm model. The status can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can
     *        take up to a few minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm
     *        model information and update the alarm model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information
     *        and try again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmModelVersionStatus
     */

    public DescribeAlarmModelResult withStatus(AlarmModelVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the status of the alarm model.
     * </p>
     * 
     * @param statusMessage
     *        Contains information about the status of the alarm model.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Contains information about the status of the alarm model.
     * </p>
     * 
     * @return Contains information about the status of the alarm model.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Contains information about the status of the alarm model.
     * </p>
     * 
     * @param statusMessage
     *        Contains information about the status of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmModelResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     * 
     * @param alarmModelName
     *        The name of the alarm model.
     */

    public void setAlarmModelName(String alarmModelName) {
        this.alarmModelName = alarmModelName;
    }

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     * 
     * @return The name of the alarm model.
     */

    public String getAlarmModelName() {
        return this.alarmModelName;
    }

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     * 
     * @param alarmModelName
     *        The name of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmModelResult withAlarmModelName(String alarmModelName) {
        setAlarmModelName(alarmModelName);
        return this;
    }

    /**
     * <p>
     * The description of the alarm model.
     * </p>
     * 
     * @param alarmModelDescription
     *        The description of the alarm model.
     */

    public void setAlarmModelDescription(String alarmModelDescription) {
        this.alarmModelDescription = alarmModelDescription;
    }

    /**
     * <p>
     * The description of the alarm model.
     * </p>
     * 
     * @return The description of the alarm model.
     */

    public String getAlarmModelDescription() {
        return this.alarmModelDescription;
    }

    /**
     * <p>
     * The description of the alarm model.
     * </p>
     * 
     * @param alarmModelDescription
     *        The description of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmModelResult withAlarmModelDescription(String alarmModelDescription) {
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

    public DescribeAlarmModelResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public DescribeAlarmModelResult withKey(String key) {
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

    public DescribeAlarmModelResult withSeverity(Integer severity) {
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

    public DescribeAlarmModelResult withAlarmRule(AlarmRule alarmRule) {
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

    public DescribeAlarmModelResult withAlarmNotification(AlarmNotification alarmNotification) {
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

    public DescribeAlarmModelResult withAlarmEventActions(AlarmEventActions alarmEventActions) {
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

    public DescribeAlarmModelResult withAlarmCapabilities(AlarmCapabilities alarmCapabilities) {
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getAlarmModelArn() != null)
            sb.append("AlarmModelArn: ").append(getAlarmModelArn()).append(",");
        if (getAlarmModelVersion() != null)
            sb.append("AlarmModelVersion: ").append(getAlarmModelVersion()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getAlarmModelName() != null)
            sb.append("AlarmModelName: ").append(getAlarmModelName()).append(",");
        if (getAlarmModelDescription() != null)
            sb.append("AlarmModelDescription: ").append(getAlarmModelDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof DescribeAlarmModelResult == false)
            return false;
        DescribeAlarmModelResult other = (DescribeAlarmModelResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getAlarmModelArn() == null ^ this.getAlarmModelArn() == null)
            return false;
        if (other.getAlarmModelArn() != null && other.getAlarmModelArn().equals(this.getAlarmModelArn()) == false)
            return false;
        if (other.getAlarmModelVersion() == null ^ this.getAlarmModelVersion() == null)
            return false;
        if (other.getAlarmModelVersion() != null && other.getAlarmModelVersion().equals(this.getAlarmModelVersion()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelArn() == null) ? 0 : getAlarmModelArn().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelVersion() == null) ? 0 : getAlarmModelVersion().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelName() == null) ? 0 : getAlarmModelName().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelDescription() == null) ? 0 : getAlarmModelDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getAlarmRule() == null) ? 0 : getAlarmRule().hashCode());
        hashCode = prime * hashCode + ((getAlarmNotification() == null) ? 0 : getAlarmNotification().hashCode());
        hashCode = prime * hashCode + ((getAlarmEventActions() == null) ? 0 : getAlarmEventActions().hashCode());
        hashCode = prime * hashCode + ((getAlarmCapabilities() == null) ? 0 : getAlarmCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmModelResult clone() {
        try {
            return (DescribeAlarmModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
