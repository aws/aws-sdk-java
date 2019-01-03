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
 * Decision attributes specified in <code>scheduleLambdaFunctionDecisionAttributes</code> within the list of decisions
 * <code>decisions</code> passed to <a>RespondDecisionTaskCompleted</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ScheduleLambdaFunctionDecisionAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleLambdaFunctionDecisionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string that identifies the Lambda function execution in the event history.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name, or ARN, of the Lambda function to schedule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * Lambda task.
     * </p>
     */
    private String control;
    /**
     * <p>
     * The optional input data to be supplied to the Lambda function.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The timeout value, in seconds, after which the Lambda function is considered to be failed once it has started.
     * This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s is assumed.
     * </p>
     */
    private String startToCloseTimeout;

    /**
     * <p>
     * A string that identifies the Lambda function execution in the event history.
     * </p>
     * 
     * @param id
     *        A string that identifies the Lambda function execution in the event history.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A string that identifies the Lambda function execution in the event history.
     * </p>
     * 
     * @return A string that identifies the Lambda function execution in the event history.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A string that identifies the Lambda function execution in the event history.
     * </p>
     * 
     * @param id
     *        A string that identifies the Lambda function execution in the event history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionDecisionAttributes withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name, or ARN, of the Lambda function to schedule.
     * </p>
     * 
     * @param name
     *        The name, or ARN, of the Lambda function to schedule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name, or ARN, of the Lambda function to schedule.
     * </p>
     * 
     * @return The name, or ARN, of the Lambda function to schedule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name, or ARN, of the Lambda function to schedule.
     * </p>
     * 
     * @param name
     *        The name, or ARN, of the Lambda function to schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionDecisionAttributes withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * Lambda task.
     * </p>
     * 
     * @param control
     *        The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent
     *        to the Lambda task.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * Lambda task.
     * </p>
     * 
     * @return The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't
     *         sent to the Lambda task.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * Lambda task.
     * </p>
     * 
     * @param control
     *        The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent
     *        to the Lambda task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionDecisionAttributes withControl(String control) {
        setControl(control);
        return this;
    }

    /**
     * <p>
     * The optional input data to be supplied to the Lambda function.
     * </p>
     * 
     * @param input
     *        The optional input data to be supplied to the Lambda function.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The optional input data to be supplied to the Lambda function.
     * </p>
     * 
     * @return The optional input data to be supplied to the Lambda function.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The optional input data to be supplied to the Lambda function.
     * </p>
     * 
     * @param input
     *        The optional input data to be supplied to the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionDecisionAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The timeout value, in seconds, after which the Lambda function is considered to be failed once it has started.
     * This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s is assumed.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The timeout value, in seconds, after which the Lambda function is considered to be failed once it has
     *        started. This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s
     *        is assumed.
     */

    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }

    /**
     * <p>
     * The timeout value, in seconds, after which the Lambda function is considered to be failed once it has started.
     * This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s is assumed.
     * </p>
     * 
     * @return The timeout value, in seconds, after which the Lambda function is considered to be failed once it has
     *         started. This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of
     *         300s is assumed.
     */

    public String getStartToCloseTimeout() {
        return this.startToCloseTimeout;
    }

    /**
     * <p>
     * The timeout value, in seconds, after which the Lambda function is considered to be failed once it has started.
     * This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s is assumed.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The timeout value, in seconds, after which the Lambda function is considered to be failed once it has
     *        started. This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s
     *        is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionDecisionAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        setStartToCloseTimeout(startToCloseTimeout);
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
            sb.append("StartToCloseTimeout: ").append(getStartToCloseTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleLambdaFunctionDecisionAttributes == false)
            return false;
        ScheduleLambdaFunctionDecisionAttributes other = (ScheduleLambdaFunctionDecisionAttributes) obj;
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
        return hashCode;
    }

    @Override
    public ScheduleLambdaFunctionDecisionAttributes clone() {
        try {
            return (ScheduleLambdaFunctionDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.ScheduleLambdaFunctionDecisionAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
