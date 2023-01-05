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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an App Runner VPC connector resource. A VPC connector describes the Amazon Virtual Private Cloud (Amazon
 * VPC) that an App Runner service is associated with, and the subnets and security group that are used.
 * </p>
 * <p>
 * Multiple revisions of a connector might have the same <code>Name</code> and different <code>Revision</code> values.
 * </p>
 * <note>
 * <p>
 * At this time, App Runner supports only one revision per name.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/VpcConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConnector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The customer-provided VPC connector name.
     * </p>
     */
    private String vpcConnectorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of this VPC connector.
     * </p>
     */
    private String vpcConnectorArn;
    /**
     * <p>
     * The revision of this VPC connector. It's unique among all the active connectors (<code>"Status": "ACTIVE"</code>)
     * that share the same <code>Name</code>.
     * </p>
     * <note>
     * <p>
     * At this time, App Runner supports only one revision per name.
     * </p>
     * </note>
     */
    private Integer vpcConnectorRevision;
    /**
     * <p>
     * A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon VPC.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The current state of the VPC connector. If the status of a connector revision is <code>INACTIVE</code>, it was
     * deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time when the VPC connector was created. It's in Unix time stamp format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when the VPC connector was deleted. It's in Unix time stamp format.
     * </p>
     */
    private java.util.Date deletedAt;

    /**
     * <p>
     * The customer-provided VPC connector name.
     * </p>
     * 
     * @param vpcConnectorName
     *        The customer-provided VPC connector name.
     */

    public void setVpcConnectorName(String vpcConnectorName) {
        this.vpcConnectorName = vpcConnectorName;
    }

    /**
     * <p>
     * The customer-provided VPC connector name.
     * </p>
     * 
     * @return The customer-provided VPC connector name.
     */

    public String getVpcConnectorName() {
        return this.vpcConnectorName;
    }

    /**
     * <p>
     * The customer-provided VPC connector name.
     * </p>
     * 
     * @param vpcConnectorName
     *        The customer-provided VPC connector name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnector withVpcConnectorName(String vpcConnectorName) {
        setVpcConnectorName(vpcConnectorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this VPC connector.
     * </p>
     * 
     * @param vpcConnectorArn
     *        The Amazon Resource Name (ARN) of this VPC connector.
     */

    public void setVpcConnectorArn(String vpcConnectorArn) {
        this.vpcConnectorArn = vpcConnectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this VPC connector.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this VPC connector.
     */

    public String getVpcConnectorArn() {
        return this.vpcConnectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this VPC connector.
     * </p>
     * 
     * @param vpcConnectorArn
     *        The Amazon Resource Name (ARN) of this VPC connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnector withVpcConnectorArn(String vpcConnectorArn) {
        setVpcConnectorArn(vpcConnectorArn);
        return this;
    }

    /**
     * <p>
     * The revision of this VPC connector. It's unique among all the active connectors (<code>"Status": "ACTIVE"</code>)
     * that share the same <code>Name</code>.
     * </p>
     * <note>
     * <p>
     * At this time, App Runner supports only one revision per name.
     * </p>
     * </note>
     * 
     * @param vpcConnectorRevision
     *        The revision of this VPC connector. It's unique among all the active connectors (
     *        <code>"Status": "ACTIVE"</code>) that share the same <code>Name</code>.</p> <note>
     *        <p>
     *        At this time, App Runner supports only one revision per name.
     *        </p>
     */

    public void setVpcConnectorRevision(Integer vpcConnectorRevision) {
        this.vpcConnectorRevision = vpcConnectorRevision;
    }

    /**
     * <p>
     * The revision of this VPC connector. It's unique among all the active connectors (<code>"Status": "ACTIVE"</code>)
     * that share the same <code>Name</code>.
     * </p>
     * <note>
     * <p>
     * At this time, App Runner supports only one revision per name.
     * </p>
     * </note>
     * 
     * @return The revision of this VPC connector. It's unique among all the active connectors (
     *         <code>"Status": "ACTIVE"</code>) that share the same <code>Name</code>.</p> <note>
     *         <p>
     *         At this time, App Runner supports only one revision per name.
     *         </p>
     */

    public Integer getVpcConnectorRevision() {
        return this.vpcConnectorRevision;
    }

    /**
     * <p>
     * The revision of this VPC connector. It's unique among all the active connectors (<code>"Status": "ACTIVE"</code>)
     * that share the same <code>Name</code>.
     * </p>
     * <note>
     * <p>
     * At this time, App Runner supports only one revision per name.
     * </p>
     * </note>
     * 
     * @param vpcConnectorRevision
     *        The revision of this VPC connector. It's unique among all the active connectors (
     *        <code>"Status": "ACTIVE"</code>) that share the same <code>Name</code>.</p> <note>
     *        <p>
     *        At this time, App Runner supports only one revision per name.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnector withVpcConnectorRevision(Integer vpcConnectorRevision) {
        setVpcConnectorRevision(vpcConnectorRevision);
        return this;
    }

    /**
     * <p>
     * A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon VPC.
     * </p>
     * 
     * @return A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon
     *         VPC.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon VPC.
     * </p>
     * 
     * @param subnets
     *        A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon
     *        VPC.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon
     *        VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnector withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon VPC.
     * </p>
     * 
     * @param subnets
     *        A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon
     *        VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnector withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     * 
     * @return A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under
     *         the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC.
     *         The default security group allows all outbound traffic.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     * 
     * @param securityGroups
     *        A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under
     *        the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The
     *        default security group allows all outbound traffic.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under
     *        the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The
     *        default security group allows all outbound traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnector withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     * 
     * @param securityGroups
     *        A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under
     *        the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The
     *        default security group allows all outbound traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnector withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The current state of the VPC connector. If the status of a connector revision is <code>INACTIVE</code>, it was
     * deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
     * </p>
     * 
     * @param status
     *        The current state of the VPC connector. If the status of a connector revision is <code>INACTIVE</code>, it
     *        was deleted and can't be used. Inactive connector revisions are permanently removed some time after they
     *        are deleted.
     * @see VpcConnectorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the VPC connector. If the status of a connector revision is <code>INACTIVE</code>, it was
     * deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
     * </p>
     * 
     * @return The current state of the VPC connector. If the status of a connector revision is <code>INACTIVE</code>,
     *         it was deleted and can't be used. Inactive connector revisions are permanently removed some time after
     *         they are deleted.
     * @see VpcConnectorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the VPC connector. If the status of a connector revision is <code>INACTIVE</code>, it was
     * deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
     * </p>
     * 
     * @param status
     *        The current state of the VPC connector. If the status of a connector revision is <code>INACTIVE</code>, it
     *        was deleted and can't be used. Inactive connector revisions are permanently removed some time after they
     *        are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcConnectorStatus
     */

    public VpcConnector withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the VPC connector. If the status of a connector revision is <code>INACTIVE</code>, it was
     * deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
     * </p>
     * 
     * @param status
     *        The current state of the VPC connector. If the status of a connector revision is <code>INACTIVE</code>, it
     *        was deleted and can't be used. Inactive connector revisions are permanently removed some time after they
     *        are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcConnectorStatus
     */

    public VpcConnector withStatus(VpcConnectorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time when the VPC connector was created. It's in Unix time stamp format.
     * </p>
     * 
     * @param createdAt
     *        The time when the VPC connector was created. It's in Unix time stamp format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the VPC connector was created. It's in Unix time stamp format.
     * </p>
     * 
     * @return The time when the VPC connector was created. It's in Unix time stamp format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the VPC connector was created. It's in Unix time stamp format.
     * </p>
     * 
     * @param createdAt
     *        The time when the VPC connector was created. It's in Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnector withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when the VPC connector was deleted. It's in Unix time stamp format.
     * </p>
     * 
     * @param deletedAt
     *        The time when the VPC connector was deleted. It's in Unix time stamp format.
     */

    public void setDeletedAt(java.util.Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * <p>
     * The time when the VPC connector was deleted. It's in Unix time stamp format.
     * </p>
     * 
     * @return The time when the VPC connector was deleted. It's in Unix time stamp format.
     */

    public java.util.Date getDeletedAt() {
        return this.deletedAt;
    }

    /**
     * <p>
     * The time when the VPC connector was deleted. It's in Unix time stamp format.
     * </p>
     * 
     * @param deletedAt
     *        The time when the VPC connector was deleted. It's in Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnector withDeletedAt(java.util.Date deletedAt) {
        setDeletedAt(deletedAt);
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
        if (getVpcConnectorName() != null)
            sb.append("VpcConnectorName: ").append(getVpcConnectorName()).append(",");
        if (getVpcConnectorArn() != null)
            sb.append("VpcConnectorArn: ").append(getVpcConnectorArn()).append(",");
        if (getVpcConnectorRevision() != null)
            sb.append("VpcConnectorRevision: ").append(getVpcConnectorRevision()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeletedAt() != null)
            sb.append("DeletedAt: ").append(getDeletedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConnector == false)
            return false;
        VpcConnector other = (VpcConnector) obj;
        if (other.getVpcConnectorName() == null ^ this.getVpcConnectorName() == null)
            return false;
        if (other.getVpcConnectorName() != null && other.getVpcConnectorName().equals(this.getVpcConnectorName()) == false)
            return false;
        if (other.getVpcConnectorArn() == null ^ this.getVpcConnectorArn() == null)
            return false;
        if (other.getVpcConnectorArn() != null && other.getVpcConnectorArn().equals(this.getVpcConnectorArn()) == false)
            return false;
        if (other.getVpcConnectorRevision() == null ^ this.getVpcConnectorRevision() == null)
            return false;
        if (other.getVpcConnectorRevision() != null && other.getVpcConnectorRevision().equals(this.getVpcConnectorRevision()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeletedAt() == null ^ this.getDeletedAt() == null)
            return false;
        if (other.getDeletedAt() != null && other.getDeletedAt().equals(this.getDeletedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcConnectorName() == null) ? 0 : getVpcConnectorName().hashCode());
        hashCode = prime * hashCode + ((getVpcConnectorArn() == null) ? 0 : getVpcConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getVpcConnectorRevision() == null) ? 0 : getVpcConnectorRevision().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeletedAt() == null) ? 0 : getDeletedAt().hashCode());
        return hashCode;
    }

    @Override
    public VpcConnector clone() {
        try {
            return (VpcConnector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.VpcConnectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
