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
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#listPipelines(ListPipelinesRequest) ListPipelines operation}.
 * <p>
 * Returns a list of pipeline identifiers for all active pipelines. Identifiers are returned only for pipelines you have permission to access.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#listPipelines(ListPipelinesRequest)
 */
public class ListPipelinesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The starting point for the results to be returned. The first time you
     * call <a>ListPipelines</a>, this value should be empty. As long as the
     * action returns <code>HasMoreResults</code> as <code>True</code>, you
     * can call <a>ListPipelines</a> again and pass the marker value from the
     * response to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String marker;

    /**
     * The starting point for the results to be returned. The first time you
     * call <a>ListPipelines</a>, this value should be empty. As long as the
     * action returns <code>HasMoreResults</code> as <code>True</code>, you
     * can call <a>ListPipelines</a> again and pass the marker value from the
     * response to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The starting point for the results to be returned. The first time you
     *         call <a>ListPipelines</a>, this value should be empty. As long as the
     *         action returns <code>HasMoreResults</code> as <code>True</code>, you
     *         can call <a>ListPipelines</a> again and pass the marker value from the
     *         response to retrieve the next set of results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The starting point for the results to be returned. The first time you
     * call <a>ListPipelines</a>, this value should be empty. As long as the
     * action returns <code>HasMoreResults</code> as <code>True</code>, you
     * can call <a>ListPipelines</a> again and pass the marker value from the
     * response to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the results to be returned. The first time you
     *         call <a>ListPipelines</a>, this value should be empty. As long as the
     *         action returns <code>HasMoreResults</code> as <code>True</code>, you
     *         can call <a>ListPipelines</a> again and pass the marker value from the
     *         response to retrieve the next set of results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The starting point for the results to be returned. The first time you
     * call <a>ListPipelines</a>, this value should be empty. As long as the
     * action returns <code>HasMoreResults</code> as <code>True</code>, you
     * can call <a>ListPipelines</a> again and pass the marker value from the
     * response to retrieve the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the results to be returned. The first time you
     *         call <a>ListPipelines</a>, this value should be empty. As long as the
     *         action returns <code>HasMoreResults</code> as <code>True</code>, you
     *         can call <a>ListPipelines</a> again and pass the marker value from the
     *         response to retrieve the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPipelinesRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPipelinesRequest == false) return false;
        ListPipelinesRequest other = (ListPipelinesRequest)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    