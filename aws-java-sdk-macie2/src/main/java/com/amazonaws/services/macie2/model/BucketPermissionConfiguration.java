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
 * Provides information about the account-level and bucket-level permissions settings for an S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketPermissionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketPermissionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account-level permissions settings that apply to the bucket.
     * </p>
     */
    private AccountLevelPermissions accountLevelPermissions;
    /**
     * <p>
     * The bucket-level permissions settings for the bucket.
     * </p>
     */
    private BucketLevelPermissions bucketLevelPermissions;

    /**
     * <p>
     * The account-level permissions settings that apply to the bucket.
     * </p>
     * 
     * @param accountLevelPermissions
     *        The account-level permissions settings that apply to the bucket.
     */

    public void setAccountLevelPermissions(AccountLevelPermissions accountLevelPermissions) {
        this.accountLevelPermissions = accountLevelPermissions;
    }

    /**
     * <p>
     * The account-level permissions settings that apply to the bucket.
     * </p>
     * 
     * @return The account-level permissions settings that apply to the bucket.
     */

    public AccountLevelPermissions getAccountLevelPermissions() {
        return this.accountLevelPermissions;
    }

    /**
     * <p>
     * The account-level permissions settings that apply to the bucket.
     * </p>
     * 
     * @param accountLevelPermissions
     *        The account-level permissions settings that apply to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketPermissionConfiguration withAccountLevelPermissions(AccountLevelPermissions accountLevelPermissions) {
        setAccountLevelPermissions(accountLevelPermissions);
        return this;
    }

    /**
     * <p>
     * The bucket-level permissions settings for the bucket.
     * </p>
     * 
     * @param bucketLevelPermissions
     *        The bucket-level permissions settings for the bucket.
     */

    public void setBucketLevelPermissions(BucketLevelPermissions bucketLevelPermissions) {
        this.bucketLevelPermissions = bucketLevelPermissions;
    }

    /**
     * <p>
     * The bucket-level permissions settings for the bucket.
     * </p>
     * 
     * @return The bucket-level permissions settings for the bucket.
     */

    public BucketLevelPermissions getBucketLevelPermissions() {
        return this.bucketLevelPermissions;
    }

    /**
     * <p>
     * The bucket-level permissions settings for the bucket.
     * </p>
     * 
     * @param bucketLevelPermissions
     *        The bucket-level permissions settings for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketPermissionConfiguration withBucketLevelPermissions(BucketLevelPermissions bucketLevelPermissions) {
        setBucketLevelPermissions(bucketLevelPermissions);
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
        if (getAccountLevelPermissions() != null)
            sb.append("AccountLevelPermissions: ").append(getAccountLevelPermissions()).append(",");
        if (getBucketLevelPermissions() != null)
            sb.append("BucketLevelPermissions: ").append(getBucketLevelPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketPermissionConfiguration == false)
            return false;
        BucketPermissionConfiguration other = (BucketPermissionConfiguration) obj;
        if (other.getAccountLevelPermissions() == null ^ this.getAccountLevelPermissions() == null)
            return false;
        if (other.getAccountLevelPermissions() != null && other.getAccountLevelPermissions().equals(this.getAccountLevelPermissions()) == false)
            return false;
        if (other.getBucketLevelPermissions() == null ^ this.getBucketLevelPermissions() == null)
            return false;
        if (other.getBucketLevelPermissions() != null && other.getBucketLevelPermissions().equals(this.getBucketLevelPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountLevelPermissions() == null) ? 0 : getAccountLevelPermissions().hashCode());
        hashCode = prime * hashCode + ((getBucketLevelPermissions() == null) ? 0 : getBucketLevelPermissions().hashCode());
        return hashCode;
    }

    @Override
    public BucketPermissionConfiguration clone() {
        try {
            return (BucketPermissionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketPermissionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
