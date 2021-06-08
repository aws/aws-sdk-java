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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the contact list to which the contact belongs.
     * </p>
     */
    private String contactListName;
    /**
     * <p>
     * The contact's email addres.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The contact's preference for being opted-in to or opted-out of a topic.&gt;
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
     * The attribute data attached to a contact.
     * </p>
     */
    private String attributesData;
    /**
     * <p>
     * A timestamp noting when the contact was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * A timestamp noting the last time the contact's information was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The name of the contact list to which the contact belongs.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list to which the contact belongs.
     */

    public void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }

    /**
     * <p>
     * The name of the contact list to which the contact belongs.
     * </p>
     * 
     * @return The name of the contact list to which the contact belongs.
     */

    public String getContactListName() {
        return this.contactListName;
    }

    /**
     * <p>
     * The name of the contact list to which the contact belongs.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list to which the contact belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withContactListName(String contactListName) {
        setContactListName(contactListName);
        return this;
    }

    /**
     * <p>
     * The contact's email addres.
     * </p>
     * 
     * @param emailAddress
     *        The contact's email addres.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The contact's email addres.
     * </p>
     * 
     * @return The contact's email addres.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The contact's email addres.
     * </p>
     * 
     * @param emailAddress
     *        The contact's email addres.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The contact's preference for being opted-in to or opted-out of a topic.&gt;
     * </p>
     * 
     * @return The contact's preference for being opted-in to or opted-out of a topic.&gt;
     */

    public java.util.List<TopicPreference> getTopicPreferences() {
        return topicPreferences;
    }

    /**
     * <p>
     * The contact's preference for being opted-in to or opted-out of a topic.&gt;
     * </p>
     * 
     * @param topicPreferences
     *        The contact's preference for being opted-in to or opted-out of a topic.&gt;
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
     * The contact's preference for being opted-in to or opted-out of a topic.&gt;
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicPreferences(java.util.Collection)} or {@link #withTopicPreferences(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param topicPreferences
     *        The contact's preference for being opted-in to or opted-out of a topic.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withTopicPreferences(TopicPreference... topicPreferences) {
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
     * The contact's preference for being opted-in to or opted-out of a topic.&gt;
     * </p>
     * 
     * @param topicPreferences
     *        The contact's preference for being opted-in to or opted-out of a topic.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withTopicPreferences(java.util.Collection<TopicPreference> topicPreferences) {
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

    public GetContactResult withTopicDefaultPreferences(TopicPreference... topicDefaultPreferences) {
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

    public GetContactResult withTopicDefaultPreferences(java.util.Collection<TopicPreference> topicDefaultPreferences) {
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

    public GetContactResult withUnsubscribeAll(Boolean unsubscribeAll) {
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
     * The attribute data attached to a contact.
     * </p>
     * 
     * @param attributesData
     *        The attribute data attached to a contact.
     */

    public void setAttributesData(String attributesData) {
        this.attributesData = attributesData;
    }

    /**
     * <p>
     * The attribute data attached to a contact.
     * </p>
     * 
     * @return The attribute data attached to a contact.
     */

    public String getAttributesData() {
        return this.attributesData;
    }

    /**
     * <p>
     * The attribute data attached to a contact.
     * </p>
     * 
     * @param attributesData
     *        The attribute data attached to a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withAttributesData(String attributesData) {
        setAttributesData(attributesData);
        return this;
    }

    /**
     * <p>
     * A timestamp noting when the contact was created.
     * </p>
     * 
     * @param createdTimestamp
     *        A timestamp noting when the contact was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * A timestamp noting when the contact was created.
     * </p>
     * 
     * @return A timestamp noting when the contact was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * A timestamp noting when the contact was created.
     * </p>
     * 
     * @param createdTimestamp
     *        A timestamp noting when the contact was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
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

    public GetContactResult withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
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
        if (getContactListName() != null)
            sb.append("ContactListName: ").append(getContactListName()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getTopicPreferences() != null)
            sb.append("TopicPreferences: ").append(getTopicPreferences()).append(",");
        if (getTopicDefaultPreferences() != null)
            sb.append("TopicDefaultPreferences: ").append(getTopicDefaultPreferences()).append(",");
        if (getUnsubscribeAll() != null)
            sb.append("UnsubscribeAll: ").append(getUnsubscribeAll()).append(",");
        if (getAttributesData() != null)
            sb.append("AttributesData: ").append(getAttributesData()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
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

        if (obj instanceof GetContactResult == false)
            return false;
        GetContactResult other = (GetContactResult) obj;
        if (other.getContactListName() == null ^ this.getContactListName() == null)
            return false;
        if (other.getContactListName() != null && other.getContactListName().equals(this.getContactListName()) == false)
            return false;
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
        if (other.getAttributesData() == null ^ this.getAttributesData() == null)
            return false;
        if (other.getAttributesData() != null && other.getAttributesData().equals(this.getAttributesData()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
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

        hashCode = prime * hashCode + ((getContactListName() == null) ? 0 : getContactListName().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getTopicPreferences() == null) ? 0 : getTopicPreferences().hashCode());
        hashCode = prime * hashCode + ((getTopicDefaultPreferences() == null) ? 0 : getTopicDefaultPreferences().hashCode());
        hashCode = prime * hashCode + ((getUnsubscribeAll() == null) ? 0 : getUnsubscribeAll().hashCode());
        hashCode = prime * hashCode + ((getAttributesData() == null) ? 0 : getAttributesData().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetContactResult clone() {
        try {
            return (GetContactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
