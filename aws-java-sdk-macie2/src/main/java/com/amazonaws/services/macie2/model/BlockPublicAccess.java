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
 * Provides information about the block public access settings for an S3 bucket. These settings can apply to a bucket at
 * the account level or bucket level. For detailed information about each setting, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-control-block-public-access.html">Blocking public
 * access to your Amazon S3 storage</a> in the <i>Amazon Simple Storage Service User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BlockPublicAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockPublicAccess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the bucket.
     * </p>
     */
    private Boolean blockPublicAcls;
    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     */
    private Boolean blockPublicPolicy;
    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
     * </p>
     */
    private Boolean ignorePublicAcls;
    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the bucket.
     * </p>
     */
    private Boolean restrictPublicBuckets;

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the bucket.
     * </p>
     * 
     * @param blockPublicAcls
     *        Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the
     *        bucket.
     */

    public void setBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the
     *         bucket.
     */

    public Boolean getBlockPublicAcls() {
        return this.blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the bucket.
     * </p>
     * 
     * @param blockPublicAcls
     *        Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the
     *        bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccess withBlockPublicAcls(Boolean blockPublicAcls) {
        setBlockPublicAcls(blockPublicAcls);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the
     *         bucket.
     */

    public Boolean isBlockPublicAcls() {
        return this.blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     */

    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     */

    public Boolean getBlockPublicPolicy() {
        return this.blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccess withBlockPublicPolicy(Boolean blockPublicPolicy) {
        setBlockPublicPolicy(blockPublicPolicy);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     */

    public Boolean isBlockPublicPolicy() {
        return this.blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
     */

    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
     */

    public Boolean getIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccess withIgnorePublicAcls(Boolean ignorePublicAcls) {
        setIgnorePublicAcls(ignorePublicAcls);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
     */

    public Boolean isIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the bucket.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Specifies whether Amazon S3 restricts public bucket policies for the bucket.
     */

    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 restricts public bucket policies for the bucket.
     */

    public Boolean getRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the bucket.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Specifies whether Amazon S3 restricts public bucket policies for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccess withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        setRestrictPublicBuckets(restrictPublicBuckets);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 restricts public bucket policies for the bucket.
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
        if (getBlockPublicPolicy() != null)
            sb.append("BlockPublicPolicy: ").append(getBlockPublicPolicy()).append(",");
        if (getIgnorePublicAcls() != null)
            sb.append("IgnorePublicAcls: ").append(getIgnorePublicAcls()).append(",");
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

        if (obj instanceof BlockPublicAccess == false)
            return false;
        BlockPublicAccess other = (BlockPublicAccess) obj;
        if (other.getBlockPublicAcls() == null ^ this.getBlockPublicAcls() == null)
            return false;
        if (other.getBlockPublicAcls() != null && other.getBlockPublicAcls().equals(this.getBlockPublicAcls()) == false)
            return false;
        if (other.getBlockPublicPolicy() == null ^ this.getBlockPublicPolicy() == null)
            return false;
        if (other.getBlockPublicPolicy() != null && other.getBlockPublicPolicy().equals(this.getBlockPublicPolicy()) == false)
            return false;
        if (other.getIgnorePublicAcls() == null ^ this.getIgnorePublicAcls() == null)
            return false;
        if (other.getIgnorePublicAcls() != null && other.getIgnorePublicAcls().equals(this.getIgnorePublicAcls()) == false)
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
        hashCode = prime * hashCode + ((getBlockPublicPolicy() == null) ? 0 : getBlockPublicPolicy().hashCode());
        hashCode = prime * hashCode + ((getIgnorePublicAcls() == null) ? 0 : getIgnorePublicAcls().hashCode());
        hashCode = prime * hashCode + ((getRestrictPublicBuckets() == null) ? 0 : getRestrictPublicBuckets().hashCode());
        return hashCode;
    }

    @Override
    public BlockPublicAccess clone() {
        try {
            return (BlockPublicAccess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BlockPublicAccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
