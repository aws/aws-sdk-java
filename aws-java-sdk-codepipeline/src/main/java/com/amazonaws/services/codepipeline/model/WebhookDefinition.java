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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about a webhook and its definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/WebhookDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebhookDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the webhook.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the pipeline you want to connect to the webhook.
     * </p>
     */
    private String targetPipeline;
    /**
     * <p>
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source
     * (first) stage of the pipeline.
     * </p>
     */
    private String targetAction;
    /**
     * <p>
     * A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules must
     * pass for the request to be accepted and the pipeline started.
     * </p>
     */
    private java.util.List<WebhookFilterRule> filters;
    /**
     * <p>
     * Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GITHUB_HMAC implements the authentication scheme described here: https://developer.github.com/webhooks/securing/
     * </p>
     * </li>
     * <li>
     * <p>
     * IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted in the
     * authentication configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.
     * </p>
     * </li>
     * </ul>
     */
    private String authentication;
    /**
     * <p>
     * Properties that configure the authentication applied to incoming webhook trigger requests. The required
     * properties depend on the authentication type. For GITHUB_HMAC, only the SecretToken property must be set. For IP,
     * only the AllowedIPRange property must be set to a valid CIDR range. For UNAUTHENTICATED, no properties can be
     * set.
     * </p>
     */
    private WebhookAuthConfiguration authenticationConfiguration;

    /**
     * <p>
     * The name of the webhook.
     * </p>
     * 
     * @param name
     *        The name of the webhook.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the webhook.
     * </p>
     * 
     * @return The name of the webhook.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the webhook.
     * </p>
     * 
     * @param name
     *        The name of the webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the pipeline you want to connect to the webhook.
     * </p>
     * 
     * @param targetPipeline
     *        The name of the pipeline you want to connect to the webhook.
     */

    public void setTargetPipeline(String targetPipeline) {
        this.targetPipeline = targetPipeline;
    }

    /**
     * <p>
     * The name of the pipeline you want to connect to the webhook.
     * </p>
     * 
     * @return The name of the pipeline you want to connect to the webhook.
     */

    public String getTargetPipeline() {
        return this.targetPipeline;
    }

    /**
     * <p>
     * The name of the pipeline you want to connect to the webhook.
     * </p>
     * 
     * @param targetPipeline
     *        The name of the pipeline you want to connect to the webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookDefinition withTargetPipeline(String targetPipeline) {
        setTargetPipeline(targetPipeline);
        return this;
    }

    /**
     * <p>
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source
     * (first) stage of the pipeline.
     * </p>
     * 
     * @param targetAction
     *        The name of the action in a pipeline you want to connect to the webhook. The action must be from the
     *        source (first) stage of the pipeline.
     */

    public void setTargetAction(String targetAction) {
        this.targetAction = targetAction;
    }

    /**
     * <p>
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source
     * (first) stage of the pipeline.
     * </p>
     * 
     * @return The name of the action in a pipeline you want to connect to the webhook. The action must be from the
     *         source (first) stage of the pipeline.
     */

    public String getTargetAction() {
        return this.targetAction;
    }

    /**
     * <p>
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source
     * (first) stage of the pipeline.
     * </p>
     * 
     * @param targetAction
     *        The name of the action in a pipeline you want to connect to the webhook. The action must be from the
     *        source (first) stage of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookDefinition withTargetAction(String targetAction) {
        setTargetAction(targetAction);
        return this;
    }

    /**
     * <p>
     * A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules must
     * pass for the request to be accepted and the pipeline started.
     * </p>
     * 
     * @return A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules
     *         must pass for the request to be accepted and the pipeline started.
     */

    public java.util.List<WebhookFilterRule> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules must
     * pass for the request to be accepted and the pipeline started.
     * </p>
     * 
     * @param filters
     *        A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules
     *        must pass for the request to be accepted and the pipeline started.
     */

    public void setFilters(java.util.Collection<WebhookFilterRule> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<WebhookFilterRule>(filters);
    }

    /**
     * <p>
     * A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules must
     * pass for the request to be accepted and the pipeline started.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules
     *        must pass for the request to be accepted and the pipeline started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookDefinition withFilters(WebhookFilterRule... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<WebhookFilterRule>(filters.length));
        }
        for (WebhookFilterRule ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules must
     * pass for the request to be accepted and the pipeline started.
     * </p>
     * 
     * @param filters
     *        A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules
     *        must pass for the request to be accepted and the pipeline started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookDefinition withFilters(java.util.Collection<WebhookFilterRule> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GITHUB_HMAC implements the authentication scheme described here: https://developer.github.com/webhooks/securing/
     * </p>
     * </li>
     * <li>
     * <p>
     * IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted in the
     * authentication configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authentication
     *        Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        GITHUB_HMAC implements the authentication scheme described here:
     *        https://developer.github.com/webhooks/securing/
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted
     *        in the authentication configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.
     *        </p>
     *        </li>
     * @see WebhookAuthenticationType
     */

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GITHUB_HMAC implements the authentication scheme described here: https://developer.github.com/webhooks/securing/
     * </p>
     * </li>
     * <li>
     * <p>
     * IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted in the
     * authentication configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         GITHUB_HMAC implements the authentication scheme described here:
     *         https://developer.github.com/webhooks/securing/
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted
     *         in the authentication configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.
     *         </p>
     *         </li>
     * @see WebhookAuthenticationType
     */

    public String getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GITHUB_HMAC implements the authentication scheme described here: https://developer.github.com/webhooks/securing/
     * </p>
     * </li>
     * <li>
     * <p>
     * IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted in the
     * authentication configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authentication
     *        Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        GITHUB_HMAC implements the authentication scheme described here:
     *        https://developer.github.com/webhooks/securing/
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted
     *        in the authentication configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebhookAuthenticationType
     */

    public WebhookDefinition withAuthentication(String authentication) {
        setAuthentication(authentication);
        return this;
    }

    /**
     * <p>
     * Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GITHUB_HMAC implements the authentication scheme described here: https://developer.github.com/webhooks/securing/
     * </p>
     * </li>
     * <li>
     * <p>
     * IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted in the
     * authentication configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authentication
     *        Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        GITHUB_HMAC implements the authentication scheme described here:
     *        https://developer.github.com/webhooks/securing/
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted
     *        in the authentication configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebhookAuthenticationType
     */

    public WebhookDefinition withAuthentication(WebhookAuthenticationType authentication) {
        this.authentication = authentication.toString();
        return this;
    }

    /**
     * <p>
     * Properties that configure the authentication applied to incoming webhook trigger requests. The required
     * properties depend on the authentication type. For GITHUB_HMAC, only the SecretToken property must be set. For IP,
     * only the AllowedIPRange property must be set to a valid CIDR range. For UNAUTHENTICATED, no properties can be
     * set.
     * </p>
     * 
     * @param authenticationConfiguration
     *        Properties that configure the authentication applied to incoming webhook trigger requests. The required
     *        properties depend on the authentication type. For GITHUB_HMAC, only the SecretToken property must be set.
     *        For IP, only the AllowedIPRange property must be set to a valid CIDR range. For UNAUTHENTICATED, no
     *        properties can be set.
     */

    public void setAuthenticationConfiguration(WebhookAuthConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    /**
     * <p>
     * Properties that configure the authentication applied to incoming webhook trigger requests. The required
     * properties depend on the authentication type. For GITHUB_HMAC, only the SecretToken property must be set. For IP,
     * only the AllowedIPRange property must be set to a valid CIDR range. For UNAUTHENTICATED, no properties can be
     * set.
     * </p>
     * 
     * @return Properties that configure the authentication applied to incoming webhook trigger requests. The required
     *         properties depend on the authentication type. For GITHUB_HMAC, only the SecretToken property must be set.
     *         For IP, only the AllowedIPRange property must be set to a valid CIDR range. For UNAUTHENTICATED, no
     *         properties can be set.
     */

    public WebhookAuthConfiguration getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }

    /**
     * <p>
     * Properties that configure the authentication applied to incoming webhook trigger requests. The required
     * properties depend on the authentication type. For GITHUB_HMAC, only the SecretToken property must be set. For IP,
     * only the AllowedIPRange property must be set to a valid CIDR range. For UNAUTHENTICATED, no properties can be
     * set.
     * </p>
     * 
     * @param authenticationConfiguration
     *        Properties that configure the authentication applied to incoming webhook trigger requests. The required
     *        properties depend on the authentication type. For GITHUB_HMAC, only the SecretToken property must be set.
     *        For IP, only the AllowedIPRange property must be set to a valid CIDR range. For UNAUTHENTICATED, no
     *        properties can be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookDefinition withAuthenticationConfiguration(WebhookAuthConfiguration authenticationConfiguration) {
        setAuthenticationConfiguration(authenticationConfiguration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTargetPipeline() != null)
            sb.append("TargetPipeline: ").append(getTargetPipeline()).append(",");
        if (getTargetAction() != null)
            sb.append("TargetAction: ").append(getTargetAction()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
        if (getAuthenticationConfiguration() != null)
            sb.append("AuthenticationConfiguration: ").append(getAuthenticationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebhookDefinition == false)
            return false;
        WebhookDefinition other = (WebhookDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTargetPipeline() == null ^ this.getTargetPipeline() == null)
            return false;
        if (other.getTargetPipeline() != null && other.getTargetPipeline().equals(this.getTargetPipeline()) == false)
            return false;
        if (other.getTargetAction() == null ^ this.getTargetAction() == null)
            return false;
        if (other.getTargetAction() != null && other.getTargetAction().equals(this.getTargetAction()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getAuthenticationConfiguration() == null ^ this.getAuthenticationConfiguration() == null)
            return false;
        if (other.getAuthenticationConfiguration() != null && other.getAuthenticationConfiguration().equals(this.getAuthenticationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTargetPipeline() == null) ? 0 : getTargetPipeline().hashCode());
        hashCode = prime * hashCode + ((getTargetAction() == null) ? 0 : getTargetAction().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationConfiguration() == null) ? 0 : getAuthenticationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public WebhookDefinition clone() {
        try {
            return (WebhookDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.WebhookDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
