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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * The result of enabling monitoring on a set of Amazon EC2 instances. Contains the updated monitoring status for each instance specified in the
 * request.
 * </p>
 */
public class MonitorInstancesResult implements Serializable {

    /**
     * A list of updated monitoring information for the instances specified
     * in the request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceMonitoring> instanceMonitorings;

    /**
     * A list of updated monitoring information for the instances specified
     * in the request.
     *
     * @return A list of updated monitoring information for the instances specified
     *         in the request.
     */
    public java.util.List<InstanceMonitoring> getInstanceMonitorings() {
        if (instanceMonitorings == null) {
              instanceMonitorings = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceMonitoring>();
              instanceMonitorings.setAutoConstruct(true);
        }
        return instanceMonitorings;
    }
    
    /**
     * A list of updated monitoring information for the instances specified
     * in the request.
     *
     * @param instanceMonitorings A list of updated monitoring information for the instances specified
     *         in the request.
     */
    public void setInstanceMonitorings(java.util.Collection<InstanceMonitoring> instanceMonitorings) {
        if (instanceMonitorings == null) {
            this.instanceMonitorings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceMonitoring> instanceMonitoringsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceMonitoring>(instanceMonitorings.size());
        instanceMonitoringsCopy.addAll(instanceMonitorings);
        this.instanceMonitorings = instanceMonitoringsCopy;
    }
    
    /**
     * A list of updated monitoring information for the instances specified
     * in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceMonitorings A list of updated monitoring information for the instances specified
     *         in the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MonitorInstancesResult withInstanceMonitorings(InstanceMonitoring... instanceMonitorings) {
        if (getInstanceMonitorings() == null) setInstanceMonitorings(new java.util.ArrayList<InstanceMonitoring>(instanceMonitorings.length));
        for (InstanceMonitoring value : instanceMonitorings) {
            getInstanceMonitorings().add(value);
        }
        return this;
    }
    
    /**
     * A list of updated monitoring information for the instances specified
     * in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceMonitorings A list of updated monitoring information for the instances specified
     *         in the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MonitorInstancesResult withInstanceMonitorings(java.util.Collection<InstanceMonitoring> instanceMonitorings) {
        if (instanceMonitorings == null) {
            this.instanceMonitorings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceMonitoring> instanceMonitoringsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceMonitoring>(instanceMonitorings.size());
            instanceMonitoringsCopy.addAll(instanceMonitorings);
            this.instanceMonitorings = instanceMonitoringsCopy;
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
        if (getInstanceMonitorings() != null) sb.append("InstanceMonitorings: " + getInstanceMonitorings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceMonitorings() == null) ? 0 : getInstanceMonitorings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MonitorInstancesResult == false) return false;
        MonitorInstancesResult other = (MonitorInstancesResult)obj;
        
        if (other.getInstanceMonitorings() == null ^ this.getInstanceMonitorings() == null) return false;
        if (other.getInstanceMonitorings() != null && other.getInstanceMonitorings().equals(this.getInstanceMonitorings()) == false) return false; 
        return true;
    }
    
}
    