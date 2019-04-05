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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for EnableAvailabilityZonesForLoadBalancer.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/EnableAvailabilityZonesForLoadBalancer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableAvailabilityZonesForLoadBalancerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;

    /**
     * Default constructor for EnableAvailabilityZonesForLoadBalancerRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize the object after creating it.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest() {
    }

    /**
     * Constructs a new EnableAvailabilityZonesForLoadBalancerRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize any additional object members.
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @param availabilityZones
     *        The Availability Zones. These must be in the same region as the load balancer.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest(String loadBalancerName, java.util.List<String> availabilityZones) {
        setLoadBalancerName(loadBalancerName);
        setAvailabilityZones(availabilityZones);
    }

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

    public EnableAvailabilityZonesForLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load balancer.
     * </p>
     * 
     * @return The Availability Zones. These must be in the same region as the load balancer.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load balancer.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones. These must be in the same region as the load balancer.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones. These must be in the same region as the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load balancer.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones. These must be in the same region as the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableAvailabilityZonesForLoadBalancerRequest == false)
            return false;
        EnableAvailabilityZonesForLoadBalancerRequest other = (EnableAvailabilityZonesForLoadBalancerRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public EnableAvailabilityZonesForLoadBalancerRequest clone() {
        return (EnableAvailabilityZonesForLoadBalancerRequest) super.clone();
    }

}
