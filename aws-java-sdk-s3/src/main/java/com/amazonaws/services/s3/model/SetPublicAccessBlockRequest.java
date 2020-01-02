/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class SetPublicAccessBlockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    private String bucketName;
    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;

    /**
     * The name of the Amazon S3 bucket whose Public Access Block configuration you want to set.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The name of the Amazon S3 bucket whose Public Access Block configuration you want to set.
     *
     * <p>
     * When using this API with an access point, you must direct requests
     * to the access point hostname. The access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * </p>
     * <p>
     * When using this operation using an access point through the AWS SDKs, you provide
     * the access point ARN in place of the bucket name. For more information about access point
     * ARNs, see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html\">
     * Using Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param bucketName Name of bucket or access point ARN.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * The name of the Amazon S3 bucket whose Public Access Block configuration you want to set.
     *
     * <p>
     * When using this API with an access point, you must direct requests
     * to the access point hostname. The access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * </p>
     * <p>
     * When using this operation using an access point through the AWS SDKs, you provide
     * the access point ARN in place of the bucket name. For more information about access point
     * ARNs, see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html\">
     * Using Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param bucketName Name of bucket or access point ARN.
     * @return This object for method chaining.
     */
    public SetPublicAccessBlockRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * The Public Access Block configuration that you want to apply to this Amazon S3 bucket.
     */
    public PublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
        return publicAccessBlockConfiguration;
    }

    /**
     * The Public Access Block configuration that you want to apply to this Amazon S3 bucket.
     *
     * @param publicAccessBlockConfiguration Configuration you wish to set.
     */
    public void setPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * The Public Access Block configuration that you want to apply to this Amazon S3 bucket.
     *
     * @param publicAccessBlockConfiguration Configuration you wish to set.
     * @return This object for method chaining.
     */
    public SetPublicAccessBlockRequest withPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        setPublicAccessBlockConfiguration(publicAccessBlockConfiguration);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final SetPublicAccessBlockRequest that = (SetPublicAccessBlockRequest) o;

        if (bucketName != null ? !bucketName.equals(that.bucketName) : that.bucketName != null) {
            return false;
        }
        return publicAccessBlockConfiguration != null ? publicAccessBlockConfiguration.equals(that.publicAccessBlockConfiguration) : that.publicAccessBlockConfiguration == null;
    }

    @Override
    public int hashCode() {
        int result = bucketName != null ? bucketName.hashCode() : 0;
        result = 31 * result + (publicAccessBlockConfiguration != null ? publicAccessBlockConfiguration.hashCode() : 0);
        return result;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucketName() != null) {
            sb.append("BucketName: ").append(getBucketName()).append(",");
        }
        if (getPublicAccessBlockConfiguration() != null) {
            sb.append("PublicAccessBlockConfiguration: ").append(getPublicAccessBlockConfiguration()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public SetPublicAccessBlockRequest clone() {
        return (SetPublicAccessBlockRequest) super.clone();
    }
}
