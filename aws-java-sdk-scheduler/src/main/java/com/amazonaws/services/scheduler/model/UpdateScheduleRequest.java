/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/UpdateSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description you specify for the schedule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date, in UTC, before which the schedule can invoke its target. Depending on the schedule's recurrence
     * expression, invocations might stop on, or before, the <code>EndDate</code> you specify. EventBridge Scheduler
     * ignores <code>EndDate</code> for one-time schedules.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
     * </p>
     */
    private FlexibleTimeWindow flexibleTimeWindow;
    /**
     * <p>
     * The name of the schedule group with which the schedule is associated. You must provide this value in order for
     * EventBridge Scheduler to find the schedule you want to update. If you omit this value, EventBridge Scheduler
     * assumes the group is associated to the default group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ARN for the customer managed KMS key that that you want EventBridge Scheduler to use to encrypt and decrypt
     * your data.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The name of the schedule that you are updating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The expression that defines when the schedule runs. The following formats are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>at</code> expression - <code>at(yyyy-mm-ddThh:mm:ss)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rate</code> expression - <code>rate(unit value)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cron</code> expression - <code>cron(fields)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use <code>at</code> expressions to create one-time schedules that invoke a target once, at the time and
     * in the time zone, that you specify. You can use <code>rate</code> and <code>cron</code> expressions to create
     * recurring schedules. Rate-based schedules are useful when you want to invoke a target at regular intervals, such
     * as every 15 minutes or every five days. Cron-based schedules are useful when you want to invoke a target
     * periodically at a specific time, such as at 8:00 am (UTC+0) every 1st day of the month.
     * </p>
     * <p>
     * A <code>cron</code> expression consists of six fields separated by white spaces:
     * <code>(minutes hours day_of_month month day_of_week year)</code>.
     * </p>
     * <p>
     * A <code>rate</code> expression consists of a <i>value</i> as a positive integer, and a <i>unit</i> with the
     * following options: <code>minute</code> | <code>minutes</code> | <code>hour</code> | <code>hours</code> |
     * <code>day</code> | <code>days</code>
     * </p>
     * <p>
     * For more information and examples, see <a
     * href="https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html">Schedule types on EventBridge
     * Scheduler</a> in the <i>EventBridge Scheduler User Guide</i>.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The timezone in which the scheduling expression is evaluated.
     * </p>
     */
    private String scheduleExpressionTimezone;
    /**
     * <p>
     * The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule's recurrence
     * expression, invocations might occur on, or after, the <code>StartDate</code> you specify. EventBridge Scheduler
     * ignores <code>StartDate</code> for one-time schedules.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The schedule target. You can use this operation to change the target that your schedule invokes.
     * </p>
     */
    private Target target;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not
     *        specify a client token, EventBridge Scheduler uses a randomly generated token for the request to ensure
     *        idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not
     *         specify a client token, EventBridge Scheduler uses a randomly generated token for the request to ensure
     *         idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not
     *        specify a client token, EventBridge Scheduler uses a randomly generated token for the request to ensure
     *        idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description you specify for the schedule.
     * </p>
     * 
     * @param description
     *        The description you specify for the schedule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description you specify for the schedule.
     * </p>
     * 
     * @return The description you specify for the schedule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description you specify for the schedule.
     * </p>
     * 
     * @param description
     *        The description you specify for the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date, in UTC, before which the schedule can invoke its target. Depending on the schedule's recurrence
     * expression, invocations might stop on, or before, the <code>EndDate</code> you specify. EventBridge Scheduler
     * ignores <code>EndDate</code> for one-time schedules.
     * </p>
     * 
     * @param endDate
     *        The date, in UTC, before which the schedule can invoke its target. Depending on the schedule's recurrence
     *        expression, invocations might stop on, or before, the <code>EndDate</code> you specify. EventBridge
     *        Scheduler ignores <code>EndDate</code> for one-time schedules.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date, in UTC, before which the schedule can invoke its target. Depending on the schedule's recurrence
     * expression, invocations might stop on, or before, the <code>EndDate</code> you specify. EventBridge Scheduler
     * ignores <code>EndDate</code> for one-time schedules.
     * </p>
     * 
     * @return The date, in UTC, before which the schedule can invoke its target. Depending on the schedule's recurrence
     *         expression, invocations might stop on, or before, the <code>EndDate</code> you specify. EventBridge
     *         Scheduler ignores <code>EndDate</code> for one-time schedules.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date, in UTC, before which the schedule can invoke its target. Depending on the schedule's recurrence
     * expression, invocations might stop on, or before, the <code>EndDate</code> you specify. EventBridge Scheduler
     * ignores <code>EndDate</code> for one-time schedules.
     * </p>
     * 
     * @param endDate
     *        The date, in UTC, before which the schedule can invoke its target. Depending on the schedule's recurrence
     *        expression, invocations might stop on, or before, the <code>EndDate</code> you specify. EventBridge
     *        Scheduler ignores <code>EndDate</code> for one-time schedules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
     * </p>
     * 
     * @param flexibleTimeWindow
     *        Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
     */

    public void setFlexibleTimeWindow(FlexibleTimeWindow flexibleTimeWindow) {
        this.flexibleTimeWindow = flexibleTimeWindow;
    }

    /**
     * <p>
     * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
     * </p>
     * 
     * @return Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
     */

    public FlexibleTimeWindow getFlexibleTimeWindow() {
        return this.flexibleTimeWindow;
    }

    /**
     * <p>
     * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
     * </p>
     * 
     * @param flexibleTimeWindow
     *        Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withFlexibleTimeWindow(FlexibleTimeWindow flexibleTimeWindow) {
        setFlexibleTimeWindow(flexibleTimeWindow);
        return this;
    }

    /**
     * <p>
     * The name of the schedule group with which the schedule is associated. You must provide this value in order for
     * EventBridge Scheduler to find the schedule you want to update. If you omit this value, EventBridge Scheduler
     * assumes the group is associated to the default group.
     * </p>
     * 
     * @param groupName
     *        The name of the schedule group with which the schedule is associated. You must provide this value in order
     *        for EventBridge Scheduler to find the schedule you want to update. If you omit this value, EventBridge
     *        Scheduler assumes the group is associated to the default group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the schedule group with which the schedule is associated. You must provide this value in order for
     * EventBridge Scheduler to find the schedule you want to update. If you omit this value, EventBridge Scheduler
     * assumes the group is associated to the default group.
     * </p>
     * 
     * @return The name of the schedule group with which the schedule is associated. You must provide this value in
     *         order for EventBridge Scheduler to find the schedule you want to update. If you omit this value,
     *         EventBridge Scheduler assumes the group is associated to the default group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the schedule group with which the schedule is associated. You must provide this value in order for
     * EventBridge Scheduler to find the schedule you want to update. If you omit this value, EventBridge Scheduler
     * assumes the group is associated to the default group.
     * </p>
     * 
     * @param groupName
     *        The name of the schedule group with which the schedule is associated. You must provide this value in order
     *        for EventBridge Scheduler to find the schedule you want to update. If you omit this value, EventBridge
     *        Scheduler assumes the group is associated to the default group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ARN for the customer managed KMS key that that you want EventBridge Scheduler to use to encrypt and decrypt
     * your data.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN for the customer managed KMS key that that you want EventBridge Scheduler to use to encrypt and
     *        decrypt your data.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN for the customer managed KMS key that that you want EventBridge Scheduler to use to encrypt and decrypt
     * your data.
     * </p>
     * 
     * @return The ARN for the customer managed KMS key that that you want EventBridge Scheduler to use to encrypt and
     *         decrypt your data.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN for the customer managed KMS key that that you want EventBridge Scheduler to use to encrypt and decrypt
     * your data.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN for the customer managed KMS key that that you want EventBridge Scheduler to use to encrypt and
     *        decrypt your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The name of the schedule that you are updating.
     * </p>
     * 
     * @param name
     *        The name of the schedule that you are updating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schedule that you are updating.
     * </p>
     * 
     * @return The name of the schedule that you are updating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the schedule that you are updating.
     * </p>
     * 
     * @param name
     *        The name of the schedule that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The expression that defines when the schedule runs. The following formats are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>at</code> expression - <code>at(yyyy-mm-ddThh:mm:ss)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rate</code> expression - <code>rate(unit value)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cron</code> expression - <code>cron(fields)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use <code>at</code> expressions to create one-time schedules that invoke a target once, at the time and
     * in the time zone, that you specify. You can use <code>rate</code> and <code>cron</code> expressions to create
     * recurring schedules. Rate-based schedules are useful when you want to invoke a target at regular intervals, such
     * as every 15 minutes or every five days. Cron-based schedules are useful when you want to invoke a target
     * periodically at a specific time, such as at 8:00 am (UTC+0) every 1st day of the month.
     * </p>
     * <p>
     * A <code>cron</code> expression consists of six fields separated by white spaces:
     * <code>(minutes hours day_of_month month day_of_week year)</code>.
     * </p>
     * <p>
     * A <code>rate</code> expression consists of a <i>value</i> as a positive integer, and a <i>unit</i> with the
     * following options: <code>minute</code> | <code>minutes</code> | <code>hour</code> | <code>hours</code> |
     * <code>day</code> | <code>days</code>
     * </p>
     * <p>
     * For more information and examples, see <a
     * href="https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html">Schedule types on EventBridge
     * Scheduler</a> in the <i>EventBridge Scheduler User Guide</i>.
     * </p>
     * 
     * @param scheduleExpression
     *        The expression that defines when the schedule runs. The following formats are supported. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>at</code> expression - <code>at(yyyy-mm-ddThh:mm:ss)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rate</code> expression - <code>rate(unit value)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cron</code> expression - <code>cron(fields)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can use <code>at</code> expressions to create one-time schedules that invoke a target once, at the
     *        time and in the time zone, that you specify. You can use <code>rate</code> and <code>cron</code>
     *        expressions to create recurring schedules. Rate-based schedules are useful when you want to invoke a
     *        target at regular intervals, such as every 15 minutes or every five days. Cron-based schedules are useful
     *        when you want to invoke a target periodically at a specific time, such as at 8:00 am (UTC+0) every 1st day
     *        of the month.
     *        </p>
     *        <p>
     *        A <code>cron</code> expression consists of six fields separated by white spaces:
     *        <code>(minutes hours day_of_month month day_of_week year)</code>.
     *        </p>
     *        <p>
     *        A <code>rate</code> expression consists of a <i>value</i> as a positive integer, and a <i>unit</i> with
     *        the following options: <code>minute</code> | <code>minutes</code> | <code>hour</code> | <code>hours</code>
     *        | <code>day</code> | <code>days</code>
     *        </p>
     *        <p>
     *        For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html">Schedule types on
     *        EventBridge Scheduler</a> in the <i>EventBridge Scheduler User Guide</i>.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The expression that defines when the schedule runs. The following formats are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>at</code> expression - <code>at(yyyy-mm-ddThh:mm:ss)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rate</code> expression - <code>rate(unit value)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cron</code> expression - <code>cron(fields)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use <code>at</code> expressions to create one-time schedules that invoke a target once, at the time and
     * in the time zone, that you specify. You can use <code>rate</code> and <code>cron</code> expressions to create
     * recurring schedules. Rate-based schedules are useful when you want to invoke a target at regular intervals, such
     * as every 15 minutes or every five days. Cron-based schedules are useful when you want to invoke a target
     * periodically at a specific time, such as at 8:00 am (UTC+0) every 1st day of the month.
     * </p>
     * <p>
     * A <code>cron</code> expression consists of six fields separated by white spaces:
     * <code>(minutes hours day_of_month month day_of_week year)</code>.
     * </p>
     * <p>
     * A <code>rate</code> expression consists of a <i>value</i> as a positive integer, and a <i>unit</i> with the
     * following options: <code>minute</code> | <code>minutes</code> | <code>hour</code> | <code>hours</code> |
     * <code>day</code> | <code>days</code>
     * </p>
     * <p>
     * For more information and examples, see <a
     * href="https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html">Schedule types on EventBridge
     * Scheduler</a> in the <i>EventBridge Scheduler User Guide</i>.
     * </p>
     * 
     * @return The expression that defines when the schedule runs. The following formats are supported. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>at</code> expression - <code>at(yyyy-mm-ddThh:mm:ss)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rate</code> expression - <code>rate(unit value)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cron</code> expression - <code>cron(fields)</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can use <code>at</code> expressions to create one-time schedules that invoke a target once, at the
     *         time and in the time zone, that you specify. You can use <code>rate</code> and <code>cron</code>
     *         expressions to create recurring schedules. Rate-based schedules are useful when you want to invoke a
     *         target at regular intervals, such as every 15 minutes or every five days. Cron-based schedules are useful
     *         when you want to invoke a target periodically at a specific time, such as at 8:00 am (UTC+0) every 1st
     *         day of the month.
     *         </p>
     *         <p>
     *         A <code>cron</code> expression consists of six fields separated by white spaces:
     *         <code>(minutes hours day_of_month month day_of_week year)</code>.
     *         </p>
     *         <p>
     *         A <code>rate</code> expression consists of a <i>value</i> as a positive integer, and a <i>unit</i> with
     *         the following options: <code>minute</code> | <code>minutes</code> | <code>hour</code> |
     *         <code>hours</code> | <code>day</code> | <code>days</code>
     *         </p>
     *         <p>
     *         For more information and examples, see <a
     *         href="https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html">Schedule types on
     *         EventBridge Scheduler</a> in the <i>EventBridge Scheduler User Guide</i>.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The expression that defines when the schedule runs. The following formats are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>at</code> expression - <code>at(yyyy-mm-ddThh:mm:ss)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rate</code> expression - <code>rate(unit value)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cron</code> expression - <code>cron(fields)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use <code>at</code> expressions to create one-time schedules that invoke a target once, at the time and
     * in the time zone, that you specify. You can use <code>rate</code> and <code>cron</code> expressions to create
     * recurring schedules. Rate-based schedules are useful when you want to invoke a target at regular intervals, such
     * as every 15 minutes or every five days. Cron-based schedules are useful when you want to invoke a target
     * periodically at a specific time, such as at 8:00 am (UTC+0) every 1st day of the month.
     * </p>
     * <p>
     * A <code>cron</code> expression consists of six fields separated by white spaces:
     * <code>(minutes hours day_of_month month day_of_week year)</code>.
     * </p>
     * <p>
     * A <code>rate</code> expression consists of a <i>value</i> as a positive integer, and a <i>unit</i> with the
     * following options: <code>minute</code> | <code>minutes</code> | <code>hour</code> | <code>hours</code> |
     * <code>day</code> | <code>days</code>
     * </p>
     * <p>
     * For more information and examples, see <a
     * href="https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html">Schedule types on EventBridge
     * Scheduler</a> in the <i>EventBridge Scheduler User Guide</i>.
     * </p>
     * 
     * @param scheduleExpression
     *        The expression that defines when the schedule runs. The following formats are supported. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>at</code> expression - <code>at(yyyy-mm-ddThh:mm:ss)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rate</code> expression - <code>rate(unit value)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cron</code> expression - <code>cron(fields)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can use <code>at</code> expressions to create one-time schedules that invoke a target once, at the
     *        time and in the time zone, that you specify. You can use <code>rate</code> and <code>cron</code>
     *        expressions to create recurring schedules. Rate-based schedules are useful when you want to invoke a
     *        target at regular intervals, such as every 15 minutes or every five days. Cron-based schedules are useful
     *        when you want to invoke a target periodically at a specific time, such as at 8:00 am (UTC+0) every 1st day
     *        of the month.
     *        </p>
     *        <p>
     *        A <code>cron</code> expression consists of six fields separated by white spaces:
     *        <code>(minutes hours day_of_month month day_of_week year)</code>.
     *        </p>
     *        <p>
     *        A <code>rate</code> expression consists of a <i>value</i> as a positive integer, and a <i>unit</i> with
     *        the following options: <code>minute</code> | <code>minutes</code> | <code>hour</code> | <code>hours</code>
     *        | <code>day</code> | <code>days</code>
     *        </p>
     *        <p>
     *        For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html">Schedule types on
     *        EventBridge Scheduler</a> in the <i>EventBridge Scheduler User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The timezone in which the scheduling expression is evaluated.
     * </p>
     * 
     * @param scheduleExpressionTimezone
     *        The timezone in which the scheduling expression is evaluated.
     */

    public void setScheduleExpressionTimezone(String scheduleExpressionTimezone) {
        this.scheduleExpressionTimezone = scheduleExpressionTimezone;
    }

    /**
     * <p>
     * The timezone in which the scheduling expression is evaluated.
     * </p>
     * 
     * @return The timezone in which the scheduling expression is evaluated.
     */

    public String getScheduleExpressionTimezone() {
        return this.scheduleExpressionTimezone;
    }

    /**
     * <p>
     * The timezone in which the scheduling expression is evaluated.
     * </p>
     * 
     * @param scheduleExpressionTimezone
     *        The timezone in which the scheduling expression is evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withScheduleExpressionTimezone(String scheduleExpressionTimezone) {
        setScheduleExpressionTimezone(scheduleExpressionTimezone);
        return this;
    }

    /**
     * <p>
     * The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule's recurrence
     * expression, invocations might occur on, or after, the <code>StartDate</code> you specify. EventBridge Scheduler
     * ignores <code>StartDate</code> for one-time schedules.
     * </p>
     * 
     * @param startDate
     *        The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule's
     *        recurrence expression, invocations might occur on, or after, the <code>StartDate</code> you specify.
     *        EventBridge Scheduler ignores <code>StartDate</code> for one-time schedules.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule's recurrence
     * expression, invocations might occur on, or after, the <code>StartDate</code> you specify. EventBridge Scheduler
     * ignores <code>StartDate</code> for one-time schedules.
     * </p>
     * 
     * @return The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule's
     *         recurrence expression, invocations might occur on, or after, the <code>StartDate</code> you specify.
     *         EventBridge Scheduler ignores <code>StartDate</code> for one-time schedules.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule's recurrence
     * expression, invocations might occur on, or after, the <code>StartDate</code> you specify. EventBridge Scheduler
     * ignores <code>StartDate</code> for one-time schedules.
     * </p>
     * 
     * @param startDate
     *        The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule's
     *        recurrence expression, invocations might occur on, or after, the <code>StartDate</code> you specify.
     *        EventBridge Scheduler ignores <code>StartDate</code> for one-time schedules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Specifies whether the schedule is enabled or disabled.
     * @see ScheduleState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     * 
     * @return Specifies whether the schedule is enabled or disabled.
     * @see ScheduleState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Specifies whether the schedule is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleState
     */

    public UpdateScheduleRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Specifies whether the schedule is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleState
     */

    public UpdateScheduleRequest withState(ScheduleState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The schedule target. You can use this operation to change the target that your schedule invokes.
     * </p>
     * 
     * @param target
     *        The schedule target. You can use this operation to change the target that your schedule invokes.
     */

    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * <p>
     * The schedule target. You can use this operation to change the target that your schedule invokes.
     * </p>
     * 
     * @return The schedule target. You can use this operation to change the target that your schedule invokes.
     */

    public Target getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The schedule target. You can use this operation to change the target that your schedule invokes.
     * </p>
     * 
     * @param target
     *        The schedule target. You can use this operation to change the target that your schedule invokes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withTarget(Target target) {
        setTarget(target);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getFlexibleTimeWindow() != null)
            sb.append("FlexibleTimeWindow: ").append(getFlexibleTimeWindow()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getScheduleExpressionTimezone() != null)
            sb.append("ScheduleExpressionTimezone: ").append(getScheduleExpressionTimezone()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateScheduleRequest == false)
            return false;
        UpdateScheduleRequest other = (UpdateScheduleRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getFlexibleTimeWindow() == null ^ this.getFlexibleTimeWindow() == null)
            return false;
        if (other.getFlexibleTimeWindow() != null && other.getFlexibleTimeWindow().equals(this.getFlexibleTimeWindow()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getScheduleExpressionTimezone() == null ^ this.getScheduleExpressionTimezone() == null)
            return false;
        if (other.getScheduleExpressionTimezone() != null && other.getScheduleExpressionTimezone().equals(this.getScheduleExpressionTimezone()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getFlexibleTimeWindow() == null) ? 0 : getFlexibleTimeWindow().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpressionTimezone() == null) ? 0 : getScheduleExpressionTimezone().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScheduleRequest clone() {
        return (UpdateScheduleRequest) super.clone();
    }

}
