/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A role mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/RoleMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoleMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims
     * from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the
     * token to map to a role.
     * </p>
     */
    private String type;
    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or
     * there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches
     * for the <code>Token</code> type.
     * </p>
     */
    private String ambiguousRoleResolution;
    /**
     * <p>
     * The rules to be used for mapping users to roles.
     * </p>
     * <p>
     * If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.
     * </p>
     */
    private RulesConfigurationType rulesConfiguration;

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims
     * from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the
     * token to map to a role.
     * </p>
     * 
     * @param type
     *        The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code>
     *        claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims
     *        from the token to map to a role.
     * @see RoleMappingType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims
     * from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the
     * token to map to a role.
     * </p>
     * 
     * @return The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code>
     *         claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match
     *         claims from the token to map to a role.
     * @see RoleMappingType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims
     * from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the
     * token to map to a role.
     * </p>
     * 
     * @param type
     *        The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code>
     *        claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims
     *        from the token to map to a role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleMappingType
     */

    public RoleMapping withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims
     * from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the
     * token to map to a role.
     * </p>
     * 
     * @param type
     *        The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code>
     *        claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims
     *        from the token to map to a role.
     * @see RoleMappingType
     */

    public void setType(RoleMappingType type) {
        withType(type);
    }

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims
     * from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the
     * token to map to a role.
     * </p>
     * 
     * @param type
     *        The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code>
     *        claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims
     *        from the token to map to a role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleMappingType
     */

    public RoleMapping withType(RoleMappingType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or
     * there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches
     * for the <code>Token</code> type.
     * </p>
     * 
     * @param ambiguousRoleResolution
     *        If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is
     *        required.</p>
     *        <p>
     *        Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type,
     *        or there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code>
     *        matches for the <code>Token</code> type.
     * @see AmbiguousRoleResolutionType
     */

    public void setAmbiguousRoleResolution(String ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution;
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or
     * there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches
     * for the <code>Token</code> type.
     * </p>
     * 
     * @return If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is
     *         required.</p>
     *         <p>
     *         Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code>
     *         type, or there is no <code>cognito:preferred_role</code> claim and there are multiple
     *         <code>cognito:roles</code> matches for the <code>Token</code> type.
     * @see AmbiguousRoleResolutionType
     */

    public String getAmbiguousRoleResolution() {
        return this.ambiguousRoleResolution;
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or
     * there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches
     * for the <code>Token</code> type.
     * </p>
     * 
     * @param ambiguousRoleResolution
     *        If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is
     *        required.</p>
     *        <p>
     *        Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type,
     *        or there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code>
     *        matches for the <code>Token</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmbiguousRoleResolutionType
     */

    public RoleMapping withAmbiguousRoleResolution(String ambiguousRoleResolution) {
        setAmbiguousRoleResolution(ambiguousRoleResolution);
        return this;
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or
     * there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches
     * for the <code>Token</code> type.
     * </p>
     * 
     * @param ambiguousRoleResolution
     *        If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is
     *        required.</p>
     *        <p>
     *        Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type,
     *        or there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code>
     *        matches for the <code>Token</code> type.
     * @see AmbiguousRoleResolutionType
     */

    public void setAmbiguousRoleResolution(AmbiguousRoleResolutionType ambiguousRoleResolution) {
        withAmbiguousRoleResolution(ambiguousRoleResolution);
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or
     * there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches
     * for the <code>Token</code> type.
     * </p>
     * 
     * @param ambiguousRoleResolution
     *        If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is
     *        required.</p>
     *        <p>
     *        Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type,
     *        or there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code>
     *        matches for the <code>Token</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmbiguousRoleResolutionType
     */

    public RoleMapping withAmbiguousRoleResolution(AmbiguousRoleResolutionType ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution.toString();
        return this;
    }

    /**
     * <p>
     * The rules to be used for mapping users to roles.
     * </p>
     * <p>
     * If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.
     * </p>
     * 
     * @param rulesConfiguration
     *        The rules to be used for mapping users to roles.</p>
     *        <p>
     *        If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.
     */

    public void setRulesConfiguration(RulesConfigurationType rulesConfiguration) {
        this.rulesConfiguration = rulesConfiguration;
    }

    /**
     * <p>
     * The rules to be used for mapping users to roles.
     * </p>
     * <p>
     * If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.
     * </p>
     * 
     * @return The rules to be used for mapping users to roles.</p>
     *         <p>
     *         If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.
     */

    public RulesConfigurationType getRulesConfiguration() {
        return this.rulesConfiguration;
    }

    /**
     * <p>
     * The rules to be used for mapping users to roles.
     * </p>
     * <p>
     * If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.
     * </p>
     * 
     * @param rulesConfiguration
     *        The rules to be used for mapping users to roles.</p>
     *        <p>
     *        If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleMapping withRulesConfiguration(RulesConfigurationType rulesConfiguration) {
        setRulesConfiguration(rulesConfiguration);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAmbiguousRoleResolution() != null)
            sb.append("AmbiguousRoleResolution: ").append(getAmbiguousRoleResolution()).append(",");
        if (getRulesConfiguration() != null)
            sb.append("RulesConfiguration: ").append(getRulesConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoleMapping == false)
            return false;
        RoleMapping other = (RoleMapping) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAmbiguousRoleResolution() == null ^ this.getAmbiguousRoleResolution() == null)
            return false;
        if (other.getAmbiguousRoleResolution() != null && other.getAmbiguousRoleResolution().equals(this.getAmbiguousRoleResolution()) == false)
            return false;
        if (other.getRulesConfiguration() == null ^ this.getRulesConfiguration() == null)
            return false;
        if (other.getRulesConfiguration() != null && other.getRulesConfiguration().equals(this.getRulesConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAmbiguousRoleResolution() == null) ? 0 : getAmbiguousRoleResolution().hashCode());
        hashCode = prime * hashCode + ((getRulesConfiguration() == null) ? 0 : getRulesConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RoleMapping clone() {
        try {
            return (RoleMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidentity.model.transform.RoleMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
