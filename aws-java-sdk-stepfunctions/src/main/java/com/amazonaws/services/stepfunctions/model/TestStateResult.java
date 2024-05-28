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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TestState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON output data of the state. Length constraints apply to the payload size, and are expressed as bytes in
     * UTF-8 encoding.
     * </p>
     */
    private String output;
    /**
     * <p>
     * The error returned when the execution of a state fails.
     * </p>
     */
    private String error;
    /**
     * <p>
     * A detailed explanation of the cause for the error when the execution of a state fails.
     * </p>
     */
    private String cause;
    /**
     * <p>
     * Returns additional details about the state's execution, including its input and output data processing flow, and
     * HTTP request and response information. The <code>inspectionLevel</code> request parameter specifies which details
     * are returned.
     * </p>
     */
    private InspectionData inspectionData;
    /**
     * <p>
     * The name of the next state to transition to. If you haven't defined a next state in your definition or if the
     * execution of the state fails, this ﬁeld doesn't contain a value.
     * </p>
     */
    private String nextState;
    /**
     * <p>
     * The execution status of the state.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The JSON output data of the state. Length constraints apply to the payload size, and are expressed as bytes in
     * UTF-8 encoding.
     * </p>
     * 
     * @param output
     *        The JSON output data of the state. Length constraints apply to the payload size, and are expressed as
     *        bytes in UTF-8 encoding.
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The JSON output data of the state. Length constraints apply to the payload size, and are expressed as bytes in
     * UTF-8 encoding.
     * </p>
     * 
     * @return The JSON output data of the state. Length constraints apply to the payload size, and are expressed as
     *         bytes in UTF-8 encoding.
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The JSON output data of the state. Length constraints apply to the payload size, and are expressed as bytes in
     * UTF-8 encoding.
     * </p>
     * 
     * @param output
     *        The JSON output data of the state. Length constraints apply to the payload size, and are expressed as
     *        bytes in UTF-8 encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestStateResult withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * The error returned when the execution of a state fails.
     * </p>
     * 
     * @param error
     *        The error returned when the execution of a state fails.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The error returned when the execution of a state fails.
     * </p>
     * 
     * @return The error returned when the execution of a state fails.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * The error returned when the execution of a state fails.
     * </p>
     * 
     * @param error
     *        The error returned when the execution of a state fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestStateResult withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * A detailed explanation of the cause for the error when the execution of a state fails.
     * </p>
     * 
     * @param cause
     *        A detailed explanation of the cause for the error when the execution of a state fails.
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * A detailed explanation of the cause for the error when the execution of a state fails.
     * </p>
     * 
     * @return A detailed explanation of the cause for the error when the execution of a state fails.
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * A detailed explanation of the cause for the error when the execution of a state fails.
     * </p>
     * 
     * @param cause
     *        A detailed explanation of the cause for the error when the execution of a state fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestStateResult withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * Returns additional details about the state's execution, including its input and output data processing flow, and
     * HTTP request and response information. The <code>inspectionLevel</code> request parameter specifies which details
     * are returned.
     * </p>
     * 
     * @param inspectionData
     *        Returns additional details about the state's execution, including its input and output data processing
     *        flow, and HTTP request and response information. The <code>inspectionLevel</code> request parameter
     *        specifies which details are returned.
     */

    public void setInspectionData(InspectionData inspectionData) {
        this.inspectionData = inspectionData;
    }

    /**
     * <p>
     * Returns additional details about the state's execution, including its input and output data processing flow, and
     * HTTP request and response information. The <code>inspectionLevel</code> request parameter specifies which details
     * are returned.
     * </p>
     * 
     * @return Returns additional details about the state's execution, including its input and output data processing
     *         flow, and HTTP request and response information. The <code>inspectionLevel</code> request parameter
     *         specifies which details are returned.
     */

    public InspectionData getInspectionData() {
        return this.inspectionData;
    }

    /**
     * <p>
     * Returns additional details about the state's execution, including its input and output data processing flow, and
     * HTTP request and response information. The <code>inspectionLevel</code> request parameter specifies which details
     * are returned.
     * </p>
     * 
     * @param inspectionData
     *        Returns additional details about the state's execution, including its input and output data processing
     *        flow, and HTTP request and response information. The <code>inspectionLevel</code> request parameter
     *        specifies which details are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestStateResult withInspectionData(InspectionData inspectionData) {
        setInspectionData(inspectionData);
        return this;
    }

    /**
     * <p>
     * The name of the next state to transition to. If you haven't defined a next state in your definition or if the
     * execution of the state fails, this ﬁeld doesn't contain a value.
     * </p>
     * 
     * @param nextState
     *        The name of the next state to transition to. If you haven't defined a next state in your definition or if
     *        the execution of the state fails, this ﬁeld doesn't contain a value.
     */

    public void setNextState(String nextState) {
        this.nextState = nextState;
    }

    /**
     * <p>
     * The name of the next state to transition to. If you haven't defined a next state in your definition or if the
     * execution of the state fails, this ﬁeld doesn't contain a value.
     * </p>
     * 
     * @return The name of the next state to transition to. If you haven't defined a next state in your definition or if
     *         the execution of the state fails, this ﬁeld doesn't contain a value.
     */

    public String getNextState() {
        return this.nextState;
    }

    /**
     * <p>
     * The name of the next state to transition to. If you haven't defined a next state in your definition or if the
     * execution of the state fails, this ﬁeld doesn't contain a value.
     * </p>
     * 
     * @param nextState
     *        The name of the next state to transition to. If you haven't defined a next state in your definition or if
     *        the execution of the state fails, this ﬁeld doesn't contain a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestStateResult withNextState(String nextState) {
        setNextState(nextState);
        return this;
    }

    /**
     * <p>
     * The execution status of the state.
     * </p>
     * 
     * @param status
     *        The execution status of the state.
     * @see TestExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The execution status of the state.
     * </p>
     * 
     * @return The execution status of the state.
     * @see TestExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The execution status of the state.
     * </p>
     * 
     * @param status
     *        The execution status of the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionStatus
     */

    public TestStateResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The execution status of the state.
     * </p>
     * 
     * @param status
     *        The execution status of the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionStatus
     */

    public TestStateResult withStatus(TestExecutionStatus status) {
        this.status = status.toString();
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
        if (getOutput() != null)
            sb.append("Output: ").append("***Sensitive Data Redacted***").append(",");
        if (getError() != null)
            sb.append("Error: ").append("***Sensitive Data Redacted***").append(",");
        if (getCause() != null)
            sb.append("Cause: ").append("***Sensitive Data Redacted***").append(",");
        if (getInspectionData() != null)
            sb.append("InspectionData: ").append("***Sensitive Data Redacted***").append(",");
        if (getNextState() != null)
            sb.append("NextState: ").append(getNextState()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestStateResult == false)
            return false;
        TestStateResult other = (TestStateResult) obj;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        if (other.getInspectionData() == null ^ this.getInspectionData() == null)
            return false;
        if (other.getInspectionData() != null && other.getInspectionData().equals(this.getInspectionData()) == false)
            return false;
        if (other.getNextState() == null ^ this.getNextState() == null)
            return false;
        if (other.getNextState() != null && other.getNextState().equals(this.getNextState()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getInspectionData() == null) ? 0 : getInspectionData().hashCode());
        hashCode = prime * hashCode + ((getNextState() == null) ? 0 : getNextState().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public TestStateResult clone() {
        try {
            return (TestStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
