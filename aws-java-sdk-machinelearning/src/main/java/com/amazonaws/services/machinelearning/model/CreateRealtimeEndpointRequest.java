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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#createRealtimeEndpoint(CreateRealtimeEndpointRequest) CreateRealtimeEndpoint operation}.
 * <p>
 * Creates a real-time endpoint for the <code>MLModel</code> . The
 * endpoint contains the URI of the <code>MLModel</code> ; that is, the
 * location to send real-time prediction requests for the specified
 * <code>MLModel</code> .
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#createRealtimeEndpoint(CreateRealtimeEndpointRequest)
 */
public class CreateRealtimeEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID assigned to the <code>MLModel</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * The ID assigned to the <code>MLModel</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID assigned to the <code>MLModel</code> during creation.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * The ID assigned to the <code>MLModel</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID assigned to the <code>MLModel</code> during creation.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * The ID assigned to the <code>MLModel</code> during creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID assigned to the <code>MLModel</code> during creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateRealtimeEndpointRequest withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
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
        if (getMLModelId() != null) sb.append("MLModelId: " + getMLModelId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateRealtimeEndpointRequest == false) return false;
        CreateRealtimeEndpointRequest other = (CreateRealtimeEndpointRequest)obj;
        
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateRealtimeEndpointRequest clone() {
        
            return (CreateRealtimeEndpointRequest) super.clone();
    }

}
    