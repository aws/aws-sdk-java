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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetWorkflowStepExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowStepExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use the unique identifier for a specific runtime instance of the workflow step to get runtime details for that
     * step.
     * </p>
     */
    private String stepExecutionId;

    /**
     * <p>
     * Use the unique identifier for a specific runtime instance of the workflow step to get runtime details for that
     * step.
     * </p>
     * 
     * @param stepExecutionId
     *        Use the unique identifier for a specific runtime instance of the workflow step to get runtime details for
     *        that step.
     */

    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    /**
     * <p>
     * Use the unique identifier for a specific runtime instance of the workflow step to get runtime details for that
     * step.
     * </p>
     * 
     * @return Use the unique identifier for a specific runtime instance of the workflow step to get runtime details for
     *         that step.
     */

    public String getStepExecutionId() {
        return this.stepExecutionId;
    }

    /**
     * <p>
     * Use the unique identifier for a specific runtime instance of the workflow step to get runtime details for that
     * step.
     * </p>
     * 
     * @param stepExecutionId
     *        Use the unique identifier for a specific runtime instance of the workflow step to get runtime details for
     *        that step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionRequest withStepExecutionId(String stepExecutionId) {
        setStepExecutionId(stepExecutionId);
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
        if (getStepExecutionId() != null)
            sb.append("StepExecutionId: ").append(getStepExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowStepExecutionRequest == false)
            return false;
        GetWorkflowStepExecutionRequest other = (GetWorkflowStepExecutionRequest) obj;
        if (other.getStepExecutionId() == null ^ this.getStepExecutionId() == null)
            return false;
        if (other.getStepExecutionId() != null && other.getStepExecutionId().equals(this.getStepExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepExecutionId() == null) ? 0 : getStepExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowStepExecutionRequest clone() {
        return (GetWorkflowStepExecutionRequest) super.clone();
    }

}
