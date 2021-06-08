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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutChannelPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutChannelPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * Adds an IAM role that determines the permissions of your channel.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @return The identifier for the channel you are working on.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelPolicyRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * Adds an IAM role that determines the permissions of your channel.
     * </p>
     * 
     * @param policy
     *        Adds an IAM role that determines the permissions of your channel.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Adds an IAM role that determines the permissions of your channel.
     * </p>
     * 
     * @return Adds an IAM role that determines the permissions of your channel.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * Adds an IAM role that determines the permissions of your channel.
     * </p>
     * 
     * @param policy
     *        Adds an IAM role that determines the permissions of your channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelPolicyRequest withPolicy(String policy) {
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
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

        if (obj instanceof PutChannelPolicyRequest == false)
            return false;
        PutChannelPolicyRequest other = (PutChannelPolicyRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
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

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutChannelPolicyRequest clone() {
        return (PutChannelPolicyRequest) super.clone();
    }

}
