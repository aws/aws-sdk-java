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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the Encryption At Rest Options.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionAtRestOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the option to enable Encryption At Rest.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies the KMS Key ID for Encryption At Rest options.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Specifies the option to enable Encryption At Rest.
     * </p>
     * 
     * @param enabled
     *        Specifies the option to enable Encryption At Rest.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies the option to enable Encryption At Rest.
     * </p>
     * 
     * @return Specifies the option to enable Encryption At Rest.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies the option to enable Encryption At Rest.
     * </p>
     * 
     * @param enabled
     *        Specifies the option to enable Encryption At Rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionAtRestOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies the option to enable Encryption At Rest.
     * </p>
     * 
     * @return Specifies the option to enable Encryption At Rest.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies the KMS Key ID for Encryption At Rest options.
     * </p>
     * 
     * @param kmsKeyId
     *        Specifies the KMS Key ID for Encryption At Rest options.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS Key ID for Encryption At Rest options.
     * </p>
     * 
     * @return Specifies the KMS Key ID for Encryption At Rest options.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS Key ID for Encryption At Rest options.
     * </p>
     * 
     * @param kmsKeyId
     *        Specifies the KMS Key ID for Encryption At Rest options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionAtRestOptions withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionAtRestOptions == false)
            return false;
        EncryptionAtRestOptions other = (EncryptionAtRestOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionAtRestOptions clone() {
        try {
            return (EncryptionAtRestOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.EncryptionAtRestOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
