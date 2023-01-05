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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the destinations for Verified Access logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessLogOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessLogOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Sends Verified Access logs to Amazon S3.
     * </p>
     */
    private VerifiedAccessLogS3DestinationOptions s3;
    /**
     * <p>
     * Sends Verified Access logs to CloudWatch Logs.
     * </p>
     */
    private VerifiedAccessLogCloudWatchLogsDestinationOptions cloudWatchLogs;
    /**
     * <p>
     * Sends Verified Access logs to Kinesis.
     * </p>
     */
    private VerifiedAccessLogKinesisDataFirehoseDestinationOptions kinesisDataFirehose;

    /**
     * <p>
     * Sends Verified Access logs to Amazon S3.
     * </p>
     * 
     * @param s3
     *        Sends Verified Access logs to Amazon S3.
     */

    public void setS3(VerifiedAccessLogS3DestinationOptions s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Sends Verified Access logs to Amazon S3.
     * </p>
     * 
     * @return Sends Verified Access logs to Amazon S3.
     */

    public VerifiedAccessLogS3DestinationOptions getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Sends Verified Access logs to Amazon S3.
     * </p>
     * 
     * @param s3
     *        Sends Verified Access logs to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogOptions withS3(VerifiedAccessLogS3DestinationOptions s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * Sends Verified Access logs to CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogs
     *        Sends Verified Access logs to CloudWatch Logs.
     */

    public void setCloudWatchLogs(VerifiedAccessLogCloudWatchLogsDestinationOptions cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    /**
     * <p>
     * Sends Verified Access logs to CloudWatch Logs.
     * </p>
     * 
     * @return Sends Verified Access logs to CloudWatch Logs.
     */

    public VerifiedAccessLogCloudWatchLogsDestinationOptions getCloudWatchLogs() {
        return this.cloudWatchLogs;
    }

    /**
     * <p>
     * Sends Verified Access logs to CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogs
     *        Sends Verified Access logs to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogOptions withCloudWatchLogs(VerifiedAccessLogCloudWatchLogsDestinationOptions cloudWatchLogs) {
        setCloudWatchLogs(cloudWatchLogs);
        return this;
    }

    /**
     * <p>
     * Sends Verified Access logs to Kinesis.
     * </p>
     * 
     * @param kinesisDataFirehose
     *        Sends Verified Access logs to Kinesis.
     */

    public void setKinesisDataFirehose(VerifiedAccessLogKinesisDataFirehoseDestinationOptions kinesisDataFirehose) {
        this.kinesisDataFirehose = kinesisDataFirehose;
    }

    /**
     * <p>
     * Sends Verified Access logs to Kinesis.
     * </p>
     * 
     * @return Sends Verified Access logs to Kinesis.
     */

    public VerifiedAccessLogKinesisDataFirehoseDestinationOptions getKinesisDataFirehose() {
        return this.kinesisDataFirehose;
    }

    /**
     * <p>
     * Sends Verified Access logs to Kinesis.
     * </p>
     * 
     * @param kinesisDataFirehose
     *        Sends Verified Access logs to Kinesis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogOptions withKinesisDataFirehose(VerifiedAccessLogKinesisDataFirehoseDestinationOptions kinesisDataFirehose) {
        setKinesisDataFirehose(kinesisDataFirehose);
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
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getCloudWatchLogs() != null)
            sb.append("CloudWatchLogs: ").append(getCloudWatchLogs()).append(",");
        if (getKinesisDataFirehose() != null)
            sb.append("KinesisDataFirehose: ").append(getKinesisDataFirehose());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifiedAccessLogOptions == false)
            return false;
        VerifiedAccessLogOptions other = (VerifiedAccessLogOptions) obj;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getCloudWatchLogs() == null ^ this.getCloudWatchLogs() == null)
            return false;
        if (other.getCloudWatchLogs() != null && other.getCloudWatchLogs().equals(this.getCloudWatchLogs()) == false)
            return false;
        if (other.getKinesisDataFirehose() == null ^ this.getKinesisDataFirehose() == null)
            return false;
        if (other.getKinesisDataFirehose() != null && other.getKinesisDataFirehose().equals(this.getKinesisDataFirehose()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogs() == null) ? 0 : getCloudWatchLogs().hashCode());
        hashCode = prime * hashCode + ((getKinesisDataFirehose() == null) ? 0 : getKinesisDataFirehose().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessLogOptions clone() {
        try {
            return (VerifiedAccessLogOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
