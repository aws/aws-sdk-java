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
 * </p>
 */
public class JobFlowInstancesDetail {

    /**
     * The Amazon EC2 master node instance type.
     */
    private String masterInstanceType;

    /**
     * The DNS name of the master node.
     */
    private String masterPublicDnsName;

    /**
     * The ID that uniquely identifies the master node instance.
     */
    private String masterInstanceId;

    /**
     * The Amazon EC2 slave node instance type.
     */
    private String slaveInstanceType;

    /**
     * The number of Amazon EC2 instances in the cluster. If the value is 1,
     * one instance serves as the master and slave node. If the value is
     * greater than one, one instance is the master node and the remainder
     * are slave nodes.
     */
    private Integer instanceCount;

    /**
     * A KeyName that maps to a public key-private key pair, which is
     * required to launch the master node. The private key is used by SSH to
     * authenticate the tunneling connection between the client and the EC2
     * master node that was launched using the KeyName.
     */
    private String ec2KeyName;

    /**
     * A container for the placement type of the job flow instance.
     */
    private PlacementType placement;

    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster engaged after all steps in the job flow complete.
     */
    private Boolean keepJobFlowAliveWhenNoSteps;

    private String hadoopVersion;

    /**
     * The Amazon EC2 master node instance type.
     *
     * @return The Amazon EC2 master node instance type.
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }
    
    /**
     * The Amazon EC2 master node instance type.
     *
     * @param masterInstanceType The Amazon EC2 master node instance type.
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }
    
    /**
     * The Amazon EC2 master node instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterInstanceType The Amazon EC2 master node instance type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    
    
    /**
     * The DNS name of the master node.
     *
     * @return The DNS name of the master node.
     */
    public String getMasterPublicDnsName() {
        return masterPublicDnsName;
    }
    
