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
 * <p>
 * Describes the versioning state of an Amazon S3 on Outposts bucket. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketVersioning.html">PutBucketVersioning</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/VersioningConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersioningConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on Outposts
     * bucket.
     * </p>
     */
    private String mFADelete;
    /**
     * <p>
     * Sets the versioning state of the S3 on Outposts bucket.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on Outposts
     * bucket.
     * </p>
     * 
     * @param mFADelete
     *        Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on
     *        Outposts bucket.
     * @see MFADelete
     */

    public void setMFADelete(String mFADelete) {
        this.mFADelete = mFADelete;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on Outposts
     * bucket.
     * </p>
     * 
     * @return Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on
     *         Outposts bucket.
     * @see MFADelete
     */

    public String getMFADelete() {
        return this.mFADelete;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on Outposts
     * bucket.
     * </p>
     * 
     * @param mFADelete
     *        Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on
     *        Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MFADelete
     */

    public VersioningConfiguration withMFADelete(String mFADelete) {
        setMFADelete(mFADelete);
        return this;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on Outposts
     * bucket.
     * </p>
     * 
     * @param mFADelete
     *        Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on
     *        Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MFADelete
     */

    public VersioningConfiguration withMFADelete(MFADelete mFADelete) {
        this.mFADelete = mFADelete.toString();
        return this;
    }

    /**
     * <p>
     * Sets the versioning state of the S3 on Outposts bucket.
     * </p>
     * 
     * @param status
     *        Sets the versioning state of the S3 on Outposts bucket.
     * @see BucketVersioningStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Sets the versioning state of the S3 on Outposts bucket.
     * </p>
     * 
     * @return Sets the versioning state of the S3 on Outposts bucket.
     * @see BucketVersioningStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Sets the versioning state of the S3 on Outposts bucket.
     * </p>
     * 
     * @param status
     *        Sets the versioning state of the S3 on Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketVersioningStatus
     */

    public VersioningConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Sets the versioning state of the S3 on Outposts bucket.
     * </p>
     * 
     * @param status
     *        Sets the versioning state of the S3 on Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketVersioningStatus
     */

    public VersioningConfiguration withStatus(BucketVersioningStatus status) {
        this.status = status.toString();
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
        if (getMFADelete() != null)
            sb.append("MFADelete: ").append(getMFADelete()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersioningConfiguration == false)
            return false;
        VersioningConfiguration other = (VersioningConfiguration) obj;
        if (other.getMFADelete() == null ^ this.getMFADelete() == null)
            return false;
        if (other.getMFADelete() != null && other.getMFADelete().equals(this.getMFADelete()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMFADelete() == null) ? 0 : getMFADelete().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public VersioningConfiguration clone() {
        try {
            return (VersioningConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
