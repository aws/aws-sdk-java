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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information of a Kinesis video stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/KinesisVideoStreamConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisVideoStreamConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The prefix of the video stream.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that
     * is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     */
    private Integer retentionPeriodHours;
    /**
     * <p>
     * The encryption configuration.
     * </p>
     */
    private EncryptionConfig encryptionConfig;

    /**
     * <p>
     * The prefix of the video stream.
     * </p>
     * 
     * @param prefix
     *        The prefix of the video stream.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix of the video stream.
     * </p>
     * 
     * @return The prefix of the video stream.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The prefix of the video stream.
     * </p>
     * 
     * @param prefix
     *        The prefix of the video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamConfig withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that
     * is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store
     *        that is associated with the stream.</p>
     *        <p>
     *        The default value is 0, indicating that the stream does not persist data.
     */

    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }

    /**
     * <p>
     * The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that
     * is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * 
     * @return The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data
     *         store that is associated with the stream.</p>
     *         <p>
     *         The default value is 0, indicating that the stream does not persist data.
     */

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    /**
     * <p>
     * The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that
     * is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store
     *        that is associated with the stream.</p>
     *        <p>
     *        The default value is 0, indicating that the stream does not persist data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamConfig withRetentionPeriodHours(Integer retentionPeriodHours) {
        setRetentionPeriodHours(retentionPeriodHours);
        return this;
    }

    /**
     * <p>
     * The encryption configuration.
     * </p>
     * 
     * @param encryptionConfig
     *        The encryption configuration.
     */

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * <p>
     * The encryption configuration.
     * </p>
     * 
     * @return The encryption configuration.
     */

    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * <p>
     * The encryption configuration.
     * </p>
     * 
     * @param encryptionConfig
     *        The encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamConfig withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
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
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getRetentionPeriodHours() != null)
            sb.append("RetentionPeriodHours: ").append(getRetentionPeriodHours()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamConfig == false)
            return false;
        KinesisVideoStreamConfig other = (KinesisVideoStreamConfig) obj;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getRetentionPeriodHours() == null ^ this.getRetentionPeriodHours() == null)
            return false;
        if (other.getRetentionPeriodHours() != null && other.getRetentionPeriodHours().equals(this.getRetentionPeriodHours()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriodHours() == null) ? 0 : getRetentionPeriodHours().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        return hashCode;
    }

    @Override
    public KinesisVideoStreamConfig clone() {
        try {
            return (KinesisVideoStreamConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.KinesisVideoStreamConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
