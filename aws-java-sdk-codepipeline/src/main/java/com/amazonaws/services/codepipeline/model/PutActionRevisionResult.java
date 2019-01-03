/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a PutActionRevision action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutActionRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutActionRevisionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
     * </p>
     */
    private Boolean newRevision;
    /**
     * <p>
     * The ID of the current workflow state of the pipeline.
     * </p>
     */
    private String pipelineExecutionId;

    /**
     * <p>
     * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
     * </p>
     * 
     * @param newRevision
     *        Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
     */

    public void setNewRevision(Boolean newRevision) {
        this.newRevision = newRevision;
    }

    /**
     * <p>
     * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
     * </p>
     * 
     * @return Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
     */

    public Boolean getNewRevision() {
        return this.newRevision;
    }

    /**
     * <p>
     * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
     * </p>
     * 
     * @param newRevision
     *        Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutActionRevisionResult withNewRevision(Boolean newRevision) {
        setNewRevision(newRevision);
        return this;
    }

    /**
     * <p>
     * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
     * </p>
     * 
     * @return Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
     */

    public Boolean isNewRevision() {
        return this.newRevision;
    }

    /**
     * <p>
     * The ID of the current workflow state of the pipeline.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the current workflow state of the pipeline.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the current workflow state of the pipeline.
     * </p>
     * 
     * @return The ID of the current workflow state of the pipeline.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the current workflow state of the pipeline.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the current workflow state of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutActionRevisionResult withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNewRevision() != null)
            sb.append("NewRevision: ").append(getNewRevision()).append(",");
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutActionRevisionResult == false)
            return false;
        PutActionRevisionResult other = (PutActionRevisionResult) obj;
        if (other.getNewRevision() == null ^ this.getNewRevision() == null)
            return false;
        if (other.getNewRevision() != null && other.getNewRevision().equals(this.getNewRevision()) == false)
            return false;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNewRevision() == null) ? 0 : getNewRevision().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public PutActionRevisionResult clone() {
        try {
            return (PutActionRevisionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
