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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a revocation file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RevocationContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevocationContent implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon S3 bucket for the revocation file.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The Amazon S3 path for the revocation file.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * The Amazon S3 object version of the revocation file.
     * </p>
     */
    private String s3ObjectVersion;
    /**
     * <p>
     * The type of revocation file.
     * </p>
     */
    private String revocationType;

    /**
     * <p>
     * The Amazon S3 bucket for the revocation file.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket for the revocation file.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket for the revocation file.
     * </p>
     * 
     * @return The Amazon S3 bucket for the revocation file.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket for the revocation file.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket for the revocation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevocationContent withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path for the revocation file.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 path for the revocation file.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The Amazon S3 path for the revocation file.
     * </p>
     * 
     * @return The Amazon S3 path for the revocation file.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The Amazon S3 path for the revocation file.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 path for the revocation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevocationContent withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object version of the revocation file.
     * </p>
     * 
     * @param s3ObjectVersion
     *        The Amazon S3 object version of the revocation file.
     */

    public void setS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object version of the revocation file.
     * </p>
     * 
     * @return The Amazon S3 object version of the revocation file.
     */

    public String getS3ObjectVersion() {
        return this.s3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object version of the revocation file.
     * </p>
     * 
     * @param s3ObjectVersion
     *        The Amazon S3 object version of the revocation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevocationContent withS3ObjectVersion(String s3ObjectVersion) {
        setS3ObjectVersion(s3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The type of revocation file.
     * </p>
     * 
     * @param revocationType
     *        The type of revocation file.
     * @see RevocationType
     */

    public void setRevocationType(String revocationType) {
        this.revocationType = revocationType;
    }

    /**
     * <p>
     * The type of revocation file.
     * </p>
     * 
     * @return The type of revocation file.
     * @see RevocationType
     */

    public String getRevocationType() {
        return this.revocationType;
    }

    /**
     * <p>
     * The type of revocation file.
     * </p>
     * 
     * @param revocationType
     *        The type of revocation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationType
     */

    public RevocationContent withRevocationType(String revocationType) {
        setRevocationType(revocationType);
        return this;
    }

    /**
     * <p>
     * The type of revocation file.
     * </p>
     * 
     * @param revocationType
     *        The type of revocation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationType
     */

    public RevocationContent withRevocationType(RevocationType revocationType) {
        this.revocationType = revocationType.toString();
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key()).append(",");
        if (getS3ObjectVersion() != null)
            sb.append("S3ObjectVersion: ").append(getS3ObjectVersion()).append(",");
        if (getRevocationType() != null)
            sb.append("RevocationType: ").append(getRevocationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevocationContent == false)
            return false;
        RevocationContent other = (RevocationContent) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getS3ObjectVersion() == null ^ this.getS3ObjectVersion() == null)
            return false;
        if (other.getS3ObjectVersion() != null && other.getS3ObjectVersion().equals(this.getS3ObjectVersion()) == false)
            return false;
        if (other.getRevocationType() == null ^ this.getRevocationType() == null)
            return false;
        if (other.getRevocationType() != null && other.getRevocationType().equals(this.getRevocationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectVersion() == null) ? 0 : getS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getRevocationType() == null) ? 0 : getRevocationType().hashCode());
        return hashCode;
    }

    @Override
    public RevocationContent clone() {
        try {
            return (RevocationContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