    /**
     * The DNS name of the master node.
     *
     * @param masterPublicDnsName The DNS name of the master node.
     */
    public void setMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
    }
    
    /**
     * The DNS name of the master node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterPublicDnsName The DNS name of the master node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
        return this;
    }
    
    
    /**
     * The ID that uniquely identifies the master node instance.
     *
     * @return The ID that uniquely identifies the master node instance.
     */
    public String getMasterInstanceId() {
        return masterInstanceId;
    }
    
    /**
     * The ID that uniquely identifies the master node instance.
     *
     * @param masterInstanceId The ID that uniquely identifies the master node instance.
     */
    public void setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
    }
    
    /**
     * The ID that uniquely identifies the master node instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterInstanceId The ID that uniquely identifies the master node instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
        return this;
    }
    
    
    /**
     * The Amazon EC2 slave node instance type.
     *
     * @return The Amazon EC2 slave node instance type.
     */
    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }
    
    /**
     * The Amazon EC2 slave node instance type.
     *
     * @param slaveInstanceType The Amazon EC2 slave node instance type.
     */
    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }
    
    /**
     * The Amazon EC2 slave node instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param slaveInstanceType The Amazon EC2 slave node instance type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
        return this;
    }
    
    
    /**
     * The number of Amazon EC2 instances in the cluster. If the value is 1,
     * one instance serves as the master and slave node. If the value is
     * greater than one, one instance is the master node and the remainder
     * are slave nodes.
     *
     * @return The number of Amazon EC2 instances in the cluster. If the value is 1,
     *         one instance serves as the master and slave node. If the value is
     *         greater than one, one instance is the master node and the remainder
     *         are slave nodes.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of Amazon EC2 instances in the cluster. If the value is 1,
     * one instance serves as the master and slave node. If the value is
     * greater than one, one instance is the master node and the remainder
     * are slave nodes.
     *
     * @param instanceCount The number of Amazon EC2 instances in the cluster. If the value is 1,
     *         one instance serves as the master and slave node. If the value is
     *         greater than one, one instance is the master node and the remainder
     *         are slave nodes.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of Amazon EC2 instances in the cluster. If the value is 1,
     * one instance serves as the master and slave node. If the value is
     * greater than one, one instance is the master node and the remainder
     * are slave nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of Amazon EC2 instances in the cluster. If the value is 1,
     *         one instance serves as the master and slave node. If the value is
     *         greater than one, one instance is the master node and the remainder
     *         are slave nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    
    
    /**
     * A KeyName that maps to a public key-private key pair, which is
     * required to launch the master node. The private key is used by SSH to
     * authenticate the tunneling connection between the client and the EC2
     * master node that was launched using the KeyName.
     *
     * @return A KeyName that maps to a public key-private key pair, which is
     *         required to launch the master node. The private key is used by SSH to
     *         authenticate the tunneling connection between the client and the EC2
     *         master node that was launched using the KeyName.
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }
    
    /**
     * A KeyName that maps to a public key-private key pair, which is
     * required to launch the master node. The private key is used by SSH to
     * authenticate the tunneling connection between the client and the EC2
     * master node that was launched using the KeyName.
     *
     * @param ec2KeyName A KeyName that maps to a public key-private key pair, which is
     *         required to launch the master node. The private key is used by SSH to
     *         authenticate the tunneling connection between the client and the EC2
     *         master node that was launched using the KeyName.
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }
    
    /**
     * A KeyName that maps to a public key-private key pair, which is
     * required to launch the master node. The private key is used by SSH to
     * authenticate the tunneling connection between the client and the EC2
     * master node that was launched using the KeyName.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2KeyName A KeyName that maps to a public key-private key pair, which is
     *         required to launch the master node. The private key is used by SSH to
     *         authenticate the tunneling connection between the client and the EC2
     *         master node that was launched using the KeyName.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }
    
    
    /**
     * A container for the placement type of the job flow instance.
     *
     * @return A container for the placement type of the job flow instance.
     */
    public PlacementType getPlacement() {
        return placement;
    }
    
    /**
     * A container for the placement type of the job flow instance.
     *
     * @param placement A container for the placement type of the job flow instance.
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }
    
    /**
     * A container for the placement type of the job flow instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement A container for the placement type of the job flow instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withPlacement(PlacementType placement) {
        this.placement = placement;
        return this;
    }
    
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster engaged after all steps in the job flow complete.
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         keep the EC2 cluster engaged after all steps in the job flow complete.
     */
    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster engaged after all steps in the job flow complete.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         keep the EC2 cluster engaged after all steps in the job flow complete.
     */
    public void setKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster engaged after all steps in the job flow complete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         keep the EC2 cluster engaged after all steps in the job flow complete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        return this;
    }
    
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster engaged after all steps in the job flow complete.
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         keep the EC2 cluster engaged after all steps in the job flow complete.
     */
    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Returns the value of the HadoopVersion property for this object.
     *
     * @return The value of the HadoopVersion property for this object.
     */
    public String getHadoopVersion() {
        return hadoopVersion;
    }
    
    /**
     * Sets the value of the HadoopVersion property for this object.
     *
     * @param hadoopVersion The new value for the HadoopVersion property for this object.
     */
    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }
    
    /**
     * Sets the value of the HadoopVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hadoopVersion The new value for the HadoopVersion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("MasterInstanceType: " + masterInstanceType + ", ");
        sb.append("MasterPublicDnsName: " + masterPublicDnsName + ", ");
        sb.append("MasterInstanceId: " + masterInstanceId + ", ");
        sb.append("SlaveInstanceType: " + slaveInstanceType + ", ");
        sb.append("InstanceCount: " + instanceCount + ", ");
        sb.append("Ec2KeyName: " + ec2KeyName + ", ");
        sb.append("Placement: " + placement + ", ");
        sb.append("KeepJobFlowAliveWhenNoSteps: " + keepJobFlowAliveWhenNoSteps + ", ");
        sb.append("HadoopVersion: " + hadoopVersion + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    