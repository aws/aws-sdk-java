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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes association information for an Elastic IP address (IPv4).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceNetworkInterfaceAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceNetworkInterfaceAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the owner of the Elastic IP address.
     * </p>
     */
    private String ipOwnerId;
    /**
     * <p>
     * The public DNS name.
     * </p>
     */
    private String publicDnsName;
    /**
     * <p>
     * The public IP address or Elastic IP address bound to the network interface.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * The ID of the owner of the Elastic IP address.
     * </p>
     * 
     * @param ipOwnerId
     *        The ID of the owner of the Elastic IP address.
     */

    public void setIpOwnerId(String ipOwnerId) {
        this.ipOwnerId = ipOwnerId;
    }

    /**
     * <p>
     * The ID of the owner of the Elastic IP address.
     * </p>
     * 
     * @return The ID of the owner of the Elastic IP address.
     */

    public String getIpOwnerId() {
        return this.ipOwnerId;
    }

    /**
     * <p>
     * The ID of the owner of the Elastic IP address.
     * </p>
     * 
     * @param ipOwnerId
     *        The ID of the owner of the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterfaceAssociation withIpOwnerId(String ipOwnerId) {
        setIpOwnerId(ipOwnerId);
        return this;
    }

    /**
     * <p>
     * The public DNS name.
     * </p>
     * 
     * @param publicDnsName
     *        The public DNS name.
     */

    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    /**
     * <p>
     * The public DNS name.
     * </p>
     * 
     * @return The public DNS name.
     */

    public String getPublicDnsName() {
        return this.publicDnsName;
    }

    /**
     * <p>
     * The public DNS name.
     * </p>
     * 
     * @param publicDnsName
     *        The public DNS name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterfaceAssociation withPublicDnsName(String publicDnsName) {
        setPublicDnsName(publicDnsName);
        return this;
    }

    /**
     * <p>
     * The public IP address or Elastic IP address bound to the network interface.
     * </p>
     * 
     * @param publicIp
     *        The public IP address or Elastic IP address bound to the network interface.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The public IP address or Elastic IP address bound to the network interface.
     * </p>
     * 
     * @return The public IP address or Elastic IP address bound to the network interface.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The public IP address or Elastic IP address bound to the network interface.
     * </p>
     * 
     * @param publicIp
     *        The public IP address or Elastic IP address bound to the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterfaceAssociation withPublicIp(String publicIp) {
        setPublicIp(publicIp);
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
        if (getIpOwnerId() != null)
            sb.append("IpOwnerId: ").append(getIpOwnerId()).append(",");
        if (getPublicDnsName() != null)
            sb.append("PublicDnsName: ").append(getPublicDnsName()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceNetworkInterfaceAssociation == false)
            return false;
        InstanceNetworkInterfaceAssociation other = (InstanceNetworkInterfaceAssociation) obj;
        if (other.getIpOwnerId() == null ^ this.getIpOwnerId() == null)
            return false;
        if (other.getIpOwnerId() != null && other.getIpOwnerId().equals(this.getIpOwnerId()) == false)
            return false;
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null)
            return false;
        if (other.getPublicDnsName() != null && other.getPublicDnsName().equals(this.getPublicDnsName()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpOwnerId() == null) ? 0 : getIpOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public InstanceNetworkInterfaceAssociation clone() {
        try {
            return (InstanceNetworkInterfaceAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
