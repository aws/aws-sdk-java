/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains summary information about a reference. <code>ReferenceSummary</code> contains only one non null field
 * between the URL and attachment based on the reference type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReferenceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * </p>
     */
    private UrlReference url;
    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
     * </p>
     */
    private AttachmentReference attachment;
    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>STRING</code>. Otherwise, null.
     * </p>
     */
    private StringReference string;
    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>NUMBER</code>. Otherwise, null.
     * </p>
     */
    private NumberReference number;
    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>DATE</code>. Otherwise, null.
     * </p>
     */
    private DateReference date;
    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>EMAIL</code>. Otherwise, null.
     * </p>
     */
    private EmailReference email;

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * </p>
     * 
     * @param url
     *        Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     */

    public void setUrl(UrlReference url) {
        this.url = url;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * </p>
     * 
     * @return Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     */

    public UrlReference getUrl() {
        return this.url;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * </p>
     * 
     * @param url
     *        Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSummary withUrl(UrlReference url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
     * </p>
     * 
     * @param attachment
     *        Information about the reference when the <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise,
     *        null.
     */

    public void setAttachment(AttachmentReference attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
     * </p>
     * 
     * @return Information about the reference when the <code>referenceType</code> is <code>ATTACHMENT</code>.
     *         Otherwise, null.
     */

    public AttachmentReference getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
     * </p>
     * 
     * @param attachment
     *        Information about the reference when the <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise,
     *        null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSummary withAttachment(AttachmentReference attachment) {
        setAttachment(attachment);
        return this;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>STRING</code>. Otherwise, null.
     * </p>
     * 
     * @param string
     *        Information about a reference when the <code>referenceType</code> is <code>STRING</code>. Otherwise, null.
     */

    public void setString(StringReference string) {
        this.string = string;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>STRING</code>. Otherwise, null.
     * </p>
     * 
     * @return Information about a reference when the <code>referenceType</code> is <code>STRING</code>. Otherwise,
     *         null.
     */

    public StringReference getString() {
        return this.string;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>STRING</code>. Otherwise, null.
     * </p>
     * 
     * @param string
     *        Information about a reference when the <code>referenceType</code> is <code>STRING</code>. Otherwise, null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSummary withString(StringReference string) {
        setString(string);
        return this;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>NUMBER</code>. Otherwise, null.
     * </p>
     * 
     * @param number
     *        Information about a reference when the <code>referenceType</code> is <code>NUMBER</code>. Otherwise, null.
     */

    public void setNumber(NumberReference number) {
        this.number = number;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>NUMBER</code>. Otherwise, null.
     * </p>
     * 
     * @return Information about a reference when the <code>referenceType</code> is <code>NUMBER</code>. Otherwise,
     *         null.
     */

    public NumberReference getNumber() {
        return this.number;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>NUMBER</code>. Otherwise, null.
     * </p>
     * 
     * @param number
     *        Information about a reference when the <code>referenceType</code> is <code>NUMBER</code>. Otherwise, null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSummary withNumber(NumberReference number) {
        setNumber(number);
        return this;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>DATE</code>. Otherwise, null.
     * </p>
     * 
     * @param date
     *        Information about a reference when the <code>referenceType</code> is <code>DATE</code>. Otherwise, null.
     */

    public void setDate(DateReference date) {
        this.date = date;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>DATE</code>. Otherwise, null.
     * </p>
     * 
     * @return Information about a reference when the <code>referenceType</code> is <code>DATE</code>. Otherwise, null.
     */

    public DateReference getDate() {
        return this.date;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>DATE</code>. Otherwise, null.
     * </p>
     * 
     * @param date
     *        Information about a reference when the <code>referenceType</code> is <code>DATE</code>. Otherwise, null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSummary withDate(DateReference date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>EMAIL</code>. Otherwise, null.
     * </p>
     * 
     * @param email
     *        Information about a reference when the <code>referenceType</code> is <code>EMAIL</code>. Otherwise, null.
     */

    public void setEmail(EmailReference email) {
        this.email = email;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>EMAIL</code>. Otherwise, null.
     * </p>
     * 
     * @return Information about a reference when the <code>referenceType</code> is <code>EMAIL</code>. Otherwise, null.
     */

    public EmailReference getEmail() {
        return this.email;
    }

    /**
     * <p>
     * Information about a reference when the <code>referenceType</code> is <code>EMAIL</code>. Otherwise, null.
     * </p>
     * 
     * @param email
     *        Information about a reference when the <code>referenceType</code> is <code>EMAIL</code>. Otherwise, null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSummary withEmail(EmailReference email) {
        setEmail(email);
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getString() != null)
            sb.append("String: ").append(getString()).append(",");
        if (getNumber() != null)
            sb.append("Number: ").append(getNumber()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceSummary == false)
            return false;
        ReferenceSummary other = (ReferenceSummary) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getString() == null ^ this.getString() == null)
            return false;
        if (other.getString() != null && other.getString().equals(this.getString()) == false)
            return false;
        if (other.getNumber() == null ^ this.getNumber() == null)
            return false;
        if (other.getNumber() != null && other.getNumber().equals(this.getNumber()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getString() == null) ? 0 : getString().hashCode());
        hashCode = prime * hashCode + ((getNumber() == null) ? 0 : getNumber().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceSummary clone() {
        try {
            return (ReferenceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ReferenceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
