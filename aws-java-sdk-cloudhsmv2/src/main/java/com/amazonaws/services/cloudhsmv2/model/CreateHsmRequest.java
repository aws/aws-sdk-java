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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateHsm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHsmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier (ID) of the HSM's cluster. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use
     * <a>DescribeClusters</a>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to the
     * Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen for you from
     * that subnet.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * The identifier (ID) of the HSM's cluster. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the HSM's cluster. To find the cluster ID, use <a>DescribeClusters</a>.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM's cluster. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @return The identifier (ID) of the HSM's cluster. To find the cluster ID, use <a>DescribeClusters</a>.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM's cluster. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the HSM's cluster. To find the cluster ID, use <a>DescribeClusters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use
     * <a>DescribeClusters</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use
     *        <a>DescribeClusters</a>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use
     * <a>DescribeClusters</a>.
     * </p>
     * 
     * @return The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use
     *         <a>DescribeClusters</a>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use
     * <a>DescribeClusters</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use
     *        <a>DescribeClusters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to the
     * Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen for you from
     * that subnet.
     * </p>
     * 
     * @param ipAddress
     *        The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to
     *        the Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen
     *        for you from that subnet.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to the
     * Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen for you from
     * that subnet.
     * </p>
     * 
     * @return The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to
     *         the Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen
     *         for you from that subnet.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to the
     * Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen for you from
     * that subnet.
     * </p>
     * 
     * @param ipAddress
     *        The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to
     *        the Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen
     *        for you from that subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHsmRequest == false)
            return false;
        CreateHsmRequest other = (CreateHsmRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public CreateHsmRequest clone() {
        return (CreateHsmRequest) super.clone();
    }

}
