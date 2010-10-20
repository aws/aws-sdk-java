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
 * <p>
 * A description of the Amazon EC2 instance running the job flow.
 * </p>
 */
public class JobFlowInstancesConfig {

    /**
     * The EC2 instance type of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String masterInstanceType;

    /**
     * The EC2 instance type of the slave nodes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String slaveInstanceType;

    /**
     * The number of Amazon EC2 instances used to execute the job flow.
     */
    private Integer instanceCount;

    /**
     * Configuration for the job flow's instance groups.
     */
    private java.util.List<InstanceGroupConfig> instanceGroups;

    /**
     * Specifies the name of the Amazon EC2 key pair that can be used to ssh
     * to the master node as the user called "hadoop."
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String ec2KeyName;

    /**
     * Specifies the Availability Zone the job flow will run in.
     */
    private PlacementType placement;

    /**
     * Specifies whether the job flow should terminate after completing all
     * steps.
     */
    private Boolean keepJobFlowAliveWhenNoSteps;

    /**
     * Specifies the Hadoop version for the job flow. Valid inputs are "0.18"
     * or "0.20".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String hadoopVersion;

    /**
     * Default constructor for a new JobFlowInstancesConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public JobFlowInstancesConfig() {}
    
    /**
     * The EC2 instance type of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The EC2 instance type of the master node.
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }
    
    /**
     * The EC2 instance type of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param masterInstanceType The EC2 instance type of the master node.
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }
    
    /**
     * The EC2 instance type of the master node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param masterInstanceType The EC2 instance type of the master node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    
    
    /**
     * The EC2 instance type of the slave nodes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The EC2 instance type of the slave nodes.
     */
    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }
    
    /**
     * The EC2 instance type of the slave nodes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param slaveInstanceType The EC2 instance type of the slave nodes.
     */
    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }
    
    /**
     * The EC2 instance type of the slave nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param slaveInstanceType The EC2 instance type of the slave nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
        return this;
    }
    
    
    /**
     * The number of Amazon EC2 instances used to execute the job flow.
     *
     * @return The number of Amazon EC2 instances used to execute the job flow.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of Amazon EC2 instances used to execute the job flow.
     *
     * @param instanceCount The number of Amazon EC2 instances used to execute the job flow.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of Amazon EC2 instances used to execute the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of Amazon EC2 instances used to execute the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    
    
    /**
     * Configuration for the job flow's instance groups.
     *
     * @return Configuration for the job flow's instance groups.
     */
    public java.util.List<InstanceGroupConfig> getInstanceGroups() {
        if (instanceGroups == null) {
            instanceGroups = new java.util.ArrayList<InstanceGroupConfig>();
        }
        return instanceGroups;
    }
    
    /**
     * Configuration for the job flow's instance groups.
     *
     * @param instanceGroups Configuration for the job flow's instance groups.
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupConfig> instanceGroups) {
        java.util.List<InstanceGroupConfig> instanceGroupsCopy = new java.util.ArrayList<InstanceGroupConfig>();
        if (instanceGroups != null) {
            instanceGroupsCopy.addAll(instanceGroups);
        }
        this.instanceGroups = instanceGroupsCopy;
    }
    
    /**
     * Configuration for the job flow's instance groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Configuration for the job flow's instance groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withInstanceGroups(InstanceGroupConfig... instanceGroups) {
        for (InstanceGroupConfig value : instanceGroups) {
            getInstanceGroups().add(value);
        }
        return this;
    }
    
    /**
     * Configuration for the job flow's instance groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Configuration for the job flow's instance groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withInstanceGroups(java.util.Collection<InstanceGroupConfig> instanceGroups) {
        java.util.List<InstanceGroupConfig> instanceGroupsCopy = new java.util.ArrayList<InstanceGroupConfig>();
        if (instanceGroups != null) {
            instanceGroupsCopy.addAll(instanceGroups);
        }
        this.instanceGroups = instanceGroupsCopy;

        return this;
    }
    
    /**
     * Specifies the name of the Amazon EC2 key pair that can be used to ssh
     * to the master node as the user called "hadoop."
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the name of the Amazon EC2 key pair that can be used to ssh
     *         to the master node as the user called "hadoop."
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }
    
    /**
     * Specifies the name of the Amazon EC2 key pair that can be used to ssh
     * to the master node as the user called "hadoop."
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ec2KeyName Specifies the name of the Amazon EC2 key pair that can be used to ssh
     *         to the master node as the user called "hadoop."
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }
    
    /**
     * Specifies the name of the Amazon EC2 key pair that can be used to ssh
     * to the master node as the user called "hadoop."
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ec2KeyName Specifies the name of the Amazon EC2 key pair that can be used to ssh
     *         to the master node as the user called "hadoop."
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }
    
    
    /**
     * Specifies the Availability Zone the job flow will run in.
     *
     * @return Specifies the Availability Zone the job flow will run in.
     */
    public PlacementType getPlacement() {
        return placement;
    }
    
    /**
     * Specifies the Availability Zone the job flow will run in.
     *
     * @param placement Specifies the Availability Zone the job flow will run in.
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }
    
    /**
     * Specifies the Availability Zone the job flow will run in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement Specifies the Availability Zone the job flow will run in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withPlacement(PlacementType placement) {
        this.placement = placement;
        return this;
    }
    
    
    /**
     * Specifies whether the job flow should terminate after completing all
     * steps.
     *
     * @return Specifies whether the job flow should terminate after completing all
     *         steps.
     */
    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether the job flow should terminate after completing all
     * steps.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether the job flow should terminate after completing all
     *         steps.
     */
    public void setKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether the job flow should terminate after completing all
     * steps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether the job flow should terminate after completing all
     *         steps.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        return this;
    }
    
    
    /**
     * Specifies whether the job flow should terminate after completing all
     * steps.
     *
     * @return Specifies whether the job flow should terminate after completing all
     *         steps.
     */
    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies the Hadoop version for the job flow. Valid inputs are "0.18"
     * or "0.20".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the Hadoop version for the job flow. Valid inputs are "0.18"
     *         or "0.20".
     */
    public String getHadoopVersion() {
        return hadoopVersion;
    }
    
    /**
     * Specifies the Hadoop version for the job flow. Valid inputs are "0.18"
     * or "0.20".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param hadoopVersion Specifies the Hadoop version for the job flow. Valid inputs are "0.18"
     *         or "0.20".
     */
    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }
    
    /**
     * Specifies the Hadoop version for the job flow. Valid inputs are "0.18"
     * or "0.20".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param hadoopVersion Specifies the Hadoop version for the job flow. Valid inputs are "0.18"
     *         or "0.20".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
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
        sb.append("MasterInstanceType: " + masterInstanceType + ", ");
        sb.append("SlaveInstanceType: " + slaveInstanceType + ", ");
        sb.append("InstanceCount: " + instanceCount + ", ");
        sb.append("InstanceGroups: " + instanceGroups + ", ");
        sb.append("Ec2KeyName: " + ec2KeyName + ", ");
        sb.append("Placement: " + placement + ", ");
        sb.append("KeepJobFlowAliveWhenNoSteps: " + keepJobFlowAliveWhenNoSteps + ", ");
        sb.append("HadoopVersion: " + hadoopVersion + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    