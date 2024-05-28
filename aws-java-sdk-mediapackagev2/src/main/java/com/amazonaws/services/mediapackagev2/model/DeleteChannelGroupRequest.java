/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannelGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteChannelGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     */
    private String channelGroupName;

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     */

    public void setChannelGroupName(String channelGroupName) {
        this.channelGroupName = channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @return The name that describes the channel group. The name is the primary identifier for the channel group, and
     *         must be unique for your account in the AWS Region.
     */

    public String getChannelGroupName() {
        return this.channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteChannelGroupRequest withChannelGroupName(String channelGroupName) {
        setChannelGroupName(channelGroupName);
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
        if (getChannelGroupName() != null)
            sb.append("ChannelGroupName: ").append(getChannelGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteChannelGroupRequest == false)
            return false;
        DeleteChannelGroupRequest other = (DeleteChannelGroupRequest) obj;
        if (other.getChannelGroupName() == null ^ this.getChannelGroupName() == null)
            return false;
        if (other.getChannelGroupName() != null && other.getChannelGroupName().equals(this.getChannelGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelGroupName() == null) ? 0 : getChannelGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteChannelGroupRequest clone() {
        return (DeleteChannelGroupRequest) super.clone();
    }

}
