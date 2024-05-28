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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaInsightsPipelineConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMediaInsightsPipelineConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The requested media insights pipeline configuration.
     * </p>
     */
    private MediaInsightsPipelineConfiguration mediaInsightsPipelineConfiguration;

    /**
     * <p>
     * The requested media insights pipeline configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfiguration
     *        The requested media insights pipeline configuration.
     */

    public void setMediaInsightsPipelineConfiguration(MediaInsightsPipelineConfiguration mediaInsightsPipelineConfiguration) {
        this.mediaInsightsPipelineConfiguration = mediaInsightsPipelineConfiguration;
    }

    /**
     * <p>
     * The requested media insights pipeline configuration.
     * </p>
     * 
     * @return The requested media insights pipeline configuration.
     */

    public MediaInsightsPipelineConfiguration getMediaInsightsPipelineConfiguration() {
        return this.mediaInsightsPipelineConfiguration;
    }

    /**
     * <p>
     * The requested media insights pipeline configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfiguration
     *        The requested media insights pipeline configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaInsightsPipelineConfigurationResult withMediaInsightsPipelineConfiguration(
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

        if (obj instanceof GetMediaInsightsPipelineConfigurationResult == false)
            return false;
        GetMediaInsightsPipelineConfigurationResult other = (GetMediaInsightsPipelineConfigurationResult) obj;
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
    public GetMediaInsightsPipelineConfigurationResult clone() {
        try {
            return (GetMediaInsightsPipelineConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
