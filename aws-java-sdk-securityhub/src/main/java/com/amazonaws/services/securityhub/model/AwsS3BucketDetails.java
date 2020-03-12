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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an Amazon S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     */
    private String ownerName;
    /**
     * <p>
     * The date and time when the S3 bucket was created.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     */
    private AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration;

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * 
     * @param ownerId
     *        The canonical user ID of the owner of the S3 bucket.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * 
     * @return The canonical user ID of the owner of the S3 bucket.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * 
     * @param ownerId
     *        The canonical user ID of the owner of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * 
     * @param ownerName
     *        The display name of the owner of the S3 bucket.
     */

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * 
     * @return The display name of the owner of the S3 bucket.
     */

    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * 
     * @param ownerName
     *        The display name of the owner of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withOwnerName(String ownerName) {
        setOwnerName(ownerName);
        return this;
    }

    /**
     * <p>
     * The date and time when the S3 bucket was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the S3 bucket was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the S3 bucket was created.
     * </p>
     * 
     * @return The date and time when the S3 bucket was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the S3 bucket was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the S3 bucket was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The encryption rules that are applied to the S3 bucket.
     */

    public void setServerSideEncryptionConfiguration(AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * 
     * @return The encryption rules that are applied to the S3 bucket.
     */

    public AwsS3BucketServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The encryption rules that are applied to the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withServerSideEncryptionConfiguration(AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getOwnerName() != null)
            sb.append("OwnerName: ").append(getOwnerName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketDetails == false)
            return false;
        AwsS3BucketDetails other = (AwsS3BucketDetails) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getOwnerName() == null ^ this.getOwnerName() == null)
            return false;
        if (other.getOwnerName() != null && other.getOwnerName().equals(this.getOwnerName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketDetails clone() {
        try {
            return (AwsS3BucketDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
