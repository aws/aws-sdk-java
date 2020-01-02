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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status filter object to filter results based on specific member account ID or status type for an organization
 * conformance pack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationResourceDetailedStatusFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationResourceDetailedStatusFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit account ID of the member account within an organization.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The 12-digit account ID of the member account within an organization.
     * </p>
     * 
     * @param accountId
     *        The 12-digit account ID of the member account within an organization.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the member account within an organization.
     * </p>
     * 
     * @return The 12-digit account ID of the member account within an organization.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the member account within an organization.
     * </p>
     * 
     * @param accountId
     *        The 12-digit account ID of the member account within an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationResourceDetailedStatusFilters withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates deployment status for conformance pack in a member account. When master account calls
     *        <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created
     *        in the member account. When master account calls <code>PutOrganizationConformancePack</code> action for
     *        the second time, conformance pack status is updated in the member account. Conformance pack status is
     *        deleted when the master account deletes <code>OrganizationConformancePack</code> and disables service
     *        access for <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     * @see OrganizationResourceDetailedStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates deployment status for conformance pack in a member account. When master account calls
     *         <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created
     *         in the member account. When master account calls <code>PutOrganizationConformancePack</code> action for
     *         the second time, conformance pack status is updated in the member account. Conformance pack status is
     *         deleted when the master account deletes <code>OrganizationConformancePack</code> and disables service
     *         access for <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *         <p>
     *         AWS Config sets the state of the conformance pack to:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     *         </p>
     *         </li>
     * @see OrganizationResourceDetailedStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates deployment status for conformance pack in a member account. When master account calls
     *        <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created
     *        in the member account. When master account calls <code>PutOrganizationConformancePack</code> action for
     *        the second time, conformance pack status is updated in the member account. Conformance pack status is
     *        deleted when the master account deletes <code>OrganizationConformancePack</code> and disables service
     *        access for <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationResourceDetailedStatus
     */

    public OrganizationResourceDetailedStatusFilters withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates deployment status for conformance pack in a member account. When master account calls
     *        <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created
     *        in the member account. When master account calls <code>PutOrganizationConformancePack</code> action for
     *        the second time, conformance pack status is updated in the member account. Conformance pack status is
     *        deleted when the master account deletes <code>OrganizationConformancePack</code> and disables service
     *        access for <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationResourceDetailedStatus
     */

    public OrganizationResourceDetailedStatusFilters withStatus(OrganizationResourceDetailedStatus status) {
        this.status = status.toString();
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationResourceDetailedStatusFilters == false)
            return false;
        OrganizationResourceDetailedStatusFilters other = (OrganizationResourceDetailedStatusFilters) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationResourceDetailedStatusFilters clone() {
        try {
            return (OrganizationResourceDetailedStatusFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationResourceDetailedStatusFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
