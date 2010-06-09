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

/**
 * <p>
 * The result of describing the Amazon EC2 security groups for your
 * account.
 * </p>
 */
public class DescribeSecurityGroupsResult {

    /**
     * The list of described Amazon EC2 security groups.
     */
    private java.util.List<SecurityGroup> securityGroups;

    /**
     * The list of described Amazon EC2 security groups.
     *
     * @return The list of described Amazon EC2 security groups.
     */
    public java.util.List<SecurityGroup> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new java.util.ArrayList<SecurityGroup>();
        }
        return securityGroups;
    }
    
    /**
     * The list of described Amazon EC2 security groups.
     *
     * @param securityGroups The list of described Amazon EC2 security groups.
     */
    public void setSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
        java.util.List<SecurityGroup> securityGroupsCopy = new java.util.ArrayList<SecurityGroup>();
        if (securityGroups != null) {
            securityGroupsCopy.addAll(securityGroups);
        }
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * The list of described Amazon EC2 security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The list of described Amazon EC2 security groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsResult withSecurityGroups(SecurityGroup... securityGroups) {
        for (SecurityGroup value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * The list of described Amazon EC2 security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The list of described Amazon EC2 security groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsResult withSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
        java.util.List<SecurityGroup> securityGroupsCopy = new java.util.ArrayList<SecurityGroup>();
        if (securityGroups != null) {
            securityGroupsCopy.addAll(securityGroups);
        }
        this.securityGroups = securityGroupsCopy;

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
        
        sb.append("SecurityGroups: " + securityGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    