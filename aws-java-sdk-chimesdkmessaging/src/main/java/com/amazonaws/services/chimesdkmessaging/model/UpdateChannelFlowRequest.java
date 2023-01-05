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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelFlow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel flow.
     * </p>
     */
    private String channelFlowArn;
    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     */
    private java.util.List<Processor> processors;
    /**
     * <p>
     * The name of the channel flow.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ARN of the channel flow.
     * </p>
     * 
     * @param channelFlowArn
     *        The ARN of the channel flow.
     */

    public void setChannelFlowArn(String channelFlowArn) {
        this.channelFlowArn = channelFlowArn;
    }

    /**
     * <p>
     * The ARN of the channel flow.
     * </p>
     * 
     * @return The ARN of the channel flow.
     */

    public String getChannelFlowArn() {
        return this.channelFlowArn;
    }

    /**
     * <p>
     * The ARN of the channel flow.
     * </p>
     * 
     * @param channelFlowArn
     *        The ARN of the channel flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelFlowRequest withChannelFlowArn(String channelFlowArn) {
        setChannelFlowArn(channelFlowArn);
        return this;
    }

    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     * 
     * @return Information about the processor Lambda functions
     */

    public java.util.List<Processor> getProcessors() {
        return processors;
    }

    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     * 
     * @param processors
     *        Information about the processor Lambda functions
     */

    public void setProcessors(java.util.Collection<Processor> processors) {
        if (processors == null) {
            this.processors = null;
            return;
        }

        this.processors = new java.util.ArrayList<Processor>(processors);
    }

    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessors(java.util.Collection)} or {@link #withProcessors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param processors
     *        Information about the processor Lambda functions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelFlowRequest withProcessors(Processor... processors) {
        if (this.processors == null) {
            setProcessors(new java.util.ArrayList<Processor>(processors.length));
        }
        for (Processor ele : processors) {
            this.processors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     * 
     * @param processors
     *        Information about the processor Lambda functions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelFlowRequest withProcessors(java.util.Collection<Processor> processors) {
        setProcessors(processors);
        return this;
    }

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

    public UpdateChannelFlowRequest withName(String name) {
        setName(name);
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
        if (getChannelFlowArn() != null)
            sb.append("ChannelFlowArn: ").append(getChannelFlowArn()).append(",");
        if (getProcessors() != null)
            sb.append("Processors: ").append(getProcessors()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelFlowRequest == false)
            return false;
        UpdateChannelFlowRequest other = (UpdateChannelFlowRequest) obj;
        if (other.getChannelFlowArn() == null ^ this.getChannelFlowArn() == null)
            return false;
        if (other.getChannelFlowArn() != null && other.getChannelFlowArn().equals(this.getChannelFlowArn()) == false)
            return false;
        if (other.getProcessors() == null ^ this.getProcessors() == null)
            return false;
        if (other.getProcessors() != null && other.getProcessors().equals(this.getProcessors()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelFlowArn() == null) ? 0 : getChannelFlowArn().hashCode());
        hashCode = prime * hashCode + ((getProcessors() == null) ? 0 : getProcessors().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelFlowRequest clone() {
        return (UpdateChannelFlowRequest) super.clone();
    }

}
