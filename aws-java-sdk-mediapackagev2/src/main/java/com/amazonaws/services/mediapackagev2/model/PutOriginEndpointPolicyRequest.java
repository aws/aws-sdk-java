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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/PutOriginEndpointPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutOriginEndpointPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     */
    private String channelGroupName;
    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     */
    private String originEndpointName;
    /**
     * <p>
     * The policy to attach to the specified origin endpoint.
     * </p>
     */
    private String policy;

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

    public PutOriginEndpointPolicyRequest withChannelGroupName(String channelGroupName) {
        setChannelGroupName(channelGroupName);
        return this;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @param channelName
     *        The name that describes the channel. The name is the primary identifier for the channel, and must be
     *        unique for your account in the AWS Region and channel group.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @return The name that describes the channel. The name is the primary identifier for the channel, and must be
     *         unique for your account in the AWS Region and channel group.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @param channelName
     *        The name that describes the channel. The name is the primary identifier for the channel, and must be
     *        unique for your account in the AWS Region and channel group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOriginEndpointPolicyRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     * 
     * @param originEndpointName
     *        The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *        and and must be unique for your account in the AWS Region and channel.
     */

    public void setOriginEndpointName(String originEndpointName) {
        this.originEndpointName = originEndpointName;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     * 
     * @return The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *         and and must be unique for your account in the AWS Region and channel.
     */

    public String getOriginEndpointName() {
        return this.originEndpointName;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     * 
     * @param originEndpointName
     *        The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *        and and must be unique for your account in the AWS Region and channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOriginEndpointPolicyRequest withOriginEndpointName(String originEndpointName) {
        setOriginEndpointName(originEndpointName);
        return this;
    }

    /**
     * <p>
     * The policy to attach to the specified origin endpoint.
     * </p>
     * 
     * @param policy
     *        The policy to attach to the specified origin endpoint.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy to attach to the specified origin endpoint.
     * </p>
     * 
     * @return The policy to attach to the specified origin endpoint.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy to attach to the specified origin endpoint.
     * </p>
     * 
     * @param policy
     *        The policy to attach to the specified origin endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOriginEndpointPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
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
            sb.append("ChannelGroupName: ").append(getChannelGroupName()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getOriginEndpointName() != null)
            sb.append("OriginEndpointName: ").append(getOriginEndpointName()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutOriginEndpointPolicyRequest == false)
            return false;
        PutOriginEndpointPolicyRequest other = (PutOriginEndpointPolicyRequest) obj;
        if (other.getChannelGroupName() == null ^ this.getChannelGroupName() == null)
            return false;
        if (other.getChannelGroupName() != null && other.getChannelGroupName().equals(this.getChannelGroupName()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getOriginEndpointName() == null ^ this.getOriginEndpointName() == null)
            return false;
        if (other.getOriginEndpointName() != null && other.getOriginEndpointName().equals(this.getOriginEndpointName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelGroupName() == null) ? 0 : getChannelGroupName().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getOriginEndpointName() == null) ? 0 : getOriginEndpointName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutOriginEndpointPolicyRequest clone() {
        return (PutOriginEndpointPolicyRequest) super.clone();
    }

}
