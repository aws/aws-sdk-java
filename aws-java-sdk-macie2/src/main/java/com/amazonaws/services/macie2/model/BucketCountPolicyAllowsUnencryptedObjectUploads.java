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
 * Provides information about the number of S3 buckets whose bucket policies do or don't require server-side encryption
 * of objects when objects are uploaded to the buckets.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketCountPolicyAllowsUnencryptedObjectUploads"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketCountPolicyAllowsUnencryptedObjectUploads implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of buckets that don't have a bucket policy or have a bucket policy that doesn't require
     * server-side encryption of new objects. If a bucket policy exists, the policy doesn't require PutObject requests
     * to include the x-amz-server-side-encryption header and it doesn't require the value for that header to be AES256
     * or aws:kms.
     * </p>
     */
    private Long allowsUnencryptedObjectUploads;
    /**
     * <p>
     * The total number of buckets whose bucket policies require server-side encryption of new objects. PutObject
     * requests for these buckets must include the x-amz-server-side-encryption header and the value for that header
     * must be AES256 or aws:kms.
     * </p>
     */
    private Long deniesUnencryptedObjectUploads;
    /**
     * <p>
     * The total number of buckets that Amazon Macie wasn't able to evaluate server-side encryption requirements for.
     * Macie can't determine whether the bucket policies for these buckets require server-side encryption of new
     * objects.
     * </p>
     */
    private Long unknown;

    /**
     * <p>
     * The total number of buckets that don't have a bucket policy or have a bucket policy that doesn't require
     * server-side encryption of new objects. If a bucket policy exists, the policy doesn't require PutObject requests
     * to include the x-amz-server-side-encryption header and it doesn't require the value for that header to be AES256
     * or aws:kms.
     * </p>
     * 
     * @param allowsUnencryptedObjectUploads
     *        The total number of buckets that don't have a bucket policy or have a bucket policy that doesn't require
     *        server-side encryption of new objects. If a bucket policy exists, the policy doesn't require PutObject
     *        requests to include the x-amz-server-side-encryption header and it doesn't require the value for that
     *        header to be AES256 or aws:kms.
     */

    public void setAllowsUnencryptedObjectUploads(Long allowsUnencryptedObjectUploads) {
        this.allowsUnencryptedObjectUploads = allowsUnencryptedObjectUploads;
    }

    /**
     * <p>
     * The total number of buckets that don't have a bucket policy or have a bucket policy that doesn't require
     * server-side encryption of new objects. If a bucket policy exists, the policy doesn't require PutObject requests
     * to include the x-amz-server-side-encryption header and it doesn't require the value for that header to be AES256
     * or aws:kms.
     * </p>
     * 
     * @return The total number of buckets that don't have a bucket policy or have a bucket policy that doesn't require
     *         server-side encryption of new objects. If a bucket policy exists, the policy doesn't require PutObject
     *         requests to include the x-amz-server-side-encryption header and it doesn't require the value for that
     *         header to be AES256 or aws:kms.
     */

    public Long getAllowsUnencryptedObjectUploads() {
        return this.allowsUnencryptedObjectUploads;
    }

    /**
     * <p>
     * The total number of buckets that don't have a bucket policy or have a bucket policy that doesn't require
     * server-side encryption of new objects. If a bucket policy exists, the policy doesn't require PutObject requests
     * to include the x-amz-server-side-encryption header and it doesn't require the value for that header to be AES256
     * or aws:kms.
     * </p>
     * 
     * @param allowsUnencryptedObjectUploads
     *        The total number of buckets that don't have a bucket policy or have a bucket policy that doesn't require
     *        server-side encryption of new objects. If a bucket policy exists, the policy doesn't require PutObject
     *        requests to include the x-amz-server-side-encryption header and it doesn't require the value for that
     *        header to be AES256 or aws:kms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountPolicyAllowsUnencryptedObjectUploads withAllowsUnencryptedObjectUploads(Long allowsUnencryptedObjectUploads) {
        setAllowsUnencryptedObjectUploads(allowsUnencryptedObjectUploads);
        return this;
    }

    /**
     * <p>
     * The total number of buckets whose bucket policies require server-side encryption of new objects. PutObject
     * requests for these buckets must include the x-amz-server-side-encryption header and the value for that header
     * must be AES256 or aws:kms.
     * </p>
     * 
     * @param deniesUnencryptedObjectUploads
     *        The total number of buckets whose bucket policies require server-side encryption of new objects. PutObject
     *        requests for these buckets must include the x-amz-server-side-encryption header and the value for that
     *        header must be AES256 or aws:kms.
     */

    public void setDeniesUnencryptedObjectUploads(Long deniesUnencryptedObjectUploads) {
        this.deniesUnencryptedObjectUploads = deniesUnencryptedObjectUploads;
    }

    /**
     * <p>
     * The total number of buckets whose bucket policies require server-side encryption of new objects. PutObject
     * requests for these buckets must include the x-amz-server-side-encryption header and the value for that header
     * must be AES256 or aws:kms.
     * </p>
     * 
     * @return The total number of buckets whose bucket policies require server-side encryption of new objects.
     *         PutObject requests for these buckets must include the x-amz-server-side-encryption header and the value
     *         for that header must be AES256 or aws:kms.
     */

    public Long getDeniesUnencryptedObjectUploads() {
        return this.deniesUnencryptedObjectUploads;
    }

    /**
     * <p>
     * The total number of buckets whose bucket policies require server-side encryption of new objects. PutObject
     * requests for these buckets must include the x-amz-server-side-encryption header and the value for that header
     * must be AES256 or aws:kms.
     * </p>
     * 
     * @param deniesUnencryptedObjectUploads
     *        The total number of buckets whose bucket policies require server-side encryption of new objects. PutObject
     *        requests for these buckets must include the x-amz-server-side-encryption header and the value for that
     *        header must be AES256 or aws:kms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountPolicyAllowsUnencryptedObjectUploads withDeniesUnencryptedObjectUploads(Long deniesUnencryptedObjectUploads) {
        setDeniesUnencryptedObjectUploads(deniesUnencryptedObjectUploads);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that Amazon Macie wasn't able to evaluate server-side encryption requirements for.
     * Macie can't determine whether the bucket policies for these buckets require server-side encryption of new
     * objects.
     * </p>
     * 
     * @param unknown
     *        The total number of buckets that Amazon Macie wasn't able to evaluate server-side encryption requirements
     *        for. Macie can't determine whether the bucket policies for these buckets require server-side encryption of
     *        new objects.
     */

    public void setUnknown(Long unknown) {
        this.unknown = unknown;
    }

    /**
     * <p>
     * The total number of buckets that Amazon Macie wasn't able to evaluate server-side encryption requirements for.
     * Macie can't determine whether the bucket policies for these buckets require server-side encryption of new
     * objects.
     * </p>
     * 
     * @return The total number of buckets that Amazon Macie wasn't able to evaluate server-side encryption requirements
     *         for. Macie can't determine whether the bucket policies for these buckets require server-side encryption
     *         of new objects.
     */

    public Long getUnknown() {
        return this.unknown;
    }

    /**
     * <p>
     * The total number of buckets that Amazon Macie wasn't able to evaluate server-side encryption requirements for.
     * Macie can't determine whether the bucket policies for these buckets require server-side encryption of new
     * objects.
     * </p>
     * 
     * @param unknown
     *        The total number of buckets that Amazon Macie wasn't able to evaluate server-side encryption requirements
     *        for. Macie can't determine whether the bucket policies for these buckets require server-side encryption of
     *        new objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountPolicyAllowsUnencryptedObjectUploads withUnknown(Long unknown) {
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
        if (getAllowsUnencryptedObjectUploads() != null)
            sb.append("AllowsUnencryptedObjectUploads: ").append(getAllowsUnencryptedObjectUploads()).append(",");
        if (getDeniesUnencryptedObjectUploads() != null)
            sb.append("DeniesUnencryptedObjectUploads: ").append(getDeniesUnencryptedObjectUploads()).append(",");
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

        if (obj instanceof BucketCountPolicyAllowsUnencryptedObjectUploads == false)
            return false;
        BucketCountPolicyAllowsUnencryptedObjectUploads other = (BucketCountPolicyAllowsUnencryptedObjectUploads) obj;
        if (other.getAllowsUnencryptedObjectUploads() == null ^ this.getAllowsUnencryptedObjectUploads() == null)
            return false;
        if (other.getAllowsUnencryptedObjectUploads() != null
                && other.getAllowsUnencryptedObjectUploads().equals(this.getAllowsUnencryptedObjectUploads()) == false)
            return false;
        if (other.getDeniesUnencryptedObjectUploads() == null ^ this.getDeniesUnencryptedObjectUploads() == null)
            return false;
        if (other.getDeniesUnencryptedObjectUploads() != null
                && other.getDeniesUnencryptedObjectUploads().equals(this.getDeniesUnencryptedObjectUploads()) == false)
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

        hashCode = prime * hashCode + ((getAllowsUnencryptedObjectUploads() == null) ? 0 : getAllowsUnencryptedObjectUploads().hashCode());
        hashCode = prime * hashCode + ((getDeniesUnencryptedObjectUploads() == null) ? 0 : getDeniesUnencryptedObjectUploads().hashCode());
        hashCode = prime * hashCode + ((getUnknown() == null) ? 0 : getUnknown().hashCode());
        return hashCode;
    }

    @Override
    public BucketCountPolicyAllowsUnencryptedObjectUploads clone() {
        try {
            return (BucketCountPolicyAllowsUnencryptedObjectUploads) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketCountPolicyAllowsUnencryptedObjectUploadsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
