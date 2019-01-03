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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the target Amazon S3 bucket for the Resource Data Sync.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResourceDataSyncS3Destination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncS3Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket where the aggregated data is stored.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * An Amazon S3 prefix for the bucket.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * A supported sync format. The following format is currently supported: JsonSerDe
     * </p>
     */
    private String syncFormat;
    /**
     * <p>
     * The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same region as the destination
     * Amazon S3 bucket.
     * </p>
     */
    private String aWSKMSKeyARN;

    /**
     * <p>
     * The name of the Amazon S3 bucket where the aggregated data is stored.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket where the aggregated data is stored.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the aggregated data is stored.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket where the aggregated data is stored.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the aggregated data is stored.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket where the aggregated data is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncS3Destination withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 prefix for the bucket.
     * </p>
     * 
     * @param prefix
     *        An Amazon S3 prefix for the bucket.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An Amazon S3 prefix for the bucket.
     * </p>
     * 
     * @return An Amazon S3 prefix for the bucket.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * An Amazon S3 prefix for the bucket.
     * </p>
     * 
     * @param prefix
     *        An Amazon S3 prefix for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncS3Destination withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported: JsonSerDe
     * </p>
     * 
     * @param syncFormat
     *        A supported sync format. The following format is currently supported: JsonSerDe
     * @see ResourceDataSyncS3Format
     */

    public void setSyncFormat(String syncFormat) {
        this.syncFormat = syncFormat;
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported: JsonSerDe
     * </p>
     * 
     * @return A supported sync format. The following format is currently supported: JsonSerDe
     * @see ResourceDataSyncS3Format
     */

    public String getSyncFormat() {
        return this.syncFormat;
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported: JsonSerDe
     * </p>
     * 
     * @param syncFormat
     *        A supported sync format. The following format is currently supported: JsonSerDe
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceDataSyncS3Format
     */

    public ResourceDataSyncS3Destination withSyncFormat(String syncFormat) {
        setSyncFormat(syncFormat);
        return this;
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported: JsonSerDe
     * </p>
     * 
     * @param syncFormat
     *        A supported sync format. The following format is currently supported: JsonSerDe
     * @see ResourceDataSyncS3Format
     */

    public void setSyncFormat(ResourceDataSyncS3Format syncFormat) {
        withSyncFormat(syncFormat);
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported: JsonSerDe
     * </p>
     * 
     * @param syncFormat
     *        A supported sync format. The following format is currently supported: JsonSerDe
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceDataSyncS3Format
     */

    public ResourceDataSyncS3Destination withSyncFormat(ResourceDataSyncS3Format syncFormat) {
        this.syncFormat = syncFormat.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
     * </p>
     * 
     * @param region
     *        The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
     * </p>
     * 
     * @return The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
     * </p>
     * 
     * @param region
     *        The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncS3Destination withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same region as the destination
     * Amazon S3 bucket.
     * </p>
     * 
     * @param aWSKMSKeyARN
     *        The ARN of an encryption key for a destination in Amazon S3. Must belong to the same region as the
     *        destination Amazon S3 bucket.
     */

    public void setAWSKMSKeyARN(String aWSKMSKeyARN) {
        this.aWSKMSKeyARN = aWSKMSKeyARN;
    }

    /**
     * <p>
     * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same region as the destination
     * Amazon S3 bucket.
     * </p>
     * 
     * @return The ARN of an encryption key for a destination in Amazon S3. Must belong to the same region as the
     *         destination Amazon S3 bucket.
     */

    public String getAWSKMSKeyARN() {
        return this.aWSKMSKeyARN;
    }

    /**
     * <p>
     * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same region as the destination
     * Amazon S3 bucket.
     * </p>
     * 
     * @param aWSKMSKeyARN
     *        The ARN of an encryption key for a destination in Amazon S3. Must belong to the same region as the
     *        destination Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncS3Destination withAWSKMSKeyARN(String aWSKMSKeyARN) {
        setAWSKMSKeyARN(aWSKMSKeyARN);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getSyncFormat() != null)
            sb.append("SyncFormat: ").append(getSyncFormat()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAWSKMSKeyARN() != null)
            sb.append("AWSKMSKeyARN: ").append(getAWSKMSKeyARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataSyncS3Destination == false)
            return false;
        ResourceDataSyncS3Destination other = (ResourceDataSyncS3Destination) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getSyncFormat() == null ^ this.getSyncFormat() == null)
            return false;
        if (other.getSyncFormat() != null && other.getSyncFormat().equals(this.getSyncFormat()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAWSKMSKeyARN() == null ^ this.getAWSKMSKeyARN() == null)
            return false;
        if (other.getAWSKMSKeyARN() != null && other.getAWSKMSKeyARN().equals(this.getAWSKMSKeyARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getSyncFormat() == null) ? 0 : getSyncFormat().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAWSKMSKeyARN() == null) ? 0 : getAWSKMSKeyARN().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDataSyncS3Destination clone() {
        try {
            return (ResourceDataSyncS3Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ResourceDataSyncS3DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
