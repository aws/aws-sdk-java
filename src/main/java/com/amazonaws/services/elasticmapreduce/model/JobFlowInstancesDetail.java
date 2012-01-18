/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specify the type of Amazon EC2 instances to run the job flow on.
 * </p>
 */
public class JobFlowInstancesDetail {

    /**
     * The Amazon EC2 master node instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String masterInstanceType;

    /**
     * The DNS name of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String masterPublicDnsName;

    /**
     * The Amazon EC2 instance identifier of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String masterInstanceId;

    /**
     * The Amazon EC2 slave node instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String slaveInstanceType;

    /**
     * The number of Amazon EC2 instances in the cluster. If the value is 1,
     * the same instance serves as both the master and slave node. If the
     * value is greater than 1, one instance is the master node and all
     * others are slave nodes.
     */
    private Integer instanceCount;

    /**
     * Details about the job flow's instance groups.
     */
    private java.util.List<InstanceGroupDetail> instanceGroups;

    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented once for every hour an
     * m1.small runs. Larger instances are weighted more, so an Amazon EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     */
    private Integer normalizedInstanceHours;

    /**
     * The name of an Amazon EC2 key pair that can be used to ssh to the
     * master node of job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String ec2KeyName;

    /**
     * For job flows launched within Amazon Virtual Private Cloud, this value
     * specifies the identifier of the subnet where the job flow was
     * launched.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String ec2SubnetId;

    /**
     * Specifies the Amazon EC2 Availability Zone for the job flow.
     */
    private PlacementType placement;

    /**
     * Specifies whether or not the job flow should terminate after
     * completing all steps.
     */
    private Boolean keepJobFlowAliveWhenNoSteps;

    /**
     * Specifies whether the Amazon EC2 instances in the cluster are
     * protected from termination by API calls, user intervention, or in the
     * event of a job flow error.
     */
    private Boolean terminationProtected;

    /**
     * Specifies the Hadoop version for the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String hadoopVersion;

    /**
     * Default constructor for a new JobFlowInstancesDetail object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public JobFlowInstancesDetail() {}
    
    /**
     * Constructs a new JobFlowInstancesDetail object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param masterInstanceType The Amazon EC2 master node instance type.
     * @param slaveInstanceType The Amazon EC2 slave node instance type.
     * @param instanceCount The number of Amazon EC2 instances in the
     * cluster. If the value is 1, the same instance serves as both the
     * master and slave node. If the value is greater than 1, one instance is
     * the master node and all others are slave nodes.
     */
    public JobFlowInstancesDetail(String masterInstanceType, String slaveInstanceType, Integer instanceCount) {
        this.masterInstanceType = masterInstanceType;
        this.slaveInstanceType = slaveInstanceType;
        this.instanceCount = instanceCount;
    }

    
    
    /**
     * The Amazon EC2 master node instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon EC2 master node instance type.
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }
    
    /**
     * The Amazon EC2 master node instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The DNS name of the master node.
     */
    public String getMasterPublicDnsName() {
        return masterPublicDnsName;
    }
    
    /**
     * The DNS name of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * The Amazon EC2 instance identifier of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon EC2 instance identifier of the master node.
     */
    public String getMasterInstanceId() {
        return masterInstanceId;
    }
    
