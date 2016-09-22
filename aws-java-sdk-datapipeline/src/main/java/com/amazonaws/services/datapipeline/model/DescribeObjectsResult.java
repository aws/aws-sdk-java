/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the output of DescribeObjects.
 * </p>
 */
public class DescribeObjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of object definitions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PipelineObject> pipelineObjects;
    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call
     * <code>DescribeObjects</code> again with this marker value. If the value is null, there are no more results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Indicates whether there are more results to return.
     * </p>
     */
    private Boolean hasMoreResults;

    /**
     * <p>
     * An array of object definitions.
     * </p>
     * 
     * @return An array of object definitions.
     */

    public java.util.List<PipelineObject> getPipelineObjects() {
        if (pipelineObjects == null) {
            pipelineObjects = new com.amazonaws.internal.SdkInternalList<PipelineObject>();
        }
        return pipelineObjects;
    }

    /**
     * <p>
     * An array of object definitions.
     * </p>
     * 
     * @param pipelineObjects
     *        An array of object definitions.
     */

    public void setPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        if (pipelineObjects == null) {
            this.pipelineObjects = null;
            return;
        }

        this.pipelineObjects = new com.amazonaws.internal.SdkInternalList<PipelineObject>(pipelineObjects);
    }

    /**
     * <p>
     * An array of object definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineObjects(java.util.Collection)} or {@link #withPipelineObjects(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pipelineObjects
     *        An array of object definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeObjectsResult withPipelineObjects(PipelineObject... pipelineObjects) {
        if (this.pipelineObjects == null) {
            setPipelineObjects(new com.amazonaws.internal.SdkInternalList<PipelineObject>(pipelineObjects.length));
        }
        for (PipelineObject ele : pipelineObjects) {
            this.pipelineObjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of object definitions.
     * </p>
     * 
     * @param pipelineObjects
     *        An array of object definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeObjectsResult withPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        setPipelineObjects(pipelineObjects);
        return this;
    }

    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call
     * <code>DescribeObjects</code> again with this marker value. If the value is null, there are no more results.
     * </p>
     * 
     * @param marker
     *        The starting point for the next page of results. To view the next page of results, call
     *        <code>DescribeObjects</code> again with this marker value. If the value is null, there are no more
     *        results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call
     * <code>DescribeObjects</code> again with this marker value. If the value is null, there are no more results.
     * </p>
     * 
     * @return The starting point for the next page of results. To view the next page of results, call
     *         <code>DescribeObjects</code> again with this marker value. If the value is null, there are no more
     *         results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call
     * <code>DescribeObjects</code> again with this marker value. If the value is null, there are no more results.
     * </p>
     * 
     * @param marker
     *        The starting point for the next page of results. To view the next page of results, call
     *        <code>DescribeObjects</code> again with this marker value. If the value is null, there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeObjectsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more results to return.
     * </p>
     * 
     * @param hasMoreResults
     *        Indicates whether there are more results to return.
     */

    public void setHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
    }

    /**
     * <p>
     * Indicates whether there are more results to return.
     * </p>
     * 
     * @return Indicates whether there are more results to return.
     */

    public Boolean getHasMoreResults() {
        return this.hasMoreResults;
    }

    /**
     * <p>
     * Indicates whether there are more results to return.
     * </p>
     * 
     * @param hasMoreResults
     *        Indicates whether there are more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeObjectsResult withHasMoreResults(Boolean hasMoreResults) {
        setHasMoreResults(hasMoreResults);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more results to return.
     * </p>
     * 
     * @return Indicates whether there are more results to return.
     */

    public Boolean isHasMoreResults() {
        return this.hasMoreResults;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPipelineObjects() != null)
            sb.append("PipelineObjects: " + getPipelineObjects() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getHasMoreResults() != null)
            sb.append("HasMoreResults: " + getHasMoreResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeObjectsResult == false)
            return false;
        DescribeObjectsResult other = (DescribeObjectsResult) obj;
        if (other.getPipelineObjects() == null ^ this.getPipelineObjects() == null)
            return false;
        if (other.getPipelineObjects() != null && other.getPipelineObjects().equals(this.getPipelineObjects()) == false)
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

        hashCode = prime * hashCode + ((getPipelineObjects() == null) ? 0 : getPipelineObjects().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getHasMoreResults() == null) ? 0 : getHasMoreResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeObjectsResult clone() {
        try {
            return (DescribeObjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
