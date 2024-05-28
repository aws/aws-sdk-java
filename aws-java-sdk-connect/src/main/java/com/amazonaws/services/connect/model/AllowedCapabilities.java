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
 * Information about the capabilities enabled for participants of the contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AllowedCapabilities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllowedCapabilities implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the customer's video sharing capabilities.
     * </p>
     */
    private ParticipantCapabilities customer;
    /**
     * <p>
     * Information about the agent's video sharing capabilities.
     * </p>
     */
    private ParticipantCapabilities agent;

    /**
     * <p>
     * Information about the customer's video sharing capabilities.
     * </p>
     * 
     * @param customer
     *        Information about the customer's video sharing capabilities.
     */

    public void setCustomer(ParticipantCapabilities customer) {
        this.customer = customer;
    }

    /**
     * <p>
     * Information about the customer's video sharing capabilities.
     * </p>
     * 
     * @return Information about the customer's video sharing capabilities.
     */

    public ParticipantCapabilities getCustomer() {
        return this.customer;
    }

    /**
     * <p>
     * Information about the customer's video sharing capabilities.
     * </p>
     * 
     * @param customer
     *        Information about the customer's video sharing capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedCapabilities withCustomer(ParticipantCapabilities customer) {
        setCustomer(customer);
        return this;
    }

    /**
     * <p>
     * Information about the agent's video sharing capabilities.
     * </p>
     * 
     * @param agent
     *        Information about the agent's video sharing capabilities.
     */

    public void setAgent(ParticipantCapabilities agent) {
        this.agent = agent;
    }

    /**
     * <p>
     * Information about the agent's video sharing capabilities.
     * </p>
     * 
     * @return Information about the agent's video sharing capabilities.
     */

    public ParticipantCapabilities getAgent() {
        return this.agent;
    }

    /**
     * <p>
     * Information about the agent's video sharing capabilities.
     * </p>
     * 
     * @param agent
     *        Information about the agent's video sharing capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedCapabilities withAgent(ParticipantCapabilities agent) {
        setAgent(agent);
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
        if (getCustomer() != null)
            sb.append("Customer: ").append(getCustomer()).append(",");
        if (getAgent() != null)
            sb.append("Agent: ").append(getAgent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowedCapabilities == false)
            return false;
        AllowedCapabilities other = (AllowedCapabilities) obj;
        if (other.getCustomer() == null ^ this.getCustomer() == null)
            return false;
        if (other.getCustomer() != null && other.getCustomer().equals(this.getCustomer()) == false)
            return false;
        if (other.getAgent() == null ^ this.getAgent() == null)
            return false;
        if (other.getAgent() != null && other.getAgent().equals(this.getAgent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        hashCode = prime * hashCode + ((getAgent() == null) ? 0 : getAgent().hashCode());
        return hashCode;
    }

    @Override
    public AllowedCapabilities clone() {
        try {
            return (AllowedCapabilities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AllowedCapabilitiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
