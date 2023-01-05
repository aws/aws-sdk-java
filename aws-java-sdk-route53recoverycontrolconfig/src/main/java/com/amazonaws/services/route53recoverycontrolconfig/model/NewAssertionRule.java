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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A new assertion rule for a control panel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/NewAssertionRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewAssertionRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The routing controls that are part of transactions that are evaluated to determine if a request to change a
     * routing control state is allowed. For example, you might include three routing controls, one for each of three
     * Amazon Web Services Regions.
     * </p>
     */
    private java.util.List<String> assertedControls;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the control panel.
     * </p>
     */
    private String controlPanelArn;
    /**
     * <p>
     * The name of the assertion rule. You can use any non-white space character in the name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The criteria that you set for specific assertion controls (routing controls) that designate how many control
     * states must be ON as the result of a transaction. For example, if you have three assertion controls, you might
     * specify ATLEAST 2 for your rule configuration. This means that at least two assertion controls must be ON, so
     * that at least two Amazon Web Services Regions have traffic flowing to them.
     * </p>
     */
    private RuleConfig ruleConfig;
    /**
     * <p>
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will
     * fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom
     * value.
     * </p>
     */
    private Integer waitPeriodMs;

    /**
     * <p>
     * The routing controls that are part of transactions that are evaluated to determine if a request to change a
     * routing control state is allowed. For example, you might include three routing controls, one for each of three
     * Amazon Web Services Regions.
     * </p>
     * 
     * @return The routing controls that are part of transactions that are evaluated to determine if a request to change
     *         a routing control state is allowed. For example, you might include three routing controls, one for each
     *         of three Amazon Web Services Regions.
     */

    public java.util.List<String> getAssertedControls() {
        return assertedControls;
    }

    /**
     * <p>
     * The routing controls that are part of transactions that are evaluated to determine if a request to change a
     * routing control state is allowed. For example, you might include three routing controls, one for each of three
     * Amazon Web Services Regions.
     * </p>
     * 
     * @param assertedControls
     *        The routing controls that are part of transactions that are evaluated to determine if a request to change
     *        a routing control state is allowed. For example, you might include three routing controls, one for each of
     *        three Amazon Web Services Regions.
     */

    public void setAssertedControls(java.util.Collection<String> assertedControls) {
        if (assertedControls == null) {
            this.assertedControls = null;
            return;
        }

        this.assertedControls = new java.util.ArrayList<String>(assertedControls);
    }

    /**
     * <p>
     * The routing controls that are part of transactions that are evaluated to determine if a request to change a
     * routing control state is allowed. For example, you might include three routing controls, one for each of three
     * Amazon Web Services Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssertedControls(java.util.Collection)} or {@link #withAssertedControls(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param assertedControls
     *        The routing controls that are part of transactions that are evaluated to determine if a request to change
     *        a routing control state is allowed. For example, you might include three routing controls, one for each of
     *        three Amazon Web Services Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewAssertionRule withAssertedControls(String... assertedControls) {
        if (this.assertedControls == null) {
            setAssertedControls(new java.util.ArrayList<String>(assertedControls.length));
        }
        for (String ele : assertedControls) {
            this.assertedControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routing controls that are part of transactions that are evaluated to determine if a request to change a
     * routing control state is allowed. For example, you might include three routing controls, one for each of three
     * Amazon Web Services Regions.
     * </p>
     * 
     * @param assertedControls
     *        The routing controls that are part of transactions that are evaluated to determine if a request to change
     *        a routing control state is allowed. For example, you might include three routing controls, one for each of
     *        three Amazon Web Services Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewAssertionRule withAssertedControls(java.util.Collection<String> assertedControls) {
        setAssertedControls(assertedControls);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the control panel.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) for the control panel.
     */

    public void setControlPanelArn(String controlPanelArn) {
        this.controlPanelArn = controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the control panel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the control panel.
     */

    public String getControlPanelArn() {
        return this.controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the control panel.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) for the control panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewAssertionRule withControlPanelArn(String controlPanelArn) {
        setControlPanelArn(controlPanelArn);
        return this;
    }

    /**
     * <p>
     * The name of the assertion rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        The name of the assertion rule. You can use any non-white space character in the name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the assertion rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @return The name of the assertion rule. You can use any non-white space character in the name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the assertion rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        The name of the assertion rule. You can use any non-white space character in the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewAssertionRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The criteria that you set for specific assertion controls (routing controls) that designate how many control
     * states must be ON as the result of a transaction. For example, if you have three assertion controls, you might
     * specify ATLEAST 2 for your rule configuration. This means that at least two assertion controls must be ON, so
     * that at least two Amazon Web Services Regions have traffic flowing to them.
     * </p>
     * 
     * @param ruleConfig
     *        The criteria that you set for specific assertion controls (routing controls) that designate how many
     *        control states must be ON as the result of a transaction. For example, if you have three assertion
     *        controls, you might specify ATLEAST 2 for your rule configuration. This means that at least two assertion
     *        controls must be ON, so that at least two Amazon Web Services Regions have traffic flowing to them.
     */

    public void setRuleConfig(RuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
    }

    /**
     * <p>
     * The criteria that you set for specific assertion controls (routing controls) that designate how many control
     * states must be ON as the result of a transaction. For example, if you have three assertion controls, you might
     * specify ATLEAST 2 for your rule configuration. This means that at least two assertion controls must be ON, so
     * that at least two Amazon Web Services Regions have traffic flowing to them.
     * </p>
     * 
     * @return The criteria that you set for specific assertion controls (routing controls) that designate how many
     *         control states must be ON as the result of a transaction. For example, if you have three assertion
     *         controls, you might specify ATLEAST 2 for your rule configuration. This means that at least two assertion
     *         controls must be ON, so that at least two Amazon Web Services Regions have traffic flowing to them.
     */

    public RuleConfig getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * <p>
     * The criteria that you set for specific assertion controls (routing controls) that designate how many control
     * states must be ON as the result of a transaction. For example, if you have three assertion controls, you might
     * specify ATLEAST 2 for your rule configuration. This means that at least two assertion controls must be ON, so
     * that at least two Amazon Web Services Regions have traffic flowing to them.
     * </p>
     * 
     * @param ruleConfig
     *        The criteria that you set for specific assertion controls (routing controls) that designate how many
     *        control states must be ON as the result of a transaction. For example, if you have three assertion
     *        controls, you might specify ATLEAST 2 for your rule configuration. This means that at least two assertion
     *        controls must be ON, so that at least two Amazon Web Services Regions have traffic flowing to them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewAssertionRule withRuleConfig(RuleConfig ruleConfig) {
        setRuleConfig(ruleConfig);
        return this;
    }

    /**
     * <p>
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will
     * fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom
     * value.
     * </p>
     * 
     * @param waitPeriodMs
     *        An evaluation period, in milliseconds (ms), during which any request against the target routing controls
     *        will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can
     *        choose a custom value.
     */

    public void setWaitPeriodMs(Integer waitPeriodMs) {
        this.waitPeriodMs = waitPeriodMs;
    }

    /**
     * <p>
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will
     * fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom
     * value.
     * </p>
     * 
     * @return An evaluation period, in milliseconds (ms), during which any request against the target routing controls
     *         will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can
     *         choose a custom value.
     */

    public Integer getWaitPeriodMs() {
        return this.waitPeriodMs;
    }

    /**
     * <p>
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will
     * fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom
     * value.
     * </p>
     * 
     * @param waitPeriodMs
     *        An evaluation period, in milliseconds (ms), during which any request against the target routing controls
     *        will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can
     *        choose a custom value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewAssertionRule withWaitPeriodMs(Integer waitPeriodMs) {
        setWaitPeriodMs(waitPeriodMs);
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
        if (getAssertedControls() != null)
            sb.append("AssertedControls: ").append(getAssertedControls()).append(",");
        if (getControlPanelArn() != null)
            sb.append("ControlPanelArn: ").append(getControlPanelArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRuleConfig() != null)
            sb.append("RuleConfig: ").append(getRuleConfig()).append(",");
        if (getWaitPeriodMs() != null)
            sb.append("WaitPeriodMs: ").append(getWaitPeriodMs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewAssertionRule == false)
            return false;
        NewAssertionRule other = (NewAssertionRule) obj;
        if (other.getAssertedControls() == null ^ this.getAssertedControls() == null)
            return false;
        if (other.getAssertedControls() != null && other.getAssertedControls().equals(this.getAssertedControls()) == false)
            return false;
        if (other.getControlPanelArn() == null ^ this.getControlPanelArn() == null)
            return false;
        if (other.getControlPanelArn() != null && other.getControlPanelArn().equals(this.getControlPanelArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleConfig() == null ^ this.getRuleConfig() == null)
            return false;
        if (other.getRuleConfig() != null && other.getRuleConfig().equals(this.getRuleConfig()) == false)
            return false;
        if (other.getWaitPeriodMs() == null ^ this.getWaitPeriodMs() == null)
            return false;
        if (other.getWaitPeriodMs() != null && other.getWaitPeriodMs().equals(this.getWaitPeriodMs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssertedControls() == null) ? 0 : getAssertedControls().hashCode());
        hashCode = prime * hashCode + ((getControlPanelArn() == null) ? 0 : getControlPanelArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleConfig() == null) ? 0 : getRuleConfig().hashCode());
        hashCode = prime * hashCode + ((getWaitPeriodMs() == null) ? 0 : getWaitPeriodMs().hashCode());
        return hashCode;
    }

    @Override
    public NewAssertionRule clone() {
        try {
            return (NewAssertionRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.NewAssertionRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
