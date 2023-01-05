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
 * The media pipeline's configuration object.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ChimeSdkMeetingLiveConnectorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChimeSdkMeetingLiveConnectorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration object's Chime SDK meeting ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The configuration object's multiplex type.
     * </p>
     */
    private String muxType;
    /**
     * <p>
     * The media pipeline's composited video.
     * </p>
     */
    private CompositedVideoArtifactsConfiguration compositedVideo;
    /**
     * <p>
     * The source configuration settings of the media pipeline's configuration object.
     * </p>
     */
    private SourceConfiguration sourceConfiguration;

    /**
     * <p>
     * The configuration object's Chime SDK meeting ARN.
     * </p>
     * 
     * @param arn
     *        The configuration object's Chime SDK meeting ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The configuration object's Chime SDK meeting ARN.
     * </p>
     * 
     * @return The configuration object's Chime SDK meeting ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The configuration object's Chime SDK meeting ARN.
     * </p>
     * 
     * @param arn
     *        The configuration object's Chime SDK meeting ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChimeSdkMeetingLiveConnectorConfiguration withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The configuration object's multiplex type.
     * </p>
     * 
     * @param muxType
     *        The configuration object's multiplex type.
     * @see LiveConnectorMuxType
     */

    public void setMuxType(String muxType) {
        this.muxType = muxType;
    }

    /**
     * <p>
     * The configuration object's multiplex type.
     * </p>
     * 
     * @return The configuration object's multiplex type.
     * @see LiveConnectorMuxType
     */

    public String getMuxType() {
        return this.muxType;
    }

    /**
     * <p>
     * The configuration object's multiplex type.
     * </p>
     * 
     * @param muxType
     *        The configuration object's multiplex type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LiveConnectorMuxType
     */

    public ChimeSdkMeetingLiveConnectorConfiguration withMuxType(String muxType) {
        setMuxType(muxType);
        return this;
    }

    /**
     * <p>
     * The configuration object's multiplex type.
     * </p>
     * 
     * @param muxType
     *        The configuration object's multiplex type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LiveConnectorMuxType
     */

    public ChimeSdkMeetingLiveConnectorConfiguration withMuxType(LiveConnectorMuxType muxType) {
        this.muxType = muxType.toString();
        return this;
    }

    /**
     * <p>
     * The media pipeline's composited video.
     * </p>
     * 
     * @param compositedVideo
     *        The media pipeline's composited video.
     */

    public void setCompositedVideo(CompositedVideoArtifactsConfiguration compositedVideo) {
        this.compositedVideo = compositedVideo;
    }

    /**
     * <p>
     * The media pipeline's composited video.
     * </p>
     * 
     * @return The media pipeline's composited video.
     */

    public CompositedVideoArtifactsConfiguration getCompositedVideo() {
        return this.compositedVideo;
    }

    /**
     * <p>
     * The media pipeline's composited video.
     * </p>
     * 
     * @param compositedVideo
     *        The media pipeline's composited video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChimeSdkMeetingLiveConnectorConfiguration withCompositedVideo(CompositedVideoArtifactsConfiguration compositedVideo) {
        setCompositedVideo(compositedVideo);
        return this;
    }

    /**
     * <p>
     * The source configuration settings of the media pipeline's configuration object.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source configuration settings of the media pipeline's configuration object.
     */

    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    /**
     * <p>
     * The source configuration settings of the media pipeline's configuration object.
     * </p>
     * 
     * @return The source configuration settings of the media pipeline's configuration object.
     */

    public SourceConfiguration getSourceConfiguration() {
        return this.sourceConfiguration;
    }

    /**
     * <p>
     * The source configuration settings of the media pipeline's configuration object.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source configuration settings of the media pipeline's configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChimeSdkMeetingLiveConnectorConfiguration withSourceConfiguration(SourceConfiguration sourceConfiguration) {
        setSourceConfiguration(sourceConfiguration);
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
        if (getArn() != null)
            sb.append("Arn: ").append("***Sensitive Data Redacted***").append(",");
        if (getMuxType() != null)
            sb.append("MuxType: ").append(getMuxType()).append(",");
        if (getCompositedVideo() != null)
            sb.append("CompositedVideo: ").append(getCompositedVideo()).append(",");
        if (getSourceConfiguration() != null)
            sb.append("SourceConfiguration: ").append(getSourceConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChimeSdkMeetingLiveConnectorConfiguration == false)
            return false;
        ChimeSdkMeetingLiveConnectorConfiguration other = (ChimeSdkMeetingLiveConnectorConfiguration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getMuxType() == null ^ this.getMuxType() == null)
            return false;
        if (other.getMuxType() != null && other.getMuxType().equals(this.getMuxType()) == false)
            return false;
        if (other.getCompositedVideo() == null ^ this.getCompositedVideo() == null)
            return false;
        if (other.getCompositedVideo() != null && other.getCompositedVideo().equals(this.getCompositedVideo()) == false)
            return false;
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null)
            return false;
        if (other.getSourceConfiguration() != null && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMuxType() == null) ? 0 : getMuxType().hashCode());
        hashCode = prime * hashCode + ((getCompositedVideo() == null) ? 0 : getCompositedVideo().hashCode());
        hashCode = prime * hashCode + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ChimeSdkMeetingLiveConnectorConfiguration clone() {
        try {
            return (ChimeSdkMeetingLiveConnectorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.ChimeSdkMeetingLiveConnectorConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
