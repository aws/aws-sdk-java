/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the S3 storage destination for a BundleTask when bundling a Windows instance.
 * </p>
 */
public class S3Storage implements Serializable {

    /**
     * The bucket in which to store the AMI. You can specify a bucket that
     * you already own or a new bucket that Amazon EC2 creates on your
     * behalf. <p> If you specify a bucket that belongs to someone else,
     * Amazon EC2 returns an error.
     */
    private String bucket;

    /**
     * The prefix to use when storing the AMI in S3.
     */
    private String prefix;

    /**
     * The Access Key ID of the owner of the Amazon S3 bucket.
     */
    private String aWSAccessKeyId;

    /**
     * A Base64-encoded Amazon S3 upload policy that gives Amazon EC2
     * permission to upload items into Amazon S3 on the user's behalf.
     */
    private String uploadPolicy;

    /**
     * The signature of the Base64 encoded JSON document.
     */
    private String uploadPolicySignature;

    /**
     * The bucket in which to store the AMI. You can specify a bucket that
     * you already own or a new bucket that Amazon EC2 creates on your
     * behalf. <p> If you specify a bucket that belongs to someone else,
     * Amazon EC2 returns an error.
     *
     * @return The bucket in which to store the AMI. You can specify a bucket that
     *         you already own or a new bucket that Amazon EC2 creates on your
     *         behalf. <p> If you specify a bucket that belongs to someone else,
     *         Amazon EC2 returns an error.
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * The bucket in which to store the AMI. You can specify a bucket that
     * you already own or a new bucket that Amazon EC2 creates on your
     * behalf. <p> If you specify a bucket that belongs to someone else,
     * Amazon EC2 returns an error.
     *
     * @param bucket The bucket in which to store the AMI. You can specify a bucket that
     *         you already own or a new bucket that Amazon EC2 creates on your
     *         behalf. <p> If you specify a bucket that belongs to someone else,
     *         Amazon EC2 returns an error.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * The bucket in which to store the AMI. You can specify a bucket that
     * you already own or a new bucket that Amazon EC2 creates on your
     * behalf. <p> If you specify a bucket that belongs to someone else,
     * Amazon EC2 returns an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket The bucket in which to store the AMI. You can specify a bucket that
     *         you already own or a new bucket that Amazon EC2 creates on your
     *         behalf. <p> If you specify a bucket that belongs to someone else,
     *         Amazon EC2 returns an error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public S3Storage withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * The prefix to use when storing the AMI in S3.
     *
     * @return The prefix to use when storing the AMI in S3.
     */
    public String getPrefix() {
        return prefix;
    }
    
    /**
     * The prefix to use when storing the AMI in S3.
     *
     * @param prefix The prefix to use when storing the AMI in S3.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    /**
     * The prefix to use when storing the AMI in S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefix The prefix to use when storing the AMI in S3.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public S3Storage withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * The Access Key ID of the owner of the Amazon S3 bucket.
     *
     * @return The Access Key ID of the owner of the Amazon S3 bucket.
     */
    public String getAWSAccessKeyId() {
        return aWSAccessKeyId;
    }
    
    /**
     * The Access Key ID of the owner of the Amazon S3 bucket.
     *
     * @param aWSAccessKeyId The Access Key ID of the owner of the Amazon S3 bucket.
     */
    public void setAWSAccessKeyId(String aWSAccessKeyId) {
        this.aWSAccessKeyId = aWSAccessKeyId;
    }
    
    /**
     * The Access Key ID of the owner of the Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccessKeyId The Access Key ID of the owner of the Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public S3Storage withAWSAccessKeyId(String aWSAccessKeyId) {
        this.aWSAccessKeyId = aWSAccessKeyId;
        return this;
    }

    /**
     * A Base64-encoded Amazon S3 upload policy that gives Amazon EC2
     * permission to upload items into Amazon S3 on the user's behalf.
     *
     * @return A Base64-encoded Amazon S3 upload policy that gives Amazon EC2
     *         permission to upload items into Amazon S3 on the user's behalf.
     */
    public String getUploadPolicy() {
        return uploadPolicy;
    }
    
    /**
     * A Base64-encoded Amazon S3 upload policy that gives Amazon EC2
     * permission to upload items into Amazon S3 on the user's behalf.
     *
     * @param uploadPolicy A Base64-encoded Amazon S3 upload policy that gives Amazon EC2
     *         permission to upload items into Amazon S3 on the user's behalf.
     */
    public void setUploadPolicy(String uploadPolicy) {
        this.uploadPolicy = uploadPolicy;
    }
    
    /**
     * A Base64-encoded Amazon S3 upload policy that gives Amazon EC2
     * permission to upload items into Amazon S3 on the user's behalf.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadPolicy A Base64-encoded Amazon S3 upload policy that gives Amazon EC2
     *         permission to upload items into Amazon S3 on the user's behalf.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public S3Storage withUploadPolicy(String uploadPolicy) {
        this.uploadPolicy = uploadPolicy;
        return this;
    }

    /**
     * The signature of the Base64 encoded JSON document.
     *
     * @return The signature of the Base64 encoded JSON document.
     */
    public String getUploadPolicySignature() {
        return uploadPolicySignature;
    }
    
    /**
     * The signature of the Base64 encoded JSON document.
     *
     * @param uploadPolicySignature The signature of the Base64 encoded JSON document.
     */
    public void setUploadPolicySignature(String uploadPolicySignature) {
        this.uploadPolicySignature = uploadPolicySignature;
    }
    
    /**
     * The signature of the Base64 encoded JSON document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadPolicySignature The signature of the Base64 encoded JSON document.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public S3Storage withUploadPolicySignature(String uploadPolicySignature) {
        this.uploadPolicySignature = uploadPolicySignature;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getPrefix() != null) sb.append("Prefix: " + getPrefix() + ",");
        if (getAWSAccessKeyId() != null) sb.append("AWSAccessKeyId: " + getAWSAccessKeyId() + ",");
        if (getUploadPolicy() != null) sb.append("UploadPolicy: " + getUploadPolicy() + ",");
        if (getUploadPolicySignature() != null) sb.append("UploadPolicySignature: " + getUploadPolicySignature() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode()); 
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getAWSAccessKeyId() == null) ? 0 : getAWSAccessKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getUploadPolicy() == null) ? 0 : getUploadPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getUploadPolicySignature() == null) ? 0 : getUploadPolicySignature().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3Storage == false) return false;
        S3Storage other = (S3Storage)obj;
        
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false; 
        if (other.getPrefix() == null ^ this.getPrefix() == null) return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false) return false; 
        if (other.getAWSAccessKeyId() == null ^ this.getAWSAccessKeyId() == null) return false;
        if (other.getAWSAccessKeyId() != null && other.getAWSAccessKeyId().equals(this.getAWSAccessKeyId()) == false) return false; 
        if (other.getUploadPolicy() == null ^ this.getUploadPolicy() == null) return false;
        if (other.getUploadPolicy() != null && other.getUploadPolicy().equals(this.getUploadPolicy()) == false) return false; 
        if (other.getUploadPolicySignature() == null ^ this.getUploadPolicySignature() == null) return false;
        if (other.getUploadPolicySignature() != null && other.getUploadPolicySignature().equals(this.getUploadPolicySignature()) == false) return false; 
        return true;
    }
    
}
    