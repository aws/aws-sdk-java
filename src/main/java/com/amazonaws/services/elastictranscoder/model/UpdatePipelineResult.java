/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * When you update a pipeline, Elastic Transcoder returns the values that you specified in the request.
 * </p>
 */
public class UpdatePipelineResult implements Serializable {

    /**
     * The pipeline (queue) that is used to manage jobs.
     */
    private Pipeline pipeline;

    /**
     * The pipeline (queue) that is used to manage jobs.
     *
     * @return The pipeline (queue) that is used to manage jobs.
     */
    public Pipeline getPipeline() {
        return pipeline;
    }
    
    /**
     * The pipeline (queue) that is used to manage jobs.
     *
     * @param pipeline The pipeline (queue) that is used to manage jobs.
     */
    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }
    
    /**
     * The pipeline (queue) that is used to manage jobs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipeline The pipeline (queue) that is used to manage jobs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineResult withPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPipeline() != null) sb.append("Pipeline: " + getPipeline() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipeline() == null) ? 0 : getPipeline().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdatePipelineResult == false) return false;
        UpdatePipelineResult other = (UpdatePipelineResult)obj;
        
        if (other.getPipeline() == null ^ this.getPipeline() == null) return false;
        if (other.getPipeline() != null && other.getPipeline().equals(this.getPipeline()) == false) return false; 
        return true;
    }
    
}
    