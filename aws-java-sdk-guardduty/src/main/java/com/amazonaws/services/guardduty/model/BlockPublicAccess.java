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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on how the bucker owner's S3 Block Public Access settings are being applied to the S3 bucket.
 * See <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html">S3 Block Public
 * Access</a> for more information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/BlockPublicAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockPublicAccess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>IgnorePublicAcls</code>.
     * </p>
     */
    private Boolean ignorePublicAcls;
    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>RestrictPublicBuckets</code>.
     * </p>
     */
    private Boolean restrictPublicBuckets;
    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicAcls</code>.
     * </p>
     */
    private Boolean blockPublicAcls;
    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicPolicy</code>.
     * </p>
     */
    private Boolean blockPublicPolicy;

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>IgnorePublicAcls</code>.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Indicates if S3 Block Public Access is set to <code>IgnorePublicAcls</code>.
     */

    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>IgnorePublicAcls</code>.
     * </p>
     * 
     * @return Indicates if S3 Block Public Access is set to <code>IgnorePublicAcls</code>.
     */

    public Boolean getIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>IgnorePublicAcls</code>.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Indicates if S3 Block Public Access is set to <code>IgnorePublicAcls</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccess withIgnorePublicAcls(Boolean ignorePublicAcls) {
        setIgnorePublicAcls(ignorePublicAcls);
        return this;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>IgnorePublicAcls</code>.
     * </p>
     * 
     * @return Indicates if S3 Block Public Access is set to <code>IgnorePublicAcls</code>.
     */

    public Boolean isIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>RestrictPublicBuckets</code>.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Indicates if S3 Block Public Access is set to <code>RestrictPublicBuckets</code>.
     */

    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>RestrictPublicBuckets</code>.
     * </p>
     * 
     * @return Indicates if S3 Block Public Access is set to <code>RestrictPublicBuckets</code>.
     */

    public Boolean getRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>RestrictPublicBuckets</code>.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Indicates if S3 Block Public Access is set to <code>RestrictPublicBuckets</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccess withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        setRestrictPublicBuckets(restrictPublicBuckets);
        return this;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>RestrictPublicBuckets</code>.
     * </p>
     * 
     * @return Indicates if S3 Block Public Access is set to <code>RestrictPublicBuckets</code>.
     */

    public Boolean isRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicAcls</code>.
     * </p>
     * 
     * @param blockPublicAcls
     *        Indicates if S3 Block Public Access is set to <code>BlockPublicAcls</code>.
     */

    public void setBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicAcls</code>.
     * </p>
     * 
     * @return Indicates if S3 Block Public Access is set to <code>BlockPublicAcls</code>.
     */

    public Boolean getBlockPublicAcls() {
        return this.blockPublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicAcls</code>.
     * </p>
     * 
     * @param blockPublicAcls
     *        Indicates if S3 Block Public Access is set to <code>BlockPublicAcls</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccess withBlockPublicAcls(Boolean blockPublicAcls) {
        setBlockPublicAcls(blockPublicAcls);
        return this;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicAcls</code>.
     * </p>
     * 
     * @return Indicates if S3 Block Public Access is set to <code>BlockPublicAcls</code>.
     */

    public Boolean isBlockPublicAcls() {
        return this.blockPublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicPolicy</code>.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Indicates if S3 Block Public Access is set to <code>BlockPublicPolicy</code>.
     */

    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicPolicy</code>.
     * </p>
     * 
     * @return Indicates if S3 Block Public Access is set to <code>BlockPublicPolicy</code>.
     */

    public Boolean getBlockPublicPolicy() {
        return this.blockPublicPolicy;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicPolicy</code>.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Indicates if S3 Block Public Access is set to <code>BlockPublicPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccess withBlockPublicPolicy(Boolean blockPublicPolicy) {
        setBlockPublicPolicy(blockPublicPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to <code>BlockPublicPolicy</code>.
     * </p>
     * 
     * @return Indicates if S3 Block Public Access is set to <code>BlockPublicPolicy</code>.
     */

    public Boolean isBlockPublicPolicy() {
        return this.blockPublicPolicy;
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
        if (getIgnorePublicAcls() != null)
            sb.append("IgnorePublicAcls: ").append(getIgnorePublicAcls()).append(",");
        if (getRestrictPublicBuckets() != null)
            sb.append("RestrictPublicBuckets: ").append(getRestrictPublicBuckets()).append(",");
        if (getBlockPublicAcls() != null)
            sb.append("BlockPublicAcls: ").append(getBlockPublicAcls()).append(",");
        if (getBlockPublicPolicy() != null)
            sb.append("BlockPublicPolicy: ").append(getBlockPublicPolicy());
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
        if (other.getIgnorePublicAcls() == null ^ this.getIgnorePublicAcls() == null)
            return false;
        if (other.getIgnorePublicAcls() != null && other.getIgnorePublicAcls().equals(this.getIgnorePublicAcls()) == false)
            return false;
        if (other.getRestrictPublicBuckets() == null ^ this.getRestrictPublicBuckets() == null)
            return false;
        if (other.getRestrictPublicBuckets() != null && other.getRestrictPublicBuckets().equals(this.getRestrictPublicBuckets()) == false)
            return false;
        if (other.getBlockPublicAcls() == null ^ this.getBlockPublicAcls() == null)
            return false;
        if (other.getBlockPublicAcls() != null && other.getBlockPublicAcls().equals(this.getBlockPublicAcls()) == false)
            return false;
        if (other.getBlockPublicPolicy() == null ^ this.getBlockPublicPolicy() == null)
            return false;
        if (other.getBlockPublicPolicy() != null && other.getBlockPublicPolicy().equals(this.getBlockPublicPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIgnorePublicAcls() == null) ? 0 : getIgnorePublicAcls().hashCode());
        hashCode = prime * hashCode + ((getRestrictPublicBuckets() == null) ? 0 : getRestrictPublicBuckets().hashCode());
        hashCode = prime * hashCode + ((getBlockPublicAcls() == null) ? 0 : getBlockPublicAcls().hashCode());
        hashCode = prime * hashCode + ((getBlockPublicPolicy() == null) ? 0 : getBlockPublicPolicy().hashCode());
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
        com.amazonaws.services.guardduty.model.transform.BlockPublicAccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
