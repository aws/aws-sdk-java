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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutMaintenanceStartTime"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMaintenanceStartTimeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The day of the month start maintenance on a gateway.
     * </p>
     * <p>
     * Valid values range from <code>Sunday</code> to <code>Saturday</code>.
     * </p>
     */
    private Integer dayOfMonth;
    /**
     * <p>
     * The day of the week to start maintenance on a gateway.
     * </p>
     */
    private Integer dayOfWeek;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the gateway, used to specify its maintenance start time.
     * </p>
     */
    private String gatewayArn;
    /**
     * <p>
     * The hour of the day to start maintenance on a gateway.
     * </p>
     */
    private Integer hourOfDay;
    /**
     * <p>
     * The minute of the hour to start maintenance on a gateway.
     * </p>
     */
    private Integer minuteOfHour;

    /**
     * <p>
     * The day of the month start maintenance on a gateway.
     * </p>
     * <p>
     * Valid values range from <code>Sunday</code> to <code>Saturday</code>.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month start maintenance on a gateway.</p>
     *        <p>
     *        Valid values range from <code>Sunday</code> to <code>Saturday</code>.
     */

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month start maintenance on a gateway.
     * </p>
     * <p>
     * Valid values range from <code>Sunday</code> to <code>Saturday</code>.
     * </p>
     * 
     * @return The day of the month start maintenance on a gateway.</p>
     *         <p>
     *         Valid values range from <code>Sunday</code> to <code>Saturday</code>.
     */

    public Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * <p>
     * The day of the month start maintenance on a gateway.
     * </p>
     * <p>
     * Valid values range from <code>Sunday</code> to <code>Saturday</code>.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month start maintenance on a gateway.</p>
     *        <p>
     *        Valid values range from <code>Sunday</code> to <code>Saturday</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMaintenanceStartTimeRequest withDayOfMonth(Integer dayOfMonth) {
        setDayOfMonth(dayOfMonth);
        return this;
    }

    /**
     * <p>
     * The day of the week to start maintenance on a gateway.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week to start maintenance on a gateway.
     */

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The day of the week to start maintenance on a gateway.
     * </p>
     * 
     * @return The day of the week to start maintenance on a gateway.
     */

    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * The day of the week to start maintenance on a gateway.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week to start maintenance on a gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMaintenanceStartTimeRequest withDayOfWeek(Integer dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the gateway, used to specify its maintenance start time.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) for the gateway, used to specify its maintenance start time.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the gateway, used to specify its maintenance start time.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the gateway, used to specify its maintenance start time.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the gateway, used to specify its maintenance start time.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) for the gateway, used to specify its maintenance start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMaintenanceStartTimeRequest withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
        return this;
    }

    /**
     * <p>
     * The hour of the day to start maintenance on a gateway.
     * </p>
     * 
     * @param hourOfDay
     *        The hour of the day to start maintenance on a gateway.
     */

    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    /**
     * <p>
     * The hour of the day to start maintenance on a gateway.
     * </p>
     * 
     * @return The hour of the day to start maintenance on a gateway.
     */

    public Integer getHourOfDay() {
        return this.hourOfDay;
    }

    /**
     * <p>
     * The hour of the day to start maintenance on a gateway.
     * </p>
     * 
     * @param hourOfDay
     *        The hour of the day to start maintenance on a gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMaintenanceStartTimeRequest withHourOfDay(Integer hourOfDay) {
        setHourOfDay(hourOfDay);
        return this;
    }

    /**
     * <p>
     * The minute of the hour to start maintenance on a gateway.
     * </p>
     * 
     * @param minuteOfHour
     *        The minute of the hour to start maintenance on a gateway.
     */

    public void setMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
    }

    /**
     * <p>
     * The minute of the hour to start maintenance on a gateway.
     * </p>
     * 
     * @return The minute of the hour to start maintenance on a gateway.
     */

    public Integer getMinuteOfHour() {
        return this.minuteOfHour;
    }

    /**
     * <p>
     * The minute of the hour to start maintenance on a gateway.
     * </p>
     * 
     * @param minuteOfHour
     *        The minute of the hour to start maintenance on a gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMaintenanceStartTimeRequest withMinuteOfHour(Integer minuteOfHour) {
        setMinuteOfHour(minuteOfHour);
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
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: ").append(getDayOfMonth()).append(",");
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek()).append(",");
        if (getGatewayArn() != null)
            sb.append("GatewayArn: ").append(getGatewayArn()).append(",");
        if (getHourOfDay() != null)
            sb.append("HourOfDay: ").append(getHourOfDay()).append(",");
        if (getMinuteOfHour() != null)
            sb.append("MinuteOfHour: ").append(getMinuteOfHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMaintenanceStartTimeRequest == false)
            return false;
        PutMaintenanceStartTimeRequest other = (PutMaintenanceStartTimeRequest) obj;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        if (other.getHourOfDay() == null ^ this.getHourOfDay() == null)
            return false;
        if (other.getHourOfDay() != null && other.getHourOfDay().equals(this.getHourOfDay()) == false)
            return false;
        if (other.getMinuteOfHour() == null ^ this.getMinuteOfHour() == null)
            return false;
        if (other.getMinuteOfHour() != null && other.getMinuteOfHour().equals(this.getMinuteOfHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getHourOfDay() == null) ? 0 : getHourOfDay().hashCode());
        hashCode = prime * hashCode + ((getMinuteOfHour() == null) ? 0 : getMinuteOfHour().hashCode());
        return hashCode;
    }

    @Override
    public PutMaintenanceStartTimeRequest clone() {
        return (PutMaintenanceStartTimeRequest) super.clone();
    }

}
