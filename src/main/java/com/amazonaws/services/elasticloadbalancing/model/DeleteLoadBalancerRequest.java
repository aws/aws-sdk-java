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
package com.amazonaws.services.elasticloadbalancing.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deleteLoadBalancer(DeleteLoadBalancerRequest) DeleteLoadBalancer operation}.
 * <p>
 * Deletes the specified LoadBalancer.
 * </p>
 * <p>
 * If attempting to recreate the LoadBalancer, the client must reconfigure all the settings. The DNS name associated with a deleted LoadBalancer will no
 * longer be usable. Once deleted, the name and associated DNS record of the LoadBalancer no longer exist and traffic sent to any of its IP addresses
 * will no longer be delivered to client instances. The client will not receive the same DNS name even if a new LoadBalancer with same LoadBalancerName
 * is created.
 * </p>
 * <p>
 * To successfully call this API, the client must provide the same account credentials as were used to create the LoadBalancer.
 * </p>
 * <p>
 * <b>NOTE:</b> By design, if the LoadBalancer does not exist or has already been deleted, DeleteLoadBalancer still succeeds.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deleteLoadBalancer(DeleteLoadBalancerRequest)
 */
public class DeleteLoadBalancerRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * Default constructor for a new DeleteLoadBalancerRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteLoadBalancerRequest() {}
    
    /**
     * Constructs a new DeleteLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name associated with the LoadBalancer. The
     * name must be unique within the client AWS account.
     */
    public DeleteLoadBalancerRequest(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    
    
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
    public DeleteLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
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
        if (loadBalancerName != null) sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DeleteLoadBalancerRequest == false) return false;
        DeleteLoadBalancerRequest other = (DeleteLoadBalancerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        return true;
    }
    
}
    