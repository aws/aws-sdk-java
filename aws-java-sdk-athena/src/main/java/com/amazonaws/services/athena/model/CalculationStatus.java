/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about the status of a notebook calculation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CalculationStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the calculation was submitted for processing.
     * </p>
     */
    private java.util.Date submissionDateTime;
    /**
     * <p>
     * The date and time the calculation completed processing.
     * </p>
     */
    private java.util.Date completionDateTime;
    /**
     * <p>
     * The state of the calculation execution. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The calculation is in the process of being created.
     * </p>
     * <p>
     * <code>CREATED</code> - The calculation has been created and is ready to run.
     * </p>
     * <p>
     * <code>QUEUED</code> - The calculation has been queued for processing.
     * </p>
     * <p>
     * <code>RUNNING</code> - The calculation is running.
     * </p>
     * <p>
     * <code>CANCELING</code> - A request to cancel the calculation has been received and the system is working to stop
     * it.
     * </p>
     * <p>
     * <code>CANCELED</code> - The calculation is no longer running as the result of a cancel request.
     * </p>
     * <p>
     * <code>COMPLETED</code> - The calculation has completed without error.
     * </p>
     * <p>
     * <code>FAILED</code> - The calculation failed and is no longer running.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason for the calculation state change (for example, the calculation was canceled because the session was
     * terminated).
     * </p>
     */
    private String stateChangeReason;

    /**
     * <p>
     * The date and time the calculation was submitted for processing.
     * </p>
     * 
     * @param submissionDateTime
     *        The date and time the calculation was submitted for processing.
     */

    public void setSubmissionDateTime(java.util.Date submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }

    /**
     * <p>
     * The date and time the calculation was submitted for processing.
     * </p>
     * 
     * @return The date and time the calculation was submitted for processing.
     */

    public java.util.Date getSubmissionDateTime() {
        return this.submissionDateTime;
    }

    /**
     * <p>
     * The date and time the calculation was submitted for processing.
     * </p>
     * 
     * @param submissionDateTime
     *        The date and time the calculation was submitted for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationStatus withSubmissionDateTime(java.util.Date submissionDateTime) {
        setSubmissionDateTime(submissionDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time the calculation completed processing.
     * </p>
     * 
     * @param completionDateTime
     *        The date and time the calculation completed processing.
     */

    public void setCompletionDateTime(java.util.Date completionDateTime) {
        this.completionDateTime = completionDateTime;
    }

    /**
     * <p>
     * The date and time the calculation completed processing.
     * </p>
     * 
     * @return The date and time the calculation completed processing.
     */

    public java.util.Date getCompletionDateTime() {
        return this.completionDateTime;
    }

    /**
     * <p>
     * The date and time the calculation completed processing.
     * </p>
     * 
     * @param completionDateTime
     *        The date and time the calculation completed processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationStatus withCompletionDateTime(java.util.Date completionDateTime) {
        setCompletionDateTime(completionDateTime);
        return this;
    }

    /**
     * <p>
     * The state of the calculation execution. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The calculation is in the process of being created.
     * </p>
     * <p>
     * <code>CREATED</code> - The calculation has been created and is ready to run.
     * </p>
     * <p>
     * <code>QUEUED</code> - The calculation has been queued for processing.
     * </p>
     * <p>
     * <code>RUNNING</code> - The calculation is running.
     * </p>
     * <p>
     * <code>CANCELING</code> - A request to cancel the calculation has been received and the system is working to stop
     * it.
     * </p>
     * <p>
     * <code>CANCELED</code> - The calculation is no longer running as the result of a cancel request.
     * </p>
     * <p>
     * <code>COMPLETED</code> - The calculation has completed without error.
     * </p>
     * <p>
     * <code>FAILED</code> - The calculation failed and is no longer running.
     * </p>
     * 
     * @param state
     *        The state of the calculation execution. A description of each state follows.</p>
     *        <p>
     *        <code>CREATING</code> - The calculation is in the process of being created.
     *        </p>
     *        <p>
     *        <code>CREATED</code> - The calculation has been created and is ready to run.
     *        </p>
     *        <p>
     *        <code>QUEUED</code> - The calculation has been queued for processing.
     *        </p>
     *        <p>
     *        <code>RUNNING</code> - The calculation is running.
     *        </p>
     *        <p>
     *        <code>CANCELING</code> - A request to cancel the calculation has been received and the system is working
     *        to stop it.
     *        </p>
     *        <p>
     *        <code>CANCELED</code> - The calculation is no longer running as the result of a cancel request.
     *        </p>
     *        <p>
     *        <code>COMPLETED</code> - The calculation has completed without error.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - The calculation failed and is no longer running.
     * @see CalculationExecutionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the calculation execution. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The calculation is in the process of being created.
     * </p>
     * <p>
     * <code>CREATED</code> - The calculation has been created and is ready to run.
     * </p>
     * <p>
     * <code>QUEUED</code> - The calculation has been queued for processing.
     * </p>
     * <p>
     * <code>RUNNING</code> - The calculation is running.
     * </p>
     * <p>
     * <code>CANCELING</code> - A request to cancel the calculation has been received and the system is working to stop
     * it.
     * </p>
     * <p>
     * <code>CANCELED</code> - The calculation is no longer running as the result of a cancel request.
     * </p>
     * <p>
     * <code>COMPLETED</code> - The calculation has completed without error.
     * </p>
     * <p>
     * <code>FAILED</code> - The calculation failed and is no longer running.
     * </p>
     * 
     * @return The state of the calculation execution. A description of each state follows.</p>
     *         <p>
     *         <code>CREATING</code> - The calculation is in the process of being created.
     *         </p>
     *         <p>
     *         <code>CREATED</code> - The calculation has been created and is ready to run.
     *         </p>
     *         <p>
     *         <code>QUEUED</code> - The calculation has been queued for processing.
     *         </p>
     *         <p>
     *         <code>RUNNING</code> - The calculation is running.
     *         </p>
     *         <p>
     *         <code>CANCELING</code> - A request to cancel the calculation has been received and the system is working
     *         to stop it.
     *         </p>
     *         <p>
     *         <code>CANCELED</code> - The calculation is no longer running as the result of a cancel request.
     *         </p>
     *         <p>
     *         <code>COMPLETED</code> - The calculation has completed without error.
     *         </p>
     *         <p>
     *         <code>FAILED</code> - The calculation failed and is no longer running.
     * @see CalculationExecutionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the calculation execution. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The calculation is in the process of being created.
     * </p>
     * <p>
     * <code>CREATED</code> - The calculation has been created and is ready to run.
     * </p>
     * <p>
     * <code>QUEUED</code> - The calculation has been queued for processing.
     * </p>
     * <p>
     * <code>RUNNING</code> - The calculation is running.
     * </p>
     * <p>
     * <code>CANCELING</code> - A request to cancel the calculation has been received and the system is working to stop
     * it.
     * </p>
     * <p>
     * <code>CANCELED</code> - The calculation is no longer running as the result of a cancel request.
     * </p>
     * <p>
     * <code>COMPLETED</code> - The calculation has completed without error.
     * </p>
     * <p>
     * <code>FAILED</code> - The calculation failed and is no longer running.
     * </p>
     * 
     * @param state
     *        The state of the calculation execution. A description of each state follows.</p>
     *        <p>
     *        <code>CREATING</code> - The calculation is in the process of being created.
     *        </p>
     *        <p>
     *        <code>CREATED</code> - The calculation has been created and is ready to run.
     *        </p>
     *        <p>
     *        <code>QUEUED</code> - The calculation has been queued for processing.
     *        </p>
     *        <p>
     *        <code>RUNNING</code> - The calculation is running.
     *        </p>
     *        <p>
     *        <code>CANCELING</code> - A request to cancel the calculation has been received and the system is working
     *        to stop it.
     *        </p>
     *        <p>
     *        <code>CANCELED</code> - The calculation is no longer running as the result of a cancel request.
     *        </p>
     *        <p>
     *        <code>COMPLETED</code> - The calculation has completed without error.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - The calculation failed and is no longer running.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CalculationExecutionState
     */

    public CalculationStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the calculation execution. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The calculation is in the process of being created.
     * </p>
     * <p>
     * <code>CREATED</code> - The calculation has been created and is ready to run.
     * </p>
     * <p>
     * <code>QUEUED</code> - The calculation has been queued for processing.
     * </p>
     * <p>
     * <code>RUNNING</code> - The calculation is running.
     * </p>
     * <p>
     * <code>CANCELING</code> - A request to cancel the calculation has been received and the system is working to stop
     * it.
     * </p>
     * <p>
     * <code>CANCELED</code> - The calculation is no longer running as the result of a cancel request.
     * </p>
     * <p>
     * <code>COMPLETED</code> - The calculation has completed without error.
     * </p>
     * <p>
     * <code>FAILED</code> - The calculation failed and is no longer running.
     * </p>
     * 
     * @param state
     *        The state of the calculation execution. A description of each state follows.</p>
     *        <p>
     *        <code>CREATING</code> - The calculation is in the process of being created.
     *        </p>
     *        <p>
     *        <code>CREATED</code> - The calculation has been created and is ready to run.
     *        </p>
     *        <p>
     *        <code>QUEUED</code> - The calculation has been queued for processing.
     *        </p>
     *        <p>
     *        <code>RUNNING</code> - The calculation is running.
     *        </p>
     *        <p>
     *        <code>CANCELING</code> - A request to cancel the calculation has been received and the system is working
     *        to stop it.
     *        </p>
     *        <p>
     *        <code>CANCELED</code> - The calculation is no longer running as the result of a cancel request.
     *        </p>
     *        <p>
     *        <code>COMPLETED</code> - The calculation has completed without error.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - The calculation failed and is no longer running.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CalculationExecutionState
     */

    public CalculationStatus withState(CalculationExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the calculation state change (for example, the calculation was canceled because the session was
     * terminated).
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the calculation state change (for example, the calculation was canceled because the session
     *        was terminated).
     */

    public void setStateChangeReason(String stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason for the calculation state change (for example, the calculation was canceled because the session was
     * terminated).
     * </p>
     * 
     * @return The reason for the calculation state change (for example, the calculation was canceled because the
     *         session was terminated).
     */

    public String getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The reason for the calculation state change (for example, the calculation was canceled because the session was
     * terminated).
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the calculation state change (for example, the calculation was canceled because the session
     *        was terminated).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationStatus withStateChangeReason(String stateChangeReason) {
        setStateChangeReason(stateChangeReason);
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
        if (getSubmissionDateTime() != null)
            sb.append("SubmissionDateTime: ").append(getSubmissionDateTime()).append(",");
        if (getCompletionDateTime() != null)
            sb.append("CompletionDateTime: ").append(getCompletionDateTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculationStatus == false)
            return false;
        CalculationStatus other = (CalculationStatus) obj;
        if (other.getSubmissionDateTime() == null ^ this.getSubmissionDateTime() == null)
            return false;
        if (other.getSubmissionDateTime() != null && other.getSubmissionDateTime().equals(this.getSubmissionDateTime()) == false)
            return false;
        if (other.getCompletionDateTime() == null ^ this.getCompletionDateTime() == null)
            return false;
        if (other.getCompletionDateTime() != null && other.getCompletionDateTime().equals(this.getCompletionDateTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubmissionDateTime() == null) ? 0 : getSubmissionDateTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionDateTime() == null) ? 0 : getCompletionDateTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        return hashCode;
    }

    @Override
    public CalculationStatus clone() {
        try {
            return (CalculationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.CalculationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
