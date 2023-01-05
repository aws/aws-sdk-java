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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about domain access control options.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables fine-grained access control.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Enables the internal user database.
     * </p>
     */
    private Boolean internalUserDatabaseEnabled;
    /**
     * <p>
     * Specifies information about the master user of the domain.
     * </p>
     */
    private AwsOpenSearchServiceDomainMasterUserOptionsDetails masterUserOptions;

    /**
     * <p>
     * Enables fine-grained access control.
     * </p>
     * 
     * @param enabled
     *        Enables fine-grained access control.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enables fine-grained access control.
     * </p>
     * 
     * @return Enables fine-grained access control.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enables fine-grained access control.
     * </p>
     * 
     * @param enabled
     *        Enables fine-grained access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enables fine-grained access control.
     * </p>
     * 
     * @return Enables fine-grained access control.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enables the internal user database.
     * </p>
     * 
     * @param internalUserDatabaseEnabled
     *        Enables the internal user database.
     */

    public void setInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
        this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * Enables the internal user database.
     * </p>
     * 
     * @return Enables the internal user database.
     */

    public Boolean getInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * Enables the internal user database.
     * </p>
     * 
     * @param internalUserDatabaseEnabled
     *        Enables the internal user database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails withInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
        setInternalUserDatabaseEnabled(internalUserDatabaseEnabled);
        return this;
    }

    /**
     * <p>
     * Enables the internal user database.
     * </p>
     * 
     * @return Enables the internal user database.
     */

    public Boolean isInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * Specifies information about the master user of the domain.
     * </p>
     * 
     * @param masterUserOptions
     *        Specifies information about the master user of the domain.
     */

    public void setMasterUserOptions(AwsOpenSearchServiceDomainMasterUserOptionsDetails masterUserOptions) {
        this.masterUserOptions = masterUserOptions;
    }

    /**
     * <p>
     * Specifies information about the master user of the domain.
     * </p>
     * 
     * @return Specifies information about the master user of the domain.
     */

    public AwsOpenSearchServiceDomainMasterUserOptionsDetails getMasterUserOptions() {
        return this.masterUserOptions;
    }

    /**
     * <p>
     * Specifies information about the master user of the domain.
     * </p>
     * 
     * @param masterUserOptions
     *        Specifies information about the master user of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails withMasterUserOptions(AwsOpenSearchServiceDomainMasterUserOptionsDetails masterUserOptions) {
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

        if (obj instanceof AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails == false)
            return false;
        AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails other = (AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails) obj;
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
    public AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails clone() {
        try {
            return (AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
