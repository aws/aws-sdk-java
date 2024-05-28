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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the routing configuration of a state machine alias. In a routing configuration, you define an
 * array of objects that specify up to two state machine versions. You also specify the percentage of traffic to be
 * routed to each version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/RoutingConfigurationListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoutingConfigurationListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies one or two state machine versions defined in the routing
     * configuration.
     * </p>
     * <p>
     * If you specify the ARN of a second version, it must belong to the same state machine as the first version.
     * </p>
     */
    private String stateMachineVersionArn;
    /**
     * <p>
     * The percentage of traffic you want to route to a state machine version. The sum of the weights in the routing
     * configuration must be equal to 100.
     * </p>
     */
    private Integer weight;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies one or two state machine versions defined in the routing
     * configuration.
     * </p>
     * <p>
     * If you specify the ARN of a second version, it must belong to the same state machine as the first version.
     * </p>
     * 
     * @param stateMachineVersionArn
     *        The Amazon Resource Name (ARN) that identifies one or two state machine versions defined in the routing
     *        configuration.</p>
     *        <p>
     *        If you specify the ARN of a second version, it must belong to the same state machine as the first version.
     */

    public void setStateMachineVersionArn(String stateMachineVersionArn) {
        this.stateMachineVersionArn = stateMachineVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies one or two state machine versions defined in the routing
     * configuration.
     * </p>
     * <p>
     * If you specify the ARN of a second version, it must belong to the same state machine as the first version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies one or two state machine versions defined in the routing
     *         configuration.</p>
     *         <p>
     *         If you specify the ARN of a second version, it must belong to the same state machine as the first
     *         version.
     */

    public String getStateMachineVersionArn() {
        return this.stateMachineVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies one or two state machine versions defined in the routing
     * configuration.
     * </p>
     * <p>
     * If you specify the ARN of a second version, it must belong to the same state machine as the first version.
     * </p>
     * 
     * @param stateMachineVersionArn
     *        The Amazon Resource Name (ARN) that identifies one or two state machine versions defined in the routing
     *        configuration.</p>
     *        <p>
     *        If you specify the ARN of a second version, it must belong to the same state machine as the first version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingConfigurationListItem withStateMachineVersionArn(String stateMachineVersionArn) {
        setStateMachineVersionArn(stateMachineVersionArn);
        return this;
    }

    /**
     * <p>
     * The percentage of traffic you want to route to a state machine version. The sum of the weights in the routing
     * configuration must be equal to 100.
     * </p>
     * 
     * @param weight
     *        The percentage of traffic you want to route to a state machine version. The sum of the weights in the
     *        routing configuration must be equal to 100.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The percentage of traffic you want to route to a state machine version. The sum of the weights in the routing
     * configuration must be equal to 100.
     * </p>
     * 
     * @return The percentage of traffic you want to route to a state machine version. The sum of the weights in the
     *         routing configuration must be equal to 100.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The percentage of traffic you want to route to a state machine version. The sum of the weights in the routing
     * configuration must be equal to 100.
     * </p>
     * 
     * @param weight
     *        The percentage of traffic you want to route to a state machine version. The sum of the weights in the
     *        routing configuration must be equal to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingConfigurationListItem withWeight(Integer weight) {
        setWeight(weight);
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
        if (getStateMachineVersionArn() != null)
            sb.append("StateMachineVersionArn: ").append(getStateMachineVersionArn()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoutingConfigurationListItem == false)
            return false;
        RoutingConfigurationListItem other = (RoutingConfigurationListItem) obj;
        if (other.getStateMachineVersionArn() == null ^ this.getStateMachineVersionArn() == null)
            return false;
        if (other.getStateMachineVersionArn() != null && other.getStateMachineVersionArn().equals(this.getStateMachineVersionArn()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineVersionArn() == null) ? 0 : getStateMachineVersionArn().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public RoutingConfigurationListItem clone() {
        try {
            return (RoutingConfigurationListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.RoutingConfigurationListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
