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
 * The out for the ApplySecurityGroupsToLoadBalancer action.
 * </p>
 */
public class ApplySecurityGroupsToLoadBalancerResult implements Serializable {

    /**
     * A list of security group IDs associated with your load balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * A list of security group IDs associated with your load balancer.
     *
     * @return A list of security group IDs associated with your load balancer.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * A list of security group IDs associated with your load balancer.
     *
     * @param securityGroups A list of security group IDs associated with your load balancer.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * A list of security group IDs associated with your load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of security group IDs associated with your load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplySecurityGroupsToLoadBalancerResult withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of security group IDs associated with your load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of security group IDs associated with your load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplySecurityGroupsToLoadBalancerResult withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

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
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ApplySecurityGroupsToLoadBalancerResult == false) return false;
        ApplySecurityGroupsToLoadBalancerResult other = (ApplySecurityGroupsToLoadBalancerResult)obj;
        
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        return true;
    }
    
}
    