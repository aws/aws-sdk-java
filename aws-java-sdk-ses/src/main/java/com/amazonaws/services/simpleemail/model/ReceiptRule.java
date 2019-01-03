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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Receipt rules enable you to specify which actions Amazon SES should take when it receives mail on behalf of one or
 * more email addresses or domains that you own.
 * </p>
 * <p>
 * Each receipt rule defines a set of email addresses or domains that it applies to. If the email addresses or domains
 * match at least one recipient address of the message, Amazon SES executes all of the receipt rule's actions on the
 * message.
 * </p>
 * <p>
 * For information about setting up receipt rules, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ReceiptRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReceiptRule implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the receipt rule. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is <code>false</code>.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with
     * Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will bounce emails
     * that are not received over TLS. The default is <code>Optional</code>.
     * </p>
     */
    private String tlsPolicy;
    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies to. If this field is not specified, this
     * rule will match all recipients under all verified domains.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> recipients;
    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one of the recipient email addresses or
     * domains specified in the receipt rule.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReceiptAction> actions;
    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are scanned for spam and viruses. The
     * default value is <code>false</code>.
     * </p>
     */
    private Boolean scanEnabled;

    /**
     * <p>
     * The name of the receipt rule. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the receipt rule. The name must:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start and end with a letter or number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contain less than 64 characters.
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the receipt rule. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the receipt rule. The name must:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start and end with a letter or number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain less than 64 characters.
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the receipt rule. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the receipt rule. The name must:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start and end with a letter or number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contain less than 64 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is <code>false</code>.
     * </p>
     * 
     * @param enabled
     *        If <code>true</code>, the receipt rule is active. The default value is <code>false</code>.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is <code>false</code>.
     * </p>
     * 
     * @return If <code>true</code>, the receipt rule is active. The default value is <code>false</code>.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is <code>false</code>.
     * </p>
     * 
     * @param enabled
     *        If <code>true</code>, the receipt rule is active. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptRule withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is <code>false</code>.
     * </p>
     * 
     * @return If <code>true</code>, the receipt rule is active. The default value is <code>false</code>.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with
     * Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will bounce emails
     * that are not received over TLS. The default is <code>Optional</code>.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted
     *        with Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     *        bounce emails that are not received over TLS. The default is <code>Optional</code>.
     * @see TlsPolicy
     */

    public void setTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with
     * Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will bounce emails
     * that are not received over TLS. The default is <code>Optional</code>.
     * </p>
     * 
     * @return Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted
     *         with Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     *         bounce emails that are not received over TLS. The default is <code>Optional</code>.
     * @see TlsPolicy
     */

    public String getTlsPolicy() {
        return this.tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with
     * Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will bounce emails
     * that are not received over TLS. The default is <code>Optional</code>.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted
     *        with Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     *        bounce emails that are not received over TLS. The default is <code>Optional</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsPolicy
     */

    public ReceiptRule withTlsPolicy(String tlsPolicy) {
        setTlsPolicy(tlsPolicy);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with
     * Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will bounce emails
     * that are not received over TLS. The default is <code>Optional</code>.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted
     *        with Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     *        bounce emails that are not received over TLS. The default is <code>Optional</code>.
     * @see TlsPolicy
     */

    public void setTlsPolicy(TlsPolicy tlsPolicy) {
        withTlsPolicy(tlsPolicy);
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with
     * Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will bounce emails
     * that are not received over TLS. The default is <code>Optional</code>.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted
     *        with Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     *        bounce emails that are not received over TLS. The default is <code>Optional</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsPolicy
     */

    public ReceiptRule withTlsPolicy(TlsPolicy tlsPolicy) {
        this.tlsPolicy = tlsPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies to. If this field is not specified, this
     * rule will match all recipients under all verified domains.
     * </p>
     * 
     * @return The recipient domains and email addresses that the receipt rule applies to. If this field is not
     *         specified, this rule will match all recipients under all verified domains.
     */

    public java.util.List<String> getRecipients() {
        if (recipients == null) {
            recipients = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return recipients;
    }

    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies to. If this field is not specified, this
     * rule will match all recipients under all verified domains.
     * </p>
     * 
     * @param recipients
     *        The recipient domains and email addresses that the receipt rule applies to. If this field is not
     *        specified, this rule will match all recipients under all verified domains.
     */

    public void setRecipients(java.util.Collection<String> recipients) {
        if (recipients == null) {
            this.recipients = null;
            return;
        }

        this.recipients = new com.amazonaws.internal.SdkInternalList<String>(recipients);
    }

    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies to. If this field is not specified, this
     * rule will match all recipients under all verified domains.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecipients(java.util.Collection)} or {@link #withRecipients(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recipients
     *        The recipient domains and email addresses that the receipt rule applies to. If this field is not
     *        specified, this rule will match all recipients under all verified domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptRule withRecipients(String... recipients) {
        if (this.recipients == null) {
            setRecipients(new com.amazonaws.internal.SdkInternalList<String>(recipients.length));
        }
        for (String ele : recipients) {
            this.recipients.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies to. If this field is not specified, this
     * rule will match all recipients under all verified domains.
     * </p>
     * 
     * @param recipients
     *        The recipient domains and email addresses that the receipt rule applies to. If this field is not
     *        specified, this rule will match all recipients under all verified domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptRule withRecipients(java.util.Collection<String> recipients) {
        setRecipients(recipients);
        return this;
    }

    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one of the recipient email addresses or
     * domains specified in the receipt rule.
     * </p>
     * 
     * @return An ordered list of actions to perform on messages that match at least one of the recipient email
     *         addresses or domains specified in the receipt rule.
     */

    public java.util.List<ReceiptAction> getActions() {
        if (actions == null) {
            actions = new com.amazonaws.internal.SdkInternalList<ReceiptAction>();
        }
        return actions;
    }

    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one of the recipient email addresses or
     * domains specified in the receipt rule.
     * </p>
     * 
     * @param actions
     *        An ordered list of actions to perform on messages that match at least one of the recipient email addresses
     *        or domains specified in the receipt rule.
     */

    public void setActions(java.util.Collection<ReceiptAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new com.amazonaws.internal.SdkInternalList<ReceiptAction>(actions);
    }

    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one of the recipient email addresses or
     * domains specified in the receipt rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        An ordered list of actions to perform on messages that match at least one of the recipient email addresses
     *        or domains specified in the receipt rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptRule withActions(ReceiptAction... actions) {
        if (this.actions == null) {
            setActions(new com.amazonaws.internal.SdkInternalList<ReceiptAction>(actions.length));
        }
        for (ReceiptAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one of the recipient email addresses or
     * domains specified in the receipt rule.
     * </p>
     * 
     * @param actions
     *        An ordered list of actions to perform on messages that match at least one of the recipient email addresses
     *        or domains specified in the receipt rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptRule withActions(java.util.Collection<ReceiptAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are scanned for spam and viruses. The
     * default value is <code>false</code>.
     * </p>
     * 
     * @param scanEnabled
     *        If <code>true</code>, then messages that this receipt rule applies to are scanned for spam and viruses.
     *        The default value is <code>false</code>.
     */

    public void setScanEnabled(Boolean scanEnabled) {
        this.scanEnabled = scanEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are scanned for spam and viruses. The
     * default value is <code>false</code>.
     * </p>
     * 
     * @return If <code>true</code>, then messages that this receipt rule applies to are scanned for spam and viruses.
     *         The default value is <code>false</code>.
     */

    public Boolean getScanEnabled() {
        return this.scanEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are scanned for spam and viruses. The
     * default value is <code>false</code>.
     * </p>
     * 
     * @param scanEnabled
     *        If <code>true</code>, then messages that this receipt rule applies to are scanned for spam and viruses.
     *        The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptRule withScanEnabled(Boolean scanEnabled) {
        setScanEnabled(scanEnabled);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are scanned for spam and viruses. The
     * default value is <code>false</code>.
     * </p>
     * 
     * @return If <code>true</code>, then messages that this receipt rule applies to are scanned for spam and viruses.
     *         The default value is <code>false</code>.
     */

    public Boolean isScanEnabled() {
        return this.scanEnabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getTlsPolicy() != null)
            sb.append("TlsPolicy: ").append(getTlsPolicy()).append(",");
        if (getRecipients() != null)
            sb.append("Recipients: ").append(getRecipients()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getScanEnabled() != null)
            sb.append("ScanEnabled: ").append(getScanEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceiptRule == false)
            return false;
        ReceiptRule other = (ReceiptRule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getTlsPolicy() == null ^ this.getTlsPolicy() == null)
            return false;
        if (other.getTlsPolicy() != null && other.getTlsPolicy().equals(this.getTlsPolicy()) == false)
            return false;
        if (other.getRecipients() == null ^ this.getRecipients() == null)
            return false;
        if (other.getRecipients() != null && other.getRecipients().equals(this.getRecipients()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getScanEnabled() == null ^ this.getScanEnabled() == null)
            return false;
        if (other.getScanEnabled() != null && other.getScanEnabled().equals(this.getScanEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getTlsPolicy() == null) ? 0 : getTlsPolicy().hashCode());
        hashCode = prime * hashCode + ((getRecipients() == null) ? 0 : getRecipients().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getScanEnabled() == null) ? 0 : getScanEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ReceiptRule clone() {
        try {
            return (ReceiptRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
