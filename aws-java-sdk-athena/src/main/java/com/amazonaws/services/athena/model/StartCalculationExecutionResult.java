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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartCalculationExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCalculationExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     */
    private String calculationExecutionId;
    /**
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
     * The calculation execution UUID.
     * </p>
     * 
     * @param calculationExecutionId
     *        The calculation execution UUID.
     */

    public void setCalculationExecutionId(String calculationExecutionId) {
        this.calculationExecutionId = calculationExecutionId;
    }

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @return The calculation execution UUID.
     */

    public String getCalculationExecutionId() {
        return this.calculationExecutionId;
    }

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @param calculationExecutionId
     *        The calculation execution UUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCalculationExecutionResult withCalculationExecutionId(String calculationExecutionId) {
        setCalculationExecutionId(calculationExecutionId);
        return this;
    }

    /**
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
     *        <code>CREATING</code> - The calculation is in the process of being created.</p>
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
     * @return <code>CREATING</code> - The calculation is in the process of being created.</p>
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
     *        <code>CREATING</code> - The calculation is in the process of being created.</p>
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

    public StartCalculationExecutionResult withState(String state) {
        setState(state);
        return this;
    }

    /**
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
     *        <code>CREATING</code> - The calculation is in the process of being created.</p>
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

    public StartCalculationExecutionResult withState(CalculationExecutionState state) {
        this.state = state.toString();
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
        if (getCalculationExecutionId() != null)
            sb.append("CalculationExecutionId: ").append(getCalculationExecutionId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCalculationExecutionResult == false)
            return false;
        StartCalculationExecutionResult other = (StartCalculationExecutionResult) obj;
        if (other.getCalculationExecutionId() == null ^ this.getCalculationExecutionId() == null)
            return false;
        if (other.getCalculationExecutionId() != null && other.getCalculationExecutionId().equals(this.getCalculationExecutionId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalculationExecutionId() == null) ? 0 : getCalculationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public StartCalculationExecutionResult clone() {
        try {
            return (StartCalculationExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
