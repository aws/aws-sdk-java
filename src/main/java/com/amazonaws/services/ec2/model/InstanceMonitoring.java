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
 * Represents the monitoring state of an EC2 instance.
 * </p>
 */
public class InstanceMonitoring {

    /**
     * Instance ID.
     */
    private String instanceId;

    /**
     * Monitoring state for the associated instance.
     */
    private Monitoring monitoring;

    /**
     * Instance ID.
     *
     * @return Instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Instance ID.
     *
     * @param instanceId Instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId Instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceMonitoring withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * Monitoring state for the associated instance.
     *
     * @return Monitoring state for the associated instance.
     */
    public Monitoring getMonitoring() {
        return monitoring;
    }
    
    /**
     * Monitoring state for the associated instance.
     *
     * @param monitoring Monitoring state for the associated instance.
     */
    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * Monitoring state for the associated instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring Monitoring state for the associated instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceMonitoring withMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("Monitoring: " + monitoring + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    