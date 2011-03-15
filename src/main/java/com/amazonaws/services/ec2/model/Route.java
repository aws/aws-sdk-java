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
package com.amazonaws.services.ec2.model;

/**
 * Route
 */
public class Route {

    private String destinationCidrBlock;

    private String gatewayId;

    private String instanceId;

    private String state;

    /**
     * Returns the value of the DestinationCidrBlock property for this
     * object.
     *
     * @return The value of the DestinationCidrBlock property for this object.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * Sets the value of the DestinationCidrBlock property for this object.
     *
     * @param destinationCidrBlock The new value for the DestinationCidrBlock property for this object.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * Sets the value of the DestinationCidrBlock property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The new value for the DestinationCidrBlock property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Route withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    
    
    /**
     * Returns the value of the GatewayId property for this object.
     *
     * @return The value of the GatewayId property for this object.
     */
    public String getGatewayId() {
        return gatewayId;
    }
    
    /**
     * Sets the value of the GatewayId property for this object.
     *
     * @param gatewayId The new value for the GatewayId property for this object.
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    
    /**
     * Sets the value of the GatewayId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayId The new value for the GatewayId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Route withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    
    
    /**
     * Returns the value of the InstanceId property for this object.
     *
     * @return The value of the InstanceId property for this object.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Sets the value of the InstanceId property for this object.
     *
     * @param instanceId The new value for the InstanceId property for this object.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Sets the value of the InstanceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The new value for the InstanceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Route withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * Returns the value of the State property for this object.
     *
     * @return The value of the State property for this object.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     *
     * @param state The new value for the State property for this object.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Route withState(String state) {
        this.state = state;
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
        sb.append("DestinationCidrBlock: " + destinationCidrBlock + ", ");
        sb.append("GatewayId: " + gatewayId + ", ");
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("State: " + state + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    