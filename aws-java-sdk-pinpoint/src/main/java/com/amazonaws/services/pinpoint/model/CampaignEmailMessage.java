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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The email message configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignEmailMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignEmailMessage implements Serializable, Cloneable, StructuredPojo {

    /** The email text body. */
    private String body;
    /** The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel. */
    private String fromAddress;
    /** The email html body. */
    private String htmlBody;
    /** The email title (Or subject). */
    private String title;

    /**
     * The email text body.
     * 
     * @param body
     *        The email text body.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The email text body.
     * 
     * @return The email text body.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * The email text body.
     * 
     * @param body
     *        The email text body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEmailMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
     * 
     * @param fromAddress
     *        The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
     */

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
     * 
     * @return The email address used to send the email from. Defaults to use FromAddress specified in the Email
     *         Channel.
     */

    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
     * 
     * @param fromAddress
     *        The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEmailMessage withFromAddress(String fromAddress) {
        setFromAddress(fromAddress);
        return this;
    }

    /**
     * The email html body.
     * 
     * @param htmlBody
     *        The email html body.
     */

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    /**
     * The email html body.
     * 
     * @return The email html body.
     */

    public String getHtmlBody() {
        return this.htmlBody;
    }

    /**
     * The email html body.
     * 
     * @param htmlBody
     *        The email html body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEmailMessage withHtmlBody(String htmlBody) {
        setHtmlBody(htmlBody);
        return this;
    }

    /**
     * The email title (Or subject).
     * 
     * @param title
     *        The email title (Or subject).
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The email title (Or subject).
     * 
     * @return The email title (Or subject).
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * The email title (Or subject).
     * 
     * @param title
     *        The email title (Or subject).
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
