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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketVersioning" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBucketVersioningRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID of the S3 on Outposts bucket.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The S3 on Outposts bucket to set the versioning state for.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your
     * authentication device.
     * </p>
     */
    private String mFA;
    /**
     * <p>
     * The root-level tag for the <code>VersioningConfiguration</code> parameters.
     * </p>
     */
    private VersioningConfiguration versioningConfiguration;

    /**
     * <p>
     * The Amazon Web Services account ID of the S3 on Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the S3 on Outposts bucket.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the S3 on Outposts bucket.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the S3 on Outposts bucket.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the S3 on Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the S3 on Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketVersioningRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The S3 on Outposts bucket to set the versioning state for.
     * </p>
     * 
     * @param bucket
     *        The S3 on Outposts bucket to set the versioning state for.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The S3 on Outposts bucket to set the versioning state for.
     * </p>
     * 
     * @return The S3 on Outposts bucket to set the versioning state for.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The S3 on Outposts bucket to set the versioning state for.
     * </p>
     * 
     * @param bucket
     *        The S3 on Outposts bucket to set the versioning state for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketVersioningRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your
     * authentication device.
     * </p>
     * 
     * @param mFA
     *        The concatenation of the authentication device's serial number, a space, and the value that is displayed
     *        on your authentication device.
     */

    public void setMFA(String mFA) {
        this.mFA = mFA;
    }

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your
     * authentication device.
     * </p>
     * 
     * @return The concatenation of the authentication device's serial number, a space, and the value that is displayed
     *         on your authentication device.
     */

    public String getMFA() {
        return this.mFA;
    }

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your
     * authentication device.
     * </p>
     * 
     * @param mFA
     *        The concatenation of the authentication device's serial number, a space, and the value that is displayed
     *        on your authentication device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketVersioningRequest withMFA(String mFA) {
        setMFA(mFA);
        return this;
    }

    /**
     * <p>
     * The root-level tag for the <code>VersioningConfiguration</code> parameters.
     * </p>
     * 
     * @param versioningConfiguration
     *        The root-level tag for the <code>VersioningConfiguration</code> parameters.
     */

    public void setVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    /**
     * <p>
     * The root-level tag for the <code>VersioningConfiguration</code> parameters.
     * </p>
     * 
     * @return The root-level tag for the <code>VersioningConfiguration</code> parameters.
     */

    public VersioningConfiguration getVersioningConfiguration() {
        return this.versioningConfiguration;
    }

    /**
     * <p>
     * The root-level tag for the <code>VersioningConfiguration</code> parameters.
     * </p>
     * 
     * @param versioningConfiguration
     *        The root-level tag for the <code>VersioningConfiguration</code> parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketVersioningRequest withVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        setVersioningConfiguration(versioningConfiguration);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getMFA() != null)
            sb.append("MFA: ").append(getMFA()).append(",");
        if (getVersioningConfiguration() != null)
            sb.append("VersioningConfiguration: ").append(getVersioningConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketVersioningRequest == false)
            return false;
        PutBucketVersioningRequest other = (PutBucketVersioningRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getMFA() == null ^ this.getMFA() == null)
            return false;
        if (other.getMFA() != null && other.getMFA().equals(this.getMFA()) == false)
            return false;
        if (other.getVersioningConfiguration() == null ^ this.getVersioningConfiguration() == null)
            return false;
        if (other.getVersioningConfiguration() != null && other.getVersioningConfiguration().equals(this.getVersioningConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getMFA() == null) ? 0 : getMFA().hashCode());
        hashCode = prime * hashCode + ((getVersioningConfiguration() == null) ? 0 : getVersioningConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutBucketVersioningRequest clone() {
        return (PutBucketVersioningRequest) super.clone();
    }

}
