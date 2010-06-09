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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Create Load Balancer Result
 */
public class CreateLoadBalancerResult {

    private String dNSName;

    /**
     * Returns the value of the DNSName property for this object.
     *
     * @return The value of the DNSName property for this object.
     */
    public String getDNSName() {
        return dNSName;
    }
    
    /**
     * Sets the value of the DNSName property for this object.
     *
     * @param dNSName The new value for the DNSName property for this object.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }
    
    /**
     * Sets the value of the DNSName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dNSName The new value for the DNSName property for this object.
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
        
        sb.append("DNSName: " + dNSName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    