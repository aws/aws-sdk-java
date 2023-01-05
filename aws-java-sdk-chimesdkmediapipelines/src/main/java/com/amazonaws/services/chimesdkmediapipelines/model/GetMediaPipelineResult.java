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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMediaPipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The media pipeline object.
     * </p>
     */
    private MediaPipeline mediaPipeline;

    /**
     * <p>
     * The media pipeline object.
     * </p>
     * 
     * @param mediaPipeline
     *        The media pipeline object.
     */

    public void setMediaPipeline(MediaPipeline mediaPipeline) {
        this.mediaPipeline = mediaPipeline;
    }

    /**
     * <p>
     * The media pipeline object.
     * </p>
     * 
     * @return The media pipeline object.
     */

    public MediaPipeline getMediaPipeline() {
        return this.mediaPipeline;
    }

    /**
     * <p>
     * The media pipeline object.
     * </p>
     * 
     * @param mediaPipeline
     *        The media pipeline object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaPipelineResult withMediaPipeline(MediaPipeline mediaPipeline) {
        setMediaPipeline(mediaPipeline);
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
        if (getMediaPipeline() != null)
            sb.append("MediaPipeline: ").append(getMediaPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMediaPipelineResult == false)
            return false;
        GetMediaPipelineResult other = (GetMediaPipelineResult) obj;
        if (other.getMediaPipeline() == null ^ this.getMediaPipeline() == null)
            return false;
        if (other.getMediaPipeline() != null && other.getMediaPipeline().equals(this.getMediaPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaPipeline() == null) ? 0 : getMediaPipeline().hashCode());
        return hashCode;
    }

    @Override
    public GetMediaPipelineResult clone() {
        try {
            return (GetMediaPipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
