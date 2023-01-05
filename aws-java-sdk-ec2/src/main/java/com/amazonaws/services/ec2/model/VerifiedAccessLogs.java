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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessLogs implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon S3 logging options.
     * </p>
     */
    private VerifiedAccessLogS3Destination s3;
    /**
     * <p>
     * CloudWatch Logs logging destination.
     * </p>
     */
    private VerifiedAccessLogCloudWatchLogsDestination cloudWatchLogs;
    /**
     * <p>
     * Kinesis logging destination.
     * </p>
     */
    private VerifiedAccessLogKinesisDataFirehoseDestination kinesisDataFirehose;

    /**
     * <p>
     * Amazon S3 logging options.
     * </p>
     * 
     * @param s3
     *        Amazon S3 logging options.
     */

    public void setS3(VerifiedAccessLogS3Destination s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Amazon S3 logging options.
     * </p>
     * 
     * @return Amazon S3 logging options.
     */

    public VerifiedAccessLogS3Destination getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Amazon S3 logging options.
     * </p>
     * 
     * @param s3
     *        Amazon S3 logging options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogs withS3(VerifiedAccessLogS3Destination s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * CloudWatch Logs logging destination.
     * </p>
     * 
     * @param cloudWatchLogs
     *        CloudWatch Logs logging destination.
     */

    public void setCloudWatchLogs(VerifiedAccessLogCloudWatchLogsDestination cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    /**
     * <p>
     * CloudWatch Logs logging destination.
     * </p>
     * 
     * @return CloudWatch Logs logging destination.
     */

    public VerifiedAccessLogCloudWatchLogsDestination getCloudWatchLogs() {
        return this.cloudWatchLogs;
    }

    /**
     * <p>
     * CloudWatch Logs logging destination.
     * </p>
     * 
     * @param cloudWatchLogs
     *        CloudWatch Logs logging destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogs withCloudWatchLogs(VerifiedAccessLogCloudWatchLogsDestination cloudWatchLogs) {
        setCloudWatchLogs(cloudWatchLogs);
        return this;
    }

    /**
     * <p>
     * Kinesis logging destination.
     * </p>
     * 
     * @param kinesisDataFirehose
     *        Kinesis logging destination.
     */

    public void setKinesisDataFirehose(VerifiedAccessLogKinesisDataFirehoseDestination kinesisDataFirehose) {
        this.kinesisDataFirehose = kinesisDataFirehose;
    }

    /**
     * <p>
     * Kinesis logging destination.
     * </p>
     * 
     * @return Kinesis logging destination.
     */

    public VerifiedAccessLogKinesisDataFirehoseDestination getKinesisDataFirehose() {
        return this.kinesisDataFirehose;
    }

    /**
     * <p>
     * Kinesis logging destination.
     * </p>
     * 
     * @param kinesisDataFirehose
     *        Kinesis logging destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogs withKinesisDataFirehose(VerifiedAccessLogKinesisDataFirehoseDestination kinesisDataFirehose) {
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

        if (obj instanceof VerifiedAccessLogs == false)
            return false;
        VerifiedAccessLogs other = (VerifiedAccessLogs) obj;
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
    public VerifiedAccessLogs clone() {
        try {
            return (VerifiedAccessLogs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
