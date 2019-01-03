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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetRiskConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetRiskConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The app client ID. If <code>ClientId</code> is null, then the risk configuration is mapped to
     * <code>userPoolId</code>. When the client ID is null, the same risk configuration is applied to all the clients in
     * the userPool.
     * </p>
     * <p>
     * Otherwise, <code>ClientId</code> is mapped to the client. When the client ID is not null, the user pool
     * configuration is overridden and the risk configuration for the client is used instead.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The compromised credentials risk configuration.
     * </p>
     */
    private CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration;
    /**
     * <p>
     * The account takeover risk configuration.
     * </p>
     */
    private AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration;
    /**
     * <p>
     * The configuration to override the risk decision.
     * </p>
     */
    private RiskExceptionConfigurationType riskExceptionConfiguration;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRiskConfigurationRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The app client ID. If <code>ClientId</code> is null, then the risk configuration is mapped to
     * <code>userPoolId</code>. When the client ID is null, the same risk configuration is applied to all the clients in
     * the userPool.
     * </p>
     * <p>
     * Otherwise, <code>ClientId</code> is mapped to the client. When the client ID is not null, the user pool
     * configuration is overridden and the risk configuration for the client is used instead.
     * </p>
     * 
     * @param clientId
     *        The app client ID. If <code>ClientId</code> is null, then the risk configuration is mapped to
     *        <code>userPoolId</code>. When the client ID is null, the same risk configuration is applied to all the
     *        clients in the userPool.</p>
     *        <p>
     *        Otherwise, <code>ClientId</code> is mapped to the client. When the client ID is not null, the user pool
     *        configuration is overridden and the risk configuration for the client is used instead.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID. If <code>ClientId</code> is null, then the risk configuration is mapped to
     * <code>userPoolId</code>. When the client ID is null, the same risk configuration is applied to all the clients in
     * the userPool.
     * </p>
     * <p>
     * Otherwise, <code>ClientId</code> is mapped to the client. When the client ID is not null, the user pool
     * configuration is overridden and the risk configuration for the client is used instead.
     * </p>
     * 
     * @return The app client ID. If <code>ClientId</code> is null, then the risk configuration is mapped to
     *         <code>userPoolId</code>. When the client ID is null, the same risk configuration is applied to all the
     *         clients in the userPool.</p>
     *         <p>
     *         Otherwise, <code>ClientId</code> is mapped to the client. When the client ID is not null, the user pool
     *         configuration is overridden and the risk configuration for the client is used instead.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The app client ID. If <code>ClientId</code> is null, then the risk configuration is mapped to
     * <code>userPoolId</code>. When the client ID is null, the same risk configuration is applied to all the clients in
     * the userPool.
     * </p>
     * <p>
     * Otherwise, <code>ClientId</code> is mapped to the client. When the client ID is not null, the user pool
     * configuration is overridden and the risk configuration for the client is used instead.
     * </p>
     * 
     * @param clientId
     *        The app client ID. If <code>ClientId</code> is null, then the risk configuration is mapped to
     *        <code>userPoolId</code>. When the client ID is null, the same risk configuration is applied to all the
     *        clients in the userPool.</p>
     *        <p>
     *        Otherwise, <code>ClientId</code> is mapped to the client. When the client ID is not null, the user pool
     *        configuration is overridden and the risk configuration for the client is used instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRiskConfigurationRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The compromised credentials risk configuration.
     * </p>
     * 
     * @param compromisedCredentialsRiskConfiguration
     *        The compromised credentials risk configuration.
     */

    public void setCompromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration) {
        this.compromisedCredentialsRiskConfiguration = compromisedCredentialsRiskConfiguration;
    }

    /**
     * <p>
     * The compromised credentials risk configuration.
     * </p>
     * 
     * @return The compromised credentials risk configuration.
     */

    public CompromisedCredentialsRiskConfigurationType getCompromisedCredentialsRiskConfiguration() {
        return this.compromisedCredentialsRiskConfiguration;
    }

    /**
     * <p>
     * The compromised credentials risk configuration.
     * </p>
     * 
     * @param compromisedCredentialsRiskConfiguration
     *        The compromised credentials risk configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRiskConfigurationRequest withCompromisedCredentialsRiskConfiguration(
            CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration) {
        setCompromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration);
        return this;
    }

    /**
     * <p>
     * The account takeover risk configuration.
     * </p>
     * 
     * @param accountTakeoverRiskConfiguration
     *        The account takeover risk configuration.
     */

    public void setAccountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration) {
        this.accountTakeoverRiskConfiguration = accountTakeoverRiskConfiguration;
    }

    /**
     * <p>
     * The account takeover risk configuration.
     * </p>
     * 
     * @return The account takeover risk configuration.
     */

    public AccountTakeoverRiskConfigurationType getAccountTakeoverRiskConfiguration() {
        return this.accountTakeoverRiskConfiguration;
    }

    /**
     * <p>
     * The account takeover risk configuration.
     * </p>
     * 
     * @param accountTakeoverRiskConfiguration
     *        The account takeover risk configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRiskConfigurationRequest withAccountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration) {
        setAccountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration to override the risk decision.
     * </p>
     * 
     * @param riskExceptionConfiguration
     *        The configuration to override the risk decision.
     */

    public void setRiskExceptionConfiguration(RiskExceptionConfigurationType riskExceptionConfiguration) {
        this.riskExceptionConfiguration = riskExceptionConfiguration;
    }

    /**
     * <p>
     * The configuration to override the risk decision.
     * </p>
     * 
     * @return The configuration to override the risk decision.
     */

    public RiskExceptionConfigurationType getRiskExceptionConfiguration() {
        return this.riskExceptionConfiguration;
    }

    /**
     * <p>
     * The configuration to override the risk decision.
     * </p>
     * 
     * @param riskExceptionConfiguration
     *        The configuration to override the risk decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRiskConfigurationRequest withRiskExceptionConfiguration(RiskExceptionConfigurationType riskExceptionConfiguration) {
        setRiskExceptionConfiguration(riskExceptionConfiguration);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append("***Sensitive Data Redacted***").append(",");
        if (getCompromisedCredentialsRiskConfiguration() != null)
            sb.append("CompromisedCredentialsRiskConfiguration: ").append(getCompromisedCredentialsRiskConfiguration()).append(",");
        if (getAccountTakeoverRiskConfiguration() != null)
            sb.append("AccountTakeoverRiskConfiguration: ").append(getAccountTakeoverRiskConfiguration()).append(",");
        if (getRiskExceptionConfiguration() != null)
            sb.append("RiskExceptionConfiguration: ").append(getRiskExceptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetRiskConfigurationRequest == false)
            return false;
        SetRiskConfigurationRequest other = (SetRiskConfigurationRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getCompromisedCredentialsRiskConfiguration() == null ^ this.getCompromisedCredentialsRiskConfiguration() == null)
            return false;
        if (other.getCompromisedCredentialsRiskConfiguration() != null
                && other.getCompromisedCredentialsRiskConfiguration().equals(this.getCompromisedCredentialsRiskConfiguration()) == false)
            return false;
        if (other.getAccountTakeoverRiskConfiguration() == null ^ this.getAccountTakeoverRiskConfiguration() == null)
            return false;
        if (other.getAccountTakeoverRiskConfiguration() != null
                && other.getAccountTakeoverRiskConfiguration().equals(this.getAccountTakeoverRiskConfiguration()) == false)
            return false;
        if (other.getRiskExceptionConfiguration() == null ^ this.getRiskExceptionConfiguration() == null)
            return false;
        if (other.getRiskExceptionConfiguration() != null && other.getRiskExceptionConfiguration().equals(this.getRiskExceptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getCompromisedCredentialsRiskConfiguration() == null) ? 0 : getCompromisedCredentialsRiskConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAccountTakeoverRiskConfiguration() == null) ? 0 : getAccountTakeoverRiskConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRiskExceptionConfiguration() == null) ? 0 : getRiskExceptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SetRiskConfigurationRequest clone() {
        return (SetRiskConfigurationRequest) super.clone();
    }

}
