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
 * Contains the output from the ListPipelines action.
 * </p>
 */
public class ListPipelinesResult implements Serializable {

    /**
     * A list of all the pipeline identifiers that your account has
     * permission to access. If you require additional information about the
     * pipelines, you can use these identifiers to call
     * <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PipelineIdName> pipelineIdList;

    /**
     * If not null, indicates the starting point for the set of pipeline
     * identifiers that the next call to <a>ListPipelines</a> will retrieve.
     * If null, there are no more pipeline identifiers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String marker;

    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>ListPipelines</a>.
     */
    private Boolean hasMoreResults;

    /**
     * A list of all the pipeline identifiers that your account has
     * permission to access. If you require additional information about the
     * pipelines, you can use these identifiers to call
     * <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     *
     * @return A list of all the pipeline identifiers that your account has
     *         permission to access. If you require additional information about the
     *         pipelines, you can use these identifiers to call
     *         <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     */
    public java.util.List<PipelineIdName> getPipelineIdList() {
        if (pipelineIdList == null) {
              pipelineIdList = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineIdName>();
              pipelineIdList.setAutoConstruct(true);
        }
        return pipelineIdList;
    }
    
    /**
     * A list of all the pipeline identifiers that your account has
     * permission to access. If you require additional information about the
     * pipelines, you can use these identifiers to call
     * <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     *
     * @param pipelineIdList A list of all the pipeline identifiers that your account has
     *         permission to access. If you require additional information about the
     *         pipelines, you can use these identifiers to call
     *         <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     */
    public void setPipelineIdList(java.util.Collection<PipelineIdName> pipelineIdList) {
        if (pipelineIdList == null) {
            this.pipelineIdList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PipelineIdName> pipelineIdListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineIdName>(pipelineIdList.size());
        pipelineIdListCopy.addAll(pipelineIdList);
        this.pipelineIdList = pipelineIdListCopy;
    }
    
    /**
     * A list of all the pipeline identifiers that your account has
     * permission to access. If you require additional information about the
     * pipelines, you can use these identifiers to call
     * <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineIdList A list of all the pipeline identifiers that your account has
     *         permission to access. If you require additional information about the
     *         pipelines, you can use these identifiers to call
     *         <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPipelinesResult withPipelineIdList(PipelineIdName... pipelineIdList) {
        if (getPipelineIdList() == null) setPipelineIdList(new java.util.ArrayList<PipelineIdName>(pipelineIdList.length));
        for (PipelineIdName value : pipelineIdList) {
            getPipelineIdList().add(value);
        }
        return this;
    }
    
    /**
     * A list of all the pipeline identifiers that your account has
     * permission to access. If you require additional information about the
     * pipelines, you can use these identifiers to call
     * <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineIdList A list of all the pipeline identifiers that your account has
     *         permission to access. If you require additional information about the
     *         pipelines, you can use these identifiers to call
     *         <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPipelinesResult withPipelineIdList(java.util.Collection<PipelineIdName> pipelineIdList) {
        if (pipelineIdList == null) {
            this.pipelineIdList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PipelineIdName> pipelineIdListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineIdName>(pipelineIdList.size());
            pipelineIdListCopy.addAll(pipelineIdList);
            this.pipelineIdList = pipelineIdListCopy;
        }

        return this;
    }

    /**
     * If not null, indicates the starting point for the set of pipeline
     * identifiers that the next call to <a>ListPipelines</a> will retrieve.
     * If null, there are no more pipeline identifiers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return If not null, indicates the starting point for the set of pipeline
     *         identifiers that the next call to <a>ListPipelines</a> will retrieve.
     *         If null, there are no more pipeline identifiers.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If not null, indicates the starting point for the set of pipeline
     * identifiers that the next call to <a>ListPipelines</a> will retrieve.
     * If null, there are no more pipeline identifiers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param marker If not null, indicates the starting point for the set of pipeline
     *         identifiers that the next call to <a>ListPipelines</a> will retrieve.
     *         If null, there are no more pipeline identifiers.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If not null, indicates the starting point for the set of pipeline
     * identifiers that the next call to <a>ListPipelines</a> will retrieve.
     * If null, there are no more pipeline identifiers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param marker If not null, indicates the starting point for the set of pipeline
     *         identifiers that the next call to <a>ListPipelines</a> will retrieve.
     *         If null, there are no more pipeline identifiers.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPipelinesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>ListPipelines</a>.
     *
     * @return If <code>True</code>, there are more results that can be obtained by a
     *         subsequent call to <a>ListPipelines</a>.
     */
    public Boolean isHasMoreResults() {
        return hasMoreResults;
    }
    
    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>ListPipelines</a>.
     *
     * @param hasMoreResults If <code>True</code>, there are more results that can be obtained by a
     *         subsequent call to <a>ListPipelines</a>.
     */
    public void setHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
    }
    
    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>ListPipelines</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hasMoreResults If <code>True</code>, there are more results that can be obtained by a
     *         subsequent call to <a>ListPipelines</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPipelinesResult withHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
        return this;
    }

    /**
     * If <code>True</code>, there are more results that can be obtained by a
     * subsequent call to <a>ListPipelines</a>.
     *
     * @return If <code>True</code>, there are more results that can be obtained by a
     *         subsequent call to <a>ListPipelines</a>.
     */
    public Boolean getHasMoreResults() {
        return hasMoreResults;
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
        if (getPipelineIdList() != null) sb.append("PipelineIdList: " + getPipelineIdList() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isHasMoreResults() != null) sb.append("HasMoreResults: " + isHasMoreResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineIdList() == null) ? 0 : getPipelineIdList().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isHasMoreResults() == null) ? 0 : isHasMoreResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPipelinesResult == false) return false;
        ListPipelinesResult other = (ListPipelinesResult)obj;
        
        if (other.getPipelineIdList() == null ^ this.getPipelineIdList() == null) return false;
        if (other.getPipelineIdList() != null && other.getPipelineIdList().equals(this.getPipelineIdList()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isHasMoreResults() == null ^ this.isHasMoreResults() == null) return false;
        if (other.isHasMoreResults() != null && other.isHasMoreResults().equals(this.isHasMoreResults()) == false) return false; 
        return true;
    }
    
}
    