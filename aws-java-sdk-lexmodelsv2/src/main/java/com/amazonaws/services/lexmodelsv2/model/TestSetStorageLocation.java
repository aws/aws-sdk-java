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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the location in which the test set is stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestSetStorageLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSetStorageLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket in which the test set is stored.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The path inside the Amazon S3 bucket where the test set is stored.
     * </p>
     */
    private String s3Path;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services Key Management Service (KMS) key for encrypting the test
     * set.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The name of the Amazon S3 bucket in which the test set is stored.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket in which the test set is stored.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket in which the test set is stored.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket in which the test set is stored.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket in which the test set is stored.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket in which the test set is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetStorageLocation withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The path inside the Amazon S3 bucket where the test set is stored.
     * </p>
     * 
     * @param s3Path
     *        The path inside the Amazon S3 bucket where the test set is stored.
     */

    public void setS3Path(String s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * <p>
     * The path inside the Amazon S3 bucket where the test set is stored.
     * </p>
     * 
     * @return The path inside the Amazon S3 bucket where the test set is stored.
     */

    public String getS3Path() {
        return this.s3Path;
    }

    /**
     * <p>
     * The path inside the Amazon S3 bucket where the test set is stored.
     * </p>
     * 
     * @param s3Path
     *        The path inside the Amazon S3 bucket where the test set is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetStorageLocation withS3Path(String s3Path) {
        setS3Path(s3Path);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services Key Management Service (KMS) key for encrypting the test
     * set.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of an Amazon Web Services Key Management Service (KMS) key for encrypting
     *        the test set.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services Key Management Service (KMS) key for encrypting the test
     * set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon Web Services Key Management Service (KMS) key for encrypting
     *         the test set.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services Key Management Service (KMS) key for encrypting the test
     * set.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of an Amazon Web Services Key Management Service (KMS) key for encrypting
     *        the test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetStorageLocation withKmsKeyArn(String kmsKeyArn) {
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
        if (getS3Path() != null)
            sb.append("S3Path: ").append(getS3Path()).append(",");
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

        if (obj instanceof TestSetStorageLocation == false)
            return false;
        TestSetStorageLocation other = (TestSetStorageLocation) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
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
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public TestSetStorageLocation clone() {
        try {
            return (TestSetStorageLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestSetStorageLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
