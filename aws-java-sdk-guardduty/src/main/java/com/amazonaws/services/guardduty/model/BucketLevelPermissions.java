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
 * Contains information about the bucket level permissions for the S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/BucketLevelPermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketLevelPermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information on how Access Control Policies are applied to the bucket.
     * </p>
     */
    private AccessControlList accessControlList;
    /**
     * <p>
     * Contains information on the bucket policies for the S3 bucket.
     * </p>
     */
    private BucketPolicy bucketPolicy;
    /**
     * <p>
     * Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
     * </p>
     */
    private BlockPublicAccess blockPublicAccess;

    /**
     * <p>
     * Contains information on how Access Control Policies are applied to the bucket.
     * </p>
     * 
     * @param accessControlList
     *        Contains information on how Access Control Policies are applied to the bucket.
     */

    public void setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
    }

    /**
     * <p>
     * Contains information on how Access Control Policies are applied to the bucket.
     * </p>
     * 
     * @return Contains information on how Access Control Policies are applied to the bucket.
     */

    public AccessControlList getAccessControlList() {
        return this.accessControlList;
    }

    /**
     * <p>
     * Contains information on how Access Control Policies are applied to the bucket.
     * </p>
     * 
     * @param accessControlList
     *        Contains information on how Access Control Policies are applied to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketLevelPermissions withAccessControlList(AccessControlList accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * <p>
     * Contains information on the bucket policies for the S3 bucket.
     * </p>
     * 
     * @param bucketPolicy
     *        Contains information on the bucket policies for the S3 bucket.
     */

    public void setBucketPolicy(BucketPolicy bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
    }

    /**
     * <p>
     * Contains information on the bucket policies for the S3 bucket.
     * </p>
     * 
     * @return Contains information on the bucket policies for the S3 bucket.
     */

    public BucketPolicy getBucketPolicy() {
        return this.bucketPolicy;
    }

    /**
     * <p>
     * Contains information on the bucket policies for the S3 bucket.
     * </p>
     * 
     * @param bucketPolicy
     *        Contains information on the bucket policies for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketLevelPermissions withBucketPolicy(BucketPolicy bucketPolicy) {
        setBucketPolicy(bucketPolicy);
        return this;
    }

    /**
     * <p>
     * Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
     * </p>
     * 
     * @param blockPublicAccess
     *        Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
     */

    public void setBlockPublicAccess(BlockPublicAccess blockPublicAccess) {
        this.blockPublicAccess = blockPublicAccess;
    }

    /**
     * <p>
     * Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
     * </p>
     * 
     * @return Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
     */

    public BlockPublicAccess getBlockPublicAccess() {
        return this.blockPublicAccess;
    }

    /**
     * <p>
     * Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
     * </p>
     * 
     * @param blockPublicAccess
     *        Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketLevelPermissions withBlockPublicAccess(BlockPublicAccess blockPublicAccess) {
        setBlockPublicAccess(blockPublicAccess);
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
        if (getAccessControlList() != null)
            sb.append("AccessControlList: ").append(getAccessControlList()).append(",");
        if (getBucketPolicy() != null)
            sb.append("BucketPolicy: ").append(getBucketPolicy()).append(",");
        if (getBlockPublicAccess() != null)
            sb.append("BlockPublicAccess: ").append(getBlockPublicAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketLevelPermissions == false)
            return false;
        BucketLevelPermissions other = (BucketLevelPermissions) obj;
        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null && other.getAccessControlList().equals(this.getAccessControlList()) == false)
            return false;
        if (other.getBucketPolicy() == null ^ this.getBucketPolicy() == null)
            return false;
        if (other.getBucketPolicy() != null && other.getBucketPolicy().equals(this.getBucketPolicy()) == false)
            return false;
        if (other.getBlockPublicAccess() == null ^ this.getBlockPublicAccess() == null)
            return false;
        if (other.getBlockPublicAccess() != null && other.getBlockPublicAccess().equals(this.getBlockPublicAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode + ((getBucketPolicy() == null) ? 0 : getBucketPolicy().hashCode());
        hashCode = prime * hashCode + ((getBlockPublicAccess() == null) ? 0 : getBlockPublicAccess().hashCode());
        return hashCode;
    }

    @Override
    public BucketLevelPermissions clone() {
        try {
            return (BucketLevelPermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.BucketLevelPermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
