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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartMLLabelingSetGenerationTaskRun"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMLLabelingSetGenerationTaskRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The unique run identifier that is associated with this task run.
     * </p>
     */
    private String taskRunId;

    /**
     * <p>
     * The unique run identifier that is associated with this task run.
     * </p>
     * 
     * @param taskRunId
     *        The unique run identifier that is associated with this task run.
     */

    public void setTaskRunId(String taskRunId) {
        this.taskRunId = taskRunId;
    }

    /**
     * <p>
     * The unique run identifier that is associated with this task run.
     * </p>
     * 
     * @return The unique run identifier that is associated with this task run.
     */

    public String getTaskRunId() {
        return this.taskRunId;
    }

    /**
     * <p>
     * The unique run identifier that is associated with this task run.
     * </p>
     * 
     * @param taskRunId
     *        The unique run identifier that is associated with this task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMLLabelingSetGenerationTaskRunResult withTaskRunId(String taskRunId) {
        setTaskRunId(taskRunId);
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
        if (getTaskRunId() != null)
            sb.append("TaskRunId: ").append(getTaskRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMLLabelingSetGenerationTaskRunResult == false)
            return false;
        StartMLLabelingSetGenerationTaskRunResult other = (StartMLLabelingSetGenerationTaskRunResult) obj;
        if (other.getTaskRunId() == null ^ this.getTaskRunId() == null)
            return false;
        if (other.getTaskRunId() != null && other.getTaskRunId().equals(this.getTaskRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskRunId() == null) ? 0 : getTaskRunId().hashCode());
        return hashCode;
    }

    @Override
    public StartMLLabelingSetGenerationTaskRunResult clone() {
        try {
            return (StartMLLabelingSetGenerationTaskRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
