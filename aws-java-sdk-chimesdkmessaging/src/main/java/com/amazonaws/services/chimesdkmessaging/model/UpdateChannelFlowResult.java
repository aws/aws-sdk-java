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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelFlow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelFlowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel flow.
     * </p>
     */
    private String channelFlowArn;

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

    public UpdateChannelFlowResult withChannelFlowArn(String channelFlowArn) {
        setChannelFlowArn(channelFlowArn);
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
            sb.append("ChannelFlowArn: ").append(getChannelFlowArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelFlowResult == false)
            return false;
        UpdateChannelFlowResult other = (UpdateChannelFlowResult) obj;
        if (other.getChannelFlowArn() == null ^ this.getChannelFlowArn() == null)
            return false;
        if (other.getChannelFlowArn() != null && other.getChannelFlowArn().equals(this.getChannelFlowArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelFlowArn() == null) ? 0 : getChannelFlowArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelFlowResult clone() {
        try {
            return (UpdateChannelFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
