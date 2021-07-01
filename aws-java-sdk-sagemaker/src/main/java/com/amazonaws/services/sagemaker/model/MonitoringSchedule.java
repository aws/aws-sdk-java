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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A schedule for a model monitoring job. For information about model monitor, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     */
    private String monitoringScheduleArn;
    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * The status of the monitoring schedule. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The schedule is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The schedule failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code> - The schedule was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The schedule was stopped.
     * </p>
     * </li>
     * </ul>
     */
    private String monitoringScheduleStatus;
    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     */
    private String monitoringType;
    /**
     * <p>
     * If the monitoring schedule failed, the reason it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The time that the monitoring schedule was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the monitoring schedule was changed.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private MonitoringScheduleConfig monitoringScheduleConfig;
    /**
     * <p>
     * The endpoint that hosts the model being monitored.
     * </p>
     */
    private String endpointName;

    private MonitoringExecutionSummary lastMonitoringExecutionSummary;
    /**
     * <p>
     * A list of the tags associated with the monitoring schedlue. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleArn
     *        The Amazon Resource Name (ARN) of the monitoring schedule.
     */

    public void setMonitoringScheduleArn(String monitoringScheduleArn) {
        this.monitoringScheduleArn = monitoringScheduleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the monitoring schedule.
     */

    public String getMonitoringScheduleArn() {
        return this.monitoringScheduleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleArn
     *        The Amazon Resource Name (ARN) of the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withMonitoringScheduleArn(String monitoringScheduleArn) {
        setMonitoringScheduleArn(monitoringScheduleArn);
        return this;
    }

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of the monitoring schedule.
     */

    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * 
     * @return The name of the monitoring schedule.
     */

    public String getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
        return this;
    }

    /**
     * <p>
     * The status of the monitoring schedule. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The schedule is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The schedule failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code> - The schedule was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The schedule was stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param monitoringScheduleStatus
     *        The status of the monitoring schedule. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The schedule is pending being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The schedule failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULED</code> - The schedule was successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> - The schedule was stopped.
     *        </p>
     *        </li>
     * @see ScheduleStatus
     */

    public void setMonitoringScheduleStatus(String monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of the monitoring schedule. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The schedule is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The schedule failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code> - The schedule was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The schedule was stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the monitoring schedule. This can be one of the following values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - The schedule is pending being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The schedule failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SCHEDULED</code> - The schedule was successfully created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code> - The schedule was stopped.
     *         </p>
     *         </li>
     * @see ScheduleStatus
     */

    public String getMonitoringScheduleStatus() {
        return this.monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of the monitoring schedule. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The schedule is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The schedule failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code> - The schedule was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The schedule was stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param monitoringScheduleStatus
     *        The status of the monitoring schedule. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The schedule is pending being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The schedule failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULED</code> - The schedule was successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> - The schedule was stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleStatus
     */

    public MonitoringSchedule withMonitoringScheduleStatus(String monitoringScheduleStatus) {
        setMonitoringScheduleStatus(monitoringScheduleStatus);
        return this;
    }

    /**
     * <p>
     * The status of the monitoring schedule. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The schedule is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The schedule failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code> - The schedule was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The schedule was stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param monitoringScheduleStatus
     *        The status of the monitoring schedule. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The schedule is pending being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The schedule failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULED</code> - The schedule was successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> - The schedule was stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleStatus
     */

    public MonitoringSchedule withMonitoringScheduleStatus(ScheduleStatus monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     * 
     * @param monitoringType
     *        The type of the monitoring job definition to schedule.
     * @see MonitoringType
     */

    public void setMonitoringType(String monitoringType) {
        this.monitoringType = monitoringType;
    }

    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     * 
     * @return The type of the monitoring job definition to schedule.
     * @see MonitoringType
     */

    public String getMonitoringType() {
        return this.monitoringType;
    }

    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     * 
     * @param monitoringType
     *        The type of the monitoring job definition to schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringType
     */

    public MonitoringSchedule withMonitoringType(String monitoringType) {
        setMonitoringType(monitoringType);
        return this;
    }

    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     * 
     * @param monitoringType
     *        The type of the monitoring job definition to schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringType
     */

    public MonitoringSchedule withMonitoringType(MonitoringType monitoringType) {
        this.monitoringType = monitoringType.toString();
        return this;
    }

    /**
     * <p>
     * If the monitoring schedule failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the monitoring schedule failed, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the monitoring schedule failed, the reason it failed.
     * </p>
     * 
     * @return If the monitoring schedule failed, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the monitoring schedule failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the monitoring schedule failed, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The time that the monitoring schedule was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the monitoring schedule was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the monitoring schedule was created.
     * </p>
     * 
     * @return The time that the monitoring schedule was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the monitoring schedule was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the monitoring schedule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the monitoring schedule was changed.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the monitoring schedule was changed.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time the monitoring schedule was changed.
     * </p>
     * 
     * @return The last time the monitoring schedule was changed.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time the monitoring schedule was changed.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the monitoring schedule was changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param monitoringScheduleConfig
     */

    public void setMonitoringScheduleConfig(MonitoringScheduleConfig monitoringScheduleConfig) {
        this.monitoringScheduleConfig = monitoringScheduleConfig;
    }

    /**
     * @return
     */

    public MonitoringScheduleConfig getMonitoringScheduleConfig() {
        return this.monitoringScheduleConfig;
    }

    /**
     * @param monitoringScheduleConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withMonitoringScheduleConfig(MonitoringScheduleConfig monitoringScheduleConfig) {
        setMonitoringScheduleConfig(monitoringScheduleConfig);
        return this;
    }

    /**
     * <p>
     * The endpoint that hosts the model being monitored.
     * </p>
     * 
     * @param endpointName
     *        The endpoint that hosts the model being monitored.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The endpoint that hosts the model being monitored.
     * </p>
     * 
     * @return The endpoint that hosts the model being monitored.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The endpoint that hosts the model being monitored.
     * </p>
     * 
     * @param endpointName
     *        The endpoint that hosts the model being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * @param lastMonitoringExecutionSummary
     */

    public void setLastMonitoringExecutionSummary(MonitoringExecutionSummary lastMonitoringExecutionSummary) {
        this.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
    }

    /**
     * @return
     */

    public MonitoringExecutionSummary getLastMonitoringExecutionSummary() {
        return this.lastMonitoringExecutionSummary;
    }

    /**
     * @param lastMonitoringExecutionSummary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withLastMonitoringExecutionSummary(MonitoringExecutionSummary lastMonitoringExecutionSummary) {
        setLastMonitoringExecutionSummary(lastMonitoringExecutionSummary);
        return this;
    }

    /**
     * <p>
     * A list of the tags associated with the monitoring schedlue. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @return A list of the tags associated with the monitoring schedlue. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tags associated with the monitoring schedlue. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of the tags associated with the monitoring schedlue. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
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
     * A list of the tags associated with the monitoring schedlue. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tags associated with the monitoring schedlue. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withTags(Tag... tags) {
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
     * A list of the tags associated with the monitoring schedlue. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of the tags associated with the monitoring schedlue. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSchedule withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getMonitoringScheduleArn() != null)
            sb.append("MonitoringScheduleArn: ").append(getMonitoringScheduleArn()).append(",");
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: ").append(getMonitoringScheduleName()).append(",");
        if (getMonitoringScheduleStatus() != null)
            sb.append("MonitoringScheduleStatus: ").append(getMonitoringScheduleStatus()).append(",");
        if (getMonitoringType() != null)
            sb.append("MonitoringType: ").append(getMonitoringType()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getMonitoringScheduleConfig() != null)
            sb.append("MonitoringScheduleConfig: ").append(getMonitoringScheduleConfig()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getLastMonitoringExecutionSummary() != null)
            sb.append("LastMonitoringExecutionSummary: ").append(getLastMonitoringExecutionSummary()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringSchedule == false)
            return false;
        MonitoringSchedule other = (MonitoringSchedule) obj;
        if (other.getMonitoringScheduleArn() == null ^ this.getMonitoringScheduleArn() == null)
            return false;
        if (other.getMonitoringScheduleArn() != null && other.getMonitoringScheduleArn().equals(this.getMonitoringScheduleArn()) == false)
            return false;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getMonitoringScheduleStatus() == null ^ this.getMonitoringScheduleStatus() == null)
            return false;
        if (other.getMonitoringScheduleStatus() != null && other.getMonitoringScheduleStatus().equals(this.getMonitoringScheduleStatus()) == false)
            return false;
        if (other.getMonitoringType() == null ^ this.getMonitoringType() == null)
            return false;
        if (other.getMonitoringType() != null && other.getMonitoringType().equals(this.getMonitoringType()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getMonitoringScheduleConfig() == null ^ this.getMonitoringScheduleConfig() == null)
            return false;
        if (other.getMonitoringScheduleConfig() != null && other.getMonitoringScheduleConfig().equals(this.getMonitoringScheduleConfig()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getLastMonitoringExecutionSummary() == null ^ this.getLastMonitoringExecutionSummary() == null)
            return false;
        if (other.getLastMonitoringExecutionSummary() != null
                && other.getLastMonitoringExecutionSummary().equals(this.getLastMonitoringExecutionSummary()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringScheduleArn() == null) ? 0 : getMonitoringScheduleArn().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleStatus() == null) ? 0 : getMonitoringScheduleStatus().hashCode());
        hashCode = prime * hashCode + ((getMonitoringType() == null) ? 0 : getMonitoringType().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleConfig() == null) ? 0 : getMonitoringScheduleConfig().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getLastMonitoringExecutionSummary() == null) ? 0 : getLastMonitoringExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringSchedule clone() {
        try {
            return (MonitoringSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
