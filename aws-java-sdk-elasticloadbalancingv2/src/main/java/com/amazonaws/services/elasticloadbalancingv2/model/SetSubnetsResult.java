/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetSubnets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSubnetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the subnets.
     * </p>
     */
    private java.util.List<AvailabilityZone> availabilityZones;
    /**
     * <p>
     * [Network Load Balancers] The IP address type.
     * </p>
     */
    private String ipAddressType;

    /**
     * <p>
     * Information about the subnets.
     * </p>
     * 
     * @return Information about the subnets.
     */

    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * Information about the subnets.
     * </p>
     * 
     * @param availabilityZones
     *        Information about the subnets.
     */

    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * Information about the subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        Information about the subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubnetsResult withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<AvailabilityZone>(availabilityZones.length));
        }
        for (AvailabilityZone ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the subnets.
     * </p>
     * 
     * @param availabilityZones
     *        Information about the subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubnetsResult withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * [Network Load Balancers] The IP address type.
     * </p>
     * 
     * @param ipAddressType
     *        [Network Load Balancers] The IP address type.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * [Network Load Balancers] The IP address type.
     * </p>
     * 
     * @return [Network Load Balancers] The IP address type.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * [Network Load Balancers] The IP address type.
     * </p>
     * 
     * @param ipAddressType
     *        [Network Load Balancers] The IP address type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public SetSubnetsResult withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * [Network Load Balancers] The IP address type.
     * </p>
     * 
     * @param ipAddressType
     *        [Network Load Balancers] The IP address type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public SetSubnetsResult withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetSubnetsResult == false)
            return false;
        SetSubnetsResult other = (SetSubnetsResult) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        return hashCode;
    }

    @Override
    public SetSubnetsResult clone() {
        try {
            return (SetSubnetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
