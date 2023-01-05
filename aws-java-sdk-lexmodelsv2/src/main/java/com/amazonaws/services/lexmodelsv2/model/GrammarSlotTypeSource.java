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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Amazon S3 bucket name and location for the grammar that is the source for the slot type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GrammarSlotTypeSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrammarSlotTypeSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket that contains the grammar source.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The path to the grammar in the S3 bucket.
     * </p>
     */
    private String s3ObjectKey;
    /**
     * <p>
     * The Amazon KMS key required to decrypt the contents of the grammar, if any.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The name of the S3 bucket that contains the grammar source.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket that contains the grammar source.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket that contains the grammar source.
     * </p>
     * 
     * @return The name of the S3 bucket that contains the grammar source.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket that contains the grammar source.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket that contains the grammar source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrammarSlotTypeSource withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The path to the grammar in the S3 bucket.
     * </p>
     * 
     * @param s3ObjectKey
     *        The path to the grammar in the S3 bucket.
     */

    public void setS3ObjectKey(String s3ObjectKey) {
        this.s3ObjectKey = s3ObjectKey;
    }

    /**
     * <p>
     * The path to the grammar in the S3 bucket.
     * </p>
     * 
     * @return The path to the grammar in the S3 bucket.
     */

    public String getS3ObjectKey() {
        return this.s3ObjectKey;
    }

    /**
     * <p>
     * The path to the grammar in the S3 bucket.
     * </p>
     * 
     * @param s3ObjectKey
     *        The path to the grammar in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrammarSlotTypeSource withS3ObjectKey(String s3ObjectKey) {
        setS3ObjectKey(s3ObjectKey);
        return this;
    }

    /**
     * <p>
     * The Amazon KMS key required to decrypt the contents of the grammar, if any.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon KMS key required to decrypt the contents of the grammar, if any.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon KMS key required to decrypt the contents of the grammar, if any.
     * </p>
     * 
     * @return The Amazon KMS key required to decrypt the contents of the grammar, if any.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon KMS key required to decrypt the contents of the grammar, if any.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon KMS key required to decrypt the contents of the grammar, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrammarSlotTypeSource withKmsKeyArn(String kmsKeyArn) {
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
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3ObjectKey() != null)
            sb.append("S3ObjectKey: ").append(getS3ObjectKey()).append(",");
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

        if (obj instanceof GrammarSlotTypeSource == false)
            return false;
        GrammarSlotTypeSource other = (GrammarSlotTypeSource) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3ObjectKey() == null ^ this.getS3ObjectKey() == null)
            return false;
        if (other.getS3ObjectKey() != null && other.getS3ObjectKey().equals(this.getS3ObjectKey()) == false)
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

        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectKey() == null) ? 0 : getS3ObjectKey().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public GrammarSlotTypeSource clone() {
        try {
            return (GrammarSlotTypeSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.GrammarSlotTypeSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
