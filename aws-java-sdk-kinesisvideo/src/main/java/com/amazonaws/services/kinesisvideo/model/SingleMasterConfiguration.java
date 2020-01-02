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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/SingleMasterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SingleMasterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The period of time a signaling channel retains underlivered messages before they are discarded.
     * </p>
     */
    private Integer messageTtlSeconds;

    /**
     * <p>
     * The period of time a signaling channel retains underlivered messages before they are discarded.
     * </p>
     * 
     * @param messageTtlSeconds
     *        The period of time a signaling channel retains underlivered messages before they are discarded.
     */

    public void setMessageTtlSeconds(Integer messageTtlSeconds) {
        this.messageTtlSeconds = messageTtlSeconds;
    }

    /**
     * <p>
     * The period of time a signaling channel retains underlivered messages before they are discarded.
     * </p>
     * 
     * @return The period of time a signaling channel retains underlivered messages before they are discarded.
     */

    public Integer getMessageTtlSeconds() {
        return this.messageTtlSeconds;
    }

    /**
     * <p>
     * The period of time a signaling channel retains underlivered messages before they are discarded.
     * </p>
     * 
     * @param messageTtlSeconds
     *        The period of time a signaling channel retains underlivered messages before they are discarded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SingleMasterConfiguration withMessageTtlSeconds(Integer messageTtlSeconds) {
        setMessageTtlSeconds(messageTtlSeconds);
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
        if (getMessageTtlSeconds() != null)
            sb.append("MessageTtlSeconds: ").append(getMessageTtlSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SingleMasterConfiguration == false)
            return false;
        SingleMasterConfiguration other = (SingleMasterConfiguration) obj;
        if (other.getMessageTtlSeconds() == null ^ this.getMessageTtlSeconds() == null)
            return false;
        if (other.getMessageTtlSeconds() != null && other.getMessageTtlSeconds().equals(this.getMessageTtlSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageTtlSeconds() == null) ? 0 : getMessageTtlSeconds().hashCode());
        return hashCode;
    }

    @Override
    public SingleMasterConfiguration clone() {
        try {
            return (SingleMasterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.SingleMasterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
