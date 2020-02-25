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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * [<code>Service-managed</code> permissions] The AWS Organizations accounts to which StackSets deploys.
 * </p>
 * <p>
 * For update operations, you can specify either <code>Accounts</code> or <code>OrganizationalUnitIds</code>. For create
 * and delete operations, specify <code>OrganizationalUnitIds</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeploymentTargets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentTargets implements Serializable, Cloneable {

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to deploy stack set updates.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accounts;
    /**
     * <p>
     * The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> organizationalUnitIds;

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to deploy stack set updates.
     * </p>
     * 
     * @return The names of one or more AWS accounts for which you want to deploy stack set updates.
     */

    public java.util.List<String> getAccounts() {
        if (accounts == null) {
            accounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accounts;
    }

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to deploy stack set updates.
     * </p>
     * 
     * @param accounts
     *        The names of one or more AWS accounts for which you want to deploy stack set updates.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new com.amazonaws.internal.SdkInternalList<String>(accounts);
    }

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to deploy stack set updates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        The names of one or more AWS accounts for which you want to deploy stack set updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentTargets withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new com.amazonaws.internal.SdkInternalList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to deploy stack set updates.
     * </p>
     * 
     * @param accounts
     *        The names of one or more AWS accounts for which you want to deploy stack set updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentTargets withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
     * </p>
     * 
     * @return The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
     */

    public java.util.List<String> getOrganizationalUnitIds() {
        if (organizationalUnitIds == null) {
            organizationalUnitIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return organizationalUnitIds;
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
     * </p>
     * 
     * @param organizationalUnitIds
     *        The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
     */

    public void setOrganizationalUnitIds(java.util.Collection<String> organizationalUnitIds) {
        if (organizationalUnitIds == null) {
            this.organizationalUnitIds = null;
            return;
        }

        this.organizationalUnitIds = new com.amazonaws.internal.SdkInternalList<String>(organizationalUnitIds);
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationalUnitIds(java.util.Collection)} or
     * {@link #withOrganizationalUnitIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationalUnitIds
     *        The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentTargets withOrganizationalUnitIds(String... organizationalUnitIds) {
        if (this.organizationalUnitIds == null) {
            setOrganizationalUnitIds(new com.amazonaws.internal.SdkInternalList<String>(organizationalUnitIds.length));
        }
        for (String ele : organizationalUnitIds) {
            this.organizationalUnitIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
     * </p>
     * 
     * @param organizationalUnitIds
     *        The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentTargets withOrganizationalUnitIds(java.util.Collection<String> organizationalUnitIds) {
        setOrganizationalUnitIds(organizationalUnitIds);
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
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getOrganizationalUnitIds() != null)
            sb.append("OrganizationalUnitIds: ").append(getOrganizationalUnitIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentTargets == false)
            return false;
        DeploymentTargets other = (DeploymentTargets) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getOrganizationalUnitIds() == null ^ this.getOrganizationalUnitIds() == null)
            return false;
        if (other.getOrganizationalUnitIds() != null && other.getOrganizationalUnitIds().equals(this.getOrganizationalUnitIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitIds() == null) ? 0 : getOrganizationalUnitIds().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentTargets clone() {
        try {
            return (DeploymentTargets) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
