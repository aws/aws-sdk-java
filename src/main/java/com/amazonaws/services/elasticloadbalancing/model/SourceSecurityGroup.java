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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;


/**
 * <p>
 * This data type is used as a response element in the DescribeLoadBalancers action. For information about Elastic Load Balancing security groups, go to
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-security-features.html#using-elb-security-groups"> Using Security
 * Groups With Elastic Load Balancing </a> in the <i>Elastic Load Balancing Developer Guide</i> .
 * 
 * </p>
 */
public class SourceSecurityGroup implements Serializable {

    /**
     * Owner of the source security group. Use this value for the
     * <code>--source-group-user</code> parameter of the
     * <code>ec2-authorize</code> command in the Amazon EC2 command line
     * tool.
     */
    private String ownerAlias;

    /**
     * Name of the source security group. Use this value for the
     * <code>--source-group</code> parameter of the
     * <code>ec2-authorize</code> command in the Amazon EC2 command line
     * tool.
     */
    private String groupName;

    /**
     * Owner of the source security group. Use this value for the
     * <code>--source-group-user</code> parameter of the
     * <code>ec2-authorize</code> command in the Amazon EC2 command line
     * tool.
     *
     * @return Owner of the source security group. Use this value for the
     *         <code>--source-group-user</code> parameter of the
     *         <code>ec2-authorize</code> command in the Amazon EC2 command line
     *         tool.
     */
    public String getOwnerAlias() {
        return ownerAlias;
    }
    
    /**
     * Owner of the source security group. Use this value for the
     * <code>--source-group-user</code> parameter of the
     * <code>ec2-authorize</code> command in the Amazon EC2 command line
     * tool.
     *
     * @param ownerAlias Owner of the source security group. Use this value for the
     *         <code>--source-group-user</code> parameter of the
     *         <code>ec2-authorize</code> command in the Amazon EC2 command line
     *         tool.
     */
    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }
    
    /**
     * Owner of the source security group. Use this value for the
     * <code>--source-group-user</code> parameter of the
     * <code>ec2-authorize</code> command in the Amazon EC2 command line
     * tool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAlias Owner of the source security group. Use this value for the
     *         <code>--source-group-user</code> parameter of the
     *         <code>ec2-authorize</code> command in the Amazon EC2 command line
     *         tool.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceSecurityGroup withOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
        return this;
    }

    /**
     * Name of the source security group. Use this value for the
     * <code>--source-group</code> parameter of the
     * <code>ec2-authorize</code> command in the Amazon EC2 command line
     * tool.
     *
     * @return Name of the source security group. Use this value for the
     *         <code>--source-group</code> parameter of the
     *         <code>ec2-authorize</code> command in the Amazon EC2 command line
     *         tool.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * Name of the source security group. Use this value for the
     * <code>--source-group</code> parameter of the
     * <code>ec2-authorize</code> command in the Amazon EC2 command line
     * tool.
     *
     * @param groupName Name of the source security group. Use this value for the
     *         <code>--source-group</code> parameter of the
     *         <code>ec2-authorize</code> command in the Amazon EC2 command line
     *         tool.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * Name of the source security group. Use this value for the
     * <code>--source-group</code> parameter of the
     * <code>ec2-authorize</code> command in the Amazon EC2 command line
     * tool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName Name of the source security group. Use this value for the
     *         <code>--source-group</code> parameter of the
     *         <code>ec2-authorize</code> command in the Amazon EC2 command line
     *         tool.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceSecurityGroup withGroupName(String groupName) {
        this.groupName = groupName;
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
        if (getOwnerAlias() != null) sb.append("OwnerAlias: " + getOwnerAlias() + ",");
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode()); 
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SourceSecurityGroup == false) return false;
        SourceSecurityGroup other = (SourceSecurityGroup)obj;
        
        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null) return false;
        if (other.getOwnerAlias() != null && other.getOwnerAlias().equals(this.getOwnerAlias()) == false) return false; 
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        return true;
    }
    
}
    