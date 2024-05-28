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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A detailed status of the parent step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ParentStepDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParentStepDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     */
    private String stepExecutionId;
    /**
     * <p>
     * The name of the step.
     * </p>
     */
    private String stepName;
    /**
     * <p>
     * The name of the automation action.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The current repetition of the loop represented by an integer.
     * </p>
     */
    private Integer iteration;
    /**
     * <p>
     * The current value of the specified iterator in the loop.
     * </p>
     */
    private String iteratorValue;

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     * 
     * @param stepExecutionId
     *        The unique ID of a step execution.
     */

    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     * 
     * @return The unique ID of a step execution.
     */

    public String getStepExecutionId() {
        return this.stepExecutionId;
    }

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     * 
     * @param stepExecutionId
     *        The unique ID of a step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentStepDetails withStepExecutionId(String stepExecutionId) {
        setStepExecutionId(stepExecutionId);
        return this;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param stepName
     *        The name of the step.
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @return The name of the step.
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param stepName
     *        The name of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentStepDetails withStepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    /**
     * <p>
     * The name of the automation action.
     * </p>
     * 
     * @param action
     *        The name of the automation action.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The name of the automation action.
     * </p>
     * 
     * @return The name of the automation action.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The name of the automation action.
     * </p>
     * 
     * @param action
     *        The name of the automation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentStepDetails withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The current repetition of the loop represented by an integer.
     * </p>
     * 
     * @param iteration
     *        The current repetition of the loop represented by an integer.
     */

    public void setIteration(Integer iteration) {
        this.iteration = iteration;
    }

    /**
     * <p>
     * The current repetition of the loop represented by an integer.
     * </p>
     * 
     * @return The current repetition of the loop represented by an integer.
     */

    public Integer getIteration() {
        return this.iteration;
    }

    /**
     * <p>
     * The current repetition of the loop represented by an integer.
     * </p>
     * 
     * @param iteration
     *        The current repetition of the loop represented by an integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentStepDetails withIteration(Integer iteration) {
        setIteration(iteration);
        return this;
    }

    /**
     * <p>
     * The current value of the specified iterator in the loop.
     * </p>
     * 
     * @param iteratorValue
     *        The current value of the specified iterator in the loop.
     */

    public void setIteratorValue(String iteratorValue) {
        this.iteratorValue = iteratorValue;
    }

    /**
     * <p>
     * The current value of the specified iterator in the loop.
     * </p>
     * 
     * @return The current value of the specified iterator in the loop.
     */

    public String getIteratorValue() {
        return this.iteratorValue;
    }

    /**
     * <p>
     * The current value of the specified iterator in the loop.
     * </p>
     * 
     * @param iteratorValue
     *        The current value of the specified iterator in the loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentStepDetails withIteratorValue(String iteratorValue) {
        setIteratorValue(iteratorValue);
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
        if (getStepExecutionId() != null)
            sb.append("StepExecutionId: ").append(getStepExecutionId()).append(",");
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getIteration() != null)
            sb.append("Iteration: ").append(getIteration()).append(",");
        if (getIteratorValue() != null)
            sb.append("IteratorValue: ").append(getIteratorValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParentStepDetails == false)
            return false;
        ParentStepDetails other = (ParentStepDetails) obj;
        if (other.getStepExecutionId() == null ^ this.getStepExecutionId() == null)
            return false;
        if (other.getStepExecutionId() != null && other.getStepExecutionId().equals(this.getStepExecutionId()) == false)
            return false;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getIteration() == null ^ this.getIteration() == null)
            return false;
        if (other.getIteration() != null && other.getIteration().equals(this.getIteration()) == false)
            return false;
        if (other.getIteratorValue() == null ^ this.getIteratorValue() == null)
            return false;
        if (other.getIteratorValue() != null && other.getIteratorValue().equals(this.getIteratorValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepExecutionId() == null) ? 0 : getStepExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getIteration() == null) ? 0 : getIteration().hashCode());
        hashCode = prime * hashCode + ((getIteratorValue() == null) ? 0 : getIteratorValue().hashCode());
        return hashCode;
    }

    @Override
    public ParentStepDetails clone() {
        try {
            return (ParentStepDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ParentStepDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