    /**
     * The Amazon EC2 instance identifier of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param masterInstanceId The Amazon EC2 instance identifier of the master node.
     */
    public void setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
    }
    
    /**
     * The Amazon EC2 instance identifier of the master node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param masterInstanceId The Amazon EC2 instance identifier of the master node.
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon EC2 slave node instance type.
     */
    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }
    
    /**
     * The Amazon EC2 slave node instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * the same instance serves as both the master and slave node. If the
     * value is greater than 1, one instance is the master node and all
     * others are slave nodes.
     *
     * @return The number of Amazon EC2 instances in the cluster. If the value is 1,
     *         the same instance serves as both the master and slave node. If the
     *         value is greater than 1, one instance is the master node and all
     *         others are slave nodes.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of Amazon EC2 instances in the cluster. If the value is 1,
     * the same instance serves as both the master and slave node. If the
     * value is greater than 1, one instance is the master node and all
     * others are slave nodes.
     *
     * @param instanceCount The number of Amazon EC2 instances in the cluster. If the value is 1,
     *         the same instance serves as both the master and slave node. If the
     *         value is greater than 1, one instance is the master node and all
     *         others are slave nodes.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of Amazon EC2 instances in the cluster. If the value is 1,
     * the same instance serves as both the master and slave node. If the
     * value is greater than 1, one instance is the master node and all
     * others are slave nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of Amazon EC2 instances in the cluster. If the value is 1,
     *         the same instance serves as both the master and slave node. If the
     *         value is greater than 1, one instance is the master node and all
     *         others are slave nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    
    
    /**
     * Details about the job flow's instance groups.
     *
     * @return Details about the job flow's instance groups.
     */
    public java.util.List<InstanceGroupDetail> getInstanceGroups() {
        
        if (instanceGroups == null) {
            instanceGroups = new java.util.ArrayList<InstanceGroupDetail>();
        }
        return instanceGroups;
    }
    
    /**
     * Details about the job flow's instance groups.
     *
     * @param instanceGroups Details about the job flow's instance groups.
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupDetail> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        java.util.List<InstanceGroupDetail> instanceGroupsCopy = new java.util.ArrayList<InstanceGroupDetail>(instanceGroups.size());
        instanceGroupsCopy.addAll(instanceGroups);
        this.instanceGroups = instanceGroupsCopy;
    }
    
    /**
     * Details about the job flow's instance groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Details about the job flow's instance groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withInstanceGroups(InstanceGroupDetail... instanceGroups) {
        if (getInstanceGroups() == null) setInstanceGroups(new java.util.ArrayList<InstanceGroupDetail>(instanceGroups.length));
        for (InstanceGroupDetail value : instanceGroups) {
            getInstanceGroups().add(value);
        }
        return this;
    }
    
    /**
     * Details about the job flow's instance groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Details about the job flow's instance groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withInstanceGroups(java.util.Collection<InstanceGroupDetail> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
        } else {
            java.util.List<InstanceGroupDetail> instanceGroupsCopy = new java.util.ArrayList<InstanceGroupDetail>(instanceGroups.size());
            instanceGroupsCopy.addAll(instanceGroups);
            this.instanceGroups = instanceGroupsCopy;
        }

        return this;
    }
    
    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented once for every hour an
     * m1.small runs. Larger instances are weighted more, so an Amazon EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     *
     * @return An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented once for every hour an
     *         m1.small runs. Larger instances are weighted more, so an Amazon EC2
     *         instance that is roughly four times more expensive would result in the
     *         normalized instance hours being incremented by four. This result is
     *         only an approximation and does not reflect the actual billing rate.
     */
    public Integer getNormalizedInstanceHours() {
        return normalizedInstanceHours;
    }
    
    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented once for every hour an
     * m1.small runs. Larger instances are weighted more, so an Amazon EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     *
     * @param normalizedInstanceHours An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented once for every hour an
     *         m1.small runs. Larger instances are weighted more, so an Amazon EC2
     *         instance that is roughly four times more expensive would result in the
     *         normalized instance hours being incremented by four. This result is
     *         only an approximation and does not reflect the actual billing rate.
     */
    public void setNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
    }
    
    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented once for every hour an
     * m1.small runs. Larger instances are weighted more, so an Amazon EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param normalizedInstanceHours An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented once for every hour an
     *         m1.small runs. Larger instances are weighted more, so an Amazon EC2
     *         instance that is roughly four times more expensive would result in the
     *         normalized instance hours being incremented by four. This result is
     *         only an approximation and does not reflect the actual billing rate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
        return this;
    }
    
    
    /**
     * The name of an Amazon EC2 key pair that can be used to ssh to the
     * master node of job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of an Amazon EC2 key pair that can be used to ssh to the
     *         master node of job flow.
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }
    
    /**
     * The name of an Amazon EC2 key pair that can be used to ssh to the
     * master node of job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ec2KeyName The name of an Amazon EC2 key pair that can be used to ssh to the
     *         master node of job flow.
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }
    
    /**
     * The name of an Amazon EC2 key pair that can be used to ssh to the
     * master node of job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ec2KeyName The name of an Amazon EC2 key pair that can be used to ssh to the
     *         master node of job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }
    
    
    /**
     * For job flows launched within Amazon Virtual Private Cloud, this value
     * specifies the identifier of the subnet where the job flow was
     * launched.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return For job flows launched within Amazon Virtual Private Cloud, this value
     *         specifies the identifier of the subnet where the job flow was
     *         launched.
     */
    public String getEc2SubnetId() {
        return ec2SubnetId;
    }
    
    /**
     * For job flows launched within Amazon Virtual Private Cloud, this value
     * specifies the identifier of the subnet where the job flow was
     * launched.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ec2SubnetId For job flows launched within Amazon Virtual Private Cloud, this value
     *         specifies the identifier of the subnet where the job flow was
     *         launched.
     */
    public void setEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }
    
    /**
     * For job flows launched within Amazon Virtual Private Cloud, this value
     * specifies the identifier of the subnet where the job flow was
     * launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ec2SubnetId For job flows launched within Amazon Virtual Private Cloud, this value
     *         specifies the identifier of the subnet where the job flow was
     *         launched.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
        return this;
    }
    
    
    /**
     * Specifies the Amazon EC2 Availability Zone for the job flow.
     *
     * @return Specifies the Amazon EC2 Availability Zone for the job flow.
     */
    public PlacementType getPlacement() {
        return placement;
    }
    
    /**
     * Specifies the Amazon EC2 Availability Zone for the job flow.
     *
     * @param placement Specifies the Amazon EC2 Availability Zone for the job flow.
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }
    
    /**
     * Specifies the Amazon EC2 Availability Zone for the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement Specifies the Amazon EC2 Availability Zone for the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withPlacement(PlacementType placement) {
        this.placement = placement;
        return this;
    }
    
    
    /**
     * Specifies whether or not the job flow should terminate after
     * completing all steps.
     *
     * @return Specifies whether or not the job flow should terminate after
     *         completing all steps.
     */
    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether or not the job flow should terminate after
     * completing all steps.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether or not the job flow should terminate after
     *         completing all steps.
     */
    public void setKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether or not the job flow should terminate after
     * completing all steps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether or not the job flow should terminate after
     *         completing all steps.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        return this;
    }
    
    
    /**
     * Specifies whether or not the job flow should terminate after
     * completing all steps.
     *
     * @return Specifies whether or not the job flow should terminate after
     *         completing all steps.
     */
    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether the Amazon EC2 instances in the cluster are
     * protected from termination by API calls, user intervention, or in the
     * event of a job flow error.
     *
     * @return Specifies whether the Amazon EC2 instances in the cluster are
     *         protected from termination by API calls, user intervention, or in the
     *         event of a job flow error.
     */
    public Boolean isTerminationProtected() {
        return terminationProtected;
    }
    
    /**
     * Specifies whether the Amazon EC2 instances in the cluster are
     * protected from termination by API calls, user intervention, or in the
     * event of a job flow error.
     *
     * @param terminationProtected Specifies whether the Amazon EC2 instances in the cluster are
     *         protected from termination by API calls, user intervention, or in the
     *         event of a job flow error.
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }
    
    /**
     * Specifies whether the Amazon EC2 instances in the cluster are
     * protected from termination by API calls, user intervention, or in the
     * event of a job flow error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationProtected Specifies whether the Amazon EC2 instances in the cluster are
     *         protected from termination by API calls, user intervention, or in the
     *         event of a job flow error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }
    
    
    /**
     * Specifies whether the Amazon EC2 instances in the cluster are
     * protected from termination by API calls, user intervention, or in the
     * event of a job flow error.
     *
     * @return Specifies whether the Amazon EC2 instances in the cluster are
     *         protected from termination by API calls, user intervention, or in the
     *         event of a job flow error.
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
    }
    
    /**
     * Specifies the Hadoop version for the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the Hadoop version for the job flow.
     */
    public String getHadoopVersion() {
        return hadoopVersion;
    }
    
    /**
     * Specifies the Hadoop version for the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param hadoopVersion Specifies the Hadoop version for the job flow.
     */
    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }
    
    /**
     * Specifies the Hadoop version for the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param hadoopVersion Specifies the Hadoop version for the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesDetail withHadoopVersion(String hadoopVersion) {
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
        if (masterInstanceType != null) sb.append("MasterInstanceType: " + masterInstanceType + ", ");
        if (masterPublicDnsName != null) sb.append("MasterPublicDnsName: " + masterPublicDnsName + ", ");
        if (masterInstanceId != null) sb.append("MasterInstanceId: " + masterInstanceId + ", ");
        if (slaveInstanceType != null) sb.append("SlaveInstanceType: " + slaveInstanceType + ", ");
        if (instanceCount != null) sb.append("InstanceCount: " + instanceCount + ", ");
        if (instanceGroups != null) sb.append("InstanceGroups: " + instanceGroups + ", ");
        if (normalizedInstanceHours != null) sb.append("NormalizedInstanceHours: " + normalizedInstanceHours + ", ");
        if (ec2KeyName != null) sb.append("Ec2KeyName: " + ec2KeyName + ", ");
        if (ec2SubnetId != null) sb.append("Ec2SubnetId: " + ec2SubnetId + ", ");
        if (placement != null) sb.append("Placement: " + placement + ", ");
        if (keepJobFlowAliveWhenNoSteps != null) sb.append("KeepJobFlowAliveWhenNoSteps: " + keepJobFlowAliveWhenNoSteps + ", ");
        if (terminationProtected != null) sb.append("TerminationProtected: " + terminationProtected + ", ");
        if (hadoopVersion != null) sb.append("HadoopVersion: " + hadoopVersion + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMasterInstanceType() == null) ? 0 : getMasterInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getMasterPublicDnsName() == null) ? 0 : getMasterPublicDnsName().hashCode()); 
        hashCode = prime * hashCode + ((getMasterInstanceId() == null) ? 0 : getMasterInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getSlaveInstanceType() == null) ? 0 : getSlaveInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode()); 
        hashCode = prime * hashCode + ((getNormalizedInstanceHours() == null) ? 0 : getNormalizedInstanceHours().hashCode()); 
        hashCode = prime * hashCode + ((getEc2KeyName() == null) ? 0 : getEc2KeyName().hashCode()); 
        hashCode = prime * hashCode + ((getEc2SubnetId() == null) ? 0 : getEc2SubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode()); 
        hashCode = prime * hashCode + ((isKeepJobFlowAliveWhenNoSteps() == null) ? 0 : isKeepJobFlowAliveWhenNoSteps().hashCode()); 
        hashCode = prime * hashCode + ((isTerminationProtected() == null) ? 0 : isTerminationProtected().hashCode()); 
        hashCode = prime * hashCode + ((getHadoopVersion() == null) ? 0 : getHadoopVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof JobFlowInstancesDetail == false) return false;
        JobFlowInstancesDetail other = (JobFlowInstancesDetail)obj;
        
        if (other.getMasterInstanceType() == null ^ this.getMasterInstanceType() == null) return false;
        if (other.getMasterInstanceType() != null && other.getMasterInstanceType().equals(this.getMasterInstanceType()) == false) return false; 
        if (other.getMasterPublicDnsName() == null ^ this.getMasterPublicDnsName() == null) return false;
        if (other.getMasterPublicDnsName() != null && other.getMasterPublicDnsName().equals(this.getMasterPublicDnsName()) == false) return false; 
        if (other.getMasterInstanceId() == null ^ this.getMasterInstanceId() == null) return false;
        if (other.getMasterInstanceId() != null && other.getMasterInstanceId().equals(this.getMasterInstanceId()) == false) return false; 
        if (other.getSlaveInstanceType() == null ^ this.getSlaveInstanceType() == null) return false;
        if (other.getSlaveInstanceType() != null && other.getSlaveInstanceType().equals(this.getSlaveInstanceType()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null) return false;
        if (other.getInstanceGroups() != null && other.getInstanceGroups().equals(this.getInstanceGroups()) == false) return false; 
        if (other.getNormalizedInstanceHours() == null ^ this.getNormalizedInstanceHours() == null) return false;
        if (other.getNormalizedInstanceHours() != null && other.getNormalizedInstanceHours().equals(this.getNormalizedInstanceHours()) == false) return false; 
        if (other.getEc2KeyName() == null ^ this.getEc2KeyName() == null) return false;
        if (other.getEc2KeyName() != null && other.getEc2KeyName().equals(this.getEc2KeyName()) == false) return false; 
        if (other.getEc2SubnetId() == null ^ this.getEc2SubnetId() == null) return false;
        if (other.getEc2SubnetId() != null && other.getEc2SubnetId().equals(this.getEc2SubnetId()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
        if (other.isKeepJobFlowAliveWhenNoSteps() == null ^ this.isKeepJobFlowAliveWhenNoSteps() == null) return false;
        if (other.isKeepJobFlowAliveWhenNoSteps() != null && other.isKeepJobFlowAliveWhenNoSteps().equals(this.isKeepJobFlowAliveWhenNoSteps()) == false) return false; 
        if (other.isTerminationProtected() == null ^ this.isTerminationProtected() == null) return false;
        if (other.isTerminationProtected() != null && other.isTerminationProtected().equals(this.isTerminationProtected()) == false) return false; 
        if (other.getHadoopVersion() == null ^ this.getHadoopVersion() == null) return false;
        if (other.getHadoopVersion() != null && other.getHadoopVersion().equals(this.getHadoopVersion()) == false) return false; 
        return true;
    }
    
}
    