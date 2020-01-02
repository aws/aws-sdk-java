/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeSignalingChannel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSignalingChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the signaling channel that you want to describe.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The ARN of the signaling channel that you want to describe.
     * </p>
     */
    private String channelARN;

    /**
     * <p>
     * The name of the signaling channel that you want to describe.
     * </p>
     * 
     * @param channelName
     *        The name of the signaling channel that you want to describe.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the signaling channel that you want to describe.
     * </p>
     * 
     * @return The name of the signaling channel that you want to describe.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the signaling channel that you want to describe.
     * </p>
     * 
     * @param channelName
     *        The name of the signaling channel that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSignalingChannelRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The ARN of the signaling channel that you want to describe.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel that you want to describe.
     */

    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel that you want to describe.
     * </p>
     * 
     * @return The ARN of the signaling channel that you want to describe.
     */

    public String getChannelARN() {
        return this.channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel that you want to describe.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSignalingChannelRequest withChannelARN(String channelARN) {
        setChannelARN(channelARN);
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getChannelARN() != null)
            sb.append("ChannelARN: ").append(getChannelARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSignalingChannelRequest == false)
            return false;
        DescribeSignalingChannelRequest other = (DescribeSignalingChannelRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSignalingChannelRequest clone() {
        return (DescribeSignalingChannelRequest) super.clone();
    }

}
