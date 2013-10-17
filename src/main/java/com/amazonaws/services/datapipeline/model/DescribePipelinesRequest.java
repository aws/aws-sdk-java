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

import com.amazonaws.AmazonWebServiceRequest;

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
public class DescribePipelinesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Identifiers of the pipelines to describe. You can pass as many as 25
     * identifiers in a single call to <a>DescribePipelines</a>. You can
     * obtain pipeline identifiers by calling <a>ListPipelines</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> pipelineIds;

    /**
     * Identifiers of the pipelines to describe. You can pass as many as 25
     * identifiers in a single call to <a>DescribePipelines</a>. You can
     * obtain pipeline identifiers by calling <a>ListPipelines</a>.
     *
     * @return Identifiers of the pipelines to describe. You can pass as many as 25
     *         identifiers in a single call to <a>DescribePipelines</a>. You can
     *         obtain pipeline identifiers by calling <a>ListPipelines</a>.
     */
    public java.util.List<String> getPipelineIds() {
        if (pipelineIds == null) {
              pipelineIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              pipelineIds.setAutoConstruct(true);
        }
        return pipelineIds;
    }
    
    /**
     * Identifiers of the pipelines to describe. You can pass as many as 25
     * identifiers in a single call to <a>DescribePipelines</a>. You can
     * obtain pipeline identifiers by calling <a>ListPipelines</a>.
     *
     * @param pipelineIds Identifiers of the pipelines to describe. You can pass as many as 25
     *         identifiers in a single call to <a>DescribePipelines</a>. You can
     *         obtain pipeline identifiers by calling <a>ListPipelines</a>.
     */
    public void setPipelineIds(java.util.Collection<String> pipelineIds) {
        if (pipelineIds == null) {
            this.pipelineIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> pipelineIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(pipelineIds.size());
        pipelineIdsCopy.addAll(pipelineIds);
        this.pipelineIds = pipelineIdsCopy;
    }
    
    /**
     * Identifiers of the pipelines to describe. You can pass as many as 25
     * identifiers in a single call to <a>DescribePipelines</a>. You can
     * obtain pipeline identifiers by calling <a>ListPipelines</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineIds Identifiers of the pipelines to describe. You can pass as many as 25
     *         identifiers in a single call to <a>DescribePipelines</a>. You can
     *         obtain pipeline identifiers by calling <a>ListPipelines</a>.
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
     * identifiers in a single call to <a>DescribePipelines</a>. You can
     * obtain pipeline identifiers by calling <a>ListPipelines</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineIds Identifiers of the pipelines to describe. You can pass as many as 25
     *         identifiers in a single call to <a>DescribePipelines</a>. You can
     *         obtain pipeline identifiers by calling <a>ListPipelines</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribePipelinesRequest withPipelineIds(java.util.Collection<String> pipelineIds) {
        if (pipelineIds == null) {
            this.pipelineIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> pipelineIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(pipelineIds.size());
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
    