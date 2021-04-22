/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DestinationDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration details of the CloudWatch Logs destination.
     * </p>
     */
    private CloudWatchLogsDestinationDetails cloudWatchLogsDetails;
    /**
     * <p>
     * The configuration details of the Kinesis Data Firehose destination.
     * </p>
     */
    private KinesisFirehoseDestinationDetails kinesisFirehoseDetails;

    /**
     * <p>
     * The configuration details of the CloudWatch Logs destination.
     * </p>
     * 
     * @param cloudWatchLogsDetails
     *        The configuration details of the CloudWatch Logs destination.
     */

    public void setCloudWatchLogsDetails(CloudWatchLogsDestinationDetails cloudWatchLogsDetails) {
        this.cloudWatchLogsDetails = cloudWatchLogsDetails;
    }

    /**
     * <p>
     * The configuration details of the CloudWatch Logs destination.
     * </p>
     * 
     * @return The configuration details of the CloudWatch Logs destination.
     */

    public CloudWatchLogsDestinationDetails getCloudWatchLogsDetails() {
        return this.cloudWatchLogsDetails;
    }

    /**
     * <p>
     * The configuration details of the CloudWatch Logs destination.
     * </p>
     * 
     * @param cloudWatchLogsDetails
     *        The configuration details of the CloudWatch Logs destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationDetails withCloudWatchLogsDetails(CloudWatchLogsDestinationDetails cloudWatchLogsDetails) {
        setCloudWatchLogsDetails(cloudWatchLogsDetails);
        return this;
    }

    /**
     * <p>
     * The configuration details of the Kinesis Data Firehose destination.
     * </p>
     * 
     * @param kinesisFirehoseDetails
     *        The configuration details of the Kinesis Data Firehose destination.
     */

    public void setKinesisFirehoseDetails(KinesisFirehoseDestinationDetails kinesisFirehoseDetails) {
        this.kinesisFirehoseDetails = kinesisFirehoseDetails;
    }

    /**
     * <p>
     * The configuration details of the Kinesis Data Firehose destination.
     * </p>
     * 
     * @return The configuration details of the Kinesis Data Firehose destination.
     */

    public KinesisFirehoseDestinationDetails getKinesisFirehoseDetails() {
        return this.kinesisFirehoseDetails;
    }

    /**
     * <p>
     * The configuration details of the Kinesis Data Firehose destination.
     * </p>
     * 
     * @param kinesisFirehoseDetails
     *        The configuration details of the Kinesis Data Firehose destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationDetails withKinesisFirehoseDetails(KinesisFirehoseDestinationDetails kinesisFirehoseDetails) {
        setKinesisFirehoseDetails(kinesisFirehoseDetails);
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
        if (getCloudWatchLogsDetails() != null)
            sb.append("CloudWatchLogsDetails: ").append(getCloudWatchLogsDetails()).append(",");
        if (getKinesisFirehoseDetails() != null)
            sb.append("KinesisFirehoseDetails: ").append(getKinesisFirehoseDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationDetails == false)
            return false;
        DestinationDetails other = (DestinationDetails) obj;
        if (other.getCloudWatchLogsDetails() == null ^ this.getCloudWatchLogsDetails() == null)
            return false;
        if (other.getCloudWatchLogsDetails() != null && other.getCloudWatchLogsDetails().equals(this.getCloudWatchLogsDetails()) == false)
            return false;
        if (other.getKinesisFirehoseDetails() == null ^ this.getKinesisFirehoseDetails() == null)
            return false;
        if (other.getKinesisFirehoseDetails() != null && other.getKinesisFirehoseDetails().equals(this.getKinesisFirehoseDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogsDetails() == null) ? 0 : getCloudWatchLogsDetails().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseDetails() == null) ? 0 : getKinesisFirehoseDetails().hashCode());
        return hashCode;
    }

    @Override
    public DestinationDetails clone() {
        try {
            return (DestinationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
