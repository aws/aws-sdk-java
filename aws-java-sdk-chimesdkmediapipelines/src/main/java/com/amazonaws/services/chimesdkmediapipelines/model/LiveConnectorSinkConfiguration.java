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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The media pipeline's sink configuration settings.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/LiveConnectorSinkConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LiveConnectorSinkConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sink configuration's sink type.
     * </p>
     */
    private String sinkType;
    /**
     * <p>
     * The sink configuration's RTMP configuration setttings.
     * </p>
     */
    private LiveConnectorRTMPConfiguration rTMPConfiguration;

    /**
     * <p>
     * The sink configuration's sink type.
     * </p>
     * 
     * @param sinkType
     *        The sink configuration's sink type.
     * @see LiveConnectorSinkType
     */

    public void setSinkType(String sinkType) {
        this.sinkType = sinkType;
    }

    /**
     * <p>
     * The sink configuration's sink type.
     * </p>
     * 
     * @return The sink configuration's sink type.
     * @see LiveConnectorSinkType
     */

    public String getSinkType() {
        return this.sinkType;
    }

    /**
     * <p>
     * The sink configuration's sink type.
     * </p>
     * 
     * @param sinkType
     *        The sink configuration's sink type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LiveConnectorSinkType
     */

    public LiveConnectorSinkConfiguration withSinkType(String sinkType) {
        setSinkType(sinkType);
        return this;
    }

    /**
     * <p>
     * The sink configuration's sink type.
     * </p>
     * 
     * @param sinkType
     *        The sink configuration's sink type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LiveConnectorSinkType
     */

    public LiveConnectorSinkConfiguration withSinkType(LiveConnectorSinkType sinkType) {
        this.sinkType = sinkType.toString();
        return this;
    }

    /**
     * <p>
     * The sink configuration's RTMP configuration setttings.
     * </p>
     * 
     * @param rTMPConfiguration
     *        The sink configuration's RTMP configuration setttings.
     */

    public void setRTMPConfiguration(LiveConnectorRTMPConfiguration rTMPConfiguration) {
        this.rTMPConfiguration = rTMPConfiguration;
    }

    /**
     * <p>
     * The sink configuration's RTMP configuration setttings.
     * </p>
     * 
     * @return The sink configuration's RTMP configuration setttings.
     */

    public LiveConnectorRTMPConfiguration getRTMPConfiguration() {
        return this.rTMPConfiguration;
    }

    /**
     * <p>
     * The sink configuration's RTMP configuration setttings.
     * </p>
     * 
     * @param rTMPConfiguration
     *        The sink configuration's RTMP configuration setttings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LiveConnectorSinkConfiguration withRTMPConfiguration(LiveConnectorRTMPConfiguration rTMPConfiguration) {
        setRTMPConfiguration(rTMPConfiguration);
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
        if (getSinkType() != null)
            sb.append("SinkType: ").append(getSinkType()).append(",");
        if (getRTMPConfiguration() != null)
            sb.append("RTMPConfiguration: ").append(getRTMPConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LiveConnectorSinkConfiguration == false)
            return false;
        LiveConnectorSinkConfiguration other = (LiveConnectorSinkConfiguration) obj;
        if (other.getSinkType() == null ^ this.getSinkType() == null)
            return false;
        if (other.getSinkType() != null && other.getSinkType().equals(this.getSinkType()) == false)
            return false;
        if (other.getRTMPConfiguration() == null ^ this.getRTMPConfiguration() == null)
            return false;
        if (other.getRTMPConfiguration() != null && other.getRTMPConfiguration().equals(this.getRTMPConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSinkType() == null) ? 0 : getSinkType().hashCode());
        hashCode = prime * hashCode + ((getRTMPConfiguration() == null) ? 0 : getRTMPConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public LiveConnectorSinkConfiguration clone() {
        try {
            return (LiveConnectorSinkConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.LiveConnectorSinkConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
