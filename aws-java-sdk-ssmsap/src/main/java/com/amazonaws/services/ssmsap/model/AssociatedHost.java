/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of the associated host.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/AssociatedHost" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatedHost implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the host.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     */
    private String ec2InstanceId;
    /**
     * <p>
     * The IP addresses of the associated host.
     * </p>
     */
    private java.util.List<IpAddressMember> ipAddresses;
    /**
     * <p>
     * The version of the operating system.
     * </p>
     */
    private String osVersion;

    /**
     * <p>
     * The name of the host.
     * </p>
     * 
     * @param hostname
     *        The name of the host.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The name of the host.
     * </p>
     * 
     * @return The name of the host.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The name of the host.
     * </p>
     * 
     * @param hostname
     *        The name of the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedHost withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * 
     * @param ec2InstanceId
     *        The ID of the Amazon EC2 instance.
     */

    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * 
     * @return The ID of the Amazon EC2 instance.
     */

    public String getEc2InstanceId() {
        return this.ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * 
     * @param ec2InstanceId
     *        The ID of the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedHost withEc2InstanceId(String ec2InstanceId) {
        setEc2InstanceId(ec2InstanceId);
        return this;
    }

    /**
     * <p>
     * The IP addresses of the associated host.
     * </p>
     * 
     * @return The IP addresses of the associated host.
     */

    public java.util.List<IpAddressMember> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * <p>
     * The IP addresses of the associated host.
     * </p>
     * 
     * @param ipAddresses
     *        The IP addresses of the associated host.
     */

    public void setIpAddresses(java.util.Collection<IpAddressMember> ipAddresses) {
        if (ipAddresses == null) {
            this.ipAddresses = null;
            return;
        }

        this.ipAddresses = new java.util.ArrayList<IpAddressMember>(ipAddresses);
    }

    /**
     * <p>
     * The IP addresses of the associated host.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpAddresses(java.util.Collection)} or {@link #withIpAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipAddresses
     *        The IP addresses of the associated host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedHost withIpAddresses(IpAddressMember... ipAddresses) {
        if (this.ipAddresses == null) {
            setIpAddresses(new java.util.ArrayList<IpAddressMember>(ipAddresses.length));
        }
        for (IpAddressMember ele : ipAddresses) {
            this.ipAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses of the associated host.
     * </p>
     * 
     * @param ipAddresses
     *        The IP addresses of the associated host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedHost withIpAddresses(java.util.Collection<IpAddressMember> ipAddresses) {
        setIpAddresses(ipAddresses);
        return this;
    }

    /**
     * <p>
     * The version of the operating system.
     * </p>
     * 
     * @param osVersion
     *        The version of the operating system.
     */

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * <p>
     * The version of the operating system.
     * </p>
     * 
     * @return The version of the operating system.
     */

    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * <p>
     * The version of the operating system.
     * </p>
     * 
     * @param osVersion
     *        The version of the operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedHost withOsVersion(String osVersion) {
        setOsVersion(osVersion);
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
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: ").append(getEc2InstanceId()).append(",");
        if (getIpAddresses() != null)
            sb.append("IpAddresses: ").append(getIpAddresses()).append(",");
        if (getOsVersion() != null)
            sb.append("OsVersion: ").append(getOsVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatedHost == false)
            return false;
        AssociatedHost other = (AssociatedHost) obj;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getIpAddresses() == null ^ this.getIpAddresses() == null)
            return false;
        if (other.getIpAddresses() != null && other.getIpAddresses().equals(this.getIpAddresses()) == false)
            return false;
        if (other.getOsVersion() == null ^ this.getOsVersion() == null)
            return false;
        if (other.getOsVersion() != null && other.getOsVersion().equals(this.getOsVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode + ((getIpAddresses() == null) ? 0 : getIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getOsVersion() == null) ? 0 : getOsVersion().hashCode());
        return hashCode;
    }

    @Override
    public AssociatedHost clone() {
        try {
            return (AssociatedHost) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.AssociatedHostMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
