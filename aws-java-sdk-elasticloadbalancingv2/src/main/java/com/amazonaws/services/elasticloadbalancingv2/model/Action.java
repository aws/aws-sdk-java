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
     * The type of action. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is <code>forward</code>.
     * </p>
     */
    private String targetGroupArn;
    /**
     * <p>
     * [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify
     * only when <code>Type</code> is <code>authenticate-oidc</code>.
     * </p>
     */
    private AuthenticateOidcActionConfig authenticateOidcConfig;
    /**
     * <p>
     * [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when <code>Type</code>
     * is <code>authenticate-cognito</code>.
     * </p>
     */
    private AuthenticateCognitoActionConfig authenticateCognitoConfig;
    /**
     * <p>
     * The order for the action. This value is required for rules with multiple actions. The action with the lowest
     * value for order is performed first. The final action to be performed must be a <code>forward</code> or a
     * <code>fixed-response</code> action.
     * </p>
     */
    private Integer order;
    /**
     * <p>
     * [Application Load Balancer] Information for creating a redirect action. Specify only when <code>Type</code> is
     * <code>redirect</code>.
     * </p>
     */
    private RedirectActionConfig redirectConfig;
    /**
     * <p>
     * [Application Load Balancer] Information for creating an action that returns a custom HTTP response. Specify only
     * when <code>Type</code> is <code>fixed-response</code>.
     * </p>
     */
    private FixedResponseActionConfig fixedResponseConfig;

    /**
     * <p>
     * The type of action. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * 
     * @param type
     *        The type of action. Each rule must include exactly one of the following types of actions:
     *        <code>forward</code>, <code>fixed-response</code>, or <code>redirect</code>.
     * @see ActionTypeEnum
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of action. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * 
     * @return The type of action. Each rule must include exactly one of the following types of actions:
     *         <code>forward</code>, <code>fixed-response</code>, or <code>redirect</code>.
     * @see ActionTypeEnum
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of action. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * 
     * @param type
     *        The type of action. Each rule must include exactly one of the following types of actions:
     *        <code>forward</code>, <code>fixed-response</code>, or <code>redirect</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionTypeEnum
     */

    public Action withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of action. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * 
     * @param type
     *        The type of action. Each rule must include exactly one of the following types of actions:
     *        <code>forward</code>, <code>fixed-response</code>, or <code>redirect</code>.
     * @see ActionTypeEnum
     */

    public void setType(ActionTypeEnum type) {
        withType(type);
    }

    /**
     * <p>
     * The type of action. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * 
     * @param type
     *        The type of action. Each rule must include exactly one of the following types of actions:
     *        <code>forward</code>, <code>fixed-response</code>, or <code>redirect</code>.
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
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is
     *        <code>forward</code>.
     */

    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is <code>forward</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is
     *         <code>forward</code>.
     */

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is <code>forward</code>.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group. Specify only when <code>Type</code> is
     *        <code>forward</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * <p>
     * [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify
     * only when <code>Type</code> is <code>authenticate-oidc</code>.
     * </p>
     * 
     * @param authenticateOidcConfig
     *        [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC).
     *        Specify only when <code>Type</code> is <code>authenticate-oidc</code>.
     */

    public void setAuthenticateOidcConfig(AuthenticateOidcActionConfig authenticateOidcConfig) {
        this.authenticateOidcConfig = authenticateOidcConfig;
    }

    /**
     * <p>
     * [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify
     * only when <code>Type</code> is <code>authenticate-oidc</code>.
     * </p>
     * 
     * @return [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC).
     *         Specify only when <code>Type</code> is <code>authenticate-oidc</code>.
     */

    public AuthenticateOidcActionConfig getAuthenticateOidcConfig() {
        return this.authenticateOidcConfig;
    }

    /**
     * <p>
     * [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify
     * only when <code>Type</code> is <code>authenticate-oidc</code>.
     * </p>
     * 
     * @param authenticateOidcConfig
     *        [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC).
     *        Specify only when <code>Type</code> is <code>authenticate-oidc</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withAuthenticateOidcConfig(AuthenticateOidcActionConfig authenticateOidcConfig) {
        setAuthenticateOidcConfig(authenticateOidcConfig);
        return this;
    }

    /**
     * <p>
     * [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when <code>Type</code>
     * is <code>authenticate-cognito</code>.
     * </p>
     * 
     * @param authenticateCognitoConfig
     *        [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when
     *        <code>Type</code> is <code>authenticate-cognito</code>.
     */

    public void setAuthenticateCognitoConfig(AuthenticateCognitoActionConfig authenticateCognitoConfig) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
    }

    /**
     * <p>
     * [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when <code>Type</code>
     * is <code>authenticate-cognito</code>.
     * </p>
     * 
     * @return [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when
     *         <code>Type</code> is <code>authenticate-cognito</code>.
     */

    public AuthenticateCognitoActionConfig getAuthenticateCognitoConfig() {
        return this.authenticateCognitoConfig;
    }

    /**
     * <p>
     * [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when <code>Type</code>
     * is <code>authenticate-cognito</code>.
     * </p>
     * 
     * @param authenticateCognitoConfig
     *        [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when
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
     * value for order is performed first. The final action to be performed must be a <code>forward</code> or a
     * <code>fixed-response</code> action.
     * </p>
     * 
     * @param order
     *        The order for the action. This value is required for rules with multiple actions. The action with the
     *        lowest value for order is performed first. The final action to be performed must be a <code>forward</code>
     *        or a <code>fixed-response</code> action.
     */

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * <p>
     * The order for the action. This value is required for rules with multiple actions. The action with the lowest
     * value for order is performed first. The final action to be performed must be a <code>forward</code> or a
     * <code>fixed-response</code> action.
     * </p>
     * 
     * @return The order for the action. This value is required for rules with multiple actions. The action with the
     *         lowest value for order is performed first. The final action to be performed must be a
     *         <code>forward</code> or a <code>fixed-response</code> action.
     */

    public Integer getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order for the action. This value is required for rules with multiple actions. The action with the lowest
     * value for order is performed first. The final action to be performed must be a <code>forward</code> or a
     * <code>fixed-response</code> action.
     * </p>
     * 
     * @param order
     *        The order for the action. This value is required for rules with multiple actions. The action with the
     *        lowest value for order is performed first. The final action to be performed must be a <code>forward</code>
     *        or a <code>fixed-response</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withOrder(Integer order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * [Application Load Balancer] Information for creating a redirect action. Specify only when <code>Type</code> is
     * <code>redirect</code>.
     * </p>
     * 
     * @param redirectConfig
     *        [Application Load Balancer] Information for creating a redirect action. Specify only when
     *        <code>Type</code> is <code>redirect</code>.
     */

    public void setRedirectConfig(RedirectActionConfig redirectConfig) {
        this.redirectConfig = redirectConfig;
    }

    /**
     * <p>
     * [Application Load Balancer] Information for creating a redirect action. Specify only when <code>Type</code> is
     * <code>redirect</code>.
     * </p>
     * 
     * @return [Application Load Balancer] Information for creating a redirect action. Specify only when
     *         <code>Type</code> is <code>redirect</code>.
     */

    public RedirectActionConfig getRedirectConfig() {
        return this.redirectConfig;
    }

    /**
     * <p>
     * [Application Load Balancer] Information for creating a redirect action. Specify only when <code>Type</code> is
     * <code>redirect</code>.
     * </p>
     * 
     * @param redirectConfig
     *        [Application Load Balancer] Information for creating a redirect action. Specify only when
     *        <code>Type</code> is <code>redirect</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withRedirectConfig(RedirectActionConfig redirectConfig) {
        setRedirectConfig(redirectConfig);
        return this;
    }

    /**
     * <p>
     * [Application Load Balancer] Information for creating an action that returns a custom HTTP response. Specify only
     * when <code>Type</code> is <code>fixed-response</code>.
     * </p>
     * 
     * @param fixedResponseConfig
     *        [Application Load Balancer] Information for creating an action that returns a custom HTTP response.
     *        Specify only when <code>Type</code> is <code>fixed-response</code>.
     */

    public void setFixedResponseConfig(FixedResponseActionConfig fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
    }

    /**
     * <p>
     * [Application Load Balancer] Information for creating an action that returns a custom HTTP response. Specify only
     * when <code>Type</code> is <code>fixed-response</code>.
     * </p>
     * 
     * @return [Application Load Balancer] Information for creating an action that returns a custom HTTP response.
     *         Specify only when <code>Type</code> is <code>fixed-response</code>.
     */

    public FixedResponseActionConfig getFixedResponseConfig() {
        return this.fixedResponseConfig;
    }

    /**
     * <p>
     * [Application Load Balancer] Information for creating an action that returns a custom HTTP response. Specify only
     * when <code>Type</code> is <code>fixed-response</code>.
     * </p>
     * 
     * @param fixedResponseConfig
     *        [Application Load Balancer] Information for creating an action that returns a custom HTTP response.
     *        Specify only when <code>Type</code> is <code>fixed-response</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withFixedResponseConfig(FixedResponseActionConfig fixedResponseConfig) {
        setFixedResponseConfig(fixedResponseConfig);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTargetGroupArn() != null)
            sb.append("TargetGroupArn: ").append(getTargetGroupArn()).append(",");
        if (getAuthenticateOidcConfig() != null)
            sb.append("AuthenticateOidcConfig: ").append(getAuthenticateOidcConfig()).append(",");
        if (getAuthenticateCognitoConfig() != null)
            sb.append("AuthenticateCognitoConfig: ").append(getAuthenticateCognitoConfig()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getRedirectConfig() != null)
            sb.append("RedirectConfig: ").append(getRedirectConfig()).append(",");
        if (getFixedResponseConfig() != null)
            sb.append("FixedResponseConfig: ").append(getFixedResponseConfig());
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
        if (other.getRedirectConfig() == null ^ this.getRedirectConfig() == null)
            return false;
        if (other.getRedirectConfig() != null && other.getRedirectConfig().equals(this.getRedirectConfig()) == false)
            return false;
        if (other.getFixedResponseConfig() == null ^ this.getFixedResponseConfig() == null)
            return false;
        if (other.getFixedResponseConfig() != null && other.getFixedResponseConfig().equals(this.getFixedResponseConfig()) == false)
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
        hashCode = prime * hashCode + ((getRedirectConfig() == null) ? 0 : getRedirectConfig().hashCode());
        hashCode = prime * hashCode + ((getFixedResponseConfig() == null) ? 0 : getFixedResponseConfig().hashCode());
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
