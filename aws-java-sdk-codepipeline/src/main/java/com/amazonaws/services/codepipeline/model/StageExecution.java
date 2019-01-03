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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about the run of a stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/StageExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the pipeline execution associated with the stage.
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * The status of the stage, or for a completed stage, the last status of the stage.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the pipeline execution associated with the stage.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution associated with the stage.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution associated with the stage.
     * </p>
     * 
     * @return The ID of the pipeline execution associated with the stage.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution associated with the stage.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution associated with the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageExecution withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * The status of the stage, or for a completed stage, the last status of the stage.
     * </p>
     * 
     * @param status
     *        The status of the stage, or for a completed stage, the last status of the stage.
     * @see StageExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stage, or for a completed stage, the last status of the stage.
     * </p>
     * 
     * @return The status of the stage, or for a completed stage, the last status of the stage.
     * @see StageExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the stage, or for a completed stage, the last status of the stage.
     * </p>
     * 
     * @param status
     *        The status of the stage, or for a completed stage, the last status of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageExecutionStatus
     */

    public StageExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the stage, or for a completed stage, the last status of the stage.
     * </p>
     * 
     * @param status
     *        The status of the stage, or for a completed stage, the last status of the stage.
     * @see StageExecutionStatus
     */

    public void setStatus(StageExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the stage, or for a completed stage, the last status of the stage.
     * </p>
     * 
     * @param status
     *        The status of the stage, or for a completed stage, the last status of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageExecutionStatus
     */

    public StageExecution withStatus(StageExecutionStatus status) {
        this.status = status.toString();
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
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StageExecution == false)
            return false;
        StageExecution other = (StageExecution) obj;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public StageExecution clone() {
        try {
            return (StageExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.StageExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
