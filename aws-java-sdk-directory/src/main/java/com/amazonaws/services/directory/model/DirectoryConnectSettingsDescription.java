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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an AD Connector directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DirectoryConnectSettingsDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectoryConnectSettingsDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the VPC that the AD Connector is in.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * A list of subnet identifiers in the VPC that the AD connector is in.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The user name of the service account in the on-premises directory.
     * </p>
     */
    private String customerUserName;
    /**
     * <p>
     * The security group identifier for the AD Connector directory.
     * </p>
     */
    private String securityGroupId;
    /**
     * <p>
     * A list of the Availability Zones that the directory is in.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The IP addresses of the AD Connector servers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> connectIps;

    /**
     * <p>
     * The identifier of the VPC that the AD Connector is in.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the AD Connector is in.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the AD Connector is in.
     * </p>
     * 
     * @return The identifier of the VPC that the AD Connector is in.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the AD Connector is in.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the AD Connector is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettingsDescription withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * A list of subnet identifiers in the VPC that the AD connector is in.
     * </p>
     * 
     * @return A list of subnet identifiers in the VPC that the AD connector is in.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet identifiers in the VPC that the AD connector is in.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet identifiers in the VPC that the AD connector is in.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of subnet identifiers in the VPC that the AD connector is in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet identifiers in the VPC that the AD connector is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettingsDescription withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnet identifiers in the VPC that the AD connector is in.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet identifiers in the VPC that the AD connector is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettingsDescription withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The user name of the service account in the on-premises directory.
     * </p>
     * 
     * @param customerUserName
     *        The user name of the service account in the on-premises directory.
     */

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    /**
     * <p>
     * The user name of the service account in the on-premises directory.
     * </p>
     * 
     * @return The user name of the service account in the on-premises directory.
     */

    public String getCustomerUserName() {
        return this.customerUserName;
    }

    /**
     * <p>
     * The user name of the service account in the on-premises directory.
     * </p>
     * 
     * @param customerUserName
     *        The user name of the service account in the on-premises directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettingsDescription withCustomerUserName(String customerUserName) {
        setCustomerUserName(customerUserName);
        return this;
    }

    /**
     * <p>
     * The security group identifier for the AD Connector directory.
     * </p>
     * 
     * @param securityGroupId
     *        The security group identifier for the AD Connector directory.
     */

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    /**
     * <p>
     * The security group identifier for the AD Connector directory.
     * </p>
     * 
     * @return The security group identifier for the AD Connector directory.
     */

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * <p>
     * The security group identifier for the AD Connector directory.
     * </p>
     * 
     * @param securityGroupId
     *        The security group identifier for the AD Connector directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettingsDescription withSecurityGroupId(String securityGroupId) {
        setSecurityGroupId(securityGroupId);
        return this;
    }

    /**
     * <p>
     * A list of the Availability Zones that the directory is in.
     * </p>
     * 
     * @return A list of the Availability Zones that the directory is in.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * A list of the Availability Zones that the directory is in.
     * </p>
     * 
     * @param availabilityZones
     *        A list of the Availability Zones that the directory is in.
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
     * A list of the Availability Zones that the directory is in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of the Availability Zones that the directory is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettingsDescription withAvailabilityZones(String... availabilityZones) {
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
     * A list of the Availability Zones that the directory is in.
     * </p>
     * 
     * @param availabilityZones
     *        A list of the Availability Zones that the directory is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettingsDescription withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The IP addresses of the AD Connector servers.
     * </p>
     * 
     * @return The IP addresses of the AD Connector servers.
     */

    public java.util.List<String> getConnectIps() {
        if (connectIps == null) {
            connectIps = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return connectIps;
    }

    /**
     * <p>
     * The IP addresses of the AD Connector servers.
     * </p>
     * 
     * @param connectIps
     *        The IP addresses of the AD Connector servers.
     */

    public void setConnectIps(java.util.Collection<String> connectIps) {
        if (connectIps == null) {
            this.connectIps = null;
            return;
        }

        this.connectIps = new com.amazonaws.internal.SdkInternalList<String>(connectIps);
    }

    /**
     * <p>
     * The IP addresses of the AD Connector servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectIps(java.util.Collection)} or {@link #withConnectIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connectIps
     *        The IP addresses of the AD Connector servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettingsDescription withConnectIps(String... connectIps) {
        if (this.connectIps == null) {
            setConnectIps(new com.amazonaws.internal.SdkInternalList<String>(connectIps.length));
        }
        for (String ele : connectIps) {
            this.connectIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses of the AD Connector servers.
     * </p>
     * 
     * @param connectIps
     *        The IP addresses of the AD Connector servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettingsDescription withConnectIps(java.util.Collection<String> connectIps) {
        setConnectIps(connectIps);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getCustomerUserName() != null)
            sb.append("CustomerUserName: ").append(getCustomerUserName()).append(",");
        if (getSecurityGroupId() != null)
            sb.append("SecurityGroupId: ").append(getSecurityGroupId()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getConnectIps() != null)
            sb.append("ConnectIps: ").append(getConnectIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectoryConnectSettingsDescription == false)
            return false;
        DirectoryConnectSettingsDescription other = (DirectoryConnectSettingsDescription) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getCustomerUserName() == null ^ this.getCustomerUserName() == null)
            return false;
        if (other.getCustomerUserName() != null && other.getCustomerUserName().equals(this.getCustomerUserName()) == false)
            return false;
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null)
            return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getConnectIps() == null ^ this.getConnectIps() == null)
            return false;
        if (other.getConnectIps() != null && other.getConnectIps().equals(this.getConnectIps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getCustomerUserName() == null) ? 0 : getCustomerUserName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getConnectIps() == null) ? 0 : getConnectIps().hashCode());
        return hashCode;
    }

    @Override
    public DirectoryConnectSettingsDescription clone() {
        try {
            return (DirectoryConnectSettingsDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.DirectoryConnectSettingsDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
