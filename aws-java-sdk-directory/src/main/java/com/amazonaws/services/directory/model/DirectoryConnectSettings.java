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
 * Contains information for the <a>ConnectDirectory</a> operation when an AD Connector directory is being created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DirectoryConnectSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectoryConnectSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the VPC in which the AD Connector is created.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * A list of subnet identifiers in the VPC in which the AD Connector is created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> customerDnsIps;
    /**
     * <p>
     * The user name of an account in the on-premises directory that is used to connect to the directory. This account
     * must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read users and groups
     * </p>
     * </li>
     * <li>
     * <p>
     * Create computer objects
     * </p>
     * </li>
     * <li>
     * <p>
     * Join computers to the domain
     * </p>
     * </li>
     * </ul>
     */
    private String customerUserName;

    /**
     * <p>
     * The identifier of the VPC in which the AD Connector is created.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC in which the AD Connector is created.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC in which the AD Connector is created.
     * </p>
     * 
     * @return The identifier of the VPC in which the AD Connector is created.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC in which the AD Connector is created.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC in which the AD Connector is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettings withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * A list of subnet identifiers in the VPC in which the AD Connector is created.
     * </p>
     * 
     * @return A list of subnet identifiers in the VPC in which the AD Connector is created.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet identifiers in the VPC in which the AD Connector is created.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet identifiers in the VPC in which the AD Connector is created.
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
     * A list of subnet identifiers in the VPC in which the AD Connector is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet identifiers in the VPC in which the AD Connector is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettings withSubnetIds(String... subnetIds) {
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
     * A list of subnet identifiers in the VPC in which the AD Connector is created.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet identifiers in the VPC in which the AD Connector is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettings withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
     * </p>
     * 
     * @return A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
     */

    public java.util.List<String> getCustomerDnsIps() {
        if (customerDnsIps == null) {
            customerDnsIps = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return customerDnsIps;
    }

    /**
     * <p>
     * A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
     * </p>
     * 
     * @param customerDnsIps
     *        A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
     */

    public void setCustomerDnsIps(java.util.Collection<String> customerDnsIps) {
        if (customerDnsIps == null) {
            this.customerDnsIps = null;
            return;
        }

        this.customerDnsIps = new com.amazonaws.internal.SdkInternalList<String>(customerDnsIps);
    }

    /**
     * <p>
     * A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomerDnsIps(java.util.Collection)} or {@link #withCustomerDnsIps(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customerDnsIps
     *        A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettings withCustomerDnsIps(String... customerDnsIps) {
        if (this.customerDnsIps == null) {
            setCustomerDnsIps(new com.amazonaws.internal.SdkInternalList<String>(customerDnsIps.length));
        }
        for (String ele : customerDnsIps) {
            this.customerDnsIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
     * </p>
     * 
     * @param customerDnsIps
     *        A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettings withCustomerDnsIps(java.util.Collection<String> customerDnsIps) {
        setCustomerDnsIps(customerDnsIps);
        return this;
    }

    /**
     * <p>
     * The user name of an account in the on-premises directory that is used to connect to the directory. This account
     * must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read users and groups
     * </p>
     * </li>
     * <li>
     * <p>
     * Create computer objects
     * </p>
     * </li>
     * <li>
     * <p>
     * Join computers to the domain
     * </p>
     * </li>
     * </ul>
     * 
     * @param customerUserName
     *        The user name of an account in the on-premises directory that is used to connect to the directory. This
     *        account must have the following permissions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Read users and groups
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create computer objects
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Join computers to the domain
     *        </p>
     *        </li>
     */

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    /**
     * <p>
     * The user name of an account in the on-premises directory that is used to connect to the directory. This account
     * must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read users and groups
     * </p>
     * </li>
     * <li>
     * <p>
     * Create computer objects
     * </p>
     * </li>
     * <li>
     * <p>
     * Join computers to the domain
     * </p>
     * </li>
     * </ul>
     * 
     * @return The user name of an account in the on-premises directory that is used to connect to the directory. This
     *         account must have the following permissions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Read users and groups
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Create computer objects
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Join computers to the domain
     *         </p>
     *         </li>
     */

    public String getCustomerUserName() {
        return this.customerUserName;
    }

    /**
     * <p>
     * The user name of an account in the on-premises directory that is used to connect to the directory. This account
     * must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read users and groups
     * </p>
     * </li>
     * <li>
     * <p>
     * Create computer objects
     * </p>
     * </li>
     * <li>
     * <p>
     * Join computers to the domain
     * </p>
     * </li>
     * </ul>
     * 
     * @param customerUserName
     *        The user name of an account in the on-premises directory that is used to connect to the directory. This
     *        account must have the following permissions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Read users and groups
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create computer objects
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Join computers to the domain
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryConnectSettings withCustomerUserName(String customerUserName) {
        setCustomerUserName(customerUserName);
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
        if (getCustomerDnsIps() != null)
            sb.append("CustomerDnsIps: ").append(getCustomerDnsIps()).append(",");
        if (getCustomerUserName() != null)
            sb.append("CustomerUserName: ").append(getCustomerUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectoryConnectSettings == false)
            return false;
        DirectoryConnectSettings other = (DirectoryConnectSettings) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getCustomerDnsIps() == null ^ this.getCustomerDnsIps() == null)
            return false;
        if (other.getCustomerDnsIps() != null && other.getCustomerDnsIps().equals(this.getCustomerDnsIps()) == false)
            return false;
        if (other.getCustomerUserName() == null ^ this.getCustomerUserName() == null)
            return false;
        if (other.getCustomerUserName() != null && other.getCustomerUserName().equals(this.getCustomerUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getCustomerDnsIps() == null) ? 0 : getCustomerDnsIps().hashCode());
        hashCode = prime * hashCode + ((getCustomerUserName() == null) ? 0 : getCustomerUserName().hashCode());
        return hashCode;
    }

    @Override
    public DirectoryConnectSettings clone() {
        try {
            return (DirectoryConnectSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.DirectoryConnectSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
