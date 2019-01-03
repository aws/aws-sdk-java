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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Flow flow;

    private Messages messages;

    /**
     * @param flow
     */

    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    /**
     * @return
     */

    public Flow getFlow() {
        return this.flow;
    }

    /**
     * @param flow
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withFlow(Flow flow) {
        setFlow(flow);
        return this;
    }

    /**
     * @param messages
     */

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    /**
     * @return
     */

    public Messages getMessages() {
        return this.messages;
    }

    /**
     * @param messages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withMessages(Messages messages) {
        setMessages(messages);
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
        if (getFlow() != null)
            sb.append("Flow: ").append(getFlow()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlowResult == false)
            return false;
        DescribeFlowResult other = (DescribeFlowResult) obj;
        if (other.getFlow() == null ^ this.getFlow() == null)
            return false;
        if (other.getFlow() != null && other.getFlow().equals(this.getFlow()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlow() == null) ? 0 : getFlow().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlowResult clone() {
        try {
            return (DescribeFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
