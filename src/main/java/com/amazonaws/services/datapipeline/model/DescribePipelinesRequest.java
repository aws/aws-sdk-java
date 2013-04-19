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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#describePipelines(DescribePipelinesRequest) DescribePipelines operation}.
 * <p>
 * Retrieve metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the pipeline identifier, its current
 * state, and the user account that owns the pipeline. Using account credentials, you can retrieve metadata about pipelines that you or your IAM users
 * have created. If you are using an IAM user account, you can retrieve metadata about only those pipelines you have read permission for.
 * </p>
 * <p>
 * To retrieve the full pipeline definition instead of metadata about the pipeline, call the GetPipelineDefinition action.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#describePipelines(DescribePipelinesRequest)
 */
public class DescribePipelinesRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * Identifiers of the pipelines to describe. You can pass as many as 25
     * identifiers in a single call to DescribePipelines. You can obtain
     * pipeline identifiers by calling ListPipelines.
     */
    private java.util.List<String> pipelineIds;

    /**
     * Identifiers of the pipelines to describe. You can pass as many as 25
     * identifiers in a single call to DescribePipelines. You can obtain
     * pipeline identifiers by calling ListPipelines.
     *
     * @return Identifiers of the pipelines to describe. You can pass as many as 25
     *         identifiers in a single call to DescribePipelines. You can obtain
     *         pipeline identifiers by calling ListPipelines.
     */
    public java.util.List<String> getPipelineIds() {
        
        if (pipelineIds == null) {
            pipelineIds = new java.util.ArrayList<String>();
        }
        return pipelineIds;
    }
    
    /**
     * Identifiers of the pipelines to describe. You can pass as many as 25
     * identifiers in a single call to DescribePipelines. You can obtain
     * pipeline identifiers by calling ListPipelines.
     *
     * @param pipelineIds Identifiers of the pipelines to describe. You can pass as many as 25
     *         identifiers in a single call to DescribePipelines. You can obtain
     *         pipeline identifiers by calling ListPipelines.
     */
    public void setPipelineIds(java.util.Collection<String> pipelineIds) {
        if (pipelineIds == null) {
            this.pipelineIds = null;
            return;
        }

        java.util.List<String> pipelineIdsCopy = new java.util.ArrayList<String>(pipelineIds.size());
        pipelineIdsCopy.addAll(pipelineIds);
        this.pipelineIds = pipelineIdsCopy;
    }
    
    /**
     * Identifiers of the pipelines to describe. You can pass as many as 25
     * identifiers in a single call to DescribePipelines. You can obtain
     * pipeline identifiers by calling ListPipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineIds Identifiers of the pipelines to describe. You can pass as many as 25
     *         identifiers in a single call to DescribePipelines. You can obtain
     *         pipeline identifiers by calling ListPipelines.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePipelinesRequest withPipelineIds(String... pipelineIds) {
        if (getPipelineIds() == null) setPipelineIds(new java.util.ArrayList<String>(pipelineIds.length));
        for (String value : pipelineIds) {
            getPipelineIds().add(value);
        }
        return this;
    }
    
    /**
     * Identifiers of the pipelines to describe. You can pass as many as 25
     * identifiers in a single call to DescribePipelines. You can obtain
     * pipeline identifiers by calling ListPipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineIds Identifiers of the pipelines to describe. You can pass as many as 25
     *         identifiers in a single call to DescribePipelines. You can obtain
     *         pipeline identifiers by calling ListPipelines.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePipelinesRequest withPipelineIds(java.util.Collection<String> pipelineIds) {
        if (pipelineIds == null) {
            this.pipelineIds = null;
        } else {
            java.util.List<String> pipelineIdsCopy = new java.util.ArrayList<String>(pipelineIds.size());
            pipelineIdsCopy.addAll(pipelineIds);
            this.pipelineIds = pipelineIdsCopy;
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
        if (getPipelineIds() != null) sb.append("PipelineIds: " + getPipelineIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineIds() == null) ? 0 : getPipelineIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePipelinesRequest == false) return false;
        DescribePipelinesRequest other = (DescribePipelinesRequest)obj;
        
        if (other.getPipelineIds() == null ^ this.getPipelineIds() == null) return false;
        if (other.getPipelineIds() != null && other.getPipelineIds().equals(this.getPipelineIds()) == false) return false; 
        return true;
    }
    
}
    