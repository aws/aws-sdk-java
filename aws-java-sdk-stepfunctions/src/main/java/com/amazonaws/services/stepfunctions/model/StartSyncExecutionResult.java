/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StartSyncExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSyncExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     */
    private String executionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * The name of the execution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date the execution is started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * If the execution has already ended, the date the execution stopped.
     * </p>
     */
    private java.util.Date stopDate;
    /**
     * <p>
     * The current status of the execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The error code of the failure.
     * </p>
     */
    private String error;
    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     */
    private String cause;
    /**
     * <p>
     * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and
     * are expressed as bytes in UTF-8 encoding.
     * </p>
     */
    private String input;

    private CloudWatchEventsExecutionDataDetails inputDetails;
    /**
     * <p>
     * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes
     * in UTF-8 encoding.
     * </p>
     * <note>
     * <p>
     * This field is set only if the execution succeeds. If the execution fails, this field is null.
     * </p>
     * </note>
     */
    private String output;

    private CloudWatchEventsExecutionDataDetails outputDetails;
    /**
     * <p>
     * The AWS X-Ray trace header that was passed to the execution.
     * </p>
     */
    private String traceHeader;
    /**
     * <p>
     * An object that describes workflow billing details, including billed duration and memory use.
     * </p>
     */
    private BillingDetails billingDetails;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the execution.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) that identifies the state machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the state machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) that identifies the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * 
     * @param name
     *        The name of the execution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * 
     * @return The name of the execution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * 
     * @param name
     *        The name of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date the execution is started.
     * </p>
     * 
     * @param startDate
     *        The date the execution is started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date the execution is started.
     * </p>
     * 
     * @return The date the execution is started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date the execution is started.
     * </p>
     * 
     * @param startDate
     *        The date the execution is started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * If the execution has already ended, the date the execution stopped.
     * </p>
     * 
     * @param stopDate
     *        If the execution has already ended, the date the execution stopped.
     */

    public void setStopDate(java.util.Date stopDate) {
        this.stopDate = stopDate;
    }

    /**
     * <p>
     * If the execution has already ended, the date the execution stopped.
     * </p>
     * 
     * @return If the execution has already ended, the date the execution stopped.
     */

    public java.util.Date getStopDate() {
        return this.stopDate;
    }

    /**
     * <p>
     * If the execution has already ended, the date the execution stopped.
     * </p>
     * 
     * @param stopDate
     *        If the execution has already ended, the date the execution stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withStopDate(java.util.Date stopDate) {
        setStopDate(stopDate);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @see SyncExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @return The current status of the execution.
     * @see SyncExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncExecutionStatus
     */

    public StartSyncExecutionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncExecutionStatus
     */

    public StartSyncExecutionResult withStatus(SyncExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error code of the failure.
     * </p>
     * 
     * @param error
     *        The error code of the failure.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The error code of the failure.
     * </p>
     * 
     * @return The error code of the failure.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * The error code of the failure.
     * </p>
     * 
     * @param error
     *        The error code of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     * 
     * @param cause
     *        A more detailed explanation of the cause of the failure.
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     * 
     * @return A more detailed explanation of the cause of the failure.
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     * 
     * @param cause
     *        A more detailed explanation of the cause of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and
     * are expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data of the execution. Length constraints apply to the payload
     *        size, and are expressed as bytes in UTF-8 encoding.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and
     * are expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @return The string that contains the JSON input data of the execution. Length constraints apply to the payload
     *         size, and are expressed as bytes in UTF-8 encoding.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and
     * are expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data of the execution. Length constraints apply to the payload
     *        size, and are expressed as bytes in UTF-8 encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * @param inputDetails
     */

    public void setInputDetails(CloudWatchEventsExecutionDataDetails inputDetails) {
        this.inputDetails = inputDetails;
    }

    /**
     * @return
     */

    public CloudWatchEventsExecutionDataDetails getInputDetails() {
        return this.inputDetails;
    }

    /**
     * @param inputDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withInputDetails(CloudWatchEventsExecutionDataDetails inputDetails) {
        setInputDetails(inputDetails);
        return this;
    }

    /**
     * <p>
     * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes
     * in UTF-8 encoding.
     * </p>
     * <note>
     * <p>
     * This field is set only if the execution succeeds. If the execution fails, this field is null.
     * </p>
     * </note>
     * 
     * @param output
     *        The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as
     *        bytes in UTF-8 encoding.</p> <note>
     *        <p>
     *        This field is set only if the execution succeeds. If the execution fails, this field is null.
     *        </p>
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes
     * in UTF-8 encoding.
     * </p>
     * <note>
     * <p>
     * This field is set only if the execution succeeds. If the execution fails, this field is null.
     * </p>
     * </note>
     * 
     * @return The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as
     *         bytes in UTF-8 encoding.</p> <note>
     *         <p>
     *         This field is set only if the execution succeeds. If the execution fails, this field is null.
     *         </p>
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes
     * in UTF-8 encoding.
     * </p>
     * <note>
     * <p>
     * This field is set only if the execution succeeds. If the execution fails, this field is null.
     * </p>
     * </note>
     * 
     * @param output
     *        The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as
     *        bytes in UTF-8 encoding.</p> <note>
     *        <p>
     *        This field is set only if the execution succeeds. If the execution fails, this field is null.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * @param outputDetails
     */

    public void setOutputDetails(CloudWatchEventsExecutionDataDetails outputDetails) {
        this.outputDetails = outputDetails;
    }

    /**
     * @return
     */

    public CloudWatchEventsExecutionDataDetails getOutputDetails() {
        return this.outputDetails;
    }

    /**
     * @param outputDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withOutputDetails(CloudWatchEventsExecutionDataDetails outputDetails) {
        setOutputDetails(outputDetails);
        return this;
    }

    /**
     * <p>
     * The AWS X-Ray trace header that was passed to the execution.
     * </p>
     * 
     * @param traceHeader
     *        The AWS X-Ray trace header that was passed to the execution.
     */

    public void setTraceHeader(String traceHeader) {
        this.traceHeader = traceHeader;
    }

    /**
     * <p>
     * The AWS X-Ray trace header that was passed to the execution.
     * </p>
     * 
     * @return The AWS X-Ray trace header that was passed to the execution.
     */

    public String getTraceHeader() {
        return this.traceHeader;
    }

    /**
     * <p>
     * The AWS X-Ray trace header that was passed to the execution.
     * </p>
     * 
     * @param traceHeader
     *        The AWS X-Ray trace header that was passed to the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withTraceHeader(String traceHeader) {
        setTraceHeader(traceHeader);
        return this;
    }

    /**
     * <p>
     * An object that describes workflow billing details, including billed duration and memory use.
     * </p>
     * 
     * @param billingDetails
     *        An object that describes workflow billing details, including billed duration and memory use.
     */

    public void setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }

    /**
     * <p>
     * An object that describes workflow billing details, including billed duration and memory use.
     * </p>
     * 
     * @return An object that describes workflow billing details, including billed duration and memory use.
     */

    public BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    /**
     * <p>
     * An object that describes workflow billing details, including billed duration and memory use.
     * </p>
     * 
     * @param billingDetails
     *        An object that describes workflow billing details, including billed duration and memory use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSyncExecutionResult withBillingDetails(BillingDetails billingDetails) {
        setBillingDetails(billingDetails);
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
        if (getExecutionArn() != null)
            sb.append("ExecutionArn: ").append(getExecutionArn()).append(",");
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getStopDate() != null)
            sb.append("StopDate: ").append(getStopDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getError() != null)
            sb.append("Error: ").append("***Sensitive Data Redacted***").append(",");
        if (getCause() != null)
            sb.append("Cause: ").append("***Sensitive Data Redacted***").append(",");
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***").append(",");
        if (getInputDetails() != null)
            sb.append("InputDetails: ").append(getInputDetails()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append("***Sensitive Data Redacted***").append(",");
        if (getOutputDetails() != null)
            sb.append("OutputDetails: ").append(getOutputDetails()).append(",");
        if (getTraceHeader() != null)
            sb.append("TraceHeader: ").append(getTraceHeader()).append(",");
        if (getBillingDetails() != null)
            sb.append("BillingDetails: ").append(getBillingDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSyncExecutionResult == false)
            return false;
        StartSyncExecutionResult other = (StartSyncExecutionResult) obj;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getStopDate() == null ^ this.getStopDate() == null)
            return false;
        if (other.getStopDate() != null && other.getStopDate().equals(this.getStopDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getInputDetails() == null ^ this.getInputDetails() == null)
            return false;
        if (other.getInputDetails() != null && other.getInputDetails().equals(this.getInputDetails()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getOutputDetails() == null ^ this.getOutputDetails() == null)
            return false;
        if (other.getOutputDetails() != null && other.getOutputDetails().equals(this.getOutputDetails()) == false)
            return false;
        if (other.getTraceHeader() == null ^ this.getTraceHeader() == null)
            return false;
        if (other.getTraceHeader() != null && other.getTraceHeader().equals(this.getTraceHeader()) == false)
            return false;
        if (other.getBillingDetails() == null ^ this.getBillingDetails() == null)
            return false;
        if (other.getBillingDetails() != null && other.getBillingDetails().equals(this.getBillingDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getStopDate() == null) ? 0 : getStopDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getInputDetails() == null) ? 0 : getInputDetails().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getOutputDetails() == null) ? 0 : getOutputDetails().hashCode());
        hashCode = prime * hashCode + ((getTraceHeader() == null) ? 0 : getTraceHeader().hashCode());
        hashCode = prime * hashCode + ((getBillingDetails() == null) ? 0 : getBillingDetails().hashCode());
        return hashCode;
    }

    @Override
    public StartSyncExecutionResult clone() {
        try {
            return (StartSyncExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
