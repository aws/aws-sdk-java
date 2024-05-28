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
 * Private key flags for v4 templates specify the client compatibility, if the private key can be exported, if user
 * input is required when using a private key, if an alternate signature algorithm should be used, and if certificates
 * are renewed using the same private key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/PrivateKeyFlagsV4" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateKeyFlagsV4 implements Serializable, Cloneable, StructuredPojo {

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
     * Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     */
    private Boolean requireAlternateSignatureAlgorithm;
    /**
     * <p>
     * Renew certificate using the same private key.
     * </p>
     */
    private Boolean requireSameKeyRenewal;
    /**
     * <p>
     * Require user input when using the private key for enrollment.
     * </p>
     */
    private Boolean strongKeyProtectionRequired;
    /**
     * <p>
     * Specifies the cryptographic service provider category used to generate private keys. Set to TRUE to use Legacy
     * Cryptographic Service Providers and FALSE to use Key Storage Providers.
     * </p>
     */
    private Boolean useLegacyProvider;

    /**
     * <p>
     * Defines the minimum client compatibility.
     * </p>
     * 
     * @param clientVersion
     *        Defines the minimum client compatibility.
     * @see ClientCompatibilityV4
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
     * @see ClientCompatibilityV4
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
     * @see ClientCompatibilityV4
     */

    public PrivateKeyFlagsV4 withClientVersion(String clientVersion) {
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
     * @see ClientCompatibilityV4
     */

    public PrivateKeyFlagsV4 withClientVersion(ClientCompatibilityV4 clientVersion) {
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

    public PrivateKeyFlagsV4 withExportableKey(Boolean exportableKey) {
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
     * Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     * 
     * @param requireAlternateSignatureAlgorithm
     *        Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     *        applications can accept this signature format.
     */

    public void setRequireAlternateSignatureAlgorithm(Boolean requireAlternateSignatureAlgorithm) {
        this.requireAlternateSignatureAlgorithm = requireAlternateSignatureAlgorithm;
    }

    /**
     * <p>
     * Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     * 
     * @return Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     *         applications can accept this signature format.
     */

    public Boolean getRequireAlternateSignatureAlgorithm() {
        return this.requireAlternateSignatureAlgorithm;
    }

    /**
     * <p>
     * Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     * 
     * @param requireAlternateSignatureAlgorithm
     *        Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     *        applications can accept this signature format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyFlagsV4 withRequireAlternateSignatureAlgorithm(Boolean requireAlternateSignatureAlgorithm) {
        setRequireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm);
        return this;
    }

    /**
     * <p>
     * Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     * applications can accept this signature format.
     * </p>
     * 
     * @return Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA, objects, and
     *         applications can accept this signature format.
     */

    public Boolean isRequireAlternateSignatureAlgorithm() {
        return this.requireAlternateSignatureAlgorithm;
    }

    /**
     * <p>
     * Renew certificate using the same private key.
     * </p>
     * 
     * @param requireSameKeyRenewal
     *        Renew certificate using the same private key.
     */

    public void setRequireSameKeyRenewal(Boolean requireSameKeyRenewal) {
        this.requireSameKeyRenewal = requireSameKeyRenewal;
    }

    /**
     * <p>
     * Renew certificate using the same private key.
     * </p>
     * 
     * @return Renew certificate using the same private key.
     */

    public Boolean getRequireSameKeyRenewal() {
        return this.requireSameKeyRenewal;
    }

    /**
     * <p>
     * Renew certificate using the same private key.
     * </p>
     * 
     * @param requireSameKeyRenewal
     *        Renew certificate using the same private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyFlagsV4 withRequireSameKeyRenewal(Boolean requireSameKeyRenewal) {
        setRequireSameKeyRenewal(requireSameKeyRenewal);
        return this;
    }

    /**
     * <p>
     * Renew certificate using the same private key.
     * </p>
     * 
     * @return Renew certificate using the same private key.
     */

    public Boolean isRequireSameKeyRenewal() {
        return this.requireSameKeyRenewal;
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

    public PrivateKeyFlagsV4 withStrongKeyProtectionRequired(Boolean strongKeyProtectionRequired) {
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
     * <p>
     * Specifies the cryptographic service provider category used to generate private keys. Set to TRUE to use Legacy
     * Cryptographic Service Providers and FALSE to use Key Storage Providers.
     * </p>
     * 
     * @param useLegacyProvider
     *        Specifies the cryptographic service provider category used to generate private keys. Set to TRUE to use
     *        Legacy Cryptographic Service Providers and FALSE to use Key Storage Providers.
     */

    public void setUseLegacyProvider(Boolean useLegacyProvider) {
        this.useLegacyProvider = useLegacyProvider;
    }

    /**
     * <p>
     * Specifies the cryptographic service provider category used to generate private keys. Set to TRUE to use Legacy
     * Cryptographic Service Providers and FALSE to use Key Storage Providers.
     * </p>
     * 
     * @return Specifies the cryptographic service provider category used to generate private keys. Set to TRUE to use
     *         Legacy Cryptographic Service Providers and FALSE to use Key Storage Providers.
     */

    public Boolean getUseLegacyProvider() {
        return this.useLegacyProvider;
    }

    /**
     * <p>
     * Specifies the cryptographic service provider category used to generate private keys. Set to TRUE to use Legacy
     * Cryptographic Service Providers and FALSE to use Key Storage Providers.
     * </p>
     * 
     * @param useLegacyProvider
     *        Specifies the cryptographic service provider category used to generate private keys. Set to TRUE to use
     *        Legacy Cryptographic Service Providers and FALSE to use Key Storage Providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyFlagsV4 withUseLegacyProvider(Boolean useLegacyProvider) {
        setUseLegacyProvider(useLegacyProvider);
        return this;
    }

    /**
     * <p>
     * Specifies the cryptographic service provider category used to generate private keys. Set to TRUE to use Legacy
     * Cryptographic Service Providers and FALSE to use Key Storage Providers.
     * </p>
     * 
     * @return Specifies the cryptographic service provider category used to generate private keys. Set to TRUE to use
     *         Legacy Cryptographic Service Providers and FALSE to use Key Storage Providers.
     */

    public Boolean isUseLegacyProvider() {
        return this.useLegacyProvider;
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
        if (getRequireSameKeyRenewal() != null)
            sb.append("RequireSameKeyRenewal: ").append(getRequireSameKeyRenewal()).append(",");
        if (getStrongKeyProtectionRequired() != null)
            sb.append("StrongKeyProtectionRequired: ").append(getStrongKeyProtectionRequired()).append(",");
        if (getUseLegacyProvider() != null)
            sb.append("UseLegacyProvider: ").append(getUseLegacyProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateKeyFlagsV4 == false)
            return false;
        PrivateKeyFlagsV4 other = (PrivateKeyFlagsV4) obj;
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
        if (other.getRequireSameKeyRenewal() == null ^ this.getRequireSameKeyRenewal() == null)
            return false;
        if (other.getRequireSameKeyRenewal() != null && other.getRequireSameKeyRenewal().equals(this.getRequireSameKeyRenewal()) == false)
            return false;
        if (other.getStrongKeyProtectionRequired() == null ^ this.getStrongKeyProtectionRequired() == null)
            return false;
        if (other.getStrongKeyProtectionRequired() != null && other.getStrongKeyProtectionRequired().equals(this.getStrongKeyProtectionRequired()) == false)
            return false;
        if (other.getUseLegacyProvider() == null ^ this.getUseLegacyProvider() == null)
            return false;
        if (other.getUseLegacyProvider() != null && other.getUseLegacyProvider().equals(this.getUseLegacyProvider()) == false)
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
        hashCode = prime * hashCode + ((getRequireSameKeyRenewal() == null) ? 0 : getRequireSameKeyRenewal().hashCode());
        hashCode = prime * hashCode + ((getStrongKeyProtectionRequired() == null) ? 0 : getStrongKeyProtectionRequired().hashCode());
        hashCode = prime * hashCode + ((getUseLegacyProvider() == null) ? 0 : getUseLegacyProvider().hashCode());
        return hashCode;
    }

    @Override
    public PrivateKeyFlagsV4 clone() {
        try {
            return (PrivateKeyFlagsV4) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.PrivateKeyFlagsV4Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
