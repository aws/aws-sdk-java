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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutAdminAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAdminAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID to add as an Firewall Manager administrator account. The account must be a
     * member of the organization that was onboarded to Firewall Manager by <a>AssociateAdminAccount</a>. For more
     * information about Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     */
    private String adminAccount;
    /**
     * <p>
     * Configures the resources that the specified Firewall Manager administrator can manage. As a best practice, set
     * the administrative scope according to the principles of least privilege. Only grant the administrator the
     * specific resources or permissions that they need to perform the duties of their role.
     * </p>
     */
    private AdminScope adminScope;

    /**
     * <p>
     * The Amazon Web Services account ID to add as an Firewall Manager administrator account. The account must be a
     * member of the organization that was onboarded to Firewall Manager by <a>AssociateAdminAccount</a>. For more
     * information about Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     * 
     * @param adminAccount
     *        The Amazon Web Services account ID to add as an Firewall Manager administrator account. The account must
     *        be a member of the organization that was onboarded to Firewall Manager by <a>AssociateAdminAccount</a>.
     *        For more information about Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the
     *        Amazon Web Services Accounts in Your Organization</a>.
     */

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID to add as an Firewall Manager administrator account. The account must be a
     * member of the organization that was onboarded to Firewall Manager by <a>AssociateAdminAccount</a>. For more
     * information about Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     * 
     * @return The Amazon Web Services account ID to add as an Firewall Manager administrator account. The account must
     *         be a member of the organization that was onboarded to Firewall Manager by <a>AssociateAdminAccount</a>.
     *         For more information about Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the
     *         Amazon Web Services Accounts in Your Organization</a>.
     */

    public String getAdminAccount() {
        return this.adminAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID to add as an Firewall Manager administrator account. The account must be a
     * member of the organization that was onboarded to Firewall Manager by <a>AssociateAdminAccount</a>. For more
     * information about Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     * 
     * @param adminAccount
     *        The Amazon Web Services account ID to add as an Firewall Manager administrator account. The account must
     *        be a member of the organization that was onboarded to Firewall Manager by <a>AssociateAdminAccount</a>.
     *        For more information about Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the
     *        Amazon Web Services Accounts in Your Organization</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAdminAccountRequest withAdminAccount(String adminAccount) {
        setAdminAccount(adminAccount);
        return this;
    }

    /**
     * <p>
     * Configures the resources that the specified Firewall Manager administrator can manage. As a best practice, set
     * the administrative scope according to the principles of least privilege. Only grant the administrator the
     * specific resources or permissions that they need to perform the duties of their role.
     * </p>
     * 
     * @param adminScope
     *        Configures the resources that the specified Firewall Manager administrator can manage. As a best practice,
     *        set the administrative scope according to the principles of least privilege. Only grant the administrator
     *        the specific resources or permissions that they need to perform the duties of their role.
     */

    public void setAdminScope(AdminScope adminScope) {
        this.adminScope = adminScope;
    }

    /**
     * <p>
     * Configures the resources that the specified Firewall Manager administrator can manage. As a best practice, set
     * the administrative scope according to the principles of least privilege. Only grant the administrator the
     * specific resources or permissions that they need to perform the duties of their role.
     * </p>
     * 
     * @return Configures the resources that the specified Firewall Manager administrator can manage. As a best
     *         practice, set the administrative scope according to the principles of least privilege. Only grant the
     *         administrator the specific resources or permissions that they need to perform the duties of their role.
     */

    public AdminScope getAdminScope() {
        return this.adminScope;
    }

    /**
     * <p>
     * Configures the resources that the specified Firewall Manager administrator can manage. As a best practice, set
     * the administrative scope according to the principles of least privilege. Only grant the administrator the
     * specific resources or permissions that they need to perform the duties of their role.
     * </p>
     * 
     * @param adminScope
     *        Configures the resources that the specified Firewall Manager administrator can manage. As a best practice,
     *        set the administrative scope according to the principles of least privilege. Only grant the administrator
     *        the specific resources or permissions that they need to perform the duties of their role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAdminAccountRequest withAdminScope(AdminScope adminScope) {
        setAdminScope(adminScope);
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
        if (getAdminScope() != null)
            sb.append("AdminScope: ").append(getAdminScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAdminAccountRequest == false)
            return false;
        PutAdminAccountRequest other = (PutAdminAccountRequest) obj;
        if (other.getAdminAccount() == null ^ this.getAdminAccount() == null)
            return false;
        if (other.getAdminAccount() != null && other.getAdminAccount().equals(this.getAdminAccount()) == false)
            return false;
        if (other.getAdminScope() == null ^ this.getAdminScope() == null)
            return false;
        if (other.getAdminScope() != null && other.getAdminScope().equals(this.getAdminScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminAccount() == null) ? 0 : getAdminAccount().hashCode());
        hashCode = prime * hashCode + ((getAdminScope() == null) ? 0 : getAdminScope().hashCode());
        return hashCode;
    }

    @Override
    public PutAdminAccountRequest clone() {
        return (PutAdminAccountRequest) super.clone();
    }

}
