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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#detachElasticLoadBalancer(DetachElasticLoadBalancerRequest) DetachElasticLoadBalancer operation}.
 * <p>
 * Detaches a specified Elastic Load Balancing instance from its layer.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#detachElasticLoadBalancer(DetachElasticLoadBalancerRequest)
 */
public class DetachElasticLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Elastic Load Balancing instance's name.
     */
    private String elasticLoadBalancerName;

    /**
     * The ID of the layer that the Elastic Load Balancing instance is
     * attached to.
     */
    private String layerId;

    /**
     * The Elastic Load Balancing instance's name.
     *
     * @return The Elastic Load Balancing instance's name.
     */
    public String getElasticLoadBalancerName() {
        return elasticLoadBalancerName;
    }
    
    /**
     * The Elastic Load Balancing instance's name.
     *
     * @param elasticLoadBalancerName The Elastic Load Balancing instance's name.
     */
    public void setElasticLoadBalancerName(String elasticLoadBalancerName) {
        this.elasticLoadBalancerName = elasticLoadBalancerName;
    }
    
    /**
     * The Elastic Load Balancing instance's name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticLoadBalancerName The Elastic Load Balancing instance's name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DetachElasticLoadBalancerRequest withElasticLoadBalancerName(String elasticLoadBalancerName) {
        this.elasticLoadBalancerName = elasticLoadBalancerName;
        return this;
    }

    /**
     * The ID of the layer that the Elastic Load Balancing instance is
     * attached to.
     *
     * @return The ID of the layer that the Elastic Load Balancing instance is
     *         attached to.
     */
    public String getLayerId() {
        return layerId;
    }
    
    /**
     * The ID of the layer that the Elastic Load Balancing instance is
     * attached to.
     *
     * @param layerId The ID of the layer that the Elastic Load Balancing instance is
     *         attached to.
     */
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }
    
    /**
     * The ID of the layer that the Elastic Load Balancing instance is
     * attached to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerId The ID of the layer that the Elastic Load Balancing instance is
     *         attached to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DetachElasticLoadBalancerRequest withLayerId(String layerId) {
        this.layerId = layerId;
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
        if (getElasticLoadBalancerName() != null) sb.append("ElasticLoadBalancerName: " + getElasticLoadBalancerName() + ",");
        if (getLayerId() != null) sb.append("LayerId: " + getLayerId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getElasticLoadBalancerName() == null) ? 0 : getElasticLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DetachElasticLoadBalancerRequest == false) return false;
        DetachElasticLoadBalancerRequest other = (DetachElasticLoadBalancerRequest)obj;
        
        if (other.getElasticLoadBalancerName() == null ^ this.getElasticLoadBalancerName() == null) return false;
        if (other.getElasticLoadBalancerName() != null && other.getElasticLoadBalancerName().equals(this.getElasticLoadBalancerName()) == false) return false; 
        if (other.getLayerId() == null ^ this.getLayerId() == null) return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false) return false; 
        return true;
    }
    
}
    