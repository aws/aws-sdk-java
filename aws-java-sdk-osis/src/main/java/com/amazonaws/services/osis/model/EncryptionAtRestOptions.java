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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options to control how OpenSearch encrypts buffer data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/EncryptionAtRestOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionAtRestOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the KMS key used to encrypt buffer data. By default, data is encrypted using an Amazon Web Services
     * owned key.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The ARN of the KMS key used to encrypt buffer data. By default, data is encrypted using an Amazon Web Services
     * owned key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key used to encrypt buffer data. By default, data is encrypted using an Amazon Web
     *        Services owned key.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key used to encrypt buffer data. By default, data is encrypted using an Amazon Web Services
     * owned key.
     * </p>
     * 
     * @return The ARN of the KMS key used to encrypt buffer data. By default, data is encrypted using an Amazon Web
     *         Services owned key.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key used to encrypt buffer data. By default, data is encrypted using an Amazon Web Services
     * owned key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key used to encrypt buffer data. By default, data is encrypted using an Amazon Web
     *        Services owned key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionAtRestOptions withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
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
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
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
        com.amazonaws.services.osis.model.transform.EncryptionAtRestOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
