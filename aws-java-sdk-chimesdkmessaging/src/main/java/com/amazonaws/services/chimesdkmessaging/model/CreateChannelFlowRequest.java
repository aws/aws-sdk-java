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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelFlow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel flow request.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * Information about the processor Lambda functions.
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
     * The tags for the creation request.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The client token for the request. An Idempotency token.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ARN of the channel flow request.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the channel flow request.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the channel flow request.
     * </p>
     * 
     * @return The ARN of the channel flow request.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the channel flow request.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the channel flow request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelFlowRequest withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * Information about the processor Lambda functions.
     * </p>
     * 
     * @return Information about the processor Lambda functions.
     */

    public java.util.List<Processor> getProcessors() {
        return processors;
    }

    /**
     * <p>
     * Information about the processor Lambda functions.
     * </p>
     * 
     * @param processors
     *        Information about the processor Lambda functions.
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
     * Information about the processor Lambda functions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessors(java.util.Collection)} or {@link #withProcessors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param processors
     *        Information about the processor Lambda functions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelFlowRequest withProcessors(Processor... processors) {
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
     * Information about the processor Lambda functions.
     * </p>
     * 
     * @param processors
     *        Information about the processor Lambda functions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelFlowRequest withProcessors(java.util.Collection<Processor> processors) {
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

    public CreateChannelFlowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * 
     * @return The tags for the creation request.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * 
     * @param tags
     *        The tags for the creation request.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the creation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelFlowRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * 
     * @param tags
     *        The tags for the creation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelFlowRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The client token for the request. An Idempotency token.
     * </p>
     * 
     * @param clientRequestToken
     *        The client token for the request. An Idempotency token.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The client token for the request. An Idempotency token.
     * </p>
     * 
     * @return The client token for the request. An Idempotency token.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The client token for the request. An Idempotency token.
     * </p>
     * 
     * @param clientRequestToken
     *        The client token for the request. An Idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelFlowRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getProcessors() != null)
            sb.append("Processors: ").append(getProcessors()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelFlowRequest == false)
            return false;
        CreateChannelFlowRequest other = (CreateChannelFlowRequest) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getProcessors() == null ^ this.getProcessors() == null)
            return false;
        if (other.getProcessors() != null && other.getProcessors().equals(this.getProcessors()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getProcessors() == null) ? 0 : getProcessors().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelFlowRequest clone() {
        return (CreateChannelFlowRequest) super.clone();
    }

}
