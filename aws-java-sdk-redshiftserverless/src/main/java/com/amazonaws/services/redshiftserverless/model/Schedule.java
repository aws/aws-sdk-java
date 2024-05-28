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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The schedule of when Amazon Redshift Serverless should run the scheduled action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/Schedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when Amazon Redshift Serverless should run the scheduled action. Timestamp is in UTC. Format of
     * at expression is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     * </p>
     */
    private java.util.Date at;
    /**
     * <p>
     * The cron expression to use to schedule a recurring scheduled action. Schedule invocations must be separated by at
     * least one hour. Times are in UTC.
     * </p>
     * <p>
     * Format of cron expressions is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For example,
     * <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     */
    private String cron;

    /**
     * <p>
     * The timestamp of when Amazon Redshift Serverless should run the scheduled action. Timestamp is in UTC. Format of
     * at expression is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     * </p>
     * 
     * @param at
     *        The timestamp of when Amazon Redshift Serverless should run the scheduled action. Timestamp is in UTC.
     *        Format of at expression is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>
     *        .
     */

    public void setAt(java.util.Date at) {
        this.at = at;
    }

    /**
     * <p>
     * The timestamp of when Amazon Redshift Serverless should run the scheduled action. Timestamp is in UTC. Format of
     * at expression is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     * </p>
     * 
     * @return The timestamp of when Amazon Redshift Serverless should run the scheduled action. Timestamp is in UTC.
     *         Format of at expression is <code>yyyy-mm-ddThh:mm:ss</code>. For example,
     *         <code>2016-03-04T17:27:00</code>.
     */

    public java.util.Date getAt() {
        return this.at;
    }

    /**
     * <p>
     * The timestamp of when Amazon Redshift Serverless should run the scheduled action. Timestamp is in UTC. Format of
     * at expression is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     * </p>
     * 
     * @param at
     *        The timestamp of when Amazon Redshift Serverless should run the scheduled action. Timestamp is in UTC.
     *        Format of at expression is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withAt(java.util.Date at) {
        setAt(at);
        return this;
    }

    /**
     * <p>
     * The cron expression to use to schedule a recurring scheduled action. Schedule invocations must be separated by at
     * least one hour. Times are in UTC.
     * </p>
     * <p>
     * Format of cron expressions is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For example,
     * <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @param cron
     *        The cron expression to use to schedule a recurring scheduled action. Schedule invocations must be
     *        separated by at least one hour. Times are in UTC.</p>
     *        <p>
     *        Format of cron expressions is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For
     *        example, <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *        >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     */

    public void setCron(String cron) {
        this.cron = cron;
    }

    /**
     * <p>
     * The cron expression to use to schedule a recurring scheduled action. Schedule invocations must be separated by at
     * least one hour. Times are in UTC.
     * </p>
     * <p>
     * Format of cron expressions is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For example,
     * <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @return The cron expression to use to schedule a recurring scheduled action. Schedule invocations must be
     *         separated by at least one hour. Times are in UTC.</p>
     *         <p>
     *         Format of cron expressions is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For
     *         example, <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *         >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     */

    public String getCron() {
        return this.cron;
    }

    /**
     * <p>
     * The cron expression to use to schedule a recurring scheduled action. Schedule invocations must be separated by at
     * least one hour. Times are in UTC.
     * </p>
     * <p>
     * Format of cron expressions is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For example,
     * <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @param cron
     *        The cron expression to use to schedule a recurring scheduled action. Schedule invocations must be
     *        separated by at least one hour. Times are in UTC.</p>
     *        <p>
     *        Format of cron expressions is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For
     *        example, <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *        >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withCron(String cron) {
        setCron(cron);
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
        if (getAt() != null)
            sb.append("At: ").append(getAt()).append(",");
        if (getCron() != null)
            sb.append("Cron: ").append(getCron());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;
        if (other.getAt() == null ^ this.getAt() == null)
            return false;
        if (other.getAt() != null && other.getAt().equals(this.getAt()) == false)
            return false;
        if (other.getCron() == null ^ this.getCron() == null)
            return false;
        if (other.getCron() != null && other.getCron().equals(this.getCron()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAt() == null) ? 0 : getAt().hashCode());
        hashCode = prime * hashCode + ((getCron() == null) ? 0 : getCron().hashCode());
        return hashCode;
    }

    @Override
    public Schedule clone() {
        try {
            return (Schedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.ScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
