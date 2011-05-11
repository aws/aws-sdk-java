/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#setAlarmState(SetAlarmStateRequest) SetAlarmState operation}.
 * <p>
 * Temporarily sets the state of an alarm. When the updated
 * <code>StateValue</code> differs from the previous value, the action
 * configured for the appropriate state is invoked. This is not a
 * permanent change. The next periodic alarm check (in about a minute)
 * will set the alarm to its actual state.
 * </p>
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#setAlarmState(SetAlarmStateRequest)
 */
public class SetAlarmStateRequest extends AmazonWebServiceRequest {

    /**
     * The descriptive name for the alarm. This name must be unique within
     * the user's AWS account. The maximum length is 255 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String alarmName;

    /**
     * The value of the state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     */
    private String stateValue;

    /**
     * The reason that this alarm is set to this specific state (in
     * human-readable text format)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1023<br/>
     */
    private String stateReason;

    /**
     * The reason that this alarm is set to this specific state (in
     * machine-readable JSON format)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     */
    private String stateReasonData;

    /**
     * The descriptive name for the alarm. This name must be unique within
     * the user's AWS account. The maximum length is 255 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The descriptive name for the alarm. This name must be unique within
     *         the user's AWS account. The maximum length is 255 characters.
     */
    public String getAlarmName() {
        return alarmName;
    }
    
    /**
     * The descriptive name for the alarm. This name must be unique within
     * the user's AWS account. The maximum length is 255 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName The descriptive name for the alarm. This name must be unique within
     *         the user's AWS account. The maximum length is 255 characters.
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }
    
    /**
     * The descriptive name for the alarm. This name must be unique within
     * the user's AWS account. The maximum length is 255 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName The descriptive name for the alarm. This name must be unique within
     *         the user's AWS account. The maximum length is 255 characters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetAlarmStateRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    
    
    /**
     * The value of the state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @return The value of the state.
     *
     * @see StateValue
     */
    public String getStateValue() {
        return stateValue;
    }
    
    /**
     * The value of the state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue The value of the state.
     *
     * @see StateValue
     */
    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }
    
    /**
     * The value of the state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue The value of the state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see StateValue
     */
    public SetAlarmStateRequest withStateValue(String stateValue) {
        this.stateValue = stateValue;
        return this;
    }
    
    
    /**
     * The reason that this alarm is set to this specific state (in
     * human-readable text format)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1023<br/>
     *
     * @return The reason that this alarm is set to this specific state (in
     *         human-readable text format)
     */
    public String getStateReason() {
        return stateReason;
    }
    
    /**
     * The reason that this alarm is set to this specific state (in
     * human-readable text format)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1023<br/>
     *
     * @param stateReason The reason that this alarm is set to this specific state (in
     *         human-readable text format)
     */
    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }
    
    /**
     * The reason that this alarm is set to this specific state (in
     * human-readable text format)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1023<br/>
     *
     * @param stateReason The reason that this alarm is set to this specific state (in
     *         human-readable text format)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetAlarmStateRequest withStateReason(String stateReason) {
        this.stateReason = stateReason;
        return this;
    }
    
    
    /**
     * The reason that this alarm is set to this specific state (in
     * machine-readable JSON format)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     *
     * @return The reason that this alarm is set to this specific state (in
     *         machine-readable JSON format)
     */
    public String getStateReasonData() {
        return stateReasonData;
    }
    
    /**
     * The reason that this alarm is set to this specific state (in
     * machine-readable JSON format)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     *
     * @param stateReasonData The reason that this alarm is set to this specific state (in
     *         machine-readable JSON format)
     */
    public void setStateReasonData(String stateReasonData) {
        this.stateReasonData = stateReasonData;
    }
    
    /**
     * The reason that this alarm is set to this specific state (in
     * machine-readable JSON format)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     *
     * @param stateReasonData The reason that this alarm is set to this specific state (in
     *         machine-readable JSON format)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetAlarmStateRequest withStateReasonData(String stateReasonData) {
        this.stateReasonData = stateReasonData;
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
        sb.append("AlarmName: " + alarmName + ", ");
        sb.append("StateValue: " + stateValue + ", ");
        sb.append("StateReason: " + stateReason + ", ");
        sb.append("StateReasonData: " + stateReasonData + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    