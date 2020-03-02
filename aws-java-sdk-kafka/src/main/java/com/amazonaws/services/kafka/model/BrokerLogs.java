/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/BrokerLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerLogs implements Serializable, Cloneable, StructuredPojo {

    private CloudWatchLogs cloudWatchLogs;

    private Firehose firehose;

    private S3 s3;

    /**
     * @param cloudWatchLogs
     */

    public void setCloudWatchLogs(CloudWatchLogs cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    /**
     * @return
     */

    public CloudWatchLogs getCloudWatchLogs() {
        return this.cloudWatchLogs;
    }

    /**
     * @param cloudWatchLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerLogs withCloudWatchLogs(CloudWatchLogs cloudWatchLogs) {
        setCloudWatchLogs(cloudWatchLogs);
        return this;
    }

    /**
     * @param firehose
     */

    public void setFirehose(Firehose firehose) {
        this.firehose = firehose;
    }

    /**
     * @return
     */

    public Firehose getFirehose() {
        return this.firehose;
    }

    /**
     * @param firehose
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerLogs withFirehose(Firehose firehose) {
        setFirehose(firehose);
        return this;
    }

    /**
     * @param s3
     */

    public void setS3(S3 s3) {
        this.s3 = s3;
    }

    /**
     * @return
     */

    public S3 getS3() {
        return this.s3;
    }

    /**
     * @param s3
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerLogs withS3(S3 s3) {
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

        if (obj instanceof BrokerLogs == false)
            return false;
        BrokerLogs other = (BrokerLogs) obj;
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
    public BrokerLogs clone() {
        try {
            return (BrokerLogs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.BrokerLogsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
