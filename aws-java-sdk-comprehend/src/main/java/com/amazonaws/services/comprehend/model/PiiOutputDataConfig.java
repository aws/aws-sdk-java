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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration parameters for the output of PII entity detection jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/PiiOutputDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PiiOutputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When you use the <code>PiiOutputDataConfig</code> object with asynchronous operations, you specify the Amazon S3
     * location where you want to write the output data.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an
     * analysis job.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * When you use the <code>PiiOutputDataConfig</code> object with asynchronous operations, you specify the Amazon S3
     * location where you want to write the output data.
     * </p>
     * 
     * @param s3Uri
     *        When you use the <code>PiiOutputDataConfig</code> object with asynchronous operations, you specify the
     *        Amazon S3 location where you want to write the output data.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * When you use the <code>PiiOutputDataConfig</code> object with asynchronous operations, you specify the Amazon S3
     * location where you want to write the output data.
     * </p>
     * 
     * @return When you use the <code>PiiOutputDataConfig</code> object with asynchronous operations, you specify the
     *         Amazon S3 location where you want to write the output data.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * When you use the <code>PiiOutputDataConfig</code> object with asynchronous operations, you specify the Amazon S3
     * location where you want to write the output data.
     * </p>
     * 
     * @param s3Uri
     *        When you use the <code>PiiOutputDataConfig</code> object with asynchronous operations, you specify the
     *        Amazon S3 location where you want to write the output data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PiiOutputDataConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an
     * analysis job.
     * </p>
     * 
     * @param kmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results
     *        from an analysis job.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an
     * analysis job.
     * </p>
     * 
     * @return ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results
     *         from an analysis job.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an
     * analysis job.
     * </p>
     * 
     * @param kmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results
     *        from an analysis job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PiiOutputDataConfig withKmsKeyId(String kmsKeyId) {
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
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

        if (obj instanceof PiiOutputDataConfig == false)
            return false;
        PiiOutputDataConfig other = (PiiOutputDataConfig) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
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

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public PiiOutputDataConfig clone() {
        try {
            return (PiiOutputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.PiiOutputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
