/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StopStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the channel for which the stream is to be stopped.
     * </p>
     */
    private String channelArn;

    /**
     * <p>
     * ARN of the channel for which the stream is to be stopped.
     * </p>
     * 
     * @param channelArn
     *        ARN of the channel for which the stream is to be stopped.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * ARN of the channel for which the stream is to be stopped.
     * </p>
     * 
     * @return ARN of the channel for which the stream is to be stopped.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * ARN of the channel for which the stream is to be stopped.
     * </p>
     * 
     * @param channelArn
     *        ARN of the channel for which the stream is to be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopStreamRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopStreamRequest == false)
            return false;
        StopStreamRequest other = (StopStreamRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        return hashCode;
    }

    @Override
    public StopStreamRequest clone() {
        return (StopStreamRequest) super.clone();
    }

}
