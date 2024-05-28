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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of an Kinesis video stream.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/KinesisVideoStreamConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisVideoStreamConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Region of the video stream.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The amount of time that data is retained.
     * </p>
     */
    private Integer dataRetentionInHours;

    /**
     * <p>
     * The Amazon Web Services Region of the video stream.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region of the video stream.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the video stream.
     * </p>
     * 
     * @return The Amazon Web Services Region of the video stream.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the video stream.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region of the video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamConfiguration withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The amount of time that data is retained.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The amount of time that data is retained.
     */

    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * <p>
     * The amount of time that data is retained.
     * </p>
     * 
     * @return The amount of time that data is retained.
     */

    public Integer getDataRetentionInHours() {
        return this.dataRetentionInHours;
    }

    /**
     * <p>
     * The amount of time that data is retained.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The amount of time that data is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamConfiguration withDataRetentionInHours(Integer dataRetentionInHours) {
        setDataRetentionInHours(dataRetentionInHours);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getDataRetentionInHours() != null)
            sb.append("DataRetentionInHours: ").append(getDataRetentionInHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamConfiguration == false)
            return false;
        KinesisVideoStreamConfiguration other = (KinesisVideoStreamConfiguration) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getDataRetentionInHours() == null) ? 0 : getDataRetentionInHours().hashCode());
        return hashCode;
    }

    @Override
    public KinesisVideoStreamConfiguration clone() {
        try {
            return (KinesisVideoStreamConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.KinesisVideoStreamConfigurationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
