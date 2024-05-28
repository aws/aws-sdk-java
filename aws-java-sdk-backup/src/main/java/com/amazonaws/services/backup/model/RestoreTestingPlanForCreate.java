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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreTestingPlanForCreate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingPlanForCreate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Required: Algorithm; Required: Recovery point types; IncludeVaults (one or more). Optional: SelectionWindowDays
     * ('30' if not specified); ExcludeVaults (list of selectors), defaults to empty list if not listed.
     * </p>
     */
    private RestoreTestingRecoveryPointSelection recoveryPointSelection;
    /**
     * <p>
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan. This cannot be
     * changed after creation, and it must consist of only alphanumeric characters and underscores.
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
     * Required: Algorithm; Required: Recovery point types; IncludeVaults (one or more). Optional: SelectionWindowDays
     * ('30' if not specified); ExcludeVaults (list of selectors), defaults to empty list if not listed.
     * </p>
     * 
     * @param recoveryPointSelection
     *        Required: Algorithm; Required: Recovery point types; IncludeVaults (one or more). Optional:
     *        SelectionWindowDays ('30' if not specified); ExcludeVaults (list of selectors), defaults to empty list if
     *        not listed.
     */

    public void setRecoveryPointSelection(RestoreTestingRecoveryPointSelection recoveryPointSelection) {
        this.recoveryPointSelection = recoveryPointSelection;
    }

    /**
     * <p>
     * Required: Algorithm; Required: Recovery point types; IncludeVaults (one or more). Optional: SelectionWindowDays
     * ('30' if not specified); ExcludeVaults (list of selectors), defaults to empty list if not listed.
     * </p>
     * 
     * @return Required: Algorithm; Required: Recovery point types; IncludeVaults (one or more). Optional:
     *         SelectionWindowDays ('30' if not specified); ExcludeVaults (list of selectors), defaults to empty list if
     *         not listed.
     */

    public RestoreTestingRecoveryPointSelection getRecoveryPointSelection() {
        return this.recoveryPointSelection;
    }

    /**
     * <p>
     * Required: Algorithm; Required: Recovery point types; IncludeVaults (one or more). Optional: SelectionWindowDays
     * ('30' if not specified); ExcludeVaults (list of selectors), defaults to empty list if not listed.
     * </p>
     * 
     * @param recoveryPointSelection
     *        Required: Algorithm; Required: Recovery point types; IncludeVaults (one or more). Optional:
     *        SelectionWindowDays ('30' if not specified); ExcludeVaults (list of selectors), defaults to empty list if
     *        not listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForCreate withRecoveryPointSelection(RestoreTestingRecoveryPointSelection recoveryPointSelection) {
        setRecoveryPointSelection(recoveryPointSelection);
        return this;
    }

    /**
     * <p>
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan. This cannot be
     * changed after creation, and it must consist of only alphanumeric characters and underscores.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        The RestoreTestingPlanName is a unique string that is the name of the restore testing plan. This cannot be
     *        changed after creation, and it must consist of only alphanumeric characters and underscores.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan. This cannot be
     * changed after creation, and it must consist of only alphanumeric characters and underscores.
     * </p>
     * 
     * @return The RestoreTestingPlanName is a unique string that is the name of the restore testing plan. This cannot
     *         be changed after creation, and it must consist of only alphanumeric characters and underscores.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan. This cannot be
     * changed after creation, and it must consist of only alphanumeric characters and underscores.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        The RestoreTestingPlanName is a unique string that is the name of the restore testing plan. This cannot be
     *        changed after creation, and it must consist of only alphanumeric characters and underscores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingPlanForCreate withRestoreTestingPlanName(String restoreTestingPlanName) {
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

    public RestoreTestingPlanForCreate withScheduleExpression(String scheduleExpression) {
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

    public RestoreTestingPlanForCreate withScheduleExpressionTimezone(String scheduleExpressionTimezone) {
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

    public RestoreTestingPlanForCreate withStartWindowHours(Integer startWindowHours) {
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
        if (getRecoveryPointSelection() != null)
            sb.append("RecoveryPointSelection: ").append(getRecoveryPointSelection()).append(",");
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

        if (obj instanceof RestoreTestingPlanForCreate == false)
            return false;
        RestoreTestingPlanForCreate other = (RestoreTestingPlanForCreate) obj;
        if (other.getRecoveryPointSelection() == null ^ this.getRecoveryPointSelection() == null)
            return false;
        if (other.getRecoveryPointSelection() != null && other.getRecoveryPointSelection().equals(this.getRecoveryPointSelection()) == false)
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

        hashCode = prime * hashCode + ((getRecoveryPointSelection() == null) ? 0 : getRecoveryPointSelection().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanName() == null) ? 0 : getRestoreTestingPlanName().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpressionTimezone() == null) ? 0 : getScheduleExpressionTimezone().hashCode());
        hashCode = prime * hashCode + ((getStartWindowHours() == null) ? 0 : getStartWindowHours().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTestingPlanForCreate clone() {
        try {
            return (RestoreTestingPlanForCreate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreTestingPlanForCreateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
