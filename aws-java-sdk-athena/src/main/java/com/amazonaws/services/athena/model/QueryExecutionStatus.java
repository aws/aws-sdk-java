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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The completion date, current state, submission time, and state change reason (if applicable) for the query execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryExecutionStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryExecutionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is reserved for
     * future use. <code>RUNNING</code> indicates that the query has been submitted to the service, and Athena will
     * execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates that the query completed
     * without errors. <code>FAILED</code> indicates that the query experienced an error and did not complete
     * processing. <code>CANCELLED</code> indicates that a user input interrupted query execution.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Further detail about the status of the query.
     * </p>
     */
    private String stateChangeReason;
    /**
     * <p>
     * The date and time that the query was submitted.
     * </p>
     */
    private java.util.Date submissionDateTime;
    /**
     * <p>
     * The date and time that the query completed.
     * </p>
     */
    private java.util.Date completionDateTime;

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is reserved for
     * future use. <code>RUNNING</code> indicates that the query has been submitted to the service, and Athena will
     * execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates that the query completed
     * without errors. <code>FAILED</code> indicates that the query experienced an error and did not complete
     * processing. <code>CANCELLED</code> indicates that a user input interrupted query execution.
     * </p>
     * 
     * @param state
     *        The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is
     *        reserved for future use. <code>RUNNING</code> indicates that the query has been submitted to the service,
     *        and Athena will execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates
     *        that the query completed without errors. <code>FAILED</code> indicates that the query experienced an error
     *        and did not complete processing. <code>CANCELLED</code> indicates that a user input interrupted query
     *        execution.
     * @see QueryExecutionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is reserved for
     * future use. <code>RUNNING</code> indicates that the query has been submitted to the service, and Athena will
     * execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates that the query completed
     * without errors. <code>FAILED</code> indicates that the query experienced an error and did not complete
     * processing. <code>CANCELLED</code> indicates that a user input interrupted query execution.
     * </p>
     * 
     * @return The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is
     *         reserved for future use. <code>RUNNING</code> indicates that the query has been submitted to the service,
     *         and Athena will execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates
     *         that the query completed without errors. <code>FAILED</code> indicates that the query experienced an
     *         error and did not complete processing. <code>CANCELLED</code> indicates that a user input interrupted
     *         query execution.
     * @see QueryExecutionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is reserved for
     * future use. <code>RUNNING</code> indicates that the query has been submitted to the service, and Athena will
     * execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates that the query completed
     * without errors. <code>FAILED</code> indicates that the query experienced an error and did not complete
     * processing. <code>CANCELLED</code> indicates that a user input interrupted query execution.
     * </p>
     * 
     * @param state
     *        The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is
     *        reserved for future use. <code>RUNNING</code> indicates that the query has been submitted to the service,
     *        and Athena will execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates
     *        that the query completed without errors. <code>FAILED</code> indicates that the query experienced an error
     *        and did not complete processing. <code>CANCELLED</code> indicates that a user input interrupted query
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryExecutionState
     */

    public QueryExecutionStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is reserved for
     * future use. <code>RUNNING</code> indicates that the query has been submitted to the service, and Athena will
     * execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates that the query completed
     * without errors. <code>FAILED</code> indicates that the query experienced an error and did not complete
     * processing. <code>CANCELLED</code> indicates that a user input interrupted query execution.
     * </p>
     * 
     * @param state
     *        The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is
     *        reserved for future use. <code>RUNNING</code> indicates that the query has been submitted to the service,
     *        and Athena will execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates
     *        that the query completed without errors. <code>FAILED</code> indicates that the query experienced an error
     *        and did not complete processing. <code>CANCELLED</code> indicates that a user input interrupted query
     *        execution.
     * @see QueryExecutionState
     */

    public void setState(QueryExecutionState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is reserved for
     * future use. <code>RUNNING</code> indicates that the query has been submitted to the service, and Athena will
     * execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates that the query completed
     * without errors. <code>FAILED</code> indicates that the query experienced an error and did not complete
     * processing. <code>CANCELLED</code> indicates that a user input interrupted query execution.
     * </p>
     * 
     * @param state
     *        The state of query execution. <code>QUEUED</code> state is listed but is not used by Athena and is
     *        reserved for future use. <code>RUNNING</code> indicates that the query has been submitted to the service,
     *        and Athena will execute the query as soon as resources are available. <code>SUCCEEDED</code> indicates
     *        that the query completed without errors. <code>FAILED</code> indicates that the query experienced an error
     *        and did not complete processing. <code>CANCELLED</code> indicates that a user input interrupted query
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryExecutionState
     */

    public QueryExecutionStatus withState(QueryExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Further detail about the status of the query.
     * </p>
     * 
     * @param stateChangeReason
     *        Further detail about the status of the query.
     */

    public void setStateChangeReason(String stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * Further detail about the status of the query.
     * </p>
     * 
     * @return Further detail about the status of the query.
     */

    public String getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * Further detail about the status of the query.
     * </p>
     * 
     * @param stateChangeReason
     *        Further detail about the status of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatus withStateChangeReason(String stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * <p>
     * The date and time that the query was submitted.
     * </p>
     * 
     * @param submissionDateTime
     *        The date and time that the query was submitted.
     */

    public void setSubmissionDateTime(java.util.Date submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }

    /**
     * <p>
     * The date and time that the query was submitted.
     * </p>
     * 
     * @return The date and time that the query was submitted.
     */

    public java.util.Date getSubmissionDateTime() {
        return this.submissionDateTime;
    }

    /**
     * <p>
     * The date and time that the query was submitted.
     * </p>
     * 
     * @param submissionDateTime
     *        The date and time that the query was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatus withSubmissionDateTime(java.util.Date submissionDateTime) {
        setSubmissionDateTime(submissionDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the query completed.
     * </p>
     * 
     * @param completionDateTime
     *        The date and time that the query completed.
     */

    public void setCompletionDateTime(java.util.Date completionDateTime) {
        this.completionDateTime = completionDateTime;
    }

    /**
     * <p>
     * The date and time that the query completed.
     * </p>
     * 
     * @return The date and time that the query completed.
     */

    public java.util.Date getCompletionDateTime() {
        return this.completionDateTime;
    }

    /**
     * <p>
     * The date and time that the query completed.
     * </p>
     * 
     * @param completionDateTime
     *        The date and time that the query completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatus withCompletionDateTime(java.util.Date completionDateTime) {
        setCompletionDateTime(completionDateTime);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason()).append(",");
        if (getSubmissionDateTime() != null)
            sb.append("SubmissionDateTime: ").append(getSubmissionDateTime()).append(",");
        if (getCompletionDateTime() != null)
            sb.append("CompletionDateTime: ").append(getCompletionDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryExecutionStatus == false)
            return false;
        QueryExecutionStatus other = (QueryExecutionStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getSubmissionDateTime() == null ^ this.getSubmissionDateTime() == null)
            return false;
        if (other.getSubmissionDateTime() != null && other.getSubmissionDateTime().equals(this.getSubmissionDateTime()) == false)
            return false;
        if (other.getCompletionDateTime() == null ^ this.getCompletionDateTime() == null)
            return false;
        if (other.getCompletionDateTime() != null && other.getCompletionDateTime().equals(this.getCompletionDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getSubmissionDateTime() == null) ? 0 : getSubmissionDateTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionDateTime() == null) ? 0 : getCompletionDateTime().hashCode());
        return hashCode;
    }

    @Override
    public QueryExecutionStatus clone() {
        try {
            return (QueryExecutionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryExecutionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
