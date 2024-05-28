/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ExportServerlessCacheSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportServerlessCacheSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the serverless cache snapshot to be exported to S3. Available for Redis only.
     * </p>
     */
    private String serverlessCacheSnapshotName;
    /**
     * <p>
     * Name of the Amazon S3 bucket to export the snapshot to. The Amazon S3 bucket must also be in same region as the
     * snapshot. Available for Redis only.
     * </p>
     */
    private String s3BucketName;

    /**
     * <p>
     * The identifier of the serverless cache snapshot to be exported to S3. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        The identifier of the serverless cache snapshot to be exported to S3. Available for Redis only.
     */

    public void setServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        this.serverlessCacheSnapshotName = serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier of the serverless cache snapshot to be exported to S3. Available for Redis only.
     * </p>
     * 
     * @return The identifier of the serverless cache snapshot to be exported to S3. Available for Redis only.
     */

    public String getServerlessCacheSnapshotName() {
        return this.serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier of the serverless cache snapshot to be exported to S3. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        The identifier of the serverless cache snapshot to be exported to S3. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportServerlessCacheSnapshotRequest withServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        setServerlessCacheSnapshotName(serverlessCacheSnapshotName);
        return this;
    }

    /**
     * <p>
     * Name of the Amazon S3 bucket to export the snapshot to. The Amazon S3 bucket must also be in same region as the
     * snapshot. Available for Redis only.
     * </p>
     * 
     * @param s3BucketName
     *        Name of the Amazon S3 bucket to export the snapshot to. The Amazon S3 bucket must also be in same region
     *        as the snapshot. Available for Redis only.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * Name of the Amazon S3 bucket to export the snapshot to. The Amazon S3 bucket must also be in same region as the
     * snapshot. Available for Redis only.
     * </p>
     * 
     * @return Name of the Amazon S3 bucket to export the snapshot to. The Amazon S3 bucket must also be in same region
     *         as the snapshot. Available for Redis only.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * Name of the Amazon S3 bucket to export the snapshot to. The Amazon S3 bucket must also be in same region as the
     * snapshot. Available for Redis only.
     * </p>
     * 
     * @param s3BucketName
     *        Name of the Amazon S3 bucket to export the snapshot to. The Amazon S3 bucket must also be in same region
     *        as the snapshot. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportServerlessCacheSnapshotRequest withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
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
        if (getServerlessCacheSnapshotName() != null)
            sb.append("ServerlessCacheSnapshotName: ").append(getServerlessCacheSnapshotName()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportServerlessCacheSnapshotRequest == false)
            return false;
        ExportServerlessCacheSnapshotRequest other = (ExportServerlessCacheSnapshotRequest) obj;
        if (other.getServerlessCacheSnapshotName() == null ^ this.getServerlessCacheSnapshotName() == null)
            return false;
        if (other.getServerlessCacheSnapshotName() != null && other.getServerlessCacheSnapshotName().equals(this.getServerlessCacheSnapshotName()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerlessCacheSnapshotName() == null) ? 0 : getServerlessCacheSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        return hashCode;
    }

    @Override
    public ExportServerlessCacheSnapshotRequest clone() {
        return (ExportServerlessCacheSnapshotRequest) super.clone();
    }

}
