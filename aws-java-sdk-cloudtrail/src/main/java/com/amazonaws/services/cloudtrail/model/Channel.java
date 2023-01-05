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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a returned CloudTrail channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/Channel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Channel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The name of the CloudTrail channel. For service-linked channels, the name is
     * <code>aws-service-channel/service-name/custom-suffix</code> where <code>service-name</code> represents the name
     * of the Amazon Web Services service that created the channel and <code>custom-suffix</code> represents the suffix
     * created by the Amazon Web Services service.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a channel.
     * </p>
     * 
     * @param channelArn
     *        The Amazon Resource Name (ARN) of a channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a channel.
     * </p>
     * 
     * @param channelArn
     *        The Amazon Resource Name (ARN) of a channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The name of the CloudTrail channel. For service-linked channels, the name is
     * <code>aws-service-channel/service-name/custom-suffix</code> where <code>service-name</code> represents the name
     * of the Amazon Web Services service that created the channel and <code>custom-suffix</code> represents the suffix
     * created by the Amazon Web Services service.
     * </p>
     * 
     * @param name
     *        The name of the CloudTrail channel. For service-linked channels, the name is
     *        <code>aws-service-channel/service-name/custom-suffix</code> where <code>service-name</code> represents the
     *        name of the Amazon Web Services service that created the channel and <code>custom-suffix</code> represents
     *        the suffix created by the Amazon Web Services service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the CloudTrail channel. For service-linked channels, the name is
     * <code>aws-service-channel/service-name/custom-suffix</code> where <code>service-name</code> represents the name
     * of the Amazon Web Services service that created the channel and <code>custom-suffix</code> represents the suffix
     * created by the Amazon Web Services service.
     * </p>
     * 
     * @return The name of the CloudTrail channel. For service-linked channels, the name is
     *         <code>aws-service-channel/service-name/custom-suffix</code> where <code>service-name</code> represents
     *         the name of the Amazon Web Services service that created the channel and <code>custom-suffix</code>
     *         represents the suffix created by the Amazon Web Services service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the CloudTrail channel. For service-linked channels, the name is
     * <code>aws-service-channel/service-name/custom-suffix</code> where <code>service-name</code> represents the name
     * of the Amazon Web Services service that created the channel and <code>custom-suffix</code> represents the suffix
     * created by the Amazon Web Services service.
     * </p>
     * 
     * @param name
     *        The name of the CloudTrail channel. For service-linked channels, the name is
     *        <code>aws-service-channel/service-name/custom-suffix</code> where <code>service-name</code> represents the
     *        name of the Amazon Web Services service that created the channel and <code>custom-suffix</code> represents
     *        the suffix created by the Amazon Web Services service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withName(String name) {
        setName(name);
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
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Channel == false)
            return false;
        Channel other = (Channel) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Channel clone() {
        try {
            return (Channel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.ChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
