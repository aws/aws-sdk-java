/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The server-side encryption key configuration for a customer provided encryption key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/SseConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SseConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The KMS encryption configuration used to provide details for data encryption.
     * </p>
     */
    private KmsEncryptionConfig kmsEncryptionConfig;

    /**
     * <p>
     * The KMS encryption configuration used to provide details for data encryption.
     * </p>
     * 
     * @param kmsEncryptionConfig
     *        The KMS encryption configuration used to provide details for data encryption.
     */

    public void setKmsEncryptionConfig(KmsEncryptionConfig kmsEncryptionConfig) {
        this.kmsEncryptionConfig = kmsEncryptionConfig;
    }

    /**
     * <p>
     * The KMS encryption configuration used to provide details for data encryption.
     * </p>
     * 
     * @return The KMS encryption configuration used to provide details for data encryption.
     */

    public KmsEncryptionConfig getKmsEncryptionConfig() {
        return this.kmsEncryptionConfig;
    }

    /**
     * <p>
     * The KMS encryption configuration used to provide details for data encryption.
     * </p>
     * 
     * @param kmsEncryptionConfig
     *        The KMS encryption configuration used to provide details for data encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SseConfiguration withKmsEncryptionConfig(KmsEncryptionConfig kmsEncryptionConfig) {
        setKmsEncryptionConfig(kmsEncryptionConfig);
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
        if (getKmsEncryptionConfig() != null)
            sb.append("KmsEncryptionConfig: ").append(getKmsEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SseConfiguration == false)
            return false;
        SseConfiguration other = (SseConfiguration) obj;
        if (other.getKmsEncryptionConfig() == null ^ this.getKmsEncryptionConfig() == null)
            return false;
        if (other.getKmsEncryptionConfig() != null && other.getKmsEncryptionConfig().equals(this.getKmsEncryptionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsEncryptionConfig() == null) ? 0 : getKmsEncryptionConfig().hashCode());
        return hashCode;
    }

    @Override
    public SseConfiguration clone() {
        try {
            return (SseConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.healthlake.model.transform.SseConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
