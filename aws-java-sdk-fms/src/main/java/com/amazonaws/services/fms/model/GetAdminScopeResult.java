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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAdminScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAdminScopeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains details about the administrative scope of the requested account.
     * </p>
     */
    private AdminScope adminScope;
    /**
     * <p>
     * The current status of the request to onboard a member account as an Firewall Manager administrator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The account is onboarding to Firewall Manager as an administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARDING_COMPLETE</code> - Firewall Manager The account is onboarded to Firewall Manager as an
     * administrator, and can perform actions on the resources defined in their <a>AdminScope</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The account is being removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING_COMPLETE</code> - The account has been removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * Contains details about the administrative scope of the requested account.
     * </p>
     * 
     * @param adminScope
     *        Contains details about the administrative scope of the requested account.
     */

    public void setAdminScope(AdminScope adminScope) {
        this.adminScope = adminScope;
    }

    /**
     * <p>
     * Contains details about the administrative scope of the requested account.
     * </p>
     * 
     * @return Contains details about the administrative scope of the requested account.
     */

    public AdminScope getAdminScope() {
        return this.adminScope;
    }

    /**
     * <p>
     * Contains details about the administrative scope of the requested account.
     * </p>
     * 
     * @param adminScope
     *        Contains details about the administrative scope of the requested account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdminScopeResult withAdminScope(AdminScope adminScope) {
        setAdminScope(adminScope);
        return this;
    }

    /**
     * <p>
     * The current status of the request to onboard a member account as an Firewall Manager administrator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The account is onboarding to Firewall Manager as an administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARDING_COMPLETE</code> - Firewall Manager The account is onboarded to Firewall Manager as an
     * administrator, and can perform actions on the resources defined in their <a>AdminScope</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The account is being removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING_COMPLETE</code> - The account has been removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the request to onboard a member account as an Firewall Manager administrator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONBOARDING</code> - The account is onboarding to Firewall Manager as an administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONBOARDING_COMPLETE</code> - Firewall Manager The account is onboarded to Firewall Manager as an
     *        administrator, and can perform actions on the resources defined in their <a>AdminScope</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARDING</code> - The account is being removed as an Firewall Manager administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARDING_COMPLETE</code> - The account has been removed as an Firewall Manager administrator.
     *        </p>
     *        </li>
     * @see OrganizationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the request to onboard a member account as an Firewall Manager administrator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The account is onboarding to Firewall Manager as an administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARDING_COMPLETE</code> - Firewall Manager The account is onboarded to Firewall Manager as an
     * administrator, and can perform actions on the resources defined in their <a>AdminScope</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The account is being removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING_COMPLETE</code> - The account has been removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the request to onboard a member account as an Firewall Manager administrator.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ONBOARDING</code> - The account is onboarding to Firewall Manager as an administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ONBOARDING_COMPLETE</code> - Firewall Manager The account is onboarded to Firewall Manager as an
     *         administrator, and can perform actions on the resources defined in their <a>AdminScope</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OFFBOARDING</code> - The account is being removed as an Firewall Manager administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OFFBOARDING_COMPLETE</code> - The account has been removed as an Firewall Manager administrator.
     *         </p>
     *         </li>
     * @see OrganizationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the request to onboard a member account as an Firewall Manager administrator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The account is onboarding to Firewall Manager as an administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARDING_COMPLETE</code> - Firewall Manager The account is onboarded to Firewall Manager as an
     * administrator, and can perform actions on the resources defined in their <a>AdminScope</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The account is being removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING_COMPLETE</code> - The account has been removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the request to onboard a member account as an Firewall Manager administrator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONBOARDING</code> - The account is onboarding to Firewall Manager as an administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONBOARDING_COMPLETE</code> - Firewall Manager The account is onboarded to Firewall Manager as an
     *        administrator, and can perform actions on the resources defined in their <a>AdminScope</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARDING</code> - The account is being removed as an Firewall Manager administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARDING_COMPLETE</code> - The account has been removed as an Firewall Manager administrator.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationStatus
     */

    public GetAdminScopeResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the request to onboard a member account as an Firewall Manager administrator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The account is onboarding to Firewall Manager as an administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARDING_COMPLETE</code> - Firewall Manager The account is onboarded to Firewall Manager as an
     * administrator, and can perform actions on the resources defined in their <a>AdminScope</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The account is being removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING_COMPLETE</code> - The account has been removed as an Firewall Manager administrator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the request to onboard a member account as an Firewall Manager administrator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONBOARDING</code> - The account is onboarding to Firewall Manager as an administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONBOARDING_COMPLETE</code> - Firewall Manager The account is onboarded to Firewall Manager as an
     *        administrator, and can perform actions on the resources defined in their <a>AdminScope</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARDING</code> - The account is being removed as an Firewall Manager administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARDING_COMPLETE</code> - The account has been removed as an Firewall Manager administrator.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationStatus
     */

    public GetAdminScopeResult withStatus(OrganizationStatus status) {
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
        if (getAdminScope() != null)
            sb.append("AdminScope: ").append(getAdminScope()).append(",");
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

        if (obj instanceof GetAdminScopeResult == false)
            return false;
        GetAdminScopeResult other = (GetAdminScopeResult) obj;
        if (other.getAdminScope() == null ^ this.getAdminScope() == null)
            return false;
        if (other.getAdminScope() != null && other.getAdminScope().equals(this.getAdminScope()) == false)
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

        hashCode = prime * hashCode + ((getAdminScope() == null) ? 0 : getAdminScope().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetAdminScopeResult clone() {
        try {
            return (GetAdminScopeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
