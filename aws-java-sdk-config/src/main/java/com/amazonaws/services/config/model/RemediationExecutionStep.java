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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Name of the step from the SSM document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RemediationExecutionStep" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemediationExecutionStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of the step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The valid status of the step.
     * </p>
     */
    private String state;
    /**
     * <p>
     * An error message if the step was interrupted during execution.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The time when the step started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time when the step stopped.
     * </p>
     */
    private java.util.Date stopTime;

    /**
     * <p>
     * The details of the step.
     * </p>
     * 
     * @param name
     *        The details of the step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The details of the step.
     * </p>
     * 
     * @return The details of the step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The details of the step.
     * </p>
     * 
     * @param name
     *        The details of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationExecutionStep withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The valid status of the step.
     * </p>
     * 
     * @param state
     *        The valid status of the step.
     * @see RemediationExecutionStepState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The valid status of the step.
     * </p>
     * 
     * @return The valid status of the step.
     * @see RemediationExecutionStepState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The valid status of the step.
     * </p>
     * 
     * @param state
     *        The valid status of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemediationExecutionStepState
     */

    public RemediationExecutionStep withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The valid status of the step.
     * </p>
     * 
     * @param state
     *        The valid status of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemediationExecutionStepState
     */

    public RemediationExecutionStep withState(RemediationExecutionStepState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * An error message if the step was interrupted during execution.
     * </p>
     * 
     * @param errorMessage
     *        An error message if the step was interrupted during execution.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message if the step was interrupted during execution.
     * </p>
     * 
     * @return An error message if the step was interrupted during execution.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message if the step was interrupted during execution.
     * </p>
     * 
     * @param errorMessage
     *        An error message if the step was interrupted during execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationExecutionStep withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The time when the step started.
     * </p>
     * 
     * @param startTime
     *        The time when the step started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when the step started.
     * </p>
     * 
     * @return The time when the step started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when the step started.
     * </p>
     * 
     * @param startTime
     *        The time when the step started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationExecutionStep withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time when the step stopped.
     * </p>
     * 
     * @param stopTime
     *        The time when the step stopped.
     */

    public void setStopTime(java.util.Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * <p>
     * The time when the step stopped.
     * </p>
     * 
     * @return The time when the step stopped.
     */

    public java.util.Date getStopTime() {
        return this.stopTime;
    }

    /**
     * <p>
     * The time when the step stopped.
     * </p>
     * 
     * @param stopTime
     *        The time when the step stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationExecutionStep withStopTime(java.util.Date stopTime) {
        setStopTime(stopTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStopTime() != null)
            sb.append("StopTime: ").append(getStopTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemediationExecutionStep == false)
            return false;
        RemediationExecutionStep other = (RemediationExecutionStep) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStopTime() == null ^ this.getStopTime() == null)
            return false;
        if (other.getStopTime() != null && other.getStopTime().equals(this.getStopTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStopTime() == null) ? 0 : getStopTime().hashCode());
        return hashCode;
    }

    @Override
    public RemediationExecutionStep clone() {
        try {
            return (RemediationExecutionStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RemediationExecutionStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
