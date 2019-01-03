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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of ListPipelines.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ListPipelines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pipeline identifiers. If you require additional information about the pipelines, you can use these
     * identifiers to call <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PipelineIdName> pipelineIdList;
    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call
     * <code>ListPipelinesOutput</code> again with this marker value. If the value is null, there are no more results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     */
    private Boolean hasMoreResults;

    /**
     * <p>
     * The pipeline identifiers. If you require additional information about the pipelines, you can use these
     * identifiers to call <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     * </p>
     * 
     * @return The pipeline identifiers. If you require additional information about the pipelines, you can use these
     *         identifiers to call <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     */

    public java.util.List<PipelineIdName> getPipelineIdList() {
        if (pipelineIdList == null) {
            pipelineIdList = new com.amazonaws.internal.SdkInternalList<PipelineIdName>();
        }
        return pipelineIdList;
    }

    /**
     * <p>
     * The pipeline identifiers. If you require additional information about the pipelines, you can use these
     * identifiers to call <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     * </p>
     * 
     * @param pipelineIdList
     *        The pipeline identifiers. If you require additional information about the pipelines, you can use these
     *        identifiers to call <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     */

    public void setPipelineIdList(java.util.Collection<PipelineIdName> pipelineIdList) {
        if (pipelineIdList == null) {
            this.pipelineIdList = null;
            return;
        }

        this.pipelineIdList = new com.amazonaws.internal.SdkInternalList<PipelineIdName>(pipelineIdList);
    }

    /**
     * <p>
     * The pipeline identifiers. If you require additional information about the pipelines, you can use these
     * identifiers to call <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineIdList(java.util.Collection)} or {@link #withPipelineIdList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param pipelineIdList
     *        The pipeline identifiers. If you require additional information about the pipelines, you can use these
     *        identifiers to call <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelineIdList(PipelineIdName... pipelineIdList) {
        if (this.pipelineIdList == null) {
            setPipelineIdList(new com.amazonaws.internal.SdkInternalList<PipelineIdName>(pipelineIdList.length));
        }
        for (PipelineIdName ele : pipelineIdList) {
            this.pipelineIdList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The pipeline identifiers. If you require additional information about the pipelines, you can use these
     * identifiers to call <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     * </p>
     * 
     * @param pipelineIdList
     *        The pipeline identifiers. If you require additional information about the pipelines, you can use these
     *        identifiers to call <a>DescribePipelines</a> and <a>GetPipelineDefinition</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelineIdList(java.util.Collection<PipelineIdName> pipelineIdList) {
        setPipelineIdList(pipelineIdList);
        return this;
    }

    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call
     * <code>ListPipelinesOutput</code> again with this marker value. If the value is null, there are no more results.
     * </p>
     * 
     * @param marker
     *        The starting point for the next page of results. To view the next page of results, call
     *        <code>ListPipelinesOutput</code> again with this marker value. If the value is null, there are no more
     *        results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call
     * <code>ListPipelinesOutput</code> again with this marker value. If the value is null, there are no more results.
     * </p>
     * 
     * @return The starting point for the next page of results. To view the next page of results, call
     *         <code>ListPipelinesOutput</code> again with this marker value. If the value is null, there are no more
     *         results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call
     * <code>ListPipelinesOutput</code> again with this marker value. If the value is null, there are no more results.
     * </p>
     * 
     * @param marker
     *        The starting point for the next page of results. To view the next page of results, call
     *        <code>ListPipelinesOutput</code> again with this marker value. If the value is null, there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     * 
     * @param hasMoreResults
     *        Indicates whether there are more results that can be obtained by a subsequent call.
     */

    public void setHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
    }

    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     * 
     * @return Indicates whether there are more results that can be obtained by a subsequent call.
     */

    public Boolean getHasMoreResults() {
        return this.hasMoreResults;
    }

    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     * 
     * @param hasMoreResults
     *        Indicates whether there are more results that can be obtained by a subsequent call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withHasMoreResults(Boolean hasMoreResults) {
        setHasMoreResults(hasMoreResults);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     * 
     * @return Indicates whether there are more results that can be obtained by a subsequent call.
     */

    public Boolean isHasMoreResults() {
        return this.hasMoreResults;
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
        if (getPipelineIdList() != null)
            sb.append("PipelineIdList: ").append(getPipelineIdList()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getHasMoreResults() != null)
            sb.append("HasMoreResults: ").append(getHasMoreResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPipelinesResult == false)
            return false;
        ListPipelinesResult other = (ListPipelinesResult) obj;
        if (other.getPipelineIdList() == null ^ this.getPipelineIdList() == null)
            return false;
        if (other.getPipelineIdList() != null && other.getPipelineIdList().equals(this.getPipelineIdList()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getHasMoreResults() == null ^ this.getHasMoreResults() == null)
            return false;
        if (other.getHasMoreResults() != null && other.getHasMoreResults().equals(this.getHasMoreResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineIdList() == null) ? 0 : getPipelineIdList().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getHasMoreResults() == null) ? 0 : getHasMoreResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelinesResult clone() {
        try {
            return (ListPipelinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
