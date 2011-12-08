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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#applySecurityGroupsToLoadBalancer(ApplySecurityGroupsToLoadBalancerRequest) ApplySecurityGroupsToLoadBalancer operation}.
 * <p>
 * Associates one or more security groups with your LoadBalancer in VPC.
 * The provided security group IDs will override any currently applied
 * security groups.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#applySecurityGroupsToLoadBalancer(ApplySecurityGroupsToLoadBalancerRequest)
 */
public class ApplySecurityGroupsToLoadBalancerRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * A list of security group IDs to associate with your LoadBalancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     */
    private java.util.List<String> securityGroups;

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @return The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplySecurityGroupsToLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * A list of security group IDs to associate with your LoadBalancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     *
     * @return A list of security group IDs to associate with your LoadBalancer in
     *         VPC. The security group IDs must be provided as the ID and not the
     *         security group name (For example, sg-1234).
     */
    public java.util.List<String> getSecurityGroups() {
        
        if (securityGroups == null) {
            securityGroups = new java.util.ArrayList<String>();
        }
        return securityGroups;
    }
    
    /**
     * A list of security group IDs to associate with your LoadBalancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     *
     * @param securityGroups A list of security group IDs to associate with your LoadBalancer in
     *         VPC. The security group IDs must be provided as the ID and not the
     *         security group name (For example, sg-1234).
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>();
        if (securityGroups != null) {
            securityGroupsCopy.addAll(securityGroups);
        }
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * A list of security group IDs to associate with your LoadBalancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of security group IDs to associate with your LoadBalancer in
     *         VPC. The security group IDs must be provided as the ID and not the
     *         security group name (For example, sg-1234).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplySecurityGroupsToLoadBalancerRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>());
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of security group IDs to associate with your LoadBalancer in
     * VPC. The security group IDs must be provided as the ID and not the
     * security group name (For example, sg-1234).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of security group IDs to associate with your LoadBalancer in
     *         VPC. The security group IDs must be provided as the ID and not the
     *         security group name (For example, sg-1234).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplySecurityGroupsToLoadBalancerRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
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
        sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        sb.append("SecurityGroups: " + securityGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    