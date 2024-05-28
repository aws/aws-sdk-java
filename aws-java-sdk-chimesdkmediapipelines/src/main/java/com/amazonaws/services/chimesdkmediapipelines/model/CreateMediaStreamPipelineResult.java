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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaStreamPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaStreamPipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested media pipeline.
     * </p>
     */
    private MediaStreamPipeline mediaStreamPipeline;

    /**
     * <p>
     * The requested media pipeline.
     * </p>
     * 
     * @param mediaStreamPipeline
     *        The requested media pipeline.
     */

    public void setMediaStreamPipeline(MediaStreamPipeline mediaStreamPipeline) {
        this.mediaStreamPipeline = mediaStreamPipeline;
    }

    /**
     * <p>
     * The requested media pipeline.
     * </p>
     * 
     * @return The requested media pipeline.
     */

    public MediaStreamPipeline getMediaStreamPipeline() {
        return this.mediaStreamPipeline;
    }

    /**
     * <p>
     * The requested media pipeline.
     * </p>
     * 
     * @param mediaStreamPipeline
     *        The requested media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaStreamPipelineResult withMediaStreamPipeline(MediaStreamPipeline mediaStreamPipeline) {
        setMediaStreamPipeline(mediaStreamPipeline);
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
        if (getMediaStreamPipeline() != null)
            sb.append("MediaStreamPipeline: ").append(getMediaStreamPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMediaStreamPipelineResult == false)
            return false;
        CreateMediaStreamPipelineResult other = (CreateMediaStreamPipelineResult) obj;
        if (other.getMediaStreamPipeline() == null ^ this.getMediaStreamPipeline() == null)
            return false;
        if (other.getMediaStreamPipeline() != null && other.getMediaStreamPipeline().equals(this.getMediaStreamPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaStreamPipeline() == null) ? 0 : getMediaStreamPipeline().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaStreamPipelineResult clone() {
        try {
            return (CreateMediaStreamPipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
