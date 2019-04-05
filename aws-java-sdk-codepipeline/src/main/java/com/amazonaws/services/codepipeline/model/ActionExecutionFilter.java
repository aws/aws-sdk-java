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
 * Filter values for the action execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionExecutionFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionExecutionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The pipeline execution ID used to filter action execution history.
     * </p>
     */
    private String pipelineExecutionId;

    /**
     * <p>
     * The pipeline execution ID used to filter action execution history.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The pipeline execution ID used to filter action execution history.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The pipeline execution ID used to filter action execution history.
     * </p>
     * 
     * @return The pipeline execution ID used to filter action execution history.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The pipeline execution ID used to filter action execution history.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The pipeline execution ID used to filter action execution history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionFilter withPipelineExecutionId(String pipelineExecutionId) {
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

        if (obj instanceof ActionExecutionFilter == false)
            return false;
        ActionExecutionFilter other = (ActionExecutionFilter) obj;
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

        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public ActionExecutionFilter clone() {
        try {
            return (ActionExecutionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionExecutionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
