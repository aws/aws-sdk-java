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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to describe the Amazon EC2 security groups for your
 * account.
 * </p>
 */
public class DescribeSecurityGroupsRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of Amazon EC2 security groups to describe.
     */
    private java.util.List<String> groupNames;

    /**
     * The optional list of Amazon EC2 security groups to describe.
     *
     * @return The optional list of Amazon EC2 security groups to describe.
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new java.util.ArrayList<String>();
        }
        return groupNames;
    }
    
    /**
     * The optional list of Amazon EC2 security groups to describe.
     *
     * @param groupNames The optional list of Amazon EC2 security groups to describe.
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * The optional list of Amazon EC2 security groups to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The optional list of Amazon EC2 security groups to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsRequest withGroupNames(String... groupNames) {
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of Amazon EC2 security groups to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The optional list of Amazon EC2 security groups to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsRequest withGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;

        return this;
    }
    
}
    