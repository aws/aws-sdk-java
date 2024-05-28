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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the content and "From" address for an email message that's sent to recipients of a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignEmailMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignEmailMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The body of the email for recipients whose email clients don't render HTML content.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The verified email address to send the email from. The default address is the FromAddress specified for the email
     * channel for the application.
     * </p>
     */
    private String fromAddress;
    /**
     * <p>
     * The list of <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-campaigns-campaign-id.html#apps-application-id-campaigns-campaign-id-model-messageheader"
     * >MessageHeaders</a> for the email. You can have up to 15 MessageHeaders for each email.
     * </p>
     */
    private java.util.List<MessageHeader> headers;
    /**
     * <p>
     * The body of the email, in HTML format, for recipients whose email clients render HTML content.
     * </p>
     */
    private String htmlBody;
    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The body of the email for recipients whose email clients don't render HTML content.
     * </p>
     * 
     * @param body
     *        The body of the email for recipients whose email clients don't render HTML content.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the email for recipients whose email clients don't render HTML content.
     * </p>
     * 
     * @return The body of the email for recipients whose email clients don't render HTML content.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the email for recipients whose email clients don't render HTML content.
     * </p>
     * 
     * @param body
     *        The body of the email for recipients whose email clients don't render HTML content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEmailMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The verified email address to send the email from. The default address is the FromAddress specified for the email
     * channel for the application.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address to send the email from. The default address is the FromAddress specified for
     *        the email channel for the application.
     */

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email from. The default address is the FromAddress specified for the email
     * channel for the application.
     * </p>
     * 
     * @return The verified email address to send the email from. The default address is the FromAddress specified for
     *         the email channel for the application.
     */

    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email from. The default address is the FromAddress specified for the email
     * channel for the application.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address to send the email from. The default address is the FromAddress specified for
     *        the email channel for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEmailMessage withFromAddress(String fromAddress) {
        setFromAddress(fromAddress);
        return this;
    }

    /**
     * <p>
     * The list of <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-campaigns-campaign-id.html#apps-application-id-campaigns-campaign-id-model-messageheader"
     * >MessageHeaders</a> for the email. You can have up to 15 MessageHeaders for each email.
     * </p>
     * 
     * @return The list of <a href=
     *         "https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-campaigns-campaign-id.html#apps-application-id-campaigns-campaign-id-model-messageheader"
     *         >MessageHeaders</a> for the email. You can have up to 15 MessageHeaders for each email.
     */

    public java.util.List<MessageHeader> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * The list of <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-campaigns-campaign-id.html#apps-application-id-campaigns-campaign-id-model-messageheader"
     * >MessageHeaders</a> for the email. You can have up to 15 MessageHeaders for each email.
     * </p>
     * 
     * @param headers
     *        The list of <a href=
     *        "https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-campaigns-campaign-id.html#apps-application-id-campaigns-campaign-id-model-messageheader"
     *        >MessageHeaders</a> for the email. You can have up to 15 MessageHeaders for each email.
     */

    public void setHeaders(java.util.Collection<MessageHeader> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<MessageHeader>(headers);
    }

    /**
     * <p>
     * The list of <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-campaigns-campaign-id.html#apps-application-id-campaigns-campaign-id-model-messageheader"
     * >MessageHeaders</a> for the email. You can have up to 15 MessageHeaders for each email.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaders(java.util.Collection)} or {@link #withHeaders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param headers
     *        The list of <a href=
     *        "https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-campaigns-campaign-id.html#apps-application-id-campaigns-campaign-id-model-messageheader"
     *        >MessageHeaders</a> for the email. You can have up to 15 MessageHeaders for each email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEmailMessage withHeaders(MessageHeader... headers) {
        if (this.headers == null) {
            setHeaders(new java.util.ArrayList<MessageHeader>(headers.length));
        }
        for (MessageHeader ele : headers) {
            this.headers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-campaigns-campaign-id.html#apps-application-id-campaigns-campaign-id-model-messageheader"
     * >MessageHeaders</a> for the email. You can have up to 15 MessageHeaders for each email.
     * </p>
     * 
     * @param headers
     *        The list of <a href=
     *        "https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-campaigns-campaign-id.html#apps-application-id-campaigns-campaign-id-model-messageheader"
     *        >MessageHeaders</a> for the email. You can have up to 15 MessageHeaders for each email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEmailMessage withHeaders(java.util.Collection<MessageHeader> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * The body of the email, in HTML format, for recipients whose email clients render HTML content.
     * </p>
     * 
     * @param htmlBody
     *        The body of the email, in HTML format, for recipients whose email clients render HTML content.
     */

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    /**
     * <p>
     * The body of the email, in HTML format, for recipients whose email clients render HTML content.
     * </p>
     * 
     * @return The body of the email, in HTML format, for recipients whose email clients render HTML content.
     */

    public String getHtmlBody() {
        return this.htmlBody;
    }

    /**
     * <p>
     * The body of the email, in HTML format, for recipients whose email clients render HTML content.
     * </p>
     * 
     * @param htmlBody
     *        The body of the email, in HTML format, for recipients whose email clients render HTML content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEmailMessage withHtmlBody(String htmlBody) {
        setHtmlBody(htmlBody);
        return this;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     * 
     * @param title
     *        The subject line, or title, of the email.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     * 
     * @return The subject line, or title, of the email.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     * 
     * @param title
     *        The subject line, or title, of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEmailMessage withTitle(String title) {
        setTitle(title);
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getFromAddress() != null)
            sb.append("FromAddress: ").append(getFromAddress()).append(",");
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders()).append(",");
        if (getHtmlBody() != null)
            sb.append("HtmlBody: ").append(getHtmlBody()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignEmailMessage == false)
            return false;
        CampaignEmailMessage other = (CampaignEmailMessage) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getHtmlBody() == null ^ this.getHtmlBody() == null)
            return false;
        if (other.getHtmlBody() != null && other.getHtmlBody().equals(this.getHtmlBody()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getHtmlBody() == null) ? 0 : getHtmlBody().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public CampaignEmailMessage clone() {
        try {
            return (CampaignEmailMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CampaignEmailMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
