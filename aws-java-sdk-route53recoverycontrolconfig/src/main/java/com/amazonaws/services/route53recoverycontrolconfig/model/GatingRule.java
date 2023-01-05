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
 * A gating rule verifies that a gating routing control or set of gating routing controls, evaluates as true, based on a
 * rule configuration that you specify, which allows a set of routing control state changes to complete.
 * </p>
 * <p>
 * For example, if you specify one gating routing control and you set the Type in the rule configuration to OR, that
 * indicates that you must set the gating routing control to On for the rule to evaluate as true; that is, for the
 * gating control "switch" to be "On". When you do that, then you can update the routing control states for the target
 * routing controls that you specify in the gating rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/GatingRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatingRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     */
    private String controlPanelArn;
    /**
     * <p>
     * An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify the ARN
     * for one routing control. The gating routing controls are evaluated by the rule configuration that you specify to
     * determine if the target routing control states can be changed.
     * </p>
     */
    private java.util.List<String> gatingControls;
    /**
     * <p>
     * The name for the gating rule. You can use any non-white space character in the name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The criteria that you set for gating routing controls that designate how many of the routing control states must
     * be ON to allow you to update target routing control states.
     * </p>
     */
    private RuleConfig ruleConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gating rule.
     * </p>
     */
    private String safetyRuleArn;
    /**
     * <p>
     * The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated if the
     * rule configuration that you specify evaluates to true for the gating routing control. As a simple example, if you
     * have a single gating control, it acts as an overall "on/off" switch for a set of target routing controls. You can
     * use this to manually override automated failover, for example.
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

    public GatingRule withControlPanelArn(String controlPanelArn) {
        setControlPanelArn(controlPanelArn);
        return this;
    }

    /**
     * <p>
     * An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify the ARN
     * for one routing control. The gating routing controls are evaluated by the rule configuration that you specify to
     * determine if the target routing control states can be changed.
     * </p>
     * 
     * @return An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify
     *         the ARN for one routing control. The gating routing controls are evaluated by the rule configuration that
     *         you specify to determine if the target routing control states can be changed.
     */

    public java.util.List<String> getGatingControls() {
        return gatingControls;
    }

    /**
     * <p>
     * An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify the ARN
     * for one routing control. The gating routing controls are evaluated by the rule configuration that you specify to
     * determine if the target routing control states can be changed.
     * </p>
     * 
     * @param gatingControls
     *        An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify the
     *        ARN for one routing control. The gating routing controls are evaluated by the rule configuration that you
     *        specify to determine if the target routing control states can be changed.
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
     * An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify the ARN
     * for one routing control. The gating routing controls are evaluated by the rule configuration that you specify to
     * determine if the target routing control states can be changed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatingControls(java.util.Collection)} or {@link #withGatingControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gatingControls
     *        An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify the
     *        ARN for one routing control. The gating routing controls are evaluated by the rule configuration that you
     *        specify to determine if the target routing control states can be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRule withGatingControls(String... gatingControls) {
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
     * An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify the ARN
     * for one routing control. The gating routing controls are evaluated by the rule configuration that you specify to
     * determine if the target routing control states can be changed.
     * </p>
     * 
     * @param gatingControls
     *        An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify the
     *        ARN for one routing control. The gating routing controls are evaluated by the rule configuration that you
     *        specify to determine if the target routing control states can be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRule withGatingControls(java.util.Collection<String> gatingControls) {
        setGatingControls(gatingControls);
        return this;
    }

    /**
     * <p>
     * The name for the gating rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        The name for the gating rule. You can use any non-white space character in the name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the gating rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @return The name for the gating rule. You can use any non-white space character in the name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the gating rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        The name for the gating rule. You can use any non-white space character in the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The criteria that you set for gating routing controls that designate how many of the routing control states must
     * be ON to allow you to update target routing control states.
     * </p>
     * 
     * @param ruleConfig
     *        The criteria that you set for gating routing controls that designate how many of the routing control
     *        states must be ON to allow you to update target routing control states.
     */

    public void setRuleConfig(RuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
    }

    /**
     * <p>
     * The criteria that you set for gating routing controls that designate how many of the routing control states must
     * be ON to allow you to update target routing control states.
     * </p>
     * 
     * @return The criteria that you set for gating routing controls that designate how many of the routing control
     *         states must be ON to allow you to update target routing control states.
     */

    public RuleConfig getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * <p>
     * The criteria that you set for gating routing controls that designate how many of the routing control states must
     * be ON to allow you to update target routing control states.
     * </p>
     * 
     * @param ruleConfig
     *        The criteria that you set for gating routing controls that designate how many of the routing control
     *        states must be ON to allow you to update target routing control states.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRule withRuleConfig(RuleConfig ruleConfig) {
        setRuleConfig(ruleConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gating rule.
     * </p>
     * 
     * @param safetyRuleArn
     *        The Amazon Resource Name (ARN) of the gating rule.
     */

    public void setSafetyRuleArn(String safetyRuleArn) {
        this.safetyRuleArn = safetyRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gating rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gating rule.
     */

    public String getSafetyRuleArn() {
        return this.safetyRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gating rule.
     * </p>
     * 
     * @param safetyRuleArn
     *        The Amazon Resource Name (ARN) of the gating rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRule withSafetyRuleArn(String safetyRuleArn) {
        setSafetyRuleArn(safetyRuleArn);
        return this;
    }

    /**
     * <p>
     * The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @return The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED,
     *         PENDING_DELETION.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GatingRule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GatingRule withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated if the
     * rule configuration that you specify evaluates to true for the gating routing control. As a simple example, if you
     * have a single gating control, it acts as an overall "on/off" switch for a set of target routing controls. You can
     * use this to manually override automated failover, for example.
     * </p>
     * 
     * @return An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated
     *         if the rule configuration that you specify evaluates to true for the gating routing control. As a simple
     *         example, if you have a single gating control, it acts as an overall "on/off" switch for a set of target
     *         routing controls. You can use this to manually override automated failover, for example.
     */

    public java.util.List<String> getTargetControls() {
        return targetControls;
    }

    /**
     * <p>
     * An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated if the
     * rule configuration that you specify evaluates to true for the gating routing control. As a simple example, if you
     * have a single gating control, it acts as an overall "on/off" switch for a set of target routing controls. You can
     * use this to manually override automated failover, for example.
     * </p>
     * 
     * @param targetControls
     *        An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated
     *        if the rule configuration that you specify evaluates to true for the gating routing control. As a simple
     *        example, if you have a single gating control, it acts as an overall "on/off" switch for a set of target
     *        routing controls. You can use this to manually override automated failover, for example.
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
     * An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated if the
     * rule configuration that you specify evaluates to true for the gating routing control. As a simple example, if you
     * have a single gating control, it acts as an overall "on/off" switch for a set of target routing controls. You can
     * use this to manually override automated failover, for example.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetControls(java.util.Collection)} or {@link #withTargetControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param targetControls
     *        An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated
     *        if the rule configuration that you specify evaluates to true for the gating routing control. As a simple
     *        example, if you have a single gating control, it acts as an overall "on/off" switch for a set of target
     *        routing controls. You can use this to manually override automated failover, for example.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRule withTargetControls(String... targetControls) {
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
     * An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated if the
     * rule configuration that you specify evaluates to true for the gating routing control. As a simple example, if you
     * have a single gating control, it acts as an overall "on/off" switch for a set of target routing controls. You can
     * use this to manually override automated failover, for example.
     * </p>
     * 
     * @param targetControls
     *        An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated
     *        if the rule configuration that you specify evaluates to true for the gating routing control. As a simple
     *        example, if you have a single gating control, it acts as an overall "on/off" switch for a set of target
     *        routing controls. You can use this to manually override automated failover, for example.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRule withTargetControls(java.util.Collection<String> targetControls) {
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

    public GatingRule withWaitPeriodMs(Integer waitPeriodMs) {
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
        if (getSafetyRuleArn() != null)
            sb.append("SafetyRuleArn: ").append(getSafetyRuleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof GatingRule == false)
            return false;
        GatingRule other = (GatingRule) obj;
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
        if (other.getSafetyRuleArn() == null ^ this.getSafetyRuleArn() == null)
            return false;
        if (other.getSafetyRuleArn() != null && other.getSafetyRuleArn().equals(this.getSafetyRuleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getSafetyRuleArn() == null) ? 0 : getSafetyRuleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetControls() == null) ? 0 : getTargetControls().hashCode());
        hashCode = prime * hashCode + ((getWaitPeriodMs() == null) ? 0 : getWaitPeriodMs().hashCode());
        return hashCode;
    }

    @Override
    public GatingRule clone() {
        try {
            return (GatingRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.GatingRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
