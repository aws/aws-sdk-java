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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration details about the monitoring schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ScheduleConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A cron expression that describes details about the monitoring schedule.
     * </p>
     * <p>
     * Currently the only supported cron expressions are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want to set the job to start every hour, please use the following:
     * </p>
     * <p>
     * <code>Hourly: cron(0 * ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want to start the job daily:
     * </p>
     * <p>
     * <code>cron(0 [00-23] ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, the following are valid cron expressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Daily at noon UTC: <code>cron(0 12 ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily at midnight UTC: <code>cron(0 0 ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To support running every 6, 12 hours, the following are also supported:
     * </p>
     * <p>
     * <code>cron(0 [00-23]/[01-24] ? * * *)</code>
     * </p>
     * <p>
     * For example, the following are valid cron expressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every 12 hours, starting at 5pm UTC: <code>cron(0 17/12 ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Every two hours starting at midnight: <code>cron(0 0/2 ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Even though the cron expression is set to start at 5PM UTC, note that there could be a delay of 0-20 minutes from
     * the actual requested time to run the execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that if you would like a daily schedule, you do not provide this parameter. Amazon SageMaker will
     * pick a time for running every day.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String scheduleExpression;

    /**
     * <p>
     * A cron expression that describes details about the monitoring schedule.
     * </p>
     * <p>
     * Currently the only supported cron expressions are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want to set the job to start every hour, please use the following:
     * </p>
     * <p>
     * <code>Hourly: cron(0 * ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want to start the job daily:
     * </p>
     * <p>
     * <code>cron(0 [00-23] ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, the following are valid cron expressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Daily at noon UTC: <code>cron(0 12 ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily at midnight UTC: <code>cron(0 0 ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To support running every 6, 12 hours, the following are also supported:
     * </p>
     * <p>
     * <code>cron(0 [00-23]/[01-24] ? * * *)</code>
     * </p>
     * <p>
     * For example, the following are valid cron expressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every 12 hours, starting at 5pm UTC: <code>cron(0 17/12 ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Every two hours starting at midnight: <code>cron(0 0/2 ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Even though the cron expression is set to start at 5PM UTC, note that there could be a delay of 0-20 minutes from
     * the actual requested time to run the execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that if you would like a daily schedule, you do not provide this parameter. Amazon SageMaker will
     * pick a time for running every day.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param scheduleExpression
     *        A cron expression that describes details about the monitoring schedule.</p>
     *        <p>
     *        Currently the only supported cron expressions are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you want to set the job to start every hour, please use the following:
     *        </p>
     *        <p>
     *        <code>Hourly: cron(0 * ? * * *)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want to start the job daily:
     *        </p>
     *        <p>
     *        <code>cron(0 [00-23] ? * * *)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, the following are valid cron expressions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Daily at noon UTC: <code>cron(0 12 ? * * *)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Daily at midnight UTC: <code>cron(0 0 ? * * *)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To support running every 6, 12 hours, the following are also supported:
     *        </p>
     *        <p>
     *        <code>cron(0 [00-23]/[01-24] ? * * *)</code>
     *        </p>
     *        <p>
     *        For example, the following are valid cron expressions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Every 12 hours, starting at 5pm UTC: <code>cron(0 17/12 ? * * *)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Every two hours starting at midnight: <code>cron(0 0/2 ? * * *)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        Even though the cron expression is set to start at 5PM UTC, note that there could be a delay of 0-20
     *        minutes from the actual requested time to run the execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        We recommend that if you would like a daily schedule, you do not provide this parameter. Amazon SageMaker
     *        will pick a time for running every day.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that describes details about the monitoring schedule.
     * </p>
     * <p>
     * Currently the only supported cron expressions are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want to set the job to start every hour, please use the following:
     * </p>
     * <p>
     * <code>Hourly: cron(0 * ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want to start the job daily:
     * </p>
     * <p>
     * <code>cron(0 [00-23] ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, the following are valid cron expressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Daily at noon UTC: <code>cron(0 12 ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily at midnight UTC: <code>cron(0 0 ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To support running every 6, 12 hours, the following are also supported:
     * </p>
     * <p>
     * <code>cron(0 [00-23]/[01-24] ? * * *)</code>
     * </p>
     * <p>
     * For example, the following are valid cron expressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every 12 hours, starting at 5pm UTC: <code>cron(0 17/12 ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Every two hours starting at midnight: <code>cron(0 0/2 ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Even though the cron expression is set to start at 5PM UTC, note that there could be a delay of 0-20 minutes from
     * the actual requested time to run the execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that if you would like a daily schedule, you do not provide this parameter. Amazon SageMaker will
     * pick a time for running every day.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return A cron expression that describes details about the monitoring schedule.</p>
     *         <p>
     *         Currently the only supported cron expressions are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you want to set the job to start every hour, please use the following:
     *         </p>
     *         <p>
     *         <code>Hourly: cron(0 * ? * * *)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want to start the job daily:
     *         </p>
     *         <p>
     *         <code>cron(0 [00-23] ? * * *)</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, the following are valid cron expressions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Daily at noon UTC: <code>cron(0 12 ? * * *)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Daily at midnight UTC: <code>cron(0 0 ? * * *)</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To support running every 6, 12 hours, the following are also supported:
     *         </p>
     *         <p>
     *         <code>cron(0 [00-23]/[01-24] ? * * *)</code>
     *         </p>
     *         <p>
     *         For example, the following are valid cron expressions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Every 12 hours, starting at 5pm UTC: <code>cron(0 17/12 ? * * *)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Every two hours starting at midnight: <code>cron(0 0/2 ? * * *)</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <ul>
     *         <li>
     *         <p>
     *         Even though the cron expression is set to start at 5PM UTC, note that there could be a delay of 0-20
     *         minutes from the actual requested time to run the execution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         We recommend that if you would like a daily schedule, you do not provide this parameter. Amazon SageMaker
     *         will pick a time for running every day.
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that describes details about the monitoring schedule.
     * </p>
     * <p>
     * Currently the only supported cron expressions are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want to set the job to start every hour, please use the following:
     * </p>
     * <p>
     * <code>Hourly: cron(0 * ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want to start the job daily:
     * </p>
     * <p>
     * <code>cron(0 [00-23] ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, the following are valid cron expressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Daily at noon UTC: <code>cron(0 12 ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily at midnight UTC: <code>cron(0 0 ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To support running every 6, 12 hours, the following are also supported:
     * </p>
     * <p>
     * <code>cron(0 [00-23]/[01-24] ? * * *)</code>
     * </p>
     * <p>
     * For example, the following are valid cron expressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every 12 hours, starting at 5pm UTC: <code>cron(0 17/12 ? * * *)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Every two hours starting at midnight: <code>cron(0 0/2 ? * * *)</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Even though the cron expression is set to start at 5PM UTC, note that there could be a delay of 0-20 minutes from
     * the actual requested time to run the execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that if you would like a daily schedule, you do not provide this parameter. Amazon SageMaker will
     * pick a time for running every day.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param scheduleExpression
     *        A cron expression that describes details about the monitoring schedule.</p>
     *        <p>
     *        Currently the only supported cron expressions are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you want to set the job to start every hour, please use the following:
     *        </p>
     *        <p>
     *        <code>Hourly: cron(0 * ? * * *)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want to start the job daily:
     *        </p>
     *        <p>
     *        <code>cron(0 [00-23] ? * * *)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, the following are valid cron expressions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Daily at noon UTC: <code>cron(0 12 ? * * *)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Daily at midnight UTC: <code>cron(0 0 ? * * *)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To support running every 6, 12 hours, the following are also supported:
     *        </p>
     *        <p>
     *        <code>cron(0 [00-23]/[01-24] ? * * *)</code>
     *        </p>
     *        <p>
     *        For example, the following are valid cron expressions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Every 12 hours, starting at 5pm UTC: <code>cron(0 17/12 ? * * *)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Every two hours starting at midnight: <code>cron(0 0/2 ? * * *)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        Even though the cron expression is set to start at 5PM UTC, note that there could be a delay of 0-20
     *        minutes from the actual requested time to run the execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        We recommend that if you would like a daily schedule, you do not provide this parameter. Amazon SageMaker
     *        will pick a time for running every day.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleConfig withScheduleExpression(String scheduleExpression) {
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

        if (obj instanceof ScheduleConfig == false)
            return false;
        ScheduleConfig other = (ScheduleConfig) obj;
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

        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleConfig clone() {
        try {
            return (ScheduleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ScheduleConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
