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
package com.amazonaws.services.iotjobsdataplane.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/UpdateJobExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A JobExecutionState object.
     * </p>
     */
    private JobExecutionState executionState;
    /**
     * <p>
     * The contents of the Job Documents.
     * </p>
     */
    private String jobDocument;

    /**
     * <p>
     * A JobExecutionState object.
     * </p>
     * 
     * @param executionState
     *        A JobExecutionState object.
     */

    public void setExecutionState(JobExecutionState executionState) {
        this.executionState = executionState;
    }

    /**
     * <p>
     * A JobExecutionState object.
     * </p>
     * 
     * @return A JobExecutionState object.
     */

    public JobExecutionState getExecutionState() {
        return this.executionState;
    }

    /**
     * <p>
     * A JobExecutionState object.
     * </p>
     * 
     * @param executionState
     *        A JobExecutionState object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionResult withExecutionState(JobExecutionState executionState) {
        setExecutionState(executionState);
        return this;
    }

    /**
     * <p>
     * The contents of the Job Documents.
     * </p>
     * 
     * @param jobDocument
     *        The contents of the Job Documents.
     */

    public void setJobDocument(String jobDocument) {
        this.jobDocument = jobDocument;
    }

    /**
     * <p>
     * The contents of the Job Documents.
     * </p>
     * 
     * @return The contents of the Job Documents.
     */

    public String getJobDocument() {
        return this.jobDocument;
    }

    /**
     * <p>
     * The contents of the Job Documents.
     * </p>
     * 
     * @param jobDocument
     *        The contents of the Job Documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionResult withJobDocument(String jobDocument) {
        setJobDocument(jobDocument);
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
        if (getExecutionState() != null)
            sb.append("ExecutionState: ").append(getExecutionState()).append(",");
        if (getJobDocument() != null)
            sb.append("JobDocument: ").append(getJobDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobExecutionResult == false)
            return false;
        UpdateJobExecutionResult other = (UpdateJobExecutionResult) obj;
        if (other.getExecutionState() == null ^ this.getExecutionState() == null)
            return false;
        if (other.getExecutionState() != null && other.getExecutionState().equals(this.getExecutionState()) == false)
            return false;
        if (other.getJobDocument() == null ^ this.getJobDocument() == null)
            return false;
        if (other.getJobDocument() != null && other.getJobDocument().equals(this.getJobDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionState() == null) ? 0 : getExecutionState().hashCode());
        hashCode = prime * hashCode + ((getJobDocument() == null) ? 0 : getJobDocument().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobExecutionResult clone() {
        try {
            return (UpdateJobExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
