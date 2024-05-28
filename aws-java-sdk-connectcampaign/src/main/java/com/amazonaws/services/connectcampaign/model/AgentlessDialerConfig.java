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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Agentless Dialer config
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/AgentlessDialerConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentlessDialerConfig implements Serializable, Cloneable, StructuredPojo {

    private Double dialingCapacity;

    /**
     * @param dialingCapacity
     */

    public void setDialingCapacity(Double dialingCapacity) {
        this.dialingCapacity = dialingCapacity;
    }

    /**
     * @return
     */

    public Double getDialingCapacity() {
        return this.dialingCapacity;
    }

    /**
     * @param dialingCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentlessDialerConfig withDialingCapacity(Double dialingCapacity) {
        setDialingCapacity(dialingCapacity);
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
        if (getDialingCapacity() != null)
            sb.append("DialingCapacity: ").append(getDialingCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentlessDialerConfig == false)
            return false;
        AgentlessDialerConfig other = (AgentlessDialerConfig) obj;
        if (other.getDialingCapacity() == null ^ this.getDialingCapacity() == null)
            return false;
        if (other.getDialingCapacity() != null && other.getDialingCapacity().equals(this.getDialingCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDialingCapacity() == null) ? 0 : getDialingCapacity().hashCode());
        return hashCode;
    }

    @Override
    public AgentlessDialerConfig clone() {
        try {
            return (AgentlessDialerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcampaign.model.transform.AgentlessDialerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
