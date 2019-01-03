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

/**
 * <p>
 * Information about an Availability Zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AvailabilityZone"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailabilityZone implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     */
    private String zoneName;
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * [Network Load Balancers] The static IP address.
     * </p>
     */
    private java.util.List<LoadBalancerAddress> loadBalancerAddresses;

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * 
     * @param zoneName
     *        The name of the Availability Zone.
     */

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * 
     * @return The name of the Availability Zone.
     */

    public String getZoneName() {
        return this.zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * 
     * @param zoneName
     *        The name of the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withZoneName(String zoneName) {
        setZoneName(zoneName);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * [Network Load Balancers] The static IP address.
     * </p>
     * 
     * @return [Network Load Balancers] The static IP address.
     */

    public java.util.List<LoadBalancerAddress> getLoadBalancerAddresses() {
        return loadBalancerAddresses;
    }

    /**
     * <p>
     * [Network Load Balancers] The static IP address.
     * </p>
     * 
     * @param loadBalancerAddresses
     *        [Network Load Balancers] The static IP address.
     */

    public void setLoadBalancerAddresses(java.util.Collection<LoadBalancerAddress> loadBalancerAddresses) {
        if (loadBalancerAddresses == null) {
            this.loadBalancerAddresses = null;
            return;
        }

        this.loadBalancerAddresses = new java.util.ArrayList<LoadBalancerAddress>(loadBalancerAddresses);
    }

    /**
     * <p>
     * [Network Load Balancers] The static IP address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerAddresses(java.util.Collection)} or
     * {@link #withLoadBalancerAddresses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param loadBalancerAddresses
     *        [Network Load Balancers] The static IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withLoadBalancerAddresses(LoadBalancerAddress... loadBalancerAddresses) {
        if (this.loadBalancerAddresses == null) {
            setLoadBalancerAddresses(new java.util.ArrayList<LoadBalancerAddress>(loadBalancerAddresses.length));
        }
        for (LoadBalancerAddress ele : loadBalancerAddresses) {
            this.loadBalancerAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [Network Load Balancers] The static IP address.
     * </p>
     * 
     * @param loadBalancerAddresses
     *        [Network Load Balancers] The static IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withLoadBalancerAddresses(java.util.Collection<LoadBalancerAddress> loadBalancerAddresses) {
        setLoadBalancerAddresses(loadBalancerAddresses);
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
        if (getZoneName() != null)
            sb.append("ZoneName: ").append(getZoneName()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getLoadBalancerAddresses() != null)
            sb.append("LoadBalancerAddresses: ").append(getLoadBalancerAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailabilityZone == false)
            return false;
        AvailabilityZone other = (AvailabilityZone) obj;
        if (other.getZoneName() == null ^ this.getZoneName() == null)
            return false;
        if (other.getZoneName() != null && other.getZoneName().equals(this.getZoneName()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLoadBalancerAddresses() == null ^ this.getLoadBalancerAddresses() == null)
            return false;
        if (other.getLoadBalancerAddresses() != null && other.getLoadBalancerAddresses().equals(this.getLoadBalancerAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getZoneName() == null) ? 0 : getZoneName().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerAddresses() == null) ? 0 : getLoadBalancerAddresses().hashCode());
        return hashCode;
    }

    @Override
    public AvailabilityZone clone() {
        try {
            return (AvailabilityZone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
