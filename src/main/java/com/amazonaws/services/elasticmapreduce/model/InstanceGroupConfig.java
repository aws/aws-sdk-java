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
 * Configuration defining a new instance group.
 * </p>
 */
public class InstanceGroupConfig {

    /**
     * Friendly name given to the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String name;

    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND
     */
    private String market;

    /**
     * The role of the instance group in the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     */
    private String instanceRole;

    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceType;

    /**
     * Target number of instances for the instance group.
     */
    private Integer instanceCount;

    /**
     * Default constructor for a new InstanceGroupConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public InstanceGroupConfig() {}
    
    /**
     * Constructs a new InstanceGroupConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param market Market type of the Amazon EC2 instances used to create a
     * cluster node.
     * @param instanceRole The role of the instance group in the cluster.
     * @param instanceType The Amazon EC2 instance type for all instances in
     * the instance group.
     * @param instanceCount Target number of instances for the instance
     * group.
     */
    public InstanceGroupConfig(String market, String instanceRole, String instanceType, Integer instanceCount) {
        this.market = market;
        this.instanceRole = instanceRole;
        this.instanceType = instanceType;
        this.instanceCount = instanceCount;
    }
    
    /**
     * Friendly name given to the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Friendly name given to the instance group.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Friendly name given to the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Friendly name given to the instance group.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Friendly name given to the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Friendly name given to the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceGroupConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND
     *
     * @return Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * @see MarketType
     */
    public String getMarket() {
        return market;
    }
    
    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND
     *
     * @param market Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * @see MarketType
     */
    public void setMarket(String market) {
        this.market = market;
    }
    
    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND
     *
     * @param market Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see MarketType
     */
    public InstanceGroupConfig withMarket(String market) {
        this.market = market;
        return this;
    }
    
    
    /**
     * The role of the instance group in the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @return The role of the instance group in the cluster.
     *
     * @see InstanceRoleType
     */
    public String getInstanceRole() {
        return instanceRole;
    }
    
    /**
     * The role of the instance group in the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole The role of the instance group in the cluster.
     *
     * @see InstanceRoleType
     */
    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }
    
    /**
     * The role of the instance group in the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole The role of the instance group in the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceRoleType
     */
    public InstanceGroupConfig withInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
        return this;
    }
    
    
    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon EC2 instance type for all instances in the instance group.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The Amazon EC2 instance type for all instances in the instance group.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The Amazon EC2 instance type for all instances in the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceGroupConfig withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    
    /**
     * Target number of instances for the instance group.
     *
     * @return Target number of instances for the instance group.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * Target number of instances for the instance group.
     *
     * @param instanceCount Target number of instances for the instance group.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * Target number of instances for the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount Target number of instances for the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceGroupConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
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
        sb.append("Name: " + name + ", ");
        sb.append("Market: " + market + ", ");
        sb.append("InstanceRole: " + instanceRole + ", ");
        sb.append("InstanceType: " + instanceType + ", ");
        sb.append("InstanceCount: " + instanceCount + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    