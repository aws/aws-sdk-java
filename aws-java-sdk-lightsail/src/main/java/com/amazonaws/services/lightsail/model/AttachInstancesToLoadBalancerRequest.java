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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachInstancesToLoadBalancer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachInstancesToLoadBalancerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach to your load balancer, aside from the
     * limit of Lightsail instances you can create in your account (20).
     * </p>
     */
    private java.util.List<String> instanceNames;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @return The name of the load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachInstancesToLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach to your load balancer, aside from the
     * limit of Lightsail instances you can create in your account (20).
     * </p>
     * 
     * @return An array of strings representing the instance name(s) you want to attach to your load balancer.</p>
     *         <p>
     *         An instance must be <code>running</code> before you can attach it to your load balancer.
     *         </p>
     *         <p>
     *         There are no additional limits on the number of instances you can attach to your load balancer, aside
     *         from the limit of Lightsail instances you can create in your account (20).
     */

    public java.util.List<String> getInstanceNames() {
        return instanceNames;
    }

    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach to your load balancer, aside from the
     * limit of Lightsail instances you can create in your account (20).
     * </p>
     * 
     * @param instanceNames
     *        An array of strings representing the instance name(s) you want to attach to your load balancer.</p>
     *        <p>
     *        An instance must be <code>running</code> before you can attach it to your load balancer.
     *        </p>
     *        <p>
     *        There are no additional limits on the number of instances you can attach to your load balancer, aside from
     *        the limit of Lightsail instances you can create in your account (20).
     */

    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }

        this.instanceNames = new java.util.ArrayList<String>(instanceNames);
    }

    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach to your load balancer, aside from the
     * limit of Lightsail instances you can create in your account (20).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceNames(java.util.Collection)} or {@link #withInstanceNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceNames
     *        An array of strings representing the instance name(s) you want to attach to your load balancer.</p>
     *        <p>
     *        An instance must be <code>running</code> before you can attach it to your load balancer.
     *        </p>
     *        <p>
     *        There are no additional limits on the number of instances you can attach to your load balancer, aside from
     *        the limit of Lightsail instances you can create in your account (20).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachInstancesToLoadBalancerRequest withInstanceNames(String... instanceNames) {
        if (this.instanceNames == null) {
            setInstanceNames(new java.util.ArrayList<String>(instanceNames.length));
        }
        for (String ele : instanceNames) {
            this.instanceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach to your load balancer, aside from the
     * limit of Lightsail instances you can create in your account (20).
     * </p>
     * 
     * @param instanceNames
     *        An array of strings representing the instance name(s) you want to attach to your load balancer.</p>
     *        <p>
     *        An instance must be <code>running</code> before you can attach it to your load balancer.
     *        </p>
     *        <p>
     *        There are no additional limits on the number of instances you can attach to your load balancer, aside from
     *        the limit of Lightsail instances you can create in your account (20).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachInstancesToLoadBalancerRequest withInstanceNames(java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
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
        if (getInstanceNames() != null)
            sb.append("InstanceNames: ").append(getInstanceNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachInstancesToLoadBalancerRequest == false)
            return false;
        AttachInstancesToLoadBalancerRequest other = (AttachInstancesToLoadBalancerRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null && other.getInstanceNames().equals(this.getInstanceNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        return hashCode;
    }

    @Override
    public AttachInstancesToLoadBalancerRequest clone() {
        return (AttachInstancesToLoadBalancerRequest) super.clone();
    }

}
