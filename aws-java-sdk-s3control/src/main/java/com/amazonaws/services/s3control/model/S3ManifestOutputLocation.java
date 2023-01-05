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
 * Location details for where the generated manifest should be written.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3ManifestOutputLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ManifestOutputLocation implements Serializable, Cloneable {

    /**
     * <p>
     * The Account ID that owns the bucket the generated manifest is written to.
     * </p>
     */
    private String expectedManifestBucketOwner;
    /**
     * <p>
     * The bucket ARN the generated manifest should be written to.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Prefix identifying one or more objects to which the manifest applies.
     * </p>
     */
    private String manifestPrefix;
    /**
     * <p>
     * Specifies what encryption should be used when the generated manifest objects are written.
     * </p>
     */
    private GeneratedManifestEncryption manifestEncryption;
    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     */
    private String manifestFormat;

    /**
     * <p>
     * The Account ID that owns the bucket the generated manifest is written to.
     * </p>
     * 
     * @param expectedManifestBucketOwner
     *        The Account ID that owns the bucket the generated manifest is written to.
     */

    public void setExpectedManifestBucketOwner(String expectedManifestBucketOwner) {
        this.expectedManifestBucketOwner = expectedManifestBucketOwner;
    }

    /**
     * <p>
     * The Account ID that owns the bucket the generated manifest is written to.
     * </p>
     * 
     * @return The Account ID that owns the bucket the generated manifest is written to.
     */

    public String getExpectedManifestBucketOwner() {
        return this.expectedManifestBucketOwner;
    }

    /**
     * <p>
     * The Account ID that owns the bucket the generated manifest is written to.
     * </p>
     * 
     * @param expectedManifestBucketOwner
     *        The Account ID that owns the bucket the generated manifest is written to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ManifestOutputLocation withExpectedManifestBucketOwner(String expectedManifestBucketOwner) {
        setExpectedManifestBucketOwner(expectedManifestBucketOwner);
        return this;
    }

    /**
     * <p>
     * The bucket ARN the generated manifest should be written to.
     * </p>
     * 
     * @param bucket
     *        The bucket ARN the generated manifest should be written to.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket ARN the generated manifest should be written to.
     * </p>
     * 
     * @return The bucket ARN the generated manifest should be written to.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The bucket ARN the generated manifest should be written to.
     * </p>
     * 
     * @param bucket
     *        The bucket ARN the generated manifest should be written to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ManifestOutputLocation withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the manifest applies.
     * </p>
     * 
     * @param manifestPrefix
     *        Prefix identifying one or more objects to which the manifest applies.
     */

    public void setManifestPrefix(String manifestPrefix) {
        this.manifestPrefix = manifestPrefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the manifest applies.
     * </p>
     * 
     * @return Prefix identifying one or more objects to which the manifest applies.
     */

    public String getManifestPrefix() {
        return this.manifestPrefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the manifest applies.
     * </p>
     * 
     * @param manifestPrefix
     *        Prefix identifying one or more objects to which the manifest applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ManifestOutputLocation withManifestPrefix(String manifestPrefix) {
        setManifestPrefix(manifestPrefix);
        return this;
    }

    /**
     * <p>
     * Specifies what encryption should be used when the generated manifest objects are written.
     * </p>
     * 
     * @param manifestEncryption
     *        Specifies what encryption should be used when the generated manifest objects are written.
     */

    public void setManifestEncryption(GeneratedManifestEncryption manifestEncryption) {
        this.manifestEncryption = manifestEncryption;
    }

    /**
     * <p>
     * Specifies what encryption should be used when the generated manifest objects are written.
     * </p>
     * 
     * @return Specifies what encryption should be used when the generated manifest objects are written.
     */

    public GeneratedManifestEncryption getManifestEncryption() {
        return this.manifestEncryption;
    }

    /**
     * <p>
     * Specifies what encryption should be used when the generated manifest objects are written.
     * </p>
     * 
     * @param manifestEncryption
     *        Specifies what encryption should be used when the generated manifest objects are written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ManifestOutputLocation withManifestEncryption(GeneratedManifestEncryption manifestEncryption) {
        setManifestEncryption(manifestEncryption);
        return this;
    }

    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     * 
     * @param manifestFormat
     *        The format of the generated manifest.
     * @see GeneratedManifestFormat
     */

    public void setManifestFormat(String manifestFormat) {
        this.manifestFormat = manifestFormat;
    }

    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     * 
     * @return The format of the generated manifest.
     * @see GeneratedManifestFormat
     */

    public String getManifestFormat() {
        return this.manifestFormat;
    }

    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     * 
     * @param manifestFormat
     *        The format of the generated manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedManifestFormat
     */

    public S3ManifestOutputLocation withManifestFormat(String manifestFormat) {
        setManifestFormat(manifestFormat);
        return this;
    }

    /**
     * <p>
     * The format of the generated manifest.
     * </p>
     * 
     * @param manifestFormat
     *        The format of the generated manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedManifestFormat
     */

    public S3ManifestOutputLocation withManifestFormat(GeneratedManifestFormat manifestFormat) {
        this.manifestFormat = manifestFormat.toString();
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
        if (getExpectedManifestBucketOwner() != null)
            sb.append("ExpectedManifestBucketOwner: ").append(getExpectedManifestBucketOwner()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getManifestPrefix() != null)
            sb.append("ManifestPrefix: ").append(getManifestPrefix()).append(",");
        if (getManifestEncryption() != null)
            sb.append("ManifestEncryption: ").append(getManifestEncryption()).append(",");
        if (getManifestFormat() != null)
            sb.append("ManifestFormat: ").append(getManifestFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ManifestOutputLocation == false)
            return false;
        S3ManifestOutputLocation other = (S3ManifestOutputLocation) obj;
        if (other.getExpectedManifestBucketOwner() == null ^ this.getExpectedManifestBucketOwner() == null)
            return false;
        if (other.getExpectedManifestBucketOwner() != null && other.getExpectedManifestBucketOwner().equals(this.getExpectedManifestBucketOwner()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getManifestPrefix() == null ^ this.getManifestPrefix() == null)
            return false;
        if (other.getManifestPrefix() != null && other.getManifestPrefix().equals(this.getManifestPrefix()) == false)
            return false;
        if (other.getManifestEncryption() == null ^ this.getManifestEncryption() == null)
            return false;
        if (other.getManifestEncryption() != null && other.getManifestEncryption().equals(this.getManifestEncryption()) == false)
            return false;
        if (other.getManifestFormat() == null ^ this.getManifestFormat() == null)
            return false;
        if (other.getManifestFormat() != null && other.getManifestFormat().equals(this.getManifestFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpectedManifestBucketOwner() == null) ? 0 : getExpectedManifestBucketOwner().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getManifestPrefix() == null) ? 0 : getManifestPrefix().hashCode());
        hashCode = prime * hashCode + ((getManifestEncryption() == null) ? 0 : getManifestEncryption().hashCode());
        hashCode = prime * hashCode + ((getManifestFormat() == null) ? 0 : getManifestFormat().hashCode());
        return hashCode;
    }

    @Override
    public S3ManifestOutputLocation clone() {
        try {
            return (S3ManifestOutputLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
