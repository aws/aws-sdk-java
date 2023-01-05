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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Workers can send worker logs to different destination types. This configuration specifies the details of these
 * destinations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/WorkerLogDelivery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerLogDelivery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about delivering logs to Amazon CloudWatch Logs.
     * </p>
     */
    private CloudWatchLogsLogDelivery cloudWatchLogs;
    /**
     * <p>
     * Details about delivering logs to Amazon Kinesis Data Firehose.
     * </p>
     */
    private FirehoseLogDelivery firehose;
    /**
     * <p>
     * Details about delivering logs to Amazon S3.
     * </p>
     */
    private S3LogDelivery s3;

    /**
     * <p>
     * Details about delivering logs to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogs
     *        Details about delivering logs to Amazon CloudWatch Logs.
     */

    public void setCloudWatchLogs(CloudWatchLogsLogDelivery cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    /**
     * <p>
     * Details about delivering logs to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Details about delivering logs to Amazon CloudWatch Logs.
     */

    public CloudWatchLogsLogDelivery getCloudWatchLogs() {
        return this.cloudWatchLogs;
    }

    /**
     * <p>
     * Details about delivering logs to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogs
     *        Details about delivering logs to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerLogDelivery withCloudWatchLogs(CloudWatchLogsLogDelivery cloudWatchLogs) {
        setCloudWatchLogs(cloudWatchLogs);
        return this;
    }

    /**
     * <p>
     * Details about delivering logs to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @param firehose
     *        Details about delivering logs to Amazon Kinesis Data Firehose.
     */

    public void setFirehose(FirehoseLogDelivery firehose) {
        this.firehose = firehose;
    }

    /**
     * <p>
     * Details about delivering logs to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @return Details about delivering logs to Amazon Kinesis Data Firehose.
     */

    public FirehoseLogDelivery getFirehose() {
        return this.firehose;
    }

    /**
     * <p>
     * Details about delivering logs to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @param firehose
     *        Details about delivering logs to Amazon Kinesis Data Firehose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerLogDelivery withFirehose(FirehoseLogDelivery firehose) {
        setFirehose(firehose);
        return this;
    }

    /**
     * <p>
     * Details about delivering logs to Amazon S3.
     * </p>
     * 
     * @param s3
     *        Details about delivering logs to Amazon S3.
     */

    public void setS3(S3LogDelivery s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Details about delivering logs to Amazon S3.
     * </p>
     * 
     * @return Details about delivering logs to Amazon S3.
     */

    public S3LogDelivery getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Details about delivering logs to Amazon S3.
     * </p>
     * 
     * @param s3
     *        Details about delivering logs to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerLogDelivery withS3(S3LogDelivery s3) {
        setS3(s3);
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
        if (getCloudWatchLogs() != null)
            sb.append("CloudWatchLogs: ").append(getCloudWatchLogs()).append(",");
        if (getFirehose() != null)
            sb.append("Firehose: ").append(getFirehose()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkerLogDelivery == false)
            return false;
        WorkerLogDelivery other = (WorkerLogDelivery) obj;
        if (other.getCloudWatchLogs() == null ^ this.getCloudWatchLogs() == null)
            return false;
        if (other.getCloudWatchLogs() != null && other.getCloudWatchLogs().equals(this.getCloudWatchLogs()) == false)
            return false;
        if (other.getFirehose() == null ^ this.getFirehose() == null)
            return false;
        if (other.getFirehose() != null && other.getFirehose().equals(this.getFirehose()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogs() == null) ? 0 : getCloudWatchLogs().hashCode());
        hashCode = prime * hashCode + ((getFirehose() == null) ? 0 : getFirehose().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public WorkerLogDelivery clone() {
        try {
            return (WorkerLogDelivery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.WorkerLogDeliveryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
