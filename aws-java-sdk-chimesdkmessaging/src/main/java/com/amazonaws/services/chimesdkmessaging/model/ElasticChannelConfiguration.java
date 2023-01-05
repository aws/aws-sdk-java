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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The attributes required to configure and create an elastic channel. An elastic channel can support a maximum of
 * 1-million members.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ElasticChannelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticChannelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of SubChannels that you want to allow in the elastic channel.
     * </p>
     */
    private Integer maximumSubChannels;
    /**
     * <p>
     * The maximum number of members allowed in a SubChannel.
     * </p>
     */
    private Integer targetMembershipsPerSubChannel;
    /**
     * <p>
     * The minimum allowed percentage of TargetMembershipsPerSubChannel users. Ceil of the calculated value is used in
     * balancing members among SubChannels of the elastic channel.
     * </p>
     */
    private Integer minimumMembershipPercentage;

    /**
     * <p>
     * The maximum number of SubChannels that you want to allow in the elastic channel.
     * </p>
     * 
     * @param maximumSubChannels
     *        The maximum number of SubChannels that you want to allow in the elastic channel.
     */

    public void setMaximumSubChannels(Integer maximumSubChannels) {
        this.maximumSubChannels = maximumSubChannels;
    }

    /**
     * <p>
     * The maximum number of SubChannels that you want to allow in the elastic channel.
     * </p>
     * 
     * @return The maximum number of SubChannels that you want to allow in the elastic channel.
     */

    public Integer getMaximumSubChannels() {
        return this.maximumSubChannels;
    }

    /**
     * <p>
     * The maximum number of SubChannels that you want to allow in the elastic channel.
     * </p>
     * 
     * @param maximumSubChannels
     *        The maximum number of SubChannels that you want to allow in the elastic channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticChannelConfiguration withMaximumSubChannels(Integer maximumSubChannels) {
        setMaximumSubChannels(maximumSubChannels);
        return this;
    }

    /**
     * <p>
     * The maximum number of members allowed in a SubChannel.
     * </p>
     * 
     * @param targetMembershipsPerSubChannel
     *        The maximum number of members allowed in a SubChannel.
     */

    public void setTargetMembershipsPerSubChannel(Integer targetMembershipsPerSubChannel) {
        this.targetMembershipsPerSubChannel = targetMembershipsPerSubChannel;
    }

    /**
     * <p>
     * The maximum number of members allowed in a SubChannel.
     * </p>
     * 
     * @return The maximum number of members allowed in a SubChannel.
     */

    public Integer getTargetMembershipsPerSubChannel() {
        return this.targetMembershipsPerSubChannel;
    }

    /**
     * <p>
     * The maximum number of members allowed in a SubChannel.
     * </p>
     * 
     * @param targetMembershipsPerSubChannel
     *        The maximum number of members allowed in a SubChannel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticChannelConfiguration withTargetMembershipsPerSubChannel(Integer targetMembershipsPerSubChannel) {
        setTargetMembershipsPerSubChannel(targetMembershipsPerSubChannel);
        return this;
    }

    /**
     * <p>
     * The minimum allowed percentage of TargetMembershipsPerSubChannel users. Ceil of the calculated value is used in
     * balancing members among SubChannels of the elastic channel.
     * </p>
     * 
     * @param minimumMembershipPercentage
     *        The minimum allowed percentage of TargetMembershipsPerSubChannel users. Ceil of the calculated value is
     *        used in balancing members among SubChannels of the elastic channel.
     */

    public void setMinimumMembershipPercentage(Integer minimumMembershipPercentage) {
        this.minimumMembershipPercentage = minimumMembershipPercentage;
    }

    /**
     * <p>
     * The minimum allowed percentage of TargetMembershipsPerSubChannel users. Ceil of the calculated value is used in
     * balancing members among SubChannels of the elastic channel.
     * </p>
     * 
     * @return The minimum allowed percentage of TargetMembershipsPerSubChannel users. Ceil of the calculated value is
     *         used in balancing members among SubChannels of the elastic channel.
     */

    public Integer getMinimumMembershipPercentage() {
        return this.minimumMembershipPercentage;
    }

    /**
     * <p>
     * The minimum allowed percentage of TargetMembershipsPerSubChannel users. Ceil of the calculated value is used in
     * balancing members among SubChannels of the elastic channel.
     * </p>
     * 
     * @param minimumMembershipPercentage
     *        The minimum allowed percentage of TargetMembershipsPerSubChannel users. Ceil of the calculated value is
     *        used in balancing members among SubChannels of the elastic channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticChannelConfiguration withMinimumMembershipPercentage(Integer minimumMembershipPercentage) {
        setMinimumMembershipPercentage(minimumMembershipPercentage);
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
        if (getMaximumSubChannels() != null)
            sb.append("MaximumSubChannels: ").append(getMaximumSubChannels()).append(",");
        if (getTargetMembershipsPerSubChannel() != null)
            sb.append("TargetMembershipsPerSubChannel: ").append(getTargetMembershipsPerSubChannel()).append(",");
        if (getMinimumMembershipPercentage() != null)
            sb.append("MinimumMembershipPercentage: ").append(getMinimumMembershipPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticChannelConfiguration == false)
            return false;
        ElasticChannelConfiguration other = (ElasticChannelConfiguration) obj;
        if (other.getMaximumSubChannels() == null ^ this.getMaximumSubChannels() == null)
            return false;
        if (other.getMaximumSubChannels() != null && other.getMaximumSubChannels().equals(this.getMaximumSubChannels()) == false)
            return false;
        if (other.getTargetMembershipsPerSubChannel() == null ^ this.getTargetMembershipsPerSubChannel() == null)
            return false;
        if (other.getTargetMembershipsPerSubChannel() != null
                && other.getTargetMembershipsPerSubChannel().equals(this.getTargetMembershipsPerSubChannel()) == false)
            return false;
        if (other.getMinimumMembershipPercentage() == null ^ this.getMinimumMembershipPercentage() == null)
            return false;
        if (other.getMinimumMembershipPercentage() != null && other.getMinimumMembershipPercentage().equals(this.getMinimumMembershipPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumSubChannels() == null) ? 0 : getMaximumSubChannels().hashCode());
        hashCode = prime * hashCode + ((getTargetMembershipsPerSubChannel() == null) ? 0 : getTargetMembershipsPerSubChannel().hashCode());
        hashCode = prime * hashCode + ((getMinimumMembershipPercentage() == null) ? 0 : getMinimumMembershipPercentage().hashCode());
        return hashCode;
    }

    @Override
    public ElasticChannelConfiguration clone() {
        try {
            return (ElasticChannelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.ElasticChannelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
