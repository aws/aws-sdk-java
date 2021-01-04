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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The container for the regional bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/RegionalBucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionalBucket implements Serializable, Cloneable {

    /** <p/> */
    private String bucket;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the regional bucket.
     * </p>
     */
    private String bucketArn;
    /** <p/> */
    private Boolean publicAccessBlockEnabled;
    /**
     * <p>
     * The creation date of the regional bucket
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The AWS Outposts ID of the regional bucket.
     * </p>
     */
    private String outpostId;

    /**
     * <p/>
     * 
     * @param bucket
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p/>
     * 
     * @param bucket
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionalBucket withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the regional bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) for the regional bucket.
     */

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the regional bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the regional bucket.
     */

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the regional bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) for the regional bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionalBucket withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param publicAccessBlockEnabled
     */

    public void setPublicAccessBlockEnabled(Boolean publicAccessBlockEnabled) {
        this.publicAccessBlockEnabled = publicAccessBlockEnabled;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getPublicAccessBlockEnabled() {
        return this.publicAccessBlockEnabled;
    }

    /**
     * <p/>
     * 
     * @param publicAccessBlockEnabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionalBucket withPublicAccessBlockEnabled(Boolean publicAccessBlockEnabled) {
        setPublicAccessBlockEnabled(publicAccessBlockEnabled);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isPublicAccessBlockEnabled() {
        return this.publicAccessBlockEnabled;
    }

    /**
     * <p>
     * The creation date of the regional bucket
     * </p>
     * 
     * @param creationDate
     *        The creation date of the regional bucket
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of the regional bucket
     * </p>
     * 
     * @return The creation date of the regional bucket
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date of the regional bucket
     * </p>
     * 
     * @param creationDate
     *        The creation date of the regional bucket
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionalBucket withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The AWS Outposts ID of the regional bucket.
     * </p>
     * 
     * @param outpostId
     *        The AWS Outposts ID of the regional bucket.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The AWS Outposts ID of the regional bucket.
     * </p>
     * 
     * @return The AWS Outposts ID of the regional bucket.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The AWS Outposts ID of the regional bucket.
     * </p>
     * 
     * @param outpostId
     *        The AWS Outposts ID of the regional bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionalBucket withOutpostId(String outpostId) {
        setOutpostId(outpostId);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getBucketArn() != null)
            sb.append("BucketArn: ").append(getBucketArn()).append(",");
        if (getPublicAccessBlockEnabled() != null)
            sb.append("PublicAccessBlockEnabled: ").append(getPublicAccessBlockEnabled()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionalBucket == false)
            return false;
        RegionalBucket other = (RegionalBucket) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getPublicAccessBlockEnabled() == null ^ this.getPublicAccessBlockEnabled() == null)
            return false;
        if (other.getPublicAccessBlockEnabled() != null && other.getPublicAccessBlockEnabled().equals(this.getPublicAccessBlockEnabled()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlockEnabled() == null) ? 0 : getPublicAccessBlockEnabled().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        return hashCode;
    }

    @Override
    public RegionalBucket clone() {
        try {
            return (RegionalBucket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
