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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The current status of an archive export job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ExportStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the export job completed (if finished).
     * </p>
     */
    private java.util.Date completionTimestamp;
    /**
     * <p>
     * An error message if the export job failed.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The current state of the export job.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The timestamp of when the export job was submitted.
     * </p>
     */
    private java.util.Date submissionTimestamp;

    /**
     * <p>
     * The timestamp of when the export job completed (if finished).
     * </p>
     * 
     * @param completionTimestamp
     *        The timestamp of when the export job completed (if finished).
     */

    public void setCompletionTimestamp(java.util.Date completionTimestamp) {
        this.completionTimestamp = completionTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job completed (if finished).
     * </p>
     * 
     * @return The timestamp of when the export job completed (if finished).
     */

    public java.util.Date getCompletionTimestamp() {
        return this.completionTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job completed (if finished).
     * </p>
     * 
     * @param completionTimestamp
     *        The timestamp of when the export job completed (if finished).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportStatus withCompletionTimestamp(java.util.Date completionTimestamp) {
        setCompletionTimestamp(completionTimestamp);
        return this;
    }

    /**
     * <p>
     * An error message if the export job failed.
     * </p>
     * 
     * @param errorMessage
     *        An error message if the export job failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message if the export job failed.
     * </p>
     * 
     * @return An error message if the export job failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message if the export job failed.
     * </p>
     * 
     * @param errorMessage
     *        An error message if the export job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportStatus withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The current state of the export job.
     * </p>
     * 
     * @param state
     *        The current state of the export job.
     * @see ExportState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the export job.
     * </p>
     * 
     * @return The current state of the export job.
     * @see ExportState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the export job.
     * </p>
     * 
     * @param state
     *        The current state of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportState
     */

    public ExportStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the export job.
     * </p>
     * 
     * @param state
     *        The current state of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportState
     */

    public ExportStatus withState(ExportState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the export job was submitted.
     * </p>
     * 
     * @param submissionTimestamp
     *        The timestamp of when the export job was submitted.
     */

    public void setSubmissionTimestamp(java.util.Date submissionTimestamp) {
        this.submissionTimestamp = submissionTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was submitted.
     * </p>
     * 
     * @return The timestamp of when the export job was submitted.
     */

    public java.util.Date getSubmissionTimestamp() {
        return this.submissionTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was submitted.
     * </p>
     * 
     * @param submissionTimestamp
     *        The timestamp of when the export job was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportStatus withSubmissionTimestamp(java.util.Date submissionTimestamp) {
        setSubmissionTimestamp(submissionTimestamp);
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
        if (getCompletionTimestamp() != null)
            sb.append("CompletionTimestamp: ").append(getCompletionTimestamp()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSubmissionTimestamp() != null)
            sb.append("SubmissionTimestamp: ").append(getSubmissionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportStatus == false)
            return false;
        ExportStatus other = (ExportStatus) obj;
        if (other.getCompletionTimestamp() == null ^ this.getCompletionTimestamp() == null)
            return false;
        if (other.getCompletionTimestamp() != null && other.getCompletionTimestamp().equals(this.getCompletionTimestamp()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSubmissionTimestamp() == null ^ this.getSubmissionTimestamp() == null)
            return false;
        if (other.getSubmissionTimestamp() != null && other.getSubmissionTimestamp().equals(this.getSubmissionTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionTimestamp() == null) ? 0 : getCompletionTimestamp().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSubmissionTimestamp() == null) ? 0 : getSubmissionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ExportStatus clone() {
        try {
            return (ExportStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.ExportStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
