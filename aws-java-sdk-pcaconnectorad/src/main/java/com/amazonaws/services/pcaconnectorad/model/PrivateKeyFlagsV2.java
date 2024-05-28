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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Private key flags for v2 templates specify the client compatibility, if the private key can be exported, and if user
 * input is required when using a private key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/PrivateKeyFlagsV2" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateKeyFlagsV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the minimum client compatibility.
     * </p>
     */
    private String clientVersion;
    /**
     * <p>
     * Allows the private key to be exported.
     * </p>
     */
    private Boolean exportableKey;
    /**
     * <p>
     * Require user input when using the private key for enrollment.
     * </p>
     */
    private Boolean strongKeyProtectionRequired;

    /**
     * <p>
     * Defines the minimum client compatibility.
     * </p>
     * 
     * @param clientVersion
     *        Defines the minimum client compatibility.
     * @see ClientCompatibilityV2
     */

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    /**
     * <p>
     * Defines the minimum client compatibility.
     * </p>
     * 
     * @return Defines the minimum client compatibility.
     * @see ClientCompatibilityV2
     */

    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * <p>
     * Defines the minimum client compatibility.
     * </p>
     * 
     * @param clientVersion
     *        Defines the minimum client compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientCompatibilityV2
     */

    public PrivateKeyFlagsV2 withClientVersion(String clientVersion) {
        setClientVersion(clientVersion);
        return this;
    }

    /**
     * <p>
     * Defines the minimum client compatibility.
     * </p>
     * 
     * @param clientVersion
     *        Defines the minimum client compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientCompatibilityV2
     */

    public PrivateKeyFlagsV2 withClientVersion(ClientCompatibilityV2 clientVersion) {
        this.clientVersion = clientVersion.toString();
        return this;
    }

    /**
     * <p>
     * Allows the private key to be exported.
     * </p>
     * 
     * @param exportableKey
     *        Allows the private key to be exported.
     */

    public void setExportableKey(Boolean exportableKey) {
        this.exportableKey = exportableKey;
    }

    /**
     * <p>
     * Allows the private key to be exported.
     * </p>
     * 
     * @return Allows the private key to be exported.
     */

    public Boolean getExportableKey() {
        return this.exportableKey;
    }

    /**
     * <p>
     * Allows the private key to be exported.
     * </p>
     * 
     * @param exportableKey
     *        Allows the private key to be exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyFlagsV2 withExportableKey(Boolean exportableKey) {
        setExportableKey(exportableKey);
        return this;
    }

    /**
     * <p>
     * Allows the private key to be exported.
     * </p>
     * 
     * @return Allows the private key to be exported.
     */

    public Boolean isExportableKey() {
        return this.exportableKey;
    }

    /**
     * <p>
     * Require user input when using the private key for enrollment.
     * </p>
     * 
     * @param strongKeyProtectionRequired
     *        Require user input when using the private key for enrollment.
     */

    public void setStrongKeyProtectionRequired(Boolean strongKeyProtectionRequired) {
        this.strongKeyProtectionRequired = strongKeyProtectionRequired;
    }

    /**
     * <p>
     * Require user input when using the private key for enrollment.
     * </p>
     * 
     * @return Require user input when using the private key for enrollment.
     */

    public Boolean getStrongKeyProtectionRequired() {
        return this.strongKeyProtectionRequired;
    }

    /**
     * <p>
     * Require user input when using the private key for enrollment.
     * </p>
     * 
     * @param strongKeyProtectionRequired
     *        Require user input when using the private key for enrollment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyFlagsV2 withStrongKeyProtectionRequired(Boolean strongKeyProtectionRequired) {
        setStrongKeyProtectionRequired(strongKeyProtectionRequired);
        return this;
    }

    /**
     * <p>
     * Require user input when using the private key for enrollment.
     * </p>
     * 
     * @return Require user input when using the private key for enrollment.
     */

    public Boolean isStrongKeyProtectionRequired() {
        return this.strongKeyProtectionRequired;
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
        if (getClientVersion() != null)
            sb.append("ClientVersion: ").append(getClientVersion()).append(",");
        if (getExportableKey() != null)
            sb.append("ExportableKey: ").append(getExportableKey()).append(",");
        if (getStrongKeyProtectionRequired() != null)
            sb.append("StrongKeyProtectionRequired: ").append(getStrongKeyProtectionRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateKeyFlagsV2 == false)
            return false;
        PrivateKeyFlagsV2 other = (PrivateKeyFlagsV2) obj;
        if (other.getClientVersion() == null ^ this.getClientVersion() == null)
            return false;
        if (other.getClientVersion() != null && other.getClientVersion().equals(this.getClientVersion()) == false)
            return false;
        if (other.getExportableKey() == null ^ this.getExportableKey() == null)
            return false;
        if (other.getExportableKey() != null && other.getExportableKey().equals(this.getExportableKey()) == false)
            return false;
        if (other.getStrongKeyProtectionRequired() == null ^ this.getStrongKeyProtectionRequired() == null)
            return false;
        if (other.getStrongKeyProtectionRequired() != null && other.getStrongKeyProtectionRequired().equals(this.getStrongKeyProtectionRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVersion() == null) ? 0 : getClientVersion().hashCode());
        hashCode = prime * hashCode + ((getExportableKey() == null) ? 0 : getExportableKey().hashCode());
        hashCode = prime * hashCode + ((getStrongKeyProtectionRequired() == null) ? 0 : getStrongKeyProtectionRequired().hashCode());
        return hashCode;
    }

    @Override
    public PrivateKeyFlagsV2 clone() {
        try {
            return (PrivateKeyFlagsV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.PrivateKeyFlagsV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
