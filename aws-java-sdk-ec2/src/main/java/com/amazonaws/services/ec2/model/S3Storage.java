/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the storage parameters for S3 and S3 buckets for an instance store-backed AMI.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/S3Storage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Storage implements Serializable, Cloneable {

    /**
     * <p>
     * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and
     * follow the guidance in <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html">Best Practices for
     * Managing AWS Access Keys</a>.
     * </p>
     */
    private String aWSAccessKeyId;
    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon
     * EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The beginning of the file name of the AMI.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
     * </p>
     */
    private String uploadPolicy;
    /**
     * <p>
     * The signature of the JSON document.
     * </p>
     */
    private String uploadPolicySignature;

    /**
     * <p>
     * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and
     * follow the guidance in <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html">Best Practices for
     * Managing AWS Access Keys</a>.
     * </p>
     * 
     * @param aWSAccessKeyId
     *        The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review
     *        and follow the guidance in <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html">Best Practices
     *        for Managing AWS Access Keys</a>.
     */

    public void setAWSAccessKeyId(String aWSAccessKeyId) {
        this.aWSAccessKeyId = aWSAccessKeyId;
    }

    /**
     * <p>
     * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and
     * follow the guidance in <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html">Best Practices for
     * Managing AWS Access Keys</a>.
     * </p>
     * 
     * @return The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review
     *         and follow the guidance in <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html">Best Practices
     *         for Managing AWS Access Keys</a>.
     */

    public String getAWSAccessKeyId() {
        return this.aWSAccessKeyId;
    }

    /**
     * <p>
     * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and
     * follow the guidance in <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html">Best Practices for
     * Managing AWS Access Keys</a>.
     * </p>
     * 
     * @param aWSAccessKeyId
     *        The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review
     *        and follow the guidance in <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html">Best Practices
     *        for Managing AWS Access Keys</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Storage withAWSAccessKeyId(String aWSAccessKeyId) {
        setAWSAccessKeyId(aWSAccessKeyId);
        return this;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon
     * EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
     * </p>
     * 
     * @param bucket
     *        The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that
     *        Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2
     *        returns an error.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon
     * EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
     * </p>
     * 
     * @return The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that
     *         Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2
     *         returns an error.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon
     * EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
     * </p>
     * 
     * @param bucket
     *        The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that
     *        Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2
     *        returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Storage withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The beginning of the file name of the AMI.
     * </p>
     * 
     * @param prefix
     *        The beginning of the file name of the AMI.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The beginning of the file name of the AMI.
     * </p>
     * 
     * @return The beginning of the file name of the AMI.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The beginning of the file name of the AMI.
     * </p>
     * 
     * @param prefix
     *        The beginning of the file name of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Storage withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
     * </p>
     * 
     * @param uploadPolicy
     *        An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
     */

    public void setUploadPolicy(String uploadPolicy) {
        this.uploadPolicy = uploadPolicy;
    }

    /**
     * <p>
     * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
     * </p>
     * 
     * @return An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your
     *         behalf.
     */

    public String getUploadPolicy() {
        return this.uploadPolicy;
    }

    /**
     * <p>
     * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
     * </p>
     * 
     * @param uploadPolicy
     *        An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Storage withUploadPolicy(String uploadPolicy) {
        setUploadPolicy(uploadPolicy);
        return this;
    }

    /**
     * <p>
     * The signature of the JSON document.
     * </p>
     * 
     * @param uploadPolicySignature
     *        The signature of the JSON document.
     */

    public void setUploadPolicySignature(String uploadPolicySignature) {
        this.uploadPolicySignature = uploadPolicySignature;
    }

    /**
     * <p>
     * The signature of the JSON document.
     * </p>
     * 
     * @return The signature of the JSON document.
     */

    public String getUploadPolicySignature() {
        return this.uploadPolicySignature;
    }

    /**
     * <p>
     * The signature of the JSON document.
     * </p>
     * 
     * @param uploadPolicySignature
     *        The signature of the JSON document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Storage withUploadPolicySignature(String uploadPolicySignature) {
        setUploadPolicySignature(uploadPolicySignature);
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
        if (getAWSAccessKeyId() != null)
            sb.append("AWSAccessKeyId: ").append(getAWSAccessKeyId()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getUploadPolicy() != null)
            sb.append("UploadPolicy: ").append(getUploadPolicy()).append(",");
        if (getUploadPolicySignature() != null)
            sb.append("UploadPolicySignature: ").append(getUploadPolicySignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Storage == false)
            return false;
        S3Storage other = (S3Storage) obj;
        if (other.getAWSAccessKeyId() == null ^ this.getAWSAccessKeyId() == null)
            return false;
        if (other.getAWSAccessKeyId() != null && other.getAWSAccessKeyId().equals(this.getAWSAccessKeyId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getUploadPolicy() == null ^ this.getUploadPolicy() == null)
            return false;
        if (other.getUploadPolicy() != null && other.getUploadPolicy().equals(this.getUploadPolicy()) == false)
            return false;
        if (other.getUploadPolicySignature() == null ^ this.getUploadPolicySignature() == null)
            return false;
        if (other.getUploadPolicySignature() != null && other.getUploadPolicySignature().equals(this.getUploadPolicySignature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAWSAccessKeyId() == null) ? 0 : getAWSAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getUploadPolicy() == null) ? 0 : getUploadPolicy().hashCode());
        hashCode = prime * hashCode + ((getUploadPolicySignature() == null) ? 0 : getUploadPolicySignature().hashCode());
        return hashCode;
    }

    @Override
    public S3Storage clone() {
        try {
            return (S3Storage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
