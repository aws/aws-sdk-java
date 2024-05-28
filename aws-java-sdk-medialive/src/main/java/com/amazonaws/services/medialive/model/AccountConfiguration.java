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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for AccountConfiguration
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AccountConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies the KMS key to use for all features that use key encryption. Specify the ARN of a KMS key that you have
     * created. Or leave blank to use the key that MediaLive creates and manages for you.
     */
    private String kmsKeyId;

    /**
     * Specifies the KMS key to use for all features that use key encryption. Specify the ARN of a KMS key that you have
     * created. Or leave blank to use the key that MediaLive creates and manages for you.
     * 
     * @param kmsKeyId
     *        Specifies the KMS key to use for all features that use key encryption. Specify the ARN of a KMS key that
     *        you have created. Or leave blank to use the key that MediaLive creates and manages for you.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * Specifies the KMS key to use for all features that use key encryption. Specify the ARN of a KMS key that you have
     * created. Or leave blank to use the key that MediaLive creates and manages for you.
     * 
     * @return Specifies the KMS key to use for all features that use key encryption. Specify the ARN of a KMS key that
     *         you have created. Or leave blank to use the key that MediaLive creates and manages for you.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * Specifies the KMS key to use for all features that use key encryption. Specify the ARN of a KMS key that you have
     * created. Or leave blank to use the key that MediaLive creates and manages for you.
     * 
     * @param kmsKeyId
     *        Specifies the KMS key to use for all features that use key encryption. Specify the ARN of a KMS key that
     *        you have created. Or leave blank to use the key that MediaLive creates and manages for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountConfiguration withKmsKeyId(String kmsKeyId) {
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

        if (obj instanceof AccountConfiguration == false)
            return false;
        AccountConfiguration other = (AccountConfiguration) obj;
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
    public AccountConfiguration clone() {
        try {
            return (AccountConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AccountConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
