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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying a channel as a destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ChannelDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the channel to use for broadcasting. The channel and stage resources must be in the same AWS account and
     * region. The channel must be offline (not broadcasting).
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * ARN of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in the
     * same AWS account and region.
     * </p>
     */
    private String encoderConfigurationArn;

    /**
     * <p>
     * ARN of the channel to use for broadcasting. The channel and stage resources must be in the same AWS account and
     * region. The channel must be offline (not broadcasting).
     * </p>
     * 
     * @param channelArn
     *        ARN of the channel to use for broadcasting. The channel and stage resources must be in the same AWS
     *        account and region. The channel must be offline (not broadcasting).
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * ARN of the channel to use for broadcasting. The channel and stage resources must be in the same AWS account and
     * region. The channel must be offline (not broadcasting).
     * </p>
     * 
     * @return ARN of the channel to use for broadcasting. The channel and stage resources must be in the same AWS
     *         account and region. The channel must be offline (not broadcasting).
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * ARN of the channel to use for broadcasting. The channel and stage resources must be in the same AWS account and
     * region. The channel must be offline (not broadcasting).
     * </p>
     * 
     * @param channelArn
     *        ARN of the channel to use for broadcasting. The channel and stage resources must be in the same AWS
     *        account and region. The channel must be offline (not broadcasting).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelDestinationConfiguration withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * ARN of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in the
     * same AWS account and region.
     * </p>
     * 
     * @param encoderConfigurationArn
     *        ARN of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in
     *        the same AWS account and region.
     */

    public void setEncoderConfigurationArn(String encoderConfigurationArn) {
        this.encoderConfigurationArn = encoderConfigurationArn;
    }

    /**
     * <p>
     * ARN of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in the
     * same AWS account and region.
     * </p>
     * 
     * @return ARN of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in
     *         the same AWS account and region.
     */

    public String getEncoderConfigurationArn() {
        return this.encoderConfigurationArn;
    }

    /**
     * <p>
     * ARN of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in the
     * same AWS account and region.
     * </p>
     * 
     * @param encoderConfigurationArn
     *        ARN of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in
     *        the same AWS account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelDestinationConfiguration withEncoderConfigurationArn(String encoderConfigurationArn) {
        setEncoderConfigurationArn(encoderConfigurationArn);
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
        if (getEncoderConfigurationArn() != null)
            sb.append("EncoderConfigurationArn: ").append(getEncoderConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelDestinationConfiguration == false)
            return false;
        ChannelDestinationConfiguration other = (ChannelDestinationConfiguration) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getEncoderConfigurationArn() == null ^ this.getEncoderConfigurationArn() == null)
            return false;
        if (other.getEncoderConfigurationArn() != null && other.getEncoderConfigurationArn().equals(this.getEncoderConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getEncoderConfigurationArn() == null) ? 0 : getEncoderConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public ChannelDestinationConfiguration clone() {
        try {
            return (ChannelDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.ChannelDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
