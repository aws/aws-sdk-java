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
 * Contains the output from the CreatePipeline action.
 * </p>
 */
public class CreatePipelineResult implements Serializable {

    /**
     * The ID that AWS Data Pipeline assigns the newly created pipeline. The
     * ID is a string of the form: df-06372391ZG65EXAMPLE.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * The ID that AWS Data Pipeline assigns the newly created pipeline. The
     * ID is a string of the form: df-06372391ZG65EXAMPLE.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The ID that AWS Data Pipeline assigns the newly created pipeline. The
     *         ID is a string of the form: df-06372391ZG65EXAMPLE.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The ID that AWS Data Pipeline assigns the newly created pipeline. The
     * ID is a string of the form: df-06372391ZG65EXAMPLE.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID that AWS Data Pipeline assigns the newly created pipeline. The
     *         ID is a string of the form: df-06372391ZG65EXAMPLE.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The ID that AWS Data Pipeline assigns the newly created pipeline. The
     * ID is a string of the form: df-06372391ZG65EXAMPLE.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID that AWS Data Pipeline assigns the newly created pipeline. The
     *         ID is a string of the form: df-06372391ZG65EXAMPLE.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePipelineResult withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
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
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePipelineResult == false) return false;
        CreatePipelineResult other = (CreatePipelineResult)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        return true;
    }
    
}
    