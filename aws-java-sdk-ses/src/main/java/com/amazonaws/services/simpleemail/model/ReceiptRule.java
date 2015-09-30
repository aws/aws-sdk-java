/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Receipt rules enable you to specify which actions Amazon SES should
 * take when it receives mail on behalf of one or more email addresses or
 * domains that you own.
 * </p>
 * <p>
 * Each receipt rule defines a set of email addresses or domains to which
 * it applies. If the email addresses or domains match at least one
 * recipient address of the message, Amazon SES executes all of the
 * receipt rule's actions on the message.
 * </p>
 * <p>
 * For information about setting up receipt rules, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 */
public class ReceiptRule implements Serializable, Cloneable {

    /**
     * The name of the receipt rule. The name must: <ul> <li>Contain only
     * ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_),
     * or dashes (-).</li> <li>Start and end with a letter or number.</li>
     * <li>Contain less than 64 characters.</li> </ul>
     */
    private String name;

    /**
     * If <code>true</code>, the receipt rule is active. The default value is
     * true.
     */
    private Boolean enabled;

    /**
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     * will bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     */
    private String tlsPolicy;

    /**
     * The recipient domains and email addresses to which the receipt rule
     * applies. If this field is not specified, this rule will match all
     * recipients under all verified domains.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> recipients;

    /**
     * An ordered list of actions to perform on messages that match at least
     * one of the recipient email addresses or domains specified in the
     * receipt rule.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptAction> actions;

    /**
     * If <code>true</code>, then messages to which this receipt rule applies
     * are scanned for spam and viruses. The default value is
     * <code>true</code>.
     */
    private Boolean scanEnabled;

    /**
     * The name of the receipt rule. The name must: <ul> <li>Contain only
     * ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_),
     * or dashes (-).</li> <li>Start and end with a letter or number.</li>
     * <li>Contain less than 64 characters.</li> </ul>
     *
     * @return The name of the receipt rule. The name must: <ul> <li>Contain only
     *         ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_),
     *         or dashes (-).</li> <li>Start and end with a letter or number.</li>
     *         <li>Contain less than 64 characters.</li> </ul>
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the receipt rule. The name must: <ul> <li>Contain only
     * ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_),
     * or dashes (-).</li> <li>Start and end with a letter or number.</li>
     * <li>Contain less than 64 characters.</li> </ul>
     *
     * @param name The name of the receipt rule. The name must: <ul> <li>Contain only
     *         ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_),
     *         or dashes (-).</li> <li>Start and end with a letter or number.</li>
     *         <li>Contain less than 64 characters.</li> </ul>
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the receipt rule. The name must: <ul> <li>Contain only
     * ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_),
     * or dashes (-).</li> <li>Start and end with a letter or number.</li>
     * <li>Contain less than 64 characters.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the receipt rule. The name must: <ul> <li>Contain only
     *         ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_),
     *         or dashes (-).</li> <li>Start and end with a letter or number.</li>
     *         <li>Contain less than 64 characters.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * If <code>true</code>, the receipt rule is active. The default value is
     * true.
     *
     * @return If <code>true</code>, the receipt rule is active. The default value is
     *         true.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * If <code>true</code>, the receipt rule is active. The default value is
     * true.
     *
     * @param enabled If <code>true</code>, the receipt rule is active. The default value is
     *         true.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * If <code>true</code>, the receipt rule is active. The default value is
     * true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled If <code>true</code>, the receipt rule is active. The default value is
     *         true.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptRule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * If <code>true</code>, the receipt rule is active. The default value is
     * true.
     *
     * @return If <code>true</code>, the receipt rule is active. The default value is
     *         true.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     * will bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @return Specifies whether Amazon SES should require that incoming email is
     *         delivered over a connection encrypted with Transport Layer Security
     *         (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     *         will bounce emails that are not received over TLS. The default is
     *         <code>Optional</code>.
     *
     * @see TlsPolicy
     */
    public String getTlsPolicy() {
        return tlsPolicy;
    }
    
