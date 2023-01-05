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
 * The App Runner resource that specifies an App Runner endpoint for incoming traffic. It establishes a connection
 * between a VPC interface endpoint and a App Runner service, to make your App Runner service accessible from only
 * within an Amazon VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/VpcIngressConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcIngressConnection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * </p>
     */
    private String vpcIngressConnectionArn;
    /**
     * <p>
     * The customer-provided VPC Ingress Connection name.
     * </p>
     */
    private String vpcIngressConnectionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the following
     * statuses: <code>AVAILABLE</code>, <code>PENDING_CREATION</code>, <code>PENDING_UPDATE</code>,
     * <code>PENDING_DELETION</code>,<code>FAILED_CREATION</code>, <code>FAILED_UPDATE</code>,
     * <code>FAILED_DELETION</code>, and <code>DELETED</code>..
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Account Id you use to create the VPC Ingress Connection resource.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The domain name associated with the VPC Ingress Connection resource.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to associate with the
     * VPC Ingress Connection resource.
     * </p>
     */
    private IngressVpcConfiguration ingressVpcConfiguration;
    /**
     * <p>
     * The time when the VPC Ingress Connection was created. It's in the Unix time stamp format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when the App Runner service was deleted. It's in the Unix time stamp format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: No
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date deletedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * </p>
     * 
     * @param vpcIngressConnectionArn
     *        The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     */

    public void setVpcIngressConnectionArn(String vpcIngressConnectionArn) {
        this.vpcIngressConnectionArn = vpcIngressConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     */

    public String getVpcIngressConnectionArn() {
        return this.vpcIngressConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * </p>
     * 
     * @param vpcIngressConnectionArn
     *        The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnection withVpcIngressConnectionArn(String vpcIngressConnectionArn) {
        setVpcIngressConnectionArn(vpcIngressConnectionArn);
        return this;
    }

    /**
     * <p>
     * The customer-provided VPC Ingress Connection name.
     * </p>
     * 
     * @param vpcIngressConnectionName
     *        The customer-provided VPC Ingress Connection name.
     */

    public void setVpcIngressConnectionName(String vpcIngressConnectionName) {
        this.vpcIngressConnectionName = vpcIngressConnectionName;
    }

    /**
     * <p>
     * The customer-provided VPC Ingress Connection name.
     * </p>
     * 
     * @return The customer-provided VPC Ingress Connection name.
     */

    public String getVpcIngressConnectionName() {
        return this.vpcIngressConnectionName;
    }

    /**
     * <p>
     * The customer-provided VPC Ingress Connection name.
     * </p>
     * 
     * @param vpcIngressConnectionName
     *        The customer-provided VPC Ingress Connection name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnection withVpcIngressConnectionName(String vpcIngressConnectionName) {
        setVpcIngressConnectionName(vpcIngressConnectionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnection withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the following
     * statuses: <code>AVAILABLE</code>, <code>PENDING_CREATION</code>, <code>PENDING_UPDATE</code>,
     * <code>PENDING_DELETION</code>,<code>FAILED_CREATION</code>, <code>FAILED_UPDATE</code>,
     * <code>FAILED_DELETION</code>, and <code>DELETED</code>..
     * </p>
     * 
     * @param status
     *        The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the following
     *        statuses: <code>AVAILABLE</code>, <code>PENDING_CREATION</code>, <code>PENDING_UPDATE</code>,
     *        <code>PENDING_DELETION</code>,<code>FAILED_CREATION</code>, <code>FAILED_UPDATE</code>,
     *        <code>FAILED_DELETION</code>, and <code>DELETED</code>..
     * @see VpcIngressConnectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the following
     * statuses: <code>AVAILABLE</code>, <code>PENDING_CREATION</code>, <code>PENDING_UPDATE</code>,
     * <code>PENDING_DELETION</code>,<code>FAILED_CREATION</code>, <code>FAILED_UPDATE</code>,
     * <code>FAILED_DELETION</code>, and <code>DELETED</code>..
     * </p>
     * 
     * @return The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the
     *         following statuses: <code>AVAILABLE</code>, <code>PENDING_CREATION</code>, <code>PENDING_UPDATE</code>,
     *         <code>PENDING_DELETION</code>,<code>FAILED_CREATION</code>, <code>FAILED_UPDATE</code>,
     *         <code>FAILED_DELETION</code>, and <code>DELETED</code>..
     * @see VpcIngressConnectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the following
     * statuses: <code>AVAILABLE</code>, <code>PENDING_CREATION</code>, <code>PENDING_UPDATE</code>,
     * <code>PENDING_DELETION</code>,<code>FAILED_CREATION</code>, <code>FAILED_UPDATE</code>,
     * <code>FAILED_DELETION</code>, and <code>DELETED</code>..
     * </p>
     * 
     * @param status
     *        The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the following
     *        statuses: <code>AVAILABLE</code>, <code>PENDING_CREATION</code>, <code>PENDING_UPDATE</code>,
     *        <code>PENDING_DELETION</code>,<code>FAILED_CREATION</code>, <code>FAILED_UPDATE</code>,
     *        <code>FAILED_DELETION</code>, and <code>DELETED</code>..
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcIngressConnectionStatus
     */

    public VpcIngressConnection withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the following
     * statuses: <code>AVAILABLE</code>, <code>PENDING_CREATION</code>, <code>PENDING_UPDATE</code>,
     * <code>PENDING_DELETION</code>,<code>FAILED_CREATION</code>, <code>FAILED_UPDATE</code>,
     * <code>FAILED_DELETION</code>, and <code>DELETED</code>..
     * </p>
     * 
     * @param status
     *        The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the following
     *        statuses: <code>AVAILABLE</code>, <code>PENDING_CREATION</code>, <code>PENDING_UPDATE</code>,
     *        <code>PENDING_DELETION</code>,<code>FAILED_CREATION</code>, <code>FAILED_UPDATE</code>,
     *        <code>FAILED_DELETION</code>, and <code>DELETED</code>..
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcIngressConnectionStatus
     */

    public VpcIngressConnection withStatus(VpcIngressConnectionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Account Id you use to create the VPC Ingress Connection resource.
     * </p>
     * 
     * @param accountId
     *        The Account Id you use to create the VPC Ingress Connection resource.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Account Id you use to create the VPC Ingress Connection resource.
     * </p>
     * 
     * @return The Account Id you use to create the VPC Ingress Connection resource.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Account Id you use to create the VPC Ingress Connection resource.
     * </p>
     * 
     * @param accountId
     *        The Account Id you use to create the VPC Ingress Connection resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnection withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The domain name associated with the VPC Ingress Connection resource.
     * </p>
     * 
     * @param domainName
     *        The domain name associated with the VPC Ingress Connection resource.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name associated with the VPC Ingress Connection resource.
     * </p>
     * 
     * @return The domain name associated with the VPC Ingress Connection resource.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name associated with the VPC Ingress Connection resource.
     * </p>
     * 
     * @param domainName
     *        The domain name associated with the VPC Ingress Connection resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnection withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to associate with the
     * VPC Ingress Connection resource.
     * </p>
     * 
     * @param ingressVpcConfiguration
     *        Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to associate with
     *        the VPC Ingress Connection resource.
     */

    public void setIngressVpcConfiguration(IngressVpcConfiguration ingressVpcConfiguration) {
        this.ingressVpcConfiguration = ingressVpcConfiguration;
    }

    /**
     * <p>
     * Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to associate with the
     * VPC Ingress Connection resource.
     * </p>
     * 
     * @return Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to associate
     *         with the VPC Ingress Connection resource.
     */

    public IngressVpcConfiguration getIngressVpcConfiguration() {
        return this.ingressVpcConfiguration;
    }

    /**
     * <p>
     * Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to associate with the
     * VPC Ingress Connection resource.
     * </p>
     * 
     * @param ingressVpcConfiguration
     *        Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to associate with
     *        the VPC Ingress Connection resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnection withIngressVpcConfiguration(IngressVpcConfiguration ingressVpcConfiguration) {
        setIngressVpcConfiguration(ingressVpcConfiguration);
        return this;
    }

    /**
     * <p>
     * The time when the VPC Ingress Connection was created. It's in the Unix time stamp format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * </ul>
     * 
     * @param createdAt
     *        The time when the VPC Ingress Connection was created. It's in the Unix time stamp format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Type: Timestamp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: Yes
     *        </p>
     *        </li>
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the VPC Ingress Connection was created. It's in the Unix time stamp format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * </ul>
     * 
     * @return The time when the VPC Ingress Connection was created. It's in the Unix time stamp format.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Type: Timestamp
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Required: Yes
     *         </p>
     *         </li>
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the VPC Ingress Connection was created. It's in the Unix time stamp format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * </ul>
     * 
     * @param createdAt
     *        The time when the VPC Ingress Connection was created. It's in the Unix time stamp format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Type: Timestamp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: Yes
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnection withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when the App Runner service was deleted. It's in the Unix time stamp format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: No
     * </p>
     * </li>
     * </ul>
     * 
     * @param deletedAt
     *        The time when the App Runner service was deleted. It's in the Unix time stamp format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Type: Timestamp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: No
     *        </p>
     *        </li>
     */

    public void setDeletedAt(java.util.Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * <p>
     * The time when the App Runner service was deleted. It's in the Unix time stamp format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: No
     * </p>
     * </li>
     * </ul>
     * 
     * @return The time when the App Runner service was deleted. It's in the Unix time stamp format.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Type: Timestamp
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Required: No
     *         </p>
     *         </li>
     */

    public java.util.Date getDeletedAt() {
        return this.deletedAt;
    }

    /**
     * <p>
     * The time when the App Runner service was deleted. It's in the Unix time stamp format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: No
     * </p>
     * </li>
     * </ul>
     * 
     * @param deletedAt
     *        The time when the App Runner service was deleted. It's in the Unix time stamp format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Type: Timestamp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: No
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnection withDeletedAt(java.util.Date deletedAt) {
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
        if (getVpcIngressConnectionArn() != null)
            sb.append("VpcIngressConnectionArn: ").append(getVpcIngressConnectionArn()).append(",");
        if (getVpcIngressConnectionName() != null)
            sb.append("VpcIngressConnectionName: ").append(getVpcIngressConnectionName()).append(",");
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getIngressVpcConfiguration() != null)
            sb.append("IngressVpcConfiguration: ").append(getIngressVpcConfiguration()).append(",");
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

        if (obj instanceof VpcIngressConnection == false)
            return false;
        VpcIngressConnection other = (VpcIngressConnection) obj;
        if (other.getVpcIngressConnectionArn() == null ^ this.getVpcIngressConnectionArn() == null)
            return false;
        if (other.getVpcIngressConnectionArn() != null && other.getVpcIngressConnectionArn().equals(this.getVpcIngressConnectionArn()) == false)
            return false;
        if (other.getVpcIngressConnectionName() == null ^ this.getVpcIngressConnectionName() == null)
            return false;
        if (other.getVpcIngressConnectionName() != null && other.getVpcIngressConnectionName().equals(this.getVpcIngressConnectionName()) == false)
            return false;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getIngressVpcConfiguration() == null ^ this.getIngressVpcConfiguration() == null)
            return false;
        if (other.getIngressVpcConfiguration() != null && other.getIngressVpcConfiguration().equals(this.getIngressVpcConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getVpcIngressConnectionArn() == null) ? 0 : getVpcIngressConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getVpcIngressConnectionName() == null) ? 0 : getVpcIngressConnectionName().hashCode());
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getIngressVpcConfiguration() == null) ? 0 : getIngressVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeletedAt() == null) ? 0 : getDeletedAt().hashCode());
        return hashCode;
    }

    @Override
    public VpcIngressConnection clone() {
        try {
            return (VpcIngressConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.VpcIngressConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
