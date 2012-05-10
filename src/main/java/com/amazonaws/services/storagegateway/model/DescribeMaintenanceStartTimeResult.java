/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> GatewayARN </li>
 * <li> DescribeMaintenanceStartTimeOutput$DayOfWeek </li>
 * <li> DescribeMaintenanceStartTimeOutput$HourOfDay </li>
 * <li> DescribeMaintenanceStartTimeOutput$MinuteOfHour </li>
 * <li> DescribeMaintenanceStartTimeOutput$Timezone </li>
 * 
 * </ul>
 */
public class DescribeMaintenanceStartTimeResult {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * A number between 0 and 23 that represents the hour of day. The hour of
     * day is in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer hourOfDay;

    /**
     * A number between 0 and 59 that represents the minute of hour. The
     * minute of hour is in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     */
    private Integer minuteOfHour;

    /**
     * An ordinal number between 0 and 6 that represents the day of the week,
     * where 0 represents Sunday and 6 represents Saturday. The day of week
     * is in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     */
    private Integer dayOfWeek;

    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * that is set for the gateway. The start time and day of week specified
     * should be in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     */
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
     * A number between 0 and 23 that represents the hour of day. The hour of
     * day is in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return A number between 0 and 23 that represents the hour of day. The hour of
     *         day is in the time zone of the gateway.
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }
    
    /**
     * A number between 0 and 23 that represents the hour of day. The hour of
     * day is in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hourOfDay A number between 0 and 23 that represents the hour of day. The hour of
     *         day is in the time zone of the gateway.
     */
    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }
    
    /**
     * A number between 0 and 23 that represents the hour of day. The hour of
     * day is in the time zone of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hourOfDay A number between 0 and 23 that represents the hour of day. The hour of
     *         day is in the time zone of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeMaintenanceStartTimeResult withHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
        return this;
    }
    
    
    /**
     * A number between 0 and 59 that represents the minute of hour. The
     * minute of hour is in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @return A number between 0 and 59 that represents the minute of hour. The
     *         minute of hour is in the time zone of the gateway.
     */
    public Integer getMinuteOfHour() {
        return minuteOfHour;
    }
    
    /**
     * A number between 0 and 59 that represents the minute of hour. The
     * minute of hour is in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minuteOfHour A number between 0 and 59 that represents the minute of hour. The
     *         minute of hour is in the time zone of the gateway.
     */
    public void setMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
    }
    
    /**
     * A number between 0 and 59 that represents the minute of hour. The
     * minute of hour is in the time zone of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minuteOfHour A number between 0 and 59 that represents the minute of hour. The
     *         minute of hour is in the time zone of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeMaintenanceStartTimeResult withMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
        return this;
    }
    
    
    /**
     * An ordinal number between 0 and 6 that represents the day of the week,
     * where 0 represents Sunday and 6 represents Saturday. The day of week
     * is in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @return An ordinal number between 0 and 6 that represents the day of the week,
     *         where 0 represents Sunday and 6 represents Saturday. The day of week
     *         is in the time zone of the gateway.
     */
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }
    
    /**
     * An ordinal number between 0 and 6 that represents the day of the week,
     * where 0 represents Sunday and 6 represents Saturday. The day of week
     * is in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @param dayOfWeek An ordinal number between 0 and 6 that represents the day of the week,
     *         where 0 represents Sunday and 6 represents Saturday. The day of week
     *         is in the time zone of the gateway.
     */
    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    
    /**
     * An ordinal number between 0 and 6 that represents the day of the week,
     * where 0 represents Sunday and 6 represents Saturday. The day of week
     * is in the time zone of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @param dayOfWeek An ordinal number between 0 and 6 that represents the day of the week,
     *         where 0 represents Sunday and 6 represents Saturday. The day of week
     *         is in the time zone of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeMaintenanceStartTimeResult withDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }
    
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * that is set for the gateway. The start time and day of week specified
     * should be in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @return One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         that is set for the gateway. The start time and day of week specified
     *         should be in the time zone of the gateway.
     *
     * @see GatewayTimezone
     */
    public String getTimezone() {
        return timezone;
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * that is set for the gateway. The start time and day of week specified
     * should be in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param timezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         that is set for the gateway. The start time and day of week specified
     *         should be in the time zone of the gateway.
     *
     * @see GatewayTimezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * that is set for the gateway. The start time and day of week specified
     * should be in the time zone of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param timezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         that is set for the gateway. The start time and day of week specified
     *         should be in the time zone of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayTimezone
     */
    public DescribeMaintenanceStartTimeResult withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * that is set for the gateway. The start time and day of week specified
     * should be in the time zone of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param timezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         that is set for the gateway. The start time and day of week specified
     *         should be in the time zone of the gateway.
     *
     * @see GatewayTimezone
     */
    public void setTimezone(GatewayTimezone timezone) {
        this.timezone = timezone.toString();
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * that is set for the gateway. The start time and day of week specified
     * should be in the time zone of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param timezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         that is set for the gateway. The start time and day of week specified
     *         should be in the time zone of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayTimezone
     */
    public DescribeMaintenanceStartTimeResult withTimezone(GatewayTimezone timezone) {
        this.timezone = timezone.toString();
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
        if (gatewayARN != null) sb.append("GatewayARN: " + gatewayARN + ", ");
        if (hourOfDay != null) sb.append("HourOfDay: " + hourOfDay + ", ");
        if (minuteOfHour != null) sb.append("MinuteOfHour: " + minuteOfHour + ", ");
        if (dayOfWeek != null) sb.append("DayOfWeek: " + dayOfWeek + ", ");
        if (timezone != null) sb.append("Timezone: " + timezone + ", ");
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
    