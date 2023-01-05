/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketVersioning" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketVersioningResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The versioning state of the S3 on Outposts bucket.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned only if
     * the bucket has been configured with MFA delete. If MFA delete has never been configured for the bucket, this
     * element is not returned.
     * </p>
     */
    private String mFADelete;

    /**
     * <p>
     * The versioning state of the S3 on Outposts bucket.
     * </p>
     * 
     * @param status
     *        The versioning state of the S3 on Outposts bucket.
     * @see BucketVersioningStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The versioning state of the S3 on Outposts bucket.
     * </p>
     * 
     * @return The versioning state of the S3 on Outposts bucket.
     * @see BucketVersioningStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The versioning state of the S3 on Outposts bucket.
     * </p>
     * 
     * @param status
     *        The versioning state of the S3 on Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketVersioningStatus
     */

    public GetBucketVersioningResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The versioning state of the S3 on Outposts bucket.
     * </p>
     * 
     * @param status
     *        The versioning state of the S3 on Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketVersioningStatus
     */

    public GetBucketVersioningResult withStatus(BucketVersioningStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned only if
     * the bucket has been configured with MFA delete. If MFA delete has never been configured for the bucket, this
     * element is not returned.
     * </p>
     * 
     * @param mFADelete
     *        Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned
     *        only if the bucket has been configured with MFA delete. If MFA delete has never been configured for the
     *        bucket, this element is not returned.
     * @see MFADeleteStatus
     */

    public void setMFADelete(String mFADelete) {
        this.mFADelete = mFADelete;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned only if
     * the bucket has been configured with MFA delete. If MFA delete has never been configured for the bucket, this
     * element is not returned.
     * </p>
     * 
     * @return Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned
     *         only if the bucket has been configured with MFA delete. If MFA delete has never been configured for the
     *         bucket, this element is not returned.
     * @see MFADeleteStatus
     */

    public String getMFADelete() {
        return this.mFADelete;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned only if
     * the bucket has been configured with MFA delete. If MFA delete has never been configured for the bucket, this
     * element is not returned.
     * </p>
     * 
     * @param mFADelete
     *        Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned
     *        only if the bucket has been configured with MFA delete. If MFA delete has never been configured for the
     *        bucket, this element is not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MFADeleteStatus
     */

    public GetBucketVersioningResult withMFADelete(String mFADelete) {
        setMFADelete(mFADelete);
        return this;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned only if
     * the bucket has been configured with MFA delete. If MFA delete has never been configured for the bucket, this
     * element is not returned.
     * </p>
     * 
     * @param mFADelete
     *        Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned
     *        only if the bucket has been configured with MFA delete. If MFA delete has never been configured for the
     *        bucket, this element is not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MFADeleteStatus
     */

    public GetBucketVersioningResult withMFADelete(MFADeleteStatus mFADelete) {
        this.mFADelete = mFADelete.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMFADelete() != null)
            sb.append("MFADelete: ").append(getMFADelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketVersioningResult == false)
            return false;
        GetBucketVersioningResult other = (GetBucketVersioningResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMFADelete() == null ^ this.getMFADelete() == null)
            return false;
        if (other.getMFADelete() != null && other.getMFADelete().equals(this.getMFADelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMFADelete() == null) ? 0 : getMFADelete().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketVersioningResult clone() {
        try {
            return (GetBucketVersioningResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
