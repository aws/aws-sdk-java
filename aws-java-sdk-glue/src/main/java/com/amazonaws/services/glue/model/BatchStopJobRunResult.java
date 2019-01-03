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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchStopJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStopJobRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     */
    private java.util.List<BatchStopJobRunSuccessfulSubmission> successfulSubmissions;
    /**
     * <p>
     * A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which each error
     * was encountered and details about the error.
     * </p>
     */
    private java.util.List<BatchStopJobRunError> errors;

    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     * 
     * @return A list of the JobRuns that were successfully submitted for stopping.
     */

    public java.util.List<BatchStopJobRunSuccessfulSubmission> getSuccessfulSubmissions() {
        return successfulSubmissions;
    }

    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     * 
     * @param successfulSubmissions
     *        A list of the JobRuns that were successfully submitted for stopping.
     */

    public void setSuccessfulSubmissions(java.util.Collection<BatchStopJobRunSuccessfulSubmission> successfulSubmissions) {
        if (successfulSubmissions == null) {
            this.successfulSubmissions = null;
            return;
        }

        this.successfulSubmissions = new java.util.ArrayList<BatchStopJobRunSuccessfulSubmission>(successfulSubmissions);
    }

    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulSubmissions(java.util.Collection)} or
     * {@link #withSuccessfulSubmissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param successfulSubmissions
     *        A list of the JobRuns that were successfully submitted for stopping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunResult withSuccessfulSubmissions(BatchStopJobRunSuccessfulSubmission... successfulSubmissions) {
        if (this.successfulSubmissions == null) {
            setSuccessfulSubmissions(new java.util.ArrayList<BatchStopJobRunSuccessfulSubmission>(successfulSubmissions.length));
        }
        for (BatchStopJobRunSuccessfulSubmission ele : successfulSubmissions) {
            this.successfulSubmissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     * 
     * @param successfulSubmissions
     *        A list of the JobRuns that were successfully submitted for stopping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunResult withSuccessfulSubmissions(java.util.Collection<BatchStopJobRunSuccessfulSubmission> successfulSubmissions) {
        setSuccessfulSubmissions(successfulSubmissions);
        return this;
    }

    /**
     * <p>
     * A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which each error
     * was encountered and details about the error.
     * </p>
     * 
     * @return A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which
     *         each error was encountered and details about the error.
     */

    public java.util.List<BatchStopJobRunError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which each error
     * was encountered and details about the error.
     * </p>
     * 
     * @param errors
     *        A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which each
     *        error was encountered and details about the error.
     */

    public void setErrors(java.util.Collection<BatchStopJobRunError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchStopJobRunError>(errors);
    }

    /**
     * <p>
     * A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which each error
     * was encountered and details about the error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which each
     *        error was encountered and details about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunResult withErrors(BatchStopJobRunError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchStopJobRunError>(errors.length));
        }
        for (BatchStopJobRunError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which each error
     * was encountered and details about the error.
     * </p>
     * 
     * @param errors
     *        A list of the errors that were encountered in tryng to stop JobRuns, including the JobRunId for which each
     *        error was encountered and details about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunResult withErrors(java.util.Collection<BatchStopJobRunError> errors) {
        setErrors(errors);
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
        if (getSuccessfulSubmissions() != null)
            sb.append("SuccessfulSubmissions: ").append(getSuccessfulSubmissions()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopJobRunResult == false)
            return false;
        BatchStopJobRunResult other = (BatchStopJobRunResult) obj;
        if (other.getSuccessfulSubmissions() == null ^ this.getSuccessfulSubmissions() == null)
            return false;
        if (other.getSuccessfulSubmissions() != null && other.getSuccessfulSubmissions().equals(this.getSuccessfulSubmissions()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulSubmissions() == null) ? 0 : getSuccessfulSubmissions().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchStopJobRunResult clone() {
        try {
            return (BatchStopJobRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
