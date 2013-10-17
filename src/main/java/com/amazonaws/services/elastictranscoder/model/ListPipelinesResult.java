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
 * A list of the pipelines associated with the current AWS account.
 * </p>
 */
public class ListPipelinesResult implements Serializable {

    /**
     * An array of <code>Pipeline</code> objects.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Pipeline> pipelines;

    /**
     * An array of <code>Pipeline</code> objects.
     *
     * @return An array of <code>Pipeline</code> objects.
     */
    public java.util.List<Pipeline> getPipelines() {
        if (pipelines == null) {
              pipelines = new com.amazonaws.internal.ListWithAutoConstructFlag<Pipeline>();
              pipelines.setAutoConstruct(true);
        }
        return pipelines;
    }
    
    /**
     * An array of <code>Pipeline</code> objects.
     *
     * @param pipelines An array of <code>Pipeline</code> objects.
     */
    public void setPipelines(java.util.Collection<Pipeline> pipelines) {
        if (pipelines == null) {
            this.pipelines = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Pipeline> pipelinesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Pipeline>(pipelines.size());
        pipelinesCopy.addAll(pipelines);
        this.pipelines = pipelinesCopy;
    }
    
    /**
     * An array of <code>Pipeline</code> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelines An array of <code>Pipeline</code> objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPipelinesResult withPipelines(Pipeline... pipelines) {
        if (getPipelines() == null) setPipelines(new java.util.ArrayList<Pipeline>(pipelines.length));
        for (Pipeline value : pipelines) {
            getPipelines().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Pipeline</code> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelines An array of <code>Pipeline</code> objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPipelinesResult withPipelines(java.util.Collection<Pipeline> pipelines) {
        if (pipelines == null) {
            this.pipelines = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Pipeline> pipelinesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Pipeline>(pipelines.size());
            pipelinesCopy.addAll(pipelines);
            this.pipelines = pipelinesCopy;
        }

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
        if (getPipelines() != null) sb.append("Pipelines: " + getPipelines() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelines() == null) ? 0 : getPipelines().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPipelinesResult == false) return false;
        ListPipelinesResult other = (ListPipelinesResult)obj;
        
        if (other.getPipelines() == null ^ this.getPipelines() == null) return false;
        if (other.getPipelines() != null && other.getPipelines().equals(this.getPipelines()) == false) return false; 
        return true;
    }
    
}
    