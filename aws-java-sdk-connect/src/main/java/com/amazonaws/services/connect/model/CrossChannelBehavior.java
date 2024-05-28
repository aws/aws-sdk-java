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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the cross-channel routing behavior that allows an agent working on a contact in one channel to be offered a
 * contact from a different channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CrossChannelBehavior" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrossChannelBehavior implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling their current channel.
     * </p>
     */
    private String behaviorType;

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling their current channel.
     * </p>
     * 
     * @param behaviorType
     *        Specifies the other channels that can be routed to an agent handling their current channel.
     * @see BehaviorType
     */

    public void setBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
    }

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling their current channel.
     * </p>
     * 
     * @return Specifies the other channels that can be routed to an agent handling their current channel.
     * @see BehaviorType
     */

    public String getBehaviorType() {
        return this.behaviorType;
    }

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling their current channel.
     * </p>
     * 
     * @param behaviorType
     *        Specifies the other channels that can be routed to an agent handling their current channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorType
     */

    public CrossChannelBehavior withBehaviorType(String behaviorType) {
        setBehaviorType(behaviorType);
        return this;
    }

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling their current channel.
     * </p>
     * 
     * @param behaviorType
     *        Specifies the other channels that can be routed to an agent handling their current channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorType
     */

    public CrossChannelBehavior withBehaviorType(BehaviorType behaviorType) {
        this.behaviorType = behaviorType.toString();
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
        if (getBehaviorType() != null)
            sb.append("BehaviorType: ").append(getBehaviorType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossChannelBehavior == false)
            return false;
        CrossChannelBehavior other = (CrossChannelBehavior) obj;
        if (other.getBehaviorType() == null ^ this.getBehaviorType() == null)
            return false;
        if (other.getBehaviorType() != null && other.getBehaviorType().equals(this.getBehaviorType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBehaviorType() == null) ? 0 : getBehaviorType().hashCode());
        return hashCode;
    }

    @Override
    public CrossChannelBehavior clone() {
        try {
            return (CrossChannelBehavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.CrossChannelBehaviorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
