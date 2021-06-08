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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Proposed access control configuration for an Amazon S3 bucket. You can propose a configuration for a new Amazon S3
 * bucket or an existing Amazon S3 bucket that you own by specifying the Amazon S3 bucket policy, bucket ACLs, bucket
 * BPA settings, and Amazon S3 access points attached to the bucket. If the configuration is for an existing Amazon S3
 * bucket and you do not specify the Amazon S3 bucket policy, the access preview uses the existing policy attached to
 * the bucket. If the access preview is for a new resource and you do not specify the Amazon S3 bucket policy, the
 * access preview assumes a bucket without a policy. To propose deletion of an existing bucket policy, you can specify
 * an empty string. For more information about bucket policy limits, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html">Bucket Policy Examples</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/S3BucketConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of Amazon S3 access points for the bucket.
     * </p>
     */
    private java.util.Map<String, S3AccessPointConfiguration> accessPoints;
    /**
     * <p>
     * The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per bucket. If the
     * proposed grant configuration is for an existing bucket, the access preview uses the proposed list of grant
     * configurations in place of the existing grants. Otherwise, the access preview uses the existing grants for the
     * bucket.
     * </p>
     */
    private java.util.List<S3BucketAclGrantConfiguration> bucketAclGrants;
    /**
     * <p>
     * The proposed bucket policy for the Amazon S3 bucket.
     * </p>
     */
    private String bucketPolicy;
    /**
     * <p>
     * The proposed block public access configuration for the Amazon S3 bucket.
     * </p>
     */
    private S3PublicAccessBlockConfiguration bucketPublicAccessBlock;

    /**
     * <p>
     * The configuration of Amazon S3 access points for the bucket.
     * </p>
     * 
     * @return The configuration of Amazon S3 access points for the bucket.
     */

    public java.util.Map<String, S3AccessPointConfiguration> getAccessPoints() {
        return accessPoints;
    }

    /**
     * <p>
     * The configuration of Amazon S3 access points for the bucket.
     * </p>
     * 
     * @param accessPoints
     *        The configuration of Amazon S3 access points for the bucket.
     */

    public void setAccessPoints(java.util.Map<String, S3AccessPointConfiguration> accessPoints) {
        this.accessPoints = accessPoints;
    }

    /**
     * <p>
     * The configuration of Amazon S3 access points for the bucket.
     * </p>
     * 
     * @param accessPoints
     *        The configuration of Amazon S3 access points for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration withAccessPoints(java.util.Map<String, S3AccessPointConfiguration> accessPoints) {
        setAccessPoints(accessPoints);
        return this;
    }

    /**
     * Add a single AccessPoints entry
     *
     * @see S3BucketConfiguration#withAccessPoints
     * @returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration addAccessPointsEntry(String key, S3AccessPointConfiguration value) {
        if (null == this.accessPoints) {
            this.accessPoints = new java.util.HashMap<String, S3AccessPointConfiguration>();
        }
        if (this.accessPoints.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.accessPoints.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AccessPoints.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration clearAccessPointsEntries() {
        this.accessPoints = null;
        return this;
    }

    /**
     * <p>
     * The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per bucket. If the
     * proposed grant configuration is for an existing bucket, the access preview uses the proposed list of grant
     * configurations in place of the existing grants. Otherwise, the access preview uses the existing grants for the
     * bucket.
     * </p>
     * 
     * @return The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per
     *         bucket. If the proposed grant configuration is for an existing bucket, the access preview uses the
     *         proposed list of grant configurations in place of the existing grants. Otherwise, the access preview uses
     *         the existing grants for the bucket.
     */

    public java.util.List<S3BucketAclGrantConfiguration> getBucketAclGrants() {
        return bucketAclGrants;
    }

    /**
     * <p>
     * The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per bucket. If the
     * proposed grant configuration is for an existing bucket, the access preview uses the proposed list of grant
     * configurations in place of the existing grants. Otherwise, the access preview uses the existing grants for the
     * bucket.
     * </p>
     * 
     * @param bucketAclGrants
     *        The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per bucket.
     *        If the proposed grant configuration is for an existing bucket, the access preview uses the proposed list
     *        of grant configurations in place of the existing grants. Otherwise, the access preview uses the existing
     *        grants for the bucket.
     */

    public void setBucketAclGrants(java.util.Collection<S3BucketAclGrantConfiguration> bucketAclGrants) {
        if (bucketAclGrants == null) {
            this.bucketAclGrants = null;
            return;
        }

        this.bucketAclGrants = new java.util.ArrayList<S3BucketAclGrantConfiguration>(bucketAclGrants);
    }

    /**
     * <p>
     * The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per bucket. If the
     * proposed grant configuration is for an existing bucket, the access preview uses the proposed list of grant
     * configurations in place of the existing grants. Otherwise, the access preview uses the existing grants for the
     * bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBucketAclGrants(java.util.Collection)} or {@link #withBucketAclGrants(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param bucketAclGrants
     *        The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per bucket.
     *        If the proposed grant configuration is for an existing bucket, the access preview uses the proposed list
     *        of grant configurations in place of the existing grants. Otherwise, the access preview uses the existing
     *        grants for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration withBucketAclGrants(S3BucketAclGrantConfiguration... bucketAclGrants) {
        if (this.bucketAclGrants == null) {
            setBucketAclGrants(new java.util.ArrayList<S3BucketAclGrantConfiguration>(bucketAclGrants.length));
        }
        for (S3BucketAclGrantConfiguration ele : bucketAclGrants) {
            this.bucketAclGrants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per bucket. If the
     * proposed grant configuration is for an existing bucket, the access preview uses the proposed list of grant
     * configurations in place of the existing grants. Otherwise, the access preview uses the existing grants for the
     * bucket.
     * </p>
     * 
     * @param bucketAclGrants
     *        The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per bucket.
     *        If the proposed grant configuration is for an existing bucket, the access preview uses the proposed list
     *        of grant configurations in place of the existing grants. Otherwise, the access preview uses the existing
     *        grants for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration withBucketAclGrants(java.util.Collection<S3BucketAclGrantConfiguration> bucketAclGrants) {
        setBucketAclGrants(bucketAclGrants);
        return this;
    }

    /**
     * <p>
     * The proposed bucket policy for the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketPolicy
     *        The proposed bucket policy for the Amazon S3 bucket.
     */

    public void setBucketPolicy(String bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
    }

    /**
     * <p>
     * The proposed bucket policy for the Amazon S3 bucket.
     * </p>
     * 
     * @return The proposed bucket policy for the Amazon S3 bucket.
     */

    public String getBucketPolicy() {
        return this.bucketPolicy;
    }

    /**
     * <p>
     * The proposed bucket policy for the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketPolicy
     *        The proposed bucket policy for the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration withBucketPolicy(String bucketPolicy) {
        setBucketPolicy(bucketPolicy);
        return this;
    }

    /**
     * <p>
     * The proposed block public access configuration for the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketPublicAccessBlock
     *        The proposed block public access configuration for the Amazon S3 bucket.
     */

    public void setBucketPublicAccessBlock(S3PublicAccessBlockConfiguration bucketPublicAccessBlock) {
        this.bucketPublicAccessBlock = bucketPublicAccessBlock;
    }

    /**
     * <p>
     * The proposed block public access configuration for the Amazon S3 bucket.
     * </p>
     * 
     * @return The proposed block public access configuration for the Amazon S3 bucket.
     */

    public S3PublicAccessBlockConfiguration getBucketPublicAccessBlock() {
        return this.bucketPublicAccessBlock;
    }

    /**
     * <p>
     * The proposed block public access configuration for the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketPublicAccessBlock
     *        The proposed block public access configuration for the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration withBucketPublicAccessBlock(S3PublicAccessBlockConfiguration bucketPublicAccessBlock) {
        setBucketPublicAccessBlock(bucketPublicAccessBlock);
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
        if (getAccessPoints() != null)
            sb.append("AccessPoints: ").append(getAccessPoints()).append(",");
        if (getBucketAclGrants() != null)
            sb.append("BucketAclGrants: ").append(getBucketAclGrants()).append(",");
        if (getBucketPolicy() != null)
            sb.append("BucketPolicy: ").append(getBucketPolicy()).append(",");
        if (getBucketPublicAccessBlock() != null)
            sb.append("BucketPublicAccessBlock: ").append(getBucketPublicAccessBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketConfiguration == false)
            return false;
        S3BucketConfiguration other = (S3BucketConfiguration) obj;
        if (other.getAccessPoints() == null ^ this.getAccessPoints() == null)
            return false;
        if (other.getAccessPoints() != null && other.getAccessPoints().equals(this.getAccessPoints()) == false)
            return false;
        if (other.getBucketAclGrants() == null ^ this.getBucketAclGrants() == null)
            return false;
        if (other.getBucketAclGrants() != null && other.getBucketAclGrants().equals(this.getBucketAclGrants()) == false)
            return false;
        if (other.getBucketPolicy() == null ^ this.getBucketPolicy() == null)
            return false;
        if (other.getBucketPolicy() != null && other.getBucketPolicy().equals(this.getBucketPolicy()) == false)
            return false;
        if (other.getBucketPublicAccessBlock() == null ^ this.getBucketPublicAccessBlock() == null)
            return false;
        if (other.getBucketPublicAccessBlock() != null && other.getBucketPublicAccessBlock().equals(this.getBucketPublicAccessBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPoints() == null) ? 0 : getAccessPoints().hashCode());
        hashCode = prime * hashCode + ((getBucketAclGrants() == null) ? 0 : getBucketAclGrants().hashCode());
        hashCode = prime * hashCode + ((getBucketPolicy() == null) ? 0 : getBucketPolicy().hashCode());
        hashCode = prime * hashCode + ((getBucketPublicAccessBlock() == null) ? 0 : getBucketPublicAccessBlock().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketConfiguration clone() {
        try {
            return (S3BucketConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.S3BucketConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
