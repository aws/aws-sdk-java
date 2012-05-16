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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#updateMaintenanceStartTime(UpdateMaintenanceStartTimeRequest) UpdateMaintenanceStartTime operation}.
 * <p>
 * This operation updates a gateway's weekly maintenance start time information, including day and time of the week. The maintenance time is the time in
 * your gateway's time zone.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#updateMaintenanceStartTime(UpdateMaintenanceStartTimeRequest)
 */
public class UpdateMaintenanceStartTimeRequest extends AmazonWebServiceRequest {

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
     * The maintenance start time hour of day. <p>Length: 2 <p><i>Valid
     * Values</i>: An integer between 0 and 23 representing the hour of day.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer hourOfDay;

    /**
     * The maintenance start time minute of hour.. <p>Length: 2 <p><i>Valid
     * Values</i>: An integer between 0 and 59 representing the minute of
     * hour.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     */
    private Integer minuteOfHour;

    /**
     * The maintenance start time day of the week. <p>Length: 1 <p>Valid
     * Values An integer between 0 and 6, where 0 represents Sunday and 6
     * represents Saturday.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     */
    private Integer dayOfWeek;

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
    public UpdateMaintenanceStartTimeRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }
    
    
    /**
     * The maintenance start time hour of day. <p>Length: 2 <p><i>Valid
     * Values</i>: An integer between 0 and 23 representing the hour of day.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return The maintenance start time hour of day. <p>Length: 2 <p><i>Valid
     *         Values</i>: An integer between 0 and 23 representing the hour of day.
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }
    
    /**
     * The maintenance start time hour of day. <p>Length: 2 <p><i>Valid
     * Values</i>: An integer between 0 and 23 representing the hour of day.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hourOfDay The maintenance start time hour of day. <p>Length: 2 <p><i>Valid
     *         Values</i>: An integer between 0 and 23 representing the hour of day.
     */
    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }
    
    /**
     * The maintenance start time hour of day. <p>Length: 2 <p><i>Valid
     * Values</i>: An integer between 0 and 23 representing the hour of day.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hourOfDay The maintenance start time hour of day. <p>Length: 2 <p><i>Valid
     *         Values</i>: An integer between 0 and 23 representing the hour of day.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateMaintenanceStartTimeRequest withHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
        return this;
    }
    
    
    /**
     * The maintenance start time minute of hour.. <p>Length: 2 <p><i>Valid
     * Values</i>: An integer between 0 and 59 representing the minute of
     * hour.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @return The maintenance start time minute of hour.. <p>Length: 2 <p><i>Valid
     *         Values</i>: An integer between 0 and 59 representing the minute of
     *         hour.
     */
    public Integer getMinuteOfHour() {
        return minuteOfHour;
    }
    
    /**
     * The maintenance start time minute of hour.. <p>Length: 2 <p><i>Valid
     * Values</i>: An integer between 0 and 59 representing the minute of
     * hour.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minuteOfHour The maintenance start time minute of hour.. <p>Length: 2 <p><i>Valid
     *         Values</i>: An integer between 0 and 59 representing the minute of
     *         hour.
     */
    public void setMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
    }
    
    /**
     * The maintenance start time minute of hour.. <p>Length: 2 <p><i>Valid
     * Values</i>: An integer between 0 and 59 representing the minute of
     * hour.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minuteOfHour The maintenance start time minute of hour.. <p>Length: 2 <p><i>Valid
     *         Values</i>: An integer between 0 and 59 representing the minute of
     *         hour.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateMaintenanceStartTimeRequest withMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
        return this;
    }
    
    
    /**
     * The maintenance start time day of the week. <p>Length: 1 <p>Valid
     * Values An integer between 0 and 6, where 0 represents Sunday and 6
     * represents Saturday.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @return The maintenance start time day of the week. <p>Length: 1 <p>Valid
     *         Values An integer between 0 and 6, where 0 represents Sunday and 6
     *         represents Saturday.
     */
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }
    
    /**
     * The maintenance start time day of the week. <p>Length: 1 <p>Valid
     * Values An integer between 0 and 6, where 0 represents Sunday and 6
     * represents Saturday.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @param dayOfWeek The maintenance start time day of the week. <p>Length: 1 <p>Valid
     *         Values An integer between 0 and 6, where 0 represents Sunday and 6
     *         represents Saturday.
     */
    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    
    /**
     * The maintenance start time day of the week. <p>Length: 1 <p>Valid
     * Values An integer between 0 and 6, where 0 represents Sunday and 6
     * represents Saturday.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @param dayOfWeek The maintenance start time day of the week. <p>Length: 1 <p>Valid
     *         Values An integer between 0 and 6, where 0 represents Sunday and 6
     *         represents Saturday.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateMaintenanceStartTimeRequest withDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof UpdateMaintenanceStartTimeRequest == false) return false;
        UpdateMaintenanceStartTimeRequest other = (UpdateMaintenanceStartTimeRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getHourOfDay() == null ^ this.getHourOfDay() == null) return false;
        if (other.getHourOfDay() != null && other.getHourOfDay().equals(this.getHourOfDay()) == false) return false; 
        if (other.getMinuteOfHour() == null ^ this.getMinuteOfHour() == null) return false;
        if (other.getMinuteOfHour() != null && other.getMinuteOfHour().equals(this.getMinuteOfHour()) == false) return false; 
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null) return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false) return false; 
        return true;
    }
    
}
    