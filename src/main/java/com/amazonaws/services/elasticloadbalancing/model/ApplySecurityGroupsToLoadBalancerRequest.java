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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#applySecurityGroupsToLoadBalancer(ApplySecurityGroupsToLoadBalancerRequest) ApplySecurityGroupsToLoadBalancer operation}.
 * <p>
 * Associates one or more security groups with your load balancer in Amazon Virtual Private Cloud (Amazon VPC). The provided security group IDs will
 * override any currently applied security groups.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/USVPC_ApplySG.html"> Manage Security Groups
 * in Amazon VPC </a> in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#applySecurityGroupsToLoadBalancer(ApplySecurityGroupsToLoadBalancerRequest)
 */
public class ApplySecurityGroupsToLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name associated with the load balancer. The name must be unique
     * within the set of load balancers associated with your AWS account.
     */
    private String loadBalancerName;

    /**
     * A list of security group IDs to associate with your load balancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * The name associated with the load balancer. The name must be unique
     * within the set of load balancers associated with your AWS account.
     *
     * @return The name associated with the load balancer. The name must be unique
     *         within the set of load balancers associated with your AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer. The name must be unique
     * within the set of load balancers associated with your AWS account.
     *
     * @param loadBalancerName The name associated with the load balancer. The name must be unique
     *         within the set of load balancers associated with your AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer. The name must be unique
     * within the set of load balancers associated with your AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the load balancer. The name must be unique
     *         within the set of load balancers associated with your AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplySecurityGroupsToLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * A list of security group IDs to associate with your load balancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     *
     * @return A list of security group IDs to associate with your load balancer in
     *         VPC. The security group IDs must be provided as the ID and not the
     *         security group name (For example, sg-1234).
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * A list of security group IDs to associate with your load balancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     *
     * @param securityGroups A list of security group IDs to associate with your load balancer in
     *         VPC. The security group IDs must be provided as the ID and not the
     *         security group name (For example, sg-1234).
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
     * A list of security group IDs to associate with your load balancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of security group IDs to associate with your load balancer in
     *         VPC. The security group IDs must be provided as the ID and not the
     *         security group name (For example, sg-1234).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplySecurityGroupsToLoadBalancerRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of security group IDs to associate with your load balancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of security group IDs to associate with your load balancer in
     *         VPC. The security group IDs must be provided as the ID and not the
     *         security group name (For example, sg-1234).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplySecurityGroupsToLoadBalancerRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
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
        if (getLoadBalancerName() != null) sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ApplySecurityGroupsToLoadBalancerRequest == false) return false;
        ApplySecurityGroupsToLoadBalancerRequest other = (ApplySecurityGroupsToLoadBalancerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        return true;
    }
    
}
    