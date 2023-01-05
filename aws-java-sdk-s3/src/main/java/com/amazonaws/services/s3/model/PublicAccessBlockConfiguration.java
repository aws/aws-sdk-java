/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration
 * options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
 * >The Meaning of "Public"</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
 * </p>
 */
public class PublicAccessBlockConfiguration implements Serializable, Cloneable {

    private Boolean blockPublicAcls;
    private Boolean ignorePublicAcls;
    private Boolean blockPublicPolicy;
    private Boolean restrictPublicBuckets;

    /**
     * <p>
     * Returns whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this
     * bucket. Setting this element to <code>TRUE</code> causes the following behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Object calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Bucket calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Enabling this setting doesn't affect existing policies or ACLs.
     * </p>
     */
    public Boolean getBlockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this
     * bucket. Setting this element to <code>TRUE</code> causes the following behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Object calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Bucket calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Enabling this setting doesn't affect existing policies or ACLs.
     * </p>
     */
    public void setBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this
     * bucket. Setting this element to <code>TRUE</code> causes the following behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Object calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Bucket calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Enabling this setting doesn't affect existing policies or ACLs.
     * </p>
     */
    public PublicAccessBlockConfiguration withBlockPublicAcls(Boolean blockPublicAcls) {
        setBlockPublicAcls(blockPublicAcls);
        return this;
    }

    /**
     * <p>
     * Returns whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this
     * element to <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on this bucket and objects in this
     * bucket.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
     * from being set.
     * </p>
     */
    public Boolean getIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this
     * element to <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on this bucket and objects in this
     * bucket.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
     * from being set.
     * </p>
     */
    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this
     * element to <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on this bucket and objects in this
     * bucket.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
     * from being set.
     * </p>
     */
    public PublicAccessBlockConfiguration withIgnorePublicAcls(Boolean ignorePublicAcls) {
        setIgnorePublicAcls(ignorePublicAcls);
        return this;
    }

    /**
     * <p>
     * Returns whether Amazon S3 should block public bucket policies for this bucket. Setting this element to
     * <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     */
    public Boolean getBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to
     * <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     */
    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to
     * <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     */
    public PublicAccessBlockConfiguration withBlockPublicPolicy(Boolean blockPublicPolicy) {
        setBlockPublicPolicy(blockPublicPolicy);
        return this;
    }

    /**
     * <p>
     * Returns whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to
     * <code>TRUE</code> restricts access to this bucket to only Amazon Web Services service principals and authorized users within this
     * account if the bucket has a public policy.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
     * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     */
    public Boolean getRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to
     * <code>TRUE</code> restricts access to this bucket to only Amazon Web Services service principals and authorized users within this
     * account if the bucket has a public policy.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
     * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     */
    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to
     * <code>TRUE</code> restricts access to this bucket to only Amazon Web Services service principals and authorized users within this
     * account if the bucket has a public policy.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
     * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     */
    public PublicAccessBlockConfiguration withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        setRestrictPublicBuckets(restrictPublicBuckets);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final PublicAccessBlockConfiguration that = (PublicAccessBlockConfiguration) o;

        if (blockPublicAcls != null ? !blockPublicAcls.equals(that.blockPublicAcls) : that.blockPublicAcls != null) {
            return false;
        }
        if (ignorePublicAcls != null ? !ignorePublicAcls.equals(that.ignorePublicAcls) : that.ignorePublicAcls != null) {
            return false;
        }
        if (blockPublicPolicy != null ? !blockPublicPolicy.equals(that.blockPublicPolicy) : that.blockPublicPolicy != null) {
            return false;
        }
        return restrictPublicBuckets != null ? restrictPublicBuckets.equals(that.restrictPublicBuckets) : that.restrictPublicBuckets == null;
    }

    @Override
    public int hashCode() {
        int result = blockPublicAcls != null ? blockPublicAcls.hashCode() : 0;
        result = 31 * result + (ignorePublicAcls != null ? ignorePublicAcls.hashCode() : 0);
        result = 31 * result + (blockPublicPolicy != null ? blockPublicPolicy.hashCode() : 0);
        result = 31 * result + (restrictPublicBuckets != null ? restrictPublicBuckets.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBlockPublicAcls() != null) {
            sb.append("BlockPublicAcls: ").append(getBlockPublicAcls()).append(",");
        }
        if (getIgnorePublicAcls() != null) {
            sb.append("IgnorePublicAcls: ").append(getIgnorePublicAcls()).append(",");
        }
        if (getBlockPublicPolicy() != null) {
            sb.append("BlockPublicPolicy: ").append(getBlockPublicPolicy()).append(",");
        }
        if (getRestrictPublicBuckets() != null) {
            sb.append("RestrictPublicBuckets: ").append(getRestrictPublicBuckets()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public PublicAccessBlockConfiguration clone() {
        try {
            return (PublicAccessBlockConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
