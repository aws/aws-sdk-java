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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options for enabling and configuring fine-grained access control. For more information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html">Fine-grained access control in
 * Amazon OpenSearch Service</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedSecurityOptionsInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True to enable fine-grained access control.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * True to enable the internal user database.
     * </p>
     */
    private Boolean internalUserDatabaseEnabled;
    /**
     * <p>
     * Container for information about the master user.
     * </p>
     */
    private MasterUserOptions masterUserOptions;
    /**
     * <p>
     * Container for information about the SAML configuration for OpenSearch Dashboards.
     * </p>
     */
    private SAMLOptionsInput sAMLOptions;
    /**
     * <p>
     * True to enable a 30-day migration period during which administrators can create role mappings. Only necessary
     * when <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing"
     * >enabling fine-grained access control on an existing domain</a>.
     * </p>
     */
    private Boolean anonymousAuthEnabled;

    /**
     * <p>
     * True to enable fine-grained access control.
     * </p>
     * 
     * @param enabled
     *        True to enable fine-grained access control.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True to enable fine-grained access control.
     * </p>
     * 
     * @return True to enable fine-grained access control.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True to enable fine-grained access control.
     * </p>
     * 
     * @param enabled
     *        True to enable fine-grained access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptionsInput withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True to enable fine-grained access control.
     * </p>
     * 
     * @return True to enable fine-grained access control.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True to enable the internal user database.
     * </p>
     * 
     * @param internalUserDatabaseEnabled
     *        True to enable the internal user database.
     */

    public void setInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
        this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * True to enable the internal user database.
     * </p>
     * 
     * @return True to enable the internal user database.
     */

    public Boolean getInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * True to enable the internal user database.
     * </p>
     * 
     * @param internalUserDatabaseEnabled
     *        True to enable the internal user database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptionsInput withInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
        setInternalUserDatabaseEnabled(internalUserDatabaseEnabled);
        return this;
    }

    /**
     * <p>
     * True to enable the internal user database.
     * </p>
     * 
     * @return True to enable the internal user database.
     */

    public Boolean isInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * Container for information about the master user.
     * </p>
     * 
     * @param masterUserOptions
     *        Container for information about the master user.
     */

    public void setMasterUserOptions(MasterUserOptions masterUserOptions) {
        this.masterUserOptions = masterUserOptions;
    }

    /**
     * <p>
     * Container for information about the master user.
     * </p>
     * 
     * @return Container for information about the master user.
     */

    public MasterUserOptions getMasterUserOptions() {
        return this.masterUserOptions;
    }

    /**
     * <p>
     * Container for information about the master user.
     * </p>
     * 
     * @param masterUserOptions
     *        Container for information about the master user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptionsInput withMasterUserOptions(MasterUserOptions masterUserOptions) {
        setMasterUserOptions(masterUserOptions);
        return this;
    }

    /**
     * <p>
     * Container for information about the SAML configuration for OpenSearch Dashboards.
     * </p>
     * 
     * @param sAMLOptions
     *        Container for information about the SAML configuration for OpenSearch Dashboards.
     */

    public void setSAMLOptions(SAMLOptionsInput sAMLOptions) {
        this.sAMLOptions = sAMLOptions;
    }

    /**
     * <p>
     * Container for information about the SAML configuration for OpenSearch Dashboards.
     * </p>
     * 
     * @return Container for information about the SAML configuration for OpenSearch Dashboards.
     */

    public SAMLOptionsInput getSAMLOptions() {
        return this.sAMLOptions;
    }

    /**
     * <p>
     * Container for information about the SAML configuration for OpenSearch Dashboards.
     * </p>
     * 
     * @param sAMLOptions
     *        Container for information about the SAML configuration for OpenSearch Dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptionsInput withSAMLOptions(SAMLOptionsInput sAMLOptions) {
        setSAMLOptions(sAMLOptions);
        return this;
    }

    /**
     * <p>
     * True to enable a 30-day migration period during which administrators can create role mappings. Only necessary
     * when <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing"
     * >enabling fine-grained access control on an existing domain</a>.
     * </p>
     * 
     * @param anonymousAuthEnabled
     *        True to enable a 30-day migration period during which administrators can create role mappings. Only
     *        necessary when <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing"
     *        >enabling fine-grained access control on an existing domain</a>.
     */

    public void setAnonymousAuthEnabled(Boolean anonymousAuthEnabled) {
        this.anonymousAuthEnabled = anonymousAuthEnabled;
    }

    /**
     * <p>
     * True to enable a 30-day migration period during which administrators can create role mappings. Only necessary
     * when <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing"
     * >enabling fine-grained access control on an existing domain</a>.
     * </p>
     * 
     * @return True to enable a 30-day migration period during which administrators can create role mappings. Only
     *         necessary when <a href=
     *         "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing"
     *         >enabling fine-grained access control on an existing domain</a>.
     */

    public Boolean getAnonymousAuthEnabled() {
        return this.anonymousAuthEnabled;
    }

    /**
     * <p>
     * True to enable a 30-day migration period during which administrators can create role mappings. Only necessary
     * when <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing"
     * >enabling fine-grained access control on an existing domain</a>.
     * </p>
     * 
     * @param anonymousAuthEnabled
     *        True to enable a 30-day migration period during which administrators can create role mappings. Only
     *        necessary when <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing"
     *        >enabling fine-grained access control on an existing domain</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptionsInput withAnonymousAuthEnabled(Boolean anonymousAuthEnabled) {
        setAnonymousAuthEnabled(anonymousAuthEnabled);
        return this;
    }

    /**
     * <p>
     * True to enable a 30-day migration period during which administrators can create role mappings. Only necessary
     * when <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing"
     * >enabling fine-grained access control on an existing domain</a>.
     * </p>
     * 
     * @return True to enable a 30-day migration period during which administrators can create role mappings. Only
     *         necessary when <a href=
     *         "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing"
     *         >enabling fine-grained access control on an existing domain</a>.
     */

    public Boolean isAnonymousAuthEnabled() {
        return this.anonymousAuthEnabled;
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
        if (getInternalUserDatabaseEnabled() != null)
            sb.append("InternalUserDatabaseEnabled: ").append(getInternalUserDatabaseEnabled()).append(",");
        if (getMasterUserOptions() != null)
            sb.append("MasterUserOptions: ").append(getMasterUserOptions()).append(",");
        if (getSAMLOptions() != null)
            sb.append("SAMLOptions: ").append(getSAMLOptions()).append(",");
        if (getAnonymousAuthEnabled() != null)
            sb.append("AnonymousAuthEnabled: ").append(getAnonymousAuthEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedSecurityOptionsInput == false)
            return false;
        AdvancedSecurityOptionsInput other = (AdvancedSecurityOptionsInput) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getInternalUserDatabaseEnabled() == null ^ this.getInternalUserDatabaseEnabled() == null)
            return false;
        if (other.getInternalUserDatabaseEnabled() != null && other.getInternalUserDatabaseEnabled().equals(this.getInternalUserDatabaseEnabled()) == false)
            return false;
        if (other.getMasterUserOptions() == null ^ this.getMasterUserOptions() == null)
            return false;
        if (other.getMasterUserOptions() != null && other.getMasterUserOptions().equals(this.getMasterUserOptions()) == false)
            return false;
        if (other.getSAMLOptions() == null ^ this.getSAMLOptions() == null)
            return false;
        if (other.getSAMLOptions() != null && other.getSAMLOptions().equals(this.getSAMLOptions()) == false)
            return false;
        if (other.getAnonymousAuthEnabled() == null ^ this.getAnonymousAuthEnabled() == null)
            return false;
        if (other.getAnonymousAuthEnabled() != null && other.getAnonymousAuthEnabled().equals(this.getAnonymousAuthEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getInternalUserDatabaseEnabled() == null) ? 0 : getInternalUserDatabaseEnabled().hashCode());
        hashCode = prime * hashCode + ((getMasterUserOptions() == null) ? 0 : getMasterUserOptions().hashCode());
        hashCode = prime * hashCode + ((getSAMLOptions() == null) ? 0 : getSAMLOptions().hashCode());
        hashCode = prime * hashCode + ((getAnonymousAuthEnabled() == null) ? 0 : getAnonymousAuthEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedSecurityOptionsInput clone() {
        try {
            return (AdvancedSecurityOptionsInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.AdvancedSecurityOptionsInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
