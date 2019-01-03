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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/LambdaFunctionScheduledEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionScheduledEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the Lambda task.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * Lambda task.
     * </p>
     */
    private String control;
    /**
     * <p>
     * The input provided to the Lambda task.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The maximum amount of time a worker can take to process the Lambda task.
     * </p>
     */
    private String startToCloseTimeout;
    /**
     * <p>
     * The ID of the <code>LambdaFunctionCompleted</code> event corresponding to the decision that resulted in
     * scheduling this activity task. To help diagnose issues, use this information to trace back the chain of events
     * leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;

    /**
     * <p>
     * The unique ID of the Lambda task.
     * </p>
     * 
     * @param id
     *        The unique ID of the Lambda task.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the Lambda task.
     * </p>
     * 
     * @return The unique ID of the Lambda task.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the Lambda task.
     * </p>
     * 
     * @param id
     *        The unique ID of the Lambda task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * 
     * @param name
     *        The name of the Lambda function.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * 
     * @return The name of the Lambda function.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * 
     * @param name
     *        The name of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * Lambda task.
     * </p>
     * 
     * @param control
     *        Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to
     *        the Lambda task.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * Lambda task.
     * </p>
     * 
     * @return Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to
     *         the Lambda task.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * Lambda task.
     * </p>
     * 
     * @param control
     *        Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to
     *        the Lambda task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withControl(String control) {
        setControl(control);
        return this;
    }

    /**
     * <p>
     * The input provided to the Lambda task.
     * </p>
     * 
     * @param input
     *        The input provided to the Lambda task.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The input provided to the Lambda task.
     * </p>
     * 
     * @return The input provided to the Lambda task.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The input provided to the Lambda task.
     * </p>
     * 
     * @param input
     *        The input provided to the Lambda task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time a worker can take to process the Lambda task.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The maximum amount of time a worker can take to process the Lambda task.
     */

    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }

    /**
     * <p>
     * The maximum amount of time a worker can take to process the Lambda task.
     * </p>
     * 
     * @return The maximum amount of time a worker can take to process the Lambda task.
     */

    public String getStartToCloseTimeout() {
        return this.startToCloseTimeout;
    }

    /**
     * <p>
     * The maximum amount of time a worker can take to process the Lambda task.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The maximum amount of time a worker can take to process the Lambda task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        setStartToCloseTimeout(startToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>LambdaFunctionCompleted</code> event corresponding to the decision that resulted in
     * scheduling this activity task. To help diagnose issues, use this information to trace back the chain of events
     * leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>LambdaFunctionCompleted</code> event corresponding to the decision that resulted in
     *        scheduling this activity task. To help diagnose issues, use this information to trace back the chain of
     *        events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>LambdaFunctionCompleted</code> event corresponding to the decision that resulted in
     * scheduling this activity task. To help diagnose issues, use this information to trace back the chain of events
     * leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>LambdaFunctionCompleted</code> event corresponding to the decision that resulted in
     *         scheduling this activity task. To help diagnose issues, use this information to trace back the chain of
     *         events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>LambdaFunctionCompleted</code> event corresponding to the decision that resulted in
     * scheduling this activity task. To help diagnose issues, use this information to trace back the chain of events
     * leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>LambdaFunctionCompleted</code> event corresponding to the decision that resulted in
     *        scheduling this activity task. To help diagnose issues, use this information to trace back the chain of
     *        events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getControl() != null)
            sb.append("Control: ").append(getControl()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getStartToCloseTimeout() != null)
            sb.append("StartToCloseTimeout: ").append(getStartToCloseTimeout()).append(",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: ").append(getDecisionTaskCompletedEventId());
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
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
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
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.LambdaFunctionScheduledEventAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
