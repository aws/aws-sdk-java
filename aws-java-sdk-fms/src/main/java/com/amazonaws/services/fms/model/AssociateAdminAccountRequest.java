/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AssociateAdminAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAdminAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID to associate with Firewall Manager as the Firewall Manager administrator
     * account. This must be an Organizations member account. For more information about Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     */
    private String adminAccount;

    /**
     * <p>
     * The Amazon Web Services account ID to associate with Firewall Manager as the Firewall Manager administrator
     * account. This must be an Organizations member account. For more information about Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     * 
     * @param adminAccount
     *        The Amazon Web Services account ID to associate with Firewall Manager as the Firewall Manager
     *        administrator account. This must be an Organizations member account. For more information about
     *        Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the
     *        Amazon Web Services Accounts in Your Organization</a>.
     */

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID to associate with Firewall Manager as the Firewall Manager administrator
     * account. This must be an Organizations member account. For more information about Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     * 
     * @return The Amazon Web Services account ID to associate with Firewall Manager as the Firewall Manager
     *         administrator account. This must be an Organizations member account. For more information about
     *         Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the
     *         Amazon Web Services Accounts in Your Organization</a>.
     */

    public String getAdminAccount() {
        return this.adminAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID to associate with Firewall Manager as the Firewall Manager administrator
     * account. This must be an Organizations member account. For more information about Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     * 
     * @param adminAccount
     *        The Amazon Web Services account ID to associate with Firewall Manager as the Firewall Manager
     *        administrator account. This must be an Organizations member account. For more information about
     *        Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the
     *        Amazon Web Services Accounts in Your Organization</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAdminAccountRequest withAdminAccount(String adminAccount) {
        setAdminAccount(adminAccount);
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
            sb.append("AdminAccount: ").append(getAdminAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAdminAccountRequest == false)
            return false;
        AssociateAdminAccountRequest other = (AssociateAdminAccountRequest) obj;
        if (other.getAdminAccount() == null ^ this.getAdminAccount() == null)
            return false;
        if (other.getAdminAccount() != null && other.getAdminAccount().equals(this.getAdminAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminAccount() == null) ? 0 : getAdminAccount().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAdminAccountRequest clone() {
        return (AssociateAdminAccountRequest) super.clone();
    }

}
