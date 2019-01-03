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
 * An array that contains one or more Destinations, as well as the tags and replacement data associated with each of
 * those Destinations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/BulkEmailDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkEmailDestination implements Serializable, Cloneable {

    private Destination destination;
    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendBulkTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MessageTag> replacementTags;
    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     */
    private String replacementTemplateData;

    /**
     * @param destination
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * @return
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * @param destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailDestination withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendBulkTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     * 
     * @return A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *         <code>SendBulkTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so
     *         that you can publish email sending events.
     */

    public java.util.List<MessageTag> getReplacementTags() {
        if (replacementTags == null) {
            replacementTags = new com.amazonaws.internal.SdkInternalList<MessageTag>();
        }
        return replacementTags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendBulkTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     * 
     * @param replacementTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *        <code>SendBulkTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so
     *        that you can publish email sending events.
     */

    public void setReplacementTags(java.util.Collection<MessageTag> replacementTags) {
        if (replacementTags == null) {
            this.replacementTags = null;
            return;
        }

        this.replacementTags = new com.amazonaws.internal.SdkInternalList<MessageTag>(replacementTags);
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendBulkTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplacementTags(java.util.Collection)} or {@link #withReplacementTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replacementTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *        <code>SendBulkTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so
     *        that you can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailDestination withReplacementTags(MessageTag... replacementTags) {
        if (this.replacementTags == null) {
            setReplacementTags(new com.amazonaws.internal.SdkInternalList<MessageTag>(replacementTags.length));
        }
        for (MessageTag ele : replacementTags) {
            this.replacementTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendBulkTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     * 
     * @param replacementTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *        <code>SendBulkTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so
     *        that you can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailDestination withReplacementTags(java.util.Collection<MessageTag> replacementTags) {
        setReplacementTags(replacementTags);
        return this;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @param replacementTemplateData
     *        A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *        consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     */

    public void setReplacementTemplateData(String replacementTemplateData) {
        this.replacementTemplateData = replacementTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @return A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *         consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     */

    public String getReplacementTemplateData() {
        return this.replacementTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @param replacementTemplateData
     *        A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *        consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailDestination withReplacementTemplateData(String replacementTemplateData) {
        setReplacementTemplateData(replacementTemplateData);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getReplacementTags() != null)
            sb.append("ReplacementTags: ").append(getReplacementTags()).append(",");
        if (getReplacementTemplateData() != null)
            sb.append("ReplacementTemplateData: ").append(getReplacementTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BulkEmailDestination == false)
            return false;
        BulkEmailDestination other = (BulkEmailDestination) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getReplacementTags() == null ^ this.getReplacementTags() == null)
            return false;
        if (other.getReplacementTags() != null && other.getReplacementTags().equals(this.getReplacementTags()) == false)
            return false;
        if (other.getReplacementTemplateData() == null ^ this.getReplacementTemplateData() == null)
            return false;
        if (other.getReplacementTemplateData() != null && other.getReplacementTemplateData().equals(this.getReplacementTemplateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getReplacementTags() == null) ? 0 : getReplacementTags().hashCode());
        hashCode = prime * hashCode + ((getReplacementTemplateData() == null) ? 0 : getReplacementTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public BulkEmailDestination clone() {
        try {
            return (BulkEmailDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
