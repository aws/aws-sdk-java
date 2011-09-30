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
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#enableAlarmActions(EnableAlarmActionsRequest) EnableAlarmActions operation}.
 * <p>
 * Enables actions for the specified alarms.
 * </p>
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#enableAlarmActions(EnableAlarmActionsRequest)
 */
public class EnableAlarmActionsRequest extends AmazonWebServiceRequest {

    /**
     * The names of the alarms to enable actions for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private java.util.List<String> alarmNames;

    /**
     * The names of the alarms to enable actions for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The names of the alarms to enable actions for.
     */
    public java.util.List<String> getAlarmNames() {
        
        if (alarmNames == null) {
            alarmNames = new java.util.ArrayList<String>();
        }
        return alarmNames;
    }
    
    /**
     * The names of the alarms to enable actions for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param alarmNames The names of the alarms to enable actions for.
     */
    public void setAlarmNames(java.util.Collection<String> alarmNames) {
        java.util.List<String> alarmNamesCopy = new java.util.ArrayList<String>();
        if (alarmNames != null) {
            alarmNamesCopy.addAll(alarmNames);
        }
        this.alarmNames = alarmNamesCopy;
    }
    
    /**
     * The names of the alarms to enable actions for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param alarmNames The names of the alarms to enable actions for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EnableAlarmActionsRequest withAlarmNames(String... alarmNames) {
        if (getAlarmNames() == null) setAlarmNames(new java.util.ArrayList<String>());
        for (String value : alarmNames) {
            getAlarmNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the alarms to enable actions for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param alarmNames The names of the alarms to enable actions for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EnableAlarmActionsRequest withAlarmNames(java.util.Collection<String> alarmNames) {
        java.util.List<String> alarmNamesCopy = new java.util.ArrayList<String>();
        if (alarmNames != null) {
            alarmNamesCopy.addAll(alarmNames);
        }
        this.alarmNames = alarmNamesCopy;

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
        sb.append("AlarmNames: " + alarmNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    