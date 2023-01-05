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
 * The configuration object of the Amazon Chime SDK meeting concatenation for a specified media pipeline.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ChimeSdkMeetingConcatenationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChimeSdkMeetingConcatenationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the artifacts in an Amazon Chime SDK meeting concatenation.
     * </p>
     */
    private ArtifactsConcatenationConfiguration artifactsConfiguration;

    /**
     * <p>
     * The configuration for the artifacts in an Amazon Chime SDK meeting concatenation.
     * </p>
     * 
     * @param artifactsConfiguration
     *        The configuration for the artifacts in an Amazon Chime SDK meeting concatenation.
     */

    public void setArtifactsConfiguration(ArtifactsConcatenationConfiguration artifactsConfiguration) {
        this.artifactsConfiguration = artifactsConfiguration;
    }

    /**
     * <p>
     * The configuration for the artifacts in an Amazon Chime SDK meeting concatenation.
     * </p>
     * 
     * @return The configuration for the artifacts in an Amazon Chime SDK meeting concatenation.
     */

    public ArtifactsConcatenationConfiguration getArtifactsConfiguration() {
        return this.artifactsConfiguration;
    }

    /**
     * <p>
     * The configuration for the artifacts in an Amazon Chime SDK meeting concatenation.
     * </p>
     * 
     * @param artifactsConfiguration
     *        The configuration for the artifacts in an Amazon Chime SDK meeting concatenation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChimeSdkMeetingConcatenationConfiguration withArtifactsConfiguration(ArtifactsConcatenationConfiguration artifactsConfiguration) {
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

        if (obj instanceof ChimeSdkMeetingConcatenationConfiguration == false)
            return false;
        ChimeSdkMeetingConcatenationConfiguration other = (ChimeSdkMeetingConcatenationConfiguration) obj;
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

        hashCode = prime * hashCode + ((getArtifactsConfiguration() == null) ? 0 : getArtifactsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ChimeSdkMeetingConcatenationConfiguration clone() {
        try {
            return (ChimeSdkMeetingConcatenationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.ChimeSdkMeetingConcatenationConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
