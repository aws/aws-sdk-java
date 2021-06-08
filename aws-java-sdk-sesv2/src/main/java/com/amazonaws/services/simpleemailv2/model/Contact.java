/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A contact is the end-user who is receiving the email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/Contact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Contact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The contact's email address.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The contact's preference for being opted-in to or opted-out of a topic.
     * </p>
     */
    private java.util.List<TopicPreference> topicPreferences;
    /**
     * <p>
     * The default topic preferences applied to the contact.
     * </p>
     */
    private java.util.List<TopicPreference> topicDefaultPreferences;
    /**
     * <p>
     * A boolean value status noting if the contact is unsubscribed from all contact list topics.
     * </p>
     */
    private Boolean unsubscribeAll;
    /**
     * <p>
     * A timestamp noting the last time the contact's information was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The contact's email address.
     * </p>
     * 
     * @param emailAddress
     *        The contact's email address.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The contact's email address.
     * </p>
     * 
     * @return The contact's email address.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The contact's email address.
     * </p>
     * 
     * @param emailAddress
     *        The contact's email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The contact's preference for being opted-in to or opted-out of a topic.
     * </p>
     * 
     * @return The contact's preference for being opted-in to or opted-out of a topic.
     */

    public java.util.List<TopicPreference> getTopicPreferences() {
        return topicPreferences;
    }

    /**
     * <p>
     * The contact's preference for being opted-in to or opted-out of a topic.
     * </p>
     * 
     * @param topicPreferences
     *        The contact's preference for being opted-in to or opted-out of a topic.
     */

    public void setTopicPreferences(java.util.Collection<TopicPreference> topicPreferences) {
        if (topicPreferences == null) {
            this.topicPreferences = null;
            return;
        }

        this.topicPreferences = new java.util.ArrayList<TopicPreference>(topicPreferences);
    }

    /**
     * <p>
     * The contact's preference for being opted-in to or opted-out of a topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicPreferences(java.util.Collection)} or {@link #withTopicPreferences(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param topicPreferences
     *        The contact's preference for being opted-in to or opted-out of a topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withTopicPreferences(TopicPreference... topicPreferences) {
        if (this.topicPreferences == null) {
            setTopicPreferences(new java.util.ArrayList<TopicPreference>(topicPreferences.length));
        }
        for (TopicPreference ele : topicPreferences) {
            this.topicPreferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contact's preference for being opted-in to or opted-out of a topic.
     * </p>
     * 
     * @param topicPreferences
     *        The contact's preference for being opted-in to or opted-out of a topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withTopicPreferences(java.util.Collection<TopicPreference> topicPreferences) {
        setTopicPreferences(topicPreferences);
        return this;
    }

    /**
     * <p>
     * The default topic preferences applied to the contact.
     * </p>
     * 
     * @return The default topic preferences applied to the contact.
     */

    public java.util.List<TopicPreference> getTopicDefaultPreferences() {
        return topicDefaultPreferences;
    }

    /**
     * <p>
     * The default topic preferences applied to the contact.
     * </p>
     * 
     * @param topicDefaultPreferences
     *        The default topic preferences applied to the contact.
     */

    public void setTopicDefaultPreferences(java.util.Collection<TopicPreference> topicDefaultPreferences) {
        if (topicDefaultPreferences == null) {
            this.topicDefaultPreferences = null;
            return;
        }

        this.topicDefaultPreferences = new java.util.ArrayList<TopicPreference>(topicDefaultPreferences);
    }

    /**
     * <p>
     * The default topic preferences applied to the contact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicDefaultPreferences(java.util.Collection)} or
     * {@link #withTopicDefaultPreferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param topicDefaultPreferences
     *        The default topic preferences applied to the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withTopicDefaultPreferences(TopicPreference... topicDefaultPreferences) {
        if (this.topicDefaultPreferences == null) {
            setTopicDefaultPreferences(new java.util.ArrayList<TopicPreference>(topicDefaultPreferences.length));
        }
        for (TopicPreference ele : topicDefaultPreferences) {
            this.topicDefaultPreferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The default topic preferences applied to the contact.
     * </p>
     * 
     * @param topicDefaultPreferences
     *        The default topic preferences applied to the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withTopicDefaultPreferences(java.util.Collection<TopicPreference> topicDefaultPreferences) {
        setTopicDefaultPreferences(topicDefaultPreferences);
        return this;
    }

    /**
     * <p>
     * A boolean value status noting if the contact is unsubscribed from all contact list topics.
     * </p>
     * 
     * @param unsubscribeAll
     *        A boolean value status noting if the contact is unsubscribed from all contact list topics.
     */

    public void setUnsubscribeAll(Boolean unsubscribeAll) {
        this.unsubscribeAll = unsubscribeAll;
    }

    /**
     * <p>
     * A boolean value status noting if the contact is unsubscribed from all contact list topics.
     * </p>
     * 
     * @return A boolean value status noting if the contact is unsubscribed from all contact list topics.
     */

    public Boolean getUnsubscribeAll() {
        return this.unsubscribeAll;
    }

    /**
     * <p>
     * A boolean value status noting if the contact is unsubscribed from all contact list topics.
     * </p>
     * 
     * @param unsubscribeAll
     *        A boolean value status noting if the contact is unsubscribed from all contact list topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withUnsubscribeAll(Boolean unsubscribeAll) {
        setUnsubscribeAll(unsubscribeAll);
        return this;
    }

    /**
     * <p>
     * A boolean value status noting if the contact is unsubscribed from all contact list topics.
     * </p>
     * 
     * @return A boolean value status noting if the contact is unsubscribed from all contact list topics.
     */

    public Boolean isUnsubscribeAll() {
        return this.unsubscribeAll;
    }

    /**
     * <p>
     * A timestamp noting the last time the contact's information was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        A timestamp noting the last time the contact's information was updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * A timestamp noting the last time the contact's information was updated.
     * </p>
     * 
     * @return A timestamp noting the last time the contact's information was updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * A timestamp noting the last time the contact's information was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        A timestamp noting the last time the contact's information was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getTopicPreferences() != null)
            sb.append("TopicPreferences: ").append(getTopicPreferences()).append(",");
        if (getTopicDefaultPreferences() != null)
            sb.append("TopicDefaultPreferences: ").append(getTopicDefaultPreferences()).append(",");
        if (getUnsubscribeAll() != null)
            sb.append("UnsubscribeAll: ").append(getUnsubscribeAll()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Contact == false)
            return false;
        Contact other = (Contact) obj;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getTopicPreferences() == null ^ this.getTopicPreferences() == null)
            return false;
        if (other.getTopicPreferences() != null && other.getTopicPreferences().equals(this.getTopicPreferences()) == false)
            return false;
        if (other.getTopicDefaultPreferences() == null ^ this.getTopicDefaultPreferences() == null)
            return false;
        if (other.getTopicDefaultPreferences() != null && other.getTopicDefaultPreferences().equals(this.getTopicDefaultPreferences()) == false)
            return false;
        if (other.getUnsubscribeAll() == null ^ this.getUnsubscribeAll() == null)
            return false;
        if (other.getUnsubscribeAll() != null && other.getUnsubscribeAll().equals(this.getUnsubscribeAll()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getTopicPreferences() == null) ? 0 : getTopicPreferences().hashCode());
        hashCode = prime * hashCode + ((getTopicDefaultPreferences() == null) ? 0 : getTopicDefaultPreferences().hashCode());
        hashCode = prime * hashCode + ((getUnsubscribeAll() == null) ? 0 : getUnsubscribeAll().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Contact clone() {
        try {
            return (Contact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ContactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
