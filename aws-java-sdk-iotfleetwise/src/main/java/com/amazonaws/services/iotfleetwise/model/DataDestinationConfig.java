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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The destination where the Amazon Web Services IoT FleetWise campaign sends data. You can send data to be stored in
 * Amazon S3 or Amazon Timestream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DataDestinationConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataDestinationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket where the Amazon Web Services IoT FleetWise campaign sends data.
     * </p>
     */
    private S3Config s3Config;
    /**
     * <p>
     * The Amazon Timestream table where the campaign sends data.
     * </p>
     */
    private TimestreamConfig timestreamConfig;

    /**
     * <p>
     * The Amazon S3 bucket where the Amazon Web Services IoT FleetWise campaign sends data.
     * </p>
     * 
     * @param s3Config
     *        The Amazon S3 bucket where the Amazon Web Services IoT FleetWise campaign sends data.
     */

    public void setS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the Amazon Web Services IoT FleetWise campaign sends data.
     * </p>
     * 
     * @return The Amazon S3 bucket where the Amazon Web Services IoT FleetWise campaign sends data.
     */

    public S3Config getS3Config() {
        return this.s3Config;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the Amazon Web Services IoT FleetWise campaign sends data.
     * </p>
     * 
     * @param s3Config
     *        The Amazon S3 bucket where the Amazon Web Services IoT FleetWise campaign sends data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDestinationConfig withS3Config(S3Config s3Config) {
        setS3Config(s3Config);
        return this;
    }

    /**
     * <p>
     * The Amazon Timestream table where the campaign sends data.
     * </p>
     * 
     * @param timestreamConfig
     *        The Amazon Timestream table where the campaign sends data.
     */

    public void setTimestreamConfig(TimestreamConfig timestreamConfig) {
        this.timestreamConfig = timestreamConfig;
    }

    /**
     * <p>
     * The Amazon Timestream table where the campaign sends data.
     * </p>
     * 
     * @return The Amazon Timestream table where the campaign sends data.
     */

    public TimestreamConfig getTimestreamConfig() {
        return this.timestreamConfig;
    }

    /**
     * <p>
     * The Amazon Timestream table where the campaign sends data.
     * </p>
     * 
     * @param timestreamConfig
     *        The Amazon Timestream table where the campaign sends data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDestinationConfig withTimestreamConfig(TimestreamConfig timestreamConfig) {
        setTimestreamConfig(timestreamConfig);
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
        if (getS3Config() != null)
            sb.append("S3Config: ").append(getS3Config()).append(",");
        if (getTimestreamConfig() != null)
            sb.append("TimestreamConfig: ").append(getTimestreamConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataDestinationConfig == false)
            return false;
        DataDestinationConfig other = (DataDestinationConfig) obj;
        if (other.getS3Config() == null ^ this.getS3Config() == null)
            return false;
        if (other.getS3Config() != null && other.getS3Config().equals(this.getS3Config()) == false)
            return false;
        if (other.getTimestreamConfig() == null ^ this.getTimestreamConfig() == null)
            return false;
        if (other.getTimestreamConfig() != null && other.getTimestreamConfig().equals(this.getTimestreamConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Config() == null) ? 0 : getS3Config().hashCode());
        hashCode = prime * hashCode + ((getTimestreamConfig() == null) ? 0 : getTimestreamConfig().hashCode());
        return hashCode;
    }

    @Override
    public DataDestinationConfig clone() {
        try {
            return (DataDestinationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.DataDestinationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
