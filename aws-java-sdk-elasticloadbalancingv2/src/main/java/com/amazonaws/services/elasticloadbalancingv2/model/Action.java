/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about an action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable {

    /**
     * <p>
     * The type of action. Each rule must include one forward action.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is <code>forward</code>.
     * </p>
     * <p>
     * For a default rule, the protocol of the target group must be HTTP or HTTPS for an Application Load Balancer or
     * TCP for a Network Load Balancer.
     * </p>
     */
    private String targetGroupArn;
    /**
     * <p>
     * [HTTPS listener] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify
     * only when <code>Type</code> is <code>authenticate-oidc</code>.
     * </p>
     */
    private AuthenticateOidcActionConfig authenticateOidcConfig;
    /**
     * <p>
     * [HTTPS listener] Information for using Amazon Cognito to authenticate users. Specify only when <code>Type</code>
     * is <code>authenticate-cognito</code>.
     * </p>
     */
    private AuthenticateCognitoActionConfig authenticateCognitoConfig;
    /**
     * <p>
     * The order for the action. This value is required for rules with multiple actions. The action with the lowest
     * value for order is performed first. The forward action must be performed last.
     * </p>
     */
    private Integer order;

    /**
     * <p>
     * The type of action. Each rule must include one forward action.
     * </p>
     * 
     * @param type
     *        The type of action. Each rule must include one forward action.
     * @see ActionTypeEnum
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of action. Each rule must include one forward action.
     * </p>
     * 
     * @return The type of action. Each rule must include one forward action.
     * @see ActionTypeEnum
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of action. Each rule must include one forward action.
     * </p>
     * 
     * @param type
     *        The type of action. Each rule must include one forward action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionTypeEnum
     */

    public Action withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of action. Each rule must include one forward action.
     * </p>
     * 
     * @param type
     *        The type of action. Each rule must include one forward action.
     * @see ActionTypeEnum
     */

    public void setType(ActionTypeEnum type) {
        withType(type);
    }

    /**
     * <p>
     * The type of action. Each rule must include one forward action.
     * </p>
     * 
     * @param type
     *        The type of action. Each rule must include one forward action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionTypeEnum
     */

    public Action withType(ActionTypeEnum type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is <code>forward</code>.
     * </p>
     * <p>
     * For a default rule, the protocol of the target group must be HTTP or HTTPS for an Application Load Balancer or
     * TCP for a Network Load Balancer.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is
     *        <code>forward</code>.</p>
     *        <p>
     *        For a default rule, the protocol of the target group must be HTTP or HTTPS for an Application Load
     *        Balancer or TCP for a Network Load Balancer.
     */

    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is <code>forward</code>.
     * </p>
     * <p>
     * For a default rule, the protocol of the target group must be HTTP or HTTPS for an Application Load Balancer or
     * TCP for a Network Load Balancer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is
     *         <code>forward</code>.</p>
     *         <p>
     *         For a default rule, the protocol of the target group must be HTTP or HTTPS for an Application Load
     *         Balancer or TCP for a Network Load Balancer.
     */

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is <code>forward</code>.
     * </p>
     * <p>
     * For a default rule, the protocol of the target group must be HTTP or HTTPS for an Application Load Balancer or
     * TCP for a Network Load Balancer.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is
     *        <code>forward</code>.</p>
     *        <p>
     *        For a default rule, the protocol of the target group must be HTTP or HTTPS for an Application Load
     *        Balancer or TCP for a Network Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * <p>
     * [HTTPS listener] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify
     * only when <code>Type</code> is <code>authenticate-oidc</code>.
     * </p>
     * 
     * @param authenticateOidcConfig
     *        [HTTPS listener] Information about an identity provider that is compliant with OpenID Connect (OIDC).
     *        Specify only when <code>Type</code> is <code>authenticate-oidc</code>.
     */

    public void setAuthenticateOidcConfig(AuthenticateOidcActionConfig authenticateOidcConfig) {
        this.authenticateOidcConfig = authenticateOidcConfig;
    }

    /**
     * <p>
     * [HTTPS listener] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify
     * only when <code>Type</code> is <code>authenticate-oidc</code>.
     * </p>
     * 
     * @return [HTTPS listener] Information about an identity provider that is compliant with OpenID Connect (OIDC).
     *         Specify only when <code>Type</code> is <code>authenticate-oidc</code>.
     */

    public AuthenticateOidcActionConfig getAuthenticateOidcConfig() {
        return this.authenticateOidcConfig;
    }

    /**
     * <p>
     * [HTTPS listener] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify
     * only when <code>Type</code> is <code>authenticate-oidc</code>.
     * </p>
     * 
     * @param authenticateOidcConfig
     *        [HTTPS listener] Information about an identity provider that is compliant with OpenID Connect (OIDC).
     *        Specify only when <code>Type</code> is <code>authenticate-oidc</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withAuthenticateOidcConfig(AuthenticateOidcActionConfig authenticateOidcConfig) {
        setAuthenticateOidcConfig(authenticateOidcConfig);
        return this;
    }

    /**
     * <p>
     * [HTTPS listener] Information for using Amazon Cognito to authenticate users. Specify only when <code>Type</code>
     * is <code>authenticate-cognito</code>.
     * </p>
     * 
     * @param authenticateCognitoConfig
     *        [HTTPS listener] Information for using Amazon Cognito to authenticate users. Specify only when
     *        <code>Type</code> is <code>authenticate-cognito</code>.
     */

    public void setAuthenticateCognitoConfig(AuthenticateCognitoActionConfig authenticateCognitoConfig) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
    }

    /**
     * <p>
     * [HTTPS listener] Information for using Amazon Cognito to authenticate users. Specify only when <code>Type</code>
     * is <code>authenticate-cognito</code>.
     * </p>
     * 
     * @return [HTTPS listener] Information for using Amazon Cognito to authenticate users. Specify only when
     *         <code>Type</code> is <code>authenticate-cognito</code>.
     */

    public AuthenticateCognitoActionConfig getAuthenticateCognitoConfig() {
        return this.authenticateCognitoConfig;
    }

    /**
     * <p>
     * [HTTPS listener] Information for using Amazon Cognito to authenticate users. Specify only when <code>Type</code>
     * is <code>authenticate-cognito</code>.
     * </p>
     * 
     * @param authenticateCognitoConfig
     *        [HTTPS listener] Information for using Amazon Cognito to authenticate users. Specify only when
     *        <code>Type</code> is <code>authenticate-cognito</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withAuthenticateCognitoConfig(AuthenticateCognitoActionConfig authenticateCognitoConfig) {
        setAuthenticateCognitoConfig(authenticateCognitoConfig);
        return this;
    }

    /**
     * <p>
     * The order for the action. This value is required for rules with multiple actions. The action with the lowest
     * value for order is performed first. The forward action must be performed last.
     * </p>
     * 
     * @param order
     *        The order for the action. This value is required for rules with multiple actions. The action with the
     *        lowest value for order is performed first. The forward action must be performed last.
     */

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * <p>
     * The order for the action. This value is required for rules with multiple actions. The action with the lowest
     * value for order is performed first. The forward action must be performed last.
     * </p>
     * 
     * @return The order for the action. This value is required for rules with multiple actions. The action with the
     *         lowest value for order is performed first. The forward action must be performed last.
     */

    public Integer getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order for the action. This value is required for rules with multiple actions. The action with the lowest
     * value for order is performed first. The forward action must be performed last.
     * </p>
     * 
     * @param order
     *        The order for the action. This value is required for rules with multiple actions. The action with the
     *        lowest value for order is performed first. The forward action must be performed last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withOrder(Integer order) {
        setOrder(order);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTargetGroupArn() != null)
            sb.append("TargetGroupArn: ").append(getTargetGroupArn()).append(",");
        if (getAuthenticateOidcConfig() != null)
            sb.append("AuthenticateOidcConfig: ").append(getAuthenticateOidcConfig()).append(",");
        if (getAuthenticateCognitoConfig() != null)
            sb.append("AuthenticateCognitoConfig: ").append(getAuthenticateCognitoConfig()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTargetGroupArn() == null ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        if (other.getAuthenticateOidcConfig() == null ^ this.getAuthenticateOidcConfig() == null)
            return false;
        if (other.getAuthenticateOidcConfig() != null && other.getAuthenticateOidcConfig().equals(this.getAuthenticateOidcConfig()) == false)
            return false;
        if (other.getAuthenticateCognitoConfig() == null ^ this.getAuthenticateCognitoConfig() == null)
            return false;
        if (other.getAuthenticateCognitoConfig() != null && other.getAuthenticateCognitoConfig().equals(this.getAuthenticateCognitoConfig()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupArn() == null) ? 0 : getTargetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getAuthenticateOidcConfig() == null) ? 0 : getAuthenticateOidcConfig().hashCode());
        hashCode = prime * hashCode + ((getAuthenticateCognitoConfig() == null) ? 0 : getAuthenticateCognitoConfig().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
