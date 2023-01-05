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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ChannelFlowCallback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelFlowCallbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier passed to the processor by the service when invoked. Use the identifier to call back the service.
     * </p>
     */
    private String callbackId;
    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * When a processor determines that a message needs to be <code>DENIED</code>, pass this parameter with a value of
     * true.
     * </p>
     */
    private Boolean deleteResource;
    /**
     * <p>
     * Stores information about the processed message.
     * </p>
     */
    private ChannelMessageCallback channelMessage;

    /**
     * <p>
     * The identifier passed to the processor by the service when invoked. Use the identifier to call back the service.
     * </p>
     * 
     * @param callbackId
     *        The identifier passed to the processor by the service when invoked. Use the identifier to call back the
     *        service.
     */

    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    /**
     * <p>
     * The identifier passed to the processor by the service when invoked. Use the identifier to call back the service.
     * </p>
     * 
     * @return The identifier passed to the processor by the service when invoked. Use the identifier to call back the
     *         service.
     */

    public String getCallbackId() {
        return this.callbackId;
    }

    /**
     * <p>
     * The identifier passed to the processor by the service when invoked. Use the identifier to call back the service.
     * </p>
     * 
     * @param callbackId
     *        The identifier passed to the processor by the service when invoked. Use the identifier to call back the
     *        service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelFlowCallbackRequest withCallbackId(String callbackId) {
        setCallbackId(callbackId);
        return this;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @return The ARN of the channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelFlowCallbackRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * When a processor determines that a message needs to be <code>DENIED</code>, pass this parameter with a value of
     * true.
     * </p>
     * 
     * @param deleteResource
     *        When a processor determines that a message needs to be <code>DENIED</code>, pass this parameter with a
     *        value of true.
     */

    public void setDeleteResource(Boolean deleteResource) {
        this.deleteResource = deleteResource;
    }

    /**
     * <p>
     * When a processor determines that a message needs to be <code>DENIED</code>, pass this parameter with a value of
     * true.
     * </p>
     * 
     * @return When a processor determines that a message needs to be <code>DENIED</code>, pass this parameter with a
     *         value of true.
     */

    public Boolean getDeleteResource() {
        return this.deleteResource;
    }

    /**
     * <p>
     * When a processor determines that a message needs to be <code>DENIED</code>, pass this parameter with a value of
     * true.
     * </p>
     * 
     * @param deleteResource
     *        When a processor determines that a message needs to be <code>DENIED</code>, pass this parameter with a
     *        value of true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelFlowCallbackRequest withDeleteResource(Boolean deleteResource) {
        setDeleteResource(deleteResource);
        return this;
    }

    /**
     * <p>
     * When a processor determines that a message needs to be <code>DENIED</code>, pass this parameter with a value of
     * true.
     * </p>
     * 
     * @return When a processor determines that a message needs to be <code>DENIED</code>, pass this parameter with a
     *         value of true.
     */

    public Boolean isDeleteResource() {
        return this.deleteResource;
    }

    /**
     * <p>
     * Stores information about the processed message.
     * </p>
     * 
     * @param channelMessage
     *        Stores information about the processed message.
     */

    public void setChannelMessage(ChannelMessageCallback channelMessage) {
        this.channelMessage = channelMessage;
    }

    /**
     * <p>
     * Stores information about the processed message.
     * </p>
     * 
     * @return Stores information about the processed message.
     */

    public ChannelMessageCallback getChannelMessage() {
        return this.channelMessage;
    }

    /**
     * <p>
     * Stores information about the processed message.
     * </p>
     * 
     * @param channelMessage
     *        Stores information about the processed message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelFlowCallbackRequest withChannelMessage(ChannelMessageCallback channelMessage) {
        setChannelMessage(channelMessage);
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
        if (getCallbackId() != null)
            sb.append("CallbackId: ").append(getCallbackId()).append(",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getDeleteResource() != null)
            sb.append("DeleteResource: ").append(getDeleteResource()).append(",");
        if (getChannelMessage() != null)
            sb.append("ChannelMessage: ").append(getChannelMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelFlowCallbackRequest == false)
            return false;
        ChannelFlowCallbackRequest other = (ChannelFlowCallbackRequest) obj;
        if (other.getCallbackId() == null ^ this.getCallbackId() == null)
            return false;
        if (other.getCallbackId() != null && other.getCallbackId().equals(this.getCallbackId()) == false)
            return false;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getDeleteResource() == null ^ this.getDeleteResource() == null)
            return false;
        if (other.getDeleteResource() != null && other.getDeleteResource().equals(this.getDeleteResource()) == false)
            return false;
        if (other.getChannelMessage() == null ^ this.getChannelMessage() == null)
            return false;
        if (other.getChannelMessage() != null && other.getChannelMessage().equals(this.getChannelMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallbackId() == null) ? 0 : getCallbackId().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getDeleteResource() == null) ? 0 : getDeleteResource().hashCode());
        hashCode = prime * hashCode + ((getChannelMessage() == null) ? 0 : getChannelMessage().hashCode());
        return hashCode;
    }

    @Override
    public ChannelFlowCallbackRequest clone() {
        return (ChannelFlowCallbackRequest) super.clone();
    }

}
