/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The details of an AWS S3 Bucket.
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
            sb.append("OwnerName: ").append(getOwnerName());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());
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
