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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the runtime system, policy definition, and whether debug logging enabled. You can specify the following
 * CustomPolicyDetails parameter values only for Config Custom Policy rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/CustomPolicyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomPolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you to
     * write policies that are enforced by Config Custom Policy rules. For more information about Guard, see the <a
     * href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     * </p>
     */
    private String policyRuntime;
    /**
     * <p>
     * The policy definition containing the logic for your Config Custom Policy rule.
     * </p>
     */
    private String policyText;
    /**
     * <p>
     * The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is
     * <code>false</code>.
     * </p>
     */
    private Boolean enableDebugLogDelivery;

    /**
     * <p>
     * The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you to
     * write policies that are enforced by Config Custom Policy rules. For more information about Guard, see the <a
     * href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     * </p>
     * 
     * @param policyRuntime
     *        The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you
     *        to write policies that are enforced by Config Custom Policy rules. For more information about Guard, see
     *        the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     */

    public void setPolicyRuntime(String policyRuntime) {
        this.policyRuntime = policyRuntime;
    }

    /**
     * <p>
     * The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you to
     * write policies that are enforced by Config Custom Policy rules. For more information about Guard, see the <a
     * href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     * </p>
     * 
     * @return The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you
     *         to write policies that are enforced by Config Custom Policy rules. For more information about Guard, see
     *         the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     */

    public String getPolicyRuntime() {
        return this.policyRuntime;
    }

    /**
     * <p>
     * The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you to
     * write policies that are enforced by Config Custom Policy rules. For more information about Guard, see the <a
     * href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     * </p>
     * 
     * @param policyRuntime
     *        The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you
     *        to write policies that are enforced by Config Custom Policy rules. For more information about Guard, see
     *        the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPolicyDetails withPolicyRuntime(String policyRuntime) {
        setPolicyRuntime(policyRuntime);
        return this;
    }

    /**
     * <p>
     * The policy definition containing the logic for your Config Custom Policy rule.
     * </p>
     * 
     * @param policyText
     *        The policy definition containing the logic for your Config Custom Policy rule.
     */

    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }

    /**
     * <p>
     * The policy definition containing the logic for your Config Custom Policy rule.
     * </p>
     * 
     * @return The policy definition containing the logic for your Config Custom Policy rule.
     */

    public String getPolicyText() {
        return this.policyText;
    }

    /**
     * <p>
     * The policy definition containing the logic for your Config Custom Policy rule.
     * </p>
     * 
     * @param policyText
     *        The policy definition containing the logic for your Config Custom Policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPolicyDetails withPolicyText(String policyText) {
        setPolicyText(policyText);
        return this;
    }

    /**
     * <p>
     * The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is
     * <code>false</code>.
     * </p>
     * 
     * @param enableDebugLogDelivery
     *        The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is
     *        <code>false</code>.
     */

    public void setEnableDebugLogDelivery(Boolean enableDebugLogDelivery) {
        this.enableDebugLogDelivery = enableDebugLogDelivery;
    }

    /**
     * <p>
     * The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is
     * <code>false</code>.
     * </p>
     * 
     * @return The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value
     *         is <code>false</code>.
     */

    public Boolean getEnableDebugLogDelivery() {
        return this.enableDebugLogDelivery;
    }

    /**
     * <p>
     * The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is
     * <code>false</code>.
     * </p>
     * 
     * @param enableDebugLogDelivery
     *        The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPolicyDetails withEnableDebugLogDelivery(Boolean enableDebugLogDelivery) {
        setEnableDebugLogDelivery(enableDebugLogDelivery);
        return this;
    }

    /**
     * <p>
     * The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is
     * <code>false</code>.
     * </p>
     * 
     * @return The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value
     *         is <code>false</code>.
     */

    public Boolean isEnableDebugLogDelivery() {
        return this.enableDebugLogDelivery;
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
        if (getPolicyRuntime() != null)
            sb.append("PolicyRuntime: ").append(getPolicyRuntime()).append(",");
        if (getPolicyText() != null)
            sb.append("PolicyText: ").append(getPolicyText()).append(",");
        if (getEnableDebugLogDelivery() != null)
            sb.append("EnableDebugLogDelivery: ").append(getEnableDebugLogDelivery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomPolicyDetails == false)
            return false;
        CustomPolicyDetails other = (CustomPolicyDetails) obj;
        if (other.getPolicyRuntime() == null ^ this.getPolicyRuntime() == null)
            return false;
        if (other.getPolicyRuntime() != null && other.getPolicyRuntime().equals(this.getPolicyRuntime()) == false)
            return false;
        if (other.getPolicyText() == null ^ this.getPolicyText() == null)
            return false;
        if (other.getPolicyText() != null && other.getPolicyText().equals(this.getPolicyText()) == false)
            return false;
        if (other.getEnableDebugLogDelivery() == null ^ this.getEnableDebugLogDelivery() == null)
            return false;
        if (other.getEnableDebugLogDelivery() != null && other.getEnableDebugLogDelivery().equals(this.getEnableDebugLogDelivery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyRuntime() == null) ? 0 : getPolicyRuntime().hashCode());
        hashCode = prime * hashCode + ((getPolicyText() == null) ? 0 : getPolicyText().hashCode());
        hashCode = prime * hashCode + ((getEnableDebugLogDelivery() == null) ? 0 : getEnableDebugLogDelivery().hashCode());
        return hashCode;
    }

    @Override
    public CustomPolicyDetails clone() {
        try {
            return (CustomPolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.CustomPolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
