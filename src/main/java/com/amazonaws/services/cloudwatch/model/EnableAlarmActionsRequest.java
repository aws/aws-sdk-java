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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#enableAlarmActions(EnableAlarmActionsRequest) EnableAlarmActions operation}.
 * <p>
 * Enables actions for the specified alarms.
 * </p>
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#enableAlarmActions(EnableAlarmActionsRequest)
 */
public class EnableAlarmActionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The names of the alarms to enable actions for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> alarmNames;

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
              alarmNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              alarmNames.setAutoConstruct(true);
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
        if (alarmNames == null) {
            this.alarmNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> alarmNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(alarmNames.size());
        alarmNamesCopy.addAll(alarmNames);
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
        if (getAlarmNames() == null) setAlarmNames(new java.util.ArrayList<String>(alarmNames.length));
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
        if (alarmNames == null) {
            this.alarmNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> alarmNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(alarmNames.size());
            alarmNamesCopy.addAll(alarmNames);
            this.alarmNames = alarmNamesCopy;
        }

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
        if (getAlarmNames() != null) sb.append("AlarmNames: " + getAlarmNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAlarmNames() == null) ? 0 : getAlarmNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnableAlarmActionsRequest == false) return false;
        EnableAlarmActionsRequest other = (EnableAlarmActionsRequest)obj;
        
        if (other.getAlarmNames() == null ^ this.getAlarmNames() == null) return false;
        if (other.getAlarmNames() != null && other.getAlarmNames().equals(this.getAlarmNames()) == false) return false; 
        return true;
    }
    
}
    