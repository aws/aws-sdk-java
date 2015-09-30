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
 * Message-related information to include in the Delivery Status
 * Notification (DSN) when an email that Amazon SES receives on your
 * behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 */
public class MessageDsn implements Serializable, Cloneable {

    /**
     * The reporting MTA that attempted to deliver the message, formatted as
     * specified in <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a> (<code>mta-name-type; mta-name</code>). The default value is
     * <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     */
    private String reportingMta;

    /**
     * When the message was received by the reporting mail transfer agent
     * (MTA), in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     * date-time format.
     */
    private java.util.Date arrivalDate;

    /**
     * Additional X-headers to include in the DSN.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ExtensionField> extensionFields;

    /**
     * The reporting MTA that attempted to deliver the message, formatted as
     * specified in <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a> (<code>mta-name-type; mta-name</code>). The default value is
     * <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     *
     * @return The reporting MTA that attempted to deliver the message, formatted as
     *         specified in <a href="https://tools.ietf.org/html/rfc3464">RFC
     *         3464</a> (<code>mta-name-type; mta-name</code>). The default value is
     *         <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     */
    public String getReportingMta() {
        return reportingMta;
    }
    
    /**
     * The reporting MTA that attempted to deliver the message, formatted as
     * specified in <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a> (<code>mta-name-type; mta-name</code>). The default value is
     * <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     *
     * @param reportingMta The reporting MTA that attempted to deliver the message, formatted as
     *         specified in <a href="https://tools.ietf.org/html/rfc3464">RFC
     *         3464</a> (<code>mta-name-type; mta-name</code>). The default value is
     *         <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     */
    public void setReportingMta(String reportingMta) {
        this.reportingMta = reportingMta;
    }
    
    /**
     * The reporting MTA that attempted to deliver the message, formatted as
     * specified in <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a> (<code>mta-name-type; mta-name</code>). The default value is
     * <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reportingMta The reporting MTA that attempted to deliver the message, formatted as
     *         specified in <a href="https://tools.ietf.org/html/rfc3464">RFC
     *         3464</a> (<code>mta-name-type; mta-name</code>). The default value is
     *         <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MessageDsn withReportingMta(String reportingMta) {
        this.reportingMta = reportingMta;
        return this;
    }

    /**
     * When the message was received by the reporting mail transfer agent
     * (MTA), in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     * date-time format.
     *
     * @return When the message was received by the reporting mail transfer agent
     *         (MTA), in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     *         date-time format.
     */
    public java.util.Date getArrivalDate() {
        return arrivalDate;
    }
    
    /**
     * When the message was received by the reporting mail transfer agent
     * (MTA), in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     * date-time format.
     *
     * @param arrivalDate When the message was received by the reporting mail transfer agent
     *         (MTA), in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     *         date-time format.
     */
    public void setArrivalDate(java.util.Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    
    /**
     * When the message was received by the reporting mail transfer agent
     * (MTA), in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     * date-time format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arrivalDate When the message was received by the reporting mail transfer agent
     *         (MTA), in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     *         date-time format.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MessageDsn withArrivalDate(java.util.Date arrivalDate) {
        this.arrivalDate = arrivalDate;
        return this;
    }

    /**
     * Additional X-headers to include in the DSN.
     *
     * @return Additional X-headers to include in the DSN.
     */
    public java.util.List<ExtensionField> getExtensionFields() {
        if (extensionFields == null) {
              extensionFields = new com.amazonaws.internal.ListWithAutoConstructFlag<ExtensionField>();
              extensionFields.setAutoConstruct(true);
        }
        return extensionFields;
    }
    
    /**
     * Additional X-headers to include in the DSN.
     *
     * @param extensionFields Additional X-headers to include in the DSN.
     */
    public void setExtensionFields(java.util.Collection<ExtensionField> extensionFields) {
        if (extensionFields == null) {
            this.extensionFields = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ExtensionField> extensionFieldsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ExtensionField>(extensionFields.size());
        extensionFieldsCopy.addAll(extensionFields);
        this.extensionFields = extensionFieldsCopy;
    }
    
    /**
     * Additional X-headers to include in the DSN.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setExtensionFields(java.util.Collection)} or {@link
     * #withExtensionFields(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param extensionFields Additional X-headers to include in the DSN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MessageDsn withExtensionFields(ExtensionField... extensionFields) {
        if (getExtensionFields() == null) setExtensionFields(new java.util.ArrayList<ExtensionField>(extensionFields.length));
        for (ExtensionField value : extensionFields) {
            getExtensionFields().add(value);
        }
        return this;
    }
    
    /**
     * Additional X-headers to include in the DSN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param extensionFields Additional X-headers to include in the DSN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MessageDsn withExtensionFields(java.util.Collection<ExtensionField> extensionFields) {
        if (extensionFields == null) {
            this.extensionFields = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ExtensionField> extensionFieldsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ExtensionField>(extensionFields.size());
            extensionFieldsCopy.addAll(extensionFields);
            this.extensionFields = extensionFieldsCopy;
        }

        return this;
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
        if (getReportingMta() != null) sb.append("ReportingMta: " + getReportingMta() + ",");
        if (getArrivalDate() != null) sb.append("ArrivalDate: " + getArrivalDate() + ",");
        if (getExtensionFields() != null) sb.append("ExtensionFields: " + getExtensionFields() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MessageDsn == false) return false;
        MessageDsn other = (MessageDsn)obj;
        
        if (other.getReportingMta() == null ^ this.getReportingMta() == null) return false;
        if (other.getReportingMta() != null && other.getReportingMta().equals(this.getReportingMta()) == false) return false; 
        if (other.getArrivalDate() == null ^ this.getArrivalDate() == null) return false;
        if (other.getArrivalDate() != null && other.getArrivalDate().equals(this.getArrivalDate()) == false) return false; 
        if (other.getExtensionFields() == null ^ this.getExtensionFields() == null) return false;
        if (other.getExtensionFields() != null && other.getExtensionFields().equals(this.getExtensionFields()) == false) return false; 
        return true;
    }
    
    @Override
    public MessageDsn clone() {
        try {
            return (MessageDsn) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    