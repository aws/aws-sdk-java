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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Encryption config for Connect Instance. Note that sensitive data will always be encrypted. If disabled, service will
 * perform encryption with its own key. If enabled, a KMS key id needs to be provided and KMS charges will apply. KMS is
 * only type supported
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/EncryptionConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfig implements Serializable, Cloneable, StructuredPojo {

    private Boolean enabled;

    private String encryptionType;

    private String keyArn;

    /**
     * @param enabled
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @param enabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * @param encryptionType
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * @return
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * @param encryptionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfig withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * @param encryptionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfig withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * @param keyArn
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * @return
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * @param keyArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfig withKeyArn(String keyArn) {
        setKeyArn(keyArn);
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
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType()).append(",");
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionConfig == false)
            return false;
        EncryptionConfig other = (EncryptionConfig) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionConfig clone() {
        try {
            return (EncryptionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcampaign.model.transform.EncryptionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
