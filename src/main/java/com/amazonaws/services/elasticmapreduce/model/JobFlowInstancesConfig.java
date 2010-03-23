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
package com.amazonaws.services.elasticmapreduce.model;

/**
 * Job Flow Instances Config
 */
public class JobFlowInstancesConfig {
        
    private String masterInstanceType;

    private String slaveInstanceType;

    private Integer instanceCount;

    private String ec2KeyName;

    private PlacementType placement;

    private Boolean keepJobFlowAliveWhenNoSteps;

    /**
     * Returns the value of the MasterInstanceType property for this object.
     *
     * @return The value of the MasterInstanceType property for this object.
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }
    
    /**
     * Sets the value of the MasterInstanceType property for this object.
     *
     * @param masterInstanceType The new value for the MasterInstanceType property for this object.
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }
    
    /**
     * Sets the value of the MasterInstanceType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterInstanceType The new value for the MasterInstanceType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    
    
    /**
     * Returns the value of the SlaveInstanceType property for this object.
     *
     * @return The value of the SlaveInstanceType property for this object.
     */
    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }
    
    /**
     * Sets the value of the SlaveInstanceType property for this object.
     *
     * @param slaveInstanceType The new value for the SlaveInstanceType property for this object.
     */
    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }
    
    /**
     * Sets the value of the SlaveInstanceType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param slaveInstanceType The new value for the SlaveInstanceType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
        return this;
    }
    
    
    /**
     * Returns the value of the InstanceCount property for this object.
     *
     * @return The value of the InstanceCount property for this object.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * Sets the value of the InstanceCount property for this object.
     *
     * @param instanceCount The new value for the InstanceCount property for this object.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * Sets the value of the InstanceCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The new value for the InstanceCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    
    
    /**
     * Returns the value of the Ec2KeyName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The value of the Ec2KeyName property for this object.
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }
    
    /**
     * Sets the value of the Ec2KeyName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ec2KeyName The new value for the Ec2KeyName property for this object.
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }
    
    /**
     * Sets the value of the Ec2KeyName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ec2KeyName The new value for the Ec2KeyName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }
    
    
    /**
     * Returns the value of the Placement property for this object.
     *
     * @return The value of the Placement property for this object.
     */
    public PlacementType getPlacement() {
        return placement;
    }
    
    /**
     * Sets the value of the Placement property for this object.
     *
     * @param placement The new value for the Placement property for this object.
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }
    
    /**
     * Sets the value of the Placement property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement The new value for the Placement property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withPlacement(PlacementType placement) {
        this.placement = placement;
        return this;
    }
    
    
    /**
     * Returns the value of the KeepJobFlowAliveWhenNoSteps property for this
     * object.
     *
     * @return The value of the KeepJobFlowAliveWhenNoSteps property for this object.
     */
    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Sets the value of the KeepJobFlowAliveWhenNoSteps property for this
     * object.
     *
     * @param keepJobFlowAliveWhenNoSteps The new value for the KeepJobFlowAliveWhenNoSteps property for this
     *         object.
     */
    public void setKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Sets the value of the KeepJobFlowAliveWhenNoSteps property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keepJobFlowAliveWhenNoSteps The new value for the KeepJobFlowAliveWhenNoSteps property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        return this;
    }
    
    
    /**
     * Returns the value of the KeepJobFlowAliveWhenNoSteps property for this
     * object.
     *
     * @return The value of the KeepJobFlowAliveWhenNoSteps property for this object.
     */
    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
}
    