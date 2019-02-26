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
 * Settings for HLS encryption
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/HlsEncryptionSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsEncryptionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then
     * the Initialization Vector will follow the segment number by default.
     */
    private String constantInitializationVector;

    private String encryptionMethod;

    private String initializationVectorInManifest;

    private String offlineEncrypted;

    private SpekeKeyProvider spekeKeyProvider;

    private StaticKeyProvider staticKeyProvider;

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

    public HlsEncryptionSettings withConstantInitializationVector(String constantInitializationVector) {
        setConstantInitializationVector(constantInitializationVector);
        return this;
    }

    /**
     * @param encryptionMethod
     * @see HlsEncryptionType
     */

    public void setEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    /**
     * @return
     * @see HlsEncryptionType
     */

    public String getEncryptionMethod() {
        return this.encryptionMethod;
    }

    /**
     * @param encryptionMethod
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsEncryptionType
     */

    public HlsEncryptionSettings withEncryptionMethod(String encryptionMethod) {
        setEncryptionMethod(encryptionMethod);
        return this;
    }

    /**
     * @param encryptionMethod
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsEncryptionType
     */

    public HlsEncryptionSettings withEncryptionMethod(HlsEncryptionType encryptionMethod) {
        this.encryptionMethod = encryptionMethod.toString();
        return this;
    }

    /**
     * @param initializationVectorInManifest
     * @see HlsInitializationVectorInManifest
     */

    public void setInitializationVectorInManifest(String initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest;
    }

    /**
     * @return
     * @see HlsInitializationVectorInManifest
     */

    public String getInitializationVectorInManifest() {
        return this.initializationVectorInManifest;
    }

    /**
     * @param initializationVectorInManifest
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsInitializationVectorInManifest
     */

    public HlsEncryptionSettings withInitializationVectorInManifest(String initializationVectorInManifest) {
        setInitializationVectorInManifest(initializationVectorInManifest);
        return this;
    }

    /**
     * @param initializationVectorInManifest
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsInitializationVectorInManifest
     */

    public HlsEncryptionSettings withInitializationVectorInManifest(HlsInitializationVectorInManifest initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest.toString();
        return this;
    }

    /**
     * @param offlineEncrypted
     * @see HlsOfflineEncrypted
     */

    public void setOfflineEncrypted(String offlineEncrypted) {
        this.offlineEncrypted = offlineEncrypted;
    }

    /**
     * @return
     * @see HlsOfflineEncrypted
     */

    public String getOfflineEncrypted() {
        return this.offlineEncrypted;
    }

    /**
     * @param offlineEncrypted
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsOfflineEncrypted
     */

    public HlsEncryptionSettings withOfflineEncrypted(String offlineEncrypted) {
        setOfflineEncrypted(offlineEncrypted);
        return this;
    }

    /**
     * @param offlineEncrypted
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsOfflineEncrypted
     */

    public HlsEncryptionSettings withOfflineEncrypted(HlsOfflineEncrypted offlineEncrypted) {
        this.offlineEncrypted = offlineEncrypted.toString();
        return this;
    }

    /**
     * @param spekeKeyProvider
     */

    public void setSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * @return
     */

    public SpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    /**
     * @param spekeKeyProvider
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsEncryptionSettings withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        setSpekeKeyProvider(spekeKeyProvider);
        return this;
    }

    /**
     * @param staticKeyProvider
     */

    public void setStaticKeyProvider(StaticKeyProvider staticKeyProvider) {
        this.staticKeyProvider = staticKeyProvider;
    }

    /**
     * @return
     */

    public StaticKeyProvider getStaticKeyProvider() {
        return this.staticKeyProvider;
    }

    /**
     * @param staticKeyProvider
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsEncryptionSettings withStaticKeyProvider(StaticKeyProvider staticKeyProvider) {
        setStaticKeyProvider(staticKeyProvider);
        return this;
    }

    /**
     * @param type
     * @see HlsKeyProviderType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see HlsKeyProviderType
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsKeyProviderType
     */

    public HlsEncryptionSettings withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsKeyProviderType
     */

    public HlsEncryptionSettings withType(HlsKeyProviderType type) {
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
        if (getOfflineEncrypted() != null)
            sb.append("OfflineEncrypted: ").append(getOfflineEncrypted()).append(",");
        if (getSpekeKeyProvider() != null)
            sb.append("SpekeKeyProvider: ").append(getSpekeKeyProvider()).append(",");
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

        if (obj instanceof HlsEncryptionSettings == false)
            return false;
        HlsEncryptionSettings other = (HlsEncryptionSettings) obj;
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
        if (other.getOfflineEncrypted() == null ^ this.getOfflineEncrypted() == null)
            return false;
        if (other.getOfflineEncrypted() != null && other.getOfflineEncrypted().equals(this.getOfflineEncrypted()) == false)
            return false;
        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null)
            return false;
        if (other.getSpekeKeyProvider() != null && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false)
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
        hashCode = prime * hashCode + ((getOfflineEncrypted() == null) ? 0 : getOfflineEncrypted().hashCode());
        hashCode = prime * hashCode + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        hashCode = prime * hashCode + ((getStaticKeyProvider() == null) ? 0 : getStaticKeyProvider().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public HlsEncryptionSettings clone() {
        try {
            return (HlsEncryptionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.HlsEncryptionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
