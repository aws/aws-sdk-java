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
 * Configuration for mitigation actions and notification for different levels of risk detected for a potential account
 * takeover.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AccountTakeoverRiskConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountTakeoverRiskConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The notify configuration used to construct email notifications.
     * </p>
     */
    private NotifyConfigurationType notifyConfiguration;
    /**
     * <p>
     * Account takeover risk configuration actions
     * </p>
     */
    private AccountTakeoverActionsType actions;

    /**
     * <p>
     * The notify configuration used to construct email notifications.
     * </p>
     * 
     * @param notifyConfiguration
     *        The notify configuration used to construct email notifications.
     */

    public void setNotifyConfiguration(NotifyConfigurationType notifyConfiguration) {
        this.notifyConfiguration = notifyConfiguration;
    }

    /**
     * <p>
     * The notify configuration used to construct email notifications.
     * </p>
     * 
     * @return The notify configuration used to construct email notifications.
     */

    public NotifyConfigurationType getNotifyConfiguration() {
        return this.notifyConfiguration;
    }

    /**
     * <p>
     * The notify configuration used to construct email notifications.
     * </p>
     * 
     * @param notifyConfiguration
     *        The notify configuration used to construct email notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountTakeoverRiskConfigurationType withNotifyConfiguration(NotifyConfigurationType notifyConfiguration) {
        setNotifyConfiguration(notifyConfiguration);
        return this;
    }

    /**
     * <p>
     * Account takeover risk configuration actions
     * </p>
     * 
     * @param actions
     *        Account takeover risk configuration actions
     */

    public void setActions(AccountTakeoverActionsType actions) {
        this.actions = actions;
    }

    /**
     * <p>
     * Account takeover risk configuration actions
     * </p>
     * 
     * @return Account takeover risk configuration actions
     */

    public AccountTakeoverActionsType getActions() {
        return this.actions;
    }

    /**
     * <p>
     * Account takeover risk configuration actions
     * </p>
     * 
     * @param actions
     *        Account takeover risk configuration actions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountTakeoverRiskConfigurationType withActions(AccountTakeoverActionsType actions) {
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
        if (getNotifyConfiguration() != null)
            sb.append("NotifyConfiguration: ").append(getNotifyConfiguration()).append(",");
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

        if (obj instanceof AccountTakeoverRiskConfigurationType == false)
            return false;
        AccountTakeoverRiskConfigurationType other = (AccountTakeoverRiskConfigurationType) obj;
        if (other.getNotifyConfiguration() == null ^ this.getNotifyConfiguration() == null)
            return false;
        if (other.getNotifyConfiguration() != null && other.getNotifyConfiguration().equals(this.getNotifyConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getNotifyConfiguration() == null) ? 0 : getNotifyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public AccountTakeoverRiskConfigurationType clone() {
        try {
            return (AccountTakeoverRiskConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.AccountTakeoverRiskConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
