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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a get pipeline execution action.
 * </p>
 */
public class GetPipelineExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents information about the execution of a pipeline.
     * </p>
     */
    private PipelineExecution pipelineExecution;

    /**
     * <p>
     * Represents information about the execution of a pipeline.
     * </p>
     * 
     * @param pipelineExecution
     *        Represents information about the execution of a pipeline.
     */

    public void setPipelineExecution(PipelineExecution pipelineExecution) {
        this.pipelineExecution = pipelineExecution;
    }

    /**
     * <p>
     * Represents information about the execution of a pipeline.
     * </p>
     * 
     * @return Represents information about the execution of a pipeline.
     */

    public PipelineExecution getPipelineExecution() {
        return this.pipelineExecution;
    }

    /**
     * <p>
     * Represents information about the execution of a pipeline.
     * </p>
     * 
     * @param pipelineExecution
     *        Represents information about the execution of a pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineExecutionResult withPipelineExecution(PipelineExecution pipelineExecution) {
        setPipelineExecution(pipelineExecution);
        return this;
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
        if (getPipelineExecution() != null)
            sb.append("PipelineExecution: " + getPipelineExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineExecutionResult == false)
            return false;
        GetPipelineExecutionResult other = (GetPipelineExecutionResult) obj;
        if (other.getPipelineExecution() == null ^ this.getPipelineExecution() == null)
            return false;
        if (other.getPipelineExecution() != null && other.getPipelineExecution().equals(this.getPipelineExecution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecution() == null) ? 0 : getPipelineExecution().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineExecutionResult clone() {
        try {
            return (GetPipelineExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
