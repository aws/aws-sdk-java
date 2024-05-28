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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipelineConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaInsightsPipelineConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The configuration settings for the media insights pipeline.
     * </p>
     */
    private MediaInsightsPipelineConfiguration mediaInsightsPipelineConfiguration;

    /**
     * <p>
     * The configuration settings for the media insights pipeline.
     * </p>
     * 
     * @param mediaInsightsPipelineConfiguration
     *        The configuration settings for the media insights pipeline.
     */

    public void setMediaInsightsPipelineConfiguration(MediaInsightsPipelineConfiguration mediaInsightsPipelineConfiguration) {
        this.mediaInsightsPipelineConfiguration = mediaInsightsPipelineConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the media insights pipeline.
     * </p>
     * 
     * @return The configuration settings for the media insights pipeline.
     */

    public MediaInsightsPipelineConfiguration getMediaInsightsPipelineConfiguration() {
        return this.mediaInsightsPipelineConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the media insights pipeline.
     * </p>
     * 
     * @param mediaInsightsPipelineConfiguration
     *        The configuration settings for the media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineConfigurationResult withMediaInsightsPipelineConfiguration(
            MediaInsightsPipelineConfiguration mediaInsightsPipelineConfiguration) {
        setMediaInsightsPipelineConfiguration(mediaInsightsPipelineConfiguration);
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
        if (getMediaInsightsPipelineConfiguration() != null)
            sb.append("MediaInsightsPipelineConfiguration: ").append(getMediaInsightsPipelineConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMediaInsightsPipelineConfigurationResult == false)
            return false;
        CreateMediaInsightsPipelineConfigurationResult other = (CreateMediaInsightsPipelineConfigurationResult) obj;
        if (other.getMediaInsightsPipelineConfiguration() == null ^ this.getMediaInsightsPipelineConfiguration() == null)
            return false;
        if (other.getMediaInsightsPipelineConfiguration() != null
                && other.getMediaInsightsPipelineConfiguration().equals(this.getMediaInsightsPipelineConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaInsightsPipelineConfiguration() == null) ? 0 : getMediaInsightsPipelineConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaInsightsPipelineConfigurationResult clone() {
        try {
            return (CreateMediaInsightsPipelineConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
