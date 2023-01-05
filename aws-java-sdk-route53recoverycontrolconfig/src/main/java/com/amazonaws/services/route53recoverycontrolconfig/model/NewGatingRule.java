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
 * A new gating rule for a control panel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/NewGatingRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewGatingRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     */
    private String controlPanelArn;
    /**
     * <p>
     * The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule
     * configuration that you specify.
     * </p>
     */
    private java.util.List<String> gatingControls;
    /**
     * <p>
     * The name for the new gating rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The criteria that you set for specific gating controls (routing controls) that designate how many control states
     * must be ON to allow you to change (set or unset) the target control states.
     * </p>
     */
    private RuleConfig ruleConfig;
    /**
     * <p>
     * Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified
     * GatingControls. For example, say you have three gating controls, one for each of three Amazon Web Services
     * Regions. Now you specify ATLEAST 2 as your RuleConfig. With these settings, you can only change (set or unset)
     * the routing controls that you have specified as TargetControls if that rule evaluates to true.
     * </p>
     * <p>
     * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by
     * the rule that you set for the routing controls in GatingControls.
     * </p>
     */
    private java.util.List<String> targetControls;
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
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel.
     */

    public void setControlPanelArn(String controlPanelArn) {
        this.controlPanelArn = controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the control panel.
     */

    public String getControlPanelArn() {
        return this.controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGatingRule withControlPanelArn(String controlPanelArn) {
        setControlPanelArn(controlPanelArn);
        return this;
    }

    /**
     * <p>
     * The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule
     * configuration that you specify.
     * </p>
     * 
     * @return The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule
     *         configuration that you specify.
     */

    public java.util.List<String> getGatingControls() {
        return gatingControls;
    }

    /**
     * <p>
     * The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule
     * configuration that you specify.
     * </p>
     * 
     * @param gatingControls
     *        The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule
     *        configuration that you specify.
     */

    public void setGatingControls(java.util.Collection<String> gatingControls) {
        if (gatingControls == null) {
            this.gatingControls = null;
            return;
        }

        this.gatingControls = new java.util.ArrayList<String>(gatingControls);
    }

    /**
     * <p>
     * The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule
     * configuration that you specify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatingControls(java.util.Collection)} or {@link #withGatingControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gatingControls
     *        The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule
     *        configuration that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGatingRule withGatingControls(String... gatingControls) {
        if (this.gatingControls == null) {
            setGatingControls(new java.util.ArrayList<String>(gatingControls.length));
        }
        for (String ele : gatingControls) {
            this.gatingControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule
     * configuration that you specify.
     * </p>
     * 
     * @param gatingControls
     *        The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule
     *        configuration that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGatingRule withGatingControls(java.util.Collection<String> gatingControls) {
        setGatingControls(gatingControls);
        return this;
    }

    /**
     * <p>
     * The name for the new gating rule.
     * </p>
     * 
     * @param name
     *        The name for the new gating rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new gating rule.
     * </p>
     * 
     * @return The name for the new gating rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new gating rule.
     * </p>
     * 
     * @param name
     *        The name for the new gating rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGatingRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The criteria that you set for specific gating controls (routing controls) that designate how many control states
     * must be ON to allow you to change (set or unset) the target control states.
     * </p>
     * 
     * @param ruleConfig
     *        The criteria that you set for specific gating controls (routing controls) that designate how many control
     *        states must be ON to allow you to change (set or unset) the target control states.
     */

    public void setRuleConfig(RuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
    }

    /**
     * <p>
     * The criteria that you set for specific gating controls (routing controls) that designate how many control states
     * must be ON to allow you to change (set or unset) the target control states.
     * </p>
     * 
     * @return The criteria that you set for specific gating controls (routing controls) that designate how many control
     *         states must be ON to allow you to change (set or unset) the target control states.
     */

    public RuleConfig getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * <p>
     * The criteria that you set for specific gating controls (routing controls) that designate how many control states
     * must be ON to allow you to change (set or unset) the target control states.
     * </p>
     * 
     * @param ruleConfig
     *        The criteria that you set for specific gating controls (routing controls) that designate how many control
     *        states must be ON to allow you to change (set or unset) the target control states.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGatingRule withRuleConfig(RuleConfig ruleConfig) {
        setRuleConfig(ruleConfig);
        return this;
    }

    /**
     * <p>
     * Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified
     * GatingControls. For example, say you have three gating controls, one for each of three Amazon Web Services
     * Regions. Now you specify ATLEAST 2 as your RuleConfig. With these settings, you can only change (set or unset)
     * the routing controls that you have specified as TargetControls if that rule evaluates to true.
     * </p>
     * <p>
     * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by
     * the rule that you set for the routing controls in GatingControls.
     * </p>
     * 
     * @return Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the
     *         specified GatingControls. For example, say you have three gating controls, one for each of three Amazon
     *         Web Services Regions. Now you specify ATLEAST 2 as your RuleConfig. With these settings, you can only
     *         change (set or unset) the routing controls that you have specified as TargetControls if that rule
     *         evaluates to true.</p>
     *         <p>
     *         In other words, your ability to change the routing controls that you have specified as TargetControls is
     *         gated by the rule that you set for the routing controls in GatingControls.
     */

    public java.util.List<String> getTargetControls() {
        return targetControls;
    }

    /**
     * <p>
     * Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified
     * GatingControls. For example, say you have three gating controls, one for each of three Amazon Web Services
     * Regions. Now you specify ATLEAST 2 as your RuleConfig. With these settings, you can only change (set or unset)
     * the routing controls that you have specified as TargetControls if that rule evaluates to true.
     * </p>
     * <p>
     * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by
     * the rule that you set for the routing controls in GatingControls.
     * </p>
     * 
     * @param targetControls
     *        Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the
     *        specified GatingControls. For example, say you have three gating controls, one for each of three Amazon
     *        Web Services Regions. Now you specify ATLEAST 2 as your RuleConfig. With these settings, you can only
     *        change (set or unset) the routing controls that you have specified as TargetControls if that rule
     *        evaluates to true.</p>
     *        <p>
     *        In other words, your ability to change the routing controls that you have specified as TargetControls is
     *        gated by the rule that you set for the routing controls in GatingControls.
     */

    public void setTargetControls(java.util.Collection<String> targetControls) {
        if (targetControls == null) {
            this.targetControls = null;
            return;
        }

        this.targetControls = new java.util.ArrayList<String>(targetControls);
    }

    /**
     * <p>
     * Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified
     * GatingControls. For example, say you have three gating controls, one for each of three Amazon Web Services
     * Regions. Now you specify ATLEAST 2 as your RuleConfig. With these settings, you can only change (set or unset)
     * the routing controls that you have specified as TargetControls if that rule evaluates to true.
     * </p>
     * <p>
     * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by
     * the rule that you set for the routing controls in GatingControls.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetControls(java.util.Collection)} or {@link #withTargetControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param targetControls
     *        Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the
     *        specified GatingControls. For example, say you have three gating controls, one for each of three Amazon
     *        Web Services Regions. Now you specify ATLEAST 2 as your RuleConfig. With these settings, you can only
     *        change (set or unset) the routing controls that you have specified as TargetControls if that rule
     *        evaluates to true.</p>
     *        <p>
     *        In other words, your ability to change the routing controls that you have specified as TargetControls is
     *        gated by the rule that you set for the routing controls in GatingControls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGatingRule withTargetControls(String... targetControls) {
        if (this.targetControls == null) {
            setTargetControls(new java.util.ArrayList<String>(targetControls.length));
        }
        for (String ele : targetControls) {
            this.targetControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified
     * GatingControls. For example, say you have three gating controls, one for each of three Amazon Web Services
     * Regions. Now you specify ATLEAST 2 as your RuleConfig. With these settings, you can only change (set or unset)
     * the routing controls that you have specified as TargetControls if that rule evaluates to true.
     * </p>
     * <p>
     * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by
     * the rule that you set for the routing controls in GatingControls.
     * </p>
     * 
     * @param targetControls
     *        Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the
     *        specified GatingControls. For example, say you have three gating controls, one for each of three Amazon
     *        Web Services Regions. Now you specify ATLEAST 2 as your RuleConfig. With these settings, you can only
     *        change (set or unset) the routing controls that you have specified as TargetControls if that rule
     *        evaluates to true.</p>
     *        <p>
     *        In other words, your ability to change the routing controls that you have specified as TargetControls is
     *        gated by the rule that you set for the routing controls in GatingControls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGatingRule withTargetControls(java.util.Collection<String> targetControls) {
        setTargetControls(targetControls);
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

    public NewGatingRule withWaitPeriodMs(Integer waitPeriodMs) {
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
        if (getControlPanelArn() != null)
            sb.append("ControlPanelArn: ").append(getControlPanelArn()).append(",");
        if (getGatingControls() != null)
            sb.append("GatingControls: ").append(getGatingControls()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRuleConfig() != null)
            sb.append("RuleConfig: ").append(getRuleConfig()).append(",");
        if (getTargetControls() != null)
            sb.append("TargetControls: ").append(getTargetControls()).append(",");
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

        if (obj instanceof NewGatingRule == false)
            return false;
        NewGatingRule other = (NewGatingRule) obj;
        if (other.getControlPanelArn() == null ^ this.getControlPanelArn() == null)
            return false;
        if (other.getControlPanelArn() != null && other.getControlPanelArn().equals(this.getControlPanelArn()) == false)
            return false;
        if (other.getGatingControls() == null ^ this.getGatingControls() == null)
            return false;
        if (other.getGatingControls() != null && other.getGatingControls().equals(this.getGatingControls()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleConfig() == null ^ this.getRuleConfig() == null)
            return false;
        if (other.getRuleConfig() != null && other.getRuleConfig().equals(this.getRuleConfig()) == false)
            return false;
        if (other.getTargetControls() == null ^ this.getTargetControls() == null)
            return false;
        if (other.getTargetControls() != null && other.getTargetControls().equals(this.getTargetControls()) == false)
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

        hashCode = prime * hashCode + ((getControlPanelArn() == null) ? 0 : getControlPanelArn().hashCode());
        hashCode = prime * hashCode + ((getGatingControls() == null) ? 0 : getGatingControls().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleConfig() == null) ? 0 : getRuleConfig().hashCode());
        hashCode = prime * hashCode + ((getTargetControls() == null) ? 0 : getTargetControls().hashCode());
        hashCode = prime * hashCode + ((getWaitPeriodMs() == null) ? 0 : getWaitPeriodMs().hashCode());
        return hashCode;
    }

    @Override
    public NewGatingRule clone() {
        try {
            return (NewGatingRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.NewGatingRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
