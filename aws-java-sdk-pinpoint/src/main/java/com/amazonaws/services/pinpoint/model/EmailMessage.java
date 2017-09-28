/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Email Message.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EmailMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailMessage implements Serializable, Cloneable, StructuredPojo {

    /** The message body of the notification, the email body or the text message. */
    private String body;
    /** The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel. */
    private String fromAddress;
    /** The HTML part of the email. */
    private String htmlBody;
    /** Default message substitutions. Can be overridden by individual address substitutions. */
    private java.util.Map<String, java.util.List<String>> substitutions;
    /** The ARN of the template to use for the email. */
    private String templateArn;
    /** The subject of the email. */
    private String title;

    /**
     * The message body of the notification, the email body or the text message.
     * 
     * @param body
     *        The message body of the notification, the email body or the text message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The message body of the notification, the email body or the text message.
     * 
     * @return The message body of the notification, the email body or the text message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * The message body of the notification, the email body or the text message.
     * 
     * @param body
     *        The message body of the notification, the email body or the text message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withBody(String body) {
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

    public EmailMessage withFromAddress(String fromAddress) {
        setFromAddress(fromAddress);
        return this;
    }

    /**
     * The HTML part of the email.
     * 
     * @param htmlBody
     *        The HTML part of the email.
     */

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    /**
     * The HTML part of the email.
     * 
     * @return The HTML part of the email.
     */

    public String getHtmlBody() {
        return this.htmlBody;
    }

    /**
     * The HTML part of the email.
     * 
     * @param htmlBody
     *        The HTML part of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withHtmlBody(String htmlBody) {
        setHtmlBody(htmlBody);
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @return Default message substitutions. Can be overridden by individual address substitutions.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    public EmailMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * The ARN of the template to use for the email.
     * 
     * @param templateArn
     *        The ARN of the template to use for the email.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * The ARN of the template to use for the email.
     * 
     * @return The ARN of the template to use for the email.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * The ARN of the template to use for the email.
     * 
     * @param templateArn
     *        The ARN of the template to use for the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * The subject of the email.
     * 
     * @param title
     *        The subject of the email.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The subject of the email.
     * 
     * @return The subject of the email.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * The subject of the email.
     * 
     * @param title
     *        The subject of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessage withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
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

        if (obj instanceof EmailMessage == false)
            return false;
        EmailMessage other = (EmailMessage) obj;
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
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
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
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public EmailMessage clone() {
        try {
            return (EmailMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EmailMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
