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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaPipelineKinesisVideoStreamPool"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMediaPipelineKinesisVideoStreamPoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the video stream pool.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The configuration settings for the video stream.
     * </p>
     */
    private KinesisVideoStreamConfigurationUpdate streamConfiguration;

    /**
     * <p>
     * The ID of the video stream pool.
     * </p>
     * 
     * @param identifier
     *        The ID of the video stream pool.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The ID of the video stream pool.
     * </p>
     * 
     * @return The ID of the video stream pool.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The ID of the video stream pool.
     * </p>
     * 
     * @param identifier
     *        The ID of the video stream pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMediaPipelineKinesisVideoStreamPoolRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the video stream.
     * </p>
     * 
     * @param streamConfiguration
     *        The configuration settings for the video stream.
     */

    public void setStreamConfiguration(KinesisVideoStreamConfigurationUpdate streamConfiguration) {
        this.streamConfiguration = streamConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the video stream.
     * </p>
     * 
     * @return The configuration settings for the video stream.
     */

    public KinesisVideoStreamConfigurationUpdate getStreamConfiguration() {
        return this.streamConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the video stream.
     * </p>
     * 
     * @param streamConfiguration
     *        The configuration settings for the video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMediaPipelineKinesisVideoStreamPoolRequest withStreamConfiguration(KinesisVideoStreamConfigurationUpdate streamConfiguration) {
        setStreamConfiguration(streamConfiguration);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getStreamConfiguration() != null)
            sb.append("StreamConfiguration: ").append(getStreamConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMediaPipelineKinesisVideoStreamPoolRequest == false)
            return false;
        UpdateMediaPipelineKinesisVideoStreamPoolRequest other = (UpdateMediaPipelineKinesisVideoStreamPoolRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getStreamConfiguration() == null ^ this.getStreamConfiguration() == null)
            return false;
        if (other.getStreamConfiguration() != null && other.getStreamConfiguration().equals(this.getStreamConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStreamConfiguration() == null) ? 0 : getStreamConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMediaPipelineKinesisVideoStreamPoolRequest clone() {
        return (UpdateMediaPipelineKinesisVideoStreamPoolRequest) super.clone();
    }

}
