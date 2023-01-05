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
package com.amazonaws.services.route53recoverycluster.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlStates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoutingControlStatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     */
    private java.util.List<UpdateRoutingControlStateEntry> updateRoutingControlStateEntries;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating routing
     * control states. You can override one safety rule or multiple safety rules by including one or more ARNs,
     * separated by commas.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     */
    private java.util.List<String> safetyRulesToOverride;

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     * 
     * @return A set of routing control entries that you want to update.
     */

    public java.util.List<UpdateRoutingControlStateEntry> getUpdateRoutingControlStateEntries() {
        return updateRoutingControlStateEntries;
    }

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     * 
     * @param updateRoutingControlStateEntries
     *        A set of routing control entries that you want to update.
     */

    public void setUpdateRoutingControlStateEntries(java.util.Collection<UpdateRoutingControlStateEntry> updateRoutingControlStateEntries) {
        if (updateRoutingControlStateEntries == null) {
            this.updateRoutingControlStateEntries = null;
            return;
        }

        this.updateRoutingControlStateEntries = new java.util.ArrayList<UpdateRoutingControlStateEntry>(updateRoutingControlStateEntries);
    }

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateRoutingControlStateEntries(java.util.Collection)} or
     * {@link #withUpdateRoutingControlStateEntries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param updateRoutingControlStateEntries
     *        A set of routing control entries that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStatesRequest withUpdateRoutingControlStateEntries(UpdateRoutingControlStateEntry... updateRoutingControlStateEntries) {
        if (this.updateRoutingControlStateEntries == null) {
            setUpdateRoutingControlStateEntries(new java.util.ArrayList<UpdateRoutingControlStateEntry>(updateRoutingControlStateEntries.length));
        }
        for (UpdateRoutingControlStateEntry ele : updateRoutingControlStateEntries) {
            this.updateRoutingControlStateEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     * 
     * @param updateRoutingControlStateEntries
     *        A set of routing control entries that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStatesRequest withUpdateRoutingControlStateEntries(
            java.util.Collection<UpdateRoutingControlStateEntry> updateRoutingControlStateEntries) {
        setUpdateRoutingControlStateEntries(updateRoutingControlStateEntries);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating routing
     * control states. You can override one safety rule or multiple safety rules by including one or more ARNs,
     * separated by commas.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating
     *         routing control states. You can override one safety rule or multiple safety rules by including one or
     *         more ARNs, separated by commas.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html">
     *         Override safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller
     *         Developer Guide.
     */

    public java.util.List<String> getSafetyRulesToOverride() {
        return safetyRulesToOverride;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating routing
     * control states. You can override one safety rule or multiple safety rules by including one or more ARNs,
     * separated by commas.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param safetyRulesToOverride
     *        The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating
     *        routing control states. You can override one safety rule or multiple safety rules by including one or more
     *        ARNs, separated by commas.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html">
     *        Override safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller
     *        Developer Guide.
     */

    public void setSafetyRulesToOverride(java.util.Collection<String> safetyRulesToOverride) {
        if (safetyRulesToOverride == null) {
            this.safetyRulesToOverride = null;
            return;
        }

        this.safetyRulesToOverride = new java.util.ArrayList<String>(safetyRulesToOverride);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating routing
     * control states. You can override one safety rule or multiple safety rules by including one or more ARNs,
     * separated by commas.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSafetyRulesToOverride(java.util.Collection)} or
     * {@link #withSafetyRulesToOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param safetyRulesToOverride
     *        The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating
     *        routing control states. You can override one safety rule or multiple safety rules by including one or more
     *        ARNs, separated by commas.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html">
     *        Override safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller
     *        Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStatesRequest withSafetyRulesToOverride(String... safetyRulesToOverride) {
        if (this.safetyRulesToOverride == null) {
            setSafetyRulesToOverride(new java.util.ArrayList<String>(safetyRulesToOverride.length));
        }
        for (String ele : safetyRulesToOverride) {
            this.safetyRulesToOverride.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating routing
     * control states. You can override one safety rule or multiple safety rules by including one or more ARNs,
     * separated by commas.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param safetyRulesToOverride
     *        The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating
     *        routing control states. You can override one safety rule or multiple safety rules by including one or more
     *        ARNs, separated by commas.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html">
     *        Override safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller
     *        Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStatesRequest withSafetyRulesToOverride(java.util.Collection<String> safetyRulesToOverride) {
        setSafetyRulesToOverride(safetyRulesToOverride);
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
        if (getUpdateRoutingControlStateEntries() != null)
            sb.append("UpdateRoutingControlStateEntries: ").append(getUpdateRoutingControlStateEntries()).append(",");
        if (getSafetyRulesToOverride() != null)
            sb.append("SafetyRulesToOverride: ").append(getSafetyRulesToOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoutingControlStatesRequest == false)
            return false;
        UpdateRoutingControlStatesRequest other = (UpdateRoutingControlStatesRequest) obj;
        if (other.getUpdateRoutingControlStateEntries() == null ^ this.getUpdateRoutingControlStateEntries() == null)
            return false;
        if (other.getUpdateRoutingControlStateEntries() != null
                && other.getUpdateRoutingControlStateEntries().equals(this.getUpdateRoutingControlStateEntries()) == false)
            return false;
        if (other.getSafetyRulesToOverride() == null ^ this.getSafetyRulesToOverride() == null)
            return false;
        if (other.getSafetyRulesToOverride() != null && other.getSafetyRulesToOverride().equals(this.getSafetyRulesToOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateRoutingControlStateEntries() == null) ? 0 : getUpdateRoutingControlStateEntries().hashCode());
        hashCode = prime * hashCode + ((getSafetyRulesToOverride() == null) ? 0 : getSafetyRulesToOverride().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoutingControlStatesRequest clone() {
        return (UpdateRoutingControlStatesRequest) super.clone();
    }

}
