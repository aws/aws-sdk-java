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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for CMAF encryption
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CmafEncryptionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafEncryptionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then
     * the Initialization Vector will follow the segment number by default.
     */
    private String constantInitializationVector;
    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web
     * interface also disables encryption.
     */
    private String encryptionMethod;
    /**
     * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to
     * INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
     */
    private String initializationVectorInManifest;
    /** Use these settings to set up encryption with a static key provider. */
    private StaticKeyProvider staticKeyProvider;
    /** Indicates which type of key provider is used for encryption. */
    private String type;

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then
     * the Initialization Vector will follow the segment number by default.
     * 
     * @param constantInitializationVector
     *        This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not
     *        set then the Initialization Vector will follow the segment number by default.
     */

    public void setConstantInitializationVector(String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
    }

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then
     * the Initialization Vector will follow the segment number by default.
     * 
     * @return This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not
     *         set then the Initialization Vector will follow the segment number by default.
     */

    public String getConstantInitializationVector() {
        return this.constantInitializationVector;
    }

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then
     * the Initialization Vector will follow the segment number by default.
     * 
     * @param constantInitializationVector
     *        This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not
     *        set then the Initialization Vector will follow the segment number by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafEncryptionSettings withConstantInitializationVector(String constantInitializationVector) {
        setConstantInitializationVector(constantInitializationVector);
        return this;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web
     * interface also disables encryption.
     * 
     * @param encryptionMethod
     *        Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in
     *        the web interface also disables encryption.
     * @see CmafEncryptionType
     */

    public void setEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web
     * interface also disables encryption.
     * 
     * @return Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in
     *         the web interface also disables encryption.
     * @see CmafEncryptionType
     */

    public String getEncryptionMethod() {
        return this.encryptionMethod;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web
     * interface also disables encryption.
     * 
     * @param encryptionMethod
     *        Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in
     *        the web interface also disables encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafEncryptionType
     */

    public CmafEncryptionSettings withEncryptionMethod(String encryptionMethod) {
        setEncryptionMethod(encryptionMethod);
        return this;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web
     * interface also disables encryption.
     * 
     * @param encryptionMethod
     *        Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in
     *        the web interface also disables encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafEncryptionType
     */

    public CmafEncryptionSettings withEncryptionMethod(CmafEncryptionType encryptionMethod) {
        this.encryptionMethod = encryptionMethod.toString();
        return this;
    }

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to
     * INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
     * 
     * @param initializationVectorInManifest
     *        The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If
     *        set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in
     *        the manifest.
     * @see CmafInitializationVectorInManifest
     */

    public void setInitializationVectorInManifest(String initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest;
    }

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to
     * INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
     * 
     * @return The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If
     *         set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not
     *         in the manifest.
     * @see CmafInitializationVectorInManifest
     */

    public String getInitializationVectorInManifest() {
        return this.initializationVectorInManifest;
    }

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to
     * INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
     * 
     * @param initializationVectorInManifest
     *        The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If
     *        set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in
     *        the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafInitializationVectorInManifest
     */

    public CmafEncryptionSettings withInitializationVectorInManifest(String initializationVectorInManifest) {
        setInitializationVectorInManifest(initializationVectorInManifest);
        return this;
    }

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to
     * INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
     * 
     * @param initializationVectorInManifest
     *        The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If
     *        set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in
     *        the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafInitializationVectorInManifest
     */

    public CmafEncryptionSettings withInitializationVectorInManifest(CmafInitializationVectorInManifest initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest.toString();
        return this;
    }

    /**
     * Use these settings to set up encryption with a static key provider.
     * 
     * @param staticKeyProvider
     *        Use these settings to set up encryption with a static key provider.
     */

    public void setStaticKeyProvider(StaticKeyProvider staticKeyProvider) {
        this.staticKeyProvider = staticKeyProvider;
    }

    /**
     * Use these settings to set up encryption with a static key provider.
     * 
     * @return Use these settings to set up encryption with a static key provider.
     */

    public StaticKeyProvider getStaticKeyProvider() {
        return this.staticKeyProvider;
    }

    /**
     * Use these settings to set up encryption with a static key provider.
     * 
     * @param staticKeyProvider
     *        Use these settings to set up encryption with a static key provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafEncryptionSettings withStaticKeyProvider(StaticKeyProvider staticKeyProvider) {
        setStaticKeyProvider(staticKeyProvider);
        return this;
    }

    /**
     * Indicates which type of key provider is used for encryption.
     * 
     * @param type
     *        Indicates which type of key provider is used for encryption.
     * @see CmafKeyProviderType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Indicates which type of key provider is used for encryption.
     * 
     * @return Indicates which type of key provider is used for encryption.
     * @see CmafKeyProviderType
     */

    public String getType() {
        return this.type;
    }

    /**
     * Indicates which type of key provider is used for encryption.
     * 
     * @param type
     *        Indicates which type of key provider is used for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafKeyProviderType
     */

    public CmafEncryptionSettings withType(String type) {
        setType(type);
        return this;
    }

    /**
     * Indicates which type of key provider is used for encryption.
     * 
     * @param type
     *        Indicates which type of key provider is used for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafKeyProviderType
     */

    public CmafEncryptionSettings withType(CmafKeyProviderType type) {
        this.type = type.toString();
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
        if (getConstantInitializationVector() != null)
            sb.append("ConstantInitializationVector: ").append(getConstantInitializationVector()).append(",");
        if (getEncryptionMethod() != null)
            sb.append("EncryptionMethod: ").append(getEncryptionMethod()).append(",");
        if (getInitializationVectorInManifest() != null)
            sb.append("InitializationVectorInManifest: ").append(getInitializationVectorInManifest()).append(",");
        if (getStaticKeyProvider() != null)
            sb.append("StaticKeyProvider: ").append(getStaticKeyProvider()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CmafEncryptionSettings == false)
            return false;
        CmafEncryptionSettings other = (CmafEncryptionSettings) obj;
        if (other.getConstantInitializationVector() == null ^ this.getConstantInitializationVector() == null)
            return false;
        if (other.getConstantInitializationVector() != null && other.getConstantInitializationVector().equals(this.getConstantInitializationVector()) == false)
            return false;
        if (other.getEncryptionMethod() == null ^ this.getEncryptionMethod() == null)
            return false;
        if (other.getEncryptionMethod() != null && other.getEncryptionMethod().equals(this.getEncryptionMethod()) == false)
            return false;
        if (other.getInitializationVectorInManifest() == null ^ this.getInitializationVectorInManifest() == null)
            return false;
        if (other.getInitializationVectorInManifest() != null
                && other.getInitializationVectorInManifest().equals(this.getInitializationVectorInManifest()) == false)
            return false;
        if (other.getStaticKeyProvider() == null ^ this.getStaticKeyProvider() == null)
            return false;
        if (other.getStaticKeyProvider() != null && other.getStaticKeyProvider().equals(this.getStaticKeyProvider()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstantInitializationVector() == null) ? 0 : getConstantInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMethod() == null) ? 0 : getEncryptionMethod().hashCode());
        hashCode = prime * hashCode + ((getInitializationVectorInManifest() == null) ? 0 : getInitializationVectorInManifest().hashCode());
        hashCode = prime * hashCode + ((getStaticKeyProvider() == null) ? 0 : getStaticKeyProvider().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CmafEncryptionSettings clone() {
        try {
            return (CmafEncryptionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CmafEncryptionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
