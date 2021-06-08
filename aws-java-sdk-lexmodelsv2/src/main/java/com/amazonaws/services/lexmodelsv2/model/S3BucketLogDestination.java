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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Amazon S3 bucket for logging audio conversations
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/S3BucketLogDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketLogDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files stored
     * in an S3 bucket.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * The S3 prefix to assign to audio log files.
     * </p>
     */
    private String logPrefix;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files stored
     * in an S3 bucket.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files
     *        stored in an S3 bucket.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files stored
     * in an S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files
     *         stored in an S3 bucket.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files stored
     * in an S3 bucket.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files
     *        stored in an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketLogDestination withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     * </p>
     * 
     * @param s3BucketArn
     *        The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     * </p>
     * 
     * @param s3BucketArn
     *        The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketLogDestination withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * The S3 prefix to assign to audio log files.
     * </p>
     * 
     * @param logPrefix
     *        The S3 prefix to assign to audio log files.
     */

    public void setLogPrefix(String logPrefix) {
        this.logPrefix = logPrefix;
    }

    /**
     * <p>
     * The S3 prefix to assign to audio log files.
     * </p>
     * 
     * @return The S3 prefix to assign to audio log files.
     */

    public String getLogPrefix() {
        return this.logPrefix;
    }

    /**
     * <p>
     * The S3 prefix to assign to audio log files.
     * </p>
     * 
     * @param logPrefix
     *        The S3 prefix to assign to audio log files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketLogDestination withLogPrefix(String logPrefix) {
        setLogPrefix(logPrefix);
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
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getLogPrefix() != null)
            sb.append("LogPrefix: ").append(getLogPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketLogDestination == false)
            return false;
        S3BucketLogDestination other = (S3BucketLogDestination) obj;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getLogPrefix() == null ^ this.getLogPrefix() == null)
            return false;
        if (other.getLogPrefix() != null && other.getLogPrefix().equals(this.getLogPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getLogPrefix() == null) ? 0 : getLogPrefix().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketLogDestination clone() {
        try {
            return (S3BucketLogDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.S3BucketLogDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
