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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * <p>
 * The InstanceState data type.
 * </p>
 */
public class InstanceState {

    /**
     * Provides an EC2 instance ID.
     */
    private String instanceId;

    /**
     * Specifies the current status of the instance.
     */
    private String state;

    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the Load Balancer.
     */
    private String reasonCode;

    /**
     * 
     */
    private String description;

    /**
     * Provides an EC2 instance ID.
     *
     * @return Provides an EC2 instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Provides an EC2 instance ID.
     *
     * @param instanceId Provides an EC2 instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Provides an EC2 instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId Provides an EC2 instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceState withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * Specifies the current status of the instance.
     *
     * @return Specifies the current status of the instance.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Specifies the current status of the instance.
     *
     * @param state Specifies the current status of the instance.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Specifies the current status of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state Specifies the current status of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceState withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the Load Balancer.
     *
     * @return Provides information about the cause of <i>OutOfService</i> instances.
     *         Specifically, it indicates whether the cause is Elastic Load Balancing
     *         or the instance behind the Load Balancer.
     */
    public String getReasonCode() {
        return reasonCode;
    }
    
    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the Load Balancer.
     *
     * @param reasonCode Provides information about the cause of <i>OutOfService</i> instances.
     *         Specifically, it indicates whether the cause is Elastic Load Balancing
     *         or the instance behind the Load Balancer.
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }
    
    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the Load Balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reasonCode Provides information about the cause of <i>OutOfService</i> instances.
     *         Specifically, it indicates whether the cause is Elastic Load Balancing
     *         or the instance behind the Load Balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceState withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * 
     *
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceState withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
}
    