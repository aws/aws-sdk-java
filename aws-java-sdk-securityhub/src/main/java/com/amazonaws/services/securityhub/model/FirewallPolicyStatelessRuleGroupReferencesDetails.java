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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A stateless rule group that is used by the firewall policy.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/FirewallPolicyStatelessRuleGroupReferencesDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallPolicyStatelessRuleGroupReferencesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The order in which to run the stateless rule group.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The ARN of the stateless rule group.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The order in which to run the stateless rule group.
     * </p>
     * 
     * @param priority
     *        The order in which to run the stateless rule group.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The order in which to run the stateless rule group.
     * </p>
     * 
     * @return The order in which to run the stateless rule group.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The order in which to run the stateless rule group.
     * </p>
     * 
     * @param priority
     *        The order in which to run the stateless rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyStatelessRuleGroupReferencesDetails withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The ARN of the stateless rule group.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the stateless rule group.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the stateless rule group.
     * </p>
     * 
     * @return The ARN of the stateless rule group.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the stateless rule group.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the stateless rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyStatelessRuleGroupReferencesDetails withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallPolicyStatelessRuleGroupReferencesDetails == false)
            return false;
        FirewallPolicyStatelessRuleGroupReferencesDetails other = (FirewallPolicyStatelessRuleGroupReferencesDetails) obj;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public FirewallPolicyStatelessRuleGroupReferencesDetails clone() {
        try {
            return (FirewallPolicyStatelessRuleGroupReferencesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.FirewallPolicyStatelessRuleGroupReferencesDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
