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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CancelMLTaskRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelMLTaskRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     */
    private String transformId;
    /**
     * <p>
     * A unique identifier for the task run.
     * </p>
     */
    private String taskRunId;

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the machine learning transform.
     */

    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * 
     * @return The unique identifier of the machine learning transform.
     */

    public String getTransformId() {
        return this.transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the machine learning transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelMLTaskRunRequest withTransformId(String transformId) {
        setTransformId(transformId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the task run.
     * </p>
     * 
     * @param taskRunId
     *        A unique identifier for the task run.
     */

    public void setTaskRunId(String taskRunId) {
        this.taskRunId = taskRunId;
    }

    /**
     * <p>
     * A unique identifier for the task run.
     * </p>
     * 
     * @return A unique identifier for the task run.
     */

    public String getTaskRunId() {
        return this.taskRunId;
    }

    /**
     * <p>
     * A unique identifier for the task run.
     * </p>
     * 
     * @param taskRunId
     *        A unique identifier for the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelMLTaskRunRequest withTaskRunId(String taskRunId) {
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
        if (getTransformId() != null)
            sb.append("TransformId: ").append(getTransformId()).append(",");
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

        if (obj instanceof CancelMLTaskRunRequest == false)
            return false;
        CancelMLTaskRunRequest other = (CancelMLTaskRunRequest) obj;
        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getTaskRunId() == null) ? 0 : getTaskRunId().hashCode());
        return hashCode;
    }

    @Override
    public CancelMLTaskRunRequest clone() {
        return (CancelMLTaskRunRequest) super.clone();
    }

}
