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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Outposts bucket requested.
     * </p>
     */
    private String bucket;
    /** <p/> */
    private Boolean publicAccessBlockEnabled;
    /**
     * <p>
     * The creation date of the Outposts bucket.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The Outposts bucket requested.
     * </p>
     * 
     * @param bucket
     *        The Outposts bucket requested.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Outposts bucket requested.
     * </p>
     * 
     * @return The Outposts bucket requested.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Outposts bucket requested.
     * </p>
     * 
     * @param bucket
     *        The Outposts bucket requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketResult withBucket(String bucket) {
        setBucket(bucket);
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

    public GetBucketResult withPublicAccessBlockEnabled(Boolean publicAccessBlockEnabled) {
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
     * The creation date of the Outposts bucket.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the Outposts bucket.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of the Outposts bucket.
     * </p>
     * 
     * @return The creation date of the Outposts bucket.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date of the Outposts bucket.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getPublicAccessBlockEnabled() != null)
            sb.append("PublicAccessBlockEnabled: ").append(getPublicAccessBlockEnabled()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketResult == false)
            return false;
        GetBucketResult other = (GetBucketResult) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPublicAccessBlockEnabled() == null ^ this.getPublicAccessBlockEnabled() == null)
            return false;
        if (other.getPublicAccessBlockEnabled() != null && other.getPublicAccessBlockEnabled().equals(this.getPublicAccessBlockEnabled()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlockEnabled() == null) ? 0 : getPublicAccessBlockEnabled().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketResult clone() {
        try {
            return (GetBucketResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
