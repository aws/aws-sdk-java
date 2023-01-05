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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The recorder configuration consists of the local <code>MediaSourceConfig</code> details that are used as credentials
 * to accesss the local media files streamed on the camera.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/RecorderConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecorderConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration details that consist of the credentials required (<code>MediaUriSecretArn</code> and
     * <code>MediaUriType</code>) to access the media files streamed to the camera.
     * </p>
     */
    private MediaSourceConfig mediaSourceConfig;
    /**
     * <p>
     * The configuration that consists of the <code>ScheduleExpression</code> and the <code>DurationInMinutes</code>
     * details that specify the scheduling to record from a camera, or local media file, onto the Edge Agent. If the
     * <code>ScheduleExpression</code> attribute is not provided, then the Edge Agent will always be set to recording
     * mode.
     * </p>
     */
    private ScheduleConfig scheduleConfig;

    /**
     * <p>
     * The configuration details that consist of the credentials required (<code>MediaUriSecretArn</code> and
     * <code>MediaUriType</code>) to access the media files streamed to the camera.
     * </p>
     * 
     * @param mediaSourceConfig
     *        The configuration details that consist of the credentials required (<code>MediaUriSecretArn</code> and
     *        <code>MediaUriType</code>) to access the media files streamed to the camera.
     */

    public void setMediaSourceConfig(MediaSourceConfig mediaSourceConfig) {
        this.mediaSourceConfig = mediaSourceConfig;
    }

    /**
     * <p>
     * The configuration details that consist of the credentials required (<code>MediaUriSecretArn</code> and
     * <code>MediaUriType</code>) to access the media files streamed to the camera.
     * </p>
     * 
     * @return The configuration details that consist of the credentials required (<code>MediaUriSecretArn</code> and
     *         <code>MediaUriType</code>) to access the media files streamed to the camera.
     */

    public MediaSourceConfig getMediaSourceConfig() {
        return this.mediaSourceConfig;
    }

    /**
     * <p>
     * The configuration details that consist of the credentials required (<code>MediaUriSecretArn</code> and
     * <code>MediaUriType</code>) to access the media files streamed to the camera.
     * </p>
     * 
     * @param mediaSourceConfig
     *        The configuration details that consist of the credentials required (<code>MediaUriSecretArn</code> and
     *        <code>MediaUriType</code>) to access the media files streamed to the camera.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecorderConfig withMediaSourceConfig(MediaSourceConfig mediaSourceConfig) {
        setMediaSourceConfig(mediaSourceConfig);
        return this;
    }

    /**
     * <p>
     * The configuration that consists of the <code>ScheduleExpression</code> and the <code>DurationInMinutes</code>
     * details that specify the scheduling to record from a camera, or local media file, onto the Edge Agent. If the
     * <code>ScheduleExpression</code> attribute is not provided, then the Edge Agent will always be set to recording
     * mode.
     * </p>
     * 
     * @param scheduleConfig
     *        The configuration that consists of the <code>ScheduleExpression</code> and the
     *        <code>DurationInMinutes</code> details that specify the scheduling to record from a camera, or local media
     *        file, onto the Edge Agent. If the <code>ScheduleExpression</code> attribute is not provided, then the Edge
     *        Agent will always be set to recording mode.
     */

    public void setScheduleConfig(ScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
    }

    /**
     * <p>
     * The configuration that consists of the <code>ScheduleExpression</code> and the <code>DurationInMinutes</code>
     * details that specify the scheduling to record from a camera, or local media file, onto the Edge Agent. If the
     * <code>ScheduleExpression</code> attribute is not provided, then the Edge Agent will always be set to recording
     * mode.
     * </p>
     * 
     * @return The configuration that consists of the <code>ScheduleExpression</code> and the
     *         <code>DurationInMinutes</code> details that specify the scheduling to record from a camera, or local
     *         media file, onto the Edge Agent. If the <code>ScheduleExpression</code> attribute is not provided, then
     *         the Edge Agent will always be set to recording mode.
     */

    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * <p>
     * The configuration that consists of the <code>ScheduleExpression</code> and the <code>DurationInMinutes</code>
     * details that specify the scheduling to record from a camera, or local media file, onto the Edge Agent. If the
     * <code>ScheduleExpression</code> attribute is not provided, then the Edge Agent will always be set to recording
     * mode.
     * </p>
     * 
     * @param scheduleConfig
     *        The configuration that consists of the <code>ScheduleExpression</code> and the
     *        <code>DurationInMinutes</code> details that specify the scheduling to record from a camera, or local media
     *        file, onto the Edge Agent. If the <code>ScheduleExpression</code> attribute is not provided, then the Edge
     *        Agent will always be set to recording mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecorderConfig withScheduleConfig(ScheduleConfig scheduleConfig) {
        setScheduleConfig(scheduleConfig);
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
        if (getMediaSourceConfig() != null)
            sb.append("MediaSourceConfig: ").append(getMediaSourceConfig()).append(",");
        if (getScheduleConfig() != null)
            sb.append("ScheduleConfig: ").append(getScheduleConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecorderConfig == false)
            return false;
        RecorderConfig other = (RecorderConfig) obj;
        if (other.getMediaSourceConfig() == null ^ this.getMediaSourceConfig() == null)
            return false;
        if (other.getMediaSourceConfig() != null && other.getMediaSourceConfig().equals(this.getMediaSourceConfig()) == false)
            return false;
        if (other.getScheduleConfig() == null ^ this.getScheduleConfig() == null)
            return false;
        if (other.getScheduleConfig() != null && other.getScheduleConfig().equals(this.getScheduleConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaSourceConfig() == null) ? 0 : getMediaSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getScheduleConfig() == null) ? 0 : getScheduleConfig().hashCode());
        return hashCode;
    }

    @Override
    public RecorderConfig clone() {
        try {
            return (RecorderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.RecorderConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
