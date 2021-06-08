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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateContactList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the contact list.
     * </p>
     */
    private String contactListName;
    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     */
    private java.util.List<Topic> topics;
    /**
     * <p>
     * A description of what the contact list is about.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     */

    public void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @return The name of the contact list.
     */

    public String getContactListName() {
        return this.contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactListRequest withContactListName(String contactListName) {
        setContactListName(contactListName);
        return this;
    }

    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     * 
     * @return An interest group, theme, or label within a list. A contact list can have multiple topics.
     */

    public java.util.List<Topic> getTopics() {
        return topics;
    }

    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     * 
     * @param topics
     *        An interest group, theme, or label within a list. A contact list can have multiple topics.
     */

    public void setTopics(java.util.Collection<Topic> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }

        this.topics = new java.util.ArrayList<Topic>(topics);
    }

    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopics(java.util.Collection)} or {@link #withTopics(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param topics
     *        An interest group, theme, or label within a list. A contact list can have multiple topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactListRequest withTopics(Topic... topics) {
        if (this.topics == null) {
            setTopics(new java.util.ArrayList<Topic>(topics.length));
        }
        for (Topic ele : topics) {
            this.topics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     * 
     * @param topics
     *        An interest group, theme, or label within a list. A contact list can have multiple topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactListRequest withTopics(java.util.Collection<Topic> topics) {
        setTopics(topics);
        return this;
    }

    /**
     * <p>
     * A description of what the contact list is about.
     * </p>
     * 
     * @param description
     *        A description of what the contact list is about.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of what the contact list is about.
     * </p>
     * 
     * @return A description of what the contact list is about.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of what the contact list is about.
     * </p>
     * 
     * @param description
     *        A description of what the contact list is about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactListRequest withDescription(String description) {
        setDescription(description);
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
        if (getTopics() != null)
            sb.append("Topics: ").append(getTopics()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactListRequest == false)
            return false;
        UpdateContactListRequest other = (UpdateContactListRequest) obj;
        if (other.getContactListName() == null ^ this.getContactListName() == null)
            return false;
        if (other.getContactListName() != null && other.getContactListName().equals(this.getContactListName()) == false)
            return false;
        if (other.getTopics() == null ^ this.getTopics() == null)
            return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactListName() == null) ? 0 : getContactListName().hashCode());
        hashCode = prime * hashCode + ((getTopics() == null) ? 0 : getTopics().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactListRequest clone() {
        return (UpdateContactListRequest) super.clone();
    }

}
