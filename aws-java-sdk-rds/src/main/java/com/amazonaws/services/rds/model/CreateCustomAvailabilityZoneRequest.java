/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateCustomAvailabilityZone" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomAvailabilityZoneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom Availability Zone (AZ).
     * </p>
     */
    private String customAvailabilityZoneName;
    /**
     * <p>
     * The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere
     * cluster.
     * </p>
     */
    private String existingVpnId;
    /**
     * <p>
     * The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * </p>
     */
    private String newVpnTunnelName;
    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * </p>
     */
    private String vpnTunnelOriginatorIP;

    /**
     * <p>
     * The name of the custom Availability Zone (AZ).
     * </p>
     * 
     * @param customAvailabilityZoneName
     *        The name of the custom Availability Zone (AZ).
     */

    public void setCustomAvailabilityZoneName(String customAvailabilityZoneName) {
        this.customAvailabilityZoneName = customAvailabilityZoneName;
    }

    /**
     * <p>
     * The name of the custom Availability Zone (AZ).
     * </p>
     * 
     * @return The name of the custom Availability Zone (AZ).
     */

    public String getCustomAvailabilityZoneName() {
        return this.customAvailabilityZoneName;
    }

    /**
     * <p>
     * The name of the custom Availability Zone (AZ).
     * </p>
     * 
     * @param customAvailabilityZoneName
     *        The name of the custom Availability Zone (AZ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomAvailabilityZoneRequest withCustomAvailabilityZoneName(String customAvailabilityZoneName) {
        setCustomAvailabilityZoneName(customAvailabilityZoneName);
        return this;
    }

    /**
     * <p>
     * The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere
     * cluster.
     * </p>
     * 
     * @param existingVpnId
     *        The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere
     *        cluster.
     */

    public void setExistingVpnId(String existingVpnId) {
        this.existingVpnId = existingVpnId;
    }

    /**
     * <p>
     * The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere
     * cluster.
     * </p>
     * 
     * @return The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere
     *         cluster.
     */

    public String getExistingVpnId() {
        return this.existingVpnId;
    }

    /**
     * <p>
     * The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere
     * cluster.
     * </p>
     * 
     * @param existingVpnId
     *        The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomAvailabilityZoneRequest withExistingVpnId(String existingVpnId) {
        setExistingVpnId(existingVpnId);
        return this;
    }

    /**
     * <p>
     * The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * </p>
     * 
     * @param newVpnTunnelName
     *        The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster.</p>
     *        <p>
     *        Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     */

    public void setNewVpnTunnelName(String newVpnTunnelName) {
        this.newVpnTunnelName = newVpnTunnelName;
    }

    /**
     * <p>
     * The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * </p>
     * 
     * @return The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster.</p>
     *         <p>
     *         Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     */

    public String getNewVpnTunnelName() {
        return this.newVpnTunnelName;
    }

    /**
     * <p>
     * The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * </p>
     * 
     * @param newVpnTunnelName
     *        The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster.</p>
     *        <p>
     *        Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomAvailabilityZoneRequest withNewVpnTunnelName(String newVpnTunnelName) {
        setNewVpnTunnelName(newVpnTunnelName);
        return this;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * </p>
     * 
     * @param vpnTunnelOriginatorIP
     *        The IP address of network traffic from your on-premises data center. A custom AZ receives the network
     *        traffic.</p>
     *        <p>
     *        Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     */

    public void setVpnTunnelOriginatorIP(String vpnTunnelOriginatorIP) {
        this.vpnTunnelOriginatorIP = vpnTunnelOriginatorIP;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * </p>
     * 
     * @return The IP address of network traffic from your on-premises data center. A custom AZ receives the network
     *         traffic.</p>
     *         <p>
     *         Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     */

    public String getVpnTunnelOriginatorIP() {
        return this.vpnTunnelOriginatorIP;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * </p>
     * 
     * @param vpnTunnelOriginatorIP
     *        The IP address of network traffic from your on-premises data center. A custom AZ receives the network
     *        traffic.</p>
     *        <p>
     *        Specify this parameter only if <code>ExistingVpnId</code> isn't specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomAvailabilityZoneRequest withVpnTunnelOriginatorIP(String vpnTunnelOriginatorIP) {
        setVpnTunnelOriginatorIP(vpnTunnelOriginatorIP);
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
        if (getCustomAvailabilityZoneName() != null)
            sb.append("CustomAvailabilityZoneName: ").append(getCustomAvailabilityZoneName()).append(",");
        if (getExistingVpnId() != null)
            sb.append("ExistingVpnId: ").append(getExistingVpnId()).append(",");
        if (getNewVpnTunnelName() != null)
            sb.append("NewVpnTunnelName: ").append(getNewVpnTunnelName()).append(",");
        if (getVpnTunnelOriginatorIP() != null)
            sb.append("VpnTunnelOriginatorIP: ").append(getVpnTunnelOriginatorIP());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomAvailabilityZoneRequest == false)
            return false;
        CreateCustomAvailabilityZoneRequest other = (CreateCustomAvailabilityZoneRequest) obj;
        if (other.getCustomAvailabilityZoneName() == null ^ this.getCustomAvailabilityZoneName() == null)
            return false;
        if (other.getCustomAvailabilityZoneName() != null && other.getCustomAvailabilityZoneName().equals(this.getCustomAvailabilityZoneName()) == false)
            return false;
        if (other.getExistingVpnId() == null ^ this.getExistingVpnId() == null)
            return false;
        if (other.getExistingVpnId() != null && other.getExistingVpnId().equals(this.getExistingVpnId()) == false)
            return false;
        if (other.getNewVpnTunnelName() == null ^ this.getNewVpnTunnelName() == null)
            return false;
        if (other.getNewVpnTunnelName() != null && other.getNewVpnTunnelName().equals(this.getNewVpnTunnelName()) == false)
            return false;
        if (other.getVpnTunnelOriginatorIP() == null ^ this.getVpnTunnelOriginatorIP() == null)
            return false;
        if (other.getVpnTunnelOriginatorIP() != null && other.getVpnTunnelOriginatorIP().equals(this.getVpnTunnelOriginatorIP()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomAvailabilityZoneName() == null) ? 0 : getCustomAvailabilityZoneName().hashCode());
        hashCode = prime * hashCode + ((getExistingVpnId() == null) ? 0 : getExistingVpnId().hashCode());
        hashCode = prime * hashCode + ((getNewVpnTunnelName() == null) ? 0 : getNewVpnTunnelName().hashCode());
        hashCode = prime * hashCode + ((getVpnTunnelOriginatorIP() == null) ? 0 : getVpnTunnelOriginatorIP().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomAvailabilityZoneRequest clone() {
        return (CreateCustomAvailabilityZoneRequest) super.clone();
    }

}
