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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A custom action to use in stateless rule actions settings. This is used in <a>CustomAction</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ActionDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet.
     * This setting defines a CloudWatch dimension value to be published.
     * </p>
     * <p>
     * You can pair this custom action with any of the standard stateless rule actions. For example, you could pair this
     * in a rule action with the standard action that forwards the packet for stateful inspection. Then, when a packet
     * matches the rule, Network Firewall publishes metrics for the packet and forwards it.
     * </p>
     */
    private PublishMetricAction publishMetricAction;

    /**
     * <p>
     * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet.
     * This setting defines a CloudWatch dimension value to be published.
     * </p>
     * <p>
     * You can pair this custom action with any of the standard stateless rule actions. For example, you could pair this
     * in a rule action with the standard action that forwards the packet for stateful inspection. Then, when a packet
     * matches the rule, Network Firewall publishes metrics for the packet and forwards it.
     * </p>
     * 
     * @param publishMetricAction
     *        Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching
     *        packet. This setting defines a CloudWatch dimension value to be published.</p>
     *        <p>
     *        You can pair this custom action with any of the standard stateless rule actions. For example, you could
     *        pair this in a rule action with the standard action that forwards the packet for stateful inspection.
     *        Then, when a packet matches the rule, Network Firewall publishes metrics for the packet and forwards it.
     */

    public void setPublishMetricAction(PublishMetricAction publishMetricAction) {
        this.publishMetricAction = publishMetricAction;
    }

    /**
     * <p>
     * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet.
     * This setting defines a CloudWatch dimension value to be published.
     * </p>
     * <p>
     * You can pair this custom action with any of the standard stateless rule actions. For example, you could pair this
     * in a rule action with the standard action that forwards the packet for stateful inspection. Then, when a packet
     * matches the rule, Network Firewall publishes metrics for the packet and forwards it.
     * </p>
     * 
     * @return Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching
     *         packet. This setting defines a CloudWatch dimension value to be published.</p>
     *         <p>
     *         You can pair this custom action with any of the standard stateless rule actions. For example, you could
     *         pair this in a rule action with the standard action that forwards the packet for stateful inspection.
     *         Then, when a packet matches the rule, Network Firewall publishes metrics for the packet and forwards it.
     */

    public PublishMetricAction getPublishMetricAction() {
        return this.publishMetricAction;
    }

    /**
     * <p>
     * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet.
     * This setting defines a CloudWatch dimension value to be published.
     * </p>
     * <p>
     * You can pair this custom action with any of the standard stateless rule actions. For example, you could pair this
     * in a rule action with the standard action that forwards the packet for stateful inspection. Then, when a packet
     * matches the rule, Network Firewall publishes metrics for the packet and forwards it.
     * </p>
     * 
     * @param publishMetricAction
     *        Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching
     *        packet. This setting defines a CloudWatch dimension value to be published.</p>
     *        <p>
     *        You can pair this custom action with any of the standard stateless rule actions. For example, you could
     *        pair this in a rule action with the standard action that forwards the packet for stateful inspection.
     *        Then, when a packet matches the rule, Network Firewall publishes metrics for the packet and forwards it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDefinition withPublishMetricAction(PublishMetricAction publishMetricAction) {
        setPublishMetricAction(publishMetricAction);
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
        if (getPublishMetricAction() != null)
            sb.append("PublishMetricAction: ").append(getPublishMetricAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionDefinition == false)
            return false;
        ActionDefinition other = (ActionDefinition) obj;
        if (other.getPublishMetricAction() == null ^ this.getPublishMetricAction() == null)
            return false;
        if (other.getPublishMetricAction() != null && other.getPublishMetricAction().equals(this.getPublishMetricAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublishMetricAction() == null) ? 0 : getPublishMetricAction().hashCode());
        return hashCode;
    }

    @Override
    public ActionDefinition clone() {
        try {
            return (ActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.ActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
