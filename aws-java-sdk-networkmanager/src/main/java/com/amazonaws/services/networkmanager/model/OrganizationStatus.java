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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of an Amazon Web Services Organization and the accounts within that organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/OrganizationStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of an Amazon Web Services Organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The status of the organization's AWS service access. This will be <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     */
    private String organizationAwsServiceAccessStatus;
    /**
     * <p>
     * The status of the SLR deployment for the account. This will be either <code>SUCCEEDED</code> or
     * <code>IN_PROGRESS</code>.
     * </p>
     */
    private String sLRDeploymentStatus;
    /**
     * <p>
     * The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's accounts. This
     * will be either <code>SUCCEEDED</code> or <code>IN_PROGRESS</code>.
     * </p>
     */
    private java.util.List<AccountStatus> accountStatusList;

    /**
     * <p>
     * The ID of an Amazon Web Services Organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of an Amazon Web Services Organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The ID of an Amazon Web Services Organization.
     * </p>
     * 
     * @return The ID of an Amazon Web Services Organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The ID of an Amazon Web Services Organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of an Amazon Web Services Organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatus withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The status of the organization's AWS service access. This will be <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param organizationAwsServiceAccessStatus
     *        The status of the organization's AWS service access. This will be <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     */

    public void setOrganizationAwsServiceAccessStatus(String organizationAwsServiceAccessStatus) {
        this.organizationAwsServiceAccessStatus = organizationAwsServiceAccessStatus;
    }

    /**
     * <p>
     * The status of the organization's AWS service access. This will be <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @return The status of the organization's AWS service access. This will be <code>ENABLED</code> or
     *         <code>DISABLED</code>.
     */

    public String getOrganizationAwsServiceAccessStatus() {
        return this.organizationAwsServiceAccessStatus;
    }

    /**
     * <p>
     * The status of the organization's AWS service access. This will be <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param organizationAwsServiceAccessStatus
     *        The status of the organization's AWS service access. This will be <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatus withOrganizationAwsServiceAccessStatus(String organizationAwsServiceAccessStatus) {
        setOrganizationAwsServiceAccessStatus(organizationAwsServiceAccessStatus);
        return this;
    }

    /**
     * <p>
     * The status of the SLR deployment for the account. This will be either <code>SUCCEEDED</code> or
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param sLRDeploymentStatus
     *        The status of the SLR deployment for the account. This will be either <code>SUCCEEDED</code> or
     *        <code>IN_PROGRESS</code>.
     */

    public void setSLRDeploymentStatus(String sLRDeploymentStatus) {
        this.sLRDeploymentStatus = sLRDeploymentStatus;
    }

    /**
     * <p>
     * The status of the SLR deployment for the account. This will be either <code>SUCCEEDED</code> or
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @return The status of the SLR deployment for the account. This will be either <code>SUCCEEDED</code> or
     *         <code>IN_PROGRESS</code>.
     */

    public String getSLRDeploymentStatus() {
        return this.sLRDeploymentStatus;
    }

    /**
     * <p>
     * The status of the SLR deployment for the account. This will be either <code>SUCCEEDED</code> or
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param sLRDeploymentStatus
     *        The status of the SLR deployment for the account. This will be either <code>SUCCEEDED</code> or
     *        <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatus withSLRDeploymentStatus(String sLRDeploymentStatus) {
        setSLRDeploymentStatus(sLRDeploymentStatus);
        return this;
    }

    /**
     * <p>
     * The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's accounts. This
     * will be either <code>SUCCEEDED</code> or <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @return The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's
     *         accounts. This will be either <code>SUCCEEDED</code> or <code>IN_PROGRESS</code>.
     */

    public java.util.List<AccountStatus> getAccountStatusList() {
        return accountStatusList;
    }

    /**
     * <p>
     * The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's accounts. This
     * will be either <code>SUCCEEDED</code> or <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param accountStatusList
     *        The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's
     *        accounts. This will be either <code>SUCCEEDED</code> or <code>IN_PROGRESS</code>.
     */

    public void setAccountStatusList(java.util.Collection<AccountStatus> accountStatusList) {
        if (accountStatusList == null) {
            this.accountStatusList = null;
            return;
        }

        this.accountStatusList = new java.util.ArrayList<AccountStatus>(accountStatusList);
    }

    /**
     * <p>
     * The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's accounts. This
     * will be either <code>SUCCEEDED</code> or <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountStatusList(java.util.Collection)} or {@link #withAccountStatusList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accountStatusList
     *        The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's
     *        accounts. This will be either <code>SUCCEEDED</code> or <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatus withAccountStatusList(AccountStatus... accountStatusList) {
        if (this.accountStatusList == null) {
            setAccountStatusList(new java.util.ArrayList<AccountStatus>(accountStatusList.length));
        }
        for (AccountStatus ele : accountStatusList) {
            this.accountStatusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's accounts. This
     * will be either <code>SUCCEEDED</code> or <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param accountStatusList
     *        The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's
     *        accounts. This will be either <code>SUCCEEDED</code> or <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatus withAccountStatusList(java.util.Collection<AccountStatus> accountStatusList) {
        setAccountStatusList(accountStatusList);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getOrganizationAwsServiceAccessStatus() != null)
            sb.append("OrganizationAwsServiceAccessStatus: ").append(getOrganizationAwsServiceAccessStatus()).append(",");
        if (getSLRDeploymentStatus() != null)
            sb.append("SLRDeploymentStatus: ").append(getSLRDeploymentStatus()).append(",");
        if (getAccountStatusList() != null)
            sb.append("AccountStatusList: ").append(getAccountStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationStatus == false)
            return false;
        OrganizationStatus other = (OrganizationStatus) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getOrganizationAwsServiceAccessStatus() == null ^ this.getOrganizationAwsServiceAccessStatus() == null)
            return false;
        if (other.getOrganizationAwsServiceAccessStatus() != null
                && other.getOrganizationAwsServiceAccessStatus().equals(this.getOrganizationAwsServiceAccessStatus()) == false)
            return false;
        if (other.getSLRDeploymentStatus() == null ^ this.getSLRDeploymentStatus() == null)
            return false;
        if (other.getSLRDeploymentStatus() != null && other.getSLRDeploymentStatus().equals(this.getSLRDeploymentStatus()) == false)
            return false;
        if (other.getAccountStatusList() == null ^ this.getAccountStatusList() == null)
            return false;
        if (other.getAccountStatusList() != null && other.getAccountStatusList().equals(this.getAccountStatusList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationAwsServiceAccessStatus() == null) ? 0 : getOrganizationAwsServiceAccessStatus().hashCode());
        hashCode = prime * hashCode + ((getSLRDeploymentStatus() == null) ? 0 : getSLRDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getAccountStatusList() == null) ? 0 : getAccountStatusList().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationStatus clone() {
        try {
            return (OrganizationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.OrganizationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
