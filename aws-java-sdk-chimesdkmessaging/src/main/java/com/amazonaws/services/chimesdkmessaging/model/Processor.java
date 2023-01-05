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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about a processor in a channel flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/Processor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Processor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The information about the type of processor and its identifier.
     * </p>
     */
    private ProcessorConfiguration configuration;
    /**
     * <p>
     * The sequence in which processors run. If you have multiple processors in a channel flow, message processing goes
     * through each processor in the sequence. The value determines the sequence. At this point, we support only 1
     * processor within a flow.
     * </p>
     */
    private Integer executionOrder;
    /**
     * <p>
     * Determines whether to continue with message processing or stop it in cases where communication with a processor
     * fails. If a processor has a fallback action of <code>ABORT</code> and communication with it fails, the processor
     * sets the message status to <code>FAILED</code> and does not send the message to any recipients. Note that if the
     * last processor in the channel flow sequence has a fallback action of <code>CONTINUE</code> and communication with
     * the processor fails, then the message is considered processed and sent to recipients of the channel.
     * </p>
     */
    private String fallbackAction;

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * 
     * @param name
     *        The name of the channel flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * 
     * @return The name of the channel flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * 
     * @param name
     *        The name of the channel flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Processor withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The information about the type of processor and its identifier.
     * </p>
     * 
     * @param configuration
     *        The information about the type of processor and its identifier.
     */

    public void setConfiguration(ProcessorConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The information about the type of processor and its identifier.
     * </p>
     * 
     * @return The information about the type of processor and its identifier.
     */

    public ProcessorConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The information about the type of processor and its identifier.
     * </p>
     * 
     * @param configuration
     *        The information about the type of processor and its identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Processor withConfiguration(ProcessorConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The sequence in which processors run. If you have multiple processors in a channel flow, message processing goes
     * through each processor in the sequence. The value determines the sequence. At this point, we support only 1
     * processor within a flow.
     * </p>
     * 
     * @param executionOrder
     *        The sequence in which processors run. If you have multiple processors in a channel flow, message
     *        processing goes through each processor in the sequence. The value determines the sequence. At this point,
     *        we support only 1 processor within a flow.
     */

    public void setExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
    }

    /**
     * <p>
     * The sequence in which processors run. If you have multiple processors in a channel flow, message processing goes
     * through each processor in the sequence. The value determines the sequence. At this point, we support only 1
     * processor within a flow.
     * </p>
     * 
     * @return The sequence in which processors run. If you have multiple processors in a channel flow, message
     *         processing goes through each processor in the sequence. The value determines the sequence. At this point,
     *         we support only 1 processor within a flow.
     */

    public Integer getExecutionOrder() {
        return this.executionOrder;
    }

    /**
     * <p>
     * The sequence in which processors run. If you have multiple processors in a channel flow, message processing goes
     * through each processor in the sequence. The value determines the sequence. At this point, we support only 1
     * processor within a flow.
     * </p>
     * 
     * @param executionOrder
     *        The sequence in which processors run. If you have multiple processors in a channel flow, message
     *        processing goes through each processor in the sequence. The value determines the sequence. At this point,
     *        we support only 1 processor within a flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Processor withExecutionOrder(Integer executionOrder) {
        setExecutionOrder(executionOrder);
        return this;
    }

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in cases where communication with a processor
     * fails. If a processor has a fallback action of <code>ABORT</code> and communication with it fails, the processor
     * sets the message status to <code>FAILED</code> and does not send the message to any recipients. Note that if the
     * last processor in the channel flow sequence has a fallback action of <code>CONTINUE</code> and communication with
     * the processor fails, then the message is considered processed and sent to recipients of the channel.
     * </p>
     * 
     * @param fallbackAction
     *        Determines whether to continue with message processing or stop it in cases where communication with a
     *        processor fails. If a processor has a fallback action of <code>ABORT</code> and communication with it
     *        fails, the processor sets the message status to <code>FAILED</code> and does not send the message to any
     *        recipients. Note that if the last processor in the channel flow sequence has a fallback action of
     *        <code>CONTINUE</code> and communication with the processor fails, then the message is considered processed
     *        and sent to recipients of the channel.
     * @see FallbackAction
     */

    public void setFallbackAction(String fallbackAction) {
        this.fallbackAction = fallbackAction;
    }

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in cases where communication with a processor
     * fails. If a processor has a fallback action of <code>ABORT</code> and communication with it fails, the processor
     * sets the message status to <code>FAILED</code> and does not send the message to any recipients. Note that if the
     * last processor in the channel flow sequence has a fallback action of <code>CONTINUE</code> and communication with
     * the processor fails, then the message is considered processed and sent to recipients of the channel.
     * </p>
     * 
     * @return Determines whether to continue with message processing or stop it in cases where communication with a
     *         processor fails. If a processor has a fallback action of <code>ABORT</code> and communication with it
     *         fails, the processor sets the message status to <code>FAILED</code> and does not send the message to any
     *         recipients. Note that if the last processor in the channel flow sequence has a fallback action of
     *         <code>CONTINUE</code> and communication with the processor fails, then the message is considered
     *         processed and sent to recipients of the channel.
     * @see FallbackAction
     */

    public String getFallbackAction() {
        return this.fallbackAction;
    }

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in cases where communication with a processor
     * fails. If a processor has a fallback action of <code>ABORT</code> and communication with it fails, the processor
     * sets the message status to <code>FAILED</code> and does not send the message to any recipients. Note that if the
     * last processor in the channel flow sequence has a fallback action of <code>CONTINUE</code> and communication with
     * the processor fails, then the message is considered processed and sent to recipients of the channel.
     * </p>
     * 
     * @param fallbackAction
     *        Determines whether to continue with message processing or stop it in cases where communication with a
     *        processor fails. If a processor has a fallback action of <code>ABORT</code> and communication with it
     *        fails, the processor sets the message status to <code>FAILED</code> and does not send the message to any
     *        recipients. Note that if the last processor in the channel flow sequence has a fallback action of
     *        <code>CONTINUE</code> and communication with the processor fails, then the message is considered processed
     *        and sent to recipients of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FallbackAction
     */

    public Processor withFallbackAction(String fallbackAction) {
        setFallbackAction(fallbackAction);
        return this;
    }

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in cases where communication with a processor
     * fails. If a processor has a fallback action of <code>ABORT</code> and communication with it fails, the processor
     * sets the message status to <code>FAILED</code> and does not send the message to any recipients. Note that if the
     * last processor in the channel flow sequence has a fallback action of <code>CONTINUE</code> and communication with
     * the processor fails, then the message is considered processed and sent to recipients of the channel.
     * </p>
     * 
     * @param fallbackAction
     *        Determines whether to continue with message processing or stop it in cases where communication with a
     *        processor fails. If a processor has a fallback action of <code>ABORT</code> and communication with it
     *        fails, the processor sets the message status to <code>FAILED</code> and does not send the message to any
     *        recipients. Note that if the last processor in the channel flow sequence has a fallback action of
     *        <code>CONTINUE</code> and communication with the processor fails, then the message is considered processed
     *        and sent to recipients of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FallbackAction
     */

    public Processor withFallbackAction(FallbackAction fallbackAction) {
        this.fallbackAction = fallbackAction.toString();
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
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getExecutionOrder() != null)
            sb.append("ExecutionOrder: ").append(getExecutionOrder()).append(",");
        if (getFallbackAction() != null)
            sb.append("FallbackAction: ").append(getFallbackAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Processor == false)
            return false;
        Processor other = (Processor) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getExecutionOrder() == null ^ this.getExecutionOrder() == null)
            return false;
        if (other.getExecutionOrder() != null && other.getExecutionOrder().equals(this.getExecutionOrder()) == false)
            return false;
        if (other.getFallbackAction() == null ^ this.getFallbackAction() == null)
            return false;
        if (other.getFallbackAction() != null && other.getFallbackAction().equals(this.getFallbackAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getExecutionOrder() == null) ? 0 : getExecutionOrder().hashCode());
        hashCode = prime * hashCode + ((getFallbackAction() == null) ? 0 : getFallbackAction().hashCode());
        return hashCode;
    }

    @Override
    public Processor clone() {
        try {
            return (Processor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.ProcessorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
