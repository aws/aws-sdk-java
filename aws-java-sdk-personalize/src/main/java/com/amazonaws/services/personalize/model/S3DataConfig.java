/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details of an Amazon S3 input or output bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/S3DataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file path of the Amazon S3 bucket.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS) key that Amazon Personalize uses to
     * encrypt or decrypt the input and output files of a batch inference job.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The file path of the Amazon S3 bucket.
     * </p>
     * 
     * @param path
     *        The file path of the Amazon S3 bucket.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The file path of the Amazon S3 bucket.
     * </p>
     * 
     * @return The file path of the Amazon S3 bucket.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The file path of the Amazon S3 bucket.
     * </p>
     * 
     * @param path
     *        The file path of the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataConfig withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS) key that Amazon Personalize uses to
     * encrypt or decrypt the input and output files of a batch inference job.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS) key that Amazon Personalize uses
     *        to encrypt or decrypt the input and output files of a batch inference job.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS) key that Amazon Personalize uses to
     * encrypt or decrypt the input and output files of a batch inference job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS) key that Amazon Personalize
     *         uses to encrypt or decrypt the input and output files of a batch inference job.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS) key that Amazon Personalize uses to
     * encrypt or decrypt the input and output files of a batch inference job.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS) key that Amazon Personalize uses
     *        to encrypt or decrypt the input and output files of a batch inference job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataConfig withKmsKeyArn(String kmsKeyArn) {
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
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

        if (obj instanceof S3DataConfig == false)
            return false;
        S3DataConfig other = (S3DataConfig) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public S3DataConfig clone() {
        try {
            return (S3DataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.S3DataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
