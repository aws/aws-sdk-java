/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DetachElasticLoadBalancer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachElasticLoadBalancerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Elastic Load Balancing instance's name.
     * </p>
     */
    private String elasticLoadBalancerName;
    /**
     * <p>
     * The ID of the layer that the Elastic Load Balancing instance is attached to.
     * </p>
     */
    private String layerId;

    /**
     * <p>
     * The Elastic Load Balancing instance's name.
     * </p>
     * 
     * @param elasticLoadBalancerName
     *        The Elastic Load Balancing instance's name.
     */

    public void setElasticLoadBalancerName(String elasticLoadBalancerName) {
        this.elasticLoadBalancerName = elasticLoadBalancerName;
    }

    /**
     * <p>
     * The Elastic Load Balancing instance's name.
     * </p>
     * 
     * @return The Elastic Load Balancing instance's name.
     */

    public String getElasticLoadBalancerName() {
        return this.elasticLoadBalancerName;
    }

    /**
     * <p>
     * The Elastic Load Balancing instance's name.
     * </p>
     * 
     * @param elasticLoadBalancerName
     *        The Elastic Load Balancing instance's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachElasticLoadBalancerRequest withElasticLoadBalancerName(String elasticLoadBalancerName) {
        setElasticLoadBalancerName(elasticLoadBalancerName);
        return this;
    }

    /**
     * <p>
     * The ID of the layer that the Elastic Load Balancing instance is attached to.
     * </p>
     * 
     * @param layerId
     *        The ID of the layer that the Elastic Load Balancing instance is attached to.
     */

    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    /**
     * <p>
     * The ID of the layer that the Elastic Load Balancing instance is attached to.
     * </p>
     * 
     * @return The ID of the layer that the Elastic Load Balancing instance is attached to.
     */

    public String getLayerId() {
        return this.layerId;
    }

    /**
     * <p>
     * The ID of the layer that the Elastic Load Balancing instance is attached to.
     * </p>
     * 
     * @param layerId
     *        The ID of the layer that the Elastic Load Balancing instance is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachElasticLoadBalancerRequest withLayerId(String layerId) {
        setLayerId(layerId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getElasticLoadBalancerName() != null)
            sb.append("ElasticLoadBalancerName: ").append(getElasticLoadBalancerName()).append(",");
        if (getLayerId() != null)
            sb.append("LayerId: ").append(getLayerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachElasticLoadBalancerRequest == false)
            return false;
        DetachElasticLoadBalancerRequest other = (DetachElasticLoadBalancerRequest) obj;
        if (other.getElasticLoadBalancerName() == null ^ this.getElasticLoadBalancerName() == null)
            return false;
        if (other.getElasticLoadBalancerName() != null && other.getElasticLoadBalancerName().equals(this.getElasticLoadBalancerName()) == false)
            return false;
        if (other.getLayerId() == null ^ this.getLayerId() == null)
            return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false)
            return false;
        return true;
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
    public DetachElasticLoadBalancerRequest clone() {
        return (DetachElasticLoadBalancerRequest) super.clone();
    }

}
