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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The encryption configuration to use when storing the generated manifest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GeneratedManifestEncryption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneratedManifestEncryption implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the use of SSE-S3 to encrypt generated manifest objects.
     * </p>
     */
    private SSES3Encryption sSES3;
    /**
     * <p>
     * Configuration details on how SSE-KMS is used to encrypt generated manifest objects.
     * </p>
     */
    private SSEKMSEncryption sSEKMS;

    /**
     * <p>
     * Specifies the use of SSE-S3 to encrypt generated manifest objects.
     * </p>
     * 
     * @param sSES3
     *        Specifies the use of SSE-S3 to encrypt generated manifest objects.
     */

    public void setSSES3(SSES3Encryption sSES3) {
        this.sSES3 = sSES3;
    }

    /**
     * <p>
     * Specifies the use of SSE-S3 to encrypt generated manifest objects.
     * </p>
     * 
     * @return Specifies the use of SSE-S3 to encrypt generated manifest objects.
     */

    public SSES3Encryption getSSES3() {
        return this.sSES3;
    }

    /**
     * <p>
     * Specifies the use of SSE-S3 to encrypt generated manifest objects.
     * </p>
     * 
     * @param sSES3
     *        Specifies the use of SSE-S3 to encrypt generated manifest objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratedManifestEncryption withSSES3(SSES3Encryption sSES3) {
        setSSES3(sSES3);
        return this;
    }

    /**
     * <p>
     * Configuration details on how SSE-KMS is used to encrypt generated manifest objects.
     * </p>
     * 
     * @param sSEKMS
     *        Configuration details on how SSE-KMS is used to encrypt generated manifest objects.
     */

    public void setSSEKMS(SSEKMSEncryption sSEKMS) {
        this.sSEKMS = sSEKMS;
    }

    /**
     * <p>
     * Configuration details on how SSE-KMS is used to encrypt generated manifest objects.
     * </p>
     * 
     * @return Configuration details on how SSE-KMS is used to encrypt generated manifest objects.
     */

    public SSEKMSEncryption getSSEKMS() {
        return this.sSEKMS;
    }

    /**
     * <p>
     * Configuration details on how SSE-KMS is used to encrypt generated manifest objects.
     * </p>
     * 
     * @param sSEKMS
     *        Configuration details on how SSE-KMS is used to encrypt generated manifest objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratedManifestEncryption withSSEKMS(SSEKMSEncryption sSEKMS) {
        setSSEKMS(sSEKMS);
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
        if (getSSES3() != null)
            sb.append("SSES3: ").append(getSSES3()).append(",");
        if (getSSEKMS() != null)
            sb.append("SSEKMS: ").append(getSSEKMS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeneratedManifestEncryption == false)
            return false;
        GeneratedManifestEncryption other = (GeneratedManifestEncryption) obj;
        if (other.getSSES3() == null ^ this.getSSES3() == null)
            return false;
        if (other.getSSES3() != null && other.getSSES3().equals(this.getSSES3()) == false)
            return false;
        if (other.getSSEKMS() == null ^ this.getSSEKMS() == null)
            return false;
        if (other.getSSEKMS() != null && other.getSSEKMS().equals(this.getSSEKMS()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSSES3() == null) ? 0 : getSSES3().hashCode());
        hashCode = prime * hashCode + ((getSSEKMS() == null) ? 0 : getSSEKMS().hashCode());
        return hashCode;
    }

    @Override
    public GeneratedManifestEncryption clone() {
        try {
            return (GeneratedManifestEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
