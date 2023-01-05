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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration object of the Amazon Chime SDK meeting for a specified media capture pipeline.
 * <code>SourceType</code> must be <code>ChimeSdkMeeting</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ChimeSdkMeetingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChimeSdkMeetingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source configuration for a specified media capture pipline.
     * </p>
     */
    private SourceConfiguration sourceConfiguration;
    /**
     * <p>
     * The configuration for the artifacts in an Amazon Chime SDK meeting.
     * </p>
     */
    private ArtifactsConfiguration artifactsConfiguration;

    /**
     * <p>
     * The source configuration for a specified media capture pipline.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source configuration for a specified media capture pipline.
     */

    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    /**
     * <p>
     * The source configuration for a specified media capture pipline.
     * </p>
     * 
     * @return The source configuration for a specified media capture pipline.
     */

    public SourceConfiguration getSourceConfiguration() {
        return this.sourceConfiguration;
    }

    /**
     * <p>
     * The source configuration for a specified media capture pipline.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source configuration for a specified media capture pipline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChimeSdkMeetingConfiguration withSourceConfiguration(SourceConfiguration sourceConfiguration) {
        setSourceConfiguration(sourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for the artifacts in an Amazon Chime SDK meeting.
     * </p>
     * 
     * @param artifactsConfiguration
     *        The configuration for the artifacts in an Amazon Chime SDK meeting.
     */

    public void setArtifactsConfiguration(ArtifactsConfiguration artifactsConfiguration) {
        this.artifactsConfiguration = artifactsConfiguration;
    }

    /**
     * <p>
     * The configuration for the artifacts in an Amazon Chime SDK meeting.
     * </p>
     * 
     * @return The configuration for the artifacts in an Amazon Chime SDK meeting.
     */

    public ArtifactsConfiguration getArtifactsConfiguration() {
        return this.artifactsConfiguration;
    }

    /**
     * <p>
     * The configuration for the artifacts in an Amazon Chime SDK meeting.
     * </p>
     * 
     * @param artifactsConfiguration
     *        The configuration for the artifacts in an Amazon Chime SDK meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChimeSdkMeetingConfiguration withArtifactsConfiguration(ArtifactsConfiguration artifactsConfiguration) {
        setArtifactsConfiguration(artifactsConfiguration);
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
        if (getSourceConfiguration() != null)
            sb.append("SourceConfiguration: ").append(getSourceConfiguration()).append(",");
        if (getArtifactsConfiguration() != null)
            sb.append("ArtifactsConfiguration: ").append(getArtifactsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChimeSdkMeetingConfiguration == false)
            return false;
        ChimeSdkMeetingConfiguration other = (ChimeSdkMeetingConfiguration) obj;
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null)
            return false;
        if (other.getSourceConfiguration() != null && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false)
            return false;
        if (other.getArtifactsConfiguration() == null ^ this.getArtifactsConfiguration() == null)
            return false;
        if (other.getArtifactsConfiguration() != null && other.getArtifactsConfiguration().equals(this.getArtifactsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getArtifactsConfiguration() == null) ? 0 : getArtifactsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ChimeSdkMeetingConfiguration clone() {
        try {
            return (ChimeSdkMeetingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ChimeSdkMeetingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
