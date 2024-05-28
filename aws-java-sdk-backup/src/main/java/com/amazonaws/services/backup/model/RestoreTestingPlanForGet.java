/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This contains metadata about a restore testing plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreTestingPlanForGet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingPlanForGet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * This identifies the request and allows failed requests to be retried without the risk of running the operation
     * twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup plan, that plan is
     * returned. This parameter is optional.
     * </p>
     * <p>
     * If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The last time a restore test was run with the specified restore testing plan. A date and time, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastExecutionTime;
    /**
     * <p>
     * The date and time that the restore testing plan was updated. This update is in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The specified criteria to assign a set of resources, such as recovery point types or backup vaults.
     * </p>
     */
    private RestoreTestingRecoveryPointSelection recoveryPointSelection;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * </p>
     */
    private String restoreTestingPlanArn;
    /**
     * <p>
     * This is the restore testing plan name.
     * </p>
     */
    private String restoreTestingPlanName;
    /**
     * <p>
     * A CRON expression in specified timezone when a restore testing plan is executed.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * Optional. This is the timezone in which the schedule expression is set. By default, ScheduleExpressions are in
     * UTC. You can modify this to a specified timezone.
     * </p>
     */
    private String scheduleExpressionTimezone;
    /**
     * <p>
     * Defaults to 24 hours.
     * </p>
     * <p>
     * A value in hours after a restore test is scheduled before a job will be canceled if it doesn't start
     * successfully. This value is optional. If this value is included, this parameter has a maximum value of 168 hours
     * (one week).
     * </p>
     */
    private Integer startWindowHours;

    /**
     * <p>
     * The date and time that a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a restore testing plan was created, in Unix format and Coordinated Universal Time
     *        (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a restore testing plan was created, in Unix format and Coordinated Universal Time
     *         (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     *         1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that a restore testing plan was created, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a restore testing plan was created, in Unix format and Coordinated Universal Time
     *        (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * This identifies the request and allows failed requests to be retried without the risk of running the operation
     * twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup plan, that plan is
     * returned. This parameter is optional.
     * </p>
     * <p>
     * If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This identifies the request and allows failed requests to be retried without the risk of running the
     *        operation twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup
     *        plan, that plan is returned. This parameter is optional.</p>
     *        <p>
     *        If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * This identifies the request and allows failed requests to be retried without the risk of running the operation
     * twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup plan, that plan is
     * returned. This parameter is optional.
     * </p>
     * <p>
     * If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @return This identifies the request and allows failed requests to be retried without the risk of running the
     *         operation twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup
     *         plan, that plan is returned. This parameter is optional.</p>
     *         <p>
     *         If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * This identifies the request and allows failed requests to be retried without the risk of running the operation
     * twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup plan, that plan is
     * returned. This parameter is optional.
     * </p>
     * <p>
     * If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This identifies the request and allows failed requests to be retried without the risk of running the
     *        operation twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup
     *        plan, that plan is returned. This parameter is optional.</p>
     *        <p>
     *        If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The last time a restore test was run with the specified restore testing plan. A date and time, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastExecutionTime
     *        The last time a restore test was run with the specified restore testing plan. A date and time, in Unix
     *        format and Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to
     *        milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastExecutionTime(java.util.Date lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    /**
     * <p>
     * The last time a restore test was run with the specified restore testing plan. A date and time, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The last time a restore test was run with the specified restore testing plan. A date and time, in Unix
     *         format and Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to
     *         milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getLastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * <p>
     * The last time a restore test was run with the specified restore testing plan. A date and time, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastExecutionTime
     *        The last time a restore test was run with the specified restore testing plan. A date and time, in Unix
     *        format and Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to
     *        milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withLastExecutionTime(java.util.Date lastExecutionTime) {
        setLastExecutionTime(lastExecutionTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the restore testing plan was updated. This update is in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time that the restore testing plan was updated. This update is in Unix format and Coordinated
     *        Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example,
     *        the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The date and time that the restore testing plan was updated. This update is in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that the restore testing plan was updated. This update is in Unix format and
     *         Coordinated Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds.
     *         For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The date and time that the restore testing plan was updated. This update is in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time that the restore testing plan was updated. This update is in Unix format and Coordinated
     *        Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example,
     *        the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The specified criteria to assign a set of resources, such as recovery point types or backup vaults.
     * </p>
     * 
     * @param recoveryPointSelection
     *        The specified criteria to assign a set of resources, such as recovery point types or backup vaults.
     */

    public void setRecoveryPointSelection(RestoreTestingRecoveryPointSelection recoveryPointSelection) {
        this.recoveryPointSelection = recoveryPointSelection;
    }

    /**
     * <p>
     * The specified criteria to assign a set of resources, such as recovery point types or backup vaults.
     * </p>
     * 
     * @return The specified criteria to assign a set of resources, such as recovery point types or backup vaults.
     */

    public RestoreTestingRecoveryPointSelection getRecoveryPointSelection() {
        return this.recoveryPointSelection;
    }

    /**
     * <p>
     * The specified criteria to assign a set of resources, such as recovery point types or backup vaults.
     * </p>
     * 
     * @param recoveryPointSelection
     *        The specified criteria to assign a set of resources, such as recovery point types or backup vaults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withRecoveryPointSelection(RestoreTestingRecoveryPointSelection recoveryPointSelection) {
        setRecoveryPointSelection(recoveryPointSelection);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     */

    public void setRestoreTestingPlanArn(String restoreTestingPlanArn) {
        this.restoreTestingPlanArn = restoreTestingPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     */

    public String getRestoreTestingPlanArn() {
        return this.restoreTestingPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withRestoreTestingPlanArn(String restoreTestingPlanArn) {
        setRestoreTestingPlanArn(restoreTestingPlanArn);
        return this;
    }

    /**
     * <p>
     * This is the restore testing plan name.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        This is the restore testing plan name.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * This is the restore testing plan name.
     * </p>
     * 
     * @return This is the restore testing plan name.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * This is the restore testing plan name.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        This is the restore testing plan name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
        return this;
    }

    /**
     * <p>
     * A CRON expression in specified timezone when a restore testing plan is executed.
     * </p>
     * 
     * @param scheduleExpression
     *        A CRON expression in specified timezone when a restore testing plan is executed.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A CRON expression in specified timezone when a restore testing plan is executed.
     * </p>
     * 
     * @return A CRON expression in specified timezone when a restore testing plan is executed.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A CRON expression in specified timezone when a restore testing plan is executed.
     * </p>
     * 
     * @param scheduleExpression
     *        A CRON expression in specified timezone when a restore testing plan is executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * Optional. This is the timezone in which the schedule expression is set. By default, ScheduleExpressions are in
     * UTC. You can modify this to a specified timezone.
     * </p>
     * 
     * @param scheduleExpressionTimezone
     *        Optional. This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
     *        are in UTC. You can modify this to a specified timezone.
     */

    public void setScheduleExpressionTimezone(String scheduleExpressionTimezone) {
        this.scheduleExpressionTimezone = scheduleExpressionTimezone;
    }

    /**
     * <p>
     * Optional. This is the timezone in which the schedule expression is set. By default, ScheduleExpressions are in
     * UTC. You can modify this to a specified timezone.
     * </p>
     * 
     * @return Optional. This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
     *         are in UTC. You can modify this to a specified timezone.
     */

    public String getScheduleExpressionTimezone() {
        return this.scheduleExpressionTimezone;
    }

    /**
     * <p>
     * Optional. This is the timezone in which the schedule expression is set. By default, ScheduleExpressions are in
     * UTC. You can modify this to a specified timezone.
     * </p>
     * 
     * @param scheduleExpressionTimezone
     *        Optional. This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
     *        are in UTC. You can modify this to a specified timezone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withScheduleExpressionTimezone(String scheduleExpressionTimezone) {
        setScheduleExpressionTimezone(scheduleExpressionTimezone);
        return this;
    }

    /**
     * <p>
     * Defaults to 24 hours.
     * </p>
     * <p>
     * A value in hours after a restore test is scheduled before a job will be canceled if it doesn't start
     * successfully. This value is optional. If this value is included, this parameter has a maximum value of 168 hours
     * (one week).
     * </p>
     * 
     * @param startWindowHours
     *        Defaults to 24 hours.</p>
     *        <p>
     *        A value in hours after a restore test is scheduled before a job will be canceled if it doesn't start
     *        successfully. This value is optional. If this value is included, this parameter has a maximum value of 168
     *        hours (one week).
     */

    public void setStartWindowHours(Integer startWindowHours) {
        this.startWindowHours = startWindowHours;
    }

    /**
     * <p>
     * Defaults to 24 hours.
     * </p>
     * <p>
     * A value in hours after a restore test is scheduled before a job will be canceled if it doesn't start
     * successfully. This value is optional. If this value is included, this parameter has a maximum value of 168 hours
     * (one week).
     * </p>
     * 
     * @return Defaults to 24 hours.</p>
     *         <p>
     *         A value in hours after a restore test is scheduled before a job will be canceled if it doesn't start
     *         successfully. This value is optional. If this value is included, this parameter has a maximum value of
     *         168 hours (one week).
     */

    public Integer getStartWindowHours() {
        return this.startWindowHours;
    }

    /**
     * <p>
     * Defaults to 24 hours.
     * </p>
     * <p>
     * A value in hours after a restore test is scheduled before a job will be canceled if it doesn't start
     * successfully. This value is optional. If this value is included, this parameter has a maximum value of 168 hours
     * (one week).
     * </p>
     * 
     * @param startWindowHours
     *        Defaults to 24 hours.</p>
     *        <p>
     *        A value in hours after a restore test is scheduled before a job will be canceled if it doesn't start
     *        successfully. This value is optional. If this value is included, this parameter has a maximum value of 168
     *        hours (one week).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForGet withStartWindowHours(Integer startWindowHours) {
        setStartWindowHours(startWindowHours);
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getLastExecutionTime() != null)
            sb.append("LastExecutionTime: ").append(getLastExecutionTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getRecoveryPointSelection() != null)
            sb.append("RecoveryPointSelection: ").append(getRecoveryPointSelection()).append(",");
        if (getRestoreTestingPlanArn() != null)
            sb.append("RestoreTestingPlanArn: ").append(getRestoreTestingPlanArn()).append(",");
        if (getRestoreTestingPlanName() != null)
            sb.append("RestoreTestingPlanName: ").append(getRestoreTestingPlanName()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getScheduleExpressionTimezone() != null)
            sb.append("ScheduleExpressionTimezone: ").append(getScheduleExpressionTimezone()).append(",");
        if (getStartWindowHours() != null)
            sb.append("StartWindowHours: ").append(getStartWindowHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTestingPlanForGet == false)
            return false;
        RestoreTestingPlanForGet other = (RestoreTestingPlanForGet) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getLastExecutionTime() == null ^ this.getLastExecutionTime() == null)
            return false;
        if (other.getLastExecutionTime() != null && other.getLastExecutionTime().equals(this.getLastExecutionTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getRecoveryPointSelection() == null ^ this.getRecoveryPointSelection() == null)
            return false;
        if (other.getRecoveryPointSelection() != null && other.getRecoveryPointSelection().equals(this.getRecoveryPointSelection()) == false)
            return false;
        if (other.getRestoreTestingPlanArn() == null ^ this.getRestoreTestingPlanArn() == null)
            return false;
        if (other.getRestoreTestingPlanArn() != null && other.getRestoreTestingPlanArn().equals(this.getRestoreTestingPlanArn()) == false)
            return false;
        if (other.getRestoreTestingPlanName() == null ^ this.getRestoreTestingPlanName() == null)
            return false;
        if (other.getRestoreTestingPlanName() != null && other.getRestoreTestingPlanName().equals(this.getRestoreTestingPlanName()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getScheduleExpressionTimezone() == null ^ this.getScheduleExpressionTimezone() == null)
            return false;
        if (other.getScheduleExpressionTimezone() != null && other.getScheduleExpressionTimezone().equals(this.getScheduleExpressionTimezone()) == false)
            return false;
        if (other.getStartWindowHours() == null ^ this.getStartWindowHours() == null)
            return false;
        if (other.getStartWindowHours() != null && other.getStartWindowHours().equals(this.getStartWindowHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getLastExecutionTime() == null) ? 0 : getLastExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointSelection() == null) ? 0 : getRecoveryPointSelection().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanArn() == null) ? 0 : getRestoreTestingPlanArn().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanName() == null) ? 0 : getRestoreTestingPlanName().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpressionTimezone() == null) ? 0 : getScheduleExpressionTimezone().hashCode());
        hashCode = prime * hashCode + ((getStartWindowHours() == null) ? 0 : getStartWindowHours().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTestingPlanForGet clone() {
        try {
            return (RestoreTestingPlanForGet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreTestingPlanForGetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
