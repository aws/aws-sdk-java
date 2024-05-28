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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration settings for server-side encryption.
 * </p>
 * <note>
 * <p>
 * We only support symmetric keys. Do not use asymmetric or HMAC keys, or KMS aliases.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ServerSideEncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerSideEncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the KMS key used to encrypt the enrollment data in a voice profile domain. Asymmetric customer managed
     * keys are not supported.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The ARN of the KMS key used to encrypt the enrollment data in a voice profile domain. Asymmetric customer managed
     * keys are not supported.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key used to encrypt the enrollment data in a voice profile domain. Asymmetric customer
     *        managed keys are not supported.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key used to encrypt the enrollment data in a voice profile domain. Asymmetric customer managed
     * keys are not supported.
     * </p>
     * 
     * @return The ARN of the KMS key used to encrypt the enrollment data in a voice profile domain. Asymmetric customer
     *         managed keys are not supported.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key used to encrypt the enrollment data in a voice profile domain. Asymmetric customer managed
     * keys are not supported.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key used to encrypt the enrollment data in a voice profile domain. Asymmetric customer
     *        managed keys are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerSideEncryptionConfiguration withKmsKeyArn(String kmsKeyArn) {
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
            sb.append("KmsKeyArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerSideEncryptionConfiguration == false)
            return false;
        ServerSideEncryptionConfiguration other = (ServerSideEncryptionConfiguration) obj;
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
    public ServerSideEncryptionConfiguration clone() {
        try {
            return (ServerSideEncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.ServerSideEncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
