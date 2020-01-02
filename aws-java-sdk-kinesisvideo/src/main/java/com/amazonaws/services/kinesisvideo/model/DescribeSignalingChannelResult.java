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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeSignalingChannel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSignalingChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that encapsulates the specified signaling channel's metadata and properties.
     * </p>
     */
    private ChannelInfo channelInfo;

    /**
     * <p>
     * A structure that encapsulates the specified signaling channel's metadata and properties.
     * </p>
     * 
     * @param channelInfo
     *        A structure that encapsulates the specified signaling channel's metadata and properties.
     */

    public void setChannelInfo(ChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
    }

    /**
     * <p>
     * A structure that encapsulates the specified signaling channel's metadata and properties.
     * </p>
     * 
     * @return A structure that encapsulates the specified signaling channel's metadata and properties.
     */

    public ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    /**
     * <p>
     * A structure that encapsulates the specified signaling channel's metadata and properties.
     * </p>
     * 
     * @param channelInfo
     *        A structure that encapsulates the specified signaling channel's metadata and properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSignalingChannelResult withChannelInfo(ChannelInfo channelInfo) {
        setChannelInfo(channelInfo);
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
        if (getChannelInfo() != null)
            sb.append("ChannelInfo: ").append(getChannelInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSignalingChannelResult == false)
            return false;
        DescribeSignalingChannelResult other = (DescribeSignalingChannelResult) obj;
        if (other.getChannelInfo() == null ^ this.getChannelInfo() == null)
            return false;
        if (other.getChannelInfo() != null && other.getChannelInfo().equals(this.getChannelInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelInfo() == null) ? 0 : getChannelInfo().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSignalingChannelResult clone() {
        try {
            return (DescribeSignalingChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
