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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains high level information about the Firewall Manager administrator account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AdminAccountSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminAccountSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the Firewall Manager administrator's account.
     * </p>
     */
    private String adminAccount;
    /**
     * <p>
     * A boolean value that indicates if the administrator is the default administrator. If true, then this is the
     * default administrator account. The default administrator can manage third-party firewalls and has full
     * administrative scope. There is only one default administrator account per organization. For information about
     * Firewall Manager default administrator accounts, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall Manager
     * administrators</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     */
    private Boolean defaultAdmin;
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
     * The Amazon Web Services account ID of the Firewall Manager administrator's account.
     * </p>
     * 
     * @param adminAccount
     *        The Amazon Web Services account ID of the Firewall Manager administrator's account.
     */

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Firewall Manager administrator's account.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the Firewall Manager administrator's account.
     */

    public String getAdminAccount() {
        return this.adminAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Firewall Manager administrator's account.
     * </p>
     * 
     * @param adminAccount
     *        The Amazon Web Services account ID of the Firewall Manager administrator's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminAccountSummary withAdminAccount(String adminAccount) {
        setAdminAccount(adminAccount);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator is the default administrator. If true, then this is the
     * default administrator account. The default administrator can manage third-party firewalls and has full
     * administrative scope. There is only one default administrator account per organization. For information about
     * Firewall Manager default administrator accounts, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall Manager
     * administrators</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @param defaultAdmin
     *        A boolean value that indicates if the administrator is the default administrator. If true, then this is
     *        the default administrator account. The default administrator can manage third-party firewalls and has full
     *        administrative scope. There is only one default administrator account per organization. For information
     *        about Firewall Manager default administrator accounts, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall
     *        Manager administrators</a> in the <i>Firewall Manager Developer Guide</i>.
     */

    public void setDefaultAdmin(Boolean defaultAdmin) {
        this.defaultAdmin = defaultAdmin;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator is the default administrator. If true, then this is the
     * default administrator account. The default administrator can manage third-party firewalls and has full
     * administrative scope. There is only one default administrator account per organization. For information about
     * Firewall Manager default administrator accounts, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall Manager
     * administrators</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @return A boolean value that indicates if the administrator is the default administrator. If true, then this is
     *         the default administrator account. The default administrator can manage third-party firewalls and has
     *         full administrative scope. There is only one default administrator account per organization. For
     *         information about Firewall Manager default administrator accounts, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall
     *         Manager administrators</a> in the <i>Firewall Manager Developer Guide</i>.
     */

    public Boolean getDefaultAdmin() {
        return this.defaultAdmin;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator is the default administrator. If true, then this is the
     * default administrator account. The default administrator can manage third-party firewalls and has full
     * administrative scope. There is only one default administrator account per organization. For information about
     * Firewall Manager default administrator accounts, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall Manager
     * administrators</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @param defaultAdmin
     *        A boolean value that indicates if the administrator is the default administrator. If true, then this is
     *        the default administrator account. The default administrator can manage third-party firewalls and has full
     *        administrative scope. There is only one default administrator account per organization. For information
     *        about Firewall Manager default administrator accounts, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall
     *        Manager administrators</a> in the <i>Firewall Manager Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminAccountSummary withDefaultAdmin(Boolean defaultAdmin) {
        setDefaultAdmin(defaultAdmin);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator is the default administrator. If true, then this is the
     * default administrator account. The default administrator can manage third-party firewalls and has full
     * administrative scope. There is only one default administrator account per organization. For information about
     * Firewall Manager default administrator accounts, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall Manager
     * administrators</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @return A boolean value that indicates if the administrator is the default administrator. If true, then this is
     *         the default administrator account. The default administrator can manage third-party firewalls and has
     *         full administrative scope. There is only one default administrator account per organization. For
     *         information about Firewall Manager default administrator accounts, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall
     *         Manager administrators</a> in the <i>Firewall Manager Developer Guide</i>.
     */

    public Boolean isDefaultAdmin() {
        return this.defaultAdmin;
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

    public AdminAccountSummary withStatus(String status) {
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

    public AdminAccountSummary withStatus(OrganizationStatus status) {
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
        if (getAdminAccount() != null)
            sb.append("AdminAccount: ").append(getAdminAccount()).append(",");
        if (getDefaultAdmin() != null)
            sb.append("DefaultAdmin: ").append(getDefaultAdmin()).append(",");
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

        if (obj instanceof AdminAccountSummary == false)
            return false;
        AdminAccountSummary other = (AdminAccountSummary) obj;
        if (other.getAdminAccount() == null ^ this.getAdminAccount() == null)
            return false;
        if (other.getAdminAccount() != null && other.getAdminAccount().equals(this.getAdminAccount()) == false)
            return false;
        if (other.getDefaultAdmin() == null ^ this.getDefaultAdmin() == null)
            return false;
        if (other.getDefaultAdmin() != null && other.getDefaultAdmin().equals(this.getDefaultAdmin()) == false)
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

        hashCode = prime * hashCode + ((getAdminAccount() == null) ? 0 : getAdminAccount().hashCode());
        hashCode = prime * hashCode + ((getDefaultAdmin() == null) ? 0 : getDefaultAdmin().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AdminAccountSummary clone() {
        try {
            return (AdminAccountSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.AdminAccountSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
