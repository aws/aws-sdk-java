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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about how this workspace works with SAML.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/SamlConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamlConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana workspace.
     * If this is empty, all organizations in the assertion attribute have access.
     * </p>
     */
    private java.util.List<String> allowedOrganizations;
    /**
     * <p>
     * A structure that defines which attributes in the SAML assertion are to be used to define information about the
     * users authenticated by that IdP to use the workspace.
     * </p>
     */
    private AssertionAttributes assertionAttributes;
    /**
     * <p>
     * A structure containing the identity provider (IdP) metadata used to integrate the identity provider with this
     * workspace.
     * </p>
     */
    private IdpMetadata idpMetadata;
    /**
     * <p>
     * How long a sign-on session by a SAML user is valid, before the user has to sign on again.
     * </p>
     */
    private Integer loginValidityDuration;
    /**
     * <p>
     * A structure containing arrays that map group names in the SAML assertion to the Grafana <code>Admin</code> and
     * <code>Editor</code> roles in the workspace.
     * </p>
     */
    private RoleValues roleValues;

    /**
     * <p>
     * Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana workspace.
     * If this is empty, all organizations in the assertion attribute have access.
     * </p>
     * 
     * @return Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana
     *         workspace. If this is empty, all organizations in the assertion attribute have access.
     */

    public java.util.List<String> getAllowedOrganizations() {
        return allowedOrganizations;
    }

    /**
     * <p>
     * Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana workspace.
     * If this is empty, all organizations in the assertion attribute have access.
     * </p>
     * 
     * @param allowedOrganizations
     *        Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana
     *        workspace. If this is empty, all organizations in the assertion attribute have access.
     */

    public void setAllowedOrganizations(java.util.Collection<String> allowedOrganizations) {
        if (allowedOrganizations == null) {
            this.allowedOrganizations = null;
            return;
        }

        this.allowedOrganizations = new java.util.ArrayList<String>(allowedOrganizations);
    }

    /**
     * <p>
     * Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana workspace.
     * If this is empty, all organizations in the assertion attribute have access.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOrganizations(java.util.Collection)} or {@link #withAllowedOrganizations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param allowedOrganizations
     *        Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana
     *        workspace. If this is empty, all organizations in the assertion attribute have access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withAllowedOrganizations(String... allowedOrganizations) {
        if (this.allowedOrganizations == null) {
            setAllowedOrganizations(new java.util.ArrayList<String>(allowedOrganizations.length));
        }
        for (String ele : allowedOrganizations) {
            this.allowedOrganizations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana workspace.
     * If this is empty, all organizations in the assertion attribute have access.
     * </p>
     * 
     * @param allowedOrganizations
     *        Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana
     *        workspace. If this is empty, all organizations in the assertion attribute have access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withAllowedOrganizations(java.util.Collection<String> allowedOrganizations) {
        setAllowedOrganizations(allowedOrganizations);
        return this;
    }

    /**
     * <p>
     * A structure that defines which attributes in the SAML assertion are to be used to define information about the
     * users authenticated by that IdP to use the workspace.
     * </p>
     * 
     * @param assertionAttributes
     *        A structure that defines which attributes in the SAML assertion are to be used to define information about
     *        the users authenticated by that IdP to use the workspace.
     */

    public void setAssertionAttributes(AssertionAttributes assertionAttributes) {
        this.assertionAttributes = assertionAttributes;
    }

    /**
     * <p>
     * A structure that defines which attributes in the SAML assertion are to be used to define information about the
     * users authenticated by that IdP to use the workspace.
     * </p>
     * 
     * @return A structure that defines which attributes in the SAML assertion are to be used to define information
     *         about the users authenticated by that IdP to use the workspace.
     */

    public AssertionAttributes getAssertionAttributes() {
        return this.assertionAttributes;
    }

    /**
     * <p>
     * A structure that defines which attributes in the SAML assertion are to be used to define information about the
     * users authenticated by that IdP to use the workspace.
     * </p>
     * 
     * @param assertionAttributes
     *        A structure that defines which attributes in the SAML assertion are to be used to define information about
     *        the users authenticated by that IdP to use the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withAssertionAttributes(AssertionAttributes assertionAttributes) {
        setAssertionAttributes(assertionAttributes);
        return this;
    }

    /**
     * <p>
     * A structure containing the identity provider (IdP) metadata used to integrate the identity provider with this
     * workspace.
     * </p>
     * 
     * @param idpMetadata
     *        A structure containing the identity provider (IdP) metadata used to integrate the identity provider with
     *        this workspace.
     */

    public void setIdpMetadata(IdpMetadata idpMetadata) {
        this.idpMetadata = idpMetadata;
    }

    /**
     * <p>
     * A structure containing the identity provider (IdP) metadata used to integrate the identity provider with this
     * workspace.
     * </p>
     * 
     * @return A structure containing the identity provider (IdP) metadata used to integrate the identity provider with
     *         this workspace.
     */

    public IdpMetadata getIdpMetadata() {
        return this.idpMetadata;
    }

    /**
     * <p>
     * A structure containing the identity provider (IdP) metadata used to integrate the identity provider with this
     * workspace.
     * </p>
     * 
     * @param idpMetadata
     *        A structure containing the identity provider (IdP) metadata used to integrate the identity provider with
     *        this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withIdpMetadata(IdpMetadata idpMetadata) {
        setIdpMetadata(idpMetadata);
        return this;
    }

    /**
     * <p>
     * How long a sign-on session by a SAML user is valid, before the user has to sign on again.
     * </p>
     * 
     * @param loginValidityDuration
     *        How long a sign-on session by a SAML user is valid, before the user has to sign on again.
     */

    public void setLoginValidityDuration(Integer loginValidityDuration) {
        this.loginValidityDuration = loginValidityDuration;
    }

    /**
     * <p>
     * How long a sign-on session by a SAML user is valid, before the user has to sign on again.
     * </p>
     * 
     * @return How long a sign-on session by a SAML user is valid, before the user has to sign on again.
     */

    public Integer getLoginValidityDuration() {
        return this.loginValidityDuration;
    }

    /**
     * <p>
     * How long a sign-on session by a SAML user is valid, before the user has to sign on again.
     * </p>
     * 
     * @param loginValidityDuration
     *        How long a sign-on session by a SAML user is valid, before the user has to sign on again.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withLoginValidityDuration(Integer loginValidityDuration) {
        setLoginValidityDuration(loginValidityDuration);
        return this;
    }

    /**
     * <p>
     * A structure containing arrays that map group names in the SAML assertion to the Grafana <code>Admin</code> and
     * <code>Editor</code> roles in the workspace.
     * </p>
     * 
     * @param roleValues
     *        A structure containing arrays that map group names in the SAML assertion to the Grafana <code>Admin</code>
     *        and <code>Editor</code> roles in the workspace.
     */

    public void setRoleValues(RoleValues roleValues) {
        this.roleValues = roleValues;
    }

    /**
     * <p>
     * A structure containing arrays that map group names in the SAML assertion to the Grafana <code>Admin</code> and
     * <code>Editor</code> roles in the workspace.
     * </p>
     * 
     * @return A structure containing arrays that map group names in the SAML assertion to the Grafana
     *         <code>Admin</code> and <code>Editor</code> roles in the workspace.
     */

    public RoleValues getRoleValues() {
        return this.roleValues;
    }

    /**
     * <p>
     * A structure containing arrays that map group names in the SAML assertion to the Grafana <code>Admin</code> and
     * <code>Editor</code> roles in the workspace.
     * </p>
     * 
     * @param roleValues
     *        A structure containing arrays that map group names in the SAML assertion to the Grafana <code>Admin</code>
     *        and <code>Editor</code> roles in the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withRoleValues(RoleValues roleValues) {
        setRoleValues(roleValues);
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
        if (getAllowedOrganizations() != null)
            sb.append("AllowedOrganizations: ").append(getAllowedOrganizations()).append(",");
        if (getAssertionAttributes() != null)
            sb.append("AssertionAttributes: ").append(getAssertionAttributes()).append(",");
        if (getIdpMetadata() != null)
            sb.append("IdpMetadata: ").append(getIdpMetadata()).append(",");
        if (getLoginValidityDuration() != null)
            sb.append("LoginValidityDuration: ").append(getLoginValidityDuration()).append(",");
        if (getRoleValues() != null)
            sb.append("RoleValues: ").append(getRoleValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SamlConfiguration == false)
            return false;
        SamlConfiguration other = (SamlConfiguration) obj;
        if (other.getAllowedOrganizations() == null ^ this.getAllowedOrganizations() == null)
            return false;
        if (other.getAllowedOrganizations() != null && other.getAllowedOrganizations().equals(this.getAllowedOrganizations()) == false)
            return false;
        if (other.getAssertionAttributes() == null ^ this.getAssertionAttributes() == null)
            return false;
        if (other.getAssertionAttributes() != null && other.getAssertionAttributes().equals(this.getAssertionAttributes()) == false)
            return false;
        if (other.getIdpMetadata() == null ^ this.getIdpMetadata() == null)
            return false;
        if (other.getIdpMetadata() != null && other.getIdpMetadata().equals(this.getIdpMetadata()) == false)
            return false;
        if (other.getLoginValidityDuration() == null ^ this.getLoginValidityDuration() == null)
            return false;
        if (other.getLoginValidityDuration() != null && other.getLoginValidityDuration().equals(this.getLoginValidityDuration()) == false)
            return false;
        if (other.getRoleValues() == null ^ this.getRoleValues() == null)
            return false;
        if (other.getRoleValues() != null && other.getRoleValues().equals(this.getRoleValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedOrganizations() == null) ? 0 : getAllowedOrganizations().hashCode());
        hashCode = prime * hashCode + ((getAssertionAttributes() == null) ? 0 : getAssertionAttributes().hashCode());
        hashCode = prime * hashCode + ((getIdpMetadata() == null) ? 0 : getIdpMetadata().hashCode());
        hashCode = prime * hashCode + ((getLoginValidityDuration() == null) ? 0 : getLoginValidityDuration().hashCode());
        hashCode = prime * hashCode + ((getRoleValues() == null) ? 0 : getRoleValues().hashCode());
        return hashCode;
    }

    @Override
    public SamlConfiguration clone() {
        try {
            return (SamlConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.SamlConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
