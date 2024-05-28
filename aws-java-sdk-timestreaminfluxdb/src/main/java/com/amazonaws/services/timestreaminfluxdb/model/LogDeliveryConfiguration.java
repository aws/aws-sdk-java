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
package com.amazonaws.services.timestreaminfluxdb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/LogDeliveryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogDeliveryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration for S3 bucket log delivery.
     * </p>
     */
    private S3Configuration s3Configuration;

    /**
     * <p>
     * Configuration for S3 bucket log delivery.
     * </p>
     * 
     * @param s3Configuration
     *        Configuration for S3 bucket log delivery.
     */

    public void setS3Configuration(S3Configuration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * Configuration for S3 bucket log delivery.
     * </p>
     * 
     * @return Configuration for S3 bucket log delivery.
     */

    public S3Configuration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * Configuration for S3 bucket log delivery.
     * </p>
     * 
     * @param s3Configuration
     *        Configuration for S3 bucket log delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDeliveryConfiguration withS3Configuration(S3Configuration s3Configuration) {
        setS3Configuration(s3Configuration);
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
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogDeliveryConfiguration == false)
            return false;
        LogDeliveryConfiguration other = (LogDeliveryConfiguration) obj;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        return hashCode;
    }

    @Override
    public LogDeliveryConfiguration clone() {
        try {
            return (LogDeliveryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreaminfluxdb.model.transform.LogDeliveryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
