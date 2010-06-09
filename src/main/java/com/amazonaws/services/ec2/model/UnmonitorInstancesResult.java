/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The result of calling the UnmonitorInstances operation. Contains the
 * updated monitoring status for each instance specified in the request.
 * </p>
 */
public class UnmonitorInstancesResult {

    /**
     * A list of updated monitoring information for the instances specified
     * in the request.
     */
    private java.util.List<InstanceMonitoring> instanceMonitorings;

    /**
     * A list of updated monitoring information for the instances specified
     * in the request.
     *
     * @return A list of updated monitoring information for the instances specified
     *         in the request.
     */
    public java.util.List<InstanceMonitoring> getInstanceMonitorings() {
        if (instanceMonitorings == null) {
            instanceMonitorings = new java.util.ArrayList<InstanceMonitoring>();
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
        java.util.List<InstanceMonitoring> instanceMonitoringsCopy = new java.util.ArrayList<InstanceMonitoring>();
        if (instanceMonitorings != null) {
            instanceMonitoringsCopy.addAll(instanceMonitorings);
        }
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
    public UnmonitorInstancesResult withInstanceMonitorings(InstanceMonitoring... instanceMonitorings) {
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
    public UnmonitorInstancesResult withInstanceMonitorings(java.util.Collection<InstanceMonitoring> instanceMonitorings) {
        java.util.List<InstanceMonitoring> instanceMonitoringsCopy = new java.util.ArrayList<InstanceMonitoring>();
        if (instanceMonitorings != null) {
            instanceMonitoringsCopy.addAll(instanceMonitorings);
        }
        this.instanceMonitorings = instanceMonitoringsCopy;

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
        
        sb.append("InstanceMonitorings: " + instanceMonitorings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    