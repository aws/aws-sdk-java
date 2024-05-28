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
 * Defines the Organizations organizational units (OUs) that the specified Firewall Manager administrator can apply
 * policies to. For more information about OUs in Organizations, see <a
 * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing organizational units
 * (OUs) </a> in the <i>Organizations User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/OrganizationalUnitScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationalUnitScope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of OUs within the organization that the specified Firewall Manager administrator either can or cannot
     * apply policies to, based on the value of <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code>
     * . If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>true</code>, then
     * the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs in this
     * list. If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>false</code>,
     * then the Firewall Manager administrator can only apply policies to the OUs in this list.
     * </p>
     */
    private java.util.List<String> organizationalUnits;
    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all OUs within an organization. If
     * true, the administrator can manage all OUs within the organization. You can either enable management of all OUs
     * through this operation, or you can specify OUs to manage in
     * <code>OrganizationalUnitScope$OrganizationalUnits</code>. You cannot specify both.
     * </p>
     */
    private Boolean allOrganizationalUnitsEnabled;
    /**
     * <p>
     * A boolean value that excludes the OUs in <code>OrganizationalUnitScope$OrganizationalUnits</code> from the
     * administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in the
     * organization except for the OUs listed in <code>OrganizationalUnitScope$OrganizationalUnits</code>. You can
     * either specify a list of OUs to exclude by <code>OrganizationalUnitScope$OrganizationalUnits</code>, or you can
     * enable management of all OUs by <code>OrganizationalUnitScope$AllOrganizationalUnitsEnabled</code>. You cannot
     * specify both.
     * </p>
     */
    private Boolean excludeSpecifiedOrganizationalUnits;

    /**
     * <p>
     * The list of OUs within the organization that the specified Firewall Manager administrator either can or cannot
     * apply policies to, based on the value of <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code>
     * . If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>true</code>, then
     * the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs in this
     * list. If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>false</code>,
     * then the Firewall Manager administrator can only apply policies to the OUs in this list.
     * </p>
     * 
     * @return The list of OUs within the organization that the specified Firewall Manager administrator either can or
     *         cannot apply policies to, based on the value of
     *         <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code>. If
     *         <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>true</code>,
     *         then the Firewall Manager administrator can apply policies to all OUs in the organization except for the
     *         OUs in this list. If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to
     *         <code>false</code>, then the Firewall Manager administrator can only apply policies to the OUs in this
     *         list.
     */

    public java.util.List<String> getOrganizationalUnits() {
        return organizationalUnits;
    }

    /**
     * <p>
     * The list of OUs within the organization that the specified Firewall Manager administrator either can or cannot
     * apply policies to, based on the value of <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code>
     * . If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>true</code>, then
     * the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs in this
     * list. If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>false</code>,
     * then the Firewall Manager administrator can only apply policies to the OUs in this list.
     * </p>
     * 
     * @param organizationalUnits
     *        The list of OUs within the organization that the specified Firewall Manager administrator either can or
     *        cannot apply policies to, based on the value of
     *        <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code>. If
     *        <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>true</code>, then
     *        the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs in
     *        this list. If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to
     *        <code>false</code>, then the Firewall Manager administrator can only apply policies to the OUs in this
     *        list.
     */

    public void setOrganizationalUnits(java.util.Collection<String> organizationalUnits) {
        if (organizationalUnits == null) {
            this.organizationalUnits = null;
            return;
        }

        this.organizationalUnits = new java.util.ArrayList<String>(organizationalUnits);
    }

    /**
     * <p>
     * The list of OUs within the organization that the specified Firewall Manager administrator either can or cannot
     * apply policies to, based on the value of <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code>
     * . If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>true</code>, then
     * the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs in this
     * list. If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>false</code>,
     * then the Firewall Manager administrator can only apply policies to the OUs in this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationalUnits(java.util.Collection)} or {@link #withOrganizationalUnits(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param organizationalUnits
     *        The list of OUs within the organization that the specified Firewall Manager administrator either can or
     *        cannot apply policies to, based on the value of
     *        <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code>. If
     *        <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>true</code>, then
     *        the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs in
     *        this list. If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to
     *        <code>false</code>, then the Firewall Manager administrator can only apply policies to the OUs in this
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationalUnitScope withOrganizationalUnits(String... organizationalUnits) {
        if (this.organizationalUnits == null) {
            setOrganizationalUnits(new java.util.ArrayList<String>(organizationalUnits.length));
        }
        for (String ele : organizationalUnits) {
            this.organizationalUnits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of OUs within the organization that the specified Firewall Manager administrator either can or cannot
     * apply policies to, based on the value of <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code>
     * . If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>true</code>, then
     * the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs in this
     * list. If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>false</code>,
     * then the Firewall Manager administrator can only apply policies to the OUs in this list.
     * </p>
     * 
     * @param organizationalUnits
     *        The list of OUs within the organization that the specified Firewall Manager administrator either can or
     *        cannot apply policies to, based on the value of
     *        <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code>. If
     *        <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to <code>true</code>, then
     *        the Firewall Manager administrator can apply policies to all OUs in the organization except for the OUs in
     *        this list. If <code>OrganizationalUnitScope$ExcludeSpecifiedOrganizationalUnits</code> is set to
     *        <code>false</code>, then the Firewall Manager administrator can only apply policies to the OUs in this
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationalUnitScope withOrganizationalUnits(java.util.Collection<String> organizationalUnits) {
        setOrganizationalUnits(organizationalUnits);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all OUs within an organization. If
     * true, the administrator can manage all OUs within the organization. You can either enable management of all OUs
     * through this operation, or you can specify OUs to manage in
     * <code>OrganizationalUnitScope$OrganizationalUnits</code>. You cannot specify both.
     * </p>
     * 
     * @param allOrganizationalUnitsEnabled
     *        A boolean value that indicates if the administrator can apply policies to all OUs within an organization.
     *        If true, the administrator can manage all OUs within the organization. You can either enable management of
     *        all OUs through this operation, or you can specify OUs to manage in
     *        <code>OrganizationalUnitScope$OrganizationalUnits</code>. You cannot specify both.
     */

    public void setAllOrganizationalUnitsEnabled(Boolean allOrganizationalUnitsEnabled) {
        this.allOrganizationalUnitsEnabled = allOrganizationalUnitsEnabled;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all OUs within an organization. If
     * true, the administrator can manage all OUs within the organization. You can either enable management of all OUs
     * through this operation, or you can specify OUs to manage in
     * <code>OrganizationalUnitScope$OrganizationalUnits</code>. You cannot specify both.
     * </p>
     * 
     * @return A boolean value that indicates if the administrator can apply policies to all OUs within an organization.
     *         If true, the administrator can manage all OUs within the organization. You can either enable management
     *         of all OUs through this operation, or you can specify OUs to manage in
     *         <code>OrganizationalUnitScope$OrganizationalUnits</code>. You cannot specify both.
     */

    public Boolean getAllOrganizationalUnitsEnabled() {
        return this.allOrganizationalUnitsEnabled;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all OUs within an organization. If
     * true, the administrator can manage all OUs within the organization. You can either enable management of all OUs
     * through this operation, or you can specify OUs to manage in
     * <code>OrganizationalUnitScope$OrganizationalUnits</code>. You cannot specify both.
     * </p>
     * 
     * @param allOrganizationalUnitsEnabled
     *        A boolean value that indicates if the administrator can apply policies to all OUs within an organization.
     *        If true, the administrator can manage all OUs within the organization. You can either enable management of
     *        all OUs through this operation, or you can specify OUs to manage in
     *        <code>OrganizationalUnitScope$OrganizationalUnits</code>. You cannot specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationalUnitScope withAllOrganizationalUnitsEnabled(Boolean allOrganizationalUnitsEnabled) {
        setAllOrganizationalUnitsEnabled(allOrganizationalUnitsEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if the administrator can apply policies to all OUs within an organization. If
     * true, the administrator can manage all OUs within the organization. You can either enable management of all OUs
     * through this operation, or you can specify OUs to manage in
     * <code>OrganizationalUnitScope$OrganizationalUnits</code>. You cannot specify both.
     * </p>
     * 
     * @return A boolean value that indicates if the administrator can apply policies to all OUs within an organization.
     *         If true, the administrator can manage all OUs within the organization. You can either enable management
     *         of all OUs through this operation, or you can specify OUs to manage in
     *         <code>OrganizationalUnitScope$OrganizationalUnits</code>. You cannot specify both.
     */

    public Boolean isAllOrganizationalUnitsEnabled() {
        return this.allOrganizationalUnitsEnabled;
    }

    /**
     * <p>
     * A boolean value that excludes the OUs in <code>OrganizationalUnitScope$OrganizationalUnits</code> from the
     * administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in the
     * organization except for the OUs listed in <code>OrganizationalUnitScope$OrganizationalUnits</code>. You can
     * either specify a list of OUs to exclude by <code>OrganizationalUnitScope$OrganizationalUnits</code>, or you can
     * enable management of all OUs by <code>OrganizationalUnitScope$AllOrganizationalUnitsEnabled</code>. You cannot
     * specify both.
     * </p>
     * 
     * @param excludeSpecifiedOrganizationalUnits
     *        A boolean value that excludes the OUs in <code>OrganizationalUnitScope$OrganizationalUnits</code> from the
     *        administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in the
     *        organization except for the OUs listed in <code>OrganizationalUnitScope$OrganizationalUnits</code>. You
     *        can either specify a list of OUs to exclude by <code>OrganizationalUnitScope$OrganizationalUnits</code>,
     *        or you can enable management of all OUs by
     *        <code>OrganizationalUnitScope$AllOrganizationalUnitsEnabled</code>. You cannot specify both.
     */

    public void setExcludeSpecifiedOrganizationalUnits(Boolean excludeSpecifiedOrganizationalUnits) {
        this.excludeSpecifiedOrganizationalUnits = excludeSpecifiedOrganizationalUnits;
    }

    /**
     * <p>
     * A boolean value that excludes the OUs in <code>OrganizationalUnitScope$OrganizationalUnits</code> from the
     * administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in the
     * organization except for the OUs listed in <code>OrganizationalUnitScope$OrganizationalUnits</code>. You can
     * either specify a list of OUs to exclude by <code>OrganizationalUnitScope$OrganizationalUnits</code>, or you can
     * enable management of all OUs by <code>OrganizationalUnitScope$AllOrganizationalUnitsEnabled</code>. You cannot
     * specify both.
     * </p>
     * 
     * @return A boolean value that excludes the OUs in <code>OrganizationalUnitScope$OrganizationalUnits</code> from
     *         the administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in
     *         the organization except for the OUs listed in <code>OrganizationalUnitScope$OrganizationalUnits</code>.
     *         You can either specify a list of OUs to exclude by
     *         <code>OrganizationalUnitScope$OrganizationalUnits</code>, or you can enable management of all OUs by
     *         <code>OrganizationalUnitScope$AllOrganizationalUnitsEnabled</code>. You cannot specify both.
     */

    public Boolean getExcludeSpecifiedOrganizationalUnits() {
        return this.excludeSpecifiedOrganizationalUnits;
    }

    /**
     * <p>
     * A boolean value that excludes the OUs in <code>OrganizationalUnitScope$OrganizationalUnits</code> from the
     * administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in the
     * organization except for the OUs listed in <code>OrganizationalUnitScope$OrganizationalUnits</code>. You can
     * either specify a list of OUs to exclude by <code>OrganizationalUnitScope$OrganizationalUnits</code>, or you can
     * enable management of all OUs by <code>OrganizationalUnitScope$AllOrganizationalUnitsEnabled</code>. You cannot
     * specify both.
     * </p>
     * 
     * @param excludeSpecifiedOrganizationalUnits
     *        A boolean value that excludes the OUs in <code>OrganizationalUnitScope$OrganizationalUnits</code> from the
     *        administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in the
     *        organization except for the OUs listed in <code>OrganizationalUnitScope$OrganizationalUnits</code>. You
     *        can either specify a list of OUs to exclude by <code>OrganizationalUnitScope$OrganizationalUnits</code>,
     *        or you can enable management of all OUs by
     *        <code>OrganizationalUnitScope$AllOrganizationalUnitsEnabled</code>. You cannot specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationalUnitScope withExcludeSpecifiedOrganizationalUnits(Boolean excludeSpecifiedOrganizationalUnits) {
        setExcludeSpecifiedOrganizationalUnits(excludeSpecifiedOrganizationalUnits);
        return this;
    }

    /**
     * <p>
     * A boolean value that excludes the OUs in <code>OrganizationalUnitScope$OrganizationalUnits</code> from the
     * administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in the
     * organization except for the OUs listed in <code>OrganizationalUnitScope$OrganizationalUnits</code>. You can
     * either specify a list of OUs to exclude by <code>OrganizationalUnitScope$OrganizationalUnits</code>, or you can
     * enable management of all OUs by <code>OrganizationalUnitScope$AllOrganizationalUnitsEnabled</code>. You cannot
     * specify both.
     * </p>
     * 
     * @return A boolean value that excludes the OUs in <code>OrganizationalUnitScope$OrganizationalUnits</code> from
     *         the administrator's scope. If true, the Firewall Manager administrator can apply policies to all OUs in
     *         the organization except for the OUs listed in <code>OrganizationalUnitScope$OrganizationalUnits</code>.
     *         You can either specify a list of OUs to exclude by
     *         <code>OrganizationalUnitScope$OrganizationalUnits</code>, or you can enable management of all OUs by
     *         <code>OrganizationalUnitScope$AllOrganizationalUnitsEnabled</code>. You cannot specify both.
     */

    public Boolean isExcludeSpecifiedOrganizationalUnits() {
        return this.excludeSpecifiedOrganizationalUnits;
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
        if (getOrganizationalUnits() != null)
            sb.append("OrganizationalUnits: ").append(getOrganizationalUnits()).append(",");
        if (getAllOrganizationalUnitsEnabled() != null)
            sb.append("AllOrganizationalUnitsEnabled: ").append(getAllOrganizationalUnitsEnabled()).append(",");
        if (getExcludeSpecifiedOrganizationalUnits() != null)
            sb.append("ExcludeSpecifiedOrganizationalUnits: ").append(getExcludeSpecifiedOrganizationalUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationalUnitScope == false)
            return false;
        OrganizationalUnitScope other = (OrganizationalUnitScope) obj;
        if (other.getOrganizationalUnits() == null ^ this.getOrganizationalUnits() == null)
            return false;
        if (other.getOrganizationalUnits() != null && other.getOrganizationalUnits().equals(this.getOrganizationalUnits()) == false)
            return false;
        if (other.getAllOrganizationalUnitsEnabled() == null ^ this.getAllOrganizationalUnitsEnabled() == null)
            return false;
        if (other.getAllOrganizationalUnitsEnabled() != null
                && other.getAllOrganizationalUnitsEnabled().equals(this.getAllOrganizationalUnitsEnabled()) == false)
            return false;
        if (other.getExcludeSpecifiedOrganizationalUnits() == null ^ this.getExcludeSpecifiedOrganizationalUnits() == null)
            return false;
        if (other.getExcludeSpecifiedOrganizationalUnits() != null
                && other.getExcludeSpecifiedOrganizationalUnits().equals(this.getExcludeSpecifiedOrganizationalUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationalUnits() == null) ? 0 : getOrganizationalUnits().hashCode());
        hashCode = prime * hashCode + ((getAllOrganizationalUnitsEnabled() == null) ? 0 : getAllOrganizationalUnitsEnabled().hashCode());
        hashCode = prime * hashCode + ((getExcludeSpecifiedOrganizationalUnits() == null) ? 0 : getExcludeSpecifiedOrganizationalUnits().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationalUnitScope clone() {
        try {
            return (OrganizationalUnitScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.OrganizationalUnitScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
