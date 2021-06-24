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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about which channels are supported, and how many contacts an agent can have on a channel
 * simultaneously.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MediaConcurrency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaConcurrency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     */
    private String channel;
    /**
     * <p>
     * The number of contacts an agent can have on a channel simultaneously.
     * </p>
     * <p>
     * Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of 1.
     * </p>
     * <p>
     * Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of 10.
     * </p>
     * <p>
     * Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of 10.
     * </p>
     */
    private Integer concurrency;

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param channel
     *        The channels that agents can handle in the Contact Control Panel (CCP).
     * @see Channel
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * 
     * @return The channels that agents can handle in the Contact Control Panel (CCP).
     * @see Channel
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param channel
     *        The channels that agents can handle in the Contact Control Panel (CCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public MediaConcurrency withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param channel
     *        The channels that agents can handle in the Contact Control Panel (CCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public MediaConcurrency withChannel(Channel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * The number of contacts an agent can have on a channel simultaneously.
     * </p>
     * <p>
     * Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of 1.
     * </p>
     * <p>
     * Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of 10.
     * </p>
     * <p>
     * Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of 10.
     * </p>
     * 
     * @param concurrency
     *        The number of contacts an agent can have on a channel simultaneously.</p>
     *        <p>
     *        Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of 1.
     *        </p>
     *        <p>
     *        Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of 10.
     *        </p>
     *        <p>
     *        Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of 10.
     */

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    /**
     * <p>
     * The number of contacts an agent can have on a channel simultaneously.
     * </p>
     * <p>
     * Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of 1.
     * </p>
     * <p>
     * Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of 10.
     * </p>
     * <p>
     * Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of 10.
     * </p>
     * 
     * @return The number of contacts an agent can have on a channel simultaneously.</p>
     *         <p>
     *         Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of 1.
     *         </p>
     *         <p>
     *         Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of 10.
     *         </p>
     *         <p>
     *         Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of 10.
     */

    public Integer getConcurrency() {
        return this.concurrency;
    }

    /**
     * <p>
     * The number of contacts an agent can have on a channel simultaneously.
     * </p>
     * <p>
     * Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of 1.
     * </p>
     * <p>
     * Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of 10.
     * </p>
     * <p>
     * Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of 10.
     * </p>
     * 
     * @param concurrency
     *        The number of contacts an agent can have on a channel simultaneously.</p>
     *        <p>
     *        Valid Range for <code>VOICE</code>: Minimum value of 1. Maximum value of 1.
     *        </p>
     *        <p>
     *        Valid Range for <code>CHAT</code>: Minimum value of 1. Maximum value of 10.
     *        </p>
     *        <p>
     *        Valid Range for <code>TASK</code>: Minimum value of 1. Maximum value of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaConcurrency withConcurrency(Integer concurrency) {
        setConcurrency(concurrency);
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getConcurrency() != null)
            sb.append("Concurrency: ").append(getConcurrency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaConcurrency == false)
            return false;
        MediaConcurrency other = (MediaConcurrency) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getConcurrency() == null ^ this.getConcurrency() == null)
            return false;
        if (other.getConcurrency() != null && other.getConcurrency().equals(this.getConcurrency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getConcurrency() == null) ? 0 : getConcurrency().hashCode());
        return hashCode;
    }

    @Override
    public MediaConcurrency clone() {
        try {
            return (MediaConcurrency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.MediaConcurrencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
