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
 * Contains the output from the DescribePipelines action.
 * </p>
 */
public class DescribePipelinesResult implements Serializable {

    /**
     * An array of descriptions returned for the specified pipelines.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PipelineDescription> pipelineDescriptionList;

    /**
     * An array of descriptions returned for the specified pipelines.
     *
     * @return An array of descriptions returned for the specified pipelines.
     */
    public java.util.List<PipelineDescription> getPipelineDescriptionList() {
        if (pipelineDescriptionList == null) {
              pipelineDescriptionList = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineDescription>();
              pipelineDescriptionList.setAutoConstruct(true);
        }
        return pipelineDescriptionList;
    }
    
    /**
     * An array of descriptions returned for the specified pipelines.
     *
     * @param pipelineDescriptionList An array of descriptions returned for the specified pipelines.
     */
    public void setPipelineDescriptionList(java.util.Collection<PipelineDescription> pipelineDescriptionList) {
        if (pipelineDescriptionList == null) {
            this.pipelineDescriptionList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PipelineDescription> pipelineDescriptionListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineDescription>(pipelineDescriptionList.size());
        pipelineDescriptionListCopy.addAll(pipelineDescriptionList);
        this.pipelineDescriptionList = pipelineDescriptionListCopy;
    }
    
    /**
     * An array of descriptions returned for the specified pipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineDescriptionList An array of descriptions returned for the specified pipelines.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribePipelinesResult withPipelineDescriptionList(PipelineDescription... pipelineDescriptionList) {
        if (getPipelineDescriptionList() == null) setPipelineDescriptionList(new java.util.ArrayList<PipelineDescription>(pipelineDescriptionList.length));
        for (PipelineDescription value : pipelineDescriptionList) {
            getPipelineDescriptionList().add(value);
        }
        return this;
    }
    
    /**
     * An array of descriptions returned for the specified pipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineDescriptionList An array of descriptions returned for the specified pipelines.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribePipelinesResult withPipelineDescriptionList(java.util.Collection<PipelineDescription> pipelineDescriptionList) {
        if (pipelineDescriptionList == null) {
            this.pipelineDescriptionList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PipelineDescription> pipelineDescriptionListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineDescription>(pipelineDescriptionList.size());
            pipelineDescriptionListCopy.addAll(pipelineDescriptionList);
            this.pipelineDescriptionList = pipelineDescriptionListCopy;
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
        if (getPipelineDescriptionList() != null) sb.append("PipelineDescriptionList: " + getPipelineDescriptionList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineDescriptionList() == null) ? 0 : getPipelineDescriptionList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePipelinesResult == false) return false;
        DescribePipelinesResult other = (DescribePipelinesResult)obj;
        
        if (other.getPipelineDescriptionList() == null ^ this.getPipelineDescriptionList() == null) return false;
        if (other.getPipelineDescriptionList() != null && other.getPipelineDescriptionList().equals(this.getPipelineDescriptionList()) == false) return false; 
        return true;
    }
    
}
    