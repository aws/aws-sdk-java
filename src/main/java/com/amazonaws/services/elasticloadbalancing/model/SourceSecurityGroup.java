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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * <p>
 * This data type is used as a response element in the
 * DescribeLoadBalancers action. For information about Elastic Load
 * Balancing security groups, go to <a
 * /DeveloperGuide/elb-security-features.html#using-elb-security-groups">
 * Using Security Groups With Elastic Load Balancing </a> in the
 * <i>Elastic Load Balancing Developer Guide</i> .
 * 
 * </p>
 */
public class SourceSecurityGroup {

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
        sb.append("OwnerAlias: " + ownerAlias + ", ");
        sb.append("GroupName: " + groupName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    