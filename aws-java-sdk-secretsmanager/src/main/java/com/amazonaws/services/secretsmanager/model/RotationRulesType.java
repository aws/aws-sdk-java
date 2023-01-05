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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines the rotation configuration for the secret.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RotationRulesType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RotationRulesType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of days between automatic scheduled rotations of the secret. You can use this value to check that your
     * secret meets your compliance guidelines for how often secrets must be rotated.
     * </p>
     * <p>
     * In <code>DescribeSecret</code> and <code>ListSecrets</code>, this value is calculated from the rotation schedule
     * after every successful rotation. In <code>RotateSecret</code>, you can set the rotation schedule in
     * <code>RotationRules</code> with <code>AutomaticallyAfterDays</code> or <code>ScheduleExpression</code>, but not
     * both. To set a rotation schedule in hours, use <code>ScheduleExpression</code>.
     * </p>
     */
    private Long automaticallyAfterDays;
    /**
     * <p>
     * The length of the rotation window in hours, for example <code>3h</code> for a three hour window. Secrets Manager
     * rotates your secret at any time during this window. The window must not extend into the next rotation window or
     * the next UTC day. The window starts according to the <code>ScheduleExpression</code>. If you don't specify a
     * <code>Duration</code>, for a <code>ScheduleExpression</code> in hours, the window automatically closes after one
     * hour. For a <code>ScheduleExpression</code> in days, the window automatically closes at the end of the UTC day.
     * For more information, including examples, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     * expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>.
     * </p>
     */
    private String duration;
    /**
     * <p>
     * A <code>cron()</code> or <code>rate()</code> expression that defines the schedule for rotating your secret.
     * Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret any time during a
     * rotation window.
     * </p>
     * <p>
     * Secrets Manager <code>rate()</code> expressions represent the interval in hours or days that you want to rotate
     * your secret, for example <code>rate(12 hours)</code> or <code>rate(10 days)</code>. You can rotate a secret as
     * often as every four hours. If you use a <code>rate()</code> expression, the rotation window starts at midnight.
     * For a rate in hours, the default rotation window closes after one hour. For a rate in days, the default rotation
     * window closes at the end of the day. You can set the <code>Duration</code> to change the rotation window. The
     * rotation window must not extend into the next UTC day or into the next rotation window.
     * </p>
     * <p>
     * You can use a <code>cron()</code> expression to create a rotation schedule that is more detailed than a rotation
     * interval. For more information, including examples, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     * expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>. For a cron expression that
     * represents a schedule in hours, the default rotation window closes after one hour. For a cron expression that
     * represents a schedule in days, the default rotation window closes at the end of the day. You can set the
     * <code>Duration</code> to change the rotation window. The rotation window must not extend into the next UTC day or
     * into the next rotation window.
     * </p>
     */
    private String scheduleExpression;

    /**
     * <p>
     * The number of days between automatic scheduled rotations of the secret. You can use this value to check that your
     * secret meets your compliance guidelines for how often secrets must be rotated.
     * </p>
     * <p>
     * In <code>DescribeSecret</code> and <code>ListSecrets</code>, this value is calculated from the rotation schedule
     * after every successful rotation. In <code>RotateSecret</code>, you can set the rotation schedule in
     * <code>RotationRules</code> with <code>AutomaticallyAfterDays</code> or <code>ScheduleExpression</code>, but not
     * both. To set a rotation schedule in hours, use <code>ScheduleExpression</code>.
     * </p>
     * 
     * @param automaticallyAfterDays
     *        The number of days between automatic scheduled rotations of the secret. You can use this value to check
     *        that your secret meets your compliance guidelines for how often secrets must be rotated.</p>
     *        <p>
     *        In <code>DescribeSecret</code> and <code>ListSecrets</code>, this value is calculated from the rotation
     *        schedule after every successful rotation. In <code>RotateSecret</code>, you can set the rotation schedule
     *        in <code>RotationRules</code> with <code>AutomaticallyAfterDays</code> or <code>ScheduleExpression</code>,
     *        but not both. To set a rotation schedule in hours, use <code>ScheduleExpression</code>.
     */

    public void setAutomaticallyAfterDays(Long automaticallyAfterDays) {
        this.automaticallyAfterDays = automaticallyAfterDays;
    }

    /**
     * <p>
     * The number of days between automatic scheduled rotations of the secret. You can use this value to check that your
     * secret meets your compliance guidelines for how often secrets must be rotated.
     * </p>
     * <p>
     * In <code>DescribeSecret</code> and <code>ListSecrets</code>, this value is calculated from the rotation schedule
     * after every successful rotation. In <code>RotateSecret</code>, you can set the rotation schedule in
     * <code>RotationRules</code> with <code>AutomaticallyAfterDays</code> or <code>ScheduleExpression</code>, but not
     * both. To set a rotation schedule in hours, use <code>ScheduleExpression</code>.
     * </p>
     * 
     * @return The number of days between automatic scheduled rotations of the secret. You can use this value to check
     *         that your secret meets your compliance guidelines for how often secrets must be rotated.</p>
     *         <p>
     *         In <code>DescribeSecret</code> and <code>ListSecrets</code>, this value is calculated from the rotation
     *         schedule after every successful rotation. In <code>RotateSecret</code>, you can set the rotation schedule
     *         in <code>RotationRules</code> with <code>AutomaticallyAfterDays</code> or <code>ScheduleExpression</code>
     *         , but not both. To set a rotation schedule in hours, use <code>ScheduleExpression</code>.
     */

    public Long getAutomaticallyAfterDays() {
        return this.automaticallyAfterDays;
    }

    /**
     * <p>
     * The number of days between automatic scheduled rotations of the secret. You can use this value to check that your
     * secret meets your compliance guidelines for how often secrets must be rotated.
     * </p>
     * <p>
     * In <code>DescribeSecret</code> and <code>ListSecrets</code>, this value is calculated from the rotation schedule
     * after every successful rotation. In <code>RotateSecret</code>, you can set the rotation schedule in
     * <code>RotationRules</code> with <code>AutomaticallyAfterDays</code> or <code>ScheduleExpression</code>, but not
     * both. To set a rotation schedule in hours, use <code>ScheduleExpression</code>.
     * </p>
     * 
     * @param automaticallyAfterDays
     *        The number of days between automatic scheduled rotations of the secret. You can use this value to check
     *        that your secret meets your compliance guidelines for how often secrets must be rotated.</p>
     *        <p>
     *        In <code>DescribeSecret</code> and <code>ListSecrets</code>, this value is calculated from the rotation
     *        schedule after every successful rotation. In <code>RotateSecret</code>, you can set the rotation schedule
     *        in <code>RotationRules</code> with <code>AutomaticallyAfterDays</code> or <code>ScheduleExpression</code>,
     *        but not both. To set a rotation schedule in hours, use <code>ScheduleExpression</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationRulesType withAutomaticallyAfterDays(Long automaticallyAfterDays) {
        setAutomaticallyAfterDays(automaticallyAfterDays);
        return this;
    }

    /**
     * <p>
     * The length of the rotation window in hours, for example <code>3h</code> for a three hour window. Secrets Manager
     * rotates your secret at any time during this window. The window must not extend into the next rotation window or
     * the next UTC day. The window starts according to the <code>ScheduleExpression</code>. If you don't specify a
     * <code>Duration</code>, for a <code>ScheduleExpression</code> in hours, the window automatically closes after one
     * hour. For a <code>ScheduleExpression</code> in days, the window automatically closes at the end of the UTC day.
     * For more information, including examples, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     * expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>.
     * </p>
     * 
     * @param duration
     *        The length of the rotation window in hours, for example <code>3h</code> for a three hour window. Secrets
     *        Manager rotates your secret at any time during this window. The window must not extend into the next
     *        rotation window or the next UTC day. The window starts according to the <code>ScheduleExpression</code>.
     *        If you don't specify a <code>Duration</code>, for a <code>ScheduleExpression</code> in hours, the window
     *        automatically closes after one hour. For a <code>ScheduleExpression</code> in days, the window
     *        automatically closes at the end of the UTC day. For more information, including examples, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     *        expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>.
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The length of the rotation window in hours, for example <code>3h</code> for a three hour window. Secrets Manager
     * rotates your secret at any time during this window. The window must not extend into the next rotation window or
     * the next UTC day. The window starts according to the <code>ScheduleExpression</code>. If you don't specify a
     * <code>Duration</code>, for a <code>ScheduleExpression</code> in hours, the window automatically closes after one
     * hour. For a <code>ScheduleExpression</code> in days, the window automatically closes at the end of the UTC day.
     * For more information, including examples, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     * expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>.
     * </p>
     * 
     * @return The length of the rotation window in hours, for example <code>3h</code> for a three hour window. Secrets
     *         Manager rotates your secret at any time during this window. The window must not extend into the next
     *         rotation window or the next UTC day. The window starts according to the <code>ScheduleExpression</code>.
     *         If you don't specify a <code>Duration</code>, for a <code>ScheduleExpression</code> in hours, the window
     *         automatically closes after one hour. For a <code>ScheduleExpression</code> in days, the window
     *         automatically closes at the end of the UTC day. For more information, including examples, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     *         expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>.
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The length of the rotation window in hours, for example <code>3h</code> for a three hour window. Secrets Manager
     * rotates your secret at any time during this window. The window must not extend into the next rotation window or
     * the next UTC day. The window starts according to the <code>ScheduleExpression</code>. If you don't specify a
     * <code>Duration</code>, for a <code>ScheduleExpression</code> in hours, the window automatically closes after one
     * hour. For a <code>ScheduleExpression</code> in days, the window automatically closes at the end of the UTC day.
     * For more information, including examples, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     * expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>.
     * </p>
     * 
     * @param duration
     *        The length of the rotation window in hours, for example <code>3h</code> for a three hour window. Secrets
     *        Manager rotates your secret at any time during this window. The window must not extend into the next
     *        rotation window or the next UTC day. The window starts according to the <code>ScheduleExpression</code>.
     *        If you don't specify a <code>Duration</code>, for a <code>ScheduleExpression</code> in hours, the window
     *        automatically closes after one hour. For a <code>ScheduleExpression</code> in days, the window
     *        automatically closes at the end of the UTC day. For more information, including examples, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     *        expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationRulesType withDuration(String duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * A <code>cron()</code> or <code>rate()</code> expression that defines the schedule for rotating your secret.
     * Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret any time during a
     * rotation window.
     * </p>
     * <p>
     * Secrets Manager <code>rate()</code> expressions represent the interval in hours or days that you want to rotate
     * your secret, for example <code>rate(12 hours)</code> or <code>rate(10 days)</code>. You can rotate a secret as
     * often as every four hours. If you use a <code>rate()</code> expression, the rotation window starts at midnight.
     * For a rate in hours, the default rotation window closes after one hour. For a rate in days, the default rotation
     * window closes at the end of the day. You can set the <code>Duration</code> to change the rotation window. The
     * rotation window must not extend into the next UTC day or into the next rotation window.
     * </p>
     * <p>
     * You can use a <code>cron()</code> expression to create a rotation schedule that is more detailed than a rotation
     * interval. For more information, including examples, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     * expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>. For a cron expression that
     * represents a schedule in hours, the default rotation window closes after one hour. For a cron expression that
     * represents a schedule in days, the default rotation window closes at the end of the day. You can set the
     * <code>Duration</code> to change the rotation window. The rotation window must not extend into the next UTC day or
     * into the next rotation window.
     * </p>
     * 
     * @param scheduleExpression
     *        A <code>cron()</code> or <code>rate()</code> expression that defines the schedule for rotating your
     *        secret. Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret any time
     *        during a rotation window.</p>
     *        <p>
     *        Secrets Manager <code>rate()</code> expressions represent the interval in hours or days that you want to
     *        rotate your secret, for example <code>rate(12 hours)</code> or <code>rate(10 days)</code>. You can rotate
     *        a secret as often as every four hours. If you use a <code>rate()</code> expression, the rotation window
     *        starts at midnight. For a rate in hours, the default rotation window closes after one hour. For a rate in
     *        days, the default rotation window closes at the end of the day. You can set the <code>Duration</code> to
     *        change the rotation window. The rotation window must not extend into the next UTC day or into the next
     *        rotation window.
     *        </p>
     *        <p>
     *        You can use a <code>cron()</code> expression to create a rotation schedule that is more detailed than a
     *        rotation interval. For more information, including examples, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     *        expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>. For a cron
     *        expression that represents a schedule in hours, the default rotation window closes after one hour. For a
     *        cron expression that represents a schedule in days, the default rotation window closes at the end of the
     *        day. You can set the <code>Duration</code> to change the rotation window. The rotation window must not
     *        extend into the next UTC day or into the next rotation window.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A <code>cron()</code> or <code>rate()</code> expression that defines the schedule for rotating your secret.
     * Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret any time during a
     * rotation window.
     * </p>
     * <p>
     * Secrets Manager <code>rate()</code> expressions represent the interval in hours or days that you want to rotate
     * your secret, for example <code>rate(12 hours)</code> or <code>rate(10 days)</code>. You can rotate a secret as
     * often as every four hours. If you use a <code>rate()</code> expression, the rotation window starts at midnight.
     * For a rate in hours, the default rotation window closes after one hour. For a rate in days, the default rotation
     * window closes at the end of the day. You can set the <code>Duration</code> to change the rotation window. The
     * rotation window must not extend into the next UTC day or into the next rotation window.
     * </p>
     * <p>
     * You can use a <code>cron()</code> expression to create a rotation schedule that is more detailed than a rotation
     * interval. For more information, including examples, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     * expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>. For a cron expression that
     * represents a schedule in hours, the default rotation window closes after one hour. For a cron expression that
     * represents a schedule in days, the default rotation window closes at the end of the day. You can set the
     * <code>Duration</code> to change the rotation window. The rotation window must not extend into the next UTC day or
     * into the next rotation window.
     * </p>
     * 
     * @return A <code>cron()</code> or <code>rate()</code> expression that defines the schedule for rotating your
     *         secret. Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret any
     *         time during a rotation window.</p>
     *         <p>
     *         Secrets Manager <code>rate()</code> expressions represent the interval in hours or days that you want to
     *         rotate your secret, for example <code>rate(12 hours)</code> or <code>rate(10 days)</code>. You can rotate
     *         a secret as often as every four hours. If you use a <code>rate()</code> expression, the rotation window
     *         starts at midnight. For a rate in hours, the default rotation window closes after one hour. For a rate in
     *         days, the default rotation window closes at the end of the day. You can set the <code>Duration</code> to
     *         change the rotation window. The rotation window must not extend into the next UTC day or into the next
     *         rotation window.
     *         </p>
     *         <p>
     *         You can use a <code>cron()</code> expression to create a rotation schedule that is more detailed than a
     *         rotation interval. For more information, including examples, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     *         expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>. For a cron
     *         expression that represents a schedule in hours, the default rotation window closes after one hour. For a
     *         cron expression that represents a schedule in days, the default rotation window closes at the end of the
     *         day. You can set the <code>Duration</code> to change the rotation window. The rotation window must not
     *         extend into the next UTC day or into the next rotation window.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A <code>cron()</code> or <code>rate()</code> expression that defines the schedule for rotating your secret.
     * Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret any time during a
     * rotation window.
     * </p>
     * <p>
     * Secrets Manager <code>rate()</code> expressions represent the interval in hours or days that you want to rotate
     * your secret, for example <code>rate(12 hours)</code> or <code>rate(10 days)</code>. You can rotate a secret as
     * often as every four hours. If you use a <code>rate()</code> expression, the rotation window starts at midnight.
     * For a rate in hours, the default rotation window closes after one hour. For a rate in days, the default rotation
     * window closes at the end of the day. You can set the <code>Duration</code> to change the rotation window. The
     * rotation window must not extend into the next UTC day or into the next rotation window.
     * </p>
     * <p>
     * You can use a <code>cron()</code> expression to create a rotation schedule that is more detailed than a rotation
     * interval. For more information, including examples, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     * expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>. For a cron expression that
     * represents a schedule in hours, the default rotation window closes after one hour. For a cron expression that
     * represents a schedule in days, the default rotation window closes at the end of the day. You can set the
     * <code>Duration</code> to change the rotation window. The rotation window must not extend into the next UTC day or
     * into the next rotation window.
     * </p>
     * 
     * @param scheduleExpression
     *        A <code>cron()</code> or <code>rate()</code> expression that defines the schedule for rotating your
     *        secret. Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret any time
     *        during a rotation window.</p>
     *        <p>
     *        Secrets Manager <code>rate()</code> expressions represent the interval in hours or days that you want to
     *        rotate your secret, for example <code>rate(12 hours)</code> or <code>rate(10 days)</code>. You can rotate
     *        a secret as often as every four hours. If you use a <code>rate()</code> expression, the rotation window
     *        starts at midnight. For a rate in hours, the default rotation window closes after one hour. For a rate in
     *        days, the default rotation window closes at the end of the day. You can set the <code>Duration</code> to
     *        change the rotation window. The rotation window must not extend into the next UTC day or into the next
     *        rotation window.
     *        </p>
     *        <p>
     *        You can use a <code>cron()</code> expression to create a rotation schedule that is more detailed than a
     *        rotation interval. For more information, including examples, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html">Schedule
     *        expressions in Secrets Manager rotation</a> in the <i>Secrets Manager Users Guide</i>. For a cron
     *        expression that represents a schedule in hours, the default rotation window closes after one hour. For a
     *        cron expression that represents a schedule in days, the default rotation window closes at the end of the
     *        day. You can set the <code>Duration</code> to change the rotation window. The rotation window must not
     *        extend into the next UTC day or into the next rotation window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationRulesType withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
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
        if (getAutomaticallyAfterDays() != null)
            sb.append("AutomaticallyAfterDays: ").append(getAutomaticallyAfterDays()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RotationRulesType == false)
            return false;
        RotationRulesType other = (RotationRulesType) obj;
        if (other.getAutomaticallyAfterDays() == null ^ this.getAutomaticallyAfterDays() == null)
            return false;
        if (other.getAutomaticallyAfterDays() != null && other.getAutomaticallyAfterDays().equals(this.getAutomaticallyAfterDays()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomaticallyAfterDays() == null) ? 0 : getAutomaticallyAfterDays().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        return hashCode;
    }

    @Override
    public RotationRulesType clone() {
        try {
            return (RotationRulesType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.secretsmanager.model.transform.RotationRulesTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
