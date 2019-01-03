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
 * Recipient-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES
 * receives on your behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/RecipientDsnFields" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecipientDsnFields implements Serializable, Cloneable {

    /**
     * <p>
     * The email address that the message was ultimately delivered to. This corresponds to the
     * <code>Final-Recipient</code> in the DSN. If not specified, <code>FinalRecipient</code> will be set to the
     * <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code> structure. Either
     * <code>FinalRecipient</code> or the recipient in <code>BouncedRecipientInfo</code> must be a recipient of the
     * original bounced message.
     * </p>
     * <note>
     * <p>
     * Do not prepend the <code>FinalRecipient</code> email address with <code>rfc 822;</code>, as described in <a
     * href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     * </p>
     * </note>
     */
    private String finalRecipient;
    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message
     * to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The MTA to which the remote MTA attempted to deliver the message, formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). This parameter
     * typically applies only to propagating synchronous bounces.
     * </p>
     */
    private String remoteMta;
    /**
     * <p>
     * The status code that indicates what went wrong. This is required by <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An extended explanation of what went wrong; this is usually an SMTP response. See <a
     * href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for the correct formatting of this parameter.
     * </p>
     */
    private String diagnosticCode;
    /**
     * <p>
     * The time the final delivery attempt was made, in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     * date-time format.
     * </p>
     */
    private java.util.Date lastAttemptDate;
    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ExtensionField> extensionFields;

    /**
     * <p>
     * The email address that the message was ultimately delivered to. This corresponds to the
     * <code>Final-Recipient</code> in the DSN. If not specified, <code>FinalRecipient</code> will be set to the
     * <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code> structure. Either
     * <code>FinalRecipient</code> or the recipient in <code>BouncedRecipientInfo</code> must be a recipient of the
     * original bounced message.
     * </p>
     * <note>
     * <p>
     * Do not prepend the <code>FinalRecipient</code> email address with <code>rfc 822;</code>, as described in <a
     * href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     * </p>
     * </note>
     * 
     * @param finalRecipient
     *        The email address that the message was ultimately delivered to. This corresponds to the
     *        <code>Final-Recipient</code> in the DSN. If not specified, <code>FinalRecipient</code> will be set to the
     *        <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code> structure. Either
     *        <code>FinalRecipient</code> or the recipient in <code>BouncedRecipientInfo</code> must be a recipient of
     *        the original bounced message.</p> <note>
     *        <p>
     *        Do not prepend the <code>FinalRecipient</code> email address with <code>rfc 822;</code>, as described in
     *        <a href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     *        </p>
     */

    public void setFinalRecipient(String finalRecipient) {
        this.finalRecipient = finalRecipient;
    }

    /**
     * <p>
     * The email address that the message was ultimately delivered to. This corresponds to the
     * <code>Final-Recipient</code> in the DSN. If not specified, <code>FinalRecipient</code> will be set to the
     * <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code> structure. Either
     * <code>FinalRecipient</code> or the recipient in <code>BouncedRecipientInfo</code> must be a recipient of the
     * original bounced message.
     * </p>
     * <note>
     * <p>
     * Do not prepend the <code>FinalRecipient</code> email address with <code>rfc 822;</code>, as described in <a
     * href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     * </p>
     * </note>
     * 
     * @return The email address that the message was ultimately delivered to. This corresponds to the
     *         <code>Final-Recipient</code> in the DSN. If not specified, <code>FinalRecipient</code> will be set to the
     *         <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code> structure. Either
     *         <code>FinalRecipient</code> or the recipient in <code>BouncedRecipientInfo</code> must be a recipient of
     *         the original bounced message.</p> <note>
     *         <p>
     *         Do not prepend the <code>FinalRecipient</code> email address with <code>rfc 822;</code>, as described in
     *         <a href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     *         </p>
     */

    public String getFinalRecipient() {
        return this.finalRecipient;
    }

    /**
     * <p>
     * The email address that the message was ultimately delivered to. This corresponds to the
     * <code>Final-Recipient</code> in the DSN. If not specified, <code>FinalRecipient</code> will be set to the
     * <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code> structure. Either
     * <code>FinalRecipient</code> or the recipient in <code>BouncedRecipientInfo</code> must be a recipient of the
     * original bounced message.
     * </p>
     * <note>
     * <p>
     * Do not prepend the <code>FinalRecipient</code> email address with <code>rfc 822;</code>, as described in <a
     * href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     * </p>
     * </note>
     * 
     * @param finalRecipient
     *        The email address that the message was ultimately delivered to. This corresponds to the
     *        <code>Final-Recipient</code> in the DSN. If not specified, <code>FinalRecipient</code> will be set to the
     *        <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code> structure. Either
     *        <code>FinalRecipient</code> or the recipient in <code>BouncedRecipientInfo</code> must be a recipient of
     *        the original bounced message.</p> <note>
     *        <p>
     *        Do not prepend the <code>FinalRecipient</code> email address with <code>rfc 822;</code>, as described in
     *        <a href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipientDsnFields withFinalRecipient(String finalRecipient) {
        setFinalRecipient(finalRecipient);
        return this;
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message
     * to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     * 
     * @param action
     *        The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the
     *        message to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     *        3464</a>.
     * @see DsnAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message
     * to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     * 
     * @return The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the
     *         message to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     *         3464</a>.
     * @see DsnAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message
     * to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     * 
     * @param action
     *        The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the
     *        message to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     *        3464</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DsnAction
     */

    public RecipientDsnFields withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message
     * to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     * 
     * @param action
     *        The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the
     *        message to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     *        3464</a>.
     * @see DsnAction
     */

    public void setAction(DsnAction action) {
        withAction(action);
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message
     * to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     * 
     * @param action
     *        The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the
     *        message to the recipient address. This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     *        3464</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DsnAction
     */

    public RecipientDsnFields withAction(DsnAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The MTA to which the remote MTA attempted to deliver the message, formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). This parameter
     * typically applies only to propagating synchronous bounces.
     * </p>
     * 
     * @param remoteMta
     *        The MTA to which the remote MTA attempted to deliver the message, formatted as specified in <a
     *        href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). This
     *        parameter typically applies only to propagating synchronous bounces.
     */

    public void setRemoteMta(String remoteMta) {
        this.remoteMta = remoteMta;
    }

    /**
     * <p>
     * The MTA to which the remote MTA attempted to deliver the message, formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). This parameter
     * typically applies only to propagating synchronous bounces.
     * </p>
     * 
     * @return The MTA to which the remote MTA attempted to deliver the message, formatted as specified in <a
     *         href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). This
     *         parameter typically applies only to propagating synchronous bounces.
     */

    public String getRemoteMta() {
        return this.remoteMta;
    }

    /**
     * <p>
     * The MTA to which the remote MTA attempted to deliver the message, formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). This parameter
     * typically applies only to propagating synchronous bounces.
     * </p>
     * 
     * @param remoteMta
     *        The MTA to which the remote MTA attempted to deliver the message, formatted as specified in <a
     *        href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). This
     *        parameter typically applies only to propagating synchronous bounces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipientDsnFields withRemoteMta(String remoteMta) {
        setRemoteMta(remoteMta);
        return this;
    }

    /**
     * <p>
     * The status code that indicates what went wrong. This is required by <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     * 
     * @param status
     *        The status code that indicates what went wrong. This is required by <a
     *        href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status code that indicates what went wrong. This is required by <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     * 
     * @return The status code that indicates what went wrong. This is required by <a
     *         href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status code that indicates what went wrong. This is required by <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     * 
     * @param status
     *        The status code that indicates what went wrong. This is required by <a
     *        href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipientDsnFields withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An extended explanation of what went wrong; this is usually an SMTP response. See <a
     * href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for the correct formatting of this parameter.
     * </p>
     * 
     * @param diagnosticCode
     *        An extended explanation of what went wrong; this is usually an SMTP response. See <a
     *        href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for the correct formatting of this parameter.
     */

    public void setDiagnosticCode(String diagnosticCode) {
        this.diagnosticCode = diagnosticCode;
    }

    /**
     * <p>
     * An extended explanation of what went wrong; this is usually an SMTP response. See <a
     * href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for the correct formatting of this parameter.
     * </p>
     * 
     * @return An extended explanation of what went wrong; this is usually an SMTP response. See <a
     *         href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for the correct formatting of this parameter.
     */

    public String getDiagnosticCode() {
        return this.diagnosticCode;
    }

    /**
     * <p>
     * An extended explanation of what went wrong; this is usually an SMTP response. See <a
     * href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for the correct formatting of this parameter.
     * </p>
     * 
     * @param diagnosticCode
     *        An extended explanation of what went wrong; this is usually an SMTP response. See <a
     *        href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for the correct formatting of this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipientDsnFields withDiagnosticCode(String diagnosticCode) {
        setDiagnosticCode(diagnosticCode);
        return this;
    }

    /**
     * <p>
     * The time the final delivery attempt was made, in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     * date-time format.
     * </p>
     * 
     * @param lastAttemptDate
     *        The time the final delivery attempt was made, in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC
     *        822</a> date-time format.
     */

    public void setLastAttemptDate(java.util.Date lastAttemptDate) {
        this.lastAttemptDate = lastAttemptDate;
    }

    /**
     * <p>
     * The time the final delivery attempt was made, in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     * date-time format.
     * </p>
     * 
     * @return The time the final delivery attempt was made, in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC
     *         822</a> date-time format.
     */

    public java.util.Date getLastAttemptDate() {
        return this.lastAttemptDate;
    }

    /**
     * <p>
     * The time the final delivery attempt was made, in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     * date-time format.
     * </p>
     * 
     * @param lastAttemptDate
     *        The time the final delivery attempt was made, in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC
     *        822</a> date-time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipientDsnFields withLastAttemptDate(java.util.Date lastAttemptDate) {
        setLastAttemptDate(lastAttemptDate);
        return this;
    }

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     * 
     * @return Additional X-headers to include in the DSN.
     */

    public java.util.List<ExtensionField> getExtensionFields() {
        if (extensionFields == null) {
            extensionFields = new com.amazonaws.internal.SdkInternalList<ExtensionField>();
        }
        return extensionFields;
    }

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     * 
     * @param extensionFields
     *        Additional X-headers to include in the DSN.
     */

    public void setExtensionFields(java.util.Collection<ExtensionField> extensionFields) {
        if (extensionFields == null) {
            this.extensionFields = null;
            return;
        }

        this.extensionFields = new com.amazonaws.internal.SdkInternalList<ExtensionField>(extensionFields);
    }

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtensionFields(java.util.Collection)} or {@link #withExtensionFields(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param extensionFields
     *        Additional X-headers to include in the DSN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipientDsnFields withExtensionFields(ExtensionField... extensionFields) {
        if (this.extensionFields == null) {
            setExtensionFields(new com.amazonaws.internal.SdkInternalList<ExtensionField>(extensionFields.length));
        }
        for (ExtensionField ele : extensionFields) {
            this.extensionFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     * 
     * @param extensionFields
     *        Additional X-headers to include in the DSN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipientDsnFields withExtensionFields(java.util.Collection<ExtensionField> extensionFields) {
        setExtensionFields(extensionFields);
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
        if (getFinalRecipient() != null)
            sb.append("FinalRecipient: ").append(getFinalRecipient()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getRemoteMta() != null)
            sb.append("RemoteMta: ").append(getRemoteMta()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDiagnosticCode() != null)
            sb.append("DiagnosticCode: ").append(getDiagnosticCode()).append(",");
        if (getLastAttemptDate() != null)
            sb.append("LastAttemptDate: ").append(getLastAttemptDate()).append(",");
        if (getExtensionFields() != null)
            sb.append("ExtensionFields: ").append(getExtensionFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecipientDsnFields == false)
            return false;
        RecipientDsnFields other = (RecipientDsnFields) obj;
        if (other.getFinalRecipient() == null ^ this.getFinalRecipient() == null)
            return false;
        if (other.getFinalRecipient() != null && other.getFinalRecipient().equals(this.getFinalRecipient()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRemoteMta() == null ^ this.getRemoteMta() == null)
            return false;
        if (other.getRemoteMta() != null && other.getRemoteMta().equals(this.getRemoteMta()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDiagnosticCode() == null ^ this.getDiagnosticCode() == null)
            return false;
        if (other.getDiagnosticCode() != null && other.getDiagnosticCode().equals(this.getDiagnosticCode()) == false)
            return false;
        if (other.getLastAttemptDate() == null ^ this.getLastAttemptDate() == null)
            return false;
        if (other.getLastAttemptDate() != null && other.getLastAttemptDate().equals(this.getLastAttemptDate()) == false)
            return false;
        if (other.getExtensionFields() == null ^ this.getExtensionFields() == null)
            return false;
        if (other.getExtensionFields() != null && other.getExtensionFields().equals(this.getExtensionFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFinalRecipient() == null) ? 0 : getFinalRecipient().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRemoteMta() == null) ? 0 : getRemoteMta().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDiagnosticCode() == null) ? 0 : getDiagnosticCode().hashCode());
        hashCode = prime * hashCode + ((getLastAttemptDate() == null) ? 0 : getLastAttemptDate().hashCode());
        hashCode = prime * hashCode + ((getExtensionFields() == null) ? 0 : getExtensionFields().hashCode());
        return hashCode;
    }

    @Override
    public RecipientDsnFields clone() {
        try {
            return (RecipientDsnFields) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
