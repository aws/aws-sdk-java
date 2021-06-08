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
 * An interest group, theme, or label within a list. Lists can have multiple topics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/Topic" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Topic implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the topic.
     * </p>
     */
    private String topicName;
    /**
     * <p>
     * The name of the topic the contact will see.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * A description of what the topic is about, which the contact will see.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The default subscription status to be applied to a contact if the contact has not noted their preference for
     * subscribing to a topic.
     * </p>
     */
    private String defaultSubscriptionStatus;

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @param topicName
     *        The name of the topic.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @return The name of the topic.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @param topicName
     *        The name of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Topic withTopicName(String topicName) {
        setTopicName(topicName);
        return this;
    }

    /**
     * <p>
     * The name of the topic the contact will see.
     * </p>
     * 
     * @param displayName
     *        The name of the topic the contact will see.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the topic the contact will see.
     * </p>
     * 
     * @return The name of the topic the contact will see.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the topic the contact will see.
     * </p>
     * 
     * @param displayName
     *        The name of the topic the contact will see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Topic withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * A description of what the topic is about, which the contact will see.
     * </p>
     * 
     * @param description
     *        A description of what the topic is about, which the contact will see.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of what the topic is about, which the contact will see.
     * </p>
     * 
     * @return A description of what the topic is about, which the contact will see.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of what the topic is about, which the contact will see.
     * </p>
     * 
     * @param description
     *        A description of what the topic is about, which the contact will see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Topic withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The default subscription status to be applied to a contact if the contact has not noted their preference for
     * subscribing to a topic.
     * </p>
     * 
     * @param defaultSubscriptionStatus
     *        The default subscription status to be applied to a contact if the contact has not noted their preference
     *        for subscribing to a topic.
     * @see SubscriptionStatus
     */

    public void setDefaultSubscriptionStatus(String defaultSubscriptionStatus) {
        this.defaultSubscriptionStatus = defaultSubscriptionStatus;
    }

    /**
     * <p>
     * The default subscription status to be applied to a contact if the contact has not noted their preference for
     * subscribing to a topic.
     * </p>
     * 
     * @return The default subscription status to be applied to a contact if the contact has not noted their preference
     *         for subscribing to a topic.
     * @see SubscriptionStatus
     */

    public String getDefaultSubscriptionStatus() {
        return this.defaultSubscriptionStatus;
    }

    /**
     * <p>
     * The default subscription status to be applied to a contact if the contact has not noted their preference for
     * subscribing to a topic.
     * </p>
     * 
     * @param defaultSubscriptionStatus
     *        The default subscription status to be applied to a contact if the contact has not noted their preference
     *        for subscribing to a topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public Topic withDefaultSubscriptionStatus(String defaultSubscriptionStatus) {
        setDefaultSubscriptionStatus(defaultSubscriptionStatus);
        return this;
    }

    /**
     * <p>
     * The default subscription status to be applied to a contact if the contact has not noted their preference for
     * subscribing to a topic.
     * </p>
     * 
     * @param defaultSubscriptionStatus
     *        The default subscription status to be applied to a contact if the contact has not noted their preference
     *        for subscribing to a topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public Topic withDefaultSubscriptionStatus(SubscriptionStatus defaultSubscriptionStatus) {
        this.defaultSubscriptionStatus = defaultSubscriptionStatus.toString();
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
        if (getTopicName() != null)
            sb.append("TopicName: ").append(getTopicName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultSubscriptionStatus() != null)
            sb.append("DefaultSubscriptionStatus: ").append(getDefaultSubscriptionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Topic == false)
            return false;
        Topic other = (Topic) obj;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultSubscriptionStatus() == null ^ this.getDefaultSubscriptionStatus() == null)
            return false;
        if (other.getDefaultSubscriptionStatus() != null && other.getDefaultSubscriptionStatus().equals(this.getDefaultSubscriptionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultSubscriptionStatus() == null) ? 0 : getDefaultSubscriptionStatus().hashCode());
        return hashCode;
    }

    @Override
    public Topic clone() {
        try {
            return (Topic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.TopicMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
