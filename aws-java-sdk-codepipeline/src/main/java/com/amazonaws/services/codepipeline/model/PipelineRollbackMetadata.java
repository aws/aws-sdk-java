/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The metadata for the stage execution to be rolled back.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PipelineRollbackMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineRollbackMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The pipeline execution ID to which the stage will be rolled back.
     * </p>
     */
    private String rollbackTargetPipelineExecutionId;

    /**
     * <p>
     * The pipeline execution ID to which the stage will be rolled back.
     * </p>
     * 
     * @param rollbackTargetPipelineExecutionId
     *        The pipeline execution ID to which the stage will be rolled back.
     */

    public void setRollbackTargetPipelineExecutionId(String rollbackTargetPipelineExecutionId) {
        this.rollbackTargetPipelineExecutionId = rollbackTargetPipelineExecutionId;
    }

    /**
     * <p>
     * The pipeline execution ID to which the stage will be rolled back.
     * </p>
     * 
     * @return The pipeline execution ID to which the stage will be rolled back.
     */

    public String getRollbackTargetPipelineExecutionId() {
        return this.rollbackTargetPipelineExecutionId;
    }

    /**
     * <p>
     * The pipeline execution ID to which the stage will be rolled back.
     * </p>
     * 
     * @param rollbackTargetPipelineExecutionId
     *        The pipeline execution ID to which the stage will be rolled back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineRollbackMetadata withRollbackTargetPipelineExecutionId(String rollbackTargetPipelineExecutionId) {
        setRollbackTargetPipelineExecutionId(rollbackTargetPipelineExecutionId);
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
        if (getRollbackTargetPipelineExecutionId() != null)
            sb.append("RollbackTargetPipelineExecutionId: ").append(getRollbackTargetPipelineExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineRollbackMetadata == false)
            return false;
        PipelineRollbackMetadata other = (PipelineRollbackMetadata) obj;
        if (other.getRollbackTargetPipelineExecutionId() == null ^ this.getRollbackTargetPipelineExecutionId() == null)
            return false;
        if (other.getRollbackTargetPipelineExecutionId() != null
                && other.getRollbackTargetPipelineExecutionId().equals(this.getRollbackTargetPipelineExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRollbackTargetPipelineExecutionId() == null) ? 0 : getRollbackTargetPipelineExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public PipelineRollbackMetadata clone() {
        try {
            return (PipelineRollbackMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.PipelineRollbackMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
