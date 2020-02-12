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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the advanced security configuration: whether advanced security is enabled, whether the internal database
 * option is enabled, master username and password (if internal database is enabled), and master user ARN (if IAM is
 * enabled).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedSecurityOptionsInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     */
    private Boolean internalUserDatabaseEnabled;
    /**
     * <p>
     * Credentials for the master user: username and password, ARN, or both.
     * </p>
     */
    private MasterUserOptions masterUserOptions;

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     * 
     * @param enabled
     *        True if advanced security is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     * 
     * @return True if advanced security is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     * 
     * @param enabled
     *        True if advanced security is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptionsInput withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     * 
     * @return True if advanced security is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     * 
     * @param internalUserDatabaseEnabled
     *        True if the internal user database is enabled.
     */

    public void setInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
        this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     * 
     * @return True if the internal user database is enabled.
     */

    public Boolean getInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     * 
     * @param internalUserDatabaseEnabled
     *        True if the internal user database is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptionsInput withInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
        setInternalUserDatabaseEnabled(internalUserDatabaseEnabled);
        return this;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     * 
     * @return True if the internal user database is enabled.
     */

    public Boolean isInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * Credentials for the master user: username and password, ARN, or both.
     * </p>
     * 
     * @param masterUserOptions
     *        Credentials for the master user: username and password, ARN, or both.
     */

    public void setMasterUserOptions(MasterUserOptions masterUserOptions) {
        this.masterUserOptions = masterUserOptions;
    }

    /**
     * <p>
     * Credentials for the master user: username and password, ARN, or both.
     * </p>
     * 
     * @return Credentials for the master user: username and password, ARN, or both.
     */

    public MasterUserOptions getMasterUserOptions() {
        return this.masterUserOptions;
    }

    /**
     * <p>
     * Credentials for the master user: username and password, ARN, or both.
     * </p>
     * 
     * @param masterUserOptions
     *        Credentials for the master user: username and password, ARN, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedSecurityOptionsInput withMasterUserOptions(MasterUserOptions masterUserOptions) {
        setMasterUserOptions(masterUserOptions);
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
        if (getInternalUserDatabaseEnabled() != null)
            sb.append("InternalUserDatabaseEnabled: ").append(getInternalUserDatabaseEnabled()).append(",");
        if (getMasterUserOptions() != null)
            sb.append("MasterUserOptions: ").append(getMasterUserOptions());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getInternalUserDatabaseEnabled() == null) ? 0 : getInternalUserDatabaseEnabled().hashCode());
        hashCode = prime * hashCode + ((getMasterUserOptions() == null) ? 0 : getMasterUserOptions().hashCode());
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
        com.amazonaws.services.elasticsearch.model.transform.AdvancedSecurityOptionsInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
