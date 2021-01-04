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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the number of S3 buckets that are publicly accessible based on a combination of
 * permissions settings for each bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketCountByEffectivePermission"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketCountByEffectivePermission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of buckets that allow the general public to have read or write access to the bucket.
     * </p>
     */
    private Long publiclyAccessible;
    /**
     * <p>
     * The total number of buckets that allow the general public to have read access to the bucket.
     * </p>
     */
    private Long publiclyReadable;
    /**
     * <p>
     * The total number of buckets that allow the general public to have write access to the bucket.
     * </p>
     */
    private Long publiclyWritable;
    /**
     * <p>
     * The total number of buckets that Amazon Macie wasn't able to evaluate permissions settings for. Macie can't
     * determine whether these buckets are publicly accessible.
     * </p>
     */
    private Long unknown;

    /**
     * <p>
     * The total number of buckets that allow the general public to have read or write access to the bucket.
     * </p>
     * 
     * @param publiclyAccessible
     *        The total number of buckets that allow the general public to have read or write access to the bucket.
     */

    public void setPubliclyAccessible(Long publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * The total number of buckets that allow the general public to have read or write access to the bucket.
     * </p>
     * 
     * @return The total number of buckets that allow the general public to have read or write access to the bucket.
     */

    public Long getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The total number of buckets that allow the general public to have read or write access to the bucket.
     * </p>
     * 
     * @param publiclyAccessible
     *        The total number of buckets that allow the general public to have read or write access to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEffectivePermission withPubliclyAccessible(Long publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that allow the general public to have read access to the bucket.
     * </p>
     * 
     * @param publiclyReadable
     *        The total number of buckets that allow the general public to have read access to the bucket.
     */

    public void setPubliclyReadable(Long publiclyReadable) {
        this.publiclyReadable = publiclyReadable;
    }

    /**
     * <p>
     * The total number of buckets that allow the general public to have read access to the bucket.
     * </p>
     * 
     * @return The total number of buckets that allow the general public to have read access to the bucket.
     */

    public Long getPubliclyReadable() {
        return this.publiclyReadable;
    }

    /**
     * <p>
     * The total number of buckets that allow the general public to have read access to the bucket.
     * </p>
     * 
     * @param publiclyReadable
     *        The total number of buckets that allow the general public to have read access to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEffectivePermission withPubliclyReadable(Long publiclyReadable) {
        setPubliclyReadable(publiclyReadable);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that allow the general public to have write access to the bucket.
     * </p>
     * 
     * @param publiclyWritable
     *        The total number of buckets that allow the general public to have write access to the bucket.
     */

    public void setPubliclyWritable(Long publiclyWritable) {
        this.publiclyWritable = publiclyWritable;
    }

    /**
     * <p>
     * The total number of buckets that allow the general public to have write access to the bucket.
     * </p>
     * 
     * @return The total number of buckets that allow the general public to have write access to the bucket.
     */

    public Long getPubliclyWritable() {
        return this.publiclyWritable;
    }

    /**
     * <p>
     * The total number of buckets that allow the general public to have write access to the bucket.
     * </p>
     * 
     * @param publiclyWritable
     *        The total number of buckets that allow the general public to have write access to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEffectivePermission withPubliclyWritable(Long publiclyWritable) {
        setPubliclyWritable(publiclyWritable);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that Amazon Macie wasn't able to evaluate permissions settings for. Macie can't
     * determine whether these buckets are publicly accessible.
     * </p>
     * 
     * @param unknown
     *        The total number of buckets that Amazon Macie wasn't able to evaluate permissions settings for. Macie
     *        can't determine whether these buckets are publicly accessible.
     */

    public void setUnknown(Long unknown) {
        this.unknown = unknown;
    }

    /**
     * <p>
     * The total number of buckets that Amazon Macie wasn't able to evaluate permissions settings for. Macie can't
     * determine whether these buckets are publicly accessible.
     * </p>
     * 
     * @return The total number of buckets that Amazon Macie wasn't able to evaluate permissions settings for. Macie
     *         can't determine whether these buckets are publicly accessible.
     */

    public Long getUnknown() {
        return this.unknown;
    }

    /**
     * <p>
     * The total number of buckets that Amazon Macie wasn't able to evaluate permissions settings for. Macie can't
     * determine whether these buckets are publicly accessible.
     * </p>
     * 
     * @param unknown
     *        The total number of buckets that Amazon Macie wasn't able to evaluate permissions settings for. Macie
     *        can't determine whether these buckets are publicly accessible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEffectivePermission withUnknown(Long unknown) {
        setUnknown(unknown);
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
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getPubliclyReadable() != null)
            sb.append("PubliclyReadable: ").append(getPubliclyReadable()).append(",");
        if (getPubliclyWritable() != null)
            sb.append("PubliclyWritable: ").append(getPubliclyWritable()).append(",");
        if (getUnknown() != null)
            sb.append("Unknown: ").append(getUnknown());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketCountByEffectivePermission == false)
            return false;
        BucketCountByEffectivePermission other = (BucketCountByEffectivePermission) obj;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getPubliclyReadable() == null ^ this.getPubliclyReadable() == null)
            return false;
        if (other.getPubliclyReadable() != null && other.getPubliclyReadable().equals(this.getPubliclyReadable()) == false)
            return false;
        if (other.getPubliclyWritable() == null ^ this.getPubliclyWritable() == null)
            return false;
        if (other.getPubliclyWritable() != null && other.getPubliclyWritable().equals(this.getPubliclyWritable()) == false)
            return false;
        if (other.getUnknown() == null ^ this.getUnknown() == null)
            return false;
        if (other.getUnknown() != null && other.getUnknown().equals(this.getUnknown()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getPubliclyReadable() == null) ? 0 : getPubliclyReadable().hashCode());
        hashCode = prime * hashCode + ((getPubliclyWritable() == null) ? 0 : getPubliclyWritable().hashCode());
        hashCode = prime * hashCode + ((getUnknown() == null) ? 0 : getUnknown().hashCode());
        return hashCode;
    }

    @Override
    public BucketCountByEffectivePermission clone() {
        try {
            return (BucketCountByEffectivePermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketCountByEffectivePermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
