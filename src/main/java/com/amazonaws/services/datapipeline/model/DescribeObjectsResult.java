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
 * If <code>True</code> , there are more results that can be returned in another call to DescribeObjects.
 * </p>
 */
public class DescribeObjectsResult implements Serializable {

    /**
     * An array of object definitions that are returned by the call to
     * <a>DescribeObjects</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjects;

    /**
     * The starting point for the next page of results. To view the next page
     * of results, call <a>DescribeObjects</a> again with this marker value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String marker;

    /**
     * If <code>True</code>, there are more pages of results to return.
     */
    private Boolean hasMoreResults;

    /**
     * An array of object definitions that are returned by the call to
     * <a>DescribeObjects</a>.
     *
     * @return An array of object definitions that are returned by the call to
     *         <a>DescribeObjects</a>.
     */
    public java.util.List<PipelineObject> getPipelineObjects() {
        if (pipelineObjects == null) {
              pipelineObjects = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>();
              pipelineObjects.setAutoConstruct(true);
        }
        return pipelineObjects;
    }
    
    /**
     * An array of object definitions that are returned by the call to
     * <a>DescribeObjects</a>.
     *
     * @param pipelineObjects An array of object definitions that are returned by the call to
     *         <a>DescribeObjects</a>.
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
     * An array of object definitions that are returned by the call to
     * <a>DescribeObjects</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineObjects An array of object definitions that are returned by the call to
     *         <a>DescribeObjects</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeObjectsResult withPipelineObjects(PipelineObject... pipelineObjects) {
        if (getPipelineObjects() == null) setPipelineObjects(new java.util.ArrayList<PipelineObject>(pipelineObjects.length));
        for (PipelineObject value : pipelineObjects) {
            getPipelineObjects().add(value);
        }
        return this;
    }
    
    /**
     * An array of object definitions that are returned by the call to
     * <a>DescribeObjects</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineObjects An array of object definitions that are returned by the call to
     *         <a>DescribeObjects</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeObjectsResult withPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
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
     * The starting point for the next page of results. To view the next page
     * of results, call <a>DescribeObjects</a> again with this marker value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The starting point for the next page of results. To view the next page
     *         of results, call <a>DescribeObjects</a> again with this marker value.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The starting point for the next page of results. To view the next page
     * of results, call <a>DescribeObjects</a> again with this marker value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the next page of results. To view the next page
     *         of results, call <a>DescribeObjects</a> again with this marker value.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The starting point for the next page of results. To view the next page
     * of results, call <a>DescribeObjects</a> again with this marker value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the next page of results. To view the next page
     *         of results, call <a>DescribeObjects</a> again with this marker value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeObjectsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * If <code>True</code>, there are more pages of results to return.
     *
     * @return If <code>True</code>, there are more pages of results to return.
     */
    public Boolean isHasMoreResults() {
        return hasMoreResults;
    }
    
    /**
     * If <code>True</code>, there are more pages of results to return.
     *
     * @param hasMoreResults If <code>True</code>, there are more pages of results to return.
     */
    public void setHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
    }
    
    /**
     * If <code>True</code>, there are more pages of results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hasMoreResults If <code>True</code>, there are more pages of results to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeObjectsResult withHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
        return this;
    }

    /**
     * If <code>True</code>, there are more pages of results to return.
     *
     * @return If <code>True</code>, there are more pages of results to return.
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
        if (getPipelineObjects() != null) sb.append("PipelineObjects: " + getPipelineObjects() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isHasMoreResults() != null) sb.append("HasMoreResults: " + isHasMoreResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineObjects() == null) ? 0 : getPipelineObjects().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isHasMoreResults() == null) ? 0 : isHasMoreResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeObjectsResult == false) return false;
        DescribeObjectsResult other = (DescribeObjectsResult)obj;
        
        if (other.getPipelineObjects() == null ^ this.getPipelineObjects() == null) return false;
        if (other.getPipelineObjects() != null && other.getPipelineObjects().equals(this.getPipelineObjects()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isHasMoreResults() == null ^ this.isHasMoreResults() == null) return false;
        if (other.isHasMoreResults() != null && other.isHasMoreResults().equals(this.isHasMoreResults()) == false) return false; 
        return true;
    }
    
}
    