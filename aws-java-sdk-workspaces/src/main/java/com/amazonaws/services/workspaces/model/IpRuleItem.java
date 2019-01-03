/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a rule for an IP access control group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/IpRuleItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpRuleItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address range, in CIDR notation.
     * </p>
     */
    private String ipRule;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String ruleDesc;

    /**
     * <p>
     * The IP address range, in CIDR notation.
     * </p>
     * 
     * @param ipRule
     *        The IP address range, in CIDR notation.
     */

    public void setIpRule(String ipRule) {
        this.ipRule = ipRule;
    }

    /**
     * <p>
     * The IP address range, in CIDR notation.
     * </p>
     * 
     * @return The IP address range, in CIDR notation.
     */

    public String getIpRule() {
        return this.ipRule;
    }

    /**
     * <p>
     * The IP address range, in CIDR notation.
     * </p>
     * 
     * @param ipRule
     *        The IP address range, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRuleItem withIpRule(String ipRule) {
        setIpRule(ipRule);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param ruleDesc
     *        The description.
     */

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getRuleDesc() {
        return this.ruleDesc;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param ruleDesc
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRuleItem withRuleDesc(String ruleDesc) {
        setRuleDesc(ruleDesc);
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
        if (getIpRule() != null)
            sb.append("IpRule: ").append(getIpRule()).append(",");
        if (getRuleDesc() != null)
            sb.append("RuleDesc: ").append(getRuleDesc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpRuleItem == false)
            return false;
        IpRuleItem other = (IpRuleItem) obj;
        if (other.getIpRule() == null ^ this.getIpRule() == null)
            return false;
        if (other.getIpRule() != null && other.getIpRule().equals(this.getIpRule()) == false)
            return false;
        if (other.getRuleDesc() == null ^ this.getRuleDesc() == null)
            return false;
        if (other.getRuleDesc() != null && other.getRuleDesc().equals(this.getRuleDesc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpRule() == null) ? 0 : getIpRule().hashCode());
        hashCode = prime * hashCode + ((getRuleDesc() == null) ? 0 : getRuleDesc().hashCode());
        return hashCode;
    }

    @Override
    public IpRuleItem clone() {
        try {
            return (IpRuleItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.IpRuleItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
