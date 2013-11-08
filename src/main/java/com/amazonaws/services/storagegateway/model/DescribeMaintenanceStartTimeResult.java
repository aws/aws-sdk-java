/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;


/**
 * Describe Maintenance Start Time Result
 */
public class DescribeMaintenanceStartTimeResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    private Integer hourOfDay;

    private Integer minuteOfHour;

    private Integer dayOfWeek;

    private String timezone;

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeMaintenanceStartTimeResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * Returns the value of the HourOfDay property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return The value of the HourOfDay property for this object.
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }
    
    /**
     * Sets the value of the HourOfDay property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hourOfDay The new value for the HourOfDay property for this object.
     */
    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }
    
    /**
     * Sets the value of the HourOfDay property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hourOfDay The new value for the HourOfDay property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeMaintenanceStartTimeResult withHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
        return this;
    }

    /**
     * Returns the value of the MinuteOfHour property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @return The value of the MinuteOfHour property for this object.
     */
    public Integer getMinuteOfHour() {
        return minuteOfHour;
    }
    
    /**
     * Sets the value of the MinuteOfHour property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minuteOfHour The new value for the MinuteOfHour property for this object.
     */
    public void setMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
    }
    
    /**
     * Sets the value of the MinuteOfHour property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minuteOfHour The new value for the MinuteOfHour property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeMaintenanceStartTimeResult withMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
        return this;
    }

    /**
     * Returns the value of the DayOfWeek property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @return The value of the DayOfWeek property for this object.
     */
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }
    
    /**
     * Sets the value of the DayOfWeek property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @param dayOfWeek The new value for the DayOfWeek property for this object.
     */
    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    
    /**
     * Sets the value of the DayOfWeek property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @param dayOfWeek The new value for the DayOfWeek property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeMaintenanceStartTimeResult withDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Returns the value of the Timezone property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @return The value of the Timezone property for this object.
     */
    public String getTimezone() {
        return timezone;
    }
    
    /**
     * Sets the value of the Timezone property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param timezone The new value for the Timezone property for this object.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    
    /**
     * Sets the value of the Timezone property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param timezone The new value for the Timezone property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeMaintenanceStartTimeResult withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGatewayARN() != null) sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getHourOfDay() != null) sb.append("HourOfDay: " + getHourOfDay() + ",");
        if (getMinuteOfHour() != null) sb.append("MinuteOfHour: " + getMinuteOfHour() + ",");
        if (getDayOfWeek() != null) sb.append("DayOfWeek: " + getDayOfWeek() + ",");
        if (getTimezone() != null) sb.append("Timezone: " + getTimezone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getHourOfDay() == null) ? 0 : getHourOfDay().hashCode()); 
        hashCode = prime * hashCode + ((getMinuteOfHour() == null) ? 0 : getMinuteOfHour().hashCode()); 
        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode()); 
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMaintenanceStartTimeResult == false) return false;
        DescribeMaintenanceStartTimeResult other = (DescribeMaintenanceStartTimeResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getHourOfDay() == null ^ this.getHourOfDay() == null) return false;
        if (other.getHourOfDay() != null && other.getHourOfDay().equals(this.getHourOfDay()) == false) return false; 
        if (other.getMinuteOfHour() == null ^ this.getMinuteOfHour() == null) return false;
        if (other.getMinuteOfHour() != null && other.getMinuteOfHour().equals(this.getMinuteOfHour()) == false) return false; 
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null) return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false) return false; 
        if (other.getTimezone() == null ^ this.getTimezone() == null) return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false) return false; 
        return true;
    }
    
}
    