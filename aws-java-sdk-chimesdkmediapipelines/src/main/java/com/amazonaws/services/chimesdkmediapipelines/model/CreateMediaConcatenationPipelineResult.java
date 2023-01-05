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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaConcatenationPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaConcatenationPipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A media concatenation pipeline object, the ID, source type, <code>MediaPipelineARN</code>, and sink of a media
     * concatenation pipeline object.
     * </p>
     */
    private MediaConcatenationPipeline mediaConcatenationPipeline;

    /**
     * <p>
     * A media concatenation pipeline object, the ID, source type, <code>MediaPipelineARN</code>, and sink of a media
     * concatenation pipeline object.
     * </p>
     * 
     * @param mediaConcatenationPipeline
     *        A media concatenation pipeline object, the ID, source type, <code>MediaPipelineARN</code>, and sink of a
     *        media concatenation pipeline object.
     */

    public void setMediaConcatenationPipeline(MediaConcatenationPipeline mediaConcatenationPipeline) {
        this.mediaConcatenationPipeline = mediaConcatenationPipeline;
    }

    /**
     * <p>
     * A media concatenation pipeline object, the ID, source type, <code>MediaPipelineARN</code>, and sink of a media
     * concatenation pipeline object.
     * </p>
     * 
     * @return A media concatenation pipeline object, the ID, source type, <code>MediaPipelineARN</code>, and sink of a
     *         media concatenation pipeline object.
     */

    public MediaConcatenationPipeline getMediaConcatenationPipeline() {
        return this.mediaConcatenationPipeline;
    }

    /**
     * <p>
     * A media concatenation pipeline object, the ID, source type, <code>MediaPipelineARN</code>, and sink of a media
     * concatenation pipeline object.
     * </p>
     * 
     * @param mediaConcatenationPipeline
     *        A media concatenation pipeline object, the ID, source type, <code>MediaPipelineARN</code>, and sink of a
     *        media concatenation pipeline object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaConcatenationPipelineResult withMediaConcatenationPipeline(MediaConcatenationPipeline mediaConcatenationPipeline) {
        setMediaConcatenationPipeline(mediaConcatenationPipeline);
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
        if (getMediaConcatenationPipeline() != null)
            sb.append("MediaConcatenationPipeline: ").append(getMediaConcatenationPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMediaConcatenationPipelineResult == false)
            return false;
        CreateMediaConcatenationPipelineResult other = (CreateMediaConcatenationPipelineResult) obj;
        if (other.getMediaConcatenationPipeline() == null ^ this.getMediaConcatenationPipeline() == null)
            return false;
        if (other.getMediaConcatenationPipeline() != null && other.getMediaConcatenationPipeline().equals(this.getMediaConcatenationPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaConcatenationPipeline() == null) ? 0 : getMediaConcatenationPipeline().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaConcatenationPipelineResult clone() {
        try {
            return (CreateMediaConcatenationPipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
