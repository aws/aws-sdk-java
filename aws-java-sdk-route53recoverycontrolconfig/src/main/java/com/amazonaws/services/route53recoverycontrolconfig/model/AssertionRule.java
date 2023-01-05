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
 * An assertion rule enforces that, when you change a routing control state, that the criteria that you set in the rule
 * configuration is met. Otherwise, the change to the routing control is not accepted. For example, the criteria might
 * be that at least one routing control state is On after the transaction so that traffic continues to flow to at least
 * one cell for the application. This ensures that you avoid a fail-open scenario.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/AssertionRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssertionRule implements Serializable, Cloneable, StructuredPojo {

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
     * The Amazon Resource Name (ARN) of the control panel.
     * </p>
     */
    private String controlPanelArn;
    /**
     * <p>
     * Name of the assertion rule. You can use any non-white space character in the name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The criteria that you set for specific assertion routing controls (AssertedControls) that designate how many
     * routing control states must be ON as the result of a transaction. For example, if you have three assertion
     * routing controls, you might specify ATLEAST 2 for your rule configuration. This means that at least two assertion
     * routing control states must be ON, so that at least two Amazon Web Services Regions have traffic flowing to them.
     * </p>
     */
    private RuleConfig ruleConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assertion rule.
     * </p>
     */
    private String safetyRuleArn;
    /**
     * <p>
     * The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     */
    private String status;
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

    public AssertionRule withAssertedControls(String... assertedControls) {
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

    public AssertionRule withAssertedControls(java.util.Collection<String> assertedControls) {
        setAssertedControls(assertedControls);
        return this;
    }

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

    public AssertionRule withControlPanelArn(String controlPanelArn) {
        setControlPanelArn(controlPanelArn);
        return this;
    }

    /**
     * <p>
     * Name of the assertion rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        Name of the assertion rule. You can use any non-white space character in the name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the assertion rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @return Name of the assertion rule. You can use any non-white space character in the name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the assertion rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        Name of the assertion rule. You can use any non-white space character in the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssertionRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The criteria that you set for specific assertion routing controls (AssertedControls) that designate how many
     * routing control states must be ON as the result of a transaction. For example, if you have three assertion
     * routing controls, you might specify ATLEAST 2 for your rule configuration. This means that at least two assertion
     * routing control states must be ON, so that at least two Amazon Web Services Regions have traffic flowing to them.
     * </p>
     * 
     * @param ruleConfig
     *        The criteria that you set for specific assertion routing controls (AssertedControls) that designate how
     *        many routing control states must be ON as the result of a transaction. For example, if you have three
     *        assertion routing controls, you might specify ATLEAST 2 for your rule configuration. This means that at
     *        least two assertion routing control states must be ON, so that at least two Amazon Web Services Regions
     *        have traffic flowing to them.
     */

    public void setRuleConfig(RuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
    }

    /**
     * <p>
     * The criteria that you set for specific assertion routing controls (AssertedControls) that designate how many
     * routing control states must be ON as the result of a transaction. For example, if you have three assertion
     * routing controls, you might specify ATLEAST 2 for your rule configuration. This means that at least two assertion
     * routing control states must be ON, so that at least two Amazon Web Services Regions have traffic flowing to them.
     * </p>
     * 
     * @return The criteria that you set for specific assertion routing controls (AssertedControls) that designate how
     *         many routing control states must be ON as the result of a transaction. For example, if you have three
     *         assertion routing controls, you might specify ATLEAST 2 for your rule configuration. This means that at
     *         least two assertion routing control states must be ON, so that at least two Amazon Web Services Regions
     *         have traffic flowing to them.
     */

    public RuleConfig getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * <p>
     * The criteria that you set for specific assertion routing controls (AssertedControls) that designate how many
     * routing control states must be ON as the result of a transaction. For example, if you have three assertion
     * routing controls, you might specify ATLEAST 2 for your rule configuration. This means that at least two assertion
     * routing control states must be ON, so that at least two Amazon Web Services Regions have traffic flowing to them.
     * </p>
     * 
     * @param ruleConfig
     *        The criteria that you set for specific assertion routing controls (AssertedControls) that designate how
     *        many routing control states must be ON as the result of a transaction. For example, if you have three
     *        assertion routing controls, you might specify ATLEAST 2 for your rule configuration. This means that at
     *        least two assertion routing control states must be ON, so that at least two Amazon Web Services Regions
     *        have traffic flowing to them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssertionRule withRuleConfig(RuleConfig ruleConfig) {
        setRuleConfig(ruleConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assertion rule.
     * </p>
     * 
     * @param safetyRuleArn
     *        The Amazon Resource Name (ARN) of the assertion rule.
     */

    public void setSafetyRuleArn(String safetyRuleArn) {
        this.safetyRuleArn = safetyRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assertion rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the assertion rule.
     */

    public String getSafetyRuleArn() {
        return this.safetyRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assertion rule.
     * </p>
     * 
     * @param safetyRuleArn
     *        The Amazon Resource Name (ARN) of the assertion rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssertionRule withSafetyRuleArn(String safetyRuleArn) {
        setSafetyRuleArn(safetyRuleArn);
        return this;
    }

    /**
     * <p>
     * The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     * 
     * @return The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED,
     *         PENDING_DELETION.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public AssertionRule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED,
     * PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED,
     *        PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public AssertionRule withStatus(Status status) {
        this.status = status.toString();
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

    public AssertionRule withWaitPeriodMs(Integer waitPeriodMs) {
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
        if (getSafetyRuleArn() != null)
            sb.append("SafetyRuleArn: ").append(getSafetyRuleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof AssertionRule == false)
            return false;
        AssertionRule other = (AssertionRule) obj;
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
        if (other.getSafetyRuleArn() == null ^ this.getSafetyRuleArn() == null)
            return false;
        if (other.getSafetyRuleArn() != null && other.getSafetyRuleArn().equals(this.getSafetyRuleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getSafetyRuleArn() == null) ? 0 : getSafetyRuleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWaitPeriodMs() == null) ? 0 : getWaitPeriodMs().hashCode());
        return hashCode;
    }

    @Override
    public AssertionRule clone() {
        try {
            return (AssertionRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.AssertionRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
