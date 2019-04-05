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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyLoadBalancerAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyLoadBalancerAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     */
    private String loadBalancerArn;
    /**
     * <p>
     * The load balancer attributes.
     * </p>
     */
    private java.util.List<LoadBalancerAttribute> attributes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     */

    public void setLoadBalancerArn(String loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the load balancer.
     */

    public String getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyLoadBalancerAttributesRequest withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The load balancer attributes.
     * </p>
     * 
     * @return The load balancer attributes.
     */

    public java.util.List<LoadBalancerAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The load balancer attributes.
     * </p>
     * 
     * @param attributes
     *        The load balancer attributes.
     */

    public void setAttributes(java.util.Collection<LoadBalancerAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<LoadBalancerAttribute>(attributes);
    }

    /**
     * <p>
     * The load balancer attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The load balancer attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyLoadBalancerAttributesRequest withAttributes(LoadBalancerAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<LoadBalancerAttribute>(attributes.length));
        }
        for (LoadBalancerAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The load balancer attributes.
     * </p>
     * 
     * @param attributes
     *        The load balancer attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyLoadBalancerAttributesRequest withAttributes(java.util.Collection<LoadBalancerAttribute> attributes) {
        setAttributes(attributes);
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
        if (getLoadBalancerArn() != null)
            sb.append("LoadBalancerArn: ").append(getLoadBalancerArn()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyLoadBalancerAttributesRequest == false)
            return false;
        ModifyLoadBalancerAttributesRequest other = (ModifyLoadBalancerAttributesRequest) obj;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ModifyLoadBalancerAttributesRequest clone() {
        return (ModifyLoadBalancerAttributesRequest) super.clone();
    }

}
