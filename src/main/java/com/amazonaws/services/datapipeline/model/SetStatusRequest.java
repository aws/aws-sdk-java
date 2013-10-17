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
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#setStatus(SetStatusRequest) SetStatus operation}.
 * <p>
 * Requests that the status of an array of physical or logical pipeline objects be updated in the pipeline. This update may not occur immediately, but is
 * eventually consistent. The status that can be set depends on the type of object.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#setStatus(SetStatusRequest)
 */
public class SetStatusRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Identifies the pipeline that contains the objects.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * Identifies an array of objects. The corresponding objects can be
     * either physical or components, but not a mix of both types.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> objectIds;

    /**
     * Specifies the status to be set on all the objects in
     * <code>objectIds</code>. For components, this can be either
     * <code>PAUSE</code> or <code>RESUME</code>. For instances, this can be
     * either <code>CANCEL</code>, <code>RERUN</code>, or
     * <code>MARK_FINISHED</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String status;

    /**
     * Identifies the pipeline that contains the objects.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Identifies the pipeline that contains the objects.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * Identifies the pipeline that contains the objects.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId Identifies the pipeline that contains the objects.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * Identifies the pipeline that contains the objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId Identifies the pipeline that contains the objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetStatusRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Identifies an array of objects. The corresponding objects can be
     * either physical or components, but not a mix of both types.
     *
     * @return Identifies an array of objects. The corresponding objects can be
     *         either physical or components, but not a mix of both types.
     */
    public java.util.List<String> getObjectIds() {
        if (objectIds == null) {
              objectIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              objectIds.setAutoConstruct(true);
        }
        return objectIds;
    }
    
    /**
     * Identifies an array of objects. The corresponding objects can be
     * either physical or components, but not a mix of both types.
     *
     * @param objectIds Identifies an array of objects. The corresponding objects can be
     *         either physical or components, but not a mix of both types.
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
     * Identifies an array of objects. The corresponding objects can be
     * either physical or components, but not a mix of both types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param objectIds Identifies an array of objects. The corresponding objects can be
     *         either physical or components, but not a mix of both types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetStatusRequest withObjectIds(String... objectIds) {
        if (getObjectIds() == null) setObjectIds(new java.util.ArrayList<String>(objectIds.length));
        for (String value : objectIds) {
            getObjectIds().add(value);
        }
        return this;
    }
    
    /**
     * Identifies an array of objects. The corresponding objects can be
     * either physical or components, but not a mix of both types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param objectIds Identifies an array of objects. The corresponding objects can be
     *         either physical or components, but not a mix of both types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetStatusRequest withObjectIds(java.util.Collection<String> objectIds) {
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
     * Specifies the status to be set on all the objects in
     * <code>objectIds</code>. For components, this can be either
     * <code>PAUSE</code> or <code>RESUME</code>. For instances, this can be
     * either <code>CANCEL</code>, <code>RERUN</code>, or
     * <code>MARK_FINISHED</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the status to be set on all the objects in
     *         <code>objectIds</code>. For components, this can be either
     *         <code>PAUSE</code> or <code>RESUME</code>. For instances, this can be
     *         either <code>CANCEL</code>, <code>RERUN</code>, or
     *         <code>MARK_FINISHED</code>.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Specifies the status to be set on all the objects in
     * <code>objectIds</code>. For components, this can be either
     * <code>PAUSE</code> or <code>RESUME</code>. For instances, this can be
     * either <code>CANCEL</code>, <code>RERUN</code>, or
     * <code>MARK_FINISHED</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param status Specifies the status to be set on all the objects in
     *         <code>objectIds</code>. For components, this can be either
     *         <code>PAUSE</code> or <code>RESUME</code>. For instances, this can be
     *         either <code>CANCEL</code>, <code>RERUN</code>, or
     *         <code>MARK_FINISHED</code>.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Specifies the status to be set on all the objects in
     * <code>objectIds</code>. For components, this can be either
     * <code>PAUSE</code> or <code>RESUME</code>. For instances, this can be
     * either <code>CANCEL</code>, <code>RERUN</code>, or
     * <code>MARK_FINISHED</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param status Specifies the status to be set on all the objects in
     *         <code>objectIds</code>. For components, this can be either
     *         <code>PAUSE</code> or <code>RESUME</code>. For instances, this can be
     *         either <code>CANCEL</code>, <code>RERUN</code>, or
     *         <code>MARK_FINISHED</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetStatusRequest withStatus(String status) {
        this.status = status;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getObjectIds() == null) ? 0 : getObjectIds().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetStatusRequest == false) return false;
        SetStatusRequest other = (SetStatusRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getObjectIds() == null ^ this.getObjectIds() == null) return false;
        if (other.getObjectIds() != null && other.getObjectIds().equals(this.getObjectIds()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    