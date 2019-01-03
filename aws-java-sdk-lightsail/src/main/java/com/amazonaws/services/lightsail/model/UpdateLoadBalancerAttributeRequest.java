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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateLoadBalancerAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLoadBalancerAttributeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer that you want to modify (e.g., <code>my-load-balancer</code>.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The value that you want to specify for the attribute name.
     * </p>
     */
    private String attributeValue;

    /**
     * <p>
     * The name of the load balancer that you want to modify (e.g., <code>my-load-balancer</code>.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer that you want to modify (e.g., <code>my-load-balancer</code>.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer that you want to modify (e.g., <code>my-load-balancer</code>.
     * </p>
     * 
     * @return The name of the load balancer that you want to modify (e.g., <code>my-load-balancer</code>.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer that you want to modify (e.g., <code>my-load-balancer</code>.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer that you want to modify (e.g., <code>my-load-balancer</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoadBalancerAttributeRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute you want to update. Valid values are below.
     * @see LoadBalancerAttributeName
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * 
     * @return The name of the attribute you want to update. Valid values are below.
     * @see LoadBalancerAttributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute you want to update. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerAttributeName
     */

    public UpdateLoadBalancerAttributeRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute you want to update. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerAttributeName
     */

    public UpdateLoadBalancerAttributeRequest withAttributeName(LoadBalancerAttributeName attributeName) {
        this.attributeName = attributeName.toString();
        return this;
    }

    /**
     * <p>
     * The value that you want to specify for the attribute name.
     * </p>
     * 
     * @param attributeValue
     *        The value that you want to specify for the attribute name.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value that you want to specify for the attribute name.
     * </p>
     * 
     * @return The value that you want to specify for the attribute name.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The value that you want to specify for the attribute name.
     * </p>
     * 
     * @param attributeValue
     *        The value that you want to specify for the attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoadBalancerAttributeRequest withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append(getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLoadBalancerAttributeRequest == false)
            return false;
        UpdateLoadBalancerAttributeRequest other = (UpdateLoadBalancerAttributeRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLoadBalancerAttributeRequest clone() {
        return (UpdateLoadBalancerAttributeRequest) super.clone();
    }

}
