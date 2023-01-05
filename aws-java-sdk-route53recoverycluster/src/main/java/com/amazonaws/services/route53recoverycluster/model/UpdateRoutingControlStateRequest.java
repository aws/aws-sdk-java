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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoutingControlStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the routing control that you want to update the state for.
     * </p>
     */
    private String routingControlArn;
    /**
     * <p>
     * The state of the routing control. You can set the value to be On or Off.
     * </p>
     */
    private String routingControlState;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the state of
     * a routing control. You can override one safety rule or multiple safety rules by including one or more ARNs,
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
     * The Amazon Resource Name (ARN) for the routing control that you want to update the state for.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Name (ARN) for the routing control that you want to update the state for.
     */

    public void setRoutingControlArn(String routingControlArn) {
        this.routingControlArn = routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the routing control that you want to update the state for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the routing control that you want to update the state for.
     */

    public String getRoutingControlArn() {
        return this.routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the routing control that you want to update the state for.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Name (ARN) for the routing control that you want to update the state for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStateRequest withRoutingControlArn(String routingControlArn) {
        setRoutingControlArn(routingControlArn);
        return this;
    }

    /**
     * <p>
     * The state of the routing control. You can set the value to be On or Off.
     * </p>
     * 
     * @param routingControlState
     *        The state of the routing control. You can set the value to be On or Off.
     * @see RoutingControlState
     */

    public void setRoutingControlState(String routingControlState) {
        this.routingControlState = routingControlState;
    }

    /**
     * <p>
     * The state of the routing control. You can set the value to be On or Off.
     * </p>
     * 
     * @return The state of the routing control. You can set the value to be On or Off.
     * @see RoutingControlState
     */

    public String getRoutingControlState() {
        return this.routingControlState;
    }

    /**
     * <p>
     * The state of the routing control. You can set the value to be On or Off.
     * </p>
     * 
     * @param routingControlState
     *        The state of the routing control. You can set the value to be On or Off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingControlState
     */

    public UpdateRoutingControlStateRequest withRoutingControlState(String routingControlState) {
        setRoutingControlState(routingControlState);
        return this;
    }

    /**
     * <p>
     * The state of the routing control. You can set the value to be On or Off.
     * </p>
     * 
     * @param routingControlState
     *        The state of the routing control. You can set the value to be On or Off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingControlState
     */

    public UpdateRoutingControlStateRequest withRoutingControlState(RoutingControlState routingControlState) {
        this.routingControlState = routingControlState.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the state of
     * a routing control. You can override one safety rule or multiple safety rules by including one or more ARNs,
     * separated by commas.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the
     *         state of a routing control. You can override one safety rule or multiple safety rules by including one or
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
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the state of
     * a routing control. You can override one safety rule or multiple safety rules by including one or more ARNs,
     * separated by commas.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param safetyRulesToOverride
     *        The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the
     *        state of a routing control. You can override one safety rule or multiple safety rules by including one or
     *        more ARNs, separated by commas.</p>
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
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the state of
     * a routing control. You can override one safety rule or multiple safety rules by including one or more ARNs,
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
     *        The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the
     *        state of a routing control. You can override one safety rule or multiple safety rules by including one or
     *        more ARNs, separated by commas.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html">
     *        Override safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller
     *        Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStateRequest withSafetyRulesToOverride(String... safetyRulesToOverride) {
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
     * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the state of
     * a routing control. You can override one safety rule or multiple safety rules by including one or more ARNs,
     * separated by commas.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param safetyRulesToOverride
     *        The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the
     *        state of a routing control. You can override one safety rule or multiple safety rules by including one or
     *        more ARNs, separated by commas.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html">
     *        Override safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller
     *        Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStateRequest withSafetyRulesToOverride(java.util.Collection<String> safetyRulesToOverride) {
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
        if (getRoutingControlArn() != null)
            sb.append("RoutingControlArn: ").append(getRoutingControlArn()).append(",");
        if (getRoutingControlState() != null)
            sb.append("RoutingControlState: ").append(getRoutingControlState()).append(",");
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

        if (obj instanceof UpdateRoutingControlStateRequest == false)
            return false;
        UpdateRoutingControlStateRequest other = (UpdateRoutingControlStateRequest) obj;
        if (other.getRoutingControlArn() == null ^ this.getRoutingControlArn() == null)
            return false;
        if (other.getRoutingControlArn() != null && other.getRoutingControlArn().equals(this.getRoutingControlArn()) == false)
            return false;
        if (other.getRoutingControlState() == null ^ this.getRoutingControlState() == null)
            return false;
        if (other.getRoutingControlState() != null && other.getRoutingControlState().equals(this.getRoutingControlState()) == false)
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

        hashCode = prime * hashCode + ((getRoutingControlArn() == null) ? 0 : getRoutingControlArn().hashCode());
        hashCode = prime * hashCode + ((getRoutingControlState() == null) ? 0 : getRoutingControlState().hashCode());
        hashCode = prime * hashCode + ((getSafetyRulesToOverride() == null) ? 0 : getSafetyRulesToOverride().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoutingControlStateRequest clone() {
        return (UpdateRoutingControlStateRequest) super.clone();
    }

}
