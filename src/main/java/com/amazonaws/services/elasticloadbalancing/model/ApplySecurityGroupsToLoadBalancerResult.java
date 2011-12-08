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
 * The out for the ApplySecurityGroupsToLoadBalancer action.
 * </p>
 */
public class ApplySecurityGroupsToLoadBalancerResult {

    /**
     * A list of security group IDs associated with your LoadBalancer.
     */
    private java.util.List<String> securityGroups;

    /**
     * A list of security group IDs associated with your LoadBalancer.
     *
     * @return A list of security group IDs associated with your LoadBalancer.
     */
    public java.util.List<String> getSecurityGroups() {
        
        if (securityGroups == null) {
            securityGroups = new java.util.ArrayList<String>();
        }
        return securityGroups;
    }
    
    /**
     * A list of security group IDs associated with your LoadBalancer.
     *
     * @param securityGroups A list of security group IDs associated with your LoadBalancer.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>();
        if (securityGroups != null) {
            securityGroupsCopy.addAll(securityGroups);
        }
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * A list of security group IDs associated with your LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of security group IDs associated with your LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplySecurityGroupsToLoadBalancerResult withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>());
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of security group IDs associated with your LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of security group IDs associated with your LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplySecurityGroupsToLoadBalancerResult withSecurityGroups(java.util.Collection<String> securityGroups) {
        java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>();
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
    