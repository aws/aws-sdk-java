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
 * Private key flags for v3 templates specify the client compatibility, if the private key can be exported, if user
 * input is required when using a private key, and if an alternate signature algorithm should be used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/PrivateKeyFlagsV3" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateKeyFlagsV3 implements Serializable, Cloneable, StructuredPojo {

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
     * Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     */
    private Boolean requireAlternateSignatureAlgorithm;
    /**
     * <p>
     * Requirer user input when using the private key for enrollment.
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
     * @see ClientCompatibilityV3
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
     * @see ClientCompatibilityV3
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
     * @see ClientCompatibilityV3
     */

    public PrivateKeyFlagsV3 withClientVersion(String clientVersion) {
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
     * @see ClientCompatibilityV3
     */

    public PrivateKeyFlagsV3 withClientVersion(ClientCompatibilityV3 clientVersion) {
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

    public PrivateKeyFlagsV3 withExportableKey(Boolean exportableKey) {
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
     * Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     * 
     * @param requireAlternateSignatureAlgorithm
     *        Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     *        applications can accept this signature format.
     */

    public void setRequireAlternateSignatureAlgorithm(Boolean requireAlternateSignatureAlgorithm) {
        this.requireAlternateSignatureAlgorithm = requireAlternateSignatureAlgorithm;
    }

    /**
     * <p>
     * Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     * 
     * @return Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     *         applications can accept this signature format.
     */

    public Boolean getRequireAlternateSignatureAlgorithm() {
        return this.requireAlternateSignatureAlgorithm;
    }

    /**
     * <p>
     * Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     * 
     * @param requireAlternateSignatureAlgorithm
     *        Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     *        applications can accept this signature format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyFlagsV3 withRequireAlternateSignatureAlgorithm(Boolean requireAlternateSignatureAlgorithm) {
        setRequireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm);
        return this;
    }

    /**
     * <p>
     * Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     * 
     * @return Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     *         applications can accept this signature format.
     */

    public Boolean isRequireAlternateSignatureAlgorithm() {
        return this.requireAlternateSignatureAlgorithm;
    }

    /**
     * <p>
     * Requirer user input when using the private key for enrollment.
     * </p>
     * 
     * @param strongKeyProtectionRequired
     *        Requirer user input when using the private key for enrollment.
     */

    public void setStrongKeyProtectionRequired(Boolean strongKeyProtectionRequired) {
        this.strongKeyProtectionRequired = strongKeyProtectionRequired;
    }

    /**
     * <p>
     * Requirer user input when using the private key for enrollment.
     * </p>
     * 
     * @return Requirer user input when using the private key for enrollment.
     */

    public Boolean getStrongKeyProtectionRequired() {
        return this.strongKeyProtectionRequired;
    }

    /**
     * <p>
     * Requirer user input when using the private key for enrollment.
     * </p>
     * 
     * @param strongKeyProtectionRequired
     *        Requirer user input when using the private key for enrollment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyFlagsV3 withStrongKeyProtectionRequired(Boolean strongKeyProtectionRequired) {
        setStrongKeyProtectionRequired(strongKeyProtectionRequired);
        return this;
    }

    /**
     * <p>
     * Requirer user input when using the private key for enrollment.
     * </p>
     * 
     * @return Requirer user input when using the private key for enrollment.
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
        if (getRequireAlternateSignatureAlgorithm() != null)
            sb.append("RequireAlternateSignatureAlgorithm: ").append(getRequireAlternateSignatureAlgorithm()).append(",");
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

        if (obj instanceof PrivateKeyFlagsV3 == false)
            return false;
        PrivateKeyFlagsV3 other = (PrivateKeyFlagsV3) obj;
        if (other.getClientVersion() == null ^ this.getClientVersion() == null)
            return false;
        if (other.getClientVersion() != null && other.getClientVersion().equals(this.getClientVersion()) == false)
            return false;
        if (other.getExportableKey() == null ^ this.getExportableKey() == null)
            return false;
        if (other.getExportableKey() != null && other.getExportableKey().equals(this.getExportableKey()) == false)
            return false;
        if (other.getRequireAlternateSignatureAlgorithm() == null ^ this.getRequireAlternateSignatureAlgorithm() == null)
            return false;
        if (other.getRequireAlternateSignatureAlgorithm() != null
                && other.getRequireAlternateSignatureAlgorithm().equals(this.getRequireAlternateSignatureAlgorithm()) == false)
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
        hashCode = prime * hashCode + ((getRequireAlternateSignatureAlgorithm() == null) ? 0 : getRequireAlternateSignatureAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getStrongKeyProtectionRequired() == null) ? 0 : getStrongKeyProtectionRequired().hashCode());
        return hashCode;
    }

    @Override
    public PrivateKeyFlagsV3 clone() {
        try {
            return (PrivateKeyFlagsV3) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.PrivateKeyFlagsV3Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
