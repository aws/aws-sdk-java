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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaLiveConnectorPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaLiveConnectorPipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The new media pipeline.
     * </p>
     */
    private MediaLiveConnectorPipeline mediaLiveConnectorPipeline;

    /**
     * <p>
     * The new media pipeline.
     * </p>
     * 
     * @param mediaLiveConnectorPipeline
     *        The new media pipeline.
     */

    public void setMediaLiveConnectorPipeline(MediaLiveConnectorPipeline mediaLiveConnectorPipeline) {
        this.mediaLiveConnectorPipeline = mediaLiveConnectorPipeline;
    }

    /**
     * <p>
     * The new media pipeline.
     * </p>
     * 
     * @return The new media pipeline.
     */

    public MediaLiveConnectorPipeline getMediaLiveConnectorPipeline() {
        return this.mediaLiveConnectorPipeline;
    }

    /**
     * <p>
     * The new media pipeline.
     * </p>
     * 
     * @param mediaLiveConnectorPipeline
     *        The new media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaLiveConnectorPipelineResult withMediaLiveConnectorPipeline(MediaLiveConnectorPipeline mediaLiveConnectorPipeline) {
        setMediaLiveConnectorPipeline(mediaLiveConnectorPipeline);
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
        if (getMediaLiveConnectorPipeline() != null)
            sb.append("MediaLiveConnectorPipeline: ").append(getMediaLiveConnectorPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMediaLiveConnectorPipelineResult == false)
            return false;
        CreateMediaLiveConnectorPipelineResult other = (CreateMediaLiveConnectorPipelineResult) obj;
        if (other.getMediaLiveConnectorPipeline() == null ^ this.getMediaLiveConnectorPipeline() == null)
            return false;
        if (other.getMediaLiveConnectorPipeline() != null && other.getMediaLiveConnectorPipeline().equals(this.getMediaLiveConnectorPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaLiveConnectorPipeline() == null) ? 0 : getMediaLiveConnectorPipeline().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaLiveConnectorPipelineResult clone() {
        try {
            return (CreateMediaLiveConnectorPipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
