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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the SAML application configuration for the domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SAMLOptionsInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True if SAML is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies the SAML Identity Provider's information.
     * </p>
     */
    private SAMLIdp idp;
    /**
     * <p>
     * The SAML master username, which is stored in the Amazon Elasticsearch Service domain's internal database.
     * </p>
     */
    private String masterUserName;
    /**
     * <p>
     * The backend role to which the SAML master user is mapped to.
     * </p>
     */
    private String masterBackendRole;
    /**
     * <p>
     * The key to use for matching the SAML Subject attribute.
     * </p>
     */
    private String subjectKey;
    /**
     * <p>
     * The key to use for matching the SAML Roles attribute.
     * </p>
     */
    private String rolesKey;
    /**
     * <p>
     * The duration, in minutes, after which a user session becomes inactive. Acceptable values are between 1 and 1440,
     * and the default value is 60.
     * </p>
     */
    private Integer sessionTimeoutMinutes;

    /**
     * <p>
     * True if SAML is enabled.
     * </p>
     * 
     * @param enabled
     *        True if SAML is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if SAML is enabled.
     * </p>
     * 
     * @return True if SAML is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True if SAML is enabled.
     * </p>
     * 
     * @param enabled
     *        True if SAML is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAMLOptionsInput withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True if SAML is enabled.
     * </p>
     * 
     * @return True if SAML is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies the SAML Identity Provider's information.
     * </p>
     * 
     * @param idp
     *        Specifies the SAML Identity Provider's information.
     */

    public void setIdp(SAMLIdp idp) {
        this.idp = idp;
    }

    /**
     * <p>
     * Specifies the SAML Identity Provider's information.
     * </p>
     * 
     * @return Specifies the SAML Identity Provider's information.
     */

    public SAMLIdp getIdp() {
        return this.idp;
    }

    /**
     * <p>
     * Specifies the SAML Identity Provider's information.
     * </p>
     * 
     * @param idp
     *        Specifies the SAML Identity Provider's information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAMLOptionsInput withIdp(SAMLIdp idp) {
        setIdp(idp);
        return this;
    }

    /**
     * <p>
     * The SAML master username, which is stored in the Amazon Elasticsearch Service domain's internal database.
     * </p>
     * 
     * @param masterUserName
     *        The SAML master username, which is stored in the Amazon Elasticsearch Service domain's internal database.
     */

    public void setMasterUserName(String masterUserName) {
        this.masterUserName = masterUserName;
    }

    /**
     * <p>
     * The SAML master username, which is stored in the Amazon Elasticsearch Service domain's internal database.
     * </p>
     * 
     * @return The SAML master username, which is stored in the Amazon Elasticsearch Service domain's internal database.
     */

    public String getMasterUserName() {
        return this.masterUserName;
    }

    /**
     * <p>
     * The SAML master username, which is stored in the Amazon Elasticsearch Service domain's internal database.
     * </p>
     * 
     * @param masterUserName
     *        The SAML master username, which is stored in the Amazon Elasticsearch Service domain's internal database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAMLOptionsInput withMasterUserName(String masterUserName) {
        setMasterUserName(masterUserName);
        return this;
    }

    /**
     * <p>
     * The backend role to which the SAML master user is mapped to.
     * </p>
     * 
     * @param masterBackendRole
     *        The backend role to which the SAML master user is mapped to.
     */

    public void setMasterBackendRole(String masterBackendRole) {
        this.masterBackendRole = masterBackendRole;
    }

    /**
     * <p>
     * The backend role to which the SAML master user is mapped to.
     * </p>
     * 
     * @return The backend role to which the SAML master user is mapped to.
     */

    public String getMasterBackendRole() {
        return this.masterBackendRole;
    }

    /**
     * <p>
     * The backend role to which the SAML master user is mapped to.
     * </p>
     * 
     * @param masterBackendRole
     *        The backend role to which the SAML master user is mapped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAMLOptionsInput withMasterBackendRole(String masterBackendRole) {
        setMasterBackendRole(masterBackendRole);
        return this;
    }

    /**
     * <p>
     * The key to use for matching the SAML Subject attribute.
     * </p>
     * 
     * @param subjectKey
     *        The key to use for matching the SAML Subject attribute.
     */

    public void setSubjectKey(String subjectKey) {
        this.subjectKey = subjectKey;
    }

    /**
     * <p>
     * The key to use for matching the SAML Subject attribute.
     * </p>
     * 
     * @return The key to use for matching the SAML Subject attribute.
     */

    public String getSubjectKey() {
        return this.subjectKey;
    }

    /**
     * <p>
     * The key to use for matching the SAML Subject attribute.
     * </p>
     * 
     * @param subjectKey
     *        The key to use for matching the SAML Subject attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAMLOptionsInput withSubjectKey(String subjectKey) {
        setSubjectKey(subjectKey);
        return this;
    }

    /**
     * <p>
     * The key to use for matching the SAML Roles attribute.
     * </p>
     * 
     * @param rolesKey
     *        The key to use for matching the SAML Roles attribute.
     */

    public void setRolesKey(String rolesKey) {
        this.rolesKey = rolesKey;
    }

    /**
     * <p>
     * The key to use for matching the SAML Roles attribute.
     * </p>
     * 
     * @return The key to use for matching the SAML Roles attribute.
     */

    public String getRolesKey() {
        return this.rolesKey;
    }

    /**
     * <p>
     * The key to use for matching the SAML Roles attribute.
     * </p>
     * 
     * @param rolesKey
     *        The key to use for matching the SAML Roles attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAMLOptionsInput withRolesKey(String rolesKey) {
        setRolesKey(rolesKey);
        return this;
    }

    /**
     * <p>
     * The duration, in minutes, after which a user session becomes inactive. Acceptable values are between 1 and 1440,
     * and the default value is 60.
     * </p>
     * 
     * @param sessionTimeoutMinutes
     *        The duration, in minutes, after which a user session becomes inactive. Acceptable values are between 1 and
     *        1440, and the default value is 60.
     */

    public void setSessionTimeoutMinutes(Integer sessionTimeoutMinutes) {
        this.sessionTimeoutMinutes = sessionTimeoutMinutes;
    }

    /**
     * <p>
     * The duration, in minutes, after which a user session becomes inactive. Acceptable values are between 1 and 1440,
     * and the default value is 60.
     * </p>
     * 
     * @return The duration, in minutes, after which a user session becomes inactive. Acceptable values are between 1
     *         and 1440, and the default value is 60.
     */

    public Integer getSessionTimeoutMinutes() {
        return this.sessionTimeoutMinutes;
    }

    /**
     * <p>
     * The duration, in minutes, after which a user session becomes inactive. Acceptable values are between 1 and 1440,
     * and the default value is 60.
     * </p>
     * 
     * @param sessionTimeoutMinutes
     *        The duration, in minutes, after which a user session becomes inactive. Acceptable values are between 1 and
     *        1440, and the default value is 60.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAMLOptionsInput withSessionTimeoutMinutes(Integer sessionTimeoutMinutes) {
        setSessionTimeoutMinutes(sessionTimeoutMinutes);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getIdp() != null)
            sb.append("Idp: ").append(getIdp()).append(",");
        if (getMasterUserName() != null)
            sb.append("MasterUserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getMasterBackendRole() != null)
            sb.append("MasterBackendRole: ").append(getMasterBackendRole()).append(",");
        if (getSubjectKey() != null)
            sb.append("SubjectKey: ").append(getSubjectKey()).append(",");
        if (getRolesKey() != null)
            sb.append("RolesKey: ").append(getRolesKey()).append(",");
        if (getSessionTimeoutMinutes() != null)
            sb.append("SessionTimeoutMinutes: ").append(getSessionTimeoutMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SAMLOptionsInput == false)
            return false;
        SAMLOptionsInput other = (SAMLOptionsInput) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIdp() == null ^ this.getIdp() == null)
            return false;
        if (other.getIdp() != null && other.getIdp().equals(this.getIdp()) == false)
            return false;
        if (other.getMasterUserName() == null ^ this.getMasterUserName() == null)
            return false;
        if (other.getMasterUserName() != null && other.getMasterUserName().equals(this.getMasterUserName()) == false)
            return false;
        if (other.getMasterBackendRole() == null ^ this.getMasterBackendRole() == null)
            return false;
        if (other.getMasterBackendRole() != null && other.getMasterBackendRole().equals(this.getMasterBackendRole()) == false)
            return false;
        if (other.getSubjectKey() == null ^ this.getSubjectKey() == null)
            return false;
        if (other.getSubjectKey() != null && other.getSubjectKey().equals(this.getSubjectKey()) == false)
            return false;
        if (other.getRolesKey() == null ^ this.getRolesKey() == null)
            return false;
        if (other.getRolesKey() != null && other.getRolesKey().equals(this.getRolesKey()) == false)
            return false;
        if (other.getSessionTimeoutMinutes() == null ^ this.getSessionTimeoutMinutes() == null)
            return false;
        if (other.getSessionTimeoutMinutes() != null && other.getSessionTimeoutMinutes().equals(this.getSessionTimeoutMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getIdp() == null) ? 0 : getIdp().hashCode());
        hashCode = prime * hashCode + ((getMasterUserName() == null) ? 0 : getMasterUserName().hashCode());
        hashCode = prime * hashCode + ((getMasterBackendRole() == null) ? 0 : getMasterBackendRole().hashCode());
        hashCode = prime * hashCode + ((getSubjectKey() == null) ? 0 : getSubjectKey().hashCode());
        hashCode = prime * hashCode + ((getRolesKey() == null) ? 0 : getRolesKey().hashCode());
        hashCode = prime * hashCode + ((getSessionTimeoutMinutes() == null) ? 0 : getSessionTimeoutMinutes().hashCode());
        return hashCode;
    }

    @Override
    public SAMLOptionsInput clone() {
        try {
            return (SAMLOptionsInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.SAMLOptionsInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
