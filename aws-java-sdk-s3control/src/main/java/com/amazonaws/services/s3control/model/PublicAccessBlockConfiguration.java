/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the
 * configuration options in any combination. For more information about when Amazon S3 considers a bucket or object
 * public, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
 * >The Meaning of "Public"</a> in the Amazon Simple Storage Service Developer Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PublicAccessBlockConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicAccessBlockConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account. Setting
     * this element to <code>TRUE</code> causes the following behavior:
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
    private Boolean blockPublicAcls;
    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to
     * <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects that they
     * contain.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
     * from being set.
     * </p>
     */
    private Boolean ignorePublicAcls;
    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this element
     * to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     */
    private Boolean blockPublicPolicy;
    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting this
     * element to <code>TRUE</code> restricts access to buckets with public policies to only AWS services and authorized
     * users within this account.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
     * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     */
    private Boolean restrictPublicBuckets;

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account. Setting
     * this element to <code>TRUE</code> causes the following behavior:
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
     * 
     * @param blockPublicAcls
     *        Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account.
     *        Setting this element to <code>TRUE</code> causes the following behavior:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PUT Object calls fail if the request includes a public ACL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PUT Bucket calls fail if the request includes a public ACL.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Enabling this setting doesn't affect existing policies or ACLs.
     */

    public void setBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account. Setting
     * this element to <code>TRUE</code> causes the following behavior:
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
     * 
     * @return Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account.
     *         Setting this element to <code>TRUE</code> causes the following behavior:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Object calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Bucket calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Enabling this setting doesn't affect existing policies or ACLs.
     */

    public Boolean getBlockPublicAcls() {
        return this.blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account. Setting
     * this element to <code>TRUE</code> causes the following behavior:
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
     * 
     * @param blockPublicAcls
     *        Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account.
     *        Setting this element to <code>TRUE</code> causes the following behavior:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PUT Object calls fail if the request includes a public ACL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PUT Bucket calls fail if the request includes a public ACL.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Enabling this setting doesn't affect existing policies or ACLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicAccessBlockConfiguration withBlockPublicAcls(Boolean blockPublicAcls) {
        setBlockPublicAcls(blockPublicAcls);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account. Setting
     * this element to <code>TRUE</code> causes the following behavior:
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
     * 
     * @return Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account.
     *         Setting this element to <code>TRUE</code> causes the following behavior:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Object calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Bucket calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Enabling this setting doesn't affect existing policies or ACLs.
     */

    public Boolean isBlockPublicAcls() {
        return this.blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to
     * <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects that they
     * contain.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
     * from being set.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to
     *        <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects
     *        that they contain. </p>
     *        <p>
     *        Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public
     *        ACLs from being set.
     */

    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to
     * <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects that they
     * contain.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
     * from being set.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element
     *         to <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on buckets in this account and any
     *         objects that they contain. </p>
     *         <p>
     *         Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public
     *         ACLs from being set.
     */

    public Boolean getIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to
     * <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects that they
     * contain.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
     * from being set.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to
     *        <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects
     *        that they contain. </p>
     *        <p>
     *        Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public
     *        ACLs from being set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicAccessBlockConfiguration withIgnorePublicAcls(Boolean ignorePublicAcls) {
        setIgnorePublicAcls(ignorePublicAcls);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to
     * <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects that they
     * contain.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
     * from being set.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element
     *         to <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on buckets in this account and any
     *         objects that they contain. </p>
     *         <p>
     *         Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public
     *         ACLs from being set.
     */

    public Boolean isIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this element
     * to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this
     *        element to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket
     *        policy allows public access. </p>
     *        <p>
     *        Enabling this setting doesn't affect existing bucket policies.
     */

    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this element
     * to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this
     *         element to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified
     *         bucket policy allows public access. </p>
     *         <p>
     *         Enabling this setting doesn't affect existing bucket policies.
     */

    public Boolean getBlockPublicPolicy() {
        return this.blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this element
     * to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this
     *        element to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket
     *        policy allows public access. </p>
     *        <p>
     *        Enabling this setting doesn't affect existing bucket policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicAccessBlockConfiguration withBlockPublicPolicy(Boolean blockPublicPolicy) {
        setBlockPublicPolicy(blockPublicPolicy);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this element
     * to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this
     *         element to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified
     *         bucket policy allows public access. </p>
     *         <p>
     *         Enabling this setting doesn't affect existing bucket policies.
     */

    public Boolean isBlockPublicPolicy() {
        return this.blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting this
     * element to <code>TRUE</code> restricts access to buckets with public policies to only AWS services and authorized
     * users within this account.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
     * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting
     *        this element to <code>TRUE</code> restricts access to buckets with public policies to only AWS services
     *        and authorized users within this account.</p>
     *        <p>
     *        Enabling this setting doesn't affect previously stored bucket policies, except that public and
     *        cross-account access within any public bucket policy, including non-public delegation to specific
     *        accounts, is blocked.
     */

    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting this
     * element to <code>TRUE</code> restricts access to buckets with public policies to only AWS services and authorized
     * users within this account.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
     * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting
     *         this element to <code>TRUE</code> restricts access to buckets with public policies to only AWS services
     *         and authorized users within this account.</p>
     *         <p>
     *         Enabling this setting doesn't affect previously stored bucket policies, except that public and
     *         cross-account access within any public bucket policy, including non-public delegation to specific
     *         accounts, is blocked.
     */

    public Boolean getRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting this
     * element to <code>TRUE</code> restricts access to buckets with public policies to only AWS services and authorized
     * users within this account.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
     * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting
     *        this element to <code>TRUE</code> restricts access to buckets with public policies to only AWS services
     *        and authorized users within this account.</p>
     *        <p>
     *        Enabling this setting doesn't affect previously stored bucket policies, except that public and
     *        cross-account access within any public bucket policy, including non-public delegation to specific
     *        accounts, is blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicAccessBlockConfiguration withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        setRestrictPublicBuckets(restrictPublicBuckets);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting this
     * element to <code>TRUE</code> restricts access to buckets with public policies to only AWS services and authorized
     * users within this account.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
     * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting
     *         this element to <code>TRUE</code> restricts access to buckets with public policies to only AWS services
     *         and authorized users within this account.</p>
     *         <p>
     *         Enabling this setting doesn't affect previously stored bucket policies, except that public and
     *         cross-account access within any public bucket policy, including non-public delegation to specific
     *         accounts, is blocked.
     */

    public Boolean isRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
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
        if (getBlockPublicAcls() != null)
            sb.append("BlockPublicAcls: ").append(getBlockPublicAcls()).append(",");
        if (getIgnorePublicAcls() != null)
            sb.append("IgnorePublicAcls: ").append(getIgnorePublicAcls()).append(",");
        if (getBlockPublicPolicy() != null)
            sb.append("BlockPublicPolicy: ").append(getBlockPublicPolicy()).append(",");
        if (getRestrictPublicBuckets() != null)
            sb.append("RestrictPublicBuckets: ").append(getRestrictPublicBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicAccessBlockConfiguration == false)
            return false;
        PublicAccessBlockConfiguration other = (PublicAccessBlockConfiguration) obj;
        if (other.getBlockPublicAcls() == null ^ this.getBlockPublicAcls() == null)
            return false;
        if (other.getBlockPublicAcls() != null && other.getBlockPublicAcls().equals(this.getBlockPublicAcls()) == false)
            return false;
        if (other.getIgnorePublicAcls() == null ^ this.getIgnorePublicAcls() == null)
            return false;
        if (other.getIgnorePublicAcls() != null && other.getIgnorePublicAcls().equals(this.getIgnorePublicAcls()) == false)
            return false;
        if (other.getBlockPublicPolicy() == null ^ this.getBlockPublicPolicy() == null)
            return false;
        if (other.getBlockPublicPolicy() != null && other.getBlockPublicPolicy().equals(this.getBlockPublicPolicy()) == false)
            return false;
        if (other.getRestrictPublicBuckets() == null ^ this.getRestrictPublicBuckets() == null)
            return false;
        if (other.getRestrictPublicBuckets() != null && other.getRestrictPublicBuckets().equals(this.getRestrictPublicBuckets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockPublicAcls() == null) ? 0 : getBlockPublicAcls().hashCode());
        hashCode = prime * hashCode + ((getIgnorePublicAcls() == null) ? 0 : getIgnorePublicAcls().hashCode());
        hashCode = prime * hashCode + ((getBlockPublicPolicy() == null) ? 0 : getBlockPublicPolicy().hashCode());
        hashCode = prime * hashCode + ((getRestrictPublicBuckets() == null) ? 0 : getRestrictPublicBuckets().hashCode());
        return hashCode;
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
