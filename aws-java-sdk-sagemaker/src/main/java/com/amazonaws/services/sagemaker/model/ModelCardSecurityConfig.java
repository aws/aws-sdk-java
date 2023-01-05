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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configure the security settings to protect model card data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelCardSecurityConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelCardSecurityConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Key Management Service <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">key ID</a> to use for
     * encrypting a model card.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A Key Management Service <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">key ID</a> to use for
     * encrypting a model card.
     * </p>
     * 
     * @param kmsKeyId
     *        A Key Management Service <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">key ID</a> to use
     *        for encrypting a model card.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * A Key Management Service <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">key ID</a> to use for
     * encrypting a model card.
     * </p>
     * 
     * @return A Key Management Service <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">key ID</a> to
     *         use for encrypting a model card.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * A Key Management Service <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">key ID</a> to use for
     * encrypting a model card.
     * </p>
     * 
     * @param kmsKeyId
     *        A Key Management Service <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">key ID</a> to use
     *        for encrypting a model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardSecurityConfig withKmsKeyId(String kmsKeyId) {
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

        if (obj instanceof ModelCardSecurityConfig == false)
            return false;
        ModelCardSecurityConfig other = (ModelCardSecurityConfig) obj;
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

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ModelCardSecurityConfig clone() {
        try {
            return (ModelCardSecurityConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelCardSecurityConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
