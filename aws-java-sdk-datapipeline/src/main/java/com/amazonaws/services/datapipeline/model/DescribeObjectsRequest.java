/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#describeObjects(DescribeObjectsRequest) DescribeObjects operation}.
 * <p>
 * Gets the object definitions for a set of objects associated with the
 * pipeline. Object definitions are composed of a set of fields that
 * define the properties of the object.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#describeObjects(DescribeObjectsRequest)
 */
public class DescribeObjectsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the pipeline that contains the object definitions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * The IDs of the pipeline objects that contain the definitions to be
     * described. You can pass as many as 25 identifiers in a single call to
     * <code>DescribeObjects</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> objectIds;

    /**
     * Indicates whether any expressions in the object should be evaluated
     * when the object descriptions are returned.
     */
    private Boolean evaluateExpressions;

    /**
     * The starting point for the results to be returned. For the first call,
     * this value should be empty. As long as there are more results,
     * continue to call <code>DescribeObjects</code> with the marker value
     * from the previous call to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String marker;

    /**
     * The ID of the pipeline that contains the object definitions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the pipeline that contains the object definitions.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The ID of the pipeline that contains the object definitions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline that contains the object definitions.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The ID of the pipeline that contains the object definitions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline that contains the object definitions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeObjectsRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * The IDs of the pipeline objects that contain the definitions to be
     * described. You can pass as many as 25 identifiers in a single call to
     * <code>DescribeObjects</code>.
     *
     * @return The IDs of the pipeline objects that contain the definitions to be
     *         described. You can pass as many as 25 identifiers in a single call to
     *         <code>DescribeObjects</code>.
     */
    public java.util.List<String> getObjectIds() {
        if (objectIds == null) {
              objectIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              objectIds.setAutoConstruct(true);
        }
        return objectIds;
    }
    
    /**
     * The IDs of the pipeline objects that contain the definitions to be
     * described. You can pass as many as 25 identifiers in a single call to
     * <code>DescribeObjects</code>.
     *
     * @param objectIds The IDs of the pipeline objects that contain the definitions to be
     *         described. You can pass as many as 25 identifiers in a single call to
     *         <code>DescribeObjects</code>.
     */
    public void setObjectIds(java.util.Collection<String> objectIds) {
        if (objectIds == null) {
            this.objectIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> objectIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(objectIds.size());
        objectIdsCopy.addAll(objectIds);
        this.objectIds = objectIdsCopy;
    }
    
    /**
     * The IDs of the pipeline objects that contain the definitions to be
     * described. You can pass as many as 25 identifiers in a single call to
     * <code>DescribeObjects</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setObjectIds(java.util.Collection)} or {@link
     * #withObjectIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param objectIds The IDs of the pipeline objects that contain the definitions to be
     *         described. You can pass as many as 25 identifiers in a single call to
     *         <code>DescribeObjects</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeObjectsRequest withObjectIds(String... objectIds) {
        if (getObjectIds() == null) setObjectIds(new java.util.ArrayList<String>(objectIds.length));
        for (String value : objectIds) {
            getObjectIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the pipeline objects that contain the definitions to be
     * described. You can pass as many as 25 identifiers in a single call to
     * <code>DescribeObjects</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param objectIds The IDs of the pipeline objects that contain the definitions to be
     *         described. You can pass as many as 25 identifiers in a single call to
     *         <code>DescribeObjects</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeObjectsRequest withObjectIds(java.util.Collection<String> objectIds) {
        if (objectIds == null) {
            this.objectIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> objectIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(objectIds.size());
            objectIdsCopy.addAll(objectIds);
            this.objectIds = objectIdsCopy;
        }

        return this;
    }

    /**
     * Indicates whether any expressions in the object should be evaluated
     * when the object descriptions are returned.
     *
     * @return Indicates whether any expressions in the object should be evaluated
     *         when the object descriptions are returned.
     */
    public Boolean isEvaluateExpressions() {
        return evaluateExpressions;
    }
    
    /**
     * Indicates whether any expressions in the object should be evaluated
     * when the object descriptions are returned.
     *
     * @param evaluateExpressions Indicates whether any expressions in the object should be evaluated
     *         when the object descriptions are returned.
     */
    public void setEvaluateExpressions(Boolean evaluateExpressions) {
        this.evaluateExpressions = evaluateExpressions;
    }
    
    /**
     * Indicates whether any expressions in the object should be evaluated
     * when the object descriptions are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evaluateExpressions Indicates whether any expressions in the object should be evaluated
     *         when the object descriptions are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeObjectsRequest withEvaluateExpressions(Boolean evaluateExpressions) {
        this.evaluateExpressions = evaluateExpressions;
        return this;
    }

    /**
     * Indicates whether any expressions in the object should be evaluated
     * when the object descriptions are returned.
     *
     * @return Indicates whether any expressions in the object should be evaluated
     *         when the object descriptions are returned.
     */
    public Boolean getEvaluateExpressions() {
        return evaluateExpressions;
    }

    /**
     * The starting point for the results to be returned. For the first call,
     * this value should be empty. As long as there are more results,
     * continue to call <code>DescribeObjects</code> with the marker value
     * from the previous call to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The starting point for the results to be returned. For the first call,
     *         this value should be empty. As long as there are more results,
     *         continue to call <code>DescribeObjects</code> with the marker value
     *         from the previous call to retrieve the next set of results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The starting point for the results to be returned. For the first call,
     * this value should be empty. As long as there are more results,
     * continue to call <code>DescribeObjects</code> with the marker value
     * from the previous call to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the results to be returned. For the first call,
     *         this value should be empty. As long as there are more results,
     *         continue to call <code>DescribeObjects</code> with the marker value
     *         from the previous call to retrieve the next set of results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The starting point for the results to be returned. For the first call,
     * this value should be empty. As long as there are more results,
     * continue to call <code>DescribeObjects</code> with the marker value
     * from the previous call to retrieve the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the results to be returned. For the first call,
     *         this value should be empty. As long as there are more results,
     *         continue to call <code>DescribeObjects</code> with the marker value
     *         from the previous call to retrieve the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeObjectsRequest withMarker(String marker) {
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
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getObjectIds() != null) sb.append("ObjectIds: " + getObjectIds() + ",");
        if (isEvaluateExpressions() != null) sb.append("EvaluateExpressions: " + isEvaluateExpressions() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getObjectIds() == null) ? 0 : getObjectIds().hashCode()); 
        hashCode = prime * hashCode + ((isEvaluateExpressions() == null) ? 0 : isEvaluateExpressions().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeObjectsRequest == false) return false;
        DescribeObjectsRequest other = (DescribeObjectsRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getObjectIds() == null ^ this.getObjectIds() == null) return false;
        if (other.getObjectIds() != null && other.getObjectIds().equals(this.getObjectIds()) == false) return false; 
        if (other.isEvaluateExpressions() == null ^ this.isEvaluateExpressions() == null) return false;
        if (other.isEvaluateExpressions() != null && other.isEvaluateExpressions().equals(this.isEvaluateExpressions()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeObjectsRequest clone() {
        
            return (DescribeObjectsRequest) super.clone();
    }

}
    