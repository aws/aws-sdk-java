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
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#getMLModel(GetMLModelRequest) GetMLModel operation}.
 * <p>
 * Returns an <code>MLModel</code> that includes detailed metadata, and
 * data source information as well as the current status of the
 * <code>MLModel</code> .
 * </p>
 * <p>
 * <code>GetMLModel</code> provides results in normal or verbose format.
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#getMLModel(GetMLModelRequest)
 */
public class GetMLModelRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID assigned to the <code>MLModel</code> at creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>. <p>If true, <code>Recipe</code> is returned.
     * <p>If false, <code>Recipe</code> is not returned.
     */
    private Boolean verbose;

    /**
     * The ID assigned to the <code>MLModel</code> at creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID assigned to the <code>MLModel</code> at creation.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * The ID assigned to the <code>MLModel</code> at creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID assigned to the <code>MLModel</code> at creation.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * The ID assigned to the <code>MLModel</code> at creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID assigned to the <code>MLModel</code> at creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetMLModelRequest withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>. <p>If true, <code>Recipe</code> is returned.
     * <p>If false, <code>Recipe</code> is not returned.
     *
     * @return Specifies whether the <code>GetMLModel</code> operation should return
     *         <code>Recipe</code>. <p>If true, <code>Recipe</code> is returned.
     *         <p>If false, <code>Recipe</code> is not returned.
     */
    public Boolean isVerbose() {
        return verbose;
    }
    
    /**
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>. <p>If true, <code>Recipe</code> is returned.
     * <p>If false, <code>Recipe</code> is not returned.
     *
     * @param verbose Specifies whether the <code>GetMLModel</code> operation should return
     *         <code>Recipe</code>. <p>If true, <code>Recipe</code> is returned.
     *         <p>If false, <code>Recipe</code> is not returned.
     */
    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }
    
    /**
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>. <p>If true, <code>Recipe</code> is returned.
     * <p>If false, <code>Recipe</code> is not returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param verbose Specifies whether the <code>GetMLModel</code> operation should return
     *         <code>Recipe</code>. <p>If true, <code>Recipe</code> is returned.
     *         <p>If false, <code>Recipe</code> is not returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetMLModelRequest withVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }

    /**
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>. <p>If true, <code>Recipe</code> is returned.
     * <p>If false, <code>Recipe</code> is not returned.
     *
     * @return Specifies whether the <code>GetMLModel</code> operation should return
     *         <code>Recipe</code>. <p>If true, <code>Recipe</code> is returned.
     *         <p>If false, <code>Recipe</code> is not returned.
     */
    public Boolean getVerbose() {
        return verbose;
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
        if (isVerbose() != null) sb.append("Verbose: " + isVerbose() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode()); 
        hashCode = prime * hashCode + ((isVerbose() == null) ? 0 : isVerbose().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetMLModelRequest == false) return false;
        GetMLModelRequest other = (GetMLModelRequest)obj;
        
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        if (other.isVerbose() == null ^ this.isVerbose() == null) return false;
        if (other.isVerbose() != null && other.isVerbose().equals(this.isVerbose()) == false) return false; 
        return true;
    }
    
    @Override
    public GetMLModelRequest clone() {
        
            return (GetMLModelRequest) super.clone();
    }

}
    