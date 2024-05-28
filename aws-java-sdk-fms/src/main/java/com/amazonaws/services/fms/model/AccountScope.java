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
 * Configures the accounts within the administrator's Organizations organization that the specified Firewall Manager
 * administrator can apply policies to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AccountScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountScope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of accounts within the organization that the specified Firewall Manager administrator either can or
     * cannot apply policies to, based on the value of <code>ExcludeSpecifiedAccounts</code>. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>true</code>, then the Firewall Manager administrator can
     * apply policies to all members of the organization except for the accounts in this list. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>false</code>, then the Firewall Manager administrator can
     * only apply policies to the accounts in this list.
     * </p>
     */
    private java.util.List<String> accounts;
    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all accounts within an organization. If
     * true, the administrator can apply policies to all accounts within the organization. You can either enable
     * management of all accounts through this operation, or you can specify a list of accounts to manage in
     * <code>AccountScope$Accounts</code>. You cannot specify both.
     * </p>
     */
    private Boolean allAccountsEnabled;
    /**
     * <p>
     * A boolean value that excludes the accounts in <code>AccountScope$Accounts</code> from the administrator's scope.
     * If true, the Firewall Manager administrator can apply policies to all members of the organization except for the
     * accounts listed in <code>AccountScope$Accounts</code>. You can either specify a list of accounts to exclude by
     * <code>AccountScope$Accounts</code>, or you can enable management of all accounts by
     * <code>AccountScope$AllAccountsEnabled</code>. You cannot specify both.
     * </p>
     */
    private Boolean excludeSpecifiedAccounts;

    /**
     * <p>
     * The list of accounts within the organization that the specified Firewall Manager administrator either can or
     * cannot apply policies to, based on the value of <code>ExcludeSpecifiedAccounts</code>. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>true</code>, then the Firewall Manager administrator can
     * apply policies to all members of the organization except for the accounts in this list. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>false</code>, then the Firewall Manager administrator can
     * only apply policies to the accounts in this list.
     * </p>
     * 
     * @return The list of accounts within the organization that the specified Firewall Manager administrator either can
     *         or cannot apply policies to, based on the value of <code>ExcludeSpecifiedAccounts</code>. If
     *         <code>ExcludeSpecifiedAccounts</code> is set to <code>true</code>, then the Firewall Manager
     *         administrator can apply policies to all members of the organization except for the accounts in this list.
     *         If <code>ExcludeSpecifiedAccounts</code> is set to <code>false</code>, then the Firewall Manager
     *         administrator can only apply policies to the accounts in this list.
     */

    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * The list of accounts within the organization that the specified Firewall Manager administrator either can or
     * cannot apply policies to, based on the value of <code>ExcludeSpecifiedAccounts</code>. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>true</code>, then the Firewall Manager administrator can
     * apply policies to all members of the organization except for the accounts in this list. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>false</code>, then the Firewall Manager administrator can
     * only apply policies to the accounts in this list.
     * </p>
     * 
     * @param accounts
     *        The list of accounts within the organization that the specified Firewall Manager administrator either can
     *        or cannot apply policies to, based on the value of <code>ExcludeSpecifiedAccounts</code>. If
     *        <code>ExcludeSpecifiedAccounts</code> is set to <code>true</code>, then the Firewall Manager administrator
     *        can apply policies to all members of the organization except for the accounts in this list. If
     *        <code>ExcludeSpecifiedAccounts</code> is set to <code>false</code>, then the Firewall Manager
     *        administrator can only apply policies to the accounts in this list.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>
     * The list of accounts within the organization that the specified Firewall Manager administrator either can or
     * cannot apply policies to, based on the value of <code>ExcludeSpecifiedAccounts</code>. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>true</code>, then the Firewall Manager administrator can
     * apply policies to all members of the organization except for the accounts in this list. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>false</code>, then the Firewall Manager administrator can
     * only apply policies to the accounts in this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        The list of accounts within the organization that the specified Firewall Manager administrator either can
     *        or cannot apply policies to, based on the value of <code>ExcludeSpecifiedAccounts</code>. If
     *        <code>ExcludeSpecifiedAccounts</code> is set to <code>true</code>, then the Firewall Manager administrator
     *        can apply policies to all members of the organization except for the accounts in this list. If
     *        <code>ExcludeSpecifiedAccounts</code> is set to <code>false</code>, then the Firewall Manager
     *        administrator can only apply policies to the accounts in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountScope withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of accounts within the organization that the specified Firewall Manager administrator either can or
     * cannot apply policies to, based on the value of <code>ExcludeSpecifiedAccounts</code>. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>true</code>, then the Firewall Manager administrator can
     * apply policies to all members of the organization except for the accounts in this list. If
     * <code>ExcludeSpecifiedAccounts</code> is set to <code>false</code>, then the Firewall Manager administrator can
     * only apply policies to the accounts in this list.
     * </p>
     * 
     * @param accounts
     *        The list of accounts within the organization that the specified Firewall Manager administrator either can
     *        or cannot apply policies to, based on the value of <code>ExcludeSpecifiedAccounts</code>. If
     *        <code>ExcludeSpecifiedAccounts</code> is set to <code>true</code>, then the Firewall Manager administrator
     *        can apply policies to all members of the organization except for the accounts in this list. If
     *        <code>ExcludeSpecifiedAccounts</code> is set to <code>false</code>, then the Firewall Manager
     *        administrator can only apply policies to the accounts in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountScope withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all accounts within an organization. If
     * true, the administrator can apply policies to all accounts within the organization. You can either enable
     * management of all accounts through this operation, or you can specify a list of accounts to manage in
     * <code>AccountScope$Accounts</code>. You cannot specify both.
     * </p>
     * 
     * @param allAccountsEnabled
     *        A boolean value that indicates if the administrator can apply policies to all accounts within an
     *        organization. If true, the administrator can apply policies to all accounts within the organization. You
     *        can either enable management of all accounts through this operation, or you can specify a list of accounts
     *        to manage in <code>AccountScope$Accounts</code>. You cannot specify both.
     */

    public void setAllAccountsEnabled(Boolean allAccountsEnabled) {
        this.allAccountsEnabled = allAccountsEnabled;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all accounts within an organization. If
     * true, the administrator can apply policies to all accounts within the organization. You can either enable
     * management of all accounts through this operation, or you can specify a list of accounts to manage in
     * <code>AccountScope$Accounts</code>. You cannot specify both.
     * </p>
     * 
     * @return A boolean value that indicates if the administrator can apply policies to all accounts within an
     *         organization. If true, the administrator can apply policies to all accounts within the organization. You
     *         can either enable management of all accounts through this operation, or you can specify a list of
     *         accounts to manage in <code>AccountScope$Accounts</code>. You cannot specify both.
     */

    public Boolean getAllAccountsEnabled() {
        return this.allAccountsEnabled;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all accounts within an organization. If
     * true, the administrator can apply policies to all accounts within the organization. You can either enable
     * management of all accounts through this operation, or you can specify a list of accounts to manage in
     * <code>AccountScope$Accounts</code>. You cannot specify both.
     * </p>
     * 
     * @param allAccountsEnabled
     *        A boolean value that indicates if the administrator can apply policies to all accounts within an
     *        organization. If true, the administrator can apply policies to all accounts within the organization. You
     *        can either enable management of all accounts through this operation, or you can specify a list of accounts
     *        to manage in <code>AccountScope$Accounts</code>. You cannot specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountScope withAllAccountsEnabled(Boolean allAccountsEnabled) {
        setAllAccountsEnabled(allAccountsEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all accounts within an organization. If
     * true, the administrator can apply policies to all accounts within the organization. You can either enable
     * management of all accounts through this operation, or you can specify a list of accounts to manage in
     * <code>AccountScope$Accounts</code>. You cannot specify both.
     * </p>
     * 
     * @return A boolean value that indicates if the administrator can apply policies to all accounts within an
     *         organization. If true, the administrator can apply policies to all accounts within the organization. You
     *         can either enable management of all accounts through this operation, or you can specify a list of
     *         accounts to manage in <code>AccountScope$Accounts</code>. You cannot specify both.
     */

    public Boolean isAllAccountsEnabled() {
        return this.allAccountsEnabled;
    }

    /**
     * <p>
     * A boolean value that excludes the accounts in <code>AccountScope$Accounts</code> from the administrator's scope.
     * If true, the Firewall Manager administrator can apply policies to all members of the organization except for the
     * accounts listed in <code>AccountScope$Accounts</code>. You can either specify a list of accounts to exclude by
     * <code>AccountScope$Accounts</code>, or you can enable management of all accounts by
     * <code>AccountScope$AllAccountsEnabled</code>. You cannot specify both.
     * </p>
     * 
     * @param excludeSpecifiedAccounts
     *        A boolean value that excludes the accounts in <code>AccountScope$Accounts</code> from the administrator's
     *        scope. If true, the Firewall Manager administrator can apply policies to all members of the organization
     *        except for the accounts listed in <code>AccountScope$Accounts</code>. You can either specify a list of
     *        accounts to exclude by <code>AccountScope$Accounts</code>, or you can enable management of all accounts by
     *        <code>AccountScope$AllAccountsEnabled</code>. You cannot specify both.
     */

    public void setExcludeSpecifiedAccounts(Boolean excludeSpecifiedAccounts) {
        this.excludeSpecifiedAccounts = excludeSpecifiedAccounts;
    }

    /**
     * <p>
     * A boolean value that excludes the accounts in <code>AccountScope$Accounts</code> from the administrator's scope.
     * If true, the Firewall Manager administrator can apply policies to all members of the organization except for the
     * accounts listed in <code>AccountScope$Accounts</code>. You can either specify a list of accounts to exclude by
     * <code>AccountScope$Accounts</code>, or you can enable management of all accounts by
     * <code>AccountScope$AllAccountsEnabled</code>. You cannot specify both.
     * </p>
     * 
     * @return A boolean value that excludes the accounts in <code>AccountScope$Accounts</code> from the administrator's
     *         scope. If true, the Firewall Manager administrator can apply policies to all members of the organization
     *         except for the accounts listed in <code>AccountScope$Accounts</code>. You can either specify a list of
     *         accounts to exclude by <code>AccountScope$Accounts</code>, or you can enable management of all accounts
     *         by <code>AccountScope$AllAccountsEnabled</code>. You cannot specify both.
     */

    public Boolean getExcludeSpecifiedAccounts() {
        return this.excludeSpecifiedAccounts;
    }

    /**
     * <p>
     * A boolean value that excludes the accounts in <code>AccountScope$Accounts</code> from the administrator's scope.
     * If true, the Firewall Manager administrator can apply policies to all members of the organization except for the
     * accounts listed in <code>AccountScope$Accounts</code>. You can either specify a list of accounts to exclude by
     * <code>AccountScope$Accounts</code>, or you can enable management of all accounts by
     * <code>AccountScope$AllAccountsEnabled</code>. You cannot specify both.
     * </p>
     * 
     * @param excludeSpecifiedAccounts
     *        A boolean value that excludes the accounts in <code>AccountScope$Accounts</code> from the administrator's
     *        scope. If true, the Firewall Manager administrator can apply policies to all members of the organization
     *        except for the accounts listed in <code>AccountScope$Accounts</code>. You can either specify a list of
     *        accounts to exclude by <code>AccountScope$Accounts</code>, or you can enable management of all accounts by
     *        <code>AccountScope$AllAccountsEnabled</code>. You cannot specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountScope withExcludeSpecifiedAccounts(Boolean excludeSpecifiedAccounts) {
        setExcludeSpecifiedAccounts(excludeSpecifiedAccounts);
        return this;
    }

    /**
     * <p>
     * A boolean value that excludes the accounts in <code>AccountScope$Accounts</code> from the administrator's scope.
     * If true, the Firewall Manager administrator can apply policies to all members of the organization except for the
     * accounts listed in <code>AccountScope$Accounts</code>. You can either specify a list of accounts to exclude by
     * <code>AccountScope$Accounts</code>, or you can enable management of all accounts by
     * <code>AccountScope$AllAccountsEnabled</code>. You cannot specify both.
     * </p>
     * 
     * @return A boolean value that excludes the accounts in <code>AccountScope$Accounts</code> from the administrator's
     *         scope. If true, the Firewall Manager administrator can apply policies to all members of the organization
     *         except for the accounts listed in <code>AccountScope$Accounts</code>. You can either specify a list of
     *         accounts to exclude by <code>AccountScope$Accounts</code>, or you can enable management of all accounts
     *         by <code>AccountScope$AllAccountsEnabled</code>. You cannot specify both.
     */

    public Boolean isExcludeSpecifiedAccounts() {
        return this.excludeSpecifiedAccounts;
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
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getAllAccountsEnabled() != null)
            sb.append("AllAccountsEnabled: ").append(getAllAccountsEnabled()).append(",");
        if (getExcludeSpecifiedAccounts() != null)
            sb.append("ExcludeSpecifiedAccounts: ").append(getExcludeSpecifiedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountScope == false)
            return false;
        AccountScope other = (AccountScope) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getAllAccountsEnabled() == null ^ this.getAllAccountsEnabled() == null)
            return false;
        if (other.getAllAccountsEnabled() != null && other.getAllAccountsEnabled().equals(this.getAllAccountsEnabled()) == false)
            return false;
        if (other.getExcludeSpecifiedAccounts() == null ^ this.getExcludeSpecifiedAccounts() == null)
            return false;
        if (other.getExcludeSpecifiedAccounts() != null && other.getExcludeSpecifiedAccounts().equals(this.getExcludeSpecifiedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getAllAccountsEnabled() == null) ? 0 : getAllAccountsEnabled().hashCode());
        hashCode = prime * hashCode + ((getExcludeSpecifiedAccounts() == null) ? 0 : getExcludeSpecifiedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public AccountScope clone() {
        try {
            return (AccountScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.AccountScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
