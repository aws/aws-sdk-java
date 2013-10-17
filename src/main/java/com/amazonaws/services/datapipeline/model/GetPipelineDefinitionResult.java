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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the output from the GetPipelineDefinition action.
 * </p>
 */
public class GetPipelineDefinitionResult implements Serializable {

    /**
     * An array of objects defined in the pipeline.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjects;

    /**
     * An array of objects defined in the pipeline.
     *
     * @return An array of objects defined in the pipeline.
     */
    public java.util.List<PipelineObject> getPipelineObjects() {
        if (pipelineObjects == null) {
              pipelineObjects = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>();
              pipelineObjects.setAutoConstruct(true);
        }
        return pipelineObjects;
    }
    
    /**
     * An array of objects defined in the pipeline.
     *
     * @param pipelineObjects An array of objects defined in the pipeline.
     */
    public void setPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        if (pipelineObjects == null) {
            this.pipelineObjects = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>(pipelineObjects.size());
        pipelineObjectsCopy.addAll(pipelineObjects);
        this.pipelineObjects = pipelineObjectsCopy;
    }
    
    /**
     * An array of objects defined in the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineObjects An array of objects defined in the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetPipelineDefinitionResult withPipelineObjects(PipelineObject... pipelineObjects) {
        if (getPipelineObjects() == null) setPipelineObjects(new java.util.ArrayList<PipelineObject>(pipelineObjects.length));
        for (PipelineObject value : pipelineObjects) {
            getPipelineObjects().add(value);
        }
        return this;
    }
    
    /**
     * An array of objects defined in the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineObjects An array of objects defined in the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetPipelineDefinitionResult withPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        if (pipelineObjects == null) {
            this.pipelineObjects = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>(pipelineObjects.size());
            pipelineObjectsCopy.addAll(pipelineObjects);
            this.pipelineObjects = pipelineObjectsCopy;
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
        if (getPipelineObjects() != null) sb.append("PipelineObjects: " + getPipelineObjects() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineObjects() == null) ? 0 : getPipelineObjects().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPipelineDefinitionResult == false) return false;
        GetPipelineDefinitionResult other = (GetPipelineDefinitionResult)obj;
        
        if (other.getPipelineObjects() == null ^ this.getPipelineObjects() == null) return false;
        if (other.getPipelineObjects() != null && other.getPipelineObjects().equals(this.getPipelineObjects()) == false) return false; 
        return true;
    }
    
}
    