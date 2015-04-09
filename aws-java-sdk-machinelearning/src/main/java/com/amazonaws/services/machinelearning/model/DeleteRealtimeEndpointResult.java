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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of an DeleteRealtimeEndpoint operation.
 * </p>
 * <p>
 * The result contains the <code>MLModelId</code> and the endpoint
 * information for the <code>MLModel</code> .
 * </p>
 */
public class DeleteRealtimeEndpointResult implements Serializable, Cloneable {

    /**
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the
     * <code>MLModelId</code> in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * The endpoint information of the <code>MLModel</code>
     */
    private RealtimeEndpointInfo realtimeEndpointInfo;

    /**
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the
     * <code>MLModelId</code> in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     *         This value should be identical to the value of the
     *         <code>MLModelId</code> in the request.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the
     * <code>MLModelId</code> in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     *         This value should be identical to the value of the
     *         <code>MLModelId</code> in the request.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the
     * <code>MLModelId</code> in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     *         This value should be identical to the value of the
     *         <code>MLModelId</code> in the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteRealtimeEndpointResult withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * The endpoint information of the <code>MLModel</code>
     *
     * @return The endpoint information of the <code>MLModel</code>
     */
    public RealtimeEndpointInfo getRealtimeEndpointInfo() {
        return realtimeEndpointInfo;
    }
    
    /**
     * The endpoint information of the <code>MLModel</code>
     *
     * @param realtimeEndpointInfo The endpoint information of the <code>MLModel</code>
     */
    public void setRealtimeEndpointInfo(RealtimeEndpointInfo realtimeEndpointInfo) {
        this.realtimeEndpointInfo = realtimeEndpointInfo;
    }
    
    /**
     * The endpoint information of the <code>MLModel</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param realtimeEndpointInfo The endpoint information of the <code>MLModel</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteRealtimeEndpointResult withRealtimeEndpointInfo(RealtimeEndpointInfo realtimeEndpointInfo) {
        this.realtimeEndpointInfo = realtimeEndpointInfo;
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
        if (getMLModelId() != null) sb.append("MLModelId: " + getMLModelId() + ",");
        if (getRealtimeEndpointInfo() != null) sb.append("RealtimeEndpointInfo: " + getRealtimeEndpointInfo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode()); 
        hashCode = prime * hashCode + ((getRealtimeEndpointInfo() == null) ? 0 : getRealtimeEndpointInfo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteRealtimeEndpointResult == false) return false;
        DeleteRealtimeEndpointResult other = (DeleteRealtimeEndpointResult)obj;
        
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        if (other.getRealtimeEndpointInfo() == null ^ this.getRealtimeEndpointInfo() == null) return false;
        if (other.getRealtimeEndpointInfo() != null && other.getRealtimeEndpointInfo().equals(this.getRealtimeEndpointInfo()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteRealtimeEndpointResult clone() {
        try {
            return (DeleteRealtimeEndpointResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    