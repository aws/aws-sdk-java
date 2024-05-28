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
 * Defines the resources that the Firewall Manager administrator can manage. For more information about administrative
 * scope, see <a href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-administrators.html">Managing Firewall
 * Manager administrators</a> in the <i>Firewall Manager Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AdminScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminScope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the accounts that the specified Firewall Manager administrator can apply policies to.
     * </p>
     */
    private AccountScope accountScope;
    /**
     * <p>
     * Defines the Organizations organizational units that the specified Firewall Manager administrator can apply
     * policies to. For more information about OUs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing organizational
     * units (OUs) </a> in the <i>Organizations User Guide</i>.
     * </p>
     */
    private OrganizationalUnitScope organizationalUnitScope;
    /**
     * <p>
     * Defines the Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * </p>
     */
    private RegionScope regionScope;
    /**
     * <p>
     * Defines the Firewall Manager policy types that the specified Firewall Manager administrator can create and
     * manage.
     * </p>
     */
    private PolicyTypeScope policyTypeScope;

    /**
     * <p>
     * Defines the accounts that the specified Firewall Manager administrator can apply policies to.
     * </p>
     * 
     * @param accountScope
     *        Defines the accounts that the specified Firewall Manager administrator can apply policies to.
     */

    public void setAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope;
    }

    /**
     * <p>
     * Defines the accounts that the specified Firewall Manager administrator can apply policies to.
     * </p>
     * 
     * @return Defines the accounts that the specified Firewall Manager administrator can apply policies to.
     */

    public AccountScope getAccountScope() {
        return this.accountScope;
    }

    /**
     * <p>
     * Defines the accounts that the specified Firewall Manager administrator can apply policies to.
     * </p>
     * 
     * @param accountScope
     *        Defines the accounts that the specified Firewall Manager administrator can apply policies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminScope withAccountScope(AccountScope accountScope) {
        setAccountScope(accountScope);
        return this;
    }

    /**
     * <p>
     * Defines the Organizations organizational units that the specified Firewall Manager administrator can apply
     * policies to. For more information about OUs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing organizational
     * units (OUs) </a> in the <i>Organizations User Guide</i>.
     * </p>
     * 
     * @param organizationalUnitScope
     *        Defines the Organizations organizational units that the specified Firewall Manager administrator can apply
     *        policies to. For more information about OUs in Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing
     *        organizational units (OUs) </a> in the <i>Organizations User Guide</i>.
     */

    public void setOrganizationalUnitScope(OrganizationalUnitScope organizationalUnitScope) {
        this.organizationalUnitScope = organizationalUnitScope;
    }

    /**
     * <p>
     * Defines the Organizations organizational units that the specified Firewall Manager administrator can apply
     * policies to. For more information about OUs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing organizational
     * units (OUs) </a> in the <i>Organizations User Guide</i>.
     * </p>
     * 
     * @return Defines the Organizations organizational units that the specified Firewall Manager administrator can
     *         apply policies to. For more information about OUs in Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing
     *         organizational units (OUs) </a> in the <i>Organizations User Guide</i>.
     */

    public OrganizationalUnitScope getOrganizationalUnitScope() {
        return this.organizationalUnitScope;
    }

    /**
     * <p>
     * Defines the Organizations organizational units that the specified Firewall Manager administrator can apply
     * policies to. For more information about OUs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing organizational
     * units (OUs) </a> in the <i>Organizations User Guide</i>.
     * </p>
     * 
     * @param organizationalUnitScope
     *        Defines the Organizations organizational units that the specified Firewall Manager administrator can apply
     *        policies to. For more information about OUs in Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing
     *        organizational units (OUs) </a> in the <i>Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminScope withOrganizationalUnitScope(OrganizationalUnitScope organizationalUnitScope) {
        setOrganizationalUnitScope(organizationalUnitScope);
        return this;
    }

    /**
     * <p>
     * Defines the Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * </p>
     * 
     * @param regionScope
     *        Defines the Amazon Web Services Regions that the specified Firewall Manager administrator can perform
     *        actions in.
     */

    public void setRegionScope(RegionScope regionScope) {
        this.regionScope = regionScope;
    }

    /**
     * <p>
     * Defines the Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * </p>
     * 
     * @return Defines the Amazon Web Services Regions that the specified Firewall Manager administrator can perform
     *         actions in.
     */

    public RegionScope getRegionScope() {
        return this.regionScope;
    }

    /**
     * <p>
     * Defines the Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * </p>
     * 
     * @param regionScope
     *        Defines the Amazon Web Services Regions that the specified Firewall Manager administrator can perform
     *        actions in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminScope withRegionScope(RegionScope regionScope) {
        setRegionScope(regionScope);
        return this;
    }

    /**
     * <p>
     * Defines the Firewall Manager policy types that the specified Firewall Manager administrator can create and
     * manage.
     * </p>
     * 
     * @param policyTypeScope
     *        Defines the Firewall Manager policy types that the specified Firewall Manager administrator can create and
     *        manage.
     */

    public void setPolicyTypeScope(PolicyTypeScope policyTypeScope) {
        this.policyTypeScope = policyTypeScope;
    }

    /**
     * <p>
     * Defines the Firewall Manager policy types that the specified Firewall Manager administrator can create and
     * manage.
     * </p>
     * 
     * @return Defines the Firewall Manager policy types that the specified Firewall Manager administrator can create
     *         and manage.
     */

    public PolicyTypeScope getPolicyTypeScope() {
        return this.policyTypeScope;
    }

    /**
     * <p>
     * Defines the Firewall Manager policy types that the specified Firewall Manager administrator can create and
     * manage.
     * </p>
     * 
     * @param policyTypeScope
     *        Defines the Firewall Manager policy types that the specified Firewall Manager administrator can create and
     *        manage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminScope withPolicyTypeScope(PolicyTypeScope policyTypeScope) {
        setPolicyTypeScope(policyTypeScope);
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
        if (getAccountScope() != null)
            sb.append("AccountScope: ").append(getAccountScope()).append(",");
        if (getOrganizationalUnitScope() != null)
            sb.append("OrganizationalUnitScope: ").append(getOrganizationalUnitScope()).append(",");
        if (getRegionScope() != null)
            sb.append("RegionScope: ").append(getRegionScope()).append(",");
        if (getPolicyTypeScope() != null)
            sb.append("PolicyTypeScope: ").append(getPolicyTypeScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminScope == false)
            return false;
        AdminScope other = (AdminScope) obj;
        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
        if (other.getOrganizationalUnitScope() == null ^ this.getOrganizationalUnitScope() == null)
            return false;
        if (other.getOrganizationalUnitScope() != null && other.getOrganizationalUnitScope().equals(this.getOrganizationalUnitScope()) == false)
            return false;
        if (other.getRegionScope() == null ^ this.getRegionScope() == null)
            return false;
        if (other.getRegionScope() != null && other.getRegionScope().equals(this.getRegionScope()) == false)
            return false;
        if (other.getPolicyTypeScope() == null ^ this.getPolicyTypeScope() == null)
            return false;
        if (other.getPolicyTypeScope() != null && other.getPolicyTypeScope().equals(this.getPolicyTypeScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitScope() == null) ? 0 : getOrganizationalUnitScope().hashCode());
        hashCode = prime * hashCode + ((getRegionScope() == null) ? 0 : getRegionScope().hashCode());
        hashCode = prime * hashCode + ((getPolicyTypeScope() == null) ? 0 : getPolicyTypeScope().hashCode());
        return hashCode;
    }

    @Override
    public AdminScope clone() {
        try {
            return (AdminScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.AdminScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
