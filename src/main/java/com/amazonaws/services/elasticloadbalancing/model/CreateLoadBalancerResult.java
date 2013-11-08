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
 * The output for the CreateLoadBalancer action.
 * </p>
 */
public class CreateLoadBalancerResult implements Serializable {

    /**
     * The DNS name for the load balancer.
     */
    private String dNSName;

    /**
     * The DNS name for the load balancer.
     *
     * @return The DNS name for the load balancer.
     */
    public String getDNSName() {
        return dNSName;
    }
    
    /**
     * The DNS name for the load balancer.
     *
     * @param dNSName The DNS name for the load balancer.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }
    
    /**
     * The DNS name for the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dNSName The DNS name for the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLoadBalancerResult withDNSName(String dNSName) {
        this.dNSName = dNSName;
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
        if (getDNSName() != null) sb.append("DNSName: " + getDNSName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateLoadBalancerResult == false) return false;
        CreateLoadBalancerResult other = (CreateLoadBalancerResult)obj;
        
        if (other.getDNSName() == null ^ this.getDNSName() == null) return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false) return false; 
        return true;
    }
    
}
    