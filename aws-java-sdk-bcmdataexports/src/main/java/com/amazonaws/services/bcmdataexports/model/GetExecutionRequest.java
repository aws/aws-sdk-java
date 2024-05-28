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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for this specific execution.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Export object that generated this specific execution.
     * </p>
     */
    private String exportArn;

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

    public GetExecutionRequest withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Export object that generated this specific execution.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) of the Export object that generated this specific execution.
     */

    public void setExportArn(String exportArn) {
        this.exportArn = exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Export object that generated this specific execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Export object that generated this specific execution.
     */

    public String getExportArn() {
        return this.exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Export object that generated this specific execution.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) of the Export object that generated this specific execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionRequest withExportArn(String exportArn) {
        setExportArn(exportArn);
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
        if (getExportArn() != null)
            sb.append("ExportArn: ").append(getExportArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExecutionRequest == false)
            return false;
        GetExecutionRequest other = (GetExecutionRequest) obj;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getExportArn() == null ^ this.getExportArn() == null)
            return false;
        if (other.getExportArn() != null && other.getExportArn().equals(this.getExportArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExportArn() == null) ? 0 : getExportArn().hashCode());
        return hashCode;
    }

    @Override
    public GetExecutionRequest clone() {
        return (GetExecutionRequest) super.clone();
    }

}
