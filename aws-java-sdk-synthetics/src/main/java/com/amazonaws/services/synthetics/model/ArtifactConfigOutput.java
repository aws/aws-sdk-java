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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration for canary artifacts, including the encryption-at-rest settings for
 * artifacts that the canary uploads to Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ArtifactConfigOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactConfigOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that contains the configuration of encryption settings for canary artifacts that are stored in Amazon
     * S3.
     * </p>
     */
    private S3EncryptionConfig s3Encryption;

    /**
     * <p>
     * A structure that contains the configuration of encryption settings for canary artifacts that are stored in Amazon
     * S3.
     * </p>
     * 
     * @param s3Encryption
     *        A structure that contains the configuration of encryption settings for canary artifacts that are stored in
     *        Amazon S3.
     */

    public void setS3Encryption(S3EncryptionConfig s3Encryption) {
        this.s3Encryption = s3Encryption;
    }

    /**
     * <p>
     * A structure that contains the configuration of encryption settings for canary artifacts that are stored in Amazon
     * S3.
     * </p>
     * 
     * @return A structure that contains the configuration of encryption settings for canary artifacts that are stored
     *         in Amazon S3.
     */

    public S3EncryptionConfig getS3Encryption() {
        return this.s3Encryption;
    }

    /**
     * <p>
     * A structure that contains the configuration of encryption settings for canary artifacts that are stored in Amazon
     * S3.
     * </p>
     * 
     * @param s3Encryption
     *        A structure that contains the configuration of encryption settings for canary artifacts that are stored in
     *        Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactConfigOutput withS3Encryption(S3EncryptionConfig s3Encryption) {
        setS3Encryption(s3Encryption);
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
        if (getS3Encryption() != null)
            sb.append("S3Encryption: ").append(getS3Encryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactConfigOutput == false)
            return false;
        ArtifactConfigOutput other = (ArtifactConfigOutput) obj;
        if (other.getS3Encryption() == null ^ this.getS3Encryption() == null)
            return false;
        if (other.getS3Encryption() != null && other.getS3Encryption().equals(this.getS3Encryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Encryption() == null) ? 0 : getS3Encryption().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactConfigOutput clone() {
        try {
            return (ArtifactConfigOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.ArtifactConfigOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
