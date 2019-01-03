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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The risk configuration type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RiskConfigurationType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RiskConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The app client ID.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The compromised credentials risk configuration object including the <code>EventFilter</code> and the
     * <code>EventAction</code>
     * </p>
     */
    private CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration;
    /**
     * <p>
     * The account takeover risk configuration object including the <code>NotifyConfiguration</code> object and
     * <code>Actions</code> to take in the case of an account takeover.
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
     * The last modified date.
     * </p>
     */
    private java.util.Date lastModifiedDate;

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

    public RiskConfigurationType withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @param clientId
     *        The app client ID.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @return The app client ID.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @param clientId
     *        The app client ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RiskConfigurationType withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The compromised credentials risk configuration object including the <code>EventFilter</code> and the
     * <code>EventAction</code>
     * </p>
     * 
     * @param compromisedCredentialsRiskConfiguration
     *        The compromised credentials risk configuration object including the <code>EventFilter</code> and the
     *        <code>EventAction</code>
     */

    public void setCompromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration) {
        this.compromisedCredentialsRiskConfiguration = compromisedCredentialsRiskConfiguration;
    }

    /**
     * <p>
     * The compromised credentials risk configuration object including the <code>EventFilter</code> and the
     * <code>EventAction</code>
     * </p>
     * 
     * @return The compromised credentials risk configuration object including the <code>EventFilter</code> and the
     *         <code>EventAction</code>
     */

    public CompromisedCredentialsRiskConfigurationType getCompromisedCredentialsRiskConfiguration() {
        return this.compromisedCredentialsRiskConfiguration;
    }

    /**
     * <p>
     * The compromised credentials risk configuration object including the <code>EventFilter</code> and the
     * <code>EventAction</code>
     * </p>
     * 
     * @param compromisedCredentialsRiskConfiguration
     *        The compromised credentials risk configuration object including the <code>EventFilter</code> and the
     *        <code>EventAction</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RiskConfigurationType withCompromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration) {
        setCompromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration);
        return this;
    }

    /**
     * <p>
     * The account takeover risk configuration object including the <code>NotifyConfiguration</code> object and
     * <code>Actions</code> to take in the case of an account takeover.
     * </p>
     * 
     * @param accountTakeoverRiskConfiguration
     *        The account takeover risk configuration object including the <code>NotifyConfiguration</code> object and
     *        <code>Actions</code> to take in the case of an account takeover.
     */

    public void setAccountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration) {
        this.accountTakeoverRiskConfiguration = accountTakeoverRiskConfiguration;
    }

    /**
     * <p>
     * The account takeover risk configuration object including the <code>NotifyConfiguration</code> object and
     * <code>Actions</code> to take in the case of an account takeover.
     * </p>
     * 
     * @return The account takeover risk configuration object including the <code>NotifyConfiguration</code> object and
     *         <code>Actions</code> to take in the case of an account takeover.
     */

    public AccountTakeoverRiskConfigurationType getAccountTakeoverRiskConfiguration() {
        return this.accountTakeoverRiskConfiguration;
    }

    /**
     * <p>
     * The account takeover risk configuration object including the <code>NotifyConfiguration</code> object and
     * <code>Actions</code> to take in the case of an account takeover.
     * </p>
     * 
     * @param accountTakeoverRiskConfiguration
     *        The account takeover risk configuration object including the <code>NotifyConfiguration</code> object and
     *        <code>Actions</code> to take in the case of an account takeover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RiskConfigurationType withAccountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration) {
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

    public RiskConfigurationType withRiskExceptionConfiguration(RiskExceptionConfigurationType riskExceptionConfiguration) {
        setRiskExceptionConfiguration(riskExceptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The last modified date.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date.
     * </p>
     * 
     * @return The last modified date.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RiskConfigurationType withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
            sb.append("RiskExceptionConfiguration: ").append(getRiskExceptionConfiguration()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RiskConfigurationType == false)
            return false;
        RiskConfigurationType other = (RiskConfigurationType) obj;
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
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
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
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public RiskConfigurationType clone() {
        try {
            return (RiskConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.RiskConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
