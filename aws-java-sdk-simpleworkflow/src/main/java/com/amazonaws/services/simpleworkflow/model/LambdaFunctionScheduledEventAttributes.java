/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

/**
 * <p>
 * Provides details for the <code>LambdaFunctionScheduled</code> event.
 * </p>
 */
public class LambdaFunctionScheduledEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon SWF ID for the AWS Lambda task.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the scheduled AWS Lambda function.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Input provided to the AWS Lambda function.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The maximum time, in seconds, that the AWS Lambda function can take to execute from start to close before it is
     * marked as failed.
     * </p>
     */
    private String startToCloseTimeout;
    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event for the decision that resulted in the scheduling of this
     * AWS Lambda function. This information can be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;

    /**
     * <p>
     * The unique Amazon SWF ID for the AWS Lambda task.
     * </p>
     * 
     * @param id
     *        The unique Amazon SWF ID for the AWS Lambda task.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique Amazon SWF ID for the AWS Lambda task.
     * </p>
     * 
     * @return The unique Amazon SWF ID for the AWS Lambda task.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique Amazon SWF ID for the AWS Lambda task.
     * </p>
     * 
     * @param id
     *        The unique Amazon SWF ID for the AWS Lambda task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled AWS Lambda function.
     * </p>
     * 
     * @param name
     *        The name of the scheduled AWS Lambda function.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the scheduled AWS Lambda function.
     * </p>
     * 
     * @return The name of the scheduled AWS Lambda function.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the scheduled AWS Lambda function.
     * </p>
     * 
     * @param name
     *        The name of the scheduled AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Input provided to the AWS Lambda function.
     * </p>
     * 
     * @param input
     *        Input provided to the AWS Lambda function.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * Input provided to the AWS Lambda function.
     * </p>
     * 
     * @return Input provided to the AWS Lambda function.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * Input provided to the AWS Lambda function.
     * </p>
     * 
     * @param input
     *        Input provided to the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, that the AWS Lambda function can take to execute from start to close before it is
     * marked as failed.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The maximum time, in seconds, that the AWS Lambda function can take to execute from start to close before
     *        it is marked as failed.
     */

    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that the AWS Lambda function can take to execute from start to close before it is
     * marked as failed.
     * </p>
     * 
     * @return The maximum time, in seconds, that the AWS Lambda function can take to execute from start to close before
     *         it is marked as failed.
     */

    public String getStartToCloseTimeout() {
        return this.startToCloseTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that the AWS Lambda function can take to execute from start to close before it is
     * marked as failed.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The maximum time, in seconds, that the AWS Lambda function can take to execute from start to close before
     *        it is marked as failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        setStartToCloseTimeout(startToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event for the decision that resulted in the scheduling of this
     * AWS Lambda function. This information can be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event for the decision that resulted in the scheduling of
     *        this AWS Lambda function. This information can be useful for diagnosing problems by tracing back the chain
     *        of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event for the decision that resulted in the scheduling of this
     * AWS Lambda function. This information can be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event for the decision that resulted in the scheduling
     *         of this AWS Lambda function. This information can be useful for diagnosing problems by tracing back the
     *         chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event for the decision that resulted in the scheduling of this
     * AWS Lambda function. This information can be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event for the decision that resulted in the scheduling of
     *        this AWS Lambda function. This information can be useful for diagnosing problems by tracing back the chain
     *        of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getStartToCloseTimeout() != null)
            sb.append("StartToCloseTimeout: " + getStartToCloseTimeout() + ",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionScheduledEventAttributes == false)
            return false;
        LambdaFunctionScheduledEventAttributes other = (LambdaFunctionScheduledEventAttributes) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getStartToCloseTimeout() == null ^ this.getStartToCloseTimeout() == null)
            return false;
        if (other.getStartToCloseTimeout() != null && other.getStartToCloseTimeout().equals(this.getStartToCloseTimeout()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null)
            return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getStartToCloseTimeout() == null) ? 0 : getStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionScheduledEventAttributes clone() {
        try {
            return (LambdaFunctionScheduledEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