    /**
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     * will bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy Specifies whether Amazon SES should require that incoming email is
     *         delivered over a connection encrypted with Transport Layer Security
     *         (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     *         will bounce emails that are not received over TLS. The default is
     *         <code>Optional</code>.
     *
     * @see TlsPolicy
     */
    public void setTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
    }
    
    /**
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     * will bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy Specifies whether Amazon SES should require that incoming email is
     *         delivered over a connection encrypted with Transport Layer Security
     *         (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     *         will bounce emails that are not received over TLS. The default is
     *         <code>Optional</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TlsPolicy
     */
    public ReceiptRule withTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
        return this;
    }

    /**
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     * will bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy Specifies whether Amazon SES should require that incoming email is
     *         delivered over a connection encrypted with Transport Layer Security
     *         (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     *         will bounce emails that are not received over TLS. The default is
     *         <code>Optional</code>.
     *
     * @see TlsPolicy
     */
    public void setTlsPolicy(TlsPolicy tlsPolicy) {
        this.tlsPolicy = tlsPolicy.toString();
    }
    
    /**
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     * will bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy Specifies whether Amazon SES should require that incoming email is
     *         delivered over a connection encrypted with Transport Layer Security
     *         (TLS). If this parameter is set to <code>Require</code>, Amazon SES
     *         will bounce emails that are not received over TLS. The default is
     *         <code>Optional</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TlsPolicy
     */
    public ReceiptRule withTlsPolicy(TlsPolicy tlsPolicy) {
        this.tlsPolicy = tlsPolicy.toString();
        return this;
    }

    /**
     * The recipient domains and email addresses to which the receipt rule
     * applies. If this field is not specified, this rule will match all
     * recipients under all verified domains.
     *
     * @return The recipient domains and email addresses to which the receipt rule
     *         applies. If this field is not specified, this rule will match all
     *         recipients under all verified domains.
     */
    public java.util.List<String> getRecipients() {
        if (recipients == null) {
              recipients = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              recipients.setAutoConstruct(true);
        }
        return recipients;
    }
    
    /**
     * The recipient domains and email addresses to which the receipt rule
     * applies. If this field is not specified, this rule will match all
     * recipients under all verified domains.
     *
     * @param recipients The recipient domains and email addresses to which the receipt rule
     *         applies. If this field is not specified, this rule will match all
     *         recipients under all verified domains.
     */
    public void setRecipients(java.util.Collection<String> recipients) {
        if (recipients == null) {
            this.recipients = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> recipientsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(recipients.size());
        recipientsCopy.addAll(recipients);
        this.recipients = recipientsCopy;
    }
    
    /**
     * The recipient domains and email addresses to which the receipt rule
     * applies. If this field is not specified, this rule will match all
     * recipients under all verified domains.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRecipients(java.util.Collection)} or {@link
     * #withRecipients(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recipients The recipient domains and email addresses to which the receipt rule
     *         applies. If this field is not specified, this rule will match all
     *         recipients under all verified domains.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptRule withRecipients(String... recipients) {
        if (getRecipients() == null) setRecipients(new java.util.ArrayList<String>(recipients.length));
        for (String value : recipients) {
            getRecipients().add(value);
        }
        return this;
    }
    
    /**
     * The recipient domains and email addresses to which the receipt rule
     * applies. If this field is not specified, this rule will match all
     * recipients under all verified domains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recipients The recipient domains and email addresses to which the receipt rule
     *         applies. If this field is not specified, this rule will match all
     *         recipients under all verified domains.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptRule withRecipients(java.util.Collection<String> recipients) {
        if (recipients == null) {
            this.recipients = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> recipientsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(recipients.size());
            recipientsCopy.addAll(recipients);
            this.recipients = recipientsCopy;
        }

        return this;
    }

    /**
     * An ordered list of actions to perform on messages that match at least
     * one of the recipient email addresses or domains specified in the
     * receipt rule.
     *
     * @return An ordered list of actions to perform on messages that match at least
     *         one of the recipient email addresses or domains specified in the
     *         receipt rule.
     */
    public java.util.List<ReceiptAction> getActions() {
        if (actions == null) {
              actions = new com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptAction>();
              actions.setAutoConstruct(true);
        }
        return actions;
    }
    
    /**
     * An ordered list of actions to perform on messages that match at least
     * one of the recipient email addresses or domains specified in the
     * receipt rule.
     *
     * @param actions An ordered list of actions to perform on messages that match at least
     *         one of the recipient email addresses or domains specified in the
     *         receipt rule.
     */
    public void setActions(java.util.Collection<ReceiptAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptAction> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptAction>(actions.size());
        actionsCopy.addAll(actions);
        this.actions = actionsCopy;
    }
    
    /**
     * An ordered list of actions to perform on messages that match at least
     * one of the recipient email addresses or domains specified in the
     * receipt rule.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setActions(java.util.Collection)} or {@link
     * #withActions(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions An ordered list of actions to perform on messages that match at least
     *         one of the recipient email addresses or domains specified in the
     *         receipt rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptRule withActions(ReceiptAction... actions) {
        if (getActions() == null) setActions(new java.util.ArrayList<ReceiptAction>(actions.length));
        for (ReceiptAction value : actions) {
            getActions().add(value);
        }
        return this;
    }
    
    /**
     * An ordered list of actions to perform on messages that match at least
     * one of the recipient email addresses or domains specified in the
     * receipt rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions An ordered list of actions to perform on messages that match at least
     *         one of the recipient email addresses or domains specified in the
     *         receipt rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptRule withActions(java.util.Collection<ReceiptAction> actions) {
        if (actions == null) {
            this.actions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptAction> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptAction>(actions.size());
            actionsCopy.addAll(actions);
            this.actions = actionsCopy;
        }

        return this;
    }

    /**
     * If <code>true</code>, then messages to which this receipt rule applies
     * are scanned for spam and viruses. The default value is
     * <code>true</code>.
     *
     * @return If <code>true</code>, then messages to which this receipt rule applies
     *         are scanned for spam and viruses. The default value is
     *         <code>true</code>.
     */
    public Boolean isScanEnabled() {
        return scanEnabled;
    }
    
    /**
     * If <code>true</code>, then messages to which this receipt rule applies
     * are scanned for spam and viruses. The default value is
     * <code>true</code>.
     *
     * @param scanEnabled If <code>true</code>, then messages to which this receipt rule applies
     *         are scanned for spam and viruses. The default value is
     *         <code>true</code>.
     */
    public void setScanEnabled(Boolean scanEnabled) {
        this.scanEnabled = scanEnabled;
    }
    
    /**
     * If <code>true</code>, then messages to which this receipt rule applies
     * are scanned for spam and viruses. The default value is
     * <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scanEnabled If <code>true</code>, then messages to which this receipt rule applies
     *         are scanned for spam and viruses. The default value is
     *         <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptRule withScanEnabled(Boolean scanEnabled) {
        this.scanEnabled = scanEnabled;
        return this;
    }

    /**
     * If <code>true</code>, then messages to which this receipt rule applies
     * are scanned for spam and viruses. The default value is
     * <code>true</code>.
     *
     * @return If <code>true</code>, then messages to which this receipt rule applies
     *         are scanned for spam and viruses. The default value is
     *         <code>true</code>.
     */
    public Boolean getScanEnabled() {
        return scanEnabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getTlsPolicy() != null) sb.append("TlsPolicy: " + getTlsPolicy() + ",");
        if (getRecipients() != null) sb.append("Recipients: " + getRecipients() + ",");
        if (getActions() != null) sb.append("Actions: " + getActions() + ",");
        if (isScanEnabled() != null) sb.append("ScanEnabled: " + isScanEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getTlsPolicy() == null) ? 0 : getTlsPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getRecipients() == null) ? 0 : getRecipients().hashCode()); 
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode()); 
        hashCode = prime * hashCode + ((isScanEnabled() == null) ? 0 : isScanEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReceiptRule == false) return false;
        ReceiptRule other = (ReceiptRule)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getTlsPolicy() == null ^ this.getTlsPolicy() == null) return false;
        if (other.getTlsPolicy() != null && other.getTlsPolicy().equals(this.getTlsPolicy()) == false) return false; 
        if (other.getRecipients() == null ^ this.getRecipients() == null) return false;
        if (other.getRecipients() != null && other.getRecipients().equals(this.getRecipients()) == false) return false; 
        if (other.getActions() == null ^ this.getActions() == null) return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false) return false; 
        if (other.isScanEnabled() == null ^ this.isScanEnabled() == null) return false;
        if (other.isScanEnabled() != null && other.isScanEnabled().equals(this.isScanEnabled()) == false) return false; 
        return true;
    }
    
    @Override
    public ReceiptRule clone() {
        try {
            return (ReceiptRule) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    