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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetKMSEncryptionKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKMSEncryptionKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The KMS encryption key.
     * </p>
     */
    private KMSKey kmsKey;

    /**
     * <p>
     * The KMS encryption key.
     * </p>
     * 
     * @param kmsKey
     *        The KMS encryption key.
     */

    public void setKmsKey(KMSKey kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The KMS encryption key.
     * </p>
     * 
     * @return The KMS encryption key.
     */

    public KMSKey getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The KMS encryption key.
     * </p>
     * 
     * @param kmsKey
     *        The KMS encryption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKMSEncryptionKeyResult withKmsKey(KMSKey kmsKey) {
        setKmsKey(kmsKey);
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
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKMSEncryptionKeyResult == false)
            return false;
        GetKMSEncryptionKeyResult other = (GetKMSEncryptionKeyResult) obj;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        return hashCode;
    }

    @Override
    public GetKMSEncryptionKeyResult clone() {
        try {
            return (GetKMSEncryptionKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
