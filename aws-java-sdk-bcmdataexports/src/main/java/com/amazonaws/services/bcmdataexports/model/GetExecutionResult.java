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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for this specific execution.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The status of this specific execution.
     * </p>
     */
    private ExecutionStatus executionStatus;
    /**
     * <p>
     * The export data for this specific execution. This export data is a snapshot from when the execution was
     * generated. The data could be different from the current export data if the export was updated since the execution
     * was generated.
     * </p>
     */
    private Export export;

    /**
     * <p>
     * The ID for this specific execution.
     * </p>
     * 
     * @param executionId
     *        The ID for this specific execution.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The ID for this specific execution.
     * </p>
     * 
     * @return The ID for this specific execution.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The ID for this specific execution.
     * </p>
     * 
     * @param executionId
     *        The ID for this specific execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionResult withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The status of this specific execution.
     * </p>
     * 
     * @param executionStatus
     *        The status of this specific execution.
     */

    public void setExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus;
    }

    /**
     * <p>
     * The status of this specific execution.
     * </p>
     * 
     * @return The status of this specific execution.
     */

    public ExecutionStatus getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * <p>
     * The status of this specific execution.
     * </p>
     * 
     * @param executionStatus
     *        The status of this specific execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionResult withExecutionStatus(ExecutionStatus executionStatus) {
        setExecutionStatus(executionStatus);
        return this;
    }

    /**
     * <p>
     * The export data for this specific execution. This export data is a snapshot from when the execution was
     * generated. The data could be different from the current export data if the export was updated since the execution
     * was generated.
     * </p>
     * 
     * @param export
     *        The export data for this specific execution. This export data is a snapshot from when the execution was
     *        generated. The data could be different from the current export data if the export was updated since the
     *        execution was generated.
     */

    public void setExport(Export export) {
        this.export = export;
    }

    /**
     * <p>
     * The export data for this specific execution. This export data is a snapshot from when the execution was
     * generated. The data could be different from the current export data if the export was updated since the execution
     * was generated.
     * </p>
     * 
     * @return The export data for this specific execution. This export data is a snapshot from when the execution was
     *         generated. The data could be different from the current export data if the export was updated since the
     *         execution was generated.
     */

    public Export getExport() {
        return this.export;
    }

    /**
     * <p>
     * The export data for this specific execution. This export data is a snapshot from when the execution was
     * generated. The data could be different from the current export data if the export was updated since the execution
     * was generated.
     * </p>
     * 
     * @param export
     *        The export data for this specific execution. This export data is a snapshot from when the execution was
     *        generated. The data could be different from the current export data if the export was updated since the
     *        execution was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionResult withExport(Export export) {
        setExport(export);
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
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getExecutionStatus() != null)
            sb.append("ExecutionStatus: ").append(getExecutionStatus()).append(",");
        if (getExport() != null)
            sb.append("Export: ").append(getExport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExecutionResult == false)
            return false;
        GetExecutionResult other = (GetExecutionResult) obj;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getExecutionStatus() == null ^ this.getExecutionStatus() == null)
            return false;
        if (other.getExecutionStatus() != null && other.getExecutionStatus().equals(this.getExecutionStatus()) == false)
            return false;
        if (other.getExport() == null ^ this.getExport() == null)
            return false;
        if (other.getExport() != null && other.getExport().equals(this.getExport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExecutionStatus() == null) ? 0 : getExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getExport() == null) ? 0 : getExport().hashCode());
        return hashCode;
    }

    @Override
    public GetExecutionResult clone() {
        try {
            return (GetExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
