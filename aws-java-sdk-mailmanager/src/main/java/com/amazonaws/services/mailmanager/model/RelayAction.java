/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action relays the email via SMTP to another specific SMTP server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RelayAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelayAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified relay has been deleted.
     * </p>
     */
    private String actionFailurePolicy;
    /**
     * <p>
     * This action specifies whether to preserve or replace original mail from address while relaying received emails to
     * a destination server.
     * </p>
     */
    private String mailFrom;
    /**
     * <p>
     * The identifier of the relay resource to be used when relaying an email.
     * </p>
     */
    private String relay;

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified relay has been deleted.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the specified relay has been deleted.
     * @see ActionFailurePolicy
     */

    public void setActionFailurePolicy(String actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified relay has been deleted.
     * </p>
     * 
     * @return A policy that states what to do in the case of failure. The action will fail if there are configuration
     *         errors. For example, the specified relay has been deleted.
     * @see ActionFailurePolicy
     */

    public String getActionFailurePolicy() {
        return this.actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified relay has been deleted.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the specified relay has been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public RelayAction withActionFailurePolicy(String actionFailurePolicy) {
        setActionFailurePolicy(actionFailurePolicy);
        return this;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified relay has been deleted.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the specified relay has been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public RelayAction withActionFailurePolicy(ActionFailurePolicy actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy.toString();
        return this;
    }

    /**
     * <p>
     * This action specifies whether to preserve or replace original mail from address while relaying received emails to
     * a destination server.
     * </p>
     * 
     * @param mailFrom
     *        This action specifies whether to preserve or replace original mail from address while relaying received
     *        emails to a destination server.
     * @see MailFrom
     */

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    /**
     * <p>
     * This action specifies whether to preserve or replace original mail from address while relaying received emails to
     * a destination server.
     * </p>
     * 
     * @return This action specifies whether to preserve or replace original mail from address while relaying received
     *         emails to a destination server.
     * @see MailFrom
     */

    public String getMailFrom() {
        return this.mailFrom;
    }

    /**
     * <p>
     * This action specifies whether to preserve or replace original mail from address while relaying received emails to
     * a destination server.
     * </p>
     * 
     * @param mailFrom
     *        This action specifies whether to preserve or replace original mail from address while relaying received
     *        emails to a destination server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailFrom
     */

    public RelayAction withMailFrom(String mailFrom) {
        setMailFrom(mailFrom);
        return this;
    }

    /**
     * <p>
     * This action specifies whether to preserve or replace original mail from address while relaying received emails to
     * a destination server.
     * </p>
     * 
     * @param mailFrom
     *        This action specifies whether to preserve or replace original mail from address while relaying received
     *        emails to a destination server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailFrom
     */

    public RelayAction withMailFrom(MailFrom mailFrom) {
        this.mailFrom = mailFrom.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the relay resource to be used when relaying an email.
     * </p>
     * 
     * @param relay
     *        The identifier of the relay resource to be used when relaying an email.
     */

    public void setRelay(String relay) {
        this.relay = relay;
    }

    /**
     * <p>
     * The identifier of the relay resource to be used when relaying an email.
     * </p>
     * 
     * @return The identifier of the relay resource to be used when relaying an email.
     */

    public String getRelay() {
        return this.relay;
    }

    /**
     * <p>
     * The identifier of the relay resource to be used when relaying an email.
     * </p>
     * 
     * @param relay
     *        The identifier of the relay resource to be used when relaying an email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelayAction withRelay(String relay) {
        setRelay(relay);
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
        if (getActionFailurePolicy() != null)
            sb.append("ActionFailurePolicy: ").append(getActionFailurePolicy()).append(",");
        if (getMailFrom() != null)
            sb.append("MailFrom: ").append(getMailFrom()).append(",");
        if (getRelay() != null)
            sb.append("Relay: ").append(getRelay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelayAction == false)
            return false;
        RelayAction other = (RelayAction) obj;
        if (other.getActionFailurePolicy() == null ^ this.getActionFailurePolicy() == null)
            return false;
        if (other.getActionFailurePolicy() != null && other.getActionFailurePolicy().equals(this.getActionFailurePolicy()) == false)
            return false;
        if (other.getMailFrom() == null ^ this.getMailFrom() == null)
            return false;
        if (other.getMailFrom() != null && other.getMailFrom().equals(this.getMailFrom()) == false)
            return false;
        if (other.getRelay() == null ^ this.getRelay() == null)
            return false;
        if (other.getRelay() != null && other.getRelay().equals(this.getRelay()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionFailurePolicy() == null) ? 0 : getActionFailurePolicy().hashCode());
        hashCode = prime * hashCode + ((getMailFrom() == null) ? 0 : getMailFrom().hashCode());
        hashCode = prime * hashCode + ((getRelay() == null) ? 0 : getRelay().hashCode());
        return hashCode;
    }

    @Override
    public RelayAction clone() {
        try {
            return (RelayAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RelayActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
