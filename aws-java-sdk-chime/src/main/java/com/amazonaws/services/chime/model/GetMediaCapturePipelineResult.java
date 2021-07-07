/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetMediaCapturePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMediaCapturePipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The media capture pipeline object.
     * </p>
     */
    private MediaCapturePipeline mediaCapturePipeline;

    /**
     * <p>
     * The media capture pipeline object.
     * </p>
     * 
     * @param mediaCapturePipeline
     *        The media capture pipeline object.
     */

    public void setMediaCapturePipeline(MediaCapturePipeline mediaCapturePipeline) {
        this.mediaCapturePipeline = mediaCapturePipeline;
    }

    /**
     * <p>
     * The media capture pipeline object.
     * </p>
     * 
     * @return The media capture pipeline object.
     */

    public MediaCapturePipeline getMediaCapturePipeline() {
        return this.mediaCapturePipeline;
    }

    /**
     * <p>
     * The media capture pipeline object.
     * </p>
     * 
     * @param mediaCapturePipeline
     *        The media capture pipeline object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaCapturePipelineResult withMediaCapturePipeline(MediaCapturePipeline mediaCapturePipeline) {
        setMediaCapturePipeline(mediaCapturePipeline);
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
        if (getMediaCapturePipeline() != null)
            sb.append("MediaCapturePipeline: ").append(getMediaCapturePipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMediaCapturePipelineResult == false)
            return false;
        GetMediaCapturePipelineResult other = (GetMediaCapturePipelineResult) obj;
        if (other.getMediaCapturePipeline() == null ^ this.getMediaCapturePipeline() == null)
            return false;
        if (other.getMediaCapturePipeline() != null && other.getMediaCapturePipeline().equals(this.getMediaCapturePipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaCapturePipeline() == null) ? 0 : getMediaCapturePipeline().hashCode());
        return hashCode;
    }

    @Override
    public GetMediaCapturePipelineResult clone() {
        try {
            return (GetMediaCapturePipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
