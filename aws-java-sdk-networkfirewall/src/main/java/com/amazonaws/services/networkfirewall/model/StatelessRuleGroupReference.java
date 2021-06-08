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
 * Identifier for a single stateless rule group, used in a firewall policy to refer to the rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/StatelessRuleGroupReference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatelessRuleGroupReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stateless rule group.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * An integer setting that indicates the order in which to run the stateless rule groups in a single
     * <a>FirewallPolicy</a>. Network Firewall applies each stateless rule group to a packet starting with the group
     * that has the lowest priority setting. You must ensure that the priority settings are unique within each policy.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stateless rule group.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the stateless rule group.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stateless rule group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stateless rule group.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stateless rule group.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the stateless rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRuleGroupReference withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * An integer setting that indicates the order in which to run the stateless rule groups in a single
     * <a>FirewallPolicy</a>. Network Firewall applies each stateless rule group to a packet starting with the group
     * that has the lowest priority setting. You must ensure that the priority settings are unique within each policy.
     * </p>
     * 
     * @param priority
     *        An integer setting that indicates the order in which to run the stateless rule groups in a single
     *        <a>FirewallPolicy</a>. Network Firewall applies each stateless rule group to a packet starting with the
     *        group that has the lowest priority setting. You must ensure that the priority settings are unique within
     *        each policy.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * An integer setting that indicates the order in which to run the stateless rule groups in a single
     * <a>FirewallPolicy</a>. Network Firewall applies each stateless rule group to a packet starting with the group
     * that has the lowest priority setting. You must ensure that the priority settings are unique within each policy.
     * </p>
     * 
     * @return An integer setting that indicates the order in which to run the stateless rule groups in a single
     *         <a>FirewallPolicy</a>. Network Firewall applies each stateless rule group to a packet starting with the
     *         group that has the lowest priority setting. You must ensure that the priority settings are unique within
     *         each policy.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * An integer setting that indicates the order in which to run the stateless rule groups in a single
     * <a>FirewallPolicy</a>. Network Firewall applies each stateless rule group to a packet starting with the group
     * that has the lowest priority setting. You must ensure that the priority settings are unique within each policy.
     * </p>
     * 
     * @param priority
     *        An integer setting that indicates the order in which to run the stateless rule groups in a single
     *        <a>FirewallPolicy</a>. Network Firewall applies each stateless rule group to a packet starting with the
     *        group that has the lowest priority setting. You must ensure that the priority settings are unique within
     *        each policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRuleGroupReference withPriority(Integer priority) {
        setPriority(priority);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatelessRuleGroupReference == false)
            return false;
        StatelessRuleGroupReference other = (StatelessRuleGroupReference) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public StatelessRuleGroupReference clone() {
        try {
            return (StatelessRuleGroupReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.StatelessRuleGroupReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
