/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>UpdatePipelineNotificationsResponse</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipelineNotificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A section of the response body that provides information about the pipeline associated with this notification.
     * </p>
     */
    private Pipeline pipeline;

    /**
     * <p>
     * A section of the response body that provides information about the pipeline associated with this notification.
     * </p>
     * 
     * @param pipeline
     *        A section of the response body that provides information about the pipeline associated with this
     *        notification.
     */

    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * <p>
     * A section of the response body that provides information about the pipeline associated with this notification.
     * </p>
     * 
     * @return A section of the response body that provides information about the pipeline associated with this
     *         notification.
     */

    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * <p>
     * A section of the response body that provides information about the pipeline associated with this notification.
     * </p>
     * 
     * @param pipeline
     *        A section of the response body that provides information about the pipeline associated with this
     *        notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineNotificationsResult withPipeline(Pipeline pipeline) {
        setPipeline(pipeline);
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
        if (getPipeline() != null)
            sb.append("Pipeline: ").append(getPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePipelineNotificationsResult == false)
            return false;
        UpdatePipelineNotificationsResult other = (UpdatePipelineNotificationsResult) obj;
        if (other.getPipeline() == null ^ this.getPipeline() == null)
            return false;
        if (other.getPipeline() != null && other.getPipeline().equals(this.getPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipeline() == null) ? 0 : getPipeline().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipelineNotificationsResult clone() {
        try {
            return (UpdatePipelineNotificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
