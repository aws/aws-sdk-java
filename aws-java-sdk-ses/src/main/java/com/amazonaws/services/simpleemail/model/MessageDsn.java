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
 * Message-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES
 * receives on your behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/MessageDsn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageDsn implements Serializable, Cloneable {

    /**
     * <p>
     * The reporting MTA that attempted to deliver the message, formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). The default value
     * is <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * </p>
     */
    private String reportingMta;
    /**
     * <p>
     * When the message was received by the reporting mail transfer agent (MTA), in <a
     * href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     * </p>
     */
    private java.util.Date arrivalDate;
    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ExtensionField> extensionFields;

    /**
     * <p>
     * The reporting MTA that attempted to deliver the message, formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). The default value
     * is <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * </p>
     * 
     * @param reportingMta
     *        The reporting MTA that attempted to deliver the message, formatted as specified in <a
     *        href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). The
     *        default value is <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     */

    public void setReportingMta(String reportingMta) {
        this.reportingMta = reportingMta;
    }

    /**
     * <p>
     * The reporting MTA that attempted to deliver the message, formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). The default value
     * is <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * </p>
     * 
     * @return The reporting MTA that attempted to deliver the message, formatted as specified in <a
     *         href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). The
     *         default value is <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     */

    public String getReportingMta() {
        return this.reportingMta;
    }

    /**
     * <p>
     * The reporting MTA that attempted to deliver the message, formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). The default value
     * is <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * </p>
     * 
     * @param reportingMta
     *        The reporting MTA that attempted to deliver the message, formatted as specified in <a
     *        href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (<code>mta-name-type; mta-name</code>). The
     *        default value is <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageDsn withReportingMta(String reportingMta) {
        setReportingMta(reportingMta);
        return this;
    }

    /**
     * <p>
     * When the message was received by the reporting mail transfer agent (MTA), in <a
     * href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     * </p>
     * 
     * @param arrivalDate
     *        When the message was received by the reporting mail transfer agent (MTA), in <a
     *        href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     */

    public void setArrivalDate(java.util.Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * <p>
     * When the message was received by the reporting mail transfer agent (MTA), in <a
     * href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     * </p>
     * 
     * @return When the message was received by the reporting mail transfer agent (MTA), in <a
     *         href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     */

    public java.util.Date getArrivalDate() {
        return this.arrivalDate;
    }

    /**
     * <p>
     * When the message was received by the reporting mail transfer agent (MTA), in <a
     * href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     * </p>
     * 
     * @param arrivalDate
     *        When the message was received by the reporting mail transfer agent (MTA), in <a
     *        href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageDsn withArrivalDate(java.util.Date arrivalDate) {
        setArrivalDate(arrivalDate);
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

    public MessageDsn withExtensionFields(ExtensionField... extensionFields) {
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

    public MessageDsn withExtensionFields(java.util.Collection<ExtensionField> extensionFields) {
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
        if (getReportingMta() != null)
            sb.append("ReportingMta: ").append(getReportingMta()).append(",");
        if (getArrivalDate() != null)
            sb.append("ArrivalDate: ").append(getArrivalDate()).append(",");
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

        if (obj instanceof MessageDsn == false)
            return false;
        MessageDsn other = (MessageDsn) obj;
        if (other.getReportingMta() == null ^ this.getReportingMta() == null)
            return false;
        if (other.getReportingMta() != null && other.getReportingMta().equals(this.getReportingMta()) == false)
            return false;
        if (other.getArrivalDate() == null ^ this.getArrivalDate() == null)
            return false;
        if (other.getArrivalDate() != null && other.getArrivalDate().equals(this.getArrivalDate()) == false)
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

        hashCode = prime * hashCode + ((getReportingMta() == null) ? 0 : getReportingMta().hashCode());
        hashCode = prime * hashCode + ((getArrivalDate() == null) ? 0 : getArrivalDate().hashCode());
        hashCode = prime * hashCode + ((getExtensionFields() == null) ? 0 : getExtensionFields().hashCode());
        return hashCode;
    }

    @Override
    public MessageDsn clone() {
        try {
            return (MessageDsn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
