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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The conditions. Each condition specifies a field name and a single value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern. A path pattern is
     * case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can
     * include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<RuleCondition> conditions;
    /**
     * <p>
     * The rule priority. A listener can't have multiple rules with the same priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The actions. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * <p>
     * If the action type is <code>forward</code>, you specify a target group. The protocol of the target group must be
     * HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or TLS for a Network
     * Load Balancer.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-oidc</code>, you authenticate users through an
     * identity provider that is OpenID Connect (OIDC) compliant.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-cognito</code>, you authenticate users through the
     * user pools supported by Amazon Cognito.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>redirect</code>, you redirect specified client requests
     * from one URL to another.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>fixed-response</code>, you drop specified client requests
     * and return a custom HTTP response.
     * </p>
     */
    private java.util.List<Action> actions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerArn(String listenerArn) {
        this.listenerArn = listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerArn() {
        return this.listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The conditions. Each condition specifies a field name and a single value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern. A path pattern is
     * case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can
     * include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The conditions. Each condition specifies a field name and a single value.</p>
     *         <p>
     *         If the field name is <code>host-header</code>, you can specify a single host name (for example,
     *         my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *         any of the following characters. You can include up to three wildcard characters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A-Z, a-z, 0-9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         - .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (matches 0 or more characters)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ? (matches exactly 1 character)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the field name is <code>path-pattern</code>, you can specify a single path pattern. A path pattern is
     *         case-sensitive, can be up to 128 characters in length, and can contain any of the following characters.
     *         You can include up to three wildcard characters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A-Z, a-z, 0-9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         _ - . $ / ~ " ' @ : +
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         &amp; (using &amp;amp;)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (matches 0 or more characters)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ? (matches exactly 1 character)
     *         </p>
     *         </li>
     */

    public java.util.List<RuleCondition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * The conditions. Each condition specifies a field name and a single value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern. A path pattern is
     * case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can
     * include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @param conditions
     *        The conditions. Each condition specifies a field name and a single value.</p>
     *        <p>
     *        If the field name is <code>host-header</code>, you can specify a single host name (for example,
     *        my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *        any of the following characters. You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        - .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the field name is <code>path-pattern</code>, you can specify a single path pattern. A path pattern is
     *        case-sensitive, can be up to 128 characters in length, and can contain any of the following characters.
     *        You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     */

    public void setConditions(java.util.Collection<RuleCondition> conditions) {
        if (conditions == null) {
            this.conditions = null;
            return;
        }

        this.conditions = new java.util.ArrayList<RuleCondition>(conditions);
    }

    /**
     * <p>
     * The conditions. Each condition specifies a field name and a single value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern. A path pattern is
     * case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can
     * include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        The conditions. Each condition specifies a field name and a single value.</p>
     *        <p>
     *        If the field name is <code>host-header</code>, you can specify a single host name (for example,
     *        my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *        any of the following characters. You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        - .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the field name is <code>path-pattern</code>, you can specify a single path pattern. A path pattern is
     *        case-sensitive, can be up to 128 characters in length, and can contain any of the following characters.
     *        You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withConditions(RuleCondition... conditions) {
        if (this.conditions == null) {
            setConditions(new java.util.ArrayList<RuleCondition>(conditions.length));
        }
        for (RuleCondition ele : conditions) {
            this.conditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The conditions. Each condition specifies a field name and a single value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern. A path pattern is
     * case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can
     * include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @param conditions
     *        The conditions. Each condition specifies a field name and a single value.</p>
     *        <p>
     *        If the field name is <code>host-header</code>, you can specify a single host name (for example,
     *        my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *        any of the following characters. You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        - .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the field name is <code>path-pattern</code>, you can specify a single path pattern. A path pattern is
     *        case-sensitive, can be up to 128 characters in length, and can contain any of the following characters.
     *        You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withConditions(java.util.Collection<RuleCondition> conditions) {
        setConditions(conditions);
        return this;
    }

    /**
     * <p>
     * The rule priority. A listener can't have multiple rules with the same priority.
     * </p>
     * 
     * @param priority
     *        The rule priority. A listener can't have multiple rules with the same priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The rule priority. A listener can't have multiple rules with the same priority.
     * </p>
     * 
     * @return The rule priority. A listener can't have multiple rules with the same priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The rule priority. A listener can't have multiple rules with the same priority.
     * </p>
     * 
     * @param priority
     *        The rule priority. A listener can't have multiple rules with the same priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The actions. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * <p>
     * If the action type is <code>forward</code>, you specify a target group. The protocol of the target group must be
     * HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or TLS for a Network
     * Load Balancer.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-oidc</code>, you authenticate users through an
     * identity provider that is OpenID Connect (OIDC) compliant.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-cognito</code>, you authenticate users through the
     * user pools supported by Amazon Cognito.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>redirect</code>, you redirect specified client requests
     * from one URL to another.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>fixed-response</code>, you drop specified client requests
     * and return a custom HTTP response.
     * </p>
     * 
     * @return The actions. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     *         <code>fixed-response</code>, or <code>redirect</code>.</p>
     *         <p>
     *         If the action type is <code>forward</code>, you specify a target group. The protocol of the target group
     *         must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or
     *         TLS for a Network Load Balancer.
     *         </p>
     *         <p>
     *         [HTTPS listeners] If the action type is <code>authenticate-oidc</code>, you authenticate users through an
     *         identity provider that is OpenID Connect (OIDC) compliant.
     *         </p>
     *         <p>
     *         [HTTPS listeners] If the action type is <code>authenticate-cognito</code>, you authenticate users through
     *         the user pools supported by Amazon Cognito.
     *         </p>
     *         <p>
     *         [Application Load Balancer] If the action type is <code>redirect</code>, you redirect specified client
     *         requests from one URL to another.
     *         </p>
     *         <p>
     *         [Application Load Balancer] If the action type is <code>fixed-response</code>, you drop specified client
     *         requests and return a custom HTTP response.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * <p>
     * If the action type is <code>forward</code>, you specify a target group. The protocol of the target group must be
     * HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or TLS for a Network
     * Load Balancer.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-oidc</code>, you authenticate users through an
     * identity provider that is OpenID Connect (OIDC) compliant.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-cognito</code>, you authenticate users through the
     * user pools supported by Amazon Cognito.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>redirect</code>, you redirect specified client requests
     * from one URL to another.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>fixed-response</code>, you drop specified client requests
     * and return a custom HTTP response.
     * </p>
     * 
     * @param actions
     *        The actions. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     *        <code>fixed-response</code>, or <code>redirect</code>.</p>
     *        <p>
     *        If the action type is <code>forward</code>, you specify a target group. The protocol of the target group
     *        must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or
     *        TLS for a Network Load Balancer.
     *        </p>
     *        <p>
     *        [HTTPS listeners] If the action type is <code>authenticate-oidc</code>, you authenticate users through an
     *        identity provider that is OpenID Connect (OIDC) compliant.
     *        </p>
     *        <p>
     *        [HTTPS listeners] If the action type is <code>authenticate-cognito</code>, you authenticate users through
     *        the user pools supported by Amazon Cognito.
     *        </p>
     *        <p>
     *        [Application Load Balancer] If the action type is <code>redirect</code>, you redirect specified client
     *        requests from one URL to another.
     *        </p>
     *        <p>
     *        [Application Load Balancer] If the action type is <code>fixed-response</code>, you drop specified client
     *        requests and return a custom HTTP response.
     */

    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<Action>(actions);
    }

    /**
     * <p>
     * The actions. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * <p>
     * If the action type is <code>forward</code>, you specify a target group. The protocol of the target group must be
     * HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or TLS for a Network
     * Load Balancer.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-oidc</code>, you authenticate users through an
     * identity provider that is OpenID Connect (OIDC) compliant.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-cognito</code>, you authenticate users through the
     * user pools supported by Amazon Cognito.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>redirect</code>, you redirect specified client requests
     * from one URL to another.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>fixed-response</code>, you drop specified client requests
     * and return a custom HTTP response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     *        <code>fixed-response</code>, or <code>redirect</code>.</p>
     *        <p>
     *        If the action type is <code>forward</code>, you specify a target group. The protocol of the target group
     *        must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or
     *        TLS for a Network Load Balancer.
     *        </p>
     *        <p>
     *        [HTTPS listeners] If the action type is <code>authenticate-oidc</code>, you authenticate users through an
     *        identity provider that is OpenID Connect (OIDC) compliant.
     *        </p>
     *        <p>
     *        [HTTPS listeners] If the action type is <code>authenticate-cognito</code>, you authenticate users through
     *        the user pools supported by Amazon Cognito.
     *        </p>
     *        <p>
     *        [Application Load Balancer] If the action type is <code>redirect</code>, you redirect specified client
     *        requests from one URL to another.
     *        </p>
     *        <p>
     *        [Application Load Balancer] If the action type is <code>fixed-response</code>, you drop specified client
     *        requests and return a custom HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withActions(Action... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<Action>(actions.length));
        }
        for (Action ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     * <code>fixed-response</code>, or <code>redirect</code>.
     * </p>
     * <p>
     * If the action type is <code>forward</code>, you specify a target group. The protocol of the target group must be
     * HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or TLS for a Network
     * Load Balancer.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-oidc</code>, you authenticate users through an
     * identity provider that is OpenID Connect (OIDC) compliant.
     * </p>
     * <p>
     * [HTTPS listeners] If the action type is <code>authenticate-cognito</code>, you authenticate users through the
     * user pools supported by Amazon Cognito.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>redirect</code>, you redirect specified client requests
     * from one URL to another.
     * </p>
     * <p>
     * [Application Load Balancer] If the action type is <code>fixed-response</code>, you drop specified client requests
     * and return a custom HTTP response.
     * </p>
     * 
     * @param actions
     *        The actions. Each rule must include exactly one of the following types of actions: <code>forward</code>,
     *        <code>fixed-response</code>, or <code>redirect</code>.</p>
     *        <p>
     *        If the action type is <code>forward</code>, you specify a target group. The protocol of the target group
     *        must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or
     *        TLS for a Network Load Balancer.
     *        </p>
     *        <p>
     *        [HTTPS listeners] If the action type is <code>authenticate-oidc</code>, you authenticate users through an
     *        identity provider that is OpenID Connect (OIDC) compliant.
     *        </p>
     *        <p>
     *        [HTTPS listeners] If the action type is <code>authenticate-cognito</code>, you authenticate users through
     *        the user pools supported by Amazon Cognito.
     *        </p>
     *        <p>
     *        [Application Load Balancer] If the action type is <code>redirect</code>, you redirect specified client
     *        requests from one URL to another.
     *        </p>
     *        <p>
     *        [Application Load Balancer] If the action type is <code>fixed-response</code>, you drop specified client
     *        requests and return a custom HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withActions(java.util.Collection<Action> actions) {
        setActions(actions);
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
        if (getListenerArn() != null)
            sb.append("ListenerArn: ").append(getListenerArn()).append(",");
        if (getConditions() != null)
            sb.append("Conditions: ").append(getConditions()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleRequest == false)
            return false;
        CreateRuleRequest other = (CreateRuleRequest) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleRequest clone() {
        return (CreateRuleRequest) super.clone();
    }

}
