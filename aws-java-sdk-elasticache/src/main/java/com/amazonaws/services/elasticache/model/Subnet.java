/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the subnet associated with a cluster. This parameter refers to subnets defined in Amazon Virtual Private
 * Cloud (Amazon VPC) and used with ElastiCache.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/Subnet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subnet implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     */
    private String subnetIdentifier;
    /**
     * <p>
     * The Availability Zone associated with the subnet.
     * </p>
     */
    private AvailabilityZone subnetAvailabilityZone;
    /**
     * <p>
     * The outpost ARN of the subnet.
     * </p>
     */
    private SubnetOutpost subnetOutpost;
    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedNetworkTypes;

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     * 
     * @param subnetIdentifier
     *        The unique identifier for the subnet.
     */

    public void setSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     * 
     * @return The unique identifier for the subnet.
     */

    public String getSubnetIdentifier() {
        return this.subnetIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     * 
     * @param subnetIdentifier
     *        The unique identifier for the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withSubnetIdentifier(String subnetIdentifier) {
        setSubnetIdentifier(subnetIdentifier);
        return this;
    }

    /**
     * <p>
     * The Availability Zone associated with the subnet.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The Availability Zone associated with the subnet.
     */

    public void setSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone associated with the subnet.
     * </p>
     * 
     * @return The Availability Zone associated with the subnet.
     */

    public AvailabilityZone getSubnetAvailabilityZone() {
        return this.subnetAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone associated with the subnet.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The Availability Zone associated with the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        setSubnetAvailabilityZone(subnetAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The outpost ARN of the subnet.
     * </p>
     * 
     * @param subnetOutpost
     *        The outpost ARN of the subnet.
     */

    public void setSubnetOutpost(SubnetOutpost subnetOutpost) {
        this.subnetOutpost = subnetOutpost;
    }

    /**
     * <p>
     * The outpost ARN of the subnet.
     * </p>
     * 
     * @return The outpost ARN of the subnet.
     */

    public SubnetOutpost getSubnetOutpost() {
        return this.subnetOutpost;
    }

    /**
     * <p>
     * The outpost ARN of the subnet.
     * </p>
     * 
     * @param subnetOutpost
     *        The outpost ARN of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withSubnetOutpost(SubnetOutpost subnetOutpost) {
        setSubnetOutpost(subnetOutpost);
        return this;
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * 
     * @return Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *         using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *         href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @see NetworkType
     */

    public java.util.List<String> getSupportedNetworkTypes() {
        if (supportedNetworkTypes == null) {
            supportedNetworkTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedNetworkTypes;
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * 
     * @param supportedNetworkTypes
     *        Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *        using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *        href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @see NetworkType
     */

    public void setSupportedNetworkTypes(java.util.Collection<String> supportedNetworkTypes) {
        if (supportedNetworkTypes == null) {
            this.supportedNetworkTypes = null;
            return;
        }

        this.supportedNetworkTypes = new com.amazonaws.internal.SdkInternalList<String>(supportedNetworkTypes);
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedNetworkTypes(java.util.Collection)} or
     * {@link #withSupportedNetworkTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedNetworkTypes
     *        Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *        using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *        href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkType
     */

    public Subnet withSupportedNetworkTypes(String... supportedNetworkTypes) {
        if (this.supportedNetworkTypes == null) {
            setSupportedNetworkTypes(new com.amazonaws.internal.SdkInternalList<String>(supportedNetworkTypes.length));
        }
        for (String ele : supportedNetworkTypes) {
            this.supportedNetworkTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * 
     * @param supportedNetworkTypes
     *        Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *        using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *        href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkType
     */

    public Subnet withSupportedNetworkTypes(java.util.Collection<String> supportedNetworkTypes) {
        setSupportedNetworkTypes(supportedNetworkTypes);
        return this;
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * 
     * @param supportedNetworkTypes
     *        Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *        using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *        href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkType
     */

    public Subnet withSupportedNetworkTypes(NetworkType... supportedNetworkTypes) {
        com.amazonaws.internal.SdkInternalList<String> supportedNetworkTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                supportedNetworkTypes.length);
        for (NetworkType value : supportedNetworkTypes) {
            supportedNetworkTypesCopy.add(value.toString());
        }
        if (getSupportedNetworkTypes() == null) {
            setSupportedNetworkTypes(supportedNetworkTypesCopy);
        } else {
            getSupportedNetworkTypes().addAll(supportedNetworkTypesCopy);
        }
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
        if (getSubnetIdentifier() != null)
            sb.append("SubnetIdentifier: ").append(getSubnetIdentifier()).append(",");
        if (getSubnetAvailabilityZone() != null)
            sb.append("SubnetAvailabilityZone: ").append(getSubnetAvailabilityZone()).append(",");
        if (getSubnetOutpost() != null)
            sb.append("SubnetOutpost: ").append(getSubnetOutpost()).append(",");
        if (getSupportedNetworkTypes() != null)
            sb.append("SupportedNetworkTypes: ").append(getSupportedNetworkTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subnet == false)
            return false;
        Subnet other = (Subnet) obj;
        if (other.getSubnetIdentifier() == null ^ this.getSubnetIdentifier() == null)
            return false;
        if (other.getSubnetIdentifier() != null && other.getSubnetIdentifier().equals(this.getSubnetIdentifier()) == false)
            return false;
        if (other.getSubnetAvailabilityZone() == null ^ this.getSubnetAvailabilityZone() == null)
            return false;
        if (other.getSubnetAvailabilityZone() != null && other.getSubnetAvailabilityZone().equals(this.getSubnetAvailabilityZone()) == false)
            return false;
        if (other.getSubnetOutpost() == null ^ this.getSubnetOutpost() == null)
            return false;
        if (other.getSubnetOutpost() != null && other.getSubnetOutpost().equals(this.getSubnetOutpost()) == false)
            return false;
        if (other.getSupportedNetworkTypes() == null ^ this.getSupportedNetworkTypes() == null)
            return false;
        if (other.getSupportedNetworkTypes() != null && other.getSupportedNetworkTypes().equals(this.getSupportedNetworkTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIdentifier() == null) ? 0 : getSubnetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSubnetAvailabilityZone() == null) ? 0 : getSubnetAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getSubnetOutpost() == null) ? 0 : getSubnetOutpost().hashCode());
        hashCode = prime * hashCode + ((getSupportedNetworkTypes() == null) ? 0 : getSupportedNetworkTypes().hashCode());
        return hashCode;
    }

    @Override
    public Subnet clone() {
        try {
            return (Subnet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
