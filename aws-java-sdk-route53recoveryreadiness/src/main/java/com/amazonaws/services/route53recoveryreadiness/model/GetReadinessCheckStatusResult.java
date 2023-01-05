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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadinessCheckStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Top level messages for readiness check status
     * </p>
     */
    private java.util.List<Message> messages;
    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The readiness at rule level.
     * </p>
     */
    private String readiness;
    /**
     * <p>
     * Summary of the readiness of resources.
     * </p>
     */
    private java.util.List<ResourceResult> resources;

    /**
     * <p>
     * Top level messages for readiness check status
     * </p>
     * 
     * @return Top level messages for readiness check status
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * Top level messages for readiness check status
     * </p>
     * 
     * @param messages
     *        Top level messages for readiness check status
     */

    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * Top level messages for readiness check status
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        Top level messages for readiness check status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckStatusResult withMessages(Message... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<Message>(messages.length));
        }
        for (Message ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Top level messages for readiness check status
     * </p>
     * 
     * @param messages
     *        Top level messages for readiness check status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckStatusResult withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckStatusResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The readiness at rule level.
     * </p>
     * 
     * @param readiness
     *        The readiness at rule level.
     * @see Readiness
     */

    public void setReadiness(String readiness) {
        this.readiness = readiness;
    }

    /**
     * <p>
     * The readiness at rule level.
     * </p>
     * 
     * @return The readiness at rule level.
     * @see Readiness
     */

    public String getReadiness() {
        return this.readiness;
    }

    /**
     * <p>
     * The readiness at rule level.
     * </p>
     * 
     * @param readiness
     *        The readiness at rule level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public GetReadinessCheckStatusResult withReadiness(String readiness) {
        setReadiness(readiness);
        return this;
    }

    /**
     * <p>
     * The readiness at rule level.
     * </p>
     * 
     * @param readiness
     *        The readiness at rule level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public GetReadinessCheckStatusResult withReadiness(Readiness readiness) {
        this.readiness = readiness.toString();
        return this;
    }

    /**
     * <p>
     * Summary of the readiness of resources.
     * </p>
     * 
     * @return Summary of the readiness of resources.
     */

    public java.util.List<ResourceResult> getResources() {
        return resources;
    }

    /**
     * <p>
     * Summary of the readiness of resources.
     * </p>
     * 
     * @param resources
     *        Summary of the readiness of resources.
     */

    public void setResources(java.util.Collection<ResourceResult> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<ResourceResult>(resources);
    }

    /**
     * <p>
     * Summary of the readiness of resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        Summary of the readiness of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckStatusResult withResources(ResourceResult... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<ResourceResult>(resources.length));
        }
        for (ResourceResult ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary of the readiness of resources.
     * </p>
     * 
     * @param resources
     *        Summary of the readiness of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckStatusResult withResources(java.util.Collection<ResourceResult> resources) {
        setResources(resources);
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
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReadiness() != null)
            sb.append("Readiness: ").append(getReadiness()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReadinessCheckStatusResult == false)
            return false;
        GetReadinessCheckStatusResult other = (GetReadinessCheckStatusResult) obj;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReadiness() == null ^ this.getReadiness() == null)
            return false;
        if (other.getReadiness() != null && other.getReadiness().equals(this.getReadiness()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReadiness() == null) ? 0 : getReadiness().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public GetReadinessCheckStatusResult clone() {
        try {
            return (GetReadinessCheckStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
