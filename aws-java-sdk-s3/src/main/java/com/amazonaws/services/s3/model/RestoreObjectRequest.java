/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;

/**
 * <p>
 * Request object containing all the options for restoring an object, which was transitioned to the Amazon Glacier
 * from S3 when it was expired.
 * </p>
 * <p>
 * All <code>RestoreObjectRequest</code> must specify a bucket name and key,
 * along with expiration time.
 * </p>
 *
 * @see RestoreObjectRequest#RestoreObjectRequest(String, String, int)
 * @see RestoreObjectRequest#RestoreObjectRequest(String, String)
 */
public class RestoreObjectRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Lifetime of the active copy in days. Do not use with restores that specify OutputLocation.
     */
    private int expirationInDays;

    /**
     * The name of the bucket containing the reference to the object to restore
     * which is now stored in Amazon Glacier.
     */
    private String bucketName;

    /**
     * The key, the name of the reference to the object to restore, which is now
     * stored in Amazon Glacier.
     */
    private String key;

    /**
     * Optional version ID specifying which version of the object to restore.
     * If not specified, the most recent version will be restored.
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * For more information about enabling lifecycle versioning for a bucket,
     * see {@link AmazonS3#setBucketLifecycleConfiguration(SetBucketLifecycleConfigurationRequest)}.
     */
    private String versionId;

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    /**
     * Glacier related parameters pertaining to this job.
     * <p>This should not be used for restores with a specified OutputLocation.</p>
     */
    private GlacierJobParameters glacierJobParameters;

    /**
     * Type of restore request.
     */
    private String type;

    /**
     * Glacier retrieval tier at which the restore will be processed.
     */
    private String tier;

    /**
     * The optional description for the job.
     */
    private String description;

    /**
     * Describes the parameters for Select job types.
     */
    private SelectParameters selectParameters;

    /**
     * Describes the location where the restore job's output is stored.
     */
    private OutputLocation outputLocation;

    /**
     * <p>
     * Constructs a new RestoreObjectRequest.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the reference to the object
     *            to restore which is now stored in Amazon Glacier.
     * @param key
     *            The key, the name of the reference to the object to restore, which
     *            is now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#RestoreObjectRequest(String, String, int)
     */
    public RestoreObjectRequest(String bucketName, String key) {
        this(bucketName, key, -1);
    }

    /**
     * <p>
     * Constructs a new RestoreObjectRequest.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the reference to the object
     *            to restore which is now stored in Amazon Glacier.
     * @param key
     *            The key, the name of the reference to the object to restore, which
     *            is now stored in Amazon Glacier.
     * @param expirationInDays
     *            The time, in days, between when an object is restored to the
     *            bucket and when it expires
     *
     * @see RestoreObjectRequest#RestoreObjectRequest(String, String)
     */
    public RestoreObjectRequest(String bucketName, String key, int expirationInDays) {
        this.bucketName = bucketName;
        this.key = key;
        this.expirationInDays = expirationInDays;
    }

    /**
     * Returns the name of the bucket containing the reference to the object to
     * restore which is now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#setBucketName(String)
     * @see RestoreObjectRequest#withBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the reference to the object to
     * restore which is now stored in Amazon Glacier, and returns a reference
     * to this object(RestoreObjectRequest) for method chaining.
     *
     * @see RestoreObjectRequest#setBucketName(String)
     * @see RestoreObjectRequest#getBucketName()
     */
    public RestoreObjectRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Sets the name of the bucket containing the reference to the object to
     * restore which is now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#getBucketName()
     * @see RestoreObjectRequest#withBucketName(String)
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Gets the key, the name of the reference to the object to restore, which is
     * now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#setKey(String)
     * @see RestoreObjectRequest#withKey(String)
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key, the name of the reference to the object to restore, which
     * is now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#getKey()
     * @see RestoreObjectRequest#withKey(String)
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key, the name of the reference to the object to restore, which
     * is now stored in Amazon Glacier. returns a reference to this object(RestoreObjectRequest)
     * for method chaining.
     *
     * @see RestoreObjectRequest#getKey()
     * @see RestoreObjectRequest#setKey(String)
     */
    public RestoreObjectRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns the id of the version to be restored.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the id of the version to be restored.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Sets the id of the version to be restored and returns a reference to
     * this object for method chaining.
     */
    public RestoreObjectRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * Sets the time, in days, between when an object is uploaded to the bucket
     * and when it expires.
     *
     * <p>Do not use with restores that specify OutputLocation.</p>
     */
    public void setExpirationInDays(int expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    /**
     * Returns the time in days from an object's creation to its expiration.
     */
    public int getExpirationInDays() {
        return expirationInDays;
    }

    /**
     * Sets the time, in days, between when an object is uploaded to the bucket
     * and when it expires, and returns a reference to this object(RestoreObjectRequest) for method
     * chaining.
     *
     * <p>Do not use with restores that specify OutputLocation.</p>
     */
    public RestoreObjectRequest withExpirationInDays(int expirationInDays) {
        this.expirationInDays = expirationInDays;
        return this;
    }

    /**
     * Returns true if the user has enabled Requester Pays option when
     * conducting this operation from Requester Pays Bucket; else false.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
     *
     * @return true if the user has enabled Requester Pays option for
     * conducting this operation from Requester Pays Bucket.
     */
    public boolean isRequesterPays() {
        return isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket.
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     */
    public void setRequesterPays(boolean isRequesterPays) {
        this.isRequesterPays = isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket. It returns this
     * updated RestoreObjectRequest object so that additional method calls can be
     * chained together.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket.
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     *
     * @return The updated RestoreObjectRequest object.
     */
    public RestoreObjectRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

    /**
     * @return Glacier related parameters pertaining to this job.
     */
    public GlacierJobParameters getGlacierJobParameters() {
        return glacierJobParameters;
    }

    /**
     * Sets Glacier related parameters pertaining to this job.
     *
     * <p>This should not be used for restores with a specified OutputLocation.</p>
     *
     * @param glacierJobParameters New value for Glacier job parameters.
     */
    public void setGlacierJobParameters(GlacierJobParameters glacierJobParameters) {
        this.glacierJobParameters = glacierJobParameters;
    }

    /**
     * Sets Glacier related parameters pertaining to this job.
     *
     * <p>This should not be used for restores with a specified OutputLocation.</p>
     *
     * @param glacierJobParameters New value for Glacier job parameters.
     * @return This object for method chaining.
     */
    public RestoreObjectRequest withGlacierJobParameters(GlacierJobParameters glacierJobParameters) {
        setGlacierJobParameters(glacierJobParameters);
        return this;
    }

    /**
     * @return The type of restore request.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the restore request type.
     *
     * @param type New value for type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets the restore request type.
     *
     * @param restoreRequestType New value for restore request type.
     * @return This object for method chaining.
     */
    public RestoreObjectRequest withType(String restoreRequestType) {
        setType(restoreRequestType);
        return this;
    }

    /**
     * Sets the restore request type.
     *
     * @param restoreRequestType New value for restore request type.
     * @return This object for method chaining.
     */
    public RestoreObjectRequest withType(RestoreRequestType restoreRequestType) {
        setType(restoreRequestType == null ? null : restoreRequestType.toString());
        return this;
    }

    /**
     * @return The glacier retrieval tier.
     */
    public String getTier() {
        return tier;
    }

    /**
     * Sets the glacier retrieval tier.
     *
     * @param tier New value for tier.
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * Sets the glacier retrieval tier.
     *
     * @param tier New value for tier.
     * @return This object for method chaining.
     */
    public RestoreObjectRequest withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Sets the glacier retrieval tier.
     *
     * @param tier New value for tier.
     * @return This object for method chaining.
     */
    public RestoreObjectRequest withTier(Tier tier) {
        this.tier = tier == null ? null : tier.toString();
        return this;
    }


    /**
     * @return the description for the job.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description for the job.
     *
     * @param description New value for the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the description for the job.
     *
     * @param description New value for the description
     * @return This object for method chaining.
     */
    public RestoreObjectRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * @return the parameters for select job types.
     */
    public SelectParameters getSelectParameters() {
        return selectParameters;
    }

    /**
     * Sets the parameters for select job types.
     *
     * @param selectParameters New value for selectParameters
     */
    public void setSelectParameters(SelectParameters selectParameters) {
        this.selectParameters = selectParameters;
    }

    /**
     * Sets the parameters for select job types.
     *
     * @param selectParameters New value for selectParameters
     * @return This object for method chaining.
     */
    public RestoreObjectRequest withSelectParameters(SelectParameters selectParameters) {
        this.selectParameters = selectParameters;
        return this;
    }

    /**
     * @return the location where the restore job's output is stored.
     */
    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * Sets the location where the restore job's output is stored.
     *
     * @param outputLocation New value for output location
     */
    public void setOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * Sets the location where the restore job's output is stored.
     *
     * @param outputLocation New value for output location
     * @return This object for method chaining.
     */
    public RestoreObjectRequest withOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof RestoreObjectRequest)) {
            return false;
        }

        final RestoreObjectRequest other = (RestoreObjectRequest) obj;

        if (other.getExpirationInDays() != this.getExpirationInDays())
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && !other.getBucketName().equals(this.getBucketName()))
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && !other.getKey().equals(this.getKey()))
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && !other.getVersionId().equals(this.getVersionId()))
            return false;
        if (other.getGlacierJobParameters() == null ^ this.getGlacierJobParameters() == null)
            return false;
        if (other.getGlacierJobParameters() != null && !other.getGlacierJobParameters().equals(this.getGlacierJobParameters()))
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && !other.getType().equals(this.getType()))
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && !other.getTier().equals(this.getTier()))
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && !other.getDescription().equals(this.getDescription()))
            return false;
        if (other.getSelectParameters() == null ^ this.getSelectParameters() == null)
            return false;
        if (other.getSelectParameters() != null && !other.getSelectParameters().equals(this.getSelectParameters()))
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && !other.getOutputLocation().equals(this.getOutputLocation()))
            return false;
        if (other.isRequesterPays() != this.isRequesterPays())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getGlacierJobParameters() == null) ? 0 : getGlacierJobParameters().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + (getTier() != null ? getTier().hashCode() : 0);
        hashCode = prime * hashCode + (getDescription() != null ? getDescription().hashCode() : 0);
        hashCode = prime * hashCode + (getSelectParameters() != null ? getSelectParameters().hashCode() : 0);
        hashCode = prime * hashCode + (getOutputLocation() != null ? getOutputLocation().hashCode() : 0);
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("ExpirationInDays: ").append(expirationInDays).append(",");
        sb.append("IsRequesterPays").append(isRequesterPays()).append(",");

        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getGlacierJobParameters() != null)
            sb.append("GlacierJobParameters: ").append(getGlacierJobParameters()).append(",");
        if (getType() != null)
            sb.append("RestoreRequestType: ").append(getType()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSelectParameters() != null)
            sb.append("SelectParameters: ").append(getSelectParameters()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation").append(getOutputLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public RestoreObjectRequest clone() {
        return (RestoreObjectRequest) super.clone();
    }
}
