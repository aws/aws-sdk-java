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
 * The source configuration object of a media capture pipeline.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MediaCapturePipelineSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaCapturePipelineSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The media pipeline ARN in the configuration object of a media capture pipeline.
     * </p>
     */
    private String mediaPipelineArn;
    /**
     * <p>
     * The meeting configuration settings in a media capture pipeline configuration object.
     * </p>
     */
    private ChimeSdkMeetingConcatenationConfiguration chimeSdkMeetingConfiguration;

    /**
     * <p>
     * The media pipeline ARN in the configuration object of a media capture pipeline.
     * </p>
     * 
     * @param mediaPipelineArn
     *        The media pipeline ARN in the configuration object of a media capture pipeline.
     */

    public void setMediaPipelineArn(String mediaPipelineArn) {
        this.mediaPipelineArn = mediaPipelineArn;
    }

    /**
     * <p>
     * The media pipeline ARN in the configuration object of a media capture pipeline.
     * </p>
     * 
     * @return The media pipeline ARN in the configuration object of a media capture pipeline.
     */

    public String getMediaPipelineArn() {
        return this.mediaPipelineArn;
    }

    /**
     * <p>
     * The media pipeline ARN in the configuration object of a media capture pipeline.
     * </p>
     * 
     * @param mediaPipelineArn
     *        The media pipeline ARN in the configuration object of a media capture pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaCapturePipelineSourceConfiguration withMediaPipelineArn(String mediaPipelineArn) {
        setMediaPipelineArn(mediaPipelineArn);
        return this;
    }

    /**
     * <p>
     * The meeting configuration settings in a media capture pipeline configuration object.
     * </p>
     * 
     * @param chimeSdkMeetingConfiguration
     *        The meeting configuration settings in a media capture pipeline configuration object.
     */

    public void setChimeSdkMeetingConfiguration(ChimeSdkMeetingConcatenationConfiguration chimeSdkMeetingConfiguration) {
        this.chimeSdkMeetingConfiguration = chimeSdkMeetingConfiguration;
    }

    /**
     * <p>
     * The meeting configuration settings in a media capture pipeline configuration object.
     * </p>
     * 
     * @return The meeting configuration settings in a media capture pipeline configuration object.
     */

    public ChimeSdkMeetingConcatenationConfiguration getChimeSdkMeetingConfiguration() {
        return this.chimeSdkMeetingConfiguration;
    }

    /**
     * <p>
     * The meeting configuration settings in a media capture pipeline configuration object.
     * </p>
     * 
     * @param chimeSdkMeetingConfiguration
     *        The meeting configuration settings in a media capture pipeline configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaCapturePipelineSourceConfiguration withChimeSdkMeetingConfiguration(ChimeSdkMeetingConcatenationConfiguration chimeSdkMeetingConfiguration) {
        setChimeSdkMeetingConfiguration(chimeSdkMeetingConfiguration);
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
        if (getMediaPipelineArn() != null)
            sb.append("MediaPipelineArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getChimeSdkMeetingConfiguration() != null)
            sb.append("ChimeSdkMeetingConfiguration: ").append(getChimeSdkMeetingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaCapturePipelineSourceConfiguration == false)
            return false;
        MediaCapturePipelineSourceConfiguration other = (MediaCapturePipelineSourceConfiguration) obj;
        if (other.getMediaPipelineArn() == null ^ this.getMediaPipelineArn() == null)
            return false;
        if (other.getMediaPipelineArn() != null && other.getMediaPipelineArn().equals(this.getMediaPipelineArn()) == false)
            return false;
        if (other.getChimeSdkMeetingConfiguration() == null ^ this.getChimeSdkMeetingConfiguration() == null)
            return false;
        if (other.getChimeSdkMeetingConfiguration() != null && other.getChimeSdkMeetingConfiguration().equals(this.getChimeSdkMeetingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaPipelineArn() == null) ? 0 : getMediaPipelineArn().hashCode());
        hashCode = prime * hashCode + ((getChimeSdkMeetingConfiguration() == null) ? 0 : getChimeSdkMeetingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public MediaCapturePipelineSourceConfiguration clone() {
        try {
            return (MediaCapturePipelineSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MediaCapturePipelineSourceConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
